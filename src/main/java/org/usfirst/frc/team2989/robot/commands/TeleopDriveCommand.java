package org.usfirst.frc.team2989.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;

public class TeleopDriveCommand extends Command {

    public TeleopDriveCommand() {
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        double moveValue = Robot.oi.getAttackStick1().getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
        double rotateValue = Robot.oi.getAttackStick1().getRawAxis(RobotMap.JOYSTICK_RIGHT_X);

        Robot.driveTrain.driveRobotArcade(moveValue, rotateValue
         );
        if(RobotMap.MECANUM_WHEELS) {
            double x = Robot.oi.getAttackStick1().getRawAxis(RobotMap.JOYSTICK_LEFT_X);
            double y = Robot.oi.getAttackStick1().getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
            double rotation = Robot.oi.getAttackStick2().getRawAxis(RobotMap.JOYSTICK_RIGHT_X);
            Robot.driveTrain.driveRobotMecanum(x, y, rotation);
        } else {
            double leftValue = Robot.oi.getAttackStick1().getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
            double rightValue = Robot.oi.getAttackStick1().getRawAxis(RobotMap.JOYSTICK_RIGHT_Y);
            Robot.driveTrain.driveRobotTank(leftValue, rightValue);
        }
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
