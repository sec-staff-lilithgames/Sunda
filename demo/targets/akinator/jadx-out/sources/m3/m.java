package m3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import w2.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public s f74009b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f74010c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74011e = false;

    public m(Context context) {
        this.f74010c = context;
    }

    public void connectAndFetchResult(s sVar) {
        if (this.f74011e) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f74011e = true;
        this.f74009b = sVar;
        Intent intent = new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService");
        Context context = this.f74010c;
        context.bindService(intent.setPackage(h.getPermissionRevocationVerifierApp(context.getPackageManager())), this, 1);
    }

    public void disconnectFromService() {
        if (!this.f74011e) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f74011e = false;
        this.f74010c.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            l3.e.asInterface(iBinder).isPermissionRevocationEnabledForApp(new l(this));
        } catch (RemoteException unused) {
            this.f74009b.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
