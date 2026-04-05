package j$.time.temporal;

import com.inmobi.commons.core.configs.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.Duration;

/* loaded from: classes3.dex */
public enum ChronoUnit implements r {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(1000000)),
    SECONDS("Seconds", Duration.r(1, 0)),
    MINUTES("Minutes", Duration.r(60, 0)),
    HOURS("Hours", Duration.r(3600, 0)),
    HALF_DAYS("HalfDays", Duration.r(43200, 0)),
    DAYS("Days", Duration.r(86400, 0)),
    WEEKS("Weeks", Duration.r(TelemetryConfig.DEFAULT_EVENT_TTL_SEC, 0)),
    MONTHS("Months", Duration.r(2629746, 0)),
    YEARS("Years", Duration.r(31556952, 0)),
    DECADES("Decades", Duration.r(315569520, 0)),
    CENTURIES("Centuries", Duration.r(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.r(31556952000L, 0)),
    ERAS("Eras", Duration.r(31556952000000000L, 0)),
    FOREVER("Forever", Duration.r(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999, C.NANOS_PER_SECOND)), (int) Math.floorMod(999999999, C.NANOS_PER_SECOND)));


    /* renamed from: a, reason: collision with root package name */
    public final String f68635a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f68636b;

    ChronoUnit(String str, Duration duration) {
        this.f68635a = str;
        this.f68636b = duration;
    }

    public Duration getDuration() {
        return this.f68636b;
    }

    @Override // j$.time.temporal.r
    public final l r(l lVar, long j10) {
        return lVar.j(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f68635a;
    }
}
