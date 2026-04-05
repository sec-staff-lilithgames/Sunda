package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzasl {
    public int zza;
    public zzasg zzb;
    public zzaru zzc;
    public zzarx zzd;

    public zzasl() {
        this(new zzarx(1));
    }

    private final long zzg() throws zzask, zzasi {
        int i10 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i11 = 1600766768 % 649830540;
        int i12 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i13 = 1743768897 % 152059765;
        int i14 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i15 = 1861701682 % 1196748250;
        int i16 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i17 = 2091729405 % 1207774949;
        int i18 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i19 = 1050760512 % 184320788;
        int i20 = 0;
        long j10 = 0;
        while (i20 < (i10 ^ i11)) {
            try {
                zzaru zzaruVar = this.zzc;
                zzasg zzasgVar = this.zzb;
                int i21 = i10;
                int i22 = this.zza;
                int i23 = i11;
                this.zza = i22 + 1;
                byte bZza = zzaruVar.zza(zzasgVar, i22);
                int i24 = i14 ^ i15;
                j10 |= ((i12 ^ i13) & bZza) << i20;
                if (i20 == i24) {
                    if (bZza > 1) {
                        throw new zzasi();
                    }
                    i20 = i24;
                }
                if ((bZza & (i16 ^ i17)) == 0) {
                    return (j10 >>> 1) ^ (-(1 & j10));
                }
                i20 += i18 ^ i19;
                i10 = i21;
                i11 = i23;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzask(e10);
            }
        }
        throw new zzasi();
    }

    private static final void zzh(long j10) throws zzasj {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzasj();
        }
    }

    public final void zza(long j10) throws zzask, zzasj {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        zzh(j10);
        long j19 = j10 / (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17) ^ (j18 % 899334107));
        if (j19 < 0 || j19 > this.zzb.zza.length) {
            throw new zzask();
        }
        this.zza = (int) j19;
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        return this.zza * (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() throws zzask {
        try {
            zzaru zzaruVar = this.zzc;
            zzasg zzasgVar = this.zzb;
            this.zza = this.zza + 1;
            return zzaruVar.zza(zzasgVar, r2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzask(e10);
        }
    }

    public final int zzd() throws zzask {
        int i10 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i11 = 1609416931 % 1031126087;
        int i12 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i13 = 1723578341 % 672563970;
        int i14 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i15 = 1124734562 % 530406424;
        int i16 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i17 = 529302443 % 418646579;
        try {
            zzaru zzaruVar = this.zzc;
            zzasg zzasgVar = this.zzb;
            int i18 = this.zza;
            this.zza = i18 + 1;
            int i19 = i10 ^ i11;
            int iZza = zzaruVar.zza(zzasgVar, i18) & i19;
            zzaru zzaruVar2 = this.zzc;
            zzasg zzasgVar2 = this.zzb;
            int i20 = this.zza;
            this.zza = i20 + 1;
            int iZza2 = iZza | ((zzaruVar2.zza(zzasgVar2, i20) & i19) << (i12 ^ i13));
            zzaru zzaruVar3 = this.zzc;
            zzasg zzasgVar3 = this.zzb;
            int i21 = this.zza;
            this.zza = i21 + 1;
            int iZza3 = iZza2 | ((i19 & zzaruVar3.zza(zzasgVar3, i21)) << (i14 ^ i15));
            zzaru zzaruVar4 = this.zzc;
            zzasg zzasgVar4 = this.zzb;
            int i22 = this.zza;
            this.zza = i22 + 1;
            return iZza3 | (zzaruVar4.zza(zzasgVar4, i22) << (i16 ^ i17));
        } catch (IndexOutOfBoundsException e10) {
            throw new zzask(e10);
        }
    }

    public final long zze() throws zzask, zzasi {
        return zzg();
    }

    public final zzasg zzf(long j10) throws zzask, zzasj {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iY = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.y((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        zzh(zzb() + j10);
        int i18 = this.zza;
        long j11 = i18;
        zzasg zzasgVar = this.zzb;
        long j12 = (j10 >> ((i17 % 774318984) ^ iY)) + j11;
        if (j12 > zzasgVar.zza.length || j12 < j11) {
            throw new zzask();
        }
        try {
            int i19 = (int) j12;
            zzasg zzasgVarZzb = this.zzc.zzb(zzasgVar, i18, i19);
            this.zza = i19;
            return zzasgVarZzb;
        } catch (IndexOutOfBoundsException e10) {
            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }

    public zzasl(zzarx zzarxVar) {
        this(zzasg.zzb, 0, new zzarv());
        this.zzd = zzarxVar;
    }

    private zzasl(zzasg zzasgVar, int i10, zzaru zzaruVar) {
        this.zzb = zzasgVar;
        this.zza = i10;
        this.zzc = zzaruVar;
    }

    public zzasl(zzasg zzasgVar, int i10, zzaru zzaruVar, zzarx zzarxVar) {
        this(zzasgVar, i10, zzaruVar);
        this.zzd = zzarxVar;
    }
}
