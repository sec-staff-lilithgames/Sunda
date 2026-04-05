package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdkh implements zzblx {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        zzdkk zzdkkVar = (zzdkk) this.zza.get();
        if (zzdkkVar == null) {
            return;
        }
        zzdkkVar.zzD().onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlM)).booleanValue()) {
            zzdkkVar.zzE().zzdz();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdkkVar.zzE().zzdV();
        }
    }
}
