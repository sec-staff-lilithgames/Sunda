package a2;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final void setScrollEventDelta(AccessibilityEvent event, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        event.setScrollDeltaX(i10);
        event.setScrollDeltaY(i11);
    }
}
