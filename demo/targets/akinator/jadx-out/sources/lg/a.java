package lg;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final Dialog f73371b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73372c;

    /* renamed from: e, reason: collision with root package name */
    public final int f73373e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73374f;

    public a(Dialog dialog, Rect rect) {
        this.f73371b = dialog;
        this.f73372c = rect.left;
        this.f73373e = rect.top;
        this.f73374f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f73372c;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f73373e, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f73374f;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f73371b.onTouchEvent(motionEventObtain);
    }
}
