package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzanb implements zzamq {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzeg zzd;
    private final zzef zze;
    private zzaem zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzanb(String str, int i10, String str2) {
        this.zza = str;
        this.zzb = i10;
        zzeg zzegVar = new zzeg(1024);
        this.zzd = zzegVar;
        byte[] bArrZzi = zzegVar.zzi();
        this.zze = new zzef(bArrZzi, bArrZzi.length);
        this.zzm = C.TIME_UNSET;
    }

    private final int zzf(zzef zzefVar) throws zzat {
        int iZzc = zzefVar.zzc();
        zzaby zzabyVarZzb = zzabz.zzb(zzefVar, true);
        this.zzw = zzabyVarZzb.zzc;
        this.zzt = zzabyVarZzb.zza;
        this.zzv = zzabyVarZzb.zzb;
        return iZzc - zzefVar.zzc();
    }

    private static long zzg(zzef zzefVar) {
        return zzefVar.zzj((zzefVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzi = 0;
        this.zzm = C.TIME_UNSET;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzf = zzaddVar.zzu(zzaoeVar.zzb(), 1);
        this.zzg = zzaoeVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) throws zzat {
        int i10;
        int i11;
        int iZzj;
        boolean zZzi;
        this.zzf.getClass();
        while (zzegVar.zzd() > 0) {
            int i12 = this.zzi;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iZzs = zzegVar.zzs();
                    if ((iZzs & 224) == 224) {
                        this.zzl = iZzs;
                        this.zzi = 2;
                    } else if (iZzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(zzegVar.zzd(), this.zzk - this.zzj);
                    zzef zzefVar = this.zze;
                    zzegVar.zzm(zzefVar.zza, this.zzj, iMin);
                    int i13 = this.zzj + iMin;
                    this.zzj = i13;
                    if (i13 == this.zzk) {
                        zzefVar.zzf(0);
                        if (zzefVar.zzi()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzj2 = zzefVar.zzj(1);
                            if (iZzj2 == 1) {
                                iZzj = zzefVar.zzj(1);
                                i11 = 1;
                            } else {
                                i11 = iZzj2;
                                iZzj = 0;
                            }
                            this.zzo = iZzj;
                            if (iZzj != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i11 == 1) {
                                zzg(zzefVar);
                                i11 = 1;
                            }
                            if (!zzefVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzefVar.zzj(6);
                            int iZzj3 = zzefVar.zzj(4);
                            int iZzj4 = zzefVar.zzj(3);
                            if (iZzj3 != 0 || iZzj4 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i11 == 0) {
                                int iZzd = zzefVar.zzd();
                                int iZzf = zzf(zzefVar);
                                zzefVar.zzf(iZzd);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzefVar.zzl(bArr, 0, iZzf);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzl(this.zzc);
                                zztVar.zzm(MimeTypes.AUDIO_AAC);
                                zztVar.zzj(this.zzw);
                                zztVar.zzE(this.zzv);
                                zztVar.zzF(this.zzt);
                                zztVar.zzp(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzvVarZzM = zztVar.zzM();
                                if (!zzvVarZzM.equals(this.zzh)) {
                                    this.zzh = zzvVarZzM;
                                    this.zzu = 1024000000 / zzvVarZzM.zzH;
                                    this.zzf.zzu(zzvVarZzM);
                                }
                            } else {
                                zzefVar.zzh(((int) zzg(zzefVar)) - zzf(zzefVar));
                            }
                            int iZzj5 = zzefVar.zzj(3);
                            this.zzq = iZzj5;
                            if (iZzj5 == 0) {
                                zzefVar.zzh(8);
                            } else if (iZzj5 == 1) {
                                zzefVar.zzh(9);
                            } else if (iZzj5 == 3 || iZzj5 == 4 || iZzj5 == 5) {
                                zzefVar.zzh(6);
                            } else {
                                if (iZzj5 != 6 && iZzj5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzefVar.zzh(1);
                            }
                            boolean zZzi2 = zzefVar.zzi();
                            this.zzr = zZzi2;
                            this.zzs = 0L;
                            if (zZzi2) {
                                if (i11 != 1) {
                                    do {
                                        zZzi = zzefVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzefVar.zzj(8);
                                    } while (zZzi);
                                } else {
                                    this.zzs = zzg(zzefVar);
                                }
                            }
                            if (zzefVar.zzi()) {
                                zzefVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iZzj6 = zzefVar.zzj(8);
                            i10 = i14 + iZzj6;
                            if (iZzj6 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iZzd2 = zzefVar.zzd();
                        if ((iZzd2 & 7) == 0) {
                            this.zzd.zzh(iZzd2 >> 3);
                        } else {
                            zzeg zzegVar2 = this.zzd;
                            zzefVar.zzl(zzegVar2.zzi(), 0, i10 * 8);
                            zzegVar2.zzh(0);
                        }
                        this.zzf.zzz(this.zzd, i10);
                        zzgmd.zzh(this.zzm != C.TIME_UNSET);
                        this.zzf.zzx(this.zzm, 1, i10, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzefVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzs2 = ((this.zzl & (-225)) << 8) | zzegVar.zzs();
                    this.zzk = iZzs2;
                    zzeg zzegVar3 = this.zzd;
                    if (iZzs2 > zzegVar3.zzi().length) {
                        zzegVar3.zza(iZzs2);
                        zzef zzefVar2 = this.zze;
                        byte[] bArrZzi = zzegVar3.zzi();
                        zzefVar2.zzb(bArrZzi, bArrZzi.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzegVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
    }
}
