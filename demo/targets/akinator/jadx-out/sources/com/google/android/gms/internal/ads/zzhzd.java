package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.io.IOException;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhzd {
    private static final zzhzd zza = new zzhzd(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhzd(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzhzd zza() {
        return zza;
    }

    public static zzhzd zzb() {
        return new zzhzd();
    }

    public static zzhzd zzc(zzhzd zzhzdVar, zzhzd zzhzdVar2) {
        int i10 = zzhzdVar.zzb + zzhzdVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhzdVar.zzc, i10);
        System.arraycopy(zzhzdVar2.zzc, 0, iArrCopyOf, zzhzdVar.zzb, zzhzdVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhzdVar.zzd, i10);
        System.arraycopy(zzhzdVar2.zzd, 0, objArrCopyOf, zzhzdVar.zzb, zzhzdVar2.zzb);
        return new zzhzd(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhzd)) {
            return false;
        }
        zzhzd zzhzdVar = (zzhzd) obj;
        int i10 = this.zzb;
        if (i10 == zzhzdVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhzdVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhzdVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int iB = o2.B(i11, 31, i12, 31);
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return iB + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzhzr zzhzrVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhzrVar.zzv(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzg(zzhzr zzhzrVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzhzrVar.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzhzrVar.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzhzrVar.zzn(i13, (zzhvi) obj);
                } else if (i12 == 3) {
                    zzhzrVar.zzt(i13);
                    ((zzhzd) obj).zzg(zzhzrVar);
                    zzhzrVar.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzhxc("Protocol message tag had invalid wire type."));
                    }
                    zzhzrVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzhvi zzhviVar = (zzhvi) this.zzd[i11];
            int iZzA = zzhvt.zzA(8);
            int iZzA2 = zzhvt.zzA(i12) + zzhvt.zzA(16);
            int iZzA3 = zzhvt.zzA(24);
            int iZzc = zzhviVar.zzc();
            iC = o2.c(iZzA + iZzA, iZzA2, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.b(iZzc, iZzc, iZzA3), iC);
        }
        this.zze = iC;
        return iC;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzA2 = zzhvt.zzA(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzhvi zzhviVar = (zzhvi) this.zzd[i11];
                    int iZzA4 = zzhvt.zzA(i15);
                    int iZzc = zzhviVar.zzc();
                    iZzA3 = zzhvt.zzA(iZzc) + iZzc + iZzA4 + iZzA3;
                } else if (i14 == 3) {
                    int iZzA5 = zzhvt.zzA(i13 << 3);
                    iZzA = iZzA5 + iZzA5;
                    iZzB = ((zzhzd) this.zzd[i11]).zzi();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzhxc("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzA2 = zzhvt.zzA(i13 << 3) + 4;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzA = zzhvt.zzA(i16);
                iZzB = zzhvt.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final void zzj(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzhyb.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzk(int i10, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final zzhzd zzm(zzhzd zzhzdVar) {
        if (zzhzdVar.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zzhzdVar.zzb;
        zzn(i10);
        System.arraycopy(zzhzdVar.zzc, 0, this.zzc, this.zzb, zzhzdVar.zzb);
        System.arraycopy(zzhzdVar.zzd, 0, this.zzd, this.zzb, zzhzdVar.zzb);
        this.zzb = i10;
        return this;
    }

    private zzhzd() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean zzl(int i10, zzhvn zzhvnVar) throws IOException {
        int iZza;
        zze();
        int i11 = i10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzk(i10, Integer.valueOf(zzhvnVar.zzj()));
                                return true;
                            }
                            throw new zzhxc(wHkgq.uxHiTsk);
                        }
                        zzhvnVar.zzI();
                        return false;
                    }
                    zzhzd zzhzdVar = new zzhzd();
                    do {
                        iZza = zzhvnVar.zza();
                        if (iZza == 0) {
                            break;
                        }
                    } while (zzhzdVar.zzl(iZza, zzhvnVar));
                    zzhvnVar.zzb(4 | ((i10 >>> 3) << 3));
                    zzk(i10, zzhzdVar);
                    return true;
                }
                zzk(i10, zzhvnVar.zzn());
                return true;
            }
            zzk(i10, Long.valueOf(zzhvnVar.zzi()));
            return true;
        }
        zzk(i10, Long.valueOf(zzhvnVar.zzg()));
        return true;
    }
}
