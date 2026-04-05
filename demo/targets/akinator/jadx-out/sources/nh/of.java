package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class of extends l6 {

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f76539j;

    /* renamed from: k, reason: collision with root package name */
    public static final of f76540k;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f76541e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f76542f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f76543g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f76544h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f76545i;

    static {
        Object[] objArr = new Object[0];
        f76539j = objArr;
        f76540k = new of(objArr, 0, objArr, 0, 0);
    }

    public of(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f76541e = objArr;
        this.f76542f = i10;
        this.f76543g = objArr2;
        this.f76544h = i11;
        this.f76545i = i12;
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        Object[] objArr2 = this.f76541e;
        int i11 = this.f76545i;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // nh.u4
    public final Object[] c() {
        return this.f76541e;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f76543g;
            if (objArr.length != 0) {
                int iG = kotlin.jvm.internal.d0.G(obj);
                while (true) {
                    int i10 = iG & this.f76544h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iG = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // nh.u4
    public final int d() {
        return this.f76545i;
    }

    @Override // nh.u4
    public final int e() {
        return 0;
    }

    @Override // nh.l6
    public final b5 h() {
        return b5.f(this.f76545i, this.f76541e);
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f76542f;
    }

    @Override // nh.l6
    public final boolean i() {
        return true;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76545i;
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return asList().iterator();
    }
}
