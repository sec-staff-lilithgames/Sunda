package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamj implements zzamq {
    private final zzef zza;
    private final zzeg zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaem zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzamj(String str, int i10, String str2) {
        zzef zzefVar = new zzef(new byte[16], 16);
        this.zza = zzefVar;
        this.zzb = new zzeg(zzefVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzf = zzaoeVar.zzc();
        this.zzg = zzaddVar.zzu(zzaoeVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) {
        this.zzg.getClass();
        while (zzegVar.zzd() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                while (zzegVar.zzd() > 0) {
                    if (this.zzj) {
                        int iZzs = zzegVar.zzs();
                        this.zzj = iZzs == 172;
                        if (iZzs != 64) {
                            if (iZzs == 65) {
                                iZzs = 65;
                            }
                        }
                        this.zzh = 1;
                        zzeg zzegVar2 = this.zzb;
                        zzegVar2.zzi()[0] = -84;
                        zzegVar2.zzi()[1] = iZzs == 65 ? (byte) 65 : (byte) 64;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzegVar.zzs() == 172;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzegVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzz(zzegVar, iMin);
                int i11 = this.zzi + iMin;
                this.zzi = i11;
                if (i11 == this.zzm) {
                    zzgmd.zzh(this.zzn != C.TIME_UNSET);
                    this.zzg.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzeg zzegVar3 = this.zzb;
                byte[] bArrZzi = zzegVar3.zzi();
                int iMin2 = Math.min(zzegVar.zzd(), 16 - this.zzi);
                zzegVar.zzm(bArrZzi, this.zzi, iMin2);
                int i12 = this.zzi + iMin2;
                this.zzi = i12;
                if (i12 == 16) {
                    zzef zzefVar = this.zza;
                    zzefVar.zzf(0);
                    zzacd zzacdVarZzb = zzace.zzb(zzefVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzvVar.zzG != 2 || zzacdVarZzb.zza != zzvVar.zzH || !"audio/ac4".equals(zzvVar.zzo)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzl(this.zze);
                        zztVar.zzm("audio/ac4");
                        zztVar.zzE(2);
                        zztVar.zzF(zzacdVarZzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzvVarZzM = zztVar.zzM();
                        this.zzl = zzvVarZzM;
                        this.zzg.zzu(zzvVarZzM);
                    }
                    this.zzm = zzacdVarZzb.zzb;
                    this.zzk = (zzacdVarZzb.zzc * 1000000) / this.zzl.zzH;
                    zzegVar3.zzh(0);
                    this.zzg.zzz(zzegVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
    }
}
