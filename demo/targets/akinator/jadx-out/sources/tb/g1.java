package tb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g1 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final Class f86717b;

    public g1(Class cls) {
        this.f86717b = cls;
    }

    @Override // tb.f1
    public boolean canUseFor(f1 f1Var) {
        return f1Var.getClass() == getClass() && f1Var.getScope() == this.f86717b;
    }

    @Override // tb.f1
    public abstract Object generateId(Object obj);

    @Override // tb.f1
    public Class<?> getScope() {
        return this.f86717b;
    }
}
