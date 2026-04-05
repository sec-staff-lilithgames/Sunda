package com.amazon.device.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class OrientationProperty extends MraidProperty {
    public boolean allowOrientationChange;
    public boolean forceOrientation;

    public OrientationProperty(Map<String, String> map) {
        super("orientationProperty");
        this.allowOrientationChange = Boolean.parseBoolean(map.get("allowOrientationChange"));
        this.forceOrientation = Boolean.parseBoolean(map.get("forceOrientation"));
    }

    @Override // com.amazon.device.ads.MraidProperty
    public void formJSON(JSONObject jSONObject) throws JSONException {
    }
}
