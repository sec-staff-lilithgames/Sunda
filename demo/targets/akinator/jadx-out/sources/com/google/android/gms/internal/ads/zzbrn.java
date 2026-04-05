package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbrn extends zzbal implements zzbrp {
    public zzbrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzh() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzi() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzk() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdf(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzm(zzbjc zzbjcVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbjcVar);
        parcelZza.writeString(str);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzn() throws RemoteException {
        zzdf(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzo() throws RemoteException {
        zzdf(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzp(zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzq() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzr(zzbyl zzbylVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbylVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzs(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzt() throws RemoteException {
        zzdf(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzu() throws RemoteException {
        zzdf(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzw(int i10, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzz() throws RemoteException {
        zzdf(25, zza());
    }
}
