package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzccp implements Runnable {
    final /* synthetic */ zzccv zza;

    public zzccp(zzccv zzccvVar) {
        Objects.requireNonNull(zzccvVar);
        this.zza = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccv zzccvVar = this.zza;
        if (zzccvVar.zzt() != null) {
            zzccvVar.zzt().zza();
        }
    }
}
