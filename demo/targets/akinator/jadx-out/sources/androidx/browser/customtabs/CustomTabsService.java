package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.List;
import java.util.NoSuchElementException;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_AUTH_TAB = "androidx.browser.auth.category.AuthTab";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_EPHEMERAL_BROWSING = "androidx.browser.customtabs.category.EphemeralBrowsing";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_SET_NETWORK = "androidx.browser.customtabs.category.SetNetwork";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final t1 mDeathRecipientMap = new t1();
    private b.j mBinder = new b0(this);

    public boolean cleanUpSession(n0 n0Var) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    b.h hVar = n0Var.f5257a;
                    IBinder iBinderAsBinder = hVar == null ? null : hVar.asBinder();
                    if (iBinderAsBinder == null) {
                        return false;
                    }
                    iBinderAsBinder.unlinkToDeath((IBinder.DeathRecipient) this.mDeathRecipientMap.get(iBinderAsBinder), 0);
                    this.mDeathRecipientMap.remove(iBinderAsBinder);
                    return true;
                } finally {
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle extraCommand(String str, Bundle bundle);

    public boolean isEngagementSignalsApiAvailable(n0 n0Var, Bundle bundle) {
        return false;
    }

    public abstract boolean mayLaunchUrl(n0 n0Var, Uri uri, Bundle bundle, List<Bundle> list);

    public abstract boolean newSession(n0 n0Var);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(n0 n0Var, String str, Bundle bundle);

    public void prefetch(n0 n0Var, Uri uri, r0 r0Var) {
    }

    public abstract boolean receiveFile(n0 n0Var, Uri uri, int i10, Bundle bundle);

    public boolean registerAuthTabSession(u.d dVar) {
        return false;
    }

    public abstract boolean requestPostMessageChannel(n0 n0Var, Uri uri);

    public boolean requestPostMessageChannel(n0 n0Var, Uri uri, Uri uri2, Bundle bundle) {
        return requestPostMessageChannel(n0Var, uri);
    }

    public boolean setEngagementSignalsCallback(n0 n0Var, o0 o0Var, Bundle bundle) {
        return false;
    }

    public abstract boolean updateVisuals(n0 n0Var, Bundle bundle);

    public abstract boolean validateRelationship(n0 n0Var, int i10, Uri uri, Bundle bundle);

    public abstract boolean warmup(long j10);

    public void prefetch(n0 n0Var, List<Uri> list, r0 r0Var) {
    }

    public boolean cleanUpSession(u.d dVar) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder callbackBinder = dVar.getCallbackBinder();
                    if (callbackBinder == null) {
                        return false;
                    }
                    callbackBinder.unlinkToDeath((IBinder.DeathRecipient) this.mDeathRecipientMap.get(callbackBinder), 0);
                    this.mDeathRecipientMap.remove(callbackBinder);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }
}
