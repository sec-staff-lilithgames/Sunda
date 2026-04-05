package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgjg extends zzbal implements zzgji {
    public zzgjg(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zze(String str, Bundle bundle, zzgjk zzgjkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzban.zzc(parcelZza, bundle);
        zzban.zze(parcelZza, zzgjkVar);
        zzdg(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zzf(Bundle bundle, zzgjk zzgjkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        zzban.zze(parcelZza, zzgjkVar);
        zzdg(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zzg(Bundle bundle, zzgjk zzgjkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        zzban.zze(parcelZza, zzgjkVar);
        zzdg(3, parcelZza);
    }
}
