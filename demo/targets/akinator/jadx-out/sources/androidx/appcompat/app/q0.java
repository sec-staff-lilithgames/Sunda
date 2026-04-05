package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q0 extends ContentFrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t0 f4823k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, Context context) {
        super(context);
        this.f4823k = t0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4823k.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                t0 t0Var = this.f4823k;
                t0Var.k(t0Var.r(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(l.a.getDrawable(getContext(), i10));
    }
}
