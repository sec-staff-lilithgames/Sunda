package a2;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c5 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3484b;

    public c5(b bVar) {
        this.f3484b = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        b bVar = this.f3484b;
        if (g4.a.isWithinPoolingContainer(bVar)) {
            return;
        }
        bVar.disposeComposition();
    }
}
