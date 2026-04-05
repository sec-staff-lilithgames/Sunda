package tv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {
    public e(kotlin.jvm.internal.u uVar) {
    }

    /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7154getDaysUwyO8pc$annotations(double d10) {
    }

    /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7157getHoursUwyO8pc$annotations(double d10) {
    }

    /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7160getMicrosecondsUwyO8pc$annotations(double d10) {
    }

    /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7163getMillisecondsUwyO8pc$annotations(double d10) {
    }

    /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7166getMinutesUwyO8pc$annotations(double d10) {
    }

    /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7169getNanosecondsUwyO8pc$annotations(double d10) {
    }

    /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7172getSecondsUwyO8pc$annotations(double d10) {
    }

    public final double convert(double d10, i sourceUnit, i targetUnit) {
        e0.checkNotNullParameter(sourceUnit, "sourceUnit");
        e0.checkNotNullParameter(targetUnit, "targetUnit");
        return k.convertDurationUnit(d10, sourceUnit, targetUnit);
    }

    /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
    public final long m7175getINFINITEUwyO8pc() {
        return f.f87435f;
    }

    /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public final long m7176getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
        return f.f87436g;
    }

    /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
    public final long m7177getZEROUwyO8pc() {
        return f.f87434e;
    }

    /* renamed from: parse-UwyO8pc, reason: not valid java name */
    public final long m7178parseUwyO8pc(String value) {
        e0.checkNotNullParameter(value, "value");
        try {
            return h.access$parseDuration(value, false);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(a.b.l("Invalid duration string format: '", value, "'."), e10);
        }
    }

    /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
    public final long m7179parseIsoStringUwyO8pc(String value) {
        e0.checkNotNullParameter(value, "value");
        try {
            return h.access$parseDuration(value, true);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(a.b.l("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
    public final f m7180parseIsoStringOrNullFghU774(String value) {
        e0.checkNotNullParameter(value, "value");
        try {
            return f.m7182boximpl(h.access$parseDuration(value, true));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: parseOrNull-FghU774, reason: not valid java name */
    public final f m7181parseOrNullFghU774(String value) {
        e0.checkNotNullParameter(value, "value");
        try {
            return f.m7182boximpl(h.access$parseDuration(value, false));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7155getDaysUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7158getHoursUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7161getMicrosecondsUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7164getMillisecondsUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7167getMinutesUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7170getNanosecondsUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7173getSecondsUwyO8pc$annotations(int i10) {
    }

    /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7156getDaysUwyO8pc$annotations(long j10) {
    }

    /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7159getHoursUwyO8pc$annotations(long j10) {
    }

    /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7162getMicrosecondsUwyO8pc$annotations(long j10) {
    }

    /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7165getMillisecondsUwyO8pc$annotations(long j10) {
    }

    /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7168getMinutesUwyO8pc$annotations(long j10) {
    }

    /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7171getNanosecondsUwyO8pc$annotations(long j10) {
    }

    /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7174getSecondsUwyO8pc$annotations(long j10) {
    }
}
