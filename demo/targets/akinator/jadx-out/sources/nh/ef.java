package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ef extends r4 {

    /* renamed from: m, reason: collision with root package name */
    public static final ef f76224m = new ef();

    /* renamed from: h, reason: collision with root package name */
    public final transient Object f76225h;

    /* renamed from: i, reason: collision with root package name */
    public final transient Object[] f76226i;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f76227j;

    /* renamed from: k, reason: collision with root package name */
    public final transient int f76228k;

    /* renamed from: l, reason: collision with root package name */
    public final transient ef f76229l;

    public ef() {
        this.f76225h = null;
        this.f76226i = new Object[0];
        this.f76227j = 0;
        this.f76228k = 0;
        this.f76229l = this;
    }

    @Override // nh.m5
    public final l6 a() {
        return new hf(this, this.f76226i, this.f76227j, this.f76228k);
    }

    @Override // nh.m5
    public final l6 b() {
        return new jf(this, new kf(this.f76226i, this.f76227j, this.f76228k));
    }

    @Override // nh.m5
    public final boolean f() {
        return false;
    }

    @Override // nh.m5, java.util.Map
    public Object get(Object obj) {
        Object objJ = lf.j(this.f76226i, this.f76228k, this.f76227j, this.f76225h, obj);
        if (objJ == null) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.Map
    public int size() {
        return this.f76228k;
    }

    @Override // nh.r4, nh.q0
    public r4 inverse() {
        return this.f76229l;
    }

    public ef(Object obj, Object[] objArr, int i10, ef efVar) {
        this.f76225h = obj;
        this.f76226i = objArr;
        this.f76227j = 1;
        this.f76228k = i10;
        this.f76229l = efVar;
    }

    public ef(Object[] objArr, int i10) {
        this.f76226i = objArr;
        this.f76228k = i10;
        this.f76227j = 0;
        int iF = i10 >= 2 ? l6.f(i10) : 0;
        Object objI = lf.i(objArr, i10, iF, 0);
        if (!(objI instanceof Object[])) {
            this.f76225h = objI;
            Object objI2 = lf.i(objArr, i10, iF, 1);
            if (!(objI2 instanceof Object[])) {
                this.f76229l = new ef(objI2, objArr, i10, this);
                return;
            }
            throw ((f5) ((Object[]) objI2)[2]).a();
        }
        throw ((f5) ((Object[]) objI)[2]).a();
    }
}
