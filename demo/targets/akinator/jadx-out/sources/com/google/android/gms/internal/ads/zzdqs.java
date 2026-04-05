package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdqs implements zzblx {
    final /* synthetic */ zzdqt zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzblx zzd;

    public /* synthetic */ zzdqs(zzdqt zzdqtVar, WeakReference weakReference, String str, zzblx zzblxVar, byte[] bArr) {
        Objects.requireNonNull(zzdqtVar);
        this.zza = zzdqtVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzblxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
