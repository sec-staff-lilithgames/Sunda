package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamo implements zzamq {
    private final zzeg zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaem zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = C.TIME_UNSET;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzamo(String str, int i10, int i11, String str2) {
        this.zza = new zzeg(new byte[i11]);
        this.zzc = str;
        this.zzd = i10;
    }

    private final boolean zzf(zzeg zzegVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzegVar.zzd(), i10 - this.zzi);
        zzegVar.zzm(bArr, this.zzi, iMin);
        int i11 = this.zzi + iMin;
        this.zzi = i11;
        return i11 == i10;
    }

    @RequiresNonNull({"output"})
    private final void zzg(zzacy zzacyVar) {
        int i10;
        int i11 = zzacyVar.zzb;
        if (i11 == -2147483647 || (i10 = zzacyVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i10 == zzvVar.zzG && i11 == zzvVar.zzH && Objects.equals(zzacyVar.zza, zzvVar.zzo)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzl(this.zze);
        zztVar.zzm(zzacyVar.zza);
        zztVar.zzE(i10);
        zztVar.zzF(i11);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzM = zztVar.zzM();
        this.zzl = zzvVarZzM;
        this.zzg.zzu(zzvVarZzM);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = C.TIME_UNSET;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzf = zzaoeVar.zzc();
        this.zzg = zzaddVar.zzu(zzaoeVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzq = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) throws zzat {
        int i10;
        byte b10;
        int i11;
        byte b11;
        this.zzg.getClass();
        while (zzegVar.zzd() > 0) {
            int i12 = this.zzh;
            if (i12 == 0) {
                while (true) {
                    if (zzegVar.zzd() > 0) {
                        int i13 = this.zzj << 8;
                        this.zzj = i13;
                        int iZzs = i13 | zzegVar.zzs();
                        this.zzj = iZzs;
                        int iZza = zzacz.zza(iZzs);
                        this.zzn = iZza;
                        if (iZza != 0) {
                            byte[] bArrZzi = this.zza.zzi();
                            int i14 = this.zzj;
                            bArrZzi[0] = (byte) ((i14 >> 24) & 255);
                            bArrZzi[1] = (byte) ((i14 >> 16) & 255);
                            bArrZzi[2] = (byte) ((i14 >> 8) & 255);
                            bArrZzi[3] = (byte) (i14 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (iZza == 3 || iZza == 4) {
                                this.zzh = 4;
                            } else if (iZza == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i12 == 1) {
                zzeg zzegVar2 = this.zza;
                if (zzf(zzegVar, zzegVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzegVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzacz.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzu(zzvVarZzb);
                    }
                    this.zzm = zzacz.zzc(bArrZzi2);
                    byte b12 = bArrZzi2[0];
                    if (b12 != -2) {
                        if (b12 == -1) {
                            i10 = (bArrZzi2[4] & 7) << 4;
                            b11 = bArrZzi2[7];
                        } else if (b12 != 31) {
                            i10 = (bArrZzi2[4] & 1) << 6;
                            b10 = bArrZzi2[5];
                        } else {
                            i10 = (bArrZzi2[5] & 7) << 4;
                            b11 = bArrZzi2[6];
                        }
                        i11 = b11 & 60;
                        this.zzk = zzgst.zza(zzep.zzr(((i10 | (i11 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzegVar2.zzh(0);
                        this.zzg.zzz(zzegVar2, 18);
                        this.zzh = 6;
                    } else {
                        i10 = (bArrZzi2[5] & 1) << 6;
                        b10 = bArrZzi2[4];
                    }
                    i11 = b10 & 252;
                    this.zzk = zzgst.zza(zzep.zzr(((i10 | (i11 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzegVar2.zzh(0);
                    this.zzg.zzz(zzegVar2, 18);
                    this.zzh = 6;
                }
            } else if (i12 != 2) {
                if (i12 == 3) {
                    zzeg zzegVar3 = this.zza;
                    if (zzf(zzegVar, zzegVar3.zzi(), this.zzo)) {
                        zzacy zzacyVarZzd = zzacz.zzd(zzegVar3.zzi());
                        zzg(zzacyVarZzd);
                        this.zzm = zzacyVarZzd.zzd;
                        long j10 = zzacyVarZzd.zze;
                        this.zzk = j10 != C.TIME_UNSET ? j10 : 0L;
                        zzegVar3.zzh(0);
                        this.zzg.zzz(zzegVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i12 == 4) {
                    zzeg zzegVar4 = this.zza;
                    if (zzf(zzegVar, zzegVar4.zzi(), 6)) {
                        int iZzg = zzacz.zzg(zzegVar4.zzi());
                        this.zzp = iZzg;
                        int i15 = this.zzi;
                        if (i15 > iZzg) {
                            int i16 = i15 - iZzg;
                            this.zzi = i15 - i16;
                            zzegVar.zzh(zzegVar.zzg() - i16);
                        }
                        this.zzh = 5;
                    }
                } else if (i12 != 5) {
                    int iMin = Math.min(zzegVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzz(zzegVar, iMin);
                    int i17 = this.zzi + iMin;
                    this.zzi = i17;
                    if (i17 == this.zzm) {
                        zzgmd.zzh(this.zzq != C.TIME_UNSET);
                        this.zzg.zzx(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzeg zzegVar5 = this.zza;
                    if (zzf(zzegVar, zzegVar5.zzi(), this.zzp)) {
                        zzacy zzacyVarZzf = zzacz.zzf(zzegVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzacyVarZzf);
                        }
                        this.zzm = zzacyVarZzf.zzd;
                        long j11 = zzacyVarZzf.zze;
                        this.zzk = j11 != C.TIME_UNSET ? j11 : 0L;
                        zzegVar5.zzh(0);
                        this.zzg.zzz(zzegVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzeg zzegVar6 = this.zza;
                if (zzf(zzegVar, zzegVar6.zzi(), 7)) {
                    this.zzo = zzacz.zze(zzegVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
    }
}
