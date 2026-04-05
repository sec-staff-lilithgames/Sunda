package dd;

import java.lang.reflect.Array;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public a f51990a = null;

    /* renamed from: b, reason: collision with root package name */
    public b f51991b = null;

    /* renamed from: c, reason: collision with root package name */
    public g f51992c = null;

    /* renamed from: d, reason: collision with root package name */
    public e f51993d = null;

    /* renamed from: e, reason: collision with root package name */
    public f f51994e = null;

    /* renamed from: f, reason: collision with root package name */
    public C0555d f51995f = null;

    /* renamed from: g, reason: collision with root package name */
    public c f51996g = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 {
        @Override // dd.f0
        public final boolean[] _constructArray(int i10) {
            return new boolean[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 {
        @Override // dd.f0
        public final byte[] _constructArray(int i10) {
            return new byte[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 {
        @Override // dd.f0
        public final double[] _constructArray(int i10) {
            return new double[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: dd.d$d, reason: collision with other inner class name */
    public static final class C0555d extends f0 {
        @Override // dd.f0
        public final float[] _constructArray(int i10) {
            return new float[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends f0 {
        @Override // dd.f0
        public final int[] _constructArray(int i10) {
            return new int[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends f0 {
        @Override // dd.f0
        public final long[] _constructArray(int i10) {
            return new long[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends f0 {
        @Override // dd.f0
        public final short[] _constructArray(int i10) {
            return new short[i10];
        }
    }

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t10 : tArr) {
            hashSet.add(t10);
        }
        return hashSet;
    }

    public static Object getArrayComparator(Object obj) {
        return new dd.c(obj.getClass(), Array.getLength(obj), obj);
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t10) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (tArr[i10] == t10) {
                if (i10 == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i10);
                tArr2[0] = t10;
                int i11 = i10 + 1;
                int i12 = length - i11;
                if (i12 > 0) {
                    System.arraycopy(tArr, i11, tArr2, i11, i12);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t10;
        return tArr3;
    }

    public a getBooleanBuilder() {
        if (this.f51990a == null) {
            this.f51990a = new a();
        }
        return this.f51990a;
    }

    public b getByteBuilder() {
        if (this.f51991b == null) {
            this.f51991b = new b();
        }
        return this.f51991b;
    }

    public c getDoubleBuilder() {
        if (this.f51996g == null) {
            this.f51996g = new c();
        }
        return this.f51996g;
    }

    public C0555d getFloatBuilder() {
        if (this.f51995f == null) {
            this.f51995f = new C0555d();
        }
        return this.f51995f;
    }

    public e getIntBuilder() {
        if (this.f51993d == null) {
            this.f51993d = new e();
        }
        return this.f51993d;
    }

    public f getLongBuilder() {
        if (this.f51994e == null) {
            this.f51994e = new f();
        }
        return this.f51994e;
    }

    public g getShortBuilder() {
        if (this.f51992c == null) {
            this.f51992c = new g();
        }
        return this.f51992c;
    }
}
