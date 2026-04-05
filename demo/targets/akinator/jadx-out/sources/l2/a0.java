package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f72243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 g0Var) {
        super(1);
        this.f72243e = g0Var;
    }

    @Override // kv.l
    public final Object invoke(u1 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        u1 u1VarM5463copye1PVR60$default = u1.m5463copye1PVR60$default(it, null, null, 0, 0, null, 30, null);
        g0 g0Var = this.f72243e;
        return g0Var.f72290c.runCached(u1VarM5463copye1PVR60$default, new f0(g0Var, u1VarM5463copye1PVR60$default)).getValue();
    }
}
