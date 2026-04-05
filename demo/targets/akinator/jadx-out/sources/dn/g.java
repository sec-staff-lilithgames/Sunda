package dn;

import android.view.ViewTreeObserver;
import nm.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f52395b;

    public g(h hVar) {
        this.f52395b = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        h hVar = this.f52395b;
        e eVar = hVar.f52400e;
        if (hVar.f52404i.compareAndSet(false, true)) {
            j.cancelUiThreadTask(eVar);
            j.onUiThread(eVar, 100L);
        }
        return true;
    }
}
