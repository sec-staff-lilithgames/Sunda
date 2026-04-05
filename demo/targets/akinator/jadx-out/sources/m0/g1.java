package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var) {
        super(0);
        this.f73716e = h1Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m5508invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5508invoke() {
        h1 h1Var = this.f73716e;
        h1Var.copy$foundation_release();
        h1Var.onRelease();
    }
}
