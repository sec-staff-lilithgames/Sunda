package u2;

import android.view.View;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f87724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var) {
        super(0);
        this.f87724e = g0Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m7401invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7401invoke() {
        g0 g0Var = this.f87724e;
        View typedView$ui_release = g0Var.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            g0Var.getUpdateBlock().invoke(typedView$ui_release);
        }
    }
}
