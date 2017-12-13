package org.usfirst.frc.team2989.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2989.robot.commands.PushBallCommand;
import org.usfirst.frc.team2989.robot.commands.ShootBallCommand;

public class OI {

    /* OI
     * (( Operator interface class. ))
     *
     * What it does:
     *  - Creates operator interface, which is all of the components the driver station uses
     *  - Instantiates joysticks
     *  - Allows you to initiate commands with buttons (not useful for this robot currently)
     *
     */

    Joystick attackStick1;
    Joystick attackStick2;
    Button aButton;
    Button bButton;

    public OI() { // TODO: Add command listener for shooter mechanism
        super();
        attackStick1 = new Joystick(RobotMap.JOYSTICK_1_PORT);
        attackStick2 = new Joystick(RobotMap.JOYSTICK_2_PORT);
        aButton = new JoystickButton(attackStick1, RobotMap.JOYSTICK_1_ABUTTON);
        bButton = new JoystickButton(attackStick1, RobotMap.JOYSTICK_1_BBUTTON);
        aButton.whileHeld(new ShootBallCommand());
        bButton.whileHeld(new PushBallCommand());
    }

    public Joystick getAttackStick1() {
        return attackStick1;
    }
    public Joystick getAttackStick2() { return attackStick2; }
}
