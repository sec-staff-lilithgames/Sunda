package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfgn {
    public final com.google.android.gms.ads.internal.client.zzga zza;
    public final zzboi zzb;
    public final zzeot zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbhx zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzco zzo;
    public final zzfgb zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final com.google.android.gms.ads.internal.client.zzcs zzv;

    public /* synthetic */ zzfgn(zzfgm zzfgmVar, byte[] bArr) {
        this.zzf = zzfgmVar.zzD();
        this.zzg = zzfgmVar.zzE();
        this.zzv = zzfgmVar.zzY();
        this.zze = zzfgmVar.zzC().zzB;
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC = zzfgmVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC2 = zzfgmVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC3 = zzfgmVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC4 = zzfgmVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC5 = zzfgmVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC6 = zzfgmVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzC7 = zzfgmVar.zzC();
        int i10 = zzfgmVar.zzC().zza;
        long j10 = zzmVarZzC7.zzb;
        Bundle bundle = zzmVarZzC6.zzc;
        int i11 = zzmVarZzC5.zzd;
        List list = zzmVarZzC4.zze;
        boolean z10 = zzmVarZzC3.zzf;
        int i12 = zzmVarZzC2.zzg;
        boolean z11 = true;
        if (!zzmVarZzC.zzh && !zzfgmVar.zzG()) {
            z11 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i10, j10, bundle, i11, list, z10, i12, z11, zzfgmVar.zzC().zzi, zzfgmVar.zzC().zzj, zzfgmVar.zzC().zzk, zzfgmVar.zzC().zzl, zzfgmVar.zzC().zzm, zzfgmVar.zzC().zzn, zzfgmVar.zzC().zzo, zzfgmVar.zzC().zzp, zzfgmVar.zzC().zzq, zzfgmVar.zzC().zzr, zzfgmVar.zzC().zzs, zzfgmVar.zzC().zzt, zzfgmVar.zzC().zzu, zzfgmVar.zzC().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfgmVar.zzC().zzw), zzfgmVar.zzC().zzx, zzfgmVar.zzC().zzy, zzfgmVar.zzC().zzz, zzfgmVar.zzC().zzA);
        this.zzd = zzmVar;
        this.zza = zzfgmVar.zzF() != null ? zzfgmVar.zzF() : zzfgmVar.zzJ() != null ? zzfgmVar.zzJ().zzf : null;
        this.zzh = zzfgmVar.zzH();
        this.zzi = zzfgmVar.zzI();
        this.zzj = zzfgmVar.zzH() == null ? null : zzfgmVar.zzJ() == null ? new zzbhx(new NativeAdOptions.Builder().build()) : zzfgmVar.zzJ();
        this.zzk = zzfgmVar.zzK();
        this.zzl = zzfgmVar.zzO();
        this.zzm = zzfgmVar.zzL();
        this.zzn = zzfgmVar.zzM();
        this.zzo = zzfgmVar.zzN();
        this.zzb = zzfgmVar.zzP();
        this.zzp = new zzfgb(zzfgmVar.zzQ(), null);
        this.zzq = zzfgmVar.zzR();
        this.zzr = zzfgmVar.zzS();
        this.zzc = zzfgmVar.zzT();
        this.zzs = zzfgmVar.zzU();
        this.zzt = zzfgmVar.zzV();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzfgmVar.zzW();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdJ));
    }
}
