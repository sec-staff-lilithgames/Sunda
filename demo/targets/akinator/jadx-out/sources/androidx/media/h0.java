package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6827a;

    public h0(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f6827a = mediaBrowserServiceCompat;
    }

    public void addSubscription(String str, IBinder iBinder, Bundle bundle, i0 i0Var) {
        this.f6827a.f6777h.postOrRun(new a0(this, i0Var, str, iBinder, bundle));
    }

    public void connect(String str, int i10, int i11, Bundle bundle, i0 i0Var) {
        if (str != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6827a;
            String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i11);
            int length = packagesForUid.length;
            int i12 = 0;
            while (i12 < length) {
                if (packagesForUid[i12].equals(str)) {
                    mediaBrowserServiceCompat.f6777h.postOrRun(new y(i10, i11, bundle, this, i0Var, str));
                    return;
                } else {
                    i12++;
                    i10 = i10;
                    str = str;
                }
            }
        }
        throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + str);
    }

    public void disconnect(i0 i0Var) {
        this.f6827a.f6777h.postOrRun(new z(this, i0Var));
    }

    public void getMediaItem(String str, ResultReceiver resultReceiver, i0 i0Var) {
        if (TextUtils.isEmpty(str) || resultReceiver == null) {
            return;
        }
        this.f6827a.f6777h.postOrRun(new c0(this, i0Var, str, resultReceiver));
    }

    public void registerCallbacks(i0 i0Var, String str, int i10, int i11, Bundle bundle) {
        this.f6827a.f6777h.postOrRun(new d0(i11, i10, bundle, this, i0Var, str));
    }

    public void removeSubscription(String str, IBinder iBinder, i0 i0Var) {
        this.f6827a.f6777h.postOrRun(new b0(this, i0Var, str, iBinder));
    }

    public void search(String str, Bundle bundle, ResultReceiver resultReceiver, i0 i0Var) {
        if (TextUtils.isEmpty(str) || resultReceiver == null) {
            return;
        }
        this.f6827a.f6777h.postOrRun(new f0(this, i0Var, str, bundle, resultReceiver));
    }

    public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, i0 i0Var) {
        if (TextUtils.isEmpty(str) || resultReceiver == null) {
            return;
        }
        this.f6827a.f6777h.postOrRun(new g0(this, i0Var, str, bundle, resultReceiver));
    }

    public void unregisterCallbacks(i0 i0Var) {
        this.f6827a.f6777h.postOrRun(new e0(this, i0Var));
    }
}
