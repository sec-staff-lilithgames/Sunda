package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbqy {
    private final zzbqb zza;
    private n1 zzb;

    public zzbqy(zzbqb zzbqbVar) {
        this.zza = zzbqbVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcca zzccaVar = new zzcca();
            this.zzb = zzccaVar;
            this.zza.zzb(null).zze(new zzcce() { // from class: com.google.android.gms.internal.ads.zzbqx
                @Override // com.google.android.gms.internal.ads.zzcce
                public final /* synthetic */ void zza(Object obj) {
                    zzccaVar.zzc((zzbqc) obj);
                }
            }, new zzccc() { // from class: com.google.android.gms.internal.ads.zzbqu
                @Override // com.google.android.gms.internal.ads.zzccc
                public final /* synthetic */ void zza() {
                    zzccaVar.zzd(new zzbqe("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbrb zza(String str, zzbqi zzbqiVar, zzbqh zzbqhVar) {
        zzd();
        return new zzbrb(this.zzb, "google.afma.activeView.handleUpdate", zzbqiVar, zzbqhVar);
    }

    public final void zzb(final String str, final zzblx zzblxVar) {
        zzd();
        this.zzb = zzgui.zzj(this.zzb, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzbqv
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                zzbqc zzbqcVar = (zzbqc) obj;
                zzbqcVar.zzm(str, zzblxVar);
                return zzgui.zza(zzbqcVar);
            }
        }, zzcbv.zzg);
    }

    public final void zzc(final String str, final zzblx zzblxVar) {
        this.zzb = zzgui.zzk(this.zzb, new zzglu() { // from class: com.google.android.gms.internal.ads.zzbqw
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                zzbqc zzbqcVar = (zzbqc) obj;
                zzbqcVar.zzn(str, zzblxVar);
                return zzbqcVar;
            }
        }, zzcbv.zzg);
    }
}
