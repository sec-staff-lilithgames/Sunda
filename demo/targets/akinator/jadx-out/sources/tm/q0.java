package tm;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f87122b;

    public q0(s0 s0Var) {
        this.f87122b = s0Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f87122b.f87124b.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action != 0 && action != 1) || view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
