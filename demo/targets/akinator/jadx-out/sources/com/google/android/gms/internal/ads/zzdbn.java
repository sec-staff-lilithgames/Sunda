package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdbn implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdbp zzdbpVar = (zzdbp) this.zza.get();
        if (zzdbpVar != null) {
            zzdbpVar.zzs(zzdbm.zza);
        }
    }
}
