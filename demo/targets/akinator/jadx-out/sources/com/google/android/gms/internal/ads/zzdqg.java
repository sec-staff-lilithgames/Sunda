package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqg implements zzblx {
    private final zzbjm zza;
    private final zzdqt zzb;
    private final zzifb zzc;

    public zzdqg(zzdma zzdmaVar, zzdlq zzdlqVar, zzdqt zzdqtVar, zzifb zzifbVar) {
        this.zza = zzdmaVar.zzg(zzdlqVar.zzS());
        this.zzb = zzdqtVar;
        this.zzc = zzifbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbjc) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            String strO = a.b.o(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strO, e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
