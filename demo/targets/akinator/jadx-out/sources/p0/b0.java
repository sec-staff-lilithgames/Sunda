package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f80148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80149c;

    public b0(f2 f2Var, Object obj) {
        this.f80148b = f2Var;
        this.f80149c = obj;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(w wVar, int i10) {
        if (!wVar.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            wVar.skipToGroupEnd();
            return;
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
        }
        this.f80148b.getContent().invoke(this.f80149c, wVar, 0);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }
}
