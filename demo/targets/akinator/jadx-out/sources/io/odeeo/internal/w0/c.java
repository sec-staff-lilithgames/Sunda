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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final float[] f67319a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67320b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67321c;

        public a(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        public float[] a() {
            return Arrays.copyOfRange(this.f67319a, this.f67320b, this.f67321c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && c.c(this.f67319a, ((Float) obj).floatValue(), this.f67320b, this.f67321c) != -1;
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
                if (this.f67319a[this.f67320b + i10] != aVar.f67319a[aVar.f67320b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f67320b; i10 < this.f67321c; i10++) {
                iHashCode = (iHashCode * 31) + c.hashCode(this.f67319a[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Float) || (iC = c.c(this.f67319a, ((Float) obj).floatValue(), this.f67320b, this.f67321c)) < 0) {
                return -1;
            }
            return iC - this.f67320b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Float) || (iD = c.d(this.f67319a, ((Float) obj).floatValue(), this.f67320b, this.f67321c)) < 0) {
                return -1;
            }
            return iD - this.f67320b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67321c - this.f67320b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i10, int i11) {
            u.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.f67319a;
            int i12 = this.f67320b;
            return new a(fArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f67319a[this.f67320b]);
            int i10 = this.f67320b;
            while (true) {
                i10++;
                if (i10 >= this.f67321c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f67319a[i10]);
            }
        }

        public a(float[] fArr, int i10, int i11) {
            this.f67319a = fArr;
            this.f67320b = i10;
            this.f67321c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i10) {
            u.checkElementIndex(i10, size());
            return Float.valueOf(this.f67319a[this.f67320b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i10, Float f10) {
            u.checkElementIndex(i10, size());
            float[] fArr = this.f67319a;
            int i11 = this.f67320b + i10;
            float f11 = fArr[i11];
            fArr[i11] = ((Float) u.checkNotNull(f10)).floatValue();
            return Float.valueOf(f11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends h<String, Float> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final b f67322c = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f67322c;
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float d(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }

        @Override // io.odeeo.internal.t0.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String c(Float f10) {
            return f10.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.w0.c$c, reason: collision with other inner class name */
    public enum EnumC0682c implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Float.compare(fArr[i10], fArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    public static List<Float> asList(float... fArr) {
        return fArr.length == 0 ? Collections.EMPTY_LIST : new a(fArr);
    }

    public static int c(float[] fArr, float f10, int i10, int i11) {
        while (i10 < i11) {
            if (fArr[i10] == f10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int compare(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float[] concat(float[]... fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        return fArr3;
    }

    public static float constrainToRange(float f10, float f11, float f12) {
        u.checkArgument(f11 <= f12, "min (%s) must be less than or equal to max (%s)", Float.valueOf(f11), Float.valueOf(f12));
        return Math.min(Math.max(f10, f11), f12);
    }

    public static boolean contains(float[] fArr, float f10) {
        for (float f11 : fArr) {
            if (f11 == f10) {
                return true;
            }
        }
        return false;
    }

    public static int d(float[] fArr, float f10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (fArr[i12] == f10) {
                return i12;
            }
        }
        return -1;
    }

    public static float[] ensureCapacity(float[] fArr, int i10, int i11) {
        u.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        u.checkArgument(i11 >= 0, duhsDlGWdBkekB.nqY, i11);
        return fArr.length < i10 ? Arrays.copyOf(fArr, i10 + i11) : fArr;
    }

    public static int hashCode(float f10) {
        return Float.valueOf(f10).hashCode();
    }

    public static int indexOf(float[] fArr, float f10) {
        return c(fArr, f10, 0, fArr.length);
    }

    public static boolean isFinite(float f10) {
        return Float.NEGATIVE_INFINITY < f10 && f10 < Float.POSITIVE_INFINITY;
    }

    public static String join(String str, float... fArr) {
        u.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(fArr.length * 12);
        sb2.append(fArr[0]);
        for (int i10 = 1; i10 < fArr.length; i10++) {
            sb2.append(str);
            sb2.append(fArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(float[] fArr, float f10) {
        return d(fArr, f10, 0, fArr.length);
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return EnumC0682c.INSTANCE;
    }

    public static float max(float... fArr) {
        u.checkArgument(fArr.length > 0);
        float fMax = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fMax = Math.max(fMax, fArr[i10]);
        }
        return fMax;
    }

    public static float min(float... fArr) {
        u.checkArgument(fArr.length > 0);
        float fMin = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fMin = Math.min(fMin, fArr[i10]);
        }
        return fMin;
    }

    public static void reverse(float[] fArr) {
        u.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void sortDescending(float[] fArr) {
        u.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    public static h<String, Float> stringConverter() {
        return b.f67322c;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = ((Number) u.checkNotNull(array[i10])).floatValue();
        }
        return fArr;
    }

    public static Float tryParse(String str) {
        if (!io.odeeo.internal.w0.b.f67312a.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(float[] r5, float[] r6) {
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
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.w0.c.indexOf(float[], float[]):int");
    }

    public static void reverse(float[] fArr, int i10, int i11) {
        u.checkNotNull(fArr);
        u.checkPositionIndexes(i10, i11, fArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i12];
            fArr[i12] = f10;
            i10++;
        }
    }

    public static void sortDescending(float[] fArr, int i10, int i11) {
        u.checkNotNull(fArr);
        u.checkPositionIndexes(i10, i11, fArr.length);
        Arrays.sort(fArr, i10, i11);
        reverse(fArr, i10, i11);
    }
}
