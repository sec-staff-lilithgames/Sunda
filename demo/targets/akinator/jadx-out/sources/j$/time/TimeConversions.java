package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public class TimeConversions {
    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return java.time.Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.getSeconds(), duration.getNano());
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        long seconds = duration.getSeconds();
        long nano = duration.getNano();
        Duration duration2 = Duration.ZERO;
        return Duration.r(Math.addExact(seconds, Math.floorDiv(nano, C.NANOS_PER_SECOND)), (int) Math.floorMod(nano, C.NANOS_PER_SECOND));
    }
}
