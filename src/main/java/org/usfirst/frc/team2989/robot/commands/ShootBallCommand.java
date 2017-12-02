package org.usfirst.frc.team2989.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;

/**
 * Created by Robotics7 on 11/18/2017.
 */
public class ShootBallCommand extends Command {

    public ShootBallCommand() {
        requires(Robot.shooter);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.shooter.shootBall();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.shooter.stopBall();
    }

    @Override
    protected void interrupted() {
        Robot.shooter.stopBall();
    }
}
