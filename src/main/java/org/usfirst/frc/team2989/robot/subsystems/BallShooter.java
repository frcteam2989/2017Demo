package org.usfirst.frc.team2989.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.ShootBallCommand;

/**
 * Created by Robotics7 on 11/18/2017.
 */
public class BallShooter extends Subsystem {

    TalonSRX ballMotor1 = new TalonSRX(RobotMap.MOTOR_BALLSHOOTER_1);
    TalonSRX ballMotor2 = new TalonSRX(RobotMap.MOTOR_BALLSHOOTER_2);

    public void initDefaultCommand() {
        setDefaultCommand(new ShootBallCommand());
    }

    public void shootBall() {
        ballMotor1.setSpeed(1);
        ballMotor2.setSpeed(1);
    }

    public void stopBall() {
        ballMotor1.setSpeed(0);
        ballMotor2.setSpeed(0);
    }
}
