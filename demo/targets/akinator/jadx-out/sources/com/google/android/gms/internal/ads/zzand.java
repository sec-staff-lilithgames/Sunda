package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzand implements zzamq {
    private String zzf;
    private zzaem zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzeg zzb = new zzeg(new byte[15], 2);
    private final zzef zzc = new zzef();
    private final zzeg zzd = new zzeg();
    private final zzane zzq = new zzane();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzand(String str) {
    }

    private static final void zzf(zzeg zzegVar, zzeg zzegVar2, boolean z10) {
        int iZzg = zzegVar.zzg();
        int iMin = Math.min(zzegVar.zzd(), zzegVar2.zzd());
        zzegVar.zzm(zzegVar2.zzi(), zzegVar2.zzg(), iMin);
        zzegVar2.zzk(iMin);
        if (z10) {
            zzegVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzf = zzaoeVar.zzc();
        this.zzg = zzaddVar.zzu(zzaoeVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzl = i10;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j10 != C.TIME_UNSET) {
            double d10 = j10;
            if (this.zzj) {
                this.zzi = d10;
            } else {
                this.zzh = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) throws zzat {
        int i10;
        this.zzg.getClass();
        while (zzegVar.zzd() > 0) {
            int i11 = this.zze;
            int iZzj = 0;
            if (i11 == 0) {
                int i12 = this.zzl;
                if ((i12 & 2) != 0) {
                    if ((i12 & 4) == 0) {
                        while (zzegVar.zzd() > 0) {
                            int i13 = this.zzm << 8;
                            this.zzm = i13;
                            int iZzs = i13 | zzegVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & 16777215) == 12583333) {
                                zzegVar.zzh(zzegVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzegVar.zzh(zzegVar.zze());
            } else if (i11 != 1) {
                zzane zzaneVar = this.zzq;
                int i14 = zzaneVar.zza;
                if (i14 == 1 || i14 == 17) {
                    zzf(zzegVar, this.zzd, true);
                }
                int iMin = Math.min(zzegVar.zzd(), zzaneVar.zzc - this.zzo);
                this.zzg.zzz(zzegVar, iMin);
                int i15 = this.zzo + iMin;
                this.zzo = i15;
                if (i15 == zzaneVar.zzc) {
                    int i16 = zzaneVar.zza;
                    if (i16 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzanf zzanfVarZzb = zzang.zzb(new zzef(bArrZzi, bArrZzi.length));
                        this.zzr = zzanfVarZzb.zzb;
                        this.zzs = zzanfVarZzb.zzc;
                        long j10 = this.zzu;
                        long j11 = zzaneVar.zzb;
                        if (j10 != j11) {
                            this.zzu = j11;
                            int i17 = zzanfVarZzb.zza;
                            String strConcat = i17 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i17))) : "mhm1";
                            byte[] bArr = zzanfVarZzb.zzd;
                            zzgpe zzgpeVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgpeVarZzk = zzgpe.zzk(zzep.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzl(this.zza);
                            zztVar.zzm("audio/mhm1");
                            zztVar.zzF(this.zzr);
                            zztVar.zzj(strConcat);
                            zztVar.zzp(zzgpeVarZzk);
                            this.zzg.zzu(zztVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i16 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzef zzefVar = new zzef(bArrZzi2, bArrZzi2.length);
                        if (zzefVar.zzi()) {
                            zzefVar.zzh(2);
                            iZzj = zzefVar.zzj(13);
                        }
                        this.zzt = iZzj;
                    } else if (i16 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i18 = this.zzs - this.zzt;
                        double d10 = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i18 * 1000000.0d) / d10;
                        }
                        this.zzg.zzx(jRound, i10, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzeg zzegVar2 = this.zzb;
                zzf(zzegVar, zzegVar2, false);
                if (zzegVar2.zzd() == 0) {
                    zzef zzefVar2 = this.zzc;
                    int iZze = zzegVar2.zze();
                    zzefVar2.zzb(zzegVar2.zzi(), iZze);
                    zzane zzaneVar2 = this.zzq;
                    if (zzang.zza(zzefVar2, zzaneVar2)) {
                        this.zzo = 0;
                        this.zzp = zzaneVar2.zzc + iZze + this.zzp;
                        zzegVar2.zzh(0);
                        this.zzg.zzz(zzegVar2, zzegVar2.zze());
                        zzegVar2.zza(2);
                        this.zzd.zza(zzaneVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzegVar2.zze() < 15) {
                        zzegVar2.zzf(zzegVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
    }
}
