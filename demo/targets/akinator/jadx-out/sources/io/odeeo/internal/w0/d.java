package io.odeeo.internal.w0;

import com.inmobi.commons.core.configs.AdConfig;
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
public final class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int[] f67325a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67326b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67327c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public int[] a() {
            return Arrays.copyOfRange(this.f67325a, this.f67326b, this.f67327c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && d.c(this.f67325a, ((Integer) obj).intValue(), this.f67326b, this.f67327c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f67325a[this.f67326b + i10] != aVar.f67325a[aVar.f67326b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f67326b; i10 < this.f67327c; i10++) {
                iHashCode = (iHashCode * 31) + d.hashCode(this.f67325a[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Integer) || (iC = d.c(this.f67325a, ((Integer) obj).intValue(), this.f67326b, this.f67327c)) < 0) {
                return -1;
            }
            return iC - this.f67326b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Integer) || (iD = d.d(this.f67325a, ((Integer) obj).intValue(), this.f67326b, this.f67327c)) < 0) {
                return -1;
            }
            return iD - this.f67326b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67327c - this.f67326b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            u.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f67325a;
            int i12 = this.f67326b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f67325a[this.f67326b]);
            int i10 = this.f67326b;
            while (true) {
                i10++;
                if (i10 >= this.f67327c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f67325a[i10]);
            }
        }

        public a(int[] iArr, int i10, int i11) {
            this.f67325a = iArr;
            this.f67326b = i10;
            this.f67327c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i10) {
            u.checkElementIndex(i10, size());
            return Integer.valueOf(this.f67325a[this.f67326b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i10, Integer num) {
            u.checkElementIndex(i10, size());
            int[] iArr = this.f67325a;
            int i11 = this.f67326b + i10;
            int i12 = iArr[i11];
            iArr[i11] = ((Integer) u.checkNotNull(num)).intValue();
            return Integer.valueOf(i12);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends h<String, Integer> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final b f67328c = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f67328c;
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer d(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String c(Integer num) {
            return num.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = d.compare(iArr[i10], iArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    public static List<Integer> asList(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    public static int c(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int checkedCast(long j10) {
        int i10 = (int) j10;
        u.checkArgument(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int compare(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int[] concat(int[]... iArr) {
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int constrainToRange(int i10, int i11, int i12) {
        u.checkArgument(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static boolean contains(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static int d(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int[] ensureCapacity(int[] iArr, int i10, int i11) {
        u.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        u.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return iArr.length < i10 ? Arrays.copyOf(iArr, i10 + i11) : iArr;
    }

    public static int fromByteArray(byte[] bArr) {
        u.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int fromBytes(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b13 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static int indexOf(int[] iArr, int i10) {
        return c(iArr, i10, 0, iArr.length);
    }

    public static String join(String str, int... iArr) {
        u.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            sb2.append(str);
            sb2.append(iArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(int[] iArr, int i10) {
        return d(iArr, i10, 0, iArr.length);
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return c.INSTANCE;
    }

    public static int max(int... iArr) {
        u.checkArgument(iArr.length > 0);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static int min(int... iArr) {
        u.checkArgument(iArr.length > 0);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static void reverse(int[] iArr) {
        u.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static int saturatedCast(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static void sortDescending(int[] iArr) {
        u.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static h<String, Integer> stringConverter() {
        return b.f67328c;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) u.checkNotNull(array[i10])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int i10) {
        return new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10};
    }

    public static Integer tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(int[] r5, int[] r6) {
        /*
            java.lang.String r0 = "array"
            io.odeeo.internal.t0.u.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            io.odeeo.internal.t0.u.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.w0.d.indexOf(int[], int[]):int");
    }

    public static Integer tryParse(String str, int i10) {
        Long lTryParse = e.tryParse(str, i10);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }

    public static void reverse(int[] iArr, int i10, int i11) {
        u.checkNotNull(iArr);
        u.checkPositionIndexes(i10, i11, iArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            int i13 = iArr[i10];
            iArr[i10] = iArr[i12];
            iArr[i12] = i13;
            i10++;
        }
    }

    public static void sortDescending(int[] iArr, int i10, int i11) {
        u.checkNotNull(iArr);
        u.checkPositionIndexes(i10, i11, iArr.length);
        Arrays.sort(iArr, i10, i11);
        reverse(iArr, i10, i11);
    }

    public static int hashCode(int i10) {
        return i10;
    }
}
