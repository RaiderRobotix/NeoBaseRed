package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

public class Constants {
    

    public static final double kMaxSpeedMetersPerSecond = 4.8;
    public static final double kMaxAngularSpeed = 2 * Math.PI;
    public static final double stickDeadband = 0.0;

    public static final double kTrackWidth = Units.inchesToMeters(19);
    public static final double kWheelBase = Units.inchesToMeters(20);

    public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
        new Translation2d(kWheelBase / 2, kTrackWidth / 2),
        new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
        new Translation2d(-kWheelBase / 2, kTrackWidth / 2),
        new Translation2d(-kWheelBase / 2, -kTrackWidth / 2));
    public static final class Mod0 {
        
        
        public static final int drivemotorID0 = 0;
        public static final int anglemotorID0 = 0;
        //public static final int camcoderID = "insert id"
        public static final double offset0 = 0;
    }

    public static final class Mod1 {

        public static final int drivemotorID1 = 0;
        public static final int anglemotorID1 = 0;
        //public static final int camcoderID = "insert id"
        public static final double offset1 = 0;
    }

    public static final class Mod2 {

        public static final int drivemotorID2 = 0;
        public static final int anglemotorID2 = 0;
        //public static final int camcoderID = "insert id"
        public static final double offset2 = 0;
    }

    public static final class Mod3 {

        public static final int drivemotorID3 = 0;
        public static final int anglemotorID3 = 0;
        //public static final int camcoderID = "insert id"
        public static final double offset3 = 0;
    }

}
