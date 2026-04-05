package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcqm implements zzifh {
    private final zzifq zza;

    private zzcqm(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzcqm zza(zzifq zzifqVar) {
        return new zzcqm(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcuf) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
