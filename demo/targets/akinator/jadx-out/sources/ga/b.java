package ga;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.digidust.elokence.akinator.graphic.pickerview.lib.WheelView;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final WheelView f57478b;

    public b(WheelView wheelView) {
        this.f57478b = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        WheelView wheelView = this.f57478b;
        wheelView.cancelFuture();
        wheelView.f21773g = wheelView.f21772f.scheduleWithFixedDelay(new a(wheelView, f11), 0L, 5L, TimeUnit.MILLISECONDS);
        return true;
    }
}
