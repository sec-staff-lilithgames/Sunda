package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i10, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zzb(int i10, Bundle bundle) throws RemoteException;

    void zzc(int i10, IBinder iBinder, zzk zzkVar) throws RemoteException;
}
