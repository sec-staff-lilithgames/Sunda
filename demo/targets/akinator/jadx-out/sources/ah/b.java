package ah;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b {
    public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
        swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
        swipeDismissBehavior.setSwipeDirection(0);
    }

    public boolean canSwipeDismissView(View view) {
        return view instanceof d;
    }

    public void onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (j.f4427d == null) {
                    j.f4427d = new j();
                }
                j.f4427d.pauseTimeout(null);
                return;
            }
            return;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            if (j.f4427d == null) {
                j.f4427d = new j();
            }
            j.f4427d.restoreTimeoutIfPaused(null);
        }
    }

    public void setBaseTransientBottomBar(e eVar) {
        throw null;
    }
}
