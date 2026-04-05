package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzamu {
    private final zzaem zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzamu(zzaem zzaemVar) {
        this.zza = zzaemVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    public final void zzb(int i10, long j10) {
        boolean z10;
        this.zze = i10;
        this.zzd = false;
        if (i10 == 182) {
            z10 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
        this.zzc = i10 == 182;
        this.zzf = 0;
        this.zzh = j10;
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        if (this.zzc) {
            int i12 = this.zzf;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.zzf = (i11 - i10) + i12;
            } else {
                this.zzd = ((bArr[i13] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzd(long j10, int i10, boolean z10) {
        zzgmd.zzh(this.zzh != C.TIME_UNSET);
        if (this.zze == 182 && z10 && this.zzb) {
            this.zza.zzx(this.zzh, this.zzd ? 1 : 0, (int) (j10 - this.zzg), i10, null);
        }
        if (this.zze != 179) {
            this.zzg = j10;
        }
    }
}
