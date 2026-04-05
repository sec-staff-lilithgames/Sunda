package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class AabEntity implements Serializable, NoProGuard {
    private static final String TAG = "AabEntity";
    public int h3c;
    public int hlp;

    public static AabEntity parser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            AabEntity aabEntity = new AabEntity();
            if (jSONObject.has("hlp")) {
                aabEntity.setHlp(jSONObject.optInt("hlp"));
            }
            if (jSONObject.has("h3c")) {
                aabEntity.setH3c(jSONObject.optInt("h3c"));
            }
            return aabEntity;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return null;
        }
    }

    public int getH3c() {
        return this.h3c;
    }

    public int getHlp() {
        return this.hlp;
    }

    public void setH3c(int i10) {
        this.h3c = i10;
    }

    public void setHlp(int i10) {
        this.hlp = i10;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.hlp);
            jSONObject.put("h3c", this.h3c);
            return jSONObject;
        } catch (JSONException e10) {
            p0.b(TAG, e10.getMessage());
            return jSONObject;
        }
    }
}
