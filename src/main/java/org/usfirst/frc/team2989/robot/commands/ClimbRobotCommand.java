package org.usfirst.frc.team2989.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2989.robot.Robot;

/**
 * Created by Robotics7 on 11/18/2017.
 */
public class ClimbRobotCommand extends Command {

    public ClimbRobotCommand() {
        requires(Robot.climbing);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.climbing.startClimb();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.climbing.stopClimb();
    }

    @Override
    protected void interrupted() {
        Robot.climbing.stopClimb();
    }
}
