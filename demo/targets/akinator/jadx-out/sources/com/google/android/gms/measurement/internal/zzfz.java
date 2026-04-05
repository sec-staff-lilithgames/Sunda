package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfz extends com.google.android.gms.internal.measurement.zzbl implements zzgb {
    public zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzA(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzB(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzooVar);
        com.google.android.gms.internal.measurement.zzbn.zzd(parcelZza, zzghVar);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzC(zzr zzrVar, zzaf zzafVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzafVar);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzD(zzr zzrVar, Bundle bundle, zzge zzgeVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, bundle);
        com.google.android.gms.internal.measurement.zzbn.zzd(parcelZza, zzgeVar);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbg zzbgVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzbgVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzpl zzplVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzplVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzbg zzbgVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzj(zzr zzrVar, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        parcelZza.writeInt(z10 ? 1 : 0);
        Parcel parcelZzP = zzP(7, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(zzpl.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbg zzbgVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzbgVar);
        parcelZza.writeString(str);
        Parcel parcelZzP = zzP(9, parcelZza);
        byte[] bArrCreateByteArray = parcelZzP.createByteArray();
        parcelZzP.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzl(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzm(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        Parcel parcelZzP = zzP(11, parcelZza);
        String string = parcelZzP.readString();
        parcelZzP.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zzah zzahVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzahVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzo(zzah zzahVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z10, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.zzbn.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        Parcel parcelZzP = zzP(14, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(zzpl.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.zzbn.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        Parcel parcelZzP = zzP(15, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(zzpl.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        Parcel parcelZzP = zzP(16, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(zzah.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZzP = zzP(17, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(zzah.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzt(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzu(Bundle bundle, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, bundle);
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzv(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        Parcel parcelZzP = zzP(21, parcelZza);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.zzbn.zzb(parcelZzP, zzao.CREATOR);
        parcelZzP.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzx(zzr zzrVar, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzy(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzz(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzrVar);
        zzc(26, parcelZza);
    }
}
