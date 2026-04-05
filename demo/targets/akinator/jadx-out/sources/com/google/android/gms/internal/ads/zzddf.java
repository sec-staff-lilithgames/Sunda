package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzddf implements AppEventListener, OnAdMetadataChangedListener, zzcyo, com.google.android.gms.ads.internal.client.zza, zzdbf, zzczi, zzdan, com.google.android.gms.ads.internal.overlay.zzr, zzcze, zzdgv {
    private final zzdce zza = new zzdce(this, null);
    private zzeot zzb;
    private zzeox zzc;
    private zzfbu zzd;
    private zzfey zze;

    private static void zzs(Object obj, zzdde zzddeVar) {
        if (obj != null) {
            zzddeVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzdcj.zza);
        zzs(this.zzc, zzdcw.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzddc.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdbw
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzeot) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(final zzbxv zzbxvVar, final String str, final String str2) {
        zzs(this.zzb, new zzdde(zzbxvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdbv
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzfey) obj).zzd(zzbxvVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
        zzs(this.zzd, zzdcr.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdB() {
        zzs(this.zzd, zzdcs.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdC() {
        zzs(this.zzd, zzdct.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() {
        zzs(this.zzb, zzdcg.zza);
        zzs(this.zze, zzdcy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdV() {
        zzs(this.zzb, zzdck.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
        zzs(this.zzd, zzdcq.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(final int i10) {
        zzs(this.zzd, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdcc
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbu) obj).zzdY(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        zzs(this.zzb, zzdcm.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() {
        zzs(this.zzb, zzdcf.zza);
        zzs(this.zze, zzdcx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() {
        zzs(this.zzb, zzdcn.zza);
        zzs(this.zze, zzddd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdz() {
        zzs(this.zzb, zzdcl.zza);
        zzs(this.zzc, zzdcv.zza);
        zzs(this.zze, zzddb.zza);
        zzs(this.zzd, zzdcu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() {
        zzs(this.zzb, zzdch.zza);
        zzs(this.zze, zzdcz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() {
        zzs(this.zzb, zzdci.zza);
        zzs(this.zze, zzdda.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, zzdcp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzfey) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdcb
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzeot) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzl() {
        zzs(this.zzd, zzdco.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdbx
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzeot) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzfey) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdde() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // com.google.android.gms.internal.ads.zzdde
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbu) obj).zzm(zztVar);
            }
        });
    }

    public final zzdce zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzeot zzeotVar) {
        this.zzb = zzeotVar;
    }

    public final /* synthetic */ void zzp(zzeox zzeoxVar) {
        this.zzc = zzeoxVar;
    }

    public final /* synthetic */ void zzq(zzfbu zzfbuVar) {
        this.zzd = zzfbuVar;
    }

    public final /* synthetic */ void zzr(zzfey zzfeyVar) {
        this.zze = zzfeyVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }
}
