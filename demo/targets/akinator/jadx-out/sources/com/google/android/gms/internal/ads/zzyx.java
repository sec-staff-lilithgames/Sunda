package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzyx {
    private final Handler zza;
    private final zzyz zzb;
    private boolean zzc;

    public zzyx(Handler handler, zzyz zzyzVar) {
        this.zza = handler;
        this.zzb = zzyzVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    public final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzyz zzc() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
