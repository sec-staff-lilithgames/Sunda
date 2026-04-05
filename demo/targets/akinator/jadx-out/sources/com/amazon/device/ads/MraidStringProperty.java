package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class MraidStringProperty extends MraidProperty {
    public String value;

    public MraidStringProperty(String str) {
        super(str);
    }

    @Override // com.amazon.device.ads.MraidProperty
    public void formJSON(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.name, getValue());
    }

    public String getValue() {
        return this.value;
    }
}
