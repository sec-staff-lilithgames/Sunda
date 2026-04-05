package io.odeeo.internal.w0;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
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
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f67312a = a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final double[] f67313a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67314b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67315c;

        public a(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        public double[] a() {
            return Arrays.copyOfRange(this.f67313a, this.f67314b, this.f67315c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && b.c(this.f67313a, ((Double) obj).doubleValue(), this.f67314b, this.f67315c) != -1;
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
                if (this.f67313a[this.f67314b + i10] != aVar.f67313a[aVar.f67314b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f67314b; i10 < this.f67315c; i10++) {
                iHashCode = (iHashCode * 31) + b.hashCode(this.f67313a[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Double) || (iC = b.c(this.f67313a, ((Double) obj).doubleValue(), this.f67314b, this.f67315c)) < 0) {
                return -1;
            }
            return iC - this.f67314b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Double) || (iD = b.d(this.f67313a, ((Double) obj).doubleValue(), this.f67314b, this.f67315c)) < 0) {
                return -1;
            }
            return iD - this.f67314b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67315c - this.f67314b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i10, int i11) {
            u.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.f67313a;
            int i12 = this.f67314b;
            return new a(dArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f67313a[this.f67314b]);
            int i10 = this.f67314b;
            while (true) {
                i10++;
                if (i10 >= this.f67315c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f67313a[i10]);
            }
        }

        public a(double[] dArr, int i10, int i11) {
            this.f67313a = dArr;
            this.f67314b = i10;
            this.f67315c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i10) {
            u.checkElementIndex(i10, size());
            return Double.valueOf(this.f67313a[this.f67314b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i10, Double d10) {
            u.checkElementIndex(i10, size());
            double[] dArr = this.f67313a;
            int i11 = this.f67314b + i10;
            double d11 = dArr[i11];
            dArr[i11] = ((Double) u.checkNotNull(d10)).doubleValue();
            return Double.valueOf(d11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.w0.b$b, reason: collision with other inner class name */
    public static final class C0681b extends h<String, Double> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final C0681b f67316c = new C0681b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f67316c;
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double d(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String c(Double d10) {
            return d10.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Double.compare(dArr[i10], dArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    public static List<Double> asList(double... dArr) {
        return dArr.length == 0 ? Collections.EMPTY_LIST : new a(dArr);
    }

    public static int c(double[] dArr, double d10, int i10, int i11) {
        while (i10 < i11) {
            if (dArr[i10] == d10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int compare(double d10, double d11) {
        return Double.compare(d10, d11);
    }

    public static double[] concat(double[]... dArr) {
        int length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        double[] dArr3 = new double[length];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    public static double constrainToRange(double d10, double d11, double d12) {
        u.checkArgument(d11 <= d12, "min (%s) must be less than or equal to max (%s)", Double.valueOf(d11), Double.valueOf(d12));
        return Math.min(Math.max(d10, d11), d12);
    }

    public static boolean contains(double[] dArr, double d10) {
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    public static int d(double[] dArr, double d10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (dArr[i12] == d10) {
                return i12;
            }
        }
        return -1;
    }

    public static double[] ensureCapacity(double[] dArr, int i10, int i11) {
        u.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        u.checkArgument(i11 >= 0, duhsDlGWdBkekB.gfcxjgbhmfoQFgZ, i11);
        return dArr.length < i10 ? Arrays.copyOf(dArr, i10 + i11) : dArr;
    }

    public static int hashCode(double d10) {
        return Double.valueOf(d10).hashCode();
    }

    public static int indexOf(double[] dArr, double d10) {
        return c(dArr, d10, 0, dArr.length);
    }

    public static boolean isFinite(double d10) {
        return Double.NEGATIVE_INFINITY < d10 && d10 < Double.POSITIVE_INFINITY;
    }

    public static String join(String str, double... dArr) {
        u.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(dArr.length * 12);
        sb2.append(dArr[0]);
        for (int i10 = 1; i10 < dArr.length; i10++) {
            sb2.append(str);
            sb2.append(dArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(double[] dArr, double d10) {
        return d(dArr, d10, 0, dArr.length);
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return c.INSTANCE;
    }

    public static double max(double... dArr) {
        u.checkArgument(dArr.length > 0);
        double dMax = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMax = Math.max(dMax, dArr[i10]);
        }
        return dMax;
    }

    public static double min(double... dArr) {
        u.checkArgument(dArr.length > 0);
        double dMin = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMin = Math.min(dMin, dArr[i10]);
        }
        return dMin;
    }

    public static void reverse(double[] dArr) {
        u.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void sortDescending(double[] dArr) {
        u.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    public static h<String, Double> stringConverter() {
        return C0681b.f67316c;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) u.checkNotNull(array[i10])).doubleValue();
        }
        return dArr;
    }

    public static Double tryParse(String str) {
        if (!f67312a.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Pattern a() {
        return Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(double[] r7, double[] r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.w0.b.indexOf(double[], double[]):int");
    }

    public static void reverse(double[] dArr, int i10, int i11) {
        u.checkNotNull(dArr);
        u.checkPositionIndexes(i10, i11, dArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i12];
            dArr[i12] = d10;
            i10++;
        }
    }

    public static void sortDescending(double[] dArr, int i10, int i11) {
        u.checkNotNull(dArr);
        u.checkPositionIndexes(i10, i11, dArr.length);
        Arrays.sort(dArr, i10, i11);
        reverse(dArr, i10, i11);
    }
}
