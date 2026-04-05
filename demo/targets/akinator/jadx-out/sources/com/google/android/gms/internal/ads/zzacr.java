package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacr implements zzadb {
    private final zzj zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    private final byte[] zza = new byte[4096];

    static {
        zzal.zzb("media3.extractor");
    }

    public zzacr(zzj zzjVar, long j10, long j11) {
        this.zzb = zzjVar;
        this.zzd = j10;
        this.zzc = j11;
    }

    private final void zzp(int i10) {
        int i11 = this.zzf + i10;
        int length = this.zze.length;
        if (i11 > length) {
            String str = zzep.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final int zzq(int i10) {
        int iMin = Math.min(this.zzg, i10);
        zzs(iMin);
        return iMin;
    }

    private final int zzr(byte[] bArr, int i10, int i11) {
        int i12 = this.zzg;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.zze, 0, bArr, i10, iMin);
        zzs(iMin);
        return iMin;
    }

    private final void zzs(int i10) {
        int i11 = this.zzg - i10;
        this.zzg = i11;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i10 + i12, i11 - i12);
        if (iZza != -1) {
            return i12 + iZza;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzu(int i10) {
        if (i10 != -1) {
            this.zzd += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iZzr = zzr(bArr, i10, i11);
        if (iZzr == 0) {
            iZzr = zzt(bArr, i10, i11, 0, true);
        }
        zzu(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzb(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iZzr = zzr(bArr, i10, i11);
        while (iZzr < i11 && iZzr != -1) {
            iZzr = zzt(bArr, i10, i11, iZzr, z10);
        }
        zzu(iZzr);
        return iZzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        zzb(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzd(int i10) throws IOException {
        int iZzq = zzq(1);
        if (iZzq == 0) {
            iZzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(iZzq);
        return iZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zze(int i10, boolean z10) throws IOException {
        int iZzq = zzq(i10);
        while (iZzq < i10 && iZzq != -1) {
            iZzq = zzt(this.zza, -iZzq, Math.min(i10, iZzq + 4096), iZzq, z10);
        }
        zzu(iZzq);
        return iZzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(int i10) throws IOException {
        zze(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzg(byte[] bArr, int i10, int i11) throws IOException {
        zzacr zzacrVar;
        int iMin;
        zzp(i11);
        int i12 = this.zzg;
        int i13 = this.zzf;
        int i14 = i12 - i13;
        if (i14 == 0) {
            zzacrVar = this;
            iMin = zzacrVar.zzt(this.zze, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzacrVar.zzg += iMin;
        } else {
            zzacrVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(zzacrVar.zze, zzacrVar.zzf, bArr, i10, iMin);
        zzacrVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzh(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!zzj(i11, z10)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        zzh(bArr, i10, i11, false);
    }

    public final boolean zzj(int i10, boolean z10) throws IOException {
        zzp(i10);
        int iZzt = this.zzg - this.zzf;
        while (iZzt < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iZzt = zzt(this.zze, this.zzf, i11, iZzt, z11);
            if (iZzt == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzt;
            i10 = i11;
            z10 = z11;
        }
        this.zzf += i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzk(int i10) throws IOException {
        zzj(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final long zzm() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final long zzo() {
        return this.zzc;
    }
}
