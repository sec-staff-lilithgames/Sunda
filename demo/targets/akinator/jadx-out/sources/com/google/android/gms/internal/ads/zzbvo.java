package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbvo {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbvo(boolean z10, String str, boolean z11) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = z11;
    }

    public static zzbvo zza(JSONObject jSONObject) {
        return new zzbvo(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
