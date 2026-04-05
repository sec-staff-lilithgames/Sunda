package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public static final n f80339b = new n();

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
            d0.traceEventStart(-1091980426, i10, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda$-1091980426.<anonymous> (Recomposer.kt:423)");
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }
}
