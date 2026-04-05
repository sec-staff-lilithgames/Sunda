package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import j1.o2;
import java.util.Map;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdsd {
    private final zzcym zza;
    private final zzdgt zzb;
    private final zzczv zzc;
    private final zzdai zzd;
    private final zzdaz zze;
    private final zzdds zzf;
    private final Executor zzg;
    private final zzdgp zzh;
    private final zzcqb zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbzt zzk;
    private final zzaxa zzl;
    private final zzddj zzm;
    private final zzefy zzn;
    private final zzfng zzo;
    private final zzdvi zzp;
    private final zzcpe zzq;
    private final zzdsj zzr;
    private final zzdwl zzs;
    private final zzcxn zzt;

    public zzdsd(zzcym zzcymVar, zzczv zzczvVar, zzdai zzdaiVar, zzdaz zzdazVar, zzdds zzddsVar, Executor executor, zzdgp zzdgpVar, zzcqb zzcqbVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar, zzaxa zzaxaVar, zzddj zzddjVar, zzefy zzefyVar, zzfng zzfngVar, zzdvi zzdviVar, zzdgt zzdgtVar, zzcpe zzcpeVar, zzdsj zzdsjVar, zzdwl zzdwlVar, zzcxn zzcxnVar) {
        this.zza = zzcymVar;
        this.zzc = zzczvVar;
        this.zzd = zzdaiVar;
        this.zze = zzdazVar;
        this.zzf = zzddsVar;
        this.zzg = executor;
        this.zzh = zzdgpVar;
        this.zzi = zzcqbVar;
        this.zzj = zzbVar;
        this.zzk = zzbztVar;
        this.zzl = zzaxaVar;
        this.zzm = zzddjVar;
        this.zzn = zzefyVar;
        this.zzo = zzfngVar;
        this.zzp = zzdviVar;
        this.zzb = zzdgtVar;
        this.zzq = zzcpeVar;
        this.zzr = zzdsjVar;
        this.zzs = zzdwlVar;
        this.zzt = zzcxnVar;
    }

    public static final n1 zzj(zzcgy zzcgyVar, String str, String str2, final Bundle bundle, zzflm zzflmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcy)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcca zzccaVar = new zzcca();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjP)).booleanValue()) {
            zzflc zzflcVarZzn = zzflc.zzn(zzcgyVar.getContext(), 112);
            zzflcVarZzn.zza();
            zzfll.zzd(zzccaVar, zzflmVar, zzflcVarZzn);
        }
        zzcgyVar.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // com.google.android.gms.internal.ads.zzciu
            public final /* synthetic */ void zza(boolean z10, int i10, String str3, String str4) {
                zzcca zzccaVar2 = zzccaVar;
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcy)).booleanValue()) {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzccaVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i10).length();
                StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb2.append("Ad Web View failed to load. Error code: ");
                sb2.append(i10);
                sb2.append(", Description: ");
                sb2.append(str3);
                zzccaVar2.zzd(new Exception(o2.o(sb2, ", Failing URL: ", str4)));
            }
        });
        zzcgyVar.zzau(str, str2, null);
        return zzccaVar;
    }

    public final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    public final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzf(zzcgy zzcgyVar, zzcgy zzcgyVar2, Map map) {
        this.zzi.zzn(zzcgyVar);
    }

    public final /* synthetic */ zzczv zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzddj zzh() {
        return this.zzm;
    }

    public final void zzi(final zzcgy zzcgyVar, boolean z10, zzbma zzbmaVar, Bundle bundle) {
        zzawv zzawvVarZzb;
        zzbel zzbelVar = zzbeu.zzcy;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcgyVar.zzP().zzZ(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbkp() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzbkp
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdrw
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z10, zzbmaVar, this.zzj, new zzdru(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt);
        zzcgyVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdrx
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzcgyVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcZ)).booleanValue() && (zzawvVarZzb = this.zzl.zzb()) != null) {
            zzawvVarZzb.zzh(zzcgyVar.zzE());
        }
        zzdgp zzdgpVar = this.zzh;
        Executor executor = this.zzg;
        zzdgpVar.zzq(zzcgyVar, executor);
        zzdgpVar.zzq(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // com.google.android.gms.internal.ads.zzbau
            public final /* synthetic */ void zzdo(zzbat zzbatVar) {
                Rect rect = zzbatVar.zzd;
                zzcgyVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdgpVar.zza(zzcgyVar.zzE());
        zzcgyVar.zzab("/trackActiveViewUnit", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzcgyVar, (zzcgy) obj, map);
            }
        });
        this.zzi.zzo(zzcgyVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
