package dk;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract f build();

        public abstract a setParameterKey(String str);

        public abstract a setParameterValue(String str);

        public abstract a setRolloutId(String str);

        public abstract a setTemplateVersion(long j10);

        public abstract a setVariantId(String str);
    }

    static {
        new wi.e().configureWith(b.f52356a).build();
    }

    public static a builder() {
        return new c();
    }

    public static f create(JSONObject jSONObject) throws JSONException {
        return builder().setRolloutId(jSONObject.getString("rolloutId")).setVariantId(jSONObject.getString("variantId")).setParameterKey(jSONObject.getString("parameterKey")).setParameterValue(jSONObject.getString("parameterValue")).setTemplateVersion(jSONObject.getLong("templateVersion")).build();
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public static f create(String str) throws JSONException {
        return create(new JSONObject(str));
    }
}
