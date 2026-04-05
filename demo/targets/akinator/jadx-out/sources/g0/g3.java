package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.b f56433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f56434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(e1.b bVar, boolean z10) {
        super(1);
        this.f56433e = bVar;
        this.f56434f = z10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a2.w3) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(a2.w3 w3Var) {
        a.b.b(w3Var, "$this$$receiver", "wrapContentWidth").set("align", this.f56433e);
        w3Var.getProperties().set("unbounded", Boolean.valueOf(this.f56434f));
    }
}
