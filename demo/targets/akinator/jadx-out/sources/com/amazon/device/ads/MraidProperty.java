package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class MraidProperty {
    public String name;
    public static final StateProperty STATE_LOADING_PROPERTY = new StateProperty(MraidStateType.LOADING);
    public static final StateProperty STATE_DEFAULT_PROPERTY = new StateProperty(MraidStateType.DEFAULT);
    public static final StateProperty STATE_HIDDEN_PROPERTY = new StateProperty(MraidStateType.HIDDEN);
    public static final StateProperty STATE_RESIZED_PROPERTY = new StateProperty(MraidStateType.RESIZED);
    public static final StateProperty STATE_EXPANDED_PROPERTY = new StateProperty(MraidStateType.EXPANDED);
    public static final SupportsProperty SUPPORTS_PROPERTY = new SupportsProperty();

    public MraidProperty(String str) {
        this.name = str;
    }

    public abstract void formJSON(JSONObject jSONObject) throws JSONException;

    public String getName() {
        return this.name;
    }
}
