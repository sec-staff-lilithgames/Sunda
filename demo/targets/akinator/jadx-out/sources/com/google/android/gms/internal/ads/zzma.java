package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzma {
    final /* synthetic */ zzme zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzma(zzme zzmeVar, int i10) {
        Objects.requireNonNull(zzmeVar);
        this.zza = zzmeVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzme zzmeVar = this.zza;
        if (zzmeVar.zzw().zzh() != 2 || !zzmeVar.zzw().zzk() || zzmeVar.zzw().zzi() != 0) {
            if (this.zzh) {
                zzmeVar.zzz().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzbfVarZzq = zzmeVar.zzw().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzmeVar.zzw().zzr());
        zzbb zzbbVarZzw = zzmeVar.zzw();
        zzbb zzbbVarZzw2 = zzmeVar.zzw();
        zzbb zzbbVarZzw3 = zzmeVar.zzw();
        zzbb zzbbVarZzw4 = zzmeVar.zzw();
        int iZzy = zzbbVarZzw.zzy();
        int iZzz = zzbbVarZzw2.zzz();
        long jZzv = zzbbVarZzw3.zzv();
        long jMax = Math.max(0L, zzmeVar.zzw().zzw() - Math.max(0L, jZzv - zzbbVarZzw4.zzu()));
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzmeVar.zzy());
            jZzv -= zzep.zzp(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzv == this.zzf && jMax == this.zzg) {
            long j10 = jElapsedRealtime - this.zzi;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzmeVar.zzx().zzx(new zzmf(1, i10));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzv;
        this.zzg = jMax;
        zzmeVar.zzz().zzk(1);
        zzmeVar.zzz().zzi(1, this.zzb);
    }
}
