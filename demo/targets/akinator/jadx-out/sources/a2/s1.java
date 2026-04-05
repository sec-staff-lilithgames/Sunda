package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f3793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1 f3794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(p1 p1Var, u1 u1Var) {
        super(1);
        this.f3793e = p1Var;
        this.f3794f = u1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        this.f3793e.removeFrameCallback$ui_release(this.f3794f);
    }
}
