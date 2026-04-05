package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzajy extends zzajw {
    private zzajx zza;
    private int zzb;
    private boolean zzc;
    private zzaer zzd;
    private zzaep zze;

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zzb(zzeg zzegVar) {
        if ((zzegVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzegVar.zzi()[0];
        zzajx zzajxVar = this.zza;
        zzajxVar.getClass();
        int i10 = !zzajxVar.zzd[(b10 >> 1) & (255 >>> (8 - zzajxVar.zze))].zza ? zzajxVar.zza.zze : zzajxVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzegVar.zzj() < zzegVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzegVar.zzi(), zzegVar.zze() + 4);
            zzegVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzegVar.zzf(zzegVar.zze() + 4);
        }
        long j10 = i11;
        byte[] bArrZzi = zzegVar.zzi();
        bArrZzi[zzegVar.zze() - 4] = (byte) (j10 & 255);
        bArrZzi[zzegVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzi[zzegVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzi[zzegVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzeg zzegVar, long j10, zzaju zzajuVar) throws IOException {
        zzajx zzajxVar;
        int i10;
        int iZzb;
        int i11;
        int i12;
        long jFloor;
        if (this.zza != null) {
            zzajuVar.zza.getClass();
            return false;
        }
        zzaer zzaerVar = this.zzd;
        int i13 = 1;
        if (zzaerVar == null) {
            zzaes.zzd(1, zzegVar, false);
            int iZzI = zzegVar.zzI();
            int iZzs = zzegVar.zzs();
            int iZzI2 = zzegVar.zzI();
            int iZzC = zzegVar.zzC();
            int i14 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzegVar.zzC();
            int i15 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzegVar.zzC();
            int i16 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzegVar.zzs();
            this.zzd = new zzaer(iZzI, iZzs, iZzI2, i14, i15, i16, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzegVar.zzs() & 1), Arrays.copyOf(zzegVar.zzi(), zzegVar.zze()));
        } else {
            int i17 = 4;
            zzaep zzaepVar = this.zze;
            if (zzaepVar == null) {
                this.zze = zzaes.zzb(zzegVar, true, true);
            } else {
                byte[] bArr = new byte[zzegVar.zze()];
                System.arraycopy(zzegVar.zzi(), 0, bArr, 0, zzegVar.zze());
                int i18 = zzaerVar.zza;
                int i19 = 5;
                zzaes.zzd(5, zzegVar, false);
                int iZzs3 = zzegVar.zzs() + 1;
                zzaeo zzaeoVar = new zzaeo(zzegVar.zzi());
                zzaeoVar.zzc(zzegVar.zzg() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 >= iZzs3) {
                        int i23 = i13;
                        int i24 = 6;
                        int iZzb2 = zzaeoVar.zzb(6) + i23;
                        for (int i25 = 0; i25 < iZzb2; i25++) {
                            if (zzaeoVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzaeoVar.zzb(6) + i23;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < iZzb3) {
                                int iZzb4 = zzaeoVar.zzb(i22);
                                if (iZzb4 == 0) {
                                    int i28 = 8;
                                    zzaeoVar.zzc(8);
                                    zzaeoVar.zzc(16);
                                    zzaeoVar.zzc(16);
                                    zzaeoVar.zzc(6);
                                    zzaeoVar.zzc(8);
                                    int iZzb5 = zzaeoVar.zzb(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iZzb5) {
                                        zzaeoVar.zzc(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iZzb4 != 1) {
                                        StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(iZzb4, 41));
                                        sb2.append("floor type greater than 1 not decodable: ");
                                        sb2.append(iZzb4);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    int iZzb6 = zzaeoVar.zzb(5);
                                    int[] iArr = new int[iZzb6];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iZzb6; i31++) {
                                        int iZzb7 = zzaeoVar.zzb(4);
                                        iArr[i31] = iZzb7;
                                        if (iZzb7 > i30) {
                                            i30 = iZzb7;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr2 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr2[i33] = zzaeoVar.zzb(i27) + 1;
                                        int iZzb8 = zzaeoVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i11 = 8;
                                            zzaeoVar.zzc(8);
                                        } else {
                                            i11 = 8;
                                        }
                                        int i34 = i32;
                                        int i35 = 0;
                                        for (int i36 = 1; i35 < (i36 << iZzb8); i36 = 1) {
                                            zzaeoVar.zzc(i11);
                                            i35++;
                                            i11 = 8;
                                        }
                                        i33++;
                                        i32 = i34;
                                        i27 = 3;
                                    }
                                    zzaeoVar.zzc(2);
                                    int iZzb9 = zzaeoVar.zzb(4);
                                    int i37 = 0;
                                    int i38 = 0;
                                    for (int i39 = 0; i39 < iZzb6; i39++) {
                                        i37 += iArr2[iArr[i39]];
                                        while (i38 < i37) {
                                            zzaeoVar.zzc(iZzb9);
                                            i38++;
                                        }
                                    }
                                }
                                i26++;
                                i24 = 6;
                                i22 = 16;
                            } else {
                                int i40 = 1;
                                int iZzb10 = zzaeoVar.zzb(i24) + 1;
                                int i41 = 0;
                                while (i41 < iZzb10) {
                                    if (zzaeoVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaeoVar.zzc(24);
                                    zzaeoVar.zzc(24);
                                    zzaeoVar.zzc(24);
                                    int iZzb11 = zzaeoVar.zzb(i24) + i40;
                                    int i42 = 8;
                                    zzaeoVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i43 = 0; i43 < iZzb11; i43++) {
                                        iArr3[i43] = ((zzaeoVar.zza() ? zzaeoVar.zzb(5) : 0) * 8) + zzaeoVar.zzb(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < iZzb11) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr3[i44] & (1 << i45)) != 0) {
                                                zzaeoVar.zzc(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i41++;
                                    i24 = 6;
                                    i40 = 1;
                                }
                                int iZzb12 = zzaeoVar.zzb(i24) + 1;
                                for (int i46 = 0; i46 < iZzb12; i46++) {
                                    int iZzb13 = zzaeoVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb3 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(iZzb13, 41));
                                        sb3.append("mapping type other than 0 not supported: ");
                                        sb3.append(iZzb13);
                                        zzdt.zze("VorbisUtil", sb3.toString());
                                    } else {
                                        if (zzaeoVar.zza()) {
                                            i10 = 1;
                                            iZzb = zzaeoVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzaeoVar.zza()) {
                                            int iZzb14 = zzaeoVar.zzb(8) + i10;
                                            for (int i47 = 0; i47 < iZzb14; i47++) {
                                                int i48 = i18 - 1;
                                                zzaeoVar.zzc(zzaes.zza(i48));
                                                zzaeoVar.zzc(zzaes.zza(i48));
                                            }
                                        }
                                        if (zzaeoVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i49 = 0; i49 < i18; i49++) {
                                                zzaeoVar.zzc(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < iZzb; i50++) {
                                            zzaeoVar.zzc(8);
                                            zzaeoVar.zzc(8);
                                            zzaeoVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzaeoVar.zzb(6);
                                int i51 = iZzb15 + 1;
                                zzaeq[] zzaeqVarArr = new zzaeq[i51];
                                for (int i52 = 0; i52 < i51; i52++) {
                                    zzaeqVarArr[i52] = new zzaeq(zzaeoVar.zza(), zzaeoVar.zzb(16), zzaeoVar.zzb(16), zzaeoVar.zzb(8));
                                }
                                if (!zzaeoVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzajxVar = new zzajx(zzaerVar, zzaepVar, bArr, zzaeqVarArr, zzaes.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzaeoVar.zzb(24) != 5653314) {
                            int iZzd = zzaeoVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzaeoVar.zzb(16);
                        int iZzb17 = zzaeoVar.zzb(24);
                        if (zzaeoVar.zza()) {
                            zzaeoVar.zzc(i19);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzaeoVar.zzb(zzaes.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzaeoVar.zza();
                            for (int i53 = 0; i53 < iZzb17; i53++) {
                                if (!zZza) {
                                    zzaeoVar.zzc(i19);
                                } else if (zzaeoVar.zza()) {
                                    zzaeoVar.zzc(i19);
                                }
                            }
                        }
                        int i54 = i17;
                        int iZzb19 = zzaeoVar.zzb(i54);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != i13) {
                            if (iZzb19 != 2) {
                                i12 = i13;
                            }
                            i20++;
                            i13 = i12;
                            i17 = 4;
                            i19 = 5;
                        } else {
                            i21 = iZzb19;
                        }
                        zzaeoVar.zzc(32);
                        zzaeoVar.zzc(32);
                        int iZzb20 = zzaeoVar.zzb(i54) + i13;
                        zzaeoVar.zzc(i13);
                        if (i21 != i13) {
                            i12 = i13;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            i12 = i13;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            i12 = i13;
                            jFloor = 0;
                        }
                        zzaeoVar.zzc((int) (jFloor * iZzb20));
                        i20++;
                        i13 = i12;
                        i17 = 4;
                        i19 = 5;
                    }
                }
            }
        }
        zzajxVar = null;
        this.zza = zzajxVar;
        if (zzajxVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaer zzaerVar2 = zzajxVar.zza;
        arrayList.add(zzaerVar2.zzg);
        arrayList.add(zzajxVar.zzc);
        zzap zzapVarZzc = zzaes.zzc(zzgpe.zzr(zzajxVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm(MimeTypes.AUDIO_VORBIS);
        zztVar.zzh(zzaerVar2.zzd);
        zztVar.zzi(zzaerVar2.zzc);
        zztVar.zzE(zzaerVar2.zza);
        zztVar.zzF(zzaerVar2.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzapVarZzc);
        zzajuVar.zza = zztVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzj(long j10) {
        super.zzj(j10);
        this.zzc = j10 != 0;
        zzaer zzaerVar = this.zzd;
        this.zzb = zzaerVar != null ? zzaerVar.zze : 0;
    }
}
