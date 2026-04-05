package q;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f82112b;

    public h2(j2 j2Var) {
        this.f82112b = j2Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        j2 j2Var = this.f82112b;
        i2 i2Var = j2Var.f82159y;
        Handler handler = j2Var.D;
        c0 c0Var = j2Var.H;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && c0Var != null && c0Var.isShowing() && x10 >= 0 && x10 < c0Var.getWidth() && y10 >= 0 && y10 < c0Var.getHeight()) {
            handler.postDelayed(i2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(i2Var);
        return false;
    }
}
