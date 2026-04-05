package qv;

import b0.e2;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import qv.a;
import qv.k;
import qv.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v extends u {
    @tu.f
    public static final /* synthetic */ boolean byteRangeContains(h hVar, double d10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d10);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static <T extends Comparable<? super T>> T coerceAtLeast(T t10, T minimumValue) {
        e0.checkNotNullParameter(t10, "<this>");
        e0.checkNotNullParameter(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t10, T maximumValue) {
        e0.checkNotNullParameter(t10, "<this>");
        e0.checkNotNullParameter(maximumValue, "maximumValue");
        return t10.compareTo(maximumValue) > 0 ? maximumValue : t10;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t10, T t11, T t12) {
        e0.checkNotNullParameter(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @tu.f
    public static final /* synthetic */ boolean doubleRangeContains(h hVar, byte b10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(b10));
    }

    public static final k downTo(int i10, byte b10) {
        return k.f83529f.fromClosedRange(i10, b10, -1);
    }

    public static final int first(k kVar) {
        e0.checkNotNullParameter(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return kVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + kVar + " is empty.");
    }

    public static final Integer firstOrNull(k kVar) {
        e0.checkNotNullParameter(kVar, "<this>");
        if (kVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kVar.getFirst());
    }

    @tu.f
    public static final /* synthetic */ boolean floatRangeContains(h hVar, byte b10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(b10));
    }

    public static final boolean intRangeContains(h hVar, byte b10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Integer.valueOf(b10));
    }

    public static final int last(k kVar) {
        e0.checkNotNullParameter(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return kVar.getLast();
        }
        throw new NoSuchElementException("Progression " + kVar + SUvoXnn.xiijY);
    }

    public static final Integer lastOrNull(k kVar) {
        e0.checkNotNullParameter(kVar, "<this>");
        if (kVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kVar.getLast());
    }

    public static final boolean longRangeContains(h hVar, byte b10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Long.valueOf(b10));
    }

    public static final int random(m mVar, ov.g random) {
        e0.checkNotNullParameter(mVar, "<this>");
        e0.checkNotNullParameter(random, "random");
        try {
            return ov.h.nextInt(random, mVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final Integer randomOrNull(m mVar, ov.g random) {
        e0.checkNotNullParameter(mVar, "<this>");
        e0.checkNotNullParameter(random, "random");
        if (mVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(ov.h.nextInt(random, mVar));
    }

    public static final k reversed(k kVar) {
        e0.checkNotNullParameter(kVar, "<this>");
        return k.f83529f.fromClosedRange(kVar.getLast(), kVar.getFirst(), -kVar.getStep());
    }

    public static final boolean shortRangeContains(h hVar, byte b10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Short.valueOf(b10));
    }

    public static k step(k kVar, int i10) {
        e0.checkNotNullParameter(kVar, "<this>");
        u.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        k.a aVar = k.f83529f;
        int first = kVar.getFirst();
        int last = kVar.getLast();
        if (kVar.getStep() <= 0) {
            i10 = -i10;
        }
        return aVar.fromClosedRange(first, last, i10);
    }

    public static final Byte toByteExactOrNull(int i10) {
        if (-128 > i10 || i10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i10);
    }

    public static final Integer toIntExactOrNull(long j10) {
        if (-2147483648L > j10 || j10 >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j10);
    }

    public static final Long toLongExactOrNull(double d10) {
        if (-9.223372036854776E18d > d10 || d10 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d10);
    }

    public static final Short toShortExactOrNull(int i10) {
        if (-32768 > i10 || i10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) i10);
    }

    public static final m until(int i10, byte b10) {
        return new m(i10, b10 - 1);
    }

    @tu.f
    public static final /* synthetic */ boolean byteRangeContains(h hVar, float f10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f10);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    public static final byte coerceAtMost(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    public static final boolean doubleRangeContains(h hVar, float f10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(f10));
    }

    public static final n downTo(long j10, byte b10) {
        return n.f83539f.fromClosedRange(j10, b10, -1L);
    }

    public static final Long firstOrNull(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(nVar.getFirst());
    }

    public static final boolean floatRangeContains(h hVar, double d10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf((float) d10));
    }

    public static final boolean intRangeContains(t tVar, byte b10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Integer.valueOf(b10));
    }

    public static final Long lastOrNull(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(nVar.getLast());
    }

    public static final boolean longRangeContains(t tVar, byte b10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Long.valueOf(b10));
    }

    public static final n reversed(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        return n.f83539f.fromClosedRange(nVar.getLast(), nVar.getFirst(), -nVar.getStep());
    }

    public static final boolean shortRangeContains(t tVar, byte b10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Short.valueOf(b10));
    }

    public static final Byte toByteExactOrNull(long j10) {
        if (-128 > j10 || j10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j10);
    }

    public static final Integer toIntExactOrNull(double d10) {
        if (-2.147483648E9d > d10 || d10 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d10);
    }

    public static final Long toLongExactOrNull(float f10) {
        if (-9.223372E18f > f10 || f10 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f10);
    }

    public static final Short toShortExactOrNull(long j10) {
        if (-32768 > j10 || j10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) j10);
    }

    public static final p until(long j10, byte b10) {
        return new p(j10, b10 - 1);
    }

    public static final boolean byteRangeContains(h hVar, int i10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i10);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s10, short s11) {
        return s10 < s11 ? s11 : s10;
    }

    public static final short coerceAtMost(short s10, short s11) {
        return s10 > s11 ? s11 : s10;
    }

    public static final boolean doubleRangeContains(t tVar, float f10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Double.valueOf(f10));
    }

    public static final k downTo(byte b10, byte b11) {
        return k.f83529f.fromClosedRange(b10, b11, -1);
    }

    public static final Character firstOrNull(a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.getFirst());
    }

    @tu.f
    public static final /* synthetic */ boolean floatRangeContains(h hVar, int i10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(i10));
    }

    @tu.f
    public static final /* synthetic */ boolean intRangeContains(h hVar, double d10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d10);
        if (intExactOrNull != null) {
            return hVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final Character lastOrNull(a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.getLast());
    }

    @tu.f
    public static final /* synthetic */ boolean longRangeContains(h hVar, double d10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Long longExactOrNull = toLongExactOrNull(d10);
        if (longExactOrNull != null) {
            return hVar.contains(longExactOrNull);
        }
        return false;
    }

    public static final long random(p pVar, ov.g random) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(random, "random");
        try {
            return ov.h.nextLong(random, pVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final Long randomOrNull(p pVar, ov.g random) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(random, "random");
        if (pVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(ov.h.nextLong(random, pVar));
    }

    public static final a reversed(a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        return a.f83511f.fromClosedRange(aVar.getLast(), aVar.getFirst(), -aVar.getStep());
    }

    @tu.f
    public static final /* synthetic */ boolean shortRangeContains(h hVar, double d10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d10);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final n step(n nVar, long j10) {
        e0.checkNotNullParameter(nVar, "<this>");
        u.checkStepIsPositive(j10 > 0, Long.valueOf(j10));
        n.a aVar = n.f83539f;
        long first = nVar.getFirst();
        long last = nVar.getLast();
        if (nVar.getStep() <= 0) {
            j10 = -j10;
        }
        return aVar.fromClosedRange(first, last, j10);
    }

    public static final Byte toByteExactOrNull(short s10) {
        if (-128 > s10 || s10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s10);
    }

    public static final Integer toIntExactOrNull(float f10) {
        if (-2.1474836E9f > f10 || f10 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f10);
    }

    public static final Short toShortExactOrNull(double d10) {
        if (-32768.0d > d10 || d10 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d10);
    }

    public static final m until(byte b10, byte b11) {
        return new m(b10, b11 - 1);
    }

    public static final boolean byteRangeContains(t tVar, int i10) {
        e0.checkNotNullParameter(tVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i10);
        if (byteExactOrNull != null) {
            return tVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static int coerceAtMost(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @tu.f
    public static final /* synthetic */ boolean doubleRangeContains(h hVar, int i10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(i10));
    }

    public static final k downTo(short s10, byte b10) {
        return k.f83529f.fromClosedRange(s10, b10, -1);
    }

    public static final long first(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        if (!nVar.isEmpty()) {
            return nVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + nVar + " is empty.");
    }

    @tu.f
    public static final /* synthetic */ boolean floatRangeContains(h hVar, long j10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(j10));
    }

    @tu.f
    public static final /* synthetic */ boolean intRangeContains(h hVar, float f10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f10);
        if (intExactOrNull != null) {
            return hVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final long last(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        if (!nVar.isEmpty()) {
            return nVar.getLast();
        }
        throw new NoSuchElementException("Progression " + nVar + " is empty.");
    }

    @tu.f
    public static final /* synthetic */ boolean longRangeContains(h hVar, float f10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Long longExactOrNull = toLongExactOrNull(f10);
        if (longExactOrNull != null) {
            return hVar.contains(longExactOrNull);
        }
        return false;
    }

    @tu.f
    public static final /* synthetic */ boolean shortRangeContains(h hVar, float f10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f10);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final Byte toByteExactOrNull(double d10) {
        if (-128.0d > d10 || d10 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d10);
    }

    public static final Short toShortExactOrNull(float f10) {
        if (-32768.0f > f10 || f10 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f10);
    }

    public static final m until(short s10, byte b10) {
        return new m(s10, b10 - 1);
    }

    public static final boolean byteRangeContains(h hVar, long j10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j10);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static long coerceAtMost(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @tu.f
    public static final /* synthetic */ boolean doubleRangeContains(h hVar, long j10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(j10));
    }

    public static final a downTo(char c10, char c11) {
        return a.f83511f.fromClosedRange(c10, c11, -1);
    }

    @tu.f
    public static final /* synthetic */ boolean floatRangeContains(h hVar, short s10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(s10));
    }

    public static final boolean intRangeContains(h hVar, long j10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j10);
        if (intExactOrNull != null) {
            return hVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(h hVar, int i10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Long.valueOf(i10));
    }

    public static final char random(c cVar, ov.g random) {
        e0.checkNotNullParameter(cVar, "<this>");
        e0.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(cVar.getFirst(), cVar.getLast() + 1);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final Character randomOrNull(c cVar, ov.g random) {
        e0.checkNotNullParameter(cVar, "<this>");
        e0.checkNotNullParameter(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(cVar.getFirst(), cVar.getLast() + 1));
    }

    public static final boolean shortRangeContains(h hVar, int i10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i10);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final a step(a aVar, int i10) {
        e0.checkNotNullParameter(aVar, "<this>");
        u.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        a.C0772a c0772a = a.f83511f;
        char first = aVar.getFirst();
        char last = aVar.getLast();
        if (aVar.getStep() <= 0) {
            i10 = -i10;
        }
        return c0772a.fromClosedRange(first, last, i10);
    }

    public static final Byte toByteExactOrNull(float f10) {
        if (-128.0f > f10 || f10 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f10);
    }

    public static final c until(char c10, char c11) {
        return e0.compare((int) c11, 0) <= 0 ? c.f83519g.getEMPTY() : new c(c10, (char) (c11 - 1));
    }

    public static final boolean byteRangeContains(t tVar, long j10) {
        e0.checkNotNullParameter(tVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j10);
        if (byteExactOrNull != null) {
            return tVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static float coerceAtMost(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @tu.f
    public static final /* synthetic */ boolean doubleRangeContains(h hVar, short s10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(s10));
    }

    public static k downTo(int i10, int i11) {
        return k.f83529f.fromClosedRange(i10, i11, -1);
    }

    public static final boolean intRangeContains(t tVar, long j10) {
        e0.checkNotNullParameter(tVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j10);
        if (intExactOrNull != null) {
            return tVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(t tVar, int i10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Long.valueOf(i10));
    }

    public static final boolean shortRangeContains(t tVar, int i10) {
        e0.checkNotNullParameter(tVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i10);
        if (shortExactOrNull != null) {
            return tVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(h hVar, short s10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s10);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static double coerceAtLeast(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static double coerceAtMost(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static final byte coerceIn(byte b10, byte b11, byte b12) {
        if (b11 <= b12) {
            return b10 < b11 ? b11 : b10 > b12 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b12) + " is less than minimum " + ((int) b11) + '.');
    }

    public static final n downTo(long j10, int i10) {
        return n.f83539f.fromClosedRange(j10, i10, -1L);
    }

    public static final char first(a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    public static final boolean intRangeContains(h hVar, short s10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Integer.valueOf(s10));
    }

    public static final char last(a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.getLast();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    public static final boolean longRangeContains(h hVar, short s10) {
        e0.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Long.valueOf(s10));
    }

    public static final boolean shortRangeContains(h hVar, long j10) {
        e0.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j10);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static m until(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return m.f83537g.getEMPTY();
        }
        return new m(i10, i11 - 1);
    }

    public static final boolean byteRangeContains(t tVar, short s10) {
        e0.checkNotNullParameter(tVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s10);
        if (byteExactOrNull != null) {
            return tVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s10, short s11, short s12) {
        if (s11 <= s12) {
            return s10 < s11 ? s11 : s10 > s12 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s12) + " is less than minimum " + ((int) s11) + '.');
    }

    public static final k downTo(byte b10, int i10) {
        return k.f83529f.fromClosedRange(b10, i10, -1);
    }

    public static final boolean intRangeContains(t tVar, short s10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Integer.valueOf(s10));
    }

    public static final boolean longRangeContains(t tVar, short s10) {
        e0.checkNotNullParameter(tVar, "<this>");
        return tVar.contains(Long.valueOf(s10));
    }

    public static final boolean shortRangeContains(t tVar, long j10) {
        e0.checkNotNullParameter(tVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j10);
        if (shortExactOrNull != null) {
            return tVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final k downTo(short s10, int i10) {
        return k.f83529f.fromClosedRange(s10, i10, -1);
    }

    public static final p until(long j10, int i10) {
        return new p(j10, i10 - 1);
    }

    public static long coerceIn(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException(e3.g.n(e2.r(j12, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j11, '.'));
    }

    public static final n downTo(int i10, long j10) {
        return n.f83539f.fromClosedRange(i10, j10, -1L);
    }

    public static final m until(byte b10, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            return m.f83537g.getEMPTY();
        }
        return new m(b10, i10 - 1);
    }

    public static final n downTo(long j10, long j11) {
        return n.f83539f.fromClosedRange(j10, j11, -1L);
    }

    public static final n downTo(byte b10, long j10) {
        return n.f83539f.fromClosedRange(b10, j10, -1L);
    }

    public static final m until(short s10, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            return m.f83537g.getEMPTY();
        }
        return new m(s10, i10 - 1);
    }

    public static final n downTo(short s10, long j10) {
        return n.f83539f.fromClosedRange(s10, j10, -1L);
    }

    public static final k downTo(int i10, short s10) {
        return k.f83529f.fromClosedRange(i10, s10, -1);
    }

    public static final p until(int i10, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return p.f83547g.getEMPTY();
        }
        return new p(i10, j10 - 1);
    }

    public static final n downTo(long j10, short s10) {
        return n.f83539f.fromClosedRange(j10, s10, -1L);
    }

    public static final k downTo(byte b10, short s10) {
        return k.f83529f.fromClosedRange(b10, s10, -1);
    }

    public static p until(long j10, long j11) {
        if (j11 <= Long.MIN_VALUE) {
            return p.f83547g.getEMPTY();
        }
        return new p(j10, j11 - 1);
    }

    public static final k downTo(short s10, short s11) {
        return k.f83529f.fromClosedRange(s10, s11, -1);
    }

    public static final p until(byte b10, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return p.f83547g.getEMPTY();
        }
        return new p(b10, j10 - 1);
    }

    public static final p until(short s10, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return p.f83547g.getEMPTY();
        }
        return new p(s10, j10 - 1);
    }

    public static float coerceIn(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static double coerceIn(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final m until(int i10, short s10) {
        return new m(i10, s10 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t10, f range) {
        e0.checkNotNullParameter(t10, "<this>");
        e0.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t10, range.getStart()) || range.lessThanOrEquals(range.getStart(), t10)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t10) || range.lessThanOrEquals(t10, range.getEndInclusive())) ? t10 : (T) range.getEndInclusive() : (T) range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final p until(long j10, short s10) {
        return new p(j10, s10 - 1);
    }

    public static final m until(byte b10, short s10) {
        return new m(b10, s10 - 1);
    }

    public static final m until(short s10, short s11) {
        return new m(s10, s11 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t10, h range) {
        e0.checkNotNullParameter(t10, "<this>");
        e0.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return (T) coerceIn((Comparable) t10, (f) range);
        }
        if (!range.isEmpty()) {
            return t10.compareTo(range.getStart()) < 0 ? (T) range.getStart() : t10.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static int coerceIn(int i10, h range) {
        e0.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((Number) coerceIn(Integer.valueOf(i10), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i10 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long coerceIn(long j10, h range) {
        e0.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((Number) coerceIn(Long.valueOf(j10), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j10 < ((Number) range.getStart()).longValue() ? ((Number) range.getStart()).longValue() : j10 > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
