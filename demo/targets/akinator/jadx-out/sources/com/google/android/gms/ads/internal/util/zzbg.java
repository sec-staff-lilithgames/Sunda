package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzaqd;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbg implements zzapy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapy
    public final void zza(zzaqd zzaqdVar) {
        String str = this.zza;
        String string = zzaqdVar.toString();
        String strR = o2.r(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strR);
        this.zzb.zza((Object) null);
    }
}
