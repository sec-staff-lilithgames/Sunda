package pi;

import com.sfbx.appconsent.core.BuildConfig;
import hi.f0;
import org.json.JSONException;
import org.json.JSONObject;
import pi.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m implements i {
    @Override // pi.i
    public d buildFromJson(f0 f0Var, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", BuildConfig.VERSION_CODE);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        d.b bVar = jSONObject.has("session") ? new d.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4) : new d.b(new JSONObject().optInt("max_custom_exception_events", 8), 4);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new d(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt2 * 1000) + f0Var.getCurrentTimeMillis(), bVar, new d.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), iOptInt, iOptInt2, dOptDouble, dOptDouble2, iOptInt3);
    }
}
