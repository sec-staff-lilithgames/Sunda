package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzffz {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzffz(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
        this.zzd = jSONObjectZzd;
        this.zza = jSONObjectZzd.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.zzb = jSONObjectZzd.optString(NyKZx.XNQM, null);
        this.zzc = jSONObjectZzd.optJSONObject("ad_json");
    }
}
