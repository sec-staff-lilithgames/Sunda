package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbkm implements zzblx {
    private final zzbkn zza;

    public zzbkm(zzbkn zzbknVar) {
        this.zza = zzbknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZzl = null;
        if (map.containsKey("info")) {
            try {
                bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(new JSONObject((String) map.get("info")));
            } catch (JSONException e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundleZzl != null) {
            this.zza.zza(str, bundleZzl);
        } else {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to convert ad metadata to Bundle.");
        }
    }
}
