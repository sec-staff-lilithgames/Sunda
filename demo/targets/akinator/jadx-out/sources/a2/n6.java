package a2;

import a2.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n6 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6 f3738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f3739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, kv.p pVar) {
        super(1);
        this.f3738e = o6Var;
        this.f3739f = pVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((t.b) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(t.b it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        o6 o6Var = this.f3738e;
        if (o6Var.f3747e) {
            return;
        }
        androidx.lifecycle.k0 lifecycle = it.getLifecycleOwner().getLifecycle();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lifecycle, "it.lifecycleOwner.lifecycle");
        kv.p pVar = this.f3739f;
        o6Var.f3749g = pVar;
        if (o6Var.f3748f == null) {
            o6Var.f3748f = lifecycle;
            lifecycle.addObserver(o6Var);
        } else if (lifecycle.getCurrentState().isAtLeast(androidx.lifecycle.j0.f6616e)) {
            o6Var.getOriginal().setContent(z0.u.composableLambdaInstance(-2000640158, true, new m6(o6Var, pVar)));
        }
    }
}
