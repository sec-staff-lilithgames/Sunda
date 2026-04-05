package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f6467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f6468c;

    public u0(v0 v0Var, e2 e2Var) {
        this.f6468c = v0Var;
        this.f6467b = e2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        e2 e2Var = this.f6467b;
        Fragment fragment = e2Var.f6304c;
        e2Var.j();
        b3.f((ViewGroup) fragment.mView.getParent(), this.f6468c.f6476b).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
