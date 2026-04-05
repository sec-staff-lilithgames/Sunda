package bc;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f9029a = BigInteger.valueOf(5);

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f9030b = BigInteger.valueOf(10000000000000000L);

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f9031c = BigInteger.valueOf(152587890625L);

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger[] f9032d = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(C.NANOS_PER_SECOND), BigInteger.valueOf(RealConnection.IDLE_CONNECTION_HEALTHY_NS), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    public static BigInteger a(NavigableMap navigableMap, int i10) {
        BigInteger[] bigIntegerArr = f9032d;
        if (i10 < bigIntegerArr.length) {
            return bigIntegerArr[i10];
        }
        if (navigableMap == null) {
            return f9029a.pow(i10).shiftLeft(i10);
        }
        Map.Entry entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i10));
        Integer num = (Integer) entryFloorEntry.getKey();
        return num.intValue() == i10 ? (BigInteger) entryFloorEntry.getValue() : j.k((BigInteger) entryFloorEntry.getValue(), a(navigableMap, i10 - num.intValue()));
    }

    public static BigInteger b(TreeMap treeMap, int i10) {
        int i11 = i10 & (-16);
        Map.Entry entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i11));
        int iIntValue = ((Integer) entryFloorEntry.getKey()).intValue();
        BigInteger bigInteger = (BigInteger) entryFloorEntry.getValue();
        if (iIntValue == i11) {
            return bigInteger;
        }
        int i12 = i11 - iIntValue;
        BigInteger bigIntegerB = (BigInteger) treeMap.get(Integer.valueOf(i12));
        if (bigIntegerB == null) {
            bigIntegerB = b(treeMap, i12);
            treeMap.put(Integer.valueOf(i12), bigIntegerB);
        }
        return j.k(bigInteger, bigIntegerB);
    }

    public static TreeMap c() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, f9030b);
        return treeMap;
    }

    public static TreeMap d(int i10, int i11) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, f9031c);
        e(treeMap, i10, i11);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
        }
        return treeMap;
    }

    public static void e(TreeMap treeMap, int i10, int i11) {
        if (i11 - i10 <= 18) {
            return;
        }
        int iF = f(i10, i11);
        int i12 = i11 - iF;
        if (treeMap.containsKey(Integer.valueOf(i12))) {
            return;
        }
        e(treeMap, i10, iF);
        e(treeMap, iF, i11);
        treeMap.put(Integer.valueOf(i12), b(treeMap, i12));
    }

    public static long estimateNumBits(long j10) {
        return ((j10 * 3402) >>> 10) + 1;
    }

    public static int f(int i10, int i11) {
        return i11 - ((((i11 - i10) + 31) >>> 5) << 4);
    }

    public static long g(long j10, long j11) {
        long j12 = j10 & 4294967295L;
        long j13 = j10 >>> 32;
        long j14 = j11 & 4294967295L;
        long j15 = j11 >>> 32;
        long j16 = j13 * j15;
        long j17 = j15 * j12;
        return j16 + ((((j13 * j14) + ((j12 * j14) >>> 32)) + (4294967295L & j17)) >>> 32) + (j17 >>> 32);
    }
}
