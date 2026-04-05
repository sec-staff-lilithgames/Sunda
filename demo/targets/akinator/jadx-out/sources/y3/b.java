package y3;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent, o oVar) {
        accessibilityEvent.appendRecord((AccessibilityRecord) oVar.getImpl());
    }

    @Deprecated
    public static o asRecord(AccessibilityEvent accessibilityEvent) {
        return new o(accessibilityEvent);
    }

    @Deprecated
    public static int getAction(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @Deprecated
    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    public static int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static o getRecord(AccessibilityEvent accessibilityEvent, int i10) {
        return new o(accessibilityEvent.getRecord(i10));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean isAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.browser.customtabs.w.f(accessibilityEvent);
        }
        return false;
    }

    public static void setAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.browser.customtabs.w.i(accessibilityEvent, z10);
        }
    }

    @Deprecated
    public static void setAction(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setAction(i10);
    }

    @Deprecated
    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }

    @Deprecated
    public static void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setMovementGranularity(i10);
    }
}
