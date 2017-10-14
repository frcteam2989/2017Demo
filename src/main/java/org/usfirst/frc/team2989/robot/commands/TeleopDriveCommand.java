package org.usfirst.frc.team2989.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.subsystems.DriveTrain;

public class TeleopDriveCommand extends Command {

    public TeleopDriveCommand() {
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        double leftValue = Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
        double rightValue = Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_RIGHT_Y);
        Robot.driveTrain.driveRobot(leftValue, rightValue);
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
