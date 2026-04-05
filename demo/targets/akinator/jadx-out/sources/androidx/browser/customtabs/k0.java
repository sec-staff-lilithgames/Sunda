package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5243a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final b.l f5244b;

    /* renamed from: c, reason: collision with root package name */
    public final b.f f5245c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f5246d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f5247e;

    public k0(b.l lVar, b.f fVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f5244b = lVar;
        this.f5245c = fVar;
        this.f5246d = componentName;
        this.f5247e = pendingIntent;
    }

    public static k0 createMockSessionForTesting(ComponentName componentName) {
        return new k0(new i0(), new m0(), componentName, null);
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f5247e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public boolean isEngagementSignalsApiAvailable(Bundle bundle) throws RemoteException {
        try {
            return this.f5244b.isEngagementSignalsApiAvailable(this.f5245c, b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f5244b.mayLaunchUrl(this.f5245c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(String str, Bundle bundle) {
        int iPostMessage;
        Bundle bundleB = b(bundle);
        synchronized (this.f5243a) {
            try {
                try {
                    iPostMessage = this.f5244b.postMessage(this.f5245c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iPostMessage;
    }

    public void prefetch(Uri uri, r0 r0Var) {
        r0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN", r0Var.f5275a);
        Uri uri2 = r0Var.f5276b;
        if (uri2 != null) {
            bundle.putParcelable(NyKZx.FNOyQar, uri2);
        }
        try {
            this.f5244b.prefetch(this.f5245c, uri, b(bundle));
        } catch (RemoteException unused) {
        }
    }

    public boolean receiveFile(Uri uri, int i10, Bundle bundle) {
        try {
            return this.f5244b.receiveFile(this.f5245c, uri, i10, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean setActionButton(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        a(bundle);
        try {
            return this.f5244b.updateVisuals(this.f5245c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(o0 o0Var, Bundle bundle) throws RemoteException {
        try {
            return this.f5244b.setEngagementSignalsCallback(this.f5245c, new g0(o0Var).asBinder(), b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE", pendingIntent);
        a(bundle);
        try {
            return this.f5244b.updateVisuals(this.f5245c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        a(bundle);
        try {
            return this.f5244b.updateVisuals(this.f5245c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i10, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", i10);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        a(bundle2);
        try {
            return this.f5244b.updateVisuals(this.f5245c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i10, Uri uri, Bundle bundle) {
        if (i10 < 1 || i10 > 2) {
            return false;
        }
        try {
            return this.f5244b.validateRelationship(this.f5245c, i10, uri, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            if (uri2 != null) {
                bundle2.putParcelable("target_origin", uri2);
            }
            if (this.f5247e != null) {
                a(bundle2);
            }
            if (bundle2.isEmpty()) {
                bundle2 = null;
            }
            b.f fVar = this.f5245c;
            b.l lVar = this.f5244b;
            if (bundle2 == null) {
                return lVar.requestPostMessageChannel(fVar, uri);
            }
            bundle.putAll(bundle2);
            return lVar.requestPostMessageChannelWithExtras(fVar, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(Executor executor, o0 o0Var, Bundle bundle) throws RemoteException {
        try {
            return this.f5244b.setEngagementSignalsCallback(this.f5245c, new h0(executor, o0Var).asBinder(), b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public void prefetch(List<Uri> list, r0 r0Var) {
        r0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN", r0Var.f5275a);
        Uri uri = r0Var.f5276b;
        if (uri != null) {
            bundle.putParcelable("androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN", uri);
        }
        try {
            this.f5244b.prefetchWithMultipleUrls(this.f5245c, list, b(bundle));
        } catch (RemoteException unused) {
        }
    }
}
