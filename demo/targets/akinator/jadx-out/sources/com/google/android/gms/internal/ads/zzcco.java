package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcco implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzccv zzc;

    public zzcco(zzccv zzccvVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzccvVar);
        this.zzc = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccv zzccvVar = this.zzc;
        if (zzccvVar.zzt() != null) {
            zzccvVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
