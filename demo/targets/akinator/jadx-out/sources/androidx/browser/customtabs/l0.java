package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f5251c;

    public l0(n0 n0Var) {
        this.f5251c = n0Var;
    }

    @Override // androidx.browser.customtabs.e
    public void extraCallback(String str, Bundle bundle) {
        try {
            this.f5251c.f5257a.extraCallback(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        try {
            return this.f5251c.f5257a.extraCallbackWithResult(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            return null;
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        try {
            this.f5251c.f5257a.onActivityLayout(i10, i11, i12, i13, i14, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onActivityResized(int i10, int i11, Bundle bundle) {
        try {
            this.f5251c.f5257a.onActivityResized(i10, i11, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onMessageChannelReady(Bundle bundle) {
        try {
            this.f5251c.f5257a.onMessageChannelReady(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onMinimized(Bundle bundle) {
        try {
            this.f5251c.f5257a.onMinimized(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onNavigationEvent(int i10, Bundle bundle) {
        try {
            this.f5251c.f5257a.onNavigationEvent(i10, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onPostMessage(String str, Bundle bundle) {
        try {
            this.f5251c.f5257a.onPostMessage(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        try {
            this.f5251c.f5257a.onRelationshipValidationResult(i10, uri, z10, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onUnminimized(Bundle bundle) {
        try {
            this.f5251c.f5257a.onUnminimized(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onWarmupCompleted(Bundle bundle) {
        try {
            this.f5251c.f5257a.onWarmupCompleted(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }
}
