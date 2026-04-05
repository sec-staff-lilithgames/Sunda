package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzann {
    private final zzamq zza;
    private final zzem zzb;
    private final zzef zzc = new zzef(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzann(zzamq zzamqVar, zzem zzemVar) {
        this.zza = zzamqVar;
        this.zzb = zzemVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzeg zzegVar) throws zzat {
        long jZze;
        char c10;
        zzef zzefVar = this.zzc;
        zzegVar.zzm(zzefVar.zza, 0, 3);
        zzefVar.zzf(0);
        zzefVar.zzh(8);
        this.zzd = zzefVar.zzi();
        this.zze = zzefVar.zzi();
        zzefVar.zzh(6);
        zzegVar.zzm(zzefVar.zza, 0, zzefVar.zzj(8));
        zzefVar.zzf(0);
        if (this.zzd) {
            zzefVar.zzh(4);
            long jZzj = zzefVar.zzj(3);
            zzefVar.zzh(1);
            int iZzj = zzefVar.zzj(15) << 15;
            zzefVar.zzh(1);
            long jZzj2 = zzefVar.zzj(15);
            zzefVar.zzh(1);
            if (this.zzf || !this.zze) {
                c10 = 30;
            } else {
                zzefVar.zzh(4);
                zzefVar.zzh(1);
                int iZzj2 = zzefVar.zzj(15) << 15;
                zzefVar.zzh(1);
                c10 = 30;
                long jZzj3 = zzefVar.zzj(15);
                zzefVar.zzh(1);
                this.zzb.zze((zzefVar.zzj(3) << 30) | iZzj2 | jZzj3);
                this.zzf = true;
            }
            jZze = this.zzb.zze((jZzj << c10) | iZzj | jZzj2);
        } else {
            jZze = 0;
        }
        zzamq zzamqVar = this.zza;
        zzamqVar.zzc(jZze, 4);
        zzamqVar.zzd(zzegVar);
        zzamqVar.zze(false);
    }
}
