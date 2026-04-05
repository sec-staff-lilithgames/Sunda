package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzanx implements zzanq {
    final /* synthetic */ zzaoa zza;
    private final zzef zzb;

    public zzanx(zzaoa zzaoaVar) {
        Objects.requireNonNull(zzaoaVar);
        this.zza = zzaoaVar;
        this.zzb = new zzef(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final void zzb(zzeg zzegVar) {
        if (zzegVar.zzs() == 0 && (zzegVar.zzs() & 128) != 0) {
            zzegVar.zzk(6);
            int iZzd = zzegVar.zzd() / 4;
            for (int i10 = 0; i10 < iZzd; i10++) {
                zzef zzefVar = this.zzb;
                zzegVar.zzl(zzefVar, 4);
                int iZzj = zzefVar.zzj(16);
                zzefVar.zzh(3);
                if (iZzj == 0) {
                    zzefVar.zzh(13);
                } else {
                    int iZzj2 = zzefVar.zzj(13);
                    zzaoa zzaoaVar = this.zza;
                    if (zzaoaVar.zzi().get(iZzj2) == null) {
                        zzaoaVar.zzi().put(iZzj2, new zzanr(new zzany(zzaoaVar, iZzj2)));
                        zzaoaVar.zzn(zzaoaVar.zzm() + 1);
                    }
                }
            }
            this.zza.zzi().remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final void zza(zzem zzemVar, zzadd zzaddVar, zzaoe zzaoeVar) {
    }
}
