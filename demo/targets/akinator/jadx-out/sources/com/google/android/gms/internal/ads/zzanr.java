package com.google.android.gms.internal.ads;

import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzanr implements zzaof {
    private final zzanq zza;
    private final zzeg zzb = new zzeg(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanr(zzanq zzanqVar) {
        this.zza = zzanqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zza(zzem zzemVar, zzadd zzaddVar, zzaoe zzaoeVar) {
        this.zza.zza(zzemVar, zzaddVar, zzaoeVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzc(zzeg zzegVar, int i10) {
        int i11 = i10 & 1;
        int iZzg = i11 != 0 ? zzegVar.zzg() + zzegVar.zzs() : -1;
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzegVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzegVar.zzd() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iZzs = zzegVar.zzs();
                    zzegVar.zzh(zzegVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzegVar.zzd(), 3 - this.zzd);
                zzeg zzegVar2 = this.zzb;
                zzegVar.zzm(zzegVar2.zzi(), this.zzd, iMin);
                int i13 = this.zzd + iMin;
                this.zzd = i13;
                if (i13 == 3) {
                    zzegVar2.zzh(0);
                    zzegVar2.zzf(3);
                    zzegVar2.zzk(1);
                    int iZzs2 = zzegVar2.zzs();
                    boolean z10 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzegVar2.zzs();
                    this.zze = z10;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzegVar2.zzj();
                    int i14 = this.zzc;
                    if (iZzj < i14) {
                        int iZzj2 = zzegVar2.zzj();
                        zzegVar2.zzc(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(i14, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzegVar.zzd(), this.zzc - this.zzd);
                zzeg zzegVar3 = this.zzb;
                zzegVar.zzm(zzegVar3.zzi(), this.zzd, iMin2);
                int i15 = this.zzd + iMin2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzegVar3.zzf(i16);
                    } else {
                        if (zzep.zzH(zzegVar3.zzi(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzegVar3.zzf(this.zzc - 4);
                    }
                    zzegVar3.zzh(0);
                    this.zza.zzb(zzegVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
