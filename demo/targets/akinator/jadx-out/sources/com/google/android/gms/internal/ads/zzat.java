package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzat(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzat zza(String str, Throwable th2) {
        return new zzat(str, th2, true, 0);
    }

    public static zzat zzb(String str, Throwable th2) {
        return new zzat(str, th2, true, 1);
    }

    public static zzat zzc(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z10 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + String.valueOf(z10).length() + strConcat.length() + 20 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z10);
        sb2.append(", dataType=");
        return a.b.f(i10, "}", sb2);
    }
}
