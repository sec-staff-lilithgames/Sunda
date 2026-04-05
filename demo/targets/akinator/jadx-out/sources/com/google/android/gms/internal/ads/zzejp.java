package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzejp implements zzehm {
    private final zzdsy zza;

    public zzejp(zzdsy zzdsyVar) {
        this.zza = zzdsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final zzehn zza(String str, JSONObject jSONObject) throws zzfgu {
        return new zzehn(this.zza.zza(str, jSONObject), new zzeiz(), str);
    }
}
