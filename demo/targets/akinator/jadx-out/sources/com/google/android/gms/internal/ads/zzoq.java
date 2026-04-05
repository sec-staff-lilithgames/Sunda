package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzoq {
    final /* synthetic */ zzor zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzuu zze;
    private boolean zzf;
    private boolean zzg;

    public zzoq(zzor zzorVar, String str, int i10, zzuu zzuuVar) {
        Objects.requireNonNull(zzorVar);
        this.zza = zzorVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzuuVar == null ? -1L : zzuuVar.zzd;
        if (zzuuVar == null || !zzuuVar.zzb()) {
            return;
        }
        this.zze = zzuuVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i10 = this.zzc;
        if (i10 < zzbfVar.zza()) {
            zzor zzorVar = this.zza;
            zzbfVar.zzb(i10, zzorVar.zzj(), 0L);
            for (int i11 = zzorVar.zzj().zzn; i11 <= zzorVar.zzj().zzo; i11++) {
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i11));
                if (iZze != -1) {
                    i10 = zzbfVar2.zzd(iZze, zzorVar.zzk(), false).zzc;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= zzbfVar2.zza()) {
            i10 = -1;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzuu zzuuVar = this.zze;
        return zzuuVar == null || zzbfVar2.zze(zzuuVar.zza) != -1;
    }

    public final boolean zzb(int i10, zzuu zzuuVar) {
        if (zzuuVar == null) {
            return i10 == this.zzc;
        }
        zzuu zzuuVar2 = this.zze;
        return zzuuVar2 == null ? !zzuuVar.zzb() && zzuuVar.zzd == this.zzd : zzuuVar.zzd == zzuuVar2.zzd && zzuuVar.zzb == zzuuVar2.zzb && zzuuVar.zzc == zzuuVar2.zzc;
    }

    public final void zzc(int i10, zzuu zzuuVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzuuVar != null) {
            zzor zzorVar = this.zza;
            long j10 = zzuuVar.zzd;
            if (j10 >= zzorVar.zzi()) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzd(zzmj zzmjVar) {
        zzuu zzuuVar = zzmjVar.zzd;
        if (zzuuVar == null) {
            return this.zzc != zzmjVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        long j11 = zzuuVar.zzd;
        if (j11 > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmjVar.zzb;
        int iZze = zzbfVar.zze(zzuuVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzuu zzuuVar2 = this.zze;
        if (j11 < zzuuVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzuuVar.zzb()) {
            int i10 = zzuuVar.zze;
            return i10 == -1 || i10 > zzuuVar2.zzb;
        }
        int i11 = zzuuVar.zzb;
        int i12 = zzuuVar.zzc;
        int i13 = zzuuVar2.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zzuuVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzuu zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z10) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z10) {
        this.zzg = true;
    }
}
