package com.unity3d.services.ads.token;

import org.json.JSONArray;
import org.json.JSONException;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    x0 getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}
