package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaco implements zzaed {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaco(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(string);
        com.google.android.gms.internal.play_billing.a.B(sb2, ", offsets=", string2, ", timeUs=", string3);
        return a.b.o(sb2, ", durationsUs=", string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        long[] jArr = this.zze;
        int iZzm = zzep.zzm(jArr, j10, true, true);
        long j11 = jArr[iZzm];
        long[] jArr2 = this.zzc;
        zzaee zzaeeVar = new zzaee(j11, jArr2[iZzm]);
        if (zzaeeVar.zzb >= j10 || iZzm == this.zza - 1) {
            return new zzaeb(zzaeeVar, zzaeeVar);
        }
        int i10 = iZzm + 1;
        return new zzaeb(zzaeeVar, new zzaee(jArr[i10], jArr2[i10]));
    }
}
