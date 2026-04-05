package a2;

import android.view.View;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a6 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0.n3 f3447c;

    public a6(View view, p0.n3 n3Var) {
        this.f3446b = view;
        this.f3447c = n3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, VPCjETNfjxu.UsxiQIAcPUVQ);
        this.f3446b.removeOnAttachStateChangeListener(this);
        this.f3447c.cancel();
    }
}
