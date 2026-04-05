package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e {
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        return null;
    }

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void onMinimized(Bundle bundle) {
    }

    public void onUnminimized(Bundle bundle) {
    }

    public void onWarmupCompleted(Bundle bundle) {
    }

    public void extraCallback(String str, Bundle bundle) {
    }

    public void onNavigationEvent(int i10, Bundle bundle) {
    }

    public void onPostMessage(String str, Bundle bundle) {
    }

    public void onActivityResized(int i10, int i11, Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
    }

    public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
    }
}
