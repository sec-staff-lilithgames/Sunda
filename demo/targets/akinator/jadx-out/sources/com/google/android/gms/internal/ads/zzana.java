package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzana implements zzamq {
    private zzaem zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzeg zzb = new zzeg(10);
    private long zze = C.TIME_UNSET;

    public zzana(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzd = false;
        this.zze = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        zzaem zzaemVarZzu = zzaddVar.zzu(zzaoeVar.zzb(), 5);
        this.zzc = zzaemVarZzu;
        zzt zztVar = new zzt();
        zztVar.zza(zzaoeVar.zzc());
        zztVar.zzl(this.zza);
        zztVar.zzm(MimeTypes.APPLICATION_ID3);
        zzaemVarZzu.zzu(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j10;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzegVar.zzd();
            int i10 = this.zzg;
            if (i10 < 10) {
                int iMin = Math.min(iZzd, 10 - i10);
                byte[] bArrZzi = zzegVar.zzi();
                int iZzg = zzegVar.zzg();
                zzeg zzegVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzegVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzegVar2.zzh(0);
                    if (zzegVar2.zzs() != 73 || zzegVar2.zzs() != 68 || zzegVar2.zzs() != 51) {
                        zzdt.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzegVar2.zzk(3);
                        this.zzf = zzegVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzz(zzegVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
        int i10;
        this.zzc.getClass();
        if (this.zzd && (i10 = this.zzf) != 0 && this.zzg == i10) {
            zzgmd.zzh(this.zze != C.TIME_UNSET);
            this.zzc.zzx(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
