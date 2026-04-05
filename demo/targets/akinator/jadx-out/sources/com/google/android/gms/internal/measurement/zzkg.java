package com.google.android.gms.internal.measurement;

import android.net.Uri;
import mh.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzkg {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzkg(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, v0 v0Var) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z10;
        this.zze = z12;
    }

    public final zzkg zza() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkg(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzkg zzb() {
        return new zzkg(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzkm zzc(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = zzkm.zzc;
        return new zzkc(this, str, lValueOf, true);
    }

    public final zzkm zzd(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i10 = zzkm.zzc;
        return new zzkd(this, str, boolValueOf, true);
    }

    public final zzkm zze(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = zzkm.zzc;
        return new zzke(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final zzkm zzf(String str, String str2) {
        int i10 = zzkm.zzc;
        return new zzkf(this, str, str2, true);
    }

    public zzkg(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
