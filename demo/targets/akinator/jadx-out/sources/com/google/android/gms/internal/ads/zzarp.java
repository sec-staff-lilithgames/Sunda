package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzarp extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzarp(zzaro zzaroVar, zzarm zzarmVar, long j10) {
        int i10 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i10];
        objArr[0] = Long.valueOf(zzaroVar.zza());
        objArr[1] = Long.valueOf(zzarmVar.zza());
        int i11 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j10);
        objArr[i11] = lValueOf;
        super(String.format(locale, zzase.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzarmVar);
        Optional.of(lValueOf);
    }

    public zzarp(zzaro zzaroVar, Throwable th2) {
        super(String.format(Locale.US, zzase.zza("bk0="), Long.valueOf(zzaroVar.zza())), th2);
        Optional.empty();
        Optional.empty();
    }
}
