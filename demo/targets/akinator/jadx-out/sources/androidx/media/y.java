package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6880c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f6883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f6884h;

    public y(int i10, int i11, Bundle bundle, h0 h0Var, i0 i0Var, String str) {
        this.f6884h = h0Var;
        this.f6879b = i0Var;
        this.f6880c = str;
        this.f6881e = i10;
        this.f6882f = i11;
        this.f6883g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() throws RemoteException {
        i0 i0Var = this.f6879b;
        IBinder iBinderAsBinder = ((j0) i0Var).asBinder();
        h0 h0Var = this.f6884h;
        h0Var.f6827a.f6775f.remove(iBinderAsBinder);
        k kVar = new k(h0Var.f6827a, this.f6880c, this.f6881e, this.f6882f, this.f6883g, this.f6879b);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = h0Var.f6827a;
        mediaBrowserServiceCompat.f6776g = kVar;
        int i10 = this.f6882f;
        Bundle bundle = this.f6883g;
        String str = this.f6880c;
        MediaBrowserServiceCompat.a aVarOnGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i10, bundle);
        kVar.f6838h = aVarOnGetRoot;
        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = h0Var.f6827a;
        mediaBrowserServiceCompat2.f6776g = null;
        if (aVarOnGetRoot == null) {
            Log.i("MBServiceCompat", "No root for client " + str + " from service " + y.class.getName());
            try {
                ((j0) i0Var).onConnectFailed();
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                return;
            }
        }
        try {
            mediaBrowserServiceCompat2.f6775f.put(iBinderAsBinder, kVar);
            iBinderAsBinder.linkToDeath(kVar, 0);
            if (h0Var.f6827a.f6778i != null) {
                ((j0) i0Var).onConnect(kVar.f6838h.getRootId(), h0Var.f6827a.f6778i, kVar.f6838h.getExtras());
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
            h0Var.f6827a.f6775f.remove(iBinderAsBinder);
        }
    }
}
