package org.usfirst.frc.team2989.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.TeleopDriveCommand;

public class DriveTrain extends Subsystem {

    /* DRIVETRAIN
     * (( Basic drivetrain subsystem ))
     *
     * What it does:
     *  - Used for controlling RobotDrive
     *  - Used by teleop drive and autonomous commands
     */
    private static RobotDrive driveTrain = new RobotDrive(RobotMap.MOTOR_FRONT_LEFT, RobotMap.MOTOR_REAR_LEFT, RobotMap.MOTOR_FRONT_RIGHT, RobotMap.MOTOR_REAR_RIGHT); // Motor format is LF, LR, RF, RR
    // Speed controller stuff for direct motor access because why not
    private TalonSRX m_frontLeftMotor = new TalonSRX(RobotMap.MOTOR_FRONT_LEFT);
    private TalonSRX m_frontRightMotor = new TalonSRX(RobotMap.MOTOR_FRONT_RIGHT);
    private TalonSRX m_rearLeftMotor = new TalonSRX(RobotMap.MOTOR_REAR_LEFT);
    private TalonSRX m_rearRightMotor = new TalonSRX(RobotMap.MOTOR_REAR_RIGHT);
    private final double m_maxOutput = 1.0;


    public void initDefaultCommand() {
        setDefaultCommand(new TeleopDriveCommand());
        driveTrain.setExpiration(0.1);
    }

    public void driveRobot(double leftValue, double rightValue) { // TODO: Switch from tank because eww

        // square the inputs (while preserving the sign) to increase fine control
        // while permitting full power
        leftValue = limit(leftValue);
        rightValue = limit(rightValue);
            if (leftValue >= 0.0) {
                leftValue = leftValue * leftValue;
            } else {
                leftValue = -(leftValue * leftValue);
            }
            if (rightValue >= 0.0) {
                rightValue = rightValue * rightValue;
            } else {
                rightValue = -(rightValue * rightValue);
            }
        setLeftRightMotorOutputs(leftValue, rightValue);
    }

    public void setLeftRightMotorOutputs(double leftOutput, double rightOutput) {
        if (m_rearLeftMotor == null || m_rearRightMotor == null) {
            throw new NullPointerException("Null motor provided");
        }

        if (m_frontLeftMotor != null) {
            m_frontLeftMotor.set(limit(leftOutput) * m_maxOutput);
        }
        m_rearLeftMotor.set(limit(leftOutput) * m_maxOutput);

        if (m_frontRightMotor != null) {
            m_frontRightMotor.set(-limit(rightOutput) * m_maxOutput);
        }
        m_rearRightMotor.set(-limit(rightOutput) * m_maxOutput);
    }

    public double limit(double input) {
        if (input > 1.0) {
            return 1.0;
        }
        if (input < -1.0) {
            return -1.0;
        }
        return input;
    }
}
