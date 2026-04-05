package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ExperimentObject {
    private static final String APPLIED_KEY = "applied";
    private static final String VALUE_KEY = "value";
    private final JSONObject _experimentData;

    public ExperimentObject(JSONObject jSONObject) {
        this._experimentData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public ExperimentAppliedRule getAppliedRule() {
        ExperimentAppliedRule experimentAppliedRule = ExperimentAppliedRule.NEXT;
        String strOptString = this._experimentData.optString(APPLIED_KEY);
        if (strOptString.isEmpty()) {
            return experimentAppliedRule;
        }
        try {
            return ExperimentAppliedRule.valueOf(strOptString.toUpperCase());
        } catch (IllegalArgumentException unused) {
            return experimentAppliedRule;
        }
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean("value");
    }

    public String getStringValue() {
        return this._experimentData.optString("value");
    }
}
