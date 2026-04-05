package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafs extends zzafr {
    private final zzeg zzb;
    private final zzeg zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafs(zzaem zzaemVar) {
        super(zzaemVar);
        this.zzb = new zzeg(zzfm.zza);
        this.zzc = new zzeg(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zza(zzeg zzegVar) throws zzafq {
        int iZzs = zzegVar.zzs();
        int i10 = iZzs >> 4;
        int i11 = iZzs & 15;
        if (i11 != 7) {
            throw new zzafq(o2.l(i11, "Video format not supported: ", new StringBuilder(String.valueOf(i11).length() + 28)));
        }
        this.zzg = i10;
        return i10 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb(zzeg zzegVar, long j10) throws zzat {
        int i10;
        int iZzs = zzegVar.zzs();
        long jZzy = zzegVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzeg zzegVar2 = new zzeg(new byte[zzegVar.zzd()]);
                zzegVar.zzm(zzegVar2.zzi(), 0, zzegVar.zzd());
                zzacf zzacfVarZza = zzacf.zza(zzegVar2);
                this.zzd = zzacfVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("video/avc");
                zztVar.zzj(zzacfVarZza.zzl);
                zztVar.zzt(zzacfVarZza.zzc);
                zztVar.zzu(zzacfVarZza.zzd);
                zztVar.zzz(zzacfVarZza.zzk);
                zztVar.zzp(zzacfVarZza.zza);
                this.zza.zzu(zztVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i11 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i10 = i11;
            } else if (i11 != 0) {
                i10 = 1;
            }
            zzeg zzegVar3 = this.zzc;
            byte[] bArrZzi = zzegVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzegVar.zzd() > 0) {
                zzegVar.zzm(zzegVar3.zzi(), i12, this.zzd);
                zzegVar3.zzh(0);
                zzeg zzegVar4 = this.zzb;
                int iZzH = zzegVar3.zzH();
                zzegVar4.zzh(0);
                zzaem zzaemVar = this.zza;
                zzaemVar.zzz(zzegVar4, 4);
                zzaemVar.zzz(zzegVar, iZzH);
                i13 = i13 + 4 + iZzH;
            }
            this.zza.zzx((jZzy * 1000) + j10, i10, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
