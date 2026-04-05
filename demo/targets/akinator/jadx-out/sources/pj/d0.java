package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f81429a;

    public d0(c0 c0Var) {
        this.f81429a = c0Var;
    }

    public static d0 create(c0 c0Var) {
        return new d0(c0Var);
    }

    public static rt.a providesProgramaticContextualTriggerStream(c0 c0Var) {
        return (rt.a) dj.d.checkNotNullFromProvides(c0Var.providesProgramaticContextualTriggerStream());
    }

    @Override // dj.b, dj.e, ru.a
    public rt.a get() {
        return providesProgramaticContextualTriggerStream(this.f81429a);
    }
}
