package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzent extends com.google.android.gms.ads.internal.client.zzbw {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbk zzb;
    private final zzfgn zzc;
    private final zzcrg zzd;
    private final ViewGroup zze;
    private final zzdvi zzf;

    public zzent(Context context, com.google.android.gms.ads.internal.client.zzbk zzbkVar, zzfgn zzfgnVar, zzcrg zzcrgVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzb = zzbkVar;
        this.zzc = zzfgnVar;
        this.zzd = zzcrgVar;
        this.zzf = zzdviVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZza = zzcrgVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        frameLayout.addView(viewZza, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().zzc);
        frameLayout.setMinimumWidth(zzn().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzA() throws RemoteException {
        zzcrg zzcrgVar = this.zzd;
        return zzcrgVar != null && zzcrgVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzB() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzed zzF() throws RemoteException {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmB)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzeot zzeotVar = this.zzc.zzc;
        if (zzeotVar != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zzf.zzb();
                }
            } catch (RemoteException e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
            }
            zzeotVar.zzo(zzdtVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(long j10) {
        zzcrg zzcrgVar = this.zzd;
        if (zzcrgVar.zzo() != null) {
            zzcrgVar.zzo().zzb(j10);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final long zzU() {
        zzcrg zzcrgVar = this.zzd;
        if (zzcrgVar == null || zzcrgVar.zzo() == null) {
            return 0L;
        }
        return zzcrgVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdW(com.google.android.gms.ads.internal.client.zzbk zzbkVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzf() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzg() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws RemoteException {
        zzeot zzeotVar = this.zzc.zzc;
        if (zzeotVar != null) {
            zzeotVar.zzn(zzcoVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzm() throws RemoteException {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfgt.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcrg zzcrgVar = this.zzd;
        if (zzcrgVar != null) {
            zzcrgVar.zzb(this.zze, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        zzcrg zzcrgVar = this.zzd;
        if (zzcrgVar.zzn() != null) {
            return zzcrgVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        zzcrg zzcrgVar = this.zzd;
        if (zzcrgVar.zzn() != null) {
            return zzcrgVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzea zzt() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzu() throws RemoteException {
        return this.zzc.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() throws RemoteException {
        return this.zzc.zzo;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx(zzbfp zzbfpVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz(boolean z10) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbyb zzbybVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(com.google.android.gms.ads.internal.client.zzeh zzehVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbcq zzbcqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbvr zzbvrVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbvu zzbvuVar, String str) throws RemoteException {
    }
}
