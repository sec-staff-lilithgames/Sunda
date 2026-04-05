package f;

import android.window.BackEvent;
import com.unity3d.services.core.request.NJc.yFkbx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f55193a = new a();

    public final BackEvent createOnBackEvent(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    public final float progress(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int swipeEdge(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float touchX(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float touchY(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, yFkbx.RlLpUJQxP);
        return backEvent.getTouchY();
    }
}
