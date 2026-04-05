package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a4 extends wt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10068b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10069c;

    /* renamed from: e, reason: collision with root package name */
    public int f10070e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10071f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10072g;

    public a4(mt.i0 i0Var, Object[] objArr) {
        this.f10068b = i0Var;
        this.f10069c = objArr;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public void clear() {
        this.f10070e = this.f10069c.length;
    }

    @Override // wt.c, vt.j, pt.c
    public void dispose() {
        this.f10072g = true;
    }

    @Override // wt.c, vt.j, pt.c
    public boolean isDisposed() {
        return this.f10072g;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f10070e == this.f10069c.length;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public Object poll() {
        int i10 = this.f10070e;
        Object[] objArr = this.f10069c;
        if (i10 == objArr.length) {
            return null;
        }
        this.f10070e = i10 + 1;
        return ut.o0.requireNonNull(objArr[i10], "The array element is null");
    }

    @Override // wt.c, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 1) == 0) {
            return 0;
        }
        this.f10071f = true;
        return 1;
    }
}
