package a2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3418b;

    public a0(t tVar) {
        this.f3418b = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar = this.f3418b;
        tVar.removeCallbacks(this);
        MotionEvent motionEvent = tVar.f3812g0;
        if (motionEvent != null) {
            boolean z10 = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (z10) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i10 = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i10 = 2;
            }
            t tVar2 = this.f3418b;
            tVar2.m(motionEvent, i10, tVar2.f3814h0, false);
        }
    }
}
