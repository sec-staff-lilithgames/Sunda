package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdki implements zzblx {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdki(zzdkk zzdkkVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdkkVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznV)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        zzdkk zzdkkVar = (zzdkk) this.zza.get();
        if (zzdkkVar == null) {
            return;
        }
        zzdkkVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznV)).booleanValue()) {
            zzdkkVar.zzB((View) this.zzb.get());
        }
    }
}
