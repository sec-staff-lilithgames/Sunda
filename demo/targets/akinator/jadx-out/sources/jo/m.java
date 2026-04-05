package jo;

import android.graphics.PointF;
import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface m {
    void onScrollChange(PointF pointF);

    default boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
