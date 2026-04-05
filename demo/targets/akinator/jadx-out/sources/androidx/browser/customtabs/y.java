package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f5293c;

    /* renamed from: d, reason: collision with root package name */
    public ActivityOptions f5294d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f5295e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f5296f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f5297g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5300j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f5301k;

    /* renamed from: a, reason: collision with root package name */
    public final Intent f5291a = new Intent("android.intent.action.VIEW");

    /* renamed from: b, reason: collision with root package name */
    public final c f5292b = new c();

    /* renamed from: h, reason: collision with root package name */
    public int f5298h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5299i = true;

    public y() {
    }

    public final void a(IBinder iBinder, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        this.f5291a.putExtras(bundle);
    }

    public y addCustomContentAction(b bVar) {
        if (this.f5301k == null) {
            this.f5301k = new ArrayList();
        }
        Iterator it = this.f5301k.iterator();
        while (it.hasNext()) {
            if (((Bundle) it.next()).getInt("androidx.browser.customtabs.customcontentaction.ID") == bVar.getId()) {
                throw new IllegalArgumentException("CustomContentAction with ID " + bVar.getId() + " already exists.");
            }
        }
        ArrayList arrayList = this.f5301k;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.customtabs.customcontentaction.ID", bVar.f5199a);
        bundle.putString("androidx.browser.customtabs.customcontentaction.LABEL", bVar.f5200b);
        bundle.putParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT", bVar.f5201c);
        bundle.putInt("androidx.browser.customtabs.customcontentaction.TARGET_TYPE", bVar.f5202d);
        arrayList.add(bundle);
        return this;
    }

    @Deprecated
    public y addDefaultShareMenuItem() {
        setShareState(1);
        return this;
    }

    public y addMenuItem(String str, PendingIntent pendingIntent) {
        if (this.f5293c == null) {
            this.f5293c = new ArrayList();
        }
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.f5293c.add(bundle);
        return this;
    }

    @Deprecated
    public y addToolbarItem(int i10, Bitmap bitmap, String str, PendingIntent pendingIntent) throws IllegalStateException {
        if (this.f5295e == null) {
            this.f5295e = new ArrayList();
        }
        if (this.f5295e.size() >= 5) {
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", i10);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.f5295e.add(bundle);
        return this;
    }

    @Deprecated
    public y enableUrlBarHiding() {
        this.f5291a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        return this;
    }

    public y setActionButton(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 0);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        Intent intent = this.f5291a;
        intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
        return this;
    }

    public y setActivitySideSheetBreakpointDp(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", i10);
        return this;
    }

    public y setActivitySideSheetDecorationType(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Invalid value for the decorationType argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", i10);
        return this;
    }

    public y setActivitySideSheetMaximizationEnabled(boolean z10) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", z10);
        return this;
    }

    public y setActivitySideSheetPosition(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", i10);
        return this;
    }

    public y setActivitySideSheetRoundedCornersPosition(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", i10);
        return this;
    }

    public y setBackgroundInteractionEnabled(boolean z10) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", !z10);
        return this;
    }

    public y setBookmarksButtonEnabled(boolean z10) {
        this.f5291a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !z10);
        return this;
    }

    public y setCloseButtonEnabled(boolean z10) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_ENABLED", z10);
        return this;
    }

    public y setCloseButtonIcon(Bitmap bitmap) {
        this.f5291a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
        return this;
    }

    public y setCloseButtonPosition(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
        return this;
    }

    public y setColorScheme(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the colorScheme argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i10);
        return this;
    }

    public y setColorSchemeParams(int i10, d dVar) {
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Invalid colorScheme: "));
        }
        if (this.f5296f == null) {
            this.f5296f = new SparseArray();
        }
        this.f5296f.put(i10, dVar.b());
        return this;
    }

    public y setDefaultColorSchemeParams(d dVar) {
        this.f5297g = dVar.b();
        return this;
    }

    @Deprecated
    public y setDefaultShareMenuItemEnabled(boolean z10) {
        if (z10) {
            setShareState(1);
            return this;
        }
        setShareState(2);
        return this;
    }

    public y setDownloadButtonEnabled(boolean z10) {
        this.f5291a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !z10);
        return this;
    }

    public y setEphemeralBrowsingEnabled(boolean z10) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", z10);
        return this;
    }

    public y setExitAnimations(Context context, int i10, int i11) {
        this.f5291a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", k3.h.makeCustomAnimation(context, i10, i11).toBundle());
        return this;
    }

    public y setInitialActivityHeightPx(int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
        }
        if (i11 < 0 || i11 > 2) {
            throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
        }
        Intent intent = this.f5291a;
        intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
        intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
        return this;
    }

    public y setInitialActivityWidthPx(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i10);
        return this;
    }

    public y setInstantAppsEnabled(boolean z10) {
        this.f5299i = z10;
        return this;
    }

    @Deprecated
    public y setNavigationBarColor(int i10) {
        this.f5292b.setNavigationBarColor(i10);
        return this;
    }

    @Deprecated
    public y setNavigationBarDividerColor(int i10) {
        this.f5292b.setNavigationBarDividerColor(i10);
        return this;
    }

    public y setNetwork(Network network) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.NETWORK", network);
        return this;
    }

    public y setOpenInBrowserButtonState(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the openInBrowserState argument.");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.OPEN_IN_BROWSER_STATE", i10);
        return this;
    }

    public y setPendingSession(j0 j0Var) {
        a(null, j0Var.f5240b);
        return this;
    }

    @Deprecated
    public y setSecondaryToolbarColor(int i10) {
        this.f5292b.setSecondaryToolbarColor(i10);
        return this;
    }

    public y setSecondaryToolbarSwipeUpGesture(PendingIntent pendingIntent) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE", pendingIntent);
        return this;
    }

    public y setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Intent intent = this.f5291a;
        intent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        intent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        intent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        return this;
    }

    public y setSendToExternalDefaultHandlerEnabled(boolean z10) {
        this.f5291a.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", z10);
        return this;
    }

    public y setSession(k0 k0Var) {
        this.f5291a.setPackage(k0Var.f5246d.getPackageName());
        a(k0Var.f5245c.asBinder(), k0Var.f5247e);
        return this;
    }

    public y setShareIdentityEnabled(boolean z10) {
        this.f5300j = z10;
        return this;
    }

    public y setShareState(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.f5298h = i10;
        Intent intent = this.f5291a;
        if (i10 == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }
        if (i10 == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            return this;
        }
        intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        return this;
    }

    public y setShowTitle(boolean z10) {
        this.f5291a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
        return this;
    }

    public y setStartAnimations(Context context, int i10, int i11) {
        this.f5294d = ActivityOptions.makeCustomAnimation(context, i10, i11);
        return this;
    }

    @Deprecated
    public y setToolbarColor(int i10) {
        this.f5292b.setToolbarColor(i10);
        return this;
    }

    public y setToolbarCornerRadiusDp(int i10) {
        if (i10 < 0 || i10 > 16) {
            throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
        }
        this.f5291a.putExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", i10);
        return this;
    }

    public y setTranslateLocale(Locale locale) {
        this.f5291a.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", locale.toLanguageTag());
        return this;
    }

    public y setUrlBarHidingEnabled(boolean z10) {
        this.f5291a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
        return this;
    }

    public z build() {
        Intent intent = this.f5291a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            a(null, null);
        }
        ArrayList<? extends Parcelable> arrayList = this.f5293c;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        ArrayList<? extends Parcelable> arrayList2 = this.f5295e;
        if (arrayList2 != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f5299i);
        intent.putExtras(this.f5292b.build().b());
        Bundle bundle = this.f5297g;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (this.f5296f != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f5296f);
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f5298h);
        ArrayList arrayList3 = this.f5301k;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            intent.putParcelableArrayListExtra(GalEuEfxjome.MbszmfzoVxG, this.f5301k);
        }
        int i10 = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i10 >= 34) {
            if (this.f5294d == null) {
                this.f5294d = ActivityOptions.makeBasic();
            }
            w.j(this.f5294d, this.f5300j);
        }
        if (i10 >= 36) {
            if (this.f5294d == null) {
                this.f5294d = ActivityOptions.makeBasic();
            }
            x.c(this.f5294d, z.isBackgroundInteractionEnabled(intent));
        }
        ActivityOptions activityOptions = this.f5294d;
        return new z(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public y setInitialActivityHeightPx(int i10) {
        return setInitialActivityHeightPx(i10, 0);
    }

    public y(k0 k0Var) {
        if (k0Var != null) {
            setSession(k0Var);
        }
    }

    public y setActionButton(Bitmap bitmap, String str, PendingIntent pendingIntent) {
        return setActionButton(bitmap, str, pendingIntent, false);
    }
}
