package com.google.android.gms.internal.ads;

import android.content.Context;
import j1.o2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdpq {
    private final zzfgn zza;
    private final Executor zzb;
    private final zzdse zzc;
    private final zzdqz zzd;
    private final Context zze;
    private final zzdvi zzf;
    private final zzfng zzg;
    private final zzefy zzh;
    private final zzdvc zzi;
    private final zzdwl zzj;

    public zzdpq(zzfgn zzfgnVar, Executor executor, zzdse zzdseVar, Context context, zzdvi zzdviVar, zzfng zzfngVar, zzefy zzefyVar, zzdqz zzdqzVar, zzdvc zzdvcVar, zzdwl zzdwlVar) {
        this.zza = zzfgnVar;
        this.zzb = executor;
        this.zzc = zzdseVar;
        this.zze = context;
        this.zzf = zzdviVar;
        this.zzg = zzfngVar;
        this.zzh = zzefyVar;
        this.zzd = zzdqzVar;
        this.zzi = zzdvcVar;
        this.zzj = zzdwlVar;
    }

    private final void zzh(zzcgy zzcgyVar, zzcbz zzcbzVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
        if (zzgaVar != null && zzcgyVar.zzh() != null) {
            zzcgyVar.zzh().zzc(zzgaVar);
        }
        zzcbzVar.zzb();
    }

    private final void zzi(zzcgy zzcgyVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar) {
        zzdwl zzdwlVar;
        zzj(zzcgyVar);
        zzcgyVar.zzab("/video", zzblw.zzl);
        zzcgyVar.zzab("/videoMeta", zzblw.zzm);
        zzcgyVar.zzab("/precache", new zzcff());
        zzcgyVar.zzab("/delayPageLoaded", zzblw.zzp);
        zzcgyVar.zzab("/instrument", zzblw.zzn);
        zzcgyVar.zzab("/log", zzblw.zzg);
        zzcgyVar.zzab("/click", zzblw.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcgyVar.zzP().zzR(true);
            zzcgyVar.zzab("/open", new zzbmk(true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoB)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzcgyVar.zzP().zzR(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcgyVar.getContext())) {
            Map map = new HashMap();
            if (zzcgyVar.zzC() != null) {
                map = zzcgyVar.zzC().zzaw;
            }
            zzcgyVar.zzab("/logScionEvent", new zzbmd(zzcgyVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoB)).booleanValue()) {
            zzcgyVar.zzP().zzi(zzbVar);
            zzcgyVar.zzP().zzj(zzbztVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziu)).booleanValue() || (zzdwlVar = this.zzj) == null) {
            return;
        }
        zzcgyVar.zzab("/onDeviceStorageEvent", new zzbmf(zzdwlVar));
    }

    private static final void zzj(zzcgy zzcgyVar) {
        zzcgyVar.zzab("/videoClicked", zzblw.zzh);
        zzcgyVar.zzP().zzP(true);
        zzcgyVar.zzab("/getNativeAdViewSignals", zzblw.zzs);
        zzcgyVar.zzab("/getNativeClickMeta", zzblw.zzt);
    }

    public final n1 zza(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbzt zzbztVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzi.zze(), zzduq.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        n1 n1VarZza = zzgui.zza(null);
        zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zze(zzbVar, zzbztVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgui.zzj(zzgui.zzj(n1VarZza, zzgtqVar, executor), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcgy) obj);
            }
        }, executor);
    }

    public final n1 zzb(final String str, final String str2, final zzffu zzffuVar, final zzffx zzffxVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbzt zzbztVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzi.zze(), zzduq.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzd(zzrVar, zzffuVar, zzffxVar, zzbVar, zzbztVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ n1 zzc(JSONObject jSONObject, final zzcgy zzcgyVar) {
        zzboi zzboiVar = this.zza.zzb;
        final zzcbz zzcbzVarZza = zzcbz.zza(zzcgyVar);
        if (zzboiVar != null) {
            zzcgyVar.zzaf(zzcji.zze());
        } else {
            zzcgyVar.zzaf(zzcji.zzd());
        }
        zzcgyVar.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // com.google.android.gms.internal.ads.zzciu
            public final /* synthetic */ void zza(boolean z10, int i10, String str, String str2) {
                this.zza.zzg(zzcgyVar, zzcbzVarZza, z10, i10, str, str2);
            }
        });
        zzcgyVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcbzVarZza;
    }

    public final /* synthetic */ n1 zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzffu zzffuVar, zzffx zzffxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar, String str, String str2, Object obj) throws zzchn {
        final zzcgy zzcgyVarZza = this.zzc.zza(zzrVar, zzffuVar, zzffxVar);
        final zzcbz zzcbzVarZza = zzcbz.zza(zzcgyVarZza);
        if (this.zza.zzb != null) {
            zzi(zzcgyVarZza, zzbVar, zzbztVar);
            zzcgyVarZza.zzaf(zzcji.zze());
        } else {
            zzdqw zzdqwVarZza = this.zzd.zza();
            zzciw zzciwVarZzP = zzcgyVarZza.zzP();
            zzbel zzbelVar = zzbeu.zzoB;
            zzciwVarZzP.zzZ(zzdqwVarZza, zzdqwVarZza, zzdqwVarZza, zzdqwVarZza, zzdqwVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() ? null : zzbztVar, this.zzh, this.zzg, this.zzf, null, zzdqwVarZza, null, null, null, null, this.zzj, null);
            zzj(zzcgyVarZza);
        }
        zzcgyVarZza.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdpn
            @Override // com.google.android.gms.internal.ads.zzciu
            public final /* synthetic */ void zza(boolean z10, int i10, String str3, String str4) {
                this.zza.zzf(zzcgyVarZza, zzcbzVarZza, z10, i10, str3, str4);
            }
        });
        zzcgyVarZza.zzau(str, str2, null);
        return zzcbzVarZza;
    }

    public final /* synthetic */ n1 zze(com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar, Object obj) throws zzchn {
        zzcgy zzcgyVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzcbz zzcbzVarZza = zzcbz.zza(zzcgyVarZza);
        zzi(zzcgyVarZza, zzbVar, zzbztVar);
        zzcgyVarZza.zzP().zzH(new zzciv() { // from class: com.google.android.gms.internal.ads.zzdpm
            @Override // com.google.android.gms.internal.ads.zzciv
            public final /* synthetic */ void zza() {
                zzcbzVarZza.zzb();
            }
        });
        zzcgyVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeo));
        return zzcbzVarZza;
    }

    public final /* synthetic */ void zzf(zzcgy zzcgyVar, zzcbz zzcbzVar, boolean z10, int i10, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
            if (zzgaVar != null && zzcgyVar.zzh() != null) {
                zzcgyVar.zzh().zzc(zzgaVar);
            }
            zzcbzVar.zzb();
            return;
        }
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Html video Web View failed to load. Error code: ");
        sb2.append(i10);
        sb2.append(", Description: ");
        sb2.append(str);
        zzcbzVar.zzd(new zzekz(1, o2.o(sb2, ", Failing URL: ", str2)));
    }

    public final /* synthetic */ void zzg(zzcgy zzcgyVar, zzcbz zzcbzVar, boolean z10, int i10, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzew)).booleanValue()) {
            zzh(zzcgyVar, zzcbzVar);
            return;
        }
        if (z10) {
            zzh(zzcgyVar, zzcbzVar);
            return;
        }
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Native Video WebView failed to load. Error code: ");
        sb2.append(i10);
        sb2.append(", Description: ");
        sb2.append(str);
        zzcbzVar.zzd(new zzekz(1, o2.o(sb2, ", Failing URL: ", str2)));
    }
}
