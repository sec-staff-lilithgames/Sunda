package g9;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f57461b;

    public o(r rVar) {
        this.f57461b = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        f9.e request = this.f57461b.getRequest();
        if (request == null || !request.isCleared()) {
            return;
        }
        request.begin();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        r rVar = this.f57461b;
        f9.e request = rVar.getRequest();
        if (request != null) {
            rVar.f57473g = true;
            request.clear();
            rVar.f57473g = false;
        }
    }
}
