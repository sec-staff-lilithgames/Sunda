package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e5 implements f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final e5 f3537a = new e5();

    @Override // a2.f5
    public kv.a installFor(b view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        c5 c5Var = new c5(view);
        view.addOnAttachStateChangeListener(c5Var);
        d5 d5Var = new d5(view);
        g4.a.addPoolingContainerListener(view, d5Var);
        return new b5(view, c5Var, d5Var);
    }
}
