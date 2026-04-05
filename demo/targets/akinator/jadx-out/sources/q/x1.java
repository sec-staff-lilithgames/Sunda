package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f82296b;

    public x1(y1 y1Var) {
        this.f82296b = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        y1 y1Var = this.f82296b;
        y1Var.a();
        View view = y1Var.f82308f;
        if (view.isEnabled() && !view.isLongClickable() && y1Var.onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            y1Var.f82311i = true;
        }
    }
}
