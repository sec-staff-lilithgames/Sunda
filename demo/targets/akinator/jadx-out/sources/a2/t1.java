package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1 f3845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1 f3846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, u1 u1Var) {
        super(1);
        this.f3845e = v1Var;
        this.f3846f = u1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        this.f3845e.getChoreographer().removeFrameCallback(this.f3846f);
    }
}
