package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcxs {
    private final zzfks zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzifb zzg;
    private final String zzh;
    private final zzeyd zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfgn zzk;
    private final int zzl;
    private final zzdeh zzm;

    public zzcxs(zzfks zzfksVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzifb zzifbVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzeyd zzeydVar, zzfgn zzfgnVar, zzdeh zzdehVar, int i10) {
        this.zza = zzfksVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzifbVar;
        this.zzh = str2;
        this.zzi = zzeydVar;
        this.zzj = zzgVar;
        this.zzk = zzfgnVar;
        this.zzm = zzdehVar;
        this.zzl = i10;
    }

    public final n1 zza(Bundle bundle) {
        this.zzm.zza();
        zzfkm zzfkmVar = zzfkm.SIGNALS;
        zzfks zzfksVar = this.zza;
        Objects.requireNonNull(zzfksVar);
        return zzfkd.zza(this.zzi.zza(new zzcxq(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfkmVar, zzfksVar).zzi();
    }

    public final n1 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final n1 n1VarZza = zza(bundle);
        return this.zza.zzb(zzfkm.REQUEST_PARCEL, n1VarZza, (n1) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcxr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(n1VarZza, bundle);
            }
        }).zzi();
    }

    public final /* synthetic */ zzbxj zzc(n1 n1Var, Bundle bundle) {
        zzcxq zzcxqVar = (zzcxq) n1Var.get();
        Bundle bundle2 = zzcxqVar.zza;
        String str = (String) ((n1) this.zzg.zzb()).get();
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhA)).booleanValue() && this.zzj.zzx()) {
            z10 = true;
        }
        boolean z11 = z10;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbxj(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z11, this.zzk.zza(), bundle, zzcxqVar.zzb, this.zzl);
    }
}
