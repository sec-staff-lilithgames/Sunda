package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f75099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f75100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75101g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r1 r1Var, kv.p pVar, int i10) {
        super(2);
        this.f75099e = r1Var;
        this.f75100f = pVar;
        this.f75101g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        n1.ProvideTextStyle(this.f75099e.getBody1(), z0.u.composableLambda(wVar, 181426554, true, new j0(this.f75101g, this.f75100f)), wVar, 48);
    }
}
