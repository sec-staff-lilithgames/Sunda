package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f11387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f11388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.l f11389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w0 f11390h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, p pVar, kv.l lVar, kotlin.jvm.internal.w0 w0Var) {
        super(1);
        this.f11387e = eVar;
        this.f11388f = pVar;
        this.f11389g = lVar;
        this.f11390h = w0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((m) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(m animate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animate, "$this$animate");
        e eVar = this.f11387e;
        x1.updateState(animate, eVar.getInternalState$animation_core_release());
        Object objA = eVar.a(animate.getValue());
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(objA, animate.getValue());
        kv.l lVar = this.f11389g;
        if (zAreEqual) {
            if (lVar != null) {
                lVar.invoke(eVar);
            }
        } else {
            eVar.getInternalState$animation_core_release().setValue$animation_core_release(objA);
            this.f11388f.setValue$animation_core_release(objA);
            if (lVar != null) {
                lVar.invoke(eVar);
            }
            animate.cancelAnimation();
            this.f11390h.f71863b = true;
        }
    }
}
