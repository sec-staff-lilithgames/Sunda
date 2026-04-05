package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaen {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzadb zzadbVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzadbVar.zzi(bArr, 0, 10);
        zzadbVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzaem zzaemVar, long j10, int i10, int i11, int i12, zzael zzaelVar) {
        zzgmd.zzi(this.zzg <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zzd(zzaemVar, zzaelVar);
            }
        }
    }

    public final void zzd(zzaem zzaemVar, zzael zzaelVar) {
        if (this.zzc > 0) {
            zzaemVar.zzx(this.zzd, this.zze, this.zzf, this.zzg, zzaelVar);
            this.zzc = 0;
        }
    }
}
