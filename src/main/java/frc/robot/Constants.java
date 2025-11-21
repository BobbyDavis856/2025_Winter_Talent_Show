package frc.robot;

public class Constants {

    public static final class DriveConstants {
        public static final int LEFT_MOTOR_1_ID = 10;
        public static final int LEFT_MOTOR_2_ID = 11;
        public static final boolean LEFT_MOTORS_REVERSED = false;

        public static final int RIGHT_MOTOR_1_ID = 20;
        public static final int RIGHT_MOTOR_2_ID = 21;
        public static final boolean RIGHT_MOTORS_REVERSED = true;

        public static final double WHEEL_BASE_WIDTH = 1.0;

        public static final int GYRO_ID = 1;
    }

    public static final class ControlConstants {
        public static double FORWARD_SPEED = 0.25;
        public static double RIGHT_SPEED = 0.25;
    }

    public static final class ShooterConstants {
        public static final double kP = 0.0;
        public static final double kI = 0.0;
        public static final double kD = 0.0;
        public static final double shooterMotorEncoderOffset =0;
        public static final double speed=0;
        public static int SHOOTER_MOTOR = 1;
    }
}
