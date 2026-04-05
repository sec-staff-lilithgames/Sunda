package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzezs implements zzeya {
    private final JSONObject zza;

    public zzezs(Context context) {
        this.zza = zzbxf.zzb(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmW)).booleanValue() ? zzgui.zza(zzezq.zza) : zzgui.zza(new zzexy() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // com.google.android.gms.internal.ads.zzexy
            public final /* synthetic */ void zza(Object obj) throws JSONException {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
