package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f80293a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c2 f80294b = new c2();

    public static final e0 Composition(d dVar, f0 f0Var) {
        return new j0(f0Var, dVar, null, 4, null);
    }

    public static final y0 ControlledComposition(d dVar, f0 f0Var) {
        return new j0(f0Var, dVar, null, 4, null);
    }

    public static final m4 ReusableComposition(d dVar, f0 f0Var) {
        return new j0(f0Var, dVar, null, 4, null);
    }

    public static final <T> T getCompositionService(e0 e0Var, t0 t0Var) {
        u0 u0Var = e0Var instanceof u0 ? (u0) e0Var : null;
        if (u0Var != null) {
            return (T) u0Var.getCompositionService(t0Var);
        }
        return null;
    }

    public static final t0 getObservableCompositionServiceKey() {
        return f80294b;
    }

    public static final zu.m getRecomposeCoroutineContext(y0 y0Var) {
        zu.m recomposeContext;
        j0 j0Var = y0Var instanceof j0 ? (j0) y0Var : null;
        return (j0Var == null || (recomposeContext = j0Var.getRecomposeContext()) == null) ? zu.n.f98854b : recomposeContext;
    }

    public static final <R> R pausable(y0 y0Var, p4 p4Var, kv.a aVar) {
        y0Var.getAndSetShouldPauseCallback(p4Var);
        try {
            return (R) aVar.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            y0Var.getAndSetShouldPauseCallback(null);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final e0 Composition(d dVar, f0 f0Var, zu.m mVar) {
        return new j0(f0Var, dVar, mVar);
    }

    public static final y0 ControlledComposition(d dVar, f0 f0Var, zu.m mVar) {
        return new j0(f0Var, dVar, mVar);
    }

    public static /* synthetic */ void getObservableCompositionServiceKey$annotations() {
    }

    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(y0 y0Var) {
    }
}
