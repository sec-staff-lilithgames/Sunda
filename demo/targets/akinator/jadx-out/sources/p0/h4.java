package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h4 extends r5 {

    /* renamed from: a, reason: collision with root package name */
    public final r5 f80242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80243b;

    public h4(r5 r5Var, int i10) {
        super(null);
        this.f80242a = r5Var;
        this.f80243b = i10;
    }

    @Override // p0.r5
    public Object getIdentity(s4 s4Var) {
        return new t5(this.f80242a.getIdentity(s4Var), this.f80243b);
    }

    public final int getIndex() {
        return this.f80243b;
    }

    public final r5 getParent() {
        return this.f80242a;
    }
}
