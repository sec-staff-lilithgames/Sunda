package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzuk implements zzgb {
    private final zzgb zza;
    private final int zzb;
    private final zzuj zzc;
    private final byte[] zzd;
    private int zze;

    public zzuk(zzgb zzgbVar, int i10, zzuj zzujVar) {
        zzgmd.zza(i10 > 0);
        this.zza = zzgbVar;
        this.zzb = i10;
        this.zzc = zzujVar;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zze;
        if (i12 == 0) {
            zzgb zzgbVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i13 = 0;
            if (zzgbVar.zza(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iZza = zzgbVar.zza(bArr3, i13, i15);
                        if (iZza != -1) {
                            i13 += iZza;
                            i15 -= iZza;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzeg(bArr3, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zze(zzgz zzgzVar) {
        zzgzVar.getClass();
        this.zza.zze(zzgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgu
    public final Map zzj() {
        return this.zza.zzj();
    }
}
