package com.google.android.gms.internal.ads;

import com.ironsource.C3284j8;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcdb implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcdf zzb;

    public zzcdb(zzcdf zzcdfVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzcdfVar);
        this.zzb = zzcdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{C3284j8.f37010k, String.valueOf(this.zza)});
    }
}
