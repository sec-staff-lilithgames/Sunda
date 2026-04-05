package com.google.android.gms.internal.ads;

import com.ironsource.C3209f4;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdlu extends zzdlv {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdlu(zzffu zzffuVar, JSONObject jSONObject) {
        super(zzffuVar);
        this.zzb = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, C3209f4.f36683c, "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbp.zzk("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final JSONObject zza() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final boolean zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdlv
    public final zzfgq zzg() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfgq(jSONObject) : this.zza.zzV;
    }
}
