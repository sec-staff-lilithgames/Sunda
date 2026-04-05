package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    public static String jpo(String str) {
        if (!com.bytedance.sdk.component.utils.prr.cm() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.yd ydVar = new com.bytedance.sdk.openadsdk.core.model.yd(com.bytedance.sdk.openadsdk.core.zz.jd().au());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = ydVar.jd().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append(C3191e4.i.f36527c);
                    sb2.append(ydVar.jpo());
                } else {
                    sb2.append("?");
                    sb2.append(ydVar.jpo());
                }
            }
        }
        return sb2.toString();
    }
}
