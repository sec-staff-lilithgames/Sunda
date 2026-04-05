package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends r5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f80165a;

    public c(int i10) {
        super(null);
        this.f80165a = i10;
    }

    public final int getGroup() {
        return this.f80165a;
    }

    @Override // p0.r5
    public Object getIdentity(s4 s4Var) {
        return s4Var.anchor(this.f80165a);
    }
}
