package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.d f56405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f56406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(e1.d dVar, boolean z10) {
        super(1);
        this.f56405e = dVar;
        this.f56406f = z10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a2.w3) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(a2.w3 w3Var) {
        a.b.b(w3Var, "$this$$receiver", "wrapContentSize").set("align", this.f56405e);
        w3Var.getProperties().set("unbounded", Boolean.valueOf(this.f56406f));
    }
}
