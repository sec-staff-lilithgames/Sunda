package com.unity3d.ads;

import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = "adMarkup";

    public void setAdMarkup(String str) throws JSONException {
        set(this.AD_MARKUP, str);
    }
}
