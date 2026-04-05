package vm;

import android.view.MotionEvent;
import android.view.View;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89315b;

    public k(VastView vastView) {
        this.f89315b = vastView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && action != 1) {
            return false;
        }
        this.f89315b.P.add(view);
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
