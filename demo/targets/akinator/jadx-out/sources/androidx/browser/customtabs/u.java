package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends b.f {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5286b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f5287c;

    public u(e eVar) {
        this.f5287c = eVar;
    }

    @Override // b.f, b.h
    public void extraCallback(String str, Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new m(this, str, bundle));
    }

    @Override // b.f, b.h
    public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        e eVar = this.f5287c;
        if (eVar == null) {
            return null;
        }
        return eVar.extraCallbackWithResult(str, bundle);
    }

    @Override // b.f, b.h
    public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new s(this, i10, i11, i12, i13, i14, bundle));
    }

    @Override // b.f, b.h
    public void onActivityResized(int i10, int i11, Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new q(this, i10, i11, bundle));
    }

    @Override // b.f, b.h
    public void onMessageChannelReady(Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new n(this, bundle));
    }

    @Override // b.f, b.h
    public void onMinimized(Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new t(this, bundle));
    }

    @Override // b.f, b.h
    public void onNavigationEvent(int i10, Bundle bundle) {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new l(this, i10, bundle));
    }

    @Override // b.f, b.h
    public void onPostMessage(String str, Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new o(this, str, bundle));
    }

    @Override // b.f, b.h
    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new p(this, i10, uri, z10, bundle));
    }

    @Override // b.f, b.h
    public void onUnminimized(Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new k(this, bundle));
    }

    @Override // b.f, b.h
    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        if (this.f5287c == null) {
            return;
        }
        this.f5286b.post(new r(this, bundle));
    }
}
