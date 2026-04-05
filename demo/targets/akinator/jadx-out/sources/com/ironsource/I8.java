package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface I8 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(G8 g8);

        void onNativeAdShown();
    }

    void a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(J8 j82);

    a b();

    G8 c();
}
