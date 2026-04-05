package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f5302a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f5303b;

    public z(Intent intent, Bundle bundle) {
        this.f5302a = intent;
        this.f5303b = bundle;
    }

    public static int getActivityResizeBehavior(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
    }

    public static int getActivitySideSheetBreakpointDp(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", 0);
    }

    public static int getActivitySideSheetDecorationType(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", 0);
    }

    public static int getActivitySideSheetPosition(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", 0);
    }

    public static int getCloseButtonPosition(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", 0);
    }

    public static d getColorSchemeParams(Intent intent, int i10) {
        Bundle bundle;
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Invalid colorScheme: "));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return d.a(null);
        }
        d dVarA = d.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i10)) == null) {
            return dVarA;
        }
        d dVarA2 = d.a(bundle);
        Integer num = dVarA2.f5208a;
        if (num == null) {
            num = dVarA.f5208a;
        }
        Integer num2 = dVarA2.f5209b;
        if (num2 == null) {
            num2 = dVarA.f5209b;
        }
        Integer num3 = dVarA2.f5210c;
        if (num3 == null) {
            num3 = dVarA.f5210c;
        }
        Integer num4 = dVarA2.f5211d;
        if (num4 == null) {
            num4 = dVarA.f5211d;
        }
        return new d(num, num2, num3, num4);
    }

    public static List<b> getCustomContentActions(Intent intent) {
        ArrayList parcelableArrayListExtra = m3.d.getParcelableArrayListExtra(intent, "androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", Bundle.class);
        if (parcelableArrayListExtra == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(parcelableArrayListExtra.size());
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            b bVarA = b.a((Bundle) it.next());
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int getInitialActivityHeightPx(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", 0);
    }

    public static int getInitialActivityWidthPx(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", 0);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public static Network getNetwork(Intent intent) {
        return (Network) m3.d.getParcelableExtra(intent, "androidx.browser.customtabs.extra.NETWORK", Network.class);
    }

    public static int getOpenInBrowserButtonState(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.OPEN_IN_BROWSER_STATE", 0);
    }

    public static PendingIntent getSecondaryToolbarSwipeUpGesture(Intent intent) {
        return (PendingIntent) intent.getParcelableExtra("androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE");
    }

    public static int getToolbarCornerRadiusDp(Intent intent) {
        return intent.getIntExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", 16);
    }

    public static Locale getTranslateLocale(Intent intent) {
        String stringExtra = intent.getStringExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG");
        if (stringExtra != null) {
            return Locale.forLanguageTag(stringExtra);
        }
        return null;
    }

    public static boolean isActivitySideSheetMaximizationEnabled(Intent intent) {
        return intent.getBooleanExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", false);
    }

    public static boolean isBackgroundInteractionEnabled(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public static boolean isBookmarksButtonEnabled(Intent intent) {
        return !intent.getBooleanExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", false);
    }

    public static boolean isCloseButtonEnabled(Intent intent) {
        return intent.getBooleanExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_ENABLED", true);
    }

    public static boolean isDownloadButtonEnabled(Intent intent) {
        return !intent.getBooleanExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", false);
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(Intent intent) {
        return intent.getBooleanExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", false);
    }

    public static Intent setAlwaysUseBrowserUI(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(Intent intent) {
        return intent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) && (intent.getFlags() & 268435456) != 0;
    }

    public boolean isEphemeralBrowsingEnabled() {
        return this.f5302a.getBooleanExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", false);
    }

    public void launchUrl(Context context, Uri uri) {
        Intent intent = this.f5302a;
        intent.setData(uri);
        m3.a.startActivity(context, intent, this.f5303b);
    }
}
