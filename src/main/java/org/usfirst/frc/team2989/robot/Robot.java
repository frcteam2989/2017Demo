package org.usfirst.frc.team2989.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team2989.robot.subsystems.BallShooter;
import org.usfirst.frc.team2989.robot.subsystems.Climbing;
import org.usfirst.frc.team2989.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2989.robot.subsystems.Pneumatics;

public class Robot extends IterativeRobot {

    public static DriveTrain driveTrain;
    public static BallShooter shooter;
    public static Pneumatics pneumatics;
    public static Climbing climbing;
    public static OI oi;
    private Command autonomousCommand;

    /* ROBOT INTIALIZATION
     * (( Called when the robot first initialises ))
     *
     * What it does:
     *  - Instantiates drivetrain
     *  - Instantiates operator interface
     *
     * What needs to be added:
     *  - SmartDashboard
     */

    // Called when robot first starts
    @Override
    public void robotInit() { // TODO: Implement SmartDashboard
        shooter = new BallShooter();
        driveTrain = new DriveTrain();
        pneumatics = new Pneumatics();
        climbing = new Climbing();
        oi = new OI();
    }

    // Called when robot enters disabled mode
    @Override
    public void disabledInit() { // TODO: Reset any subsystem information when the robot is disabled (none atm)

    }

    // Run periodically when the robot is disabled
    @Override
    public void disabledPeriodic() { // TODO: (SmartDashboard) -> Implement auto updating
        Scheduler.getInstance().run();
    }

    // Called when the robot enters autonomous mode
    @Override
    public void autonomousInit() { // TODO: Implement autonomous driving
    }

    // Called periodically when the robot is in autonomous mode
    @Override
    public void autonomousPeriodic() { // TODO: (SmartDashboard) -> Implement auto updating
        Scheduler.getInstance().run();
    }

    // Called when the robot enters teleop mode
    @Override
    public void teleopInit() {
        if(autonomousCommand != null) {
            autonomousCommand.cancel();
        }
    }

    // Called periodically when the robot is in autonomous mode
    @Override
    public void teleopPeriodic() { // TODO: (SmartDashboard) -> Implement auto updating
        Scheduler.getInstance().run();
    }

    // Called periodically during test mode, currently useless? I'm not sure.
    @Override
    public void testPeriodic() {
        LiveWindow.run();
    }
}
