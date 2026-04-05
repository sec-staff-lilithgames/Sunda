package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzpd {
    final String zza;
    long zzb;

    public /* synthetic */ zzpd(zzpg zzpgVar, String str, byte[] bArr) {
        this(zzpgVar, str);
    }

    private zzpd(zzpg zzpgVar, String str) {
        Objects.requireNonNull(zzpgVar);
        this.zza = str;
        this.zzb = zzpgVar.zzaZ().elapsedRealtime();
    }

    public /* synthetic */ zzpd(zzpg zzpgVar, byte[] bArr) {
        this(zzpgVar, zzpgVar.zzt().zzaw());
    }
}
