package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c0.z1 z1Var) {
        super(0);
        this.f8380e = z1Var;
    }

    @Override // kv.a
    public final Boolean invoke() {
        c0.z1 z1Var = this.f8380e;
        Object currentState = z1Var.getCurrentState();
        r0 r0Var = r0.f8494c;
        return Boolean.valueOf(currentState == r0Var || z1Var.getTargetState() == r0Var);
    }
}
