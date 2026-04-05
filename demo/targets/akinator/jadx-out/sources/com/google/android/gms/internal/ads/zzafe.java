package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafe implements zzaev {
    public final String zza;

    private zzafe(String str) {
        this.zza = str;
    }

    public static zzafe zzb(zzeg zzegVar) {
        return new zzafe(zzegVar.zzK(zzegVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return 1852994675;
    }
}
