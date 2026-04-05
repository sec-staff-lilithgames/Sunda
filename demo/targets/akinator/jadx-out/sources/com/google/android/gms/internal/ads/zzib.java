package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzib extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzuu zzh;
    final boolean zzi;

    private zzib(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, null, false);
    }

    public static zzib zza(IOException iOException, int i10) {
        return new zzib(0, iOException, i10);
    }

    public static zzib zzb(Throwable th2, String str, int i10, zzv zzvVar, int i11, zzuu zzuuVar, boolean z10, int i12) {
        if (zzvVar == null) {
            i11 = 4;
        }
        return new zzib(1, th2, null, i12, str, i10, zzvVar, i11, zzuuVar, z10);
    }

    public static zzib zzc(RuntimeException runtimeException, int i10) {
        return new zzib(2, runtimeException, i10);
    }

    public final zzib zzd(zzuu zzuuVar) {
        String message = getMessage();
        String str = zzep.zza;
        return new zzib(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzuuVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzib(int i10, Throwable th2, String str, int i11, String str2, int i12, zzv zzvVar, int i13, zzuu zzuuVar, boolean z10) {
        String str3;
        int i14;
        String strO;
        String str4;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            strO = "Source error";
        } else if (i10 != 1) {
            strO = "Unexpected runtime error";
            str3 = str2;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzep.zza;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str4.length() + strValueOf.length() + o2.C(String.valueOf(str2).length() + 14, 9, String.valueOf(i12)) + 19);
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            strO = a.b.o(sb2, strValueOf, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strO : strO.concat(": null"), th2, i11, i10, str3, i14, zzvVar, i13, zzuuVar, SystemClock.elapsedRealtime(), z10);
    }

    private zzib(String str, Throwable th2, int i10, int i11, String str2, int i12, zzv zzvVar, int i13, zzuu zzuuVar, long j10, boolean z10) {
        boolean z11;
        super(str, th2, i10, Bundle.EMPTY, j10);
        if (!z10) {
            z11 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        zzgmd.zza(z11);
        zzgmd.zza(th2 != null);
        this.zzc = i11;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzvVar;
        this.zzg = i13;
        this.zzh = zzuuVar;
        this.zzi = z10;
    }
}
