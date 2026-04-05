package u;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f87470a;

    public c(d dVar) {
        this.f87470a = dVar;
    }

    @Override // u.a
    public void onExtraCallback(String str, Bundle bundle) {
        try {
            this.f87470a.f87471a.onExtraCallback(str, bundle);
        } catch (RemoteException unused) {
            Log.e("AuthTabSessionToken", "RemoteException during IAuthTabCallback transaction");
        }
    }

    @Override // u.a
    public Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
        try {
            return this.f87470a.f87471a.onExtraCallbackWithResult(str, bundle);
        } catch (RemoteException unused) {
            Log.e("AuthTabSessionToken", "RemoteException during IAuthTabCallback transaction");
            return Bundle.EMPTY;
        }
    }

    @Override // u.a
    public void onNavigationEvent(int i10, Bundle bundle) {
        try {
            this.f87470a.f87471a.onNavigationEvent(i10, bundle);
        } catch (RemoteException unused) {
            Log.e("AuthTabSessionToken", "RemoteException during IAuthTabCallback transaction");
        }
    }

    @Override // u.a
    public void onWarmupCompleted(Bundle bundle) {
        try {
            this.f87470a.f87471a.onWarmupCompleted(bundle);
        } catch (RemoteException unused) {
            Log.e("AuthTabSessionToken", "RemoteException during IAuthTabCallback transaction");
        }
    }
}
