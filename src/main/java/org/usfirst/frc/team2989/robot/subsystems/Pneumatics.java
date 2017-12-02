package org.usfirst.frc.team2989.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.PushBallCommand;

/**
 * Created by Robotics7 on 11/30/2017.
 */
public class Pneumatics extends Subsystem {

    Solenoid ballPusher = new Solenoid(RobotMap.BALLSHOOTER_SOLENOID);

    public void initDefaultCommand(){setDefaultCommand(new PushBallCommand());}

    public void pushBall(double pushSeconds) {
        ballPusher.set(true); // Turn on Ball Pusher
        Timer.delay(pushSeconds);
        ballPusher.set(false); // Turn off Ball Pusher
    }
}
