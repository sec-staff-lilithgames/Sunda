package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdz;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdtx implements zzdbu, zzdac, zzcyr, zzczi, com.google.android.gms.ads.internal.client.zza, zzdef {
    private final zzbdt zza;
    private boolean zzb = false;

    public zzdtx(zzbdt zzbdtVar, zzfdq zzfdqVar) {
        this.zza = zzbdtVar;
        zzbdtVar.zzc(2);
        if (zzfdqVar != null) {
            zzbdtVar.zzc(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(final zzfgf zzfgfVar) {
        this.zza.zzb(new zzbds() { // from class: com.google.android.gms.internal.ads.zzdtw
            @Override // com.google.android.gms.internal.ads.zzbds
            public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar) {
                zzbdz.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbdz.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfgfVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final synchronized void zzdw() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(final zzbdz.zzb zzbVar) {
        zzbds zzbdsVar = new zzbds() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // com.google.android.gms.internal.ads.zzbds
            public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbdt zzbdtVar = this.zza;
        zzbdtVar.zzb(zzbdsVar);
        zzbdtVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzk(final zzbdz.zzb zzbVar) {
        zzbds zzbdsVar = new zzbds() { // from class: com.google.android.gms.internal.ads.zzdtu
            @Override // com.google.android.gms.internal.ads.zzbds
            public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbdt zzbdtVar = this.zza;
        zzbdtVar.zzb(zzbdsVar);
        zzbdtVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzl(final zzbdz.zzb zzbVar) {
        zzbds zzbdsVar = new zzbds() { // from class: com.google.android.gms.internal.ads.zzdtv
            @Override // com.google.android.gms.internal.ads.zzbds
            public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbdt zzbdtVar = this.zza;
        zzbdtVar.zzb(zzbdsVar);
        zzbdtVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzm(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzo() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
    }
}
