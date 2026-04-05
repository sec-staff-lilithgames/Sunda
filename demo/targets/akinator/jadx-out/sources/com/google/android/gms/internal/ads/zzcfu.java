package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcfu implements zzgb {
    private final zzgb zza;
    private final long zzb;
    private final zzgb zzc;
    private long zzd;
    private Uri zze;

    public zzcfu(zzgb zzgbVar, int i10, zzgb zzgbVar2) {
        this.zza = zzgbVar;
        this.zzb = i10;
        this.zzc = zzgbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + iZza;
            this.zzd = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException {
        Uri uri;
        zzgf zzgfVar2;
        Uri uri2 = zzgfVar.zza;
        this.zze = uri2;
        long j10 = zzgfVar.zze;
        long j11 = this.zzb;
        zzgf zzgfVar3 = null;
        if (j10 >= j11) {
            uri = uri2;
            zzgfVar2 = null;
        } else {
            long j12 = zzgfVar.zzf;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            uri = uri2;
            zzgfVar2 = new zzgf(uri, j10, jMin, null);
        }
        long j13 = zzgfVar.zzf;
        if (j13 == -1 || j10 + j13 > j11) {
            zzgfVar3 = new zzgf(uri, Math.max(j11, j10), j13 != -1 ? Math.min(j13, (j10 + j13) - j11) : -1L, null);
        }
        long jZzb = zzgfVar2 != null ? this.zza.zzb(zzgfVar2) : 0L;
        long jZzb2 = zzgfVar3 != null ? this.zzc.zzb(zzgfVar3) : 0L;
        this.zzd = j10;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgu
    public final Map zzj() {
        return zzgph.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zze(zzgz zzgzVar) {
    }
}
