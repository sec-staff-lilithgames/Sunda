package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqe extends zzbkb {
    private final String zza;
    private final zzdll zzb;
    private final zzdlq zzc;
    private final zzdvi zzd;

    public zzdqe(String str, zzdll zzdllVar, zzdlq zzdlqVar, zzdvi zzdviVar) {
        this.zza = str;
        this.zzb = zzdllVar;
        this.zzc = zzdlqVar;
        this.zzd = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final boolean zzA() throws RemoteException {
        zzdlq zzdlqVar = this.zzc;
        return (zzdlqVar.zzE().isEmpty() || zzdlqVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        this.zzb.zzA(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        this.zzb.zzB(zzdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final zzbif zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhm)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        try {
            if (!zzdtVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzQ(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzJ(Bundle bundle) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznZ)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final long zzK() {
        zzdll zzdllVar = this.zzb;
        if (zzdllVar == null || zzdllVar.zzo() == null) {
            return 0L;
        }
        return zzdllVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzL(long j10) {
        zzdll zzdllVar = this.zzb;
        if (zzdllVar == null || zzdllVar.zzo() == null) {
            return;
        }
        zzdllVar.zzo().zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final zzbii zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final zzbib zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final IObjectWrapper zzu() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final IObjectWrapper zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzx(zzbjz zzbjzVar) throws RemoteException {
        this.zzb.zzy(zzbjzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final List zzz() throws RemoteException {
        return zzA() ? this.zzc.zzE() : Collections.EMPTY_LIST;
    }
}
