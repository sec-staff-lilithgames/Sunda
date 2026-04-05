package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcho {
    public static final zzcgy zza(final Context context, final zzcji zzcjiVar, final String str, final boolean z10, final boolean z11, final zzaxa zzaxaVar, final zzbgb zzbgbVar, final VersionInfoParcel versionInfoParcel, zzbfj zzbfjVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbdt zzbdtVar, final zzffu zzffuVar, final zzffx zzffxVar, final zzegj zzegjVar, final zzfgr zzfgrVar, final zzdvi zzdviVar) throws zzchn {
        zzbeu.zza(context);
        try {
            final zzbfj zzbfjVar2 = null;
            zzgmv zzgmvVar = new zzgmv(context, zzcjiVar, str, z10, z11, zzaxaVar, zzbgbVar, versionInfoParcel, zzbfjVar2, zznVar, zzaVar, zzbdtVar, zzffuVar, zzffxVar, zzfgrVar, zzdviVar, zzegjVar) { // from class: com.google.android.gms.internal.ads.zzchk
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcji zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzaxa zzf;
                private final /* synthetic */ zzbgb zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbdt zzk;
                private final /* synthetic */ zzffu zzl;
                private final /* synthetic */ zzffx zzm;
                private final /* synthetic */ zzfgr zzn;
                private final /* synthetic */ zzdvi zzo;
                private final /* synthetic */ zzegj zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbdtVar;
                    this.zzl = zzffuVar;
                    this.zzm = zzffxVar;
                    this.zzn = zzfgrVar;
                    this.zzo = zzdviVar;
                    this.zzp = zzegjVar;
                }

                @Override // com.google.android.gms.internal.ads.zzgmv
                public final /* synthetic */ Object zza() {
                    zzcji zzcjiVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    boolean z13 = this.zze;
                    zzegj zzegjVar2 = this.zzp;
                    zzdvi zzdviVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbdt zzbdtVar2 = this.zzk;
                    zzffu zzffuVar2 = this.zzl;
                    zzffx zzffxVar2 = this.zzm;
                    zzfgr zzfgrVar2 = this.zzn;
                    zzaxa zzaxaVar2 = this.zzf;
                    zzbgb zzbgbVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcib.zza;
                        zzchu zzchuVar = new zzchu(new zzcib(new zzcja(context2), zzcjiVar2, str2, z12, z13, zzaxaVar2, zzbgbVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbdtVar2, zzffuVar2, zzffxVar2, zzfgrVar2), zzdviVar2);
                        zzchuVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzchuVar, zzbdtVar2, z13, zzegjVar2));
                        zzchuVar.setWebChromeClient(new zzcgx(zzchuVar));
                        return zzchuVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = zzgmvVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcgy) objZza;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zzchn("Webview initialization failed.", th3);
        }
    }

    public static final n1 zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzaxa zzaxaVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzegj zzegjVar, final zzfgr zzfgrVar, final zzdvi zzdviVar) {
        return zzgui.zzf(new zzgtp() { // from class: com.google.android.gms.internal.ads.zzchm
            @Override // com.google.android.gms.internal.ads.zzgtp
            public final /* synthetic */ n1 zza() throws zzchn {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzcji zzcjiVarZzb = zzcji.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbdt zzbdtVarZza = zzbdt.zza();
                zzegj zzegjVar2 = zzegjVar;
                zzfgr zzfgrVar2 = zzfgrVar;
                zzdvi zzdviVar2 = zzdviVar;
                zzcgy zzcgyVarZza = zzcho.zza(context2, zzcjiVarZzb, "", false, false, zzaxaVar, null, versionInfoParcel, null, null, zzaVar2, zzbdtVarZza, null, null, zzegjVar2, zzfgrVar2, zzdviVar2);
                final zzcbz zzcbzVarZza = zzcbz.zza(zzcgyVarZza);
                zzcgyVarZza.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzchl
                    @Override // com.google.android.gms.internal.ads.zzciu
                    public final /* synthetic */ void zza(boolean z10, int i10, String str2, String str3) {
                        zzcbzVarZza.zzb();
                    }
                });
                zzcgyVarZza.loadUrl(str);
                return zzcbzVarZza;
            }
        }, zzcbv.zzf);
    }
}
