package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzedp implements zzfjx {
    static final /* synthetic */ zzedp zza = new zzedp();

    private /* synthetic */ zzedp() {
    }

    @Override // com.google.android.gms.internal.ads.zzfjx
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
