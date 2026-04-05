package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmb {
    final /* synthetic */ zzme zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzmb(zzme zzmeVar, int i10) {
        Objects.requireNonNull(zzmeVar);
        this.zza = zzmeVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzme zzmeVar = this.zza;
        if (!zzmeVar.zzw().zza()) {
            if (this.zzg) {
                zzmeVar.zzz().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzbfVarZzq = zzmeVar.zzw().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzmeVar.zzw().zzr());
        zzbb zzbbVarZzw = zzmeVar.zzw();
        zzbb zzbbVarZzw2 = zzmeVar.zzw();
        zzbb zzbbVarZzw3 = zzmeVar.zzw();
        int iZzy = zzbbVarZzw.zzy();
        int iZzz = zzbbVarZzw2.zzz();
        long jZzu = zzbbVarZzw3.zzu();
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzmeVar.zzy());
            jZzu -= zzep.zzp(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzu == this.zzf) {
            long j10 = jElapsedRealtime - this.zzh;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzmeVar.zzx().zzx(new zzmf(2, i10));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzu;
        zzmeVar.zzz().zzk(2);
        zzmeVar.zzz().zzi(2, this.zzb);
    }
}
