package com.google.android.gms.internal.play_billing;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzjk {
    private static final zzjk zza = new zzjk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjk(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzjk zzc() {
        return zza;
    }

    public static zzjk zze(zzjk zzjkVar, zzjk zzjkVar2) {
        int i10 = zzjkVar.zzb + zzjkVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzjkVar.zzc, i10);
        System.arraycopy(zzjkVar2.zzc, 0, iArrCopyOf, zzjkVar.zzb, zzjkVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzjkVar.zzd, i10);
        System.arraycopy(zzjkVar2.zzd, 0, objArrCopyOf, zzjkVar.zzb, zzjkVar2.zzb);
        return new zzjk(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzjk zzf() {
        return new zzjk(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
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
        if (obj == null || !(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        int i10 = this.zzb;
        if (i10 == zzjkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjkVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjkVar.zzd;
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

    public final int zza() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzz3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzz2 = zzgr.zzz(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzgk zzgkVar = (zzgk) this.zzd[i11];
                    int iZzz4 = zzgr.zzz(i15);
                    int iZzd = zzgkVar.zzd();
                    iZzz3 = zzgr.zzz(iZzd) + iZzd + iZzz4 + iZzz3;
                } else if (i14 == 3) {
                    int iZzz5 = zzgr.zzz(i13 << 3);
                    iZzz = iZzz5 + iZzz5;
                    iZzA = ((zzjk) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzz2 = zzgr.zzz(i13 << 3) + 4;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzz = zzgr.zzz(i16);
                iZzA = zzgr.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzgk zzgkVar = (zzgk) this.zzd[i11];
            int iZzz = zzgr.zzz(8);
            int iZzz2 = zzgr.zzz(i12) + zzgr.zzz(16);
            int iZzz3 = zzgr.zzz(24);
            int iZzd = zzgkVar.zzd();
            iC = o2.c(iZzz + iZzz, iZzz2, a.b(iZzd, iZzd, iZzz3), iC);
        }
        this.zze = iC;
        return iC;
    }

    public final zzjk zzd(zzjk zzjkVar) {
        if (zzjkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzjkVar.zzb;
        zzm(i10);
        System.arraycopy(zzjkVar.zzc, 0, this.zzc, this.zzb, zzjkVar.zzb);
        System.arraycopy(zzjkVar.zzd, 0, this.zzd, this.zzb, zzjkVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzio.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzjw zzjwVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzjwVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzjw zzjwVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzjwVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzjwVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzjwVar.zzd(i13, (zzgk) obj);
                } else if (i12 == 3) {
                    zzjwVar.zzF(i13);
                    ((zzjk) obj).zzl(zzjwVar);
                    zzjwVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    zzjwVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzjk() {
        this(0, new int[8], new Object[8], true);
    }
}
