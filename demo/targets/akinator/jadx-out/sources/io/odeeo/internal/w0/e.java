package io.odeeo.internal.w0;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import io.odeeo.internal.t0.h;
import io.odeeo.internal.t0.u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f67331a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 <= 9; i10++) {
                bArr[i10 + 48] = (byte) i10;
            }
            for (int i11 = 0; i11 <= 26; i11++) {
                byte b10 = (byte) (i11 + 10);
                bArr[i11 + 65] = b10;
                bArr[i11 + 97] = b10;
            }
            f67331a = bArr;
        }

        public static int a(char c10) {
            if (c10 < 128) {
                return f67331a[c10];
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = e.compare(jArr[i10], jArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long[] f67334a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67335b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67336c;

        public c(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        public long[] a() {
            return Arrays.copyOfRange(this.f67334a, this.f67335b, this.f67336c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && e.c(this.f67334a, ((Long) obj).longValue(), this.f67335b, this.f67336c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            int size = size();
            if (cVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f67334a[this.f67335b + i10] != cVar.f67334a[cVar.f67335b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f67335b; i10 < this.f67336c; i10++) {
                iHashCode = (iHashCode * 31) + e.hashCode(this.f67334a[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Long) || (iC = e.c(this.f67334a, ((Long) obj).longValue(), this.f67335b, this.f67336c)) < 0) {
                return -1;
            }
            return iC - this.f67335b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Long) || (iD = e.d(this.f67334a, ((Long) obj).longValue(), this.f67335b, this.f67336c)) < 0) {
                return -1;
            }
            return iD - this.f67335b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67336c - this.f67335b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i10, int i11) {
            u.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.f67334a;
            int i12 = this.f67335b;
            return new c(jArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f67334a[this.f67335b]);
            int i10 = this.f67335b;
            while (true) {
                i10++;
                if (i10 >= this.f67336c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f67334a[i10]);
            }
        }

        public c(long[] jArr, int i10, int i11) {
            this.f67334a = jArr;
            this.f67335b = i10;
            this.f67336c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i10) {
            u.checkElementIndex(i10, size());
            return Long.valueOf(this.f67334a[this.f67335b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i10, Long l9) {
            u.checkElementIndex(i10, size());
            long[] jArr = this.f67334a;
            int i11 = this.f67335b + i10;
            long j10 = jArr[i11];
            jArr[i11] = ((Long) u.checkNotNull(l9)).longValue();
            return Long.valueOf(j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends h<String, Long> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final d f67337c = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f67337c;
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long d(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String c(Long l9) {
            return l9.toString();
        }
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.EMPTY_LIST : new c(jArr);
    }

    public static int c(long[] jArr, long j10, int i10, int i11) {
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int compare(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static long[] concat(long[]... jArr) {
        int length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        long[] jArr3 = new long[length];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static long constrainToRange(long j10, long j11, long j12) {
        u.checkArgument(j11 <= j12, "min (%s) must be less than or equal to max (%s)", j11, j12);
        return Math.min(Math.max(j10, j11), j12);
    }

    public static boolean contains(long[] jArr, long j10) {
        for (long j11 : jArr) {
            if (j11 == j10) {
                return true;
            }
        }
        return false;
    }

    public static int d(long[] jArr, long j10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (jArr[i12] == j10) {
                return i12;
            }
        }
        return -1;
    }

    public static long[] ensureCapacity(long[] jArr, int i10, int i11) {
        u.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        u.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return jArr.length < i10 ? Arrays.copyOf(jArr, i10 + i11) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        u.checkArgument(bArr.length >= 8, LJjmO.pNwXFlPwPZhv, bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17) {
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (b17 & 255);
    }

    public static int hashCode(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int indexOf(long[] jArr, long j10) {
        return c(jArr, j10, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        u.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 10);
        sb2.append(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            sb2.append(str);
            sb2.append(jArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(long[] jArr, long j10) {
        return d(jArr, j10, 0, jArr.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return b.INSTANCE;
    }

    public static long max(long... jArr) {
        u.checkArgument(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static long min(long... jArr) {
        u.checkArgument(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static void reverse(long[] jArr) {
        u.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        u.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static h<String, Long> stringConverter() {
        return d.f67337c;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof c) {
            return ((c) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = ((Number) u.checkNotNull(array[i10])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 7; i10 >= 0; i10--) {
            bArr[i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
        return bArr;
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(long[] r7, long[] r8) {
        /*
            java.lang.String r0 = "array"
            io.odeeo.internal.t0.u.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            io.odeeo.internal.t0.u.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.w0.e.indexOf(long[], long[]):int");
    }

    public static Long tryParse(String str, int i10) {
        if (((String) u.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i10 < 2 || i10 > 36) {
            throw new IllegalArgumentException(a.b.e(i10, "radix must be between MIN_RADIX and MAX_RADIX but was "));
        }
        int i11 = str.charAt(0) == '-' ? 1 : 0;
        if (i11 == str.length()) {
            return null;
        }
        int i12 = i11 + 1;
        int iA = a.a(str.charAt(i11));
        if (iA < 0 || iA >= i10) {
            return null;
        }
        long j10 = -iA;
        long j11 = i10;
        long j12 = Long.MIN_VALUE / j11;
        while (i12 < str.length()) {
            int i13 = i12 + 1;
            int iA2 = a.a(str.charAt(i12));
            if (iA2 < 0 || iA2 >= i10 || j10 < j12) {
                return null;
            }
            long j13 = j10 * j11;
            long j14 = iA2;
            if (j13 < j14 - Long.MIN_VALUE) {
                return null;
            }
            j10 = j13 - j14;
            i12 = i13;
        }
        if (i11 != 0) {
            return Long.valueOf(j10);
        }
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j10);
    }

    public static void reverse(long[] jArr, int i10, int i11) {
        u.checkNotNull(jArr);
        u.checkPositionIndexes(i10, i11, jArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i12];
            jArr[i12] = j10;
            i10++;
        }
    }

    public static void sortDescending(long[] jArr, int i10, int i11) {
        u.checkNotNull(jArr);
        u.checkPositionIndexes(i10, i11, jArr.length);
        Arrays.sort(jArr, i10, i11);
        reverse(jArr, i10, i11);
    }
}
