package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.q f51293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(boolean z10, f0.q qVar) {
        super(3);
        this.f51292e = z10;
        this.f51293f = qVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-618949501);
        e1.v vVarFocusable = n1.focusable(h1.k0.focusProperties(e1.t.f53496b, new z1((q1.c) wVar.consume(a2.a3.getLocalInputModeManager()))), this.f51292e, this.f51293f);
        wVar.endReplaceableGroup();
        return vVarFocusable;
    }
}
