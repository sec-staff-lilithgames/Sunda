package com.bytedance.sdk.component.adexpress.cm;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    public static boolean jd(String str) {
        return com.bytedance.sdk.component.adexpress.cm.jd() && jpo(str);
    }

    public static boolean jpo(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
