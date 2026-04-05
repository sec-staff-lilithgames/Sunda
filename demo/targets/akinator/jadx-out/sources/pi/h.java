package pi;

import hi.t0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f81407a;

    public h(t0 t0Var) {
        this.f81407a = t0Var;
    }

    public d parseSettingsJson(JSONObject jSONObject) throws JSONException {
        i mVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            ei.f.getLogger().e("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
            mVar = new b();
        } else {
            mVar = new m();
        }
        return mVar.buildFromJson(this.f81407a, jSONObject);
    }
}
