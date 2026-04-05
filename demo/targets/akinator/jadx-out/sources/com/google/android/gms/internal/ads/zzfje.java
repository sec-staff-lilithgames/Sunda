package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfje {
    private final zzfiw zza;
    private final n1 zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfje(final zzfic zzficVar, final zzfiv zzfivVar, final zzfiw zzfiwVar) {
        this.zza = zzfiwVar;
        this.zzb = zzgui.zzh(zzgui.zzj(zzfivVar.zza(zzfiwVar), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(zzfivVar, zzficVar, zzfiwVar, (zzfil) obj);
            }
        }, zzfiwVar.zza()), Exception.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzfjb
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzd(zzfivVar, (Exception) obj);
            }
        }, zzfiwVar.zza());
    }

    public final synchronized void zza(zzguf zzgufVar) {
        zzfiw zzfiwVar = this.zza;
        zzgui.zzr(zzgui.zzj(this.zzb, zzfjc.zza, zzfiwVar.zza()), zzgufVar, zzfiwVar.zza());
    }

    public final synchronized n1 zzb(zzfiw zzfiwVar) {
        if (!this.zzd && !this.zzc) {
            zzfiw zzfiwVar2 = this.zza;
            if (zzfiwVar2.zzb() != null && zzfiwVar.zzb() != null && zzfiwVar2.zzb().equals(zzfiwVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ n1 zzc(zzfiv zzfivVar, zzfic zzficVar, zzfiw zzfiwVar, zzfil zzfilVar) {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfivVar.zzb(zzfilVar);
                if (this.zzc) {
                    return zzgui.zza(new zzfiu(zzfilVar, zzfiwVar));
                }
                zzficVar.zzb(zzfiwVar.zzb(), zzfilVar);
                return zzgui.zza(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ n1 zzd(zzfiv zzfivVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
