package mh;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f74695a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f74696b;

    /* renamed from: c, reason: collision with root package name */
    public long f74697c;

    /* renamed from: d, reason: collision with root package name */
    public long f74698d;

    public t2() {
        this.f74695a = i3.systemTicker();
    }

    public static t2 createStarted() {
        return new t2().start();
    }

    public static t2 createUnstarted() {
        return new t2();
    }

    public final long a() {
        return this.f74696b ? (this.f74695a.read() - this.f74698d) + this.f74697c : this.f74697c;
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(a(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f74696b;
    }

    public t2 reset() {
        this.f74697c = 0L;
        this.f74696b = false;
        return this;
    }

    public t2 start() {
        p1.checkState(!this.f74696b, "This stopwatch is already running.");
        this.f74696b = true;
        this.f74698d = this.f74695a.read();
        return this;
    }

    public t2 stop() {
        long j10 = this.f74695a.read();
        p1.checkState(this.f74696b, "This stopwatch is already stopped.");
        this.f74696b = false;
        this.f74697c = (j10 - this.f74698d) + this.f74697c;
        return this;
    }

    public String toString() {
        String str;
        long jA = a();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jA, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jA, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jA, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jA, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jA, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jA, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jA / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb2.append(" ");
        switch (s2.f74691a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = ApsMetricsDataMap.APSMETRICS_FIELD_SDK;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME;
                break;
            case 7:
                str = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
                break;
            default:
                throw new AssertionError();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static t2 createStarted(i3 i3Var) {
        return new t2(i3Var).start();
    }

    public static t2 createUnstarted(i3 i3Var) {
        return new t2(i3Var);
    }

    public Duration elapsed() {
        return Duration.ofNanos(a());
    }

    public t2(i3 i3Var) {
        this.f74695a = (i3) p1.checkNotNull(i3Var, "ticker");
    }
}
