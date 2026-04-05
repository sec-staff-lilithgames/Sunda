package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import i2.hQ.aTNDubNmpwAqdU;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i10, int i11, int i12, byte[] bArr, int i13, int i14, byte[] bArr2) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
        this.zzf = i13;
        this.zzg = i14;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zza(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i10 = zziVar.zzb;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = zziVar.zzc;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = zziVar.zzd;
        if ((i12 != -1 && i12 != 3) || zziVar.zze != null) {
            return false;
        }
        int i13 = zziVar.zzg;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = zziVar.zzf;
        return i14 == -1 || i14 == 8;
    }

    @Pure
    public static int zzb(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzc(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? o2.l(i10, "Undefined color space ", new StringBuilder(String.valueOf(i10).length() + 22)) : "BT601" : aTNDubNmpwAqdU.YrPxbhMbmryPs : "BT2020" : "Unset color space";
    }

    private static String zzi(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? o2.l(i10, "Undefined color transfer ", new StringBuilder(String.valueOf(i10).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    private static String zzj(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? o2.l(i10, "Undefined color range ", new StringBuilder(String.valueOf(i10).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.zzf;
        int i11 = this.zzd;
        int i12 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i12);
        String strZzi = zzi(i11);
        String strF = i10 != -1 ? a.b.f(i10, "bit Luma", new StringBuilder(String.valueOf(i10).length() + 8)) : "NA";
        int i13 = this.zzg;
        String strF2 = i13 != -1 ? a.b.f(i13, "bit Chroma", new StringBuilder(String.valueOf(i13).length() + 10)) : "NA";
        boolean z10 = this.zze != null;
        StringBuilder sb2 = new StringBuilder(o2.C(o2.C(o2.C(o2.C(strZzh.length() + 12, 2, strZzj) + strZzi.length() + 2, 2, String.valueOf(z10)), 2, strF), 1, strF2));
        sb2.append("ColorInfo(");
        sb2.append(strZzh);
        sb2.append(", ");
        sb2.append(strZzj);
        sb2.append(", ");
        sb2.append(strZzi);
        sb2.append(", ");
        sb2.append(z10);
        com.google.android.gms.internal.play_billing.a.B(sb2, ", ", strF, ", ", strF2);
        sb2.append(")");
        return sb2.toString();
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        boolean zZzf = zzf();
        String str2 = QGjYBESwAiCc.bUMsT;
        if (zZzf) {
            String strZzh = zzh(this.zzb);
            String strZzj = zzj(this.zzc);
            String strZzi = zzi(this.zzd);
            String str3 = zzep.zza;
            Locale locale = Locale.US;
            str = strZzh + str2 + strZzj + str2 + strZzi;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i10 = this.zzf;
            int i11 = this.zzg;
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i10, 1) + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append(str2);
            sb2.append(i11);
            string = sb2.toString();
        } else {
            string = "NA/NA";
        }
        return a.b.o(new StringBuilder(string.length() + str.length() + 1), str, str2, string);
    }
}
