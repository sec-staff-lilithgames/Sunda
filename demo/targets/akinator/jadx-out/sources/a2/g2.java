package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h2 f3588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, int i10) {
        super(2);
        this.f3588e = h2Var;
        this.f3589f = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        this.f3588e.Content(wVar, this.f3589f | 1);
    }
}
