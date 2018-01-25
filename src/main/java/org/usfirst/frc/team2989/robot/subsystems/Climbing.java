package org.usfirst.frc.team2989.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2989.robot.RobotMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Climbing extends Subsystem {

    List<TalonSRX> climbTalons;

    public Climbing() {
        climbTalons = Stream.of(new TalonSRX(RobotMap.MOTOR_CLIMB_1), new TalonSRX(RobotMap.MOTOR_CLIMB_2)).collect(Collectors.toList());
    }

    public void initDefaultCommand() {

    }

    public void startClimb() {
        climbTalons.forEach(talon -> talon.setSpeed(1));
    }

    public void stopClimb() {
        climbTalons.forEach(talon -> talon.setSpeed(0));
    }
}
