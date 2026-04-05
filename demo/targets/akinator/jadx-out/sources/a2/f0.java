package a2;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f3551b;

    public f0(i0 i0Var) {
        this.f3551b = i0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        i0 i0Var = this.f3551b;
        i0Var.f3622h.removeCallbacks(i0Var.f3638x);
    }
}
