package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzanj implements zzaof {
    private final zzamq zza;
    private final zzef zzb = new zzef(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzem zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzanj(zzamq zzamqVar) {
        this.zza = zzamqVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzeg zzegVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzegVar.zzd(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzegVar.zzk(iMin);
        } else {
            zzegVar.zzm(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zza(zzem zzemVar, zzadd zzaddVar, zzaoe zzaoeVar) {
        this.zze = zzemVar;
        this.zza.zzb(zzaddVar, zzaoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzc(zzeg zzegVar, int i10) throws zzat {
        int i11;
        int i12;
        long jZze;
        long j10;
        this.zze.getClass();
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i16);
                        sb2.append(" more bytes");
                        zzdt.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zze(zzegVar.zze() == 0);
                } else {
                    zzdt.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i17 = i10;
        while (zzegVar.zzd() > 0) {
            int i18 = this.zzc;
            if (i18 == 0) {
                i11 = i14;
                zzegVar.zzk(zzegVar.zzd());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iZzd = zzegVar.zzd();
                    int i19 = this.zzj;
                    int i20 = i19 == i13 ? 0 : iZzd - i19;
                    if (i20 > 0) {
                        iZzd -= i20;
                        zzegVar.zzf(zzegVar.zzg() + iZzd);
                    }
                    zzamq zzamqVar = this.zza;
                    zzamqVar.zzd(zzegVar);
                    int i21 = this.zzj;
                    if (i21 != i13) {
                        int i22 = i21 - iZzd;
                        this.zzj = i22;
                        if (i22 == 0) {
                            zzamqVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzef zzefVar = this.zzb;
                    if (zzf(zzegVar, zzefVar.zza, iMin) && zzf(zzegVar, null, this.zzi)) {
                        zzefVar.zzf(0);
                        if (this.zzf) {
                            zzefVar.zzh(4);
                            long jZzj = zzefVar.zzj(3);
                            zzefVar.zzh(1);
                            int iZzj = zzefVar.zzj(15) << 15;
                            zzefVar.zzh(1);
                            long jZzj2 = zzefVar.zzj(15);
                            zzefVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j10 = jZzj;
                            } else {
                                zzefVar.zzh(4);
                                j10 = jZzj;
                                zzefVar.zzh(1);
                                int iZzj2 = zzefVar.zzj(15) << 15;
                                zzefVar.zzh(1);
                                long jZzj3 = zzefVar.zzj(15);
                                zzefVar.zzh(1);
                                this.zze.zze((zzefVar.zzj(3) << 30) | iZzj2 | jZzj3);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (j10 << 30) | iZzj);
                        } else {
                            jZze = C.TIME_UNSET;
                        }
                        i17 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i17);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i11 = i14;
            } else {
                zzef zzefVar2 = this.zzb;
                if (zzf(zzegVar, zzefVar2.zza, 9)) {
                    zzefVar2.zzf(0);
                    int iZzj3 = zzefVar2.zzj(24);
                    if (iZzj3 != 1) {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(iZzj3).length() + 30), "Unexpected start code prefix: ", iZzj3, "PesReader");
                        i13 = -1;
                        this.zzj = -1;
                        i12 = 0;
                        i11 = 2;
                    } else {
                        zzefVar2.zzh(8);
                        int iZzj4 = zzefVar2.zzj(16);
                        zzefVar2.zzh(5);
                        this.zzk = zzefVar2.zzi();
                        i11 = 2;
                        zzefVar2.zzh(2);
                        this.zzf = zzefVar2.zzi();
                        this.zzg = zzefVar2.zzi();
                        zzefVar2.zzh(6);
                        int iZzj5 = zzefVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i13 = -1;
                        } else {
                            int i23 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i23;
                            if (i23 < 0) {
                                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(i23).length() + 36), "Found negative packet payload size: ", i23, "PesReader");
                                i13 = -1;
                                this.zzj = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i12 = 2;
                    }
                    zze(i12);
                } else {
                    i13 = -1;
                    i11 = 2;
                }
            }
            i14 = i11;
        }
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
