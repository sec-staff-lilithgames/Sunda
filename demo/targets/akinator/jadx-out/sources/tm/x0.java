package tm;

import android.view.View;
import android.view.ViewTreeObserver;
import tm.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f87148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f87149c;

    public x0(y0 y0Var, View view) {
        this.f87149c = y0Var;
        this.f87148b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        Runnable runnable;
        this.f87148b.getViewTreeObserver().removeOnPreDrawListener(this);
        z0.a aVar = this.f87149c.f87153b;
        int i10 = aVar.f87164d - 1;
        aVar.f87164d = i10;
        if (i10 == 0 && (runnable = aVar.f87163c) != null) {
            runnable.run();
            aVar.f87163c = null;
        }
        return true;
    }
}
