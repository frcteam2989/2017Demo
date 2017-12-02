package org.usfirst.frc.team2989.robot;

public class RobotMap {

    /* ROBOT MAP
     * (( Used for storing constant values like ports and the like ))
     *
     * What it does:
     *  - Used to store ports for things like motors, joysticks, and other ports
     *
     * What needs to be done:
     *  - Keep it clean and avoid clutter.
     */

    // JOYSTICK
    // TODO: Find joystick port and axes (did my best from google to use xbox axis, check with driver station)

    // Port
    public static int JOYSTICK_PORT = 1;
    // Left stick
    public static int JOYSTICK_LEFT_X = 0;
    public static int JOYSTICK_LEFT_Y = 1;
    // Right stick
    public static int JOYSTICK_RIGHT_X = 4;
    public static int JOYSTICK_RIGHT_Y = 5;
    // Buttons
    public static int JOYSTICK_ABUTTON = 1;
    public static int JOYSTICK_BBUTTON = 2;

    // Triggers
    public static int JOYSTICK_TRIGGER_LEFT = 2;
    public static int JOYSTICK_TRIGGER_RIGHT = 3;

    // MOTORS
    // TODO: Update ports for PWM
<<<<<<< HEAD
    public static int MOTOR_FRONT_LEFT = 0;
    public static int MOTOR_FRONT_RIGHT = 1;
    public static int MOTOR_REAR_LEFT = 2;
    public static int MOTOR_REAR_RIGHT = 3;
    public static int MOTOR_BALLSHOOTER_1 = 4;
    public static int MOTOR_BALLSHOOTER_2 = 5;
=======
    public static int MOTOR_FRONT_LEFT = 0; // Blue and red
    public static int MOTOR_FRONT_RIGHT = 1; // Red and yellow
    public static int MOTOR_REAR_LEFT = 2; // Black and Blue
    public static int MOTOR_REAR_RIGHT = 3; //  Black and yellow
>>>>>>> origin/master

    // PNEUMATICS
    public static int BALLSHOOTER_SOLENOID = 6;
    public static int BALLSHOOTER_PUSH_LENGTH = 1;
    // TODO: Camera
}
