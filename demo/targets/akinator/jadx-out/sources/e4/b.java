package e4;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f53716b;

    public b(c cVar) {
        this.f53716b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f53716b;
        View view = cVar.f53720e;
        a aVar = cVar.f53718b;
        if (cVar.f53732q) {
            if (cVar.f53730o) {
                cVar.f53730o = false;
                aVar.start();
            }
            if (aVar.isFinished() || !cVar.d()) {
                cVar.f53732q = false;
                return;
            }
            if (cVar.f53731p) {
                cVar.f53731p = false;
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            aVar.computeScrollDelta();
            cVar.scrollTargetBy(aVar.getDeltaX(), aVar.getDeltaY());
            z1.postOnAnimation(view, this);
        }
    }
}
