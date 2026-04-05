package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaol implements zzaok {
    private final zzadd zza;
    private final zzaem zzb;
    private final zzaoo zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaol(zzadd zzaddVar, zzaem zzaemVar, zzaoo zzaooVar, String str, int i10) throws zzat {
        this.zza = zzaddVar;
        this.zzb = zzaemVar;
        this.zzc = zzaooVar;
        int i11 = zzaooVar.zzb * zzaooVar.zze;
        int i12 = zzaooVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw zzat.zzb(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i13, i12, "Expected block size: ", "; got: ", new StringBuilder(String.valueOf(i13).length() + 28 + String.valueOf(i12).length())), null);
        }
        int i14 = zzaooVar.zzc * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzl("audio/wav");
        zztVar.zzm(str);
        zztVar.zzh(i15);
        zztVar.zzi(i15);
        zztVar.zzn(iMax);
        zztVar.zzE(zzaooVar.zzb);
        zztVar.zzF(zzaooVar.zzc);
        zztVar.zzG(i10);
        this.zzd = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void zza(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void zzb(int i10, long j10) {
        this.zza.zzw(new zzaor(this.zzc, 1, i10, j10));
        this.zzb.zzu(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final boolean zzc(zzadb zzadbVar, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int iZzy = this.zzb.zzy(zzadbVar, (int) Math.min(i11 - i10, j11), true);
            if (iZzy == -1) {
                j11 = 0;
            } else {
                this.zzg += iZzy;
                j11 -= iZzy;
            }
        }
        zzaoo zzaooVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzaooVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jZzt = this.zzf + zzep.zzt(this.zzh, 1000000L, zzaooVar.zzc, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zzx(jZzt, 1, i15, i16, null);
            this.zzh += i14;
            this.zzg = i16;
        }
        return j11 <= 0;
    }
}
