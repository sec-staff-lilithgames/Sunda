package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzbcn extends IInterface {
    com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbcu zzbcuVar) throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException;

    void zzh(boolean z10) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    String zzj() throws RemoteException;

    long zzk() throws RemoteException;

    void zzl(long j10) throws RemoteException;
}
