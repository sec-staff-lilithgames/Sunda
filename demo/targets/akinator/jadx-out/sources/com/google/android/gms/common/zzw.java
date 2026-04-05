package com.google.android.gms.common;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzw {
    private static final zzw zze = new zzw(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzw(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.zza = z10;
        this.zzd = i10;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(String str) {
        return new zzw(false, 1, 5, str, null);
    }

    public static zzw zzd(String str, Throwable th2) {
        return new zzw(false, 1, 5, str, th2);
    }

    public static zzw zzf(int i10) {
        return new zzw(true, i10, 1, null, null);
    }

    public static zzw zzg(int i10, int i11, String str, Throwable th2) {
        return new zzw(false, i10, i11, str, th2);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
