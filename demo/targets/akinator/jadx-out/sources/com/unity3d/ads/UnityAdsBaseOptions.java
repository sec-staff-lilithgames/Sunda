package com.unity3d.ads;

import com.unity3d.services.core.log.DeviceLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class UnityAdsBaseOptions {
    private String OBJECT_ID = "objectId";
    private JSONObject _data = new JSONObject();

    public JSONObject getData() {
        return this._data;
    }

    public String getObjectId() {
        try {
            return this._data.getString(this.OBJECT_ID);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void set(String str, String str2) throws JSONException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            this._data.put(str, str2);
        } catch (JSONException e10) {
            DeviceLog.exception("Failed to set Unity Ads options", e10);
        }
    }

    public void setObjectId(String str) throws JSONException {
        set(this.OBJECT_ID, str);
    }
}
