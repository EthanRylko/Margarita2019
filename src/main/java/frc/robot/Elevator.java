package frc.robot;

public class Elevator{
    public static void elevator(double elevatorSpeed){
        double liftSpeed = Math.min(elevatorSpeed, Constants.MAX_MOTOR_SPEED);
        Actuators.getBallInFeedElevator().set(liftSpeed);
    }
}