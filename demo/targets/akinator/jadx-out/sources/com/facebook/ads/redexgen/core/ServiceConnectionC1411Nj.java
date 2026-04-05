package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC1411Nj implements ServiceConnection {
    public final /* synthetic */ HandlerC1412Nk A00;

    public ServiceConnectionC1411Nj(HandlerC1412Nk handlerC1412Nk) {
        this.A00 = handlerC1412Nk;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        this.A00.A04.removeCallbacks(this.A00.A08);
        this.A00.A00 = new Messenger(iBinder);
        if (!UA.A09(this.A00.A07)) {
            return;
        }
        this.A00.A07(this.A00.A00);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
