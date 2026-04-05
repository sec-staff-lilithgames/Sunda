package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzamy {
    private final zzaem zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzamy(zzaem zzaemVar) {
        this.zza = zzaemVar;
    }

    private final void zze(int i10) {
        long j10 = this.zzl;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.zzb;
            long j12 = this.zzk;
            if (j11 == j12) {
                return;
            }
            int i11 = (int) (j11 - j12);
            this.zza.zzx(j10, this.zzm ? 1 : 0, i11, i10, null);
        }
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j10, int i10, int i11, long j11, boolean z10) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j11;
        this.zzd = 0;
        this.zzb = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zze(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        this.zzc = z11;
        this.zzf = z11 || i11 <= 9;
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.zzd = (i11 - i10) + i12;
            } else {
                this.zzg = (bArr[i13] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j10, int i10, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z10 && this.zzi) {
                zze(i10 + ((int) (j10 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
