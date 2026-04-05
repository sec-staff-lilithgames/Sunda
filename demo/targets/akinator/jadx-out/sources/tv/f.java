package tv;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import cv.BLca.YsiBvdpw;
import io.ktor.util.date.GMTDateParser;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final e f87433c = new e(null);

    /* renamed from: e, reason: collision with root package name */
    public static final long f87434e = m7184constructorimpl(0);

    /* renamed from: f, reason: collision with root package name */
    public static final long f87435f = m7184constructorimpl((4611686018427387903L << 1) + 1);

    /* renamed from: g, reason: collision with root package name */
    public static final long f87436g = m7184constructorimpl(((-4611686018427387903L) << 1) + 1);

    /* renamed from: b, reason: collision with root package name */
    public final long f87437b;

    public /* synthetic */ f(long j10) {
        this.f87437b = j10;
    }

    public static final long a(long j10, long j11) {
        long jAccess$nanosToMillis = h.access$nanosToMillis(j11);
        long j12 = j10 + jAccess$nanosToMillis;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return m7184constructorimpl((qv.v.coerceIn(j12, -4611686018427387903L, 4611686018427387903L) << 1) + 1);
        }
        return h.b(h.access$millisToNanos(j12) + (j11 - h.access$millisToNanos(jAccess$nanosToMillis)));
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strPadStart = n0.padStart(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strPadStart, 0, ((i13 + 3) / 3) * 3);
                e0.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strPadStart, 0, i15);
                e0.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f m7182boximpl(long j10) {
        return new f(j10);
    }

    public static final i c(long j10) {
        return d(j10) ? i.f87439c : i.f87441f;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7184constructorimpl(long j10) {
        if (!g.getDurationAssertionsEnabled()) {
            return j10;
        }
        if (d(j10)) {
            long j11 = j10 >> 1;
            if (-4611686018426999999L <= j11 && j11 < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(j11 + " ns is out of nanoseconds range");
        }
        long j12 = j10 >> 1;
        if (-4611686018427387903L > j12 || j12 >= 4611686018427387904L) {
            throw new AssertionError(j12 + " ms is out of milliseconds range");
        }
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(j12 + " ms is denormalized");
    }

    public static final boolean d(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m7185divLRDsOJo(long j10, long j11) {
        i iVar = (i) xu.e.maxOf(c(j10), c(j11));
        return m7215toDoubleimpl(j10, iVar) / m7215toDoubleimpl(j11, iVar);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m7187divUwyO8pc(long j10, int i10) {
        if (i10 == 0) {
            if (m7206isPositiveimpl(j10)) {
                return f87435f;
            }
            if (m7205isNegativeimpl(j10)) {
                return f87436g;
            }
            throw new IllegalArgumentException(YsiBvdpw.kqF);
        }
        if (d(j10)) {
            return h.b((j10 >> 1) / i10);
        }
        if (m7204isInfiniteimpl(j10)) {
            return m7210timesUwyO8pc(j10, mv.d.getSign(i10));
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 / j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return m7184constructorimpl((j13 << 1) + 1);
        }
        return h.b(h.access$millisToNanos(j13) + (h.access$millisToNanos(j11 - (j13 * j12)) / j12));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7188equalsimpl(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).m7225unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7189equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m7190getAbsoluteValueUwyO8pc(long j10) {
        return m7205isNegativeimpl(j10) ? m7223unaryMinusUwyO8pc(j10) : j10;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m7191getHoursComponentimpl(long j10) {
        if (m7204isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m7193getInWholeHoursimpl(j10) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m7192getInWholeDaysimpl(long j10) {
        return m7218toLongimpl(j10, i.f87445j);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m7193getInWholeHoursimpl(long j10) {
        return m7218toLongimpl(j10, i.f87444i);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m7194getInWholeMicrosecondsimpl(long j10) {
        return m7218toLongimpl(j10, i.f87440e);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m7195getInWholeMillisecondsimpl(long j10) {
        return ((((int) j10) & 1) == 1 && m7203isFiniteimpl(j10)) ? j10 >> 1 : m7218toLongimpl(j10, i.f87441f);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m7196getInWholeMinutesimpl(long j10) {
        return m7218toLongimpl(j10, i.f87443h);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m7197getInWholeNanosecondsimpl(long j10) {
        long j11 = j10 >> 1;
        if (d(j10)) {
            return j11;
        }
        if (j11 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j11 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return h.access$millisToNanos(j11);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m7198getInWholeSecondsimpl(long j10) {
        return m7218toLongimpl(j10, i.f87442g);
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m7199getMinutesComponentimpl(long j10) {
        if (m7204isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m7196getInWholeMinutesimpl(j10) % 60);
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m7200getNanosecondsComponentimpl(long j10) {
        if (m7204isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) ((((int) j10) & 1) == 1 ? h.access$millisToNanos((j10 >> 1) % 1000) : (j10 >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m7201getSecondsComponentimpl(long j10) {
        if (m7204isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m7198getInWholeSecondsimpl(j10) % 60);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7202hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m7203isFiniteimpl(long j10) {
        return !m7204isInfiniteimpl(j10);
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m7204isInfiniteimpl(long j10) {
        return j10 == f87435f || j10 == f87436g;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m7205isNegativeimpl(long j10) {
        return j10 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m7206isPositiveimpl(long j10) {
        return j10 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m7207minusLRDsOJo(long j10, long j11) {
        return m7208plusLRDsOJo(j10, m7223unaryMinusUwyO8pc(j11));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m7208plusLRDsOJo(long j10, long j11) {
        if (m7204isInfiniteimpl(j10)) {
            if (m7203isFiniteimpl(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m7204isInfiniteimpl(j11)) {
            return j11;
        }
        int i10 = ((int) j10) & 1;
        if (i10 != (((int) j11) & 1)) {
            return i10 == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        return d(j10) ? h.access$durationOfNanosNormalized(j12) : h.a(j12);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m7210timesUwyO8pc(long j10, int i10) {
        if (m7204isInfiniteimpl(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : m7223unaryMinusUwyO8pc(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f87434e;
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 * j12;
        boolean zD = d(j10);
        long j14 = f87436g;
        long j15 = f87435f;
        if (!zD) {
            if (j13 / j12 == j11) {
                return m7184constructorimpl((qv.v.coerceIn(j13, new qv.p(-4611686018427387903L, 4611686018427387903L)) << 1) + 1);
            }
            return mv.d.getSign(i10) * mv.d.getSign(j11) > 0 ? j15 : j14;
        }
        if (-2147483647L <= j11 && j11 < 2147483648L) {
            return h.b(j13);
        }
        if (j13 / j12 == j11) {
            return h.access$durationOfNanosNormalized(j13);
        }
        long jAccess$nanosToMillis = h.access$nanosToMillis(j11);
        long j16 = jAccess$nanosToMillis * j12;
        long jAccess$nanosToMillis2 = h.access$nanosToMillis((j11 - h.access$millisToNanos(jAccess$nanosToMillis)) * j12) + j16;
        if (j16 / j12 != jAccess$nanosToMillis || (jAccess$nanosToMillis2 ^ j16) < 0) {
            return mv.d.getSign(i10) * mv.d.getSign(j11) > 0 ? j15 : j14;
        }
        return m7184constructorimpl((qv.v.coerceIn(jAccess$nanosToMillis2, new qv.p(-4611686018427387903L, 4611686018427387903L)) << 1) + 1);
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7214toComponentsimpl(long j10, kv.s action) {
        e0.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m7192getInWholeDaysimpl(j10)), Integer.valueOf(m7191getHoursComponentimpl(j10)), Integer.valueOf(m7199getMinutesComponentimpl(j10)), Integer.valueOf(m7201getSecondsComponentimpl(j10)), Integer.valueOf(m7200getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m7215toDoubleimpl(long j10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        if (j10 == f87435f) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f87436g) {
            return Double.NEGATIVE_INFINITY;
        }
        return k.convertDurationUnit(j10 >> 1, c(j10), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m7216toIntimpl(long j10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        return (int) qv.v.coerceIn(m7218toLongimpl(j10, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m7217toIsoStringimpl(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (m7205isNegativeimpl(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM7190getAbsoluteValueUwyO8pc = m7190getAbsoluteValueUwyO8pc(j10);
        long jM7193getInWholeHoursimpl = m7193getInWholeHoursimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7199getMinutesComponentimpl = m7199getMinutesComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7201getSecondsComponentimpl = m7201getSecondsComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7200getNanosecondsComponentimpl = m7200getNanosecondsComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        if (m7204isInfiniteimpl(j10)) {
            jM7193getInWholeHoursimpl = 9999999999999L;
        }
        boolean z10 = false;
        boolean z11 = jM7193getInWholeHoursimpl != 0;
        boolean z12 = (iM7201getSecondsComponentimpl == 0 && iM7200getNanosecondsComponentimpl == 0) ? false : true;
        if (iM7199getMinutesComponentimpl != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jM7193getInWholeHoursimpl);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iM7199getMinutesComponentimpl);
            sb2.append(GMTDateParser.MONTH);
        }
        if (z12 || (!z11 && !z10)) {
            b(sb2, iM7201getSecondsComponentimpl, iM7200getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb2.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m7218toLongimpl(long j10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        if (j10 == f87435f) {
            return Long.MAX_VALUE;
        }
        if (j10 == f87436g) {
            return Long.MIN_VALUE;
        }
        return k.convertDurationUnit(j10 >> 1, c(j10), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7219toStringimpl(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f87435f) {
            return "Infinity";
        }
        if (j10 == f87436g) {
            return "-Infinity";
        }
        boolean zM7205isNegativeimpl = m7205isNegativeimpl(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zM7205isNegativeimpl) {
            sb2.append('-');
        }
        long jM7190getAbsoluteValueUwyO8pc = m7190getAbsoluteValueUwyO8pc(j10);
        long jM7192getInWholeDaysimpl = m7192getInWholeDaysimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7191getHoursComponentimpl = m7191getHoursComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7199getMinutesComponentimpl = m7199getMinutesComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7201getSecondsComponentimpl = m7201getSecondsComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        int iM7200getNanosecondsComponentimpl = m7200getNanosecondsComponentimpl(jM7190getAbsoluteValueUwyO8pc);
        int i10 = 0;
        boolean z10 = jM7192getInWholeDaysimpl != 0;
        boolean z11 = iM7191getHoursComponentimpl != 0;
        boolean z12 = iM7199getMinutesComponentimpl != 0;
        boolean z13 = (iM7201getSecondsComponentimpl == 0 && iM7200getNanosecondsComponentimpl == 0) ? false : true;
        if (z10) {
            sb2.append(jM7192getInWholeDaysimpl);
            sb2.append(GMTDateParser.DAY_OF_MONTH);
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM7191getHoursComponentimpl);
            sb2.append(GMTDateParser.HOURS);
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM7199getMinutesComponentimpl);
            sb2.append(GMTDateParser.MINUTES);
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM7201getSecondsComponentimpl != 0 || z10 || z11 || z12) {
                b(sb2, iM7201getSecondsComponentimpl, iM7200getNanosecondsComponentimpl, 9, ApsMetricsDataMap.APSMETRICS_FIELD_SDK, false);
            } else if (iM7200getNanosecondsComponentimpl >= 1000000) {
                b(sb2, iM7200getNanosecondsComponentimpl / 1000000, iM7200getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM7200getNanosecondsComponentimpl >= 1000) {
                b(sb2, iM7200getNanosecondsComponentimpl / 1000, iM7200getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb2.append(iM7200getNanosecondsComponentimpl);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zM7205isNegativeimpl && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m7221toStringimpl$default(long j10, i iVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m7220toStringimpl(j10, iVar, i10);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m7222truncateToUwyO8pc$kotlin_stdlib(long j10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        i iVarC = c(j10);
        if (unit.compareTo(iVarC) <= 0 || m7204isInfiniteimpl(j10)) {
            return j10;
        }
        long j11 = j10 >> 1;
        return h.toDuration(j11 - (j11 % k.convertDurationUnit(1L, unit, iVarC)), iVarC);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m7223unaryMinusUwyO8pc(long j10) {
        return m7184constructorimpl(((-(j10 >> 1)) << 1) + (((int) j10) & 1));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m7224compareToLRDsOJo(((f) obj).m7225unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m7224compareToLRDsOJo(long j10) {
        return m7183compareToLRDsOJo(this.f87437b, j10);
    }

    public boolean equals(Object obj) {
        return m7188equalsimpl(this.f87437b, obj);
    }

    public int hashCode() {
        return m7202hashCodeimpl(this.f87437b);
    }

    public String toString() {
        return m7219toStringimpl(this.f87437b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7225unboximpl() {
        return this.f87437b;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m7183compareToLRDsOJo(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return e0.compare(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m7205isNegativeimpl(j10) ? -i10 : i10;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7213toComponentsimpl(long j10, kv.r action) {
        e0.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m7193getInWholeHoursimpl(j10)), Integer.valueOf(m7199getMinutesComponentimpl(j10)), Integer.valueOf(m7201getSecondsComponentimpl(j10)), Integer.valueOf(m7200getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7212toComponentsimpl(long j10, kv.q action) {
        e0.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m7196getInWholeMinutesimpl(j10)), Integer.valueOf(m7201getSecondsComponentimpl(j10)), Integer.valueOf(m7200getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7211toComponentsimpl(long j10, kv.p action) {
        e0.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m7198getInWholeSecondsimpl(j10)), Integer.valueOf(m7200getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m7186divUwyO8pc(long j10, double d10) {
        int iRoundToInt = mv.d.roundToInt(d10);
        if (iRoundToInt == d10 && iRoundToInt != 0) {
            return m7187divUwyO8pc(j10, iRoundToInt);
        }
        i iVarC = c(j10);
        return h.toDuration(m7215toDoubleimpl(j10, iVarC) / d10, iVarC);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m7209timesUwyO8pc(long j10, double d10) {
        int iRoundToInt = mv.d.roundToInt(d10);
        if (iRoundToInt == d10) {
            return m7210timesUwyO8pc(j10, iRoundToInt);
        }
        i iVarC = c(j10);
        return h.toDuration(m7215toDoubleimpl(j10, iVarC) * d10, iVarC);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m7220toStringimpl(long j10, i unit, int i10) {
        e0.checkNotNullParameter(unit, "unit");
        if (i10 >= 0) {
            double dM7215toDoubleimpl = m7215toDoubleimpl(j10, unit);
            if (Double.isInfinite(dM7215toDoubleimpl)) {
                return String.valueOf(dM7215toDoubleimpl);
            }
            return g.formatToExactDecimals(dM7215toDoubleimpl, qv.v.coerceAtMost(i10, 12)) + m.shortName(unit);
        }
        throw new IllegalArgumentException(a.b.e(i10, "decimals must be not negative, but was ").toString());
    }
}
