package org.usfirst.frc.team2989.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;

/**
 * Created by Robotics7 on 11/30/2017.
 */
public class PushBallCommand extends Command {

    public PushBallCommand() {
        requires(Robot.pneumatics);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.pneumatics.pushBall(RobotMap.BALLSHOOTER_PUSH_LENGTH);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
    }

}
