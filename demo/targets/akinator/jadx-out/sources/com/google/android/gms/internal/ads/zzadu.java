package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadu {
    private final zzeg zza = new zzeg(10);

    private final boolean zzb(zzadb zzadbVar, int i10) throws IOException {
        int i11;
        int i12 = 0;
        do {
            int i13 = i12 % 10;
            if (i13 == 0) {
                if (i12 != 0) {
                    zzeg zzegVar = this.zza;
                    System.arraycopy(zzegVar.zzi(), 10, zzegVar.zzi(), 0, 9);
                }
                i11 = 0;
            } else {
                i11 = i13;
            }
            int i14 = i12 != 0 ? 1 : 10;
            try {
                zzeg zzegVar2 = this.zza;
                int i15 = i13 + 10;
                zzadbVar.zzi(zzegVar2.zzi(), i15 - i14, i14);
                zzegVar2.zzh(i11);
                zzegVar2.zzf(i15);
                if (zzegVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzadx.zza(zzegVar2.zzr()) != -1) {
                    return false;
                }
                if (i12 == 0) {
                    zzegVar2.zzc(20);
                }
                i12++;
            } catch (EOFException unused) {
            }
        } while (i12 <= i10);
        return false;
    }

    public final zzap zza(zzadb zzadbVar, zzagm zzagmVar, int i10) throws IOException {
        zzap zzapVarZza = null;
        int i11 = 0;
        while (zzb(zzadbVar, i10)) {
            zzeg zzegVar = this.zza;
            int iZzg = zzegVar.zzg();
            zzegVar.zzk(6);
            int iZzG = zzegVar.zzG();
            int i12 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i12];
                System.arraycopy(zzegVar.zzi(), iZzg, bArr, 0, 10);
                zzadbVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzagp.zza(bArr, i12, zzagmVar, new zzaga());
            } else {
                zzadbVar.zzk(iZzG);
            }
            i11 += i12;
        }
        zzadbVar.zzl();
        zzadbVar.zzk(i11);
        return zzapVarZza;
    }
}
