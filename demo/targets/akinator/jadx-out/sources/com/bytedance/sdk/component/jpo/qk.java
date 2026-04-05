package com.bytedance.sdk.component.jpo;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class qk {
    private yd jpo;

    private qk(yd ydVar) {
        this.jpo = ydVar;
    }

    public static qk jpo(yd ydVar) {
        return new qk(ydVar);
    }

    public <T> T jpo(String str, Type type) throws JSONException {
        jpo(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.jpo.jpo(str, type);
    }

    public <T> String jpo(T t10) {
        String string;
        if (t10 == null) {
            return "{}";
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.jpo.jpo(t10);
        } else {
            string = t10.toString();
        }
        jpo(string);
        return string;
    }

    private static void jpo(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        xyk.jpo(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
