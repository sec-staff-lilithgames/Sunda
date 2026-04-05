package xr;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b5 implements wr.t3 {
    @Override // wr.t3
    public Long parseAsciiString(String str) throws NumberFormatException {
        mh.p1.checkArgument(str.length() > 0, "empty timeout");
        mh.p1.checkArgument(str.length() <= 9, "bad timeout format");
        long j10 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j10));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j10);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // wr.t3
    public String toAsciiString(Long l9) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l9.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l9.longValue() < 100000000) {
            return l9 + "n";
        }
        if (l9.longValue() < 100000000000L) {
            return timeUnit.toMicros(l9.longValue()) + ApsMetricsDataMap.APSMETRICS_FIELD_URL;
        }
        if (l9.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l9.longValue()) + "m";
        }
        if (l9.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l9.longValue()) + "S";
        }
        if (l9.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l9.longValue()) + "M";
        }
        return timeUnit.toHours(l9.longValue()) + "H";
    }
}
