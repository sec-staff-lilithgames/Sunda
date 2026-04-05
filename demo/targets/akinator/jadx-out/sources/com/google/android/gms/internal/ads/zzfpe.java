package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import k6.l;
import k6.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfpe implements u {
    final /* synthetic */ zzfpg zza;

    public zzfpe(zzfpg zzfpgVar) {
        Objects.requireNonNull(zzfpgVar);
        this.zza = zzfpgVar;
    }

    @Override // k6.u
    public final void onPostMessage(WebView webView, l lVar, Uri uri, boolean z10, k6.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(lVar.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfor.zza.getClass();
            }
        } catch (JSONException e10) {
            zzfqp.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
