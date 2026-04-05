package tm;

import android.view.View;
import tm.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0.a f87153b;

    public y0(z0.a aVar) {
        this.f87153b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        z0.a aVar = this.f87153b;
        for (View view : aVar.f87161a) {
            if (view.getHeight() > 0 || view.getWidth() > 0) {
                int i10 = aVar.f87164d - 1;
                aVar.f87164d = i10;
                if (i10 == 0 && (runnable = aVar.f87163c) != null) {
                    runnable.run();
                    aVar.f87163c = null;
                }
            } else {
                view.getViewTreeObserver().addOnPreDrawListener(new x0(this, view));
            }
        }
    }
}
