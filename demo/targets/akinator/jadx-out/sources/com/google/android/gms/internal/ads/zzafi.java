package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafi implements zzacl {
    private final zzadn zza;
    private final int zzb;
    private final zzadh zzc = new zzadh();

    public /* synthetic */ zzafi(zzadn zzadnVar, int i10, byte[] bArr) {
        this.zza = zzadnVar;
        this.zzb = i10;
    }

    private final long zzc(zzadb zzadbVar) throws IOException {
        while (zzadbVar.zzm() < zzadbVar.zzo() - 6) {
            zzadn zzadnVar = this.zza;
            int i10 = this.zzb;
            zzadh zzadhVar = this.zzc;
            long jZzm = zzadbVar.zzm();
            zzeg zzegVar = new zzeg(17);
            zzadbVar.zzi(zzegVar.zzi(), 0, 2);
            if (zzegVar.zzo() != i10) {
                zzadbVar.zzl();
                zzadbVar.zzk((int) (jZzm - zzadbVar.zzn()));
            } else {
                zzegVar.zzf(zzade.zzb(zzadbVar, zzegVar.zzi(), 2, 15) + 2);
                zzadbVar.zzl();
                zzadbVar.zzk((int) (jZzm - zzadbVar.zzn()));
                if (zzadi.zza(zzegVar, zzadnVar, i10, zzadhVar)) {
                    break;
                }
            }
            zzadbVar.zzk(1);
        }
        if (zzadbVar.zzm() < zzadbVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzadbVar.zzk((int) (zzadbVar.zzo() - zzadbVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final zzack zza(zzadb zzadbVar, long j10) throws IOException {
        long jZzn = zzadbVar.zzn();
        long jZzc = zzc(zzadbVar);
        long jZzm = zzadbVar.zzm();
        zzadbVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzadbVar);
        return (jZzc > j10 || jZzc2 <= j10) ? jZzc2 <= j10 ? zzack.zzb(jZzc2, zzadbVar.zzm()) : zzack.zza(jZzc, jZzn) : zzack.zzc(jZzm);
    }
}
