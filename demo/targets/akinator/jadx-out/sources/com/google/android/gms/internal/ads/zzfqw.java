package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqw {
    private JSONObject zza;
    private final zzfrf zzb;

    public zzfqw(zzfrf zzfrfVar) {
        this.zzb = zzfrfVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfri(this, hashSet, jSONObject, j10));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfrh(this, hashSet, jSONObject, j10));
    }

    public final void zzc() {
        this.zzb.zza(new zzfrg(this));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
