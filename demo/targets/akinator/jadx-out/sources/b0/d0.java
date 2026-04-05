package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f8348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1 f8349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f8350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, t1 t1Var, v1 v1Var, String str) {
        super(3);
        this.f8348e = c0Var;
        this.f8349f = t1Var;
        this.f8350g = v1Var;
        this.f8351h = str;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1840112047);
        e1.v vVarThen = composed.then(u0.createModifier(this.f8348e.getTransition(), this.f8349f, this.f8350g, this.f8351h, wVar, 0));
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
