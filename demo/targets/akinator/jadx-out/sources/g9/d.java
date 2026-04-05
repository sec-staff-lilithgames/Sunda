package g9;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f57446b;

    public d(g gVar) {
        this.f57446b = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        f9.e request = this.f57446b.getRequest();
        if (request == null || !request.isCleared()) {
            return;
        }
        request.begin();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        g gVar = this.f57446b;
        f9.e request = gVar.getRequest();
        if (request != null) {
            gVar.f57456f = true;
            request.clear();
            gVar.f57456f = false;
        }
    }
}
