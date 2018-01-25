package org.usfirst.frc.team2989.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.TeleopDriveCommand;

public class DriveTrain extends Subsystem {

    /* DRIVETRAIN
     * (( Basic drivetrain subsystem ))
     *
     * What it does:x
     *  - Used for controlling RobotDrive
     *  - Used by teleop drive and autonomous commands
     */
    private static RobotDrive driveTrain = new RobotDrive(RobotMap.MOTOR_FRONT_LEFT, RobotMap.MOTOR_REAR_LEFT, RobotMap.MOTOR_FRONT_RIGHT, RobotMap.MOTOR_REAR_RIGHT); // Motor format is LF, LR, RF, RR

    public void initDefaultCommand() {
        setDefaultCommand(new TeleopDriveCommand());
        driveTrain.setExpiration(0.1);
    }

    public void driveRobotTank(double leftValue, double rightValue) { // TODO: Switch from tank because eww
        driveTrain.tankDrive(leftValue, rightValue);
    }

    public void driveRobotArcade(double moveValue, double rotationValue) {
        driveTrain.arcadeDrive(moveValue, rotationValue);
    }

    public void driveRobotMecanum(double x, double y, double rotation) {
        driveTrain.mecanumDrive_Cartesian(x, y, rotation, 0);
    }
}
