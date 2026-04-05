package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbmq implements zzblx {
    private final zzbmp zza;

    public zzbmq(zzbmp zzbmpVar) {
        this.zza = zzbmpVar;
    }

    public static void zzb(zzcgy zzcgyVar, zzbmp zzbmpVar) {
        zzcgyVar.zzab("/reward", new zzbmq(zzbmpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzbyh zzbyhVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbyhVar = new zzbyh(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e10);
        }
        this.zza.zzb(zzbyhVar);
    }
}
