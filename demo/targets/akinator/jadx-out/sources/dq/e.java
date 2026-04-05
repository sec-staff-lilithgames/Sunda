package dq;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f52464b;

    public e(f fVar) {
        this.f52464b = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        f fVar = this.f52464b;
        d dVar = fVar.f52469d;
        if (fVar.f52473h.compareAndSet(false, true)) {
            cr.q.cancelOnUiThread(dVar);
            cr.q.onUiThread(dVar, 100L);
        }
        return true;
    }
}
