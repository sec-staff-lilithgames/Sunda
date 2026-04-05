package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Nb {
    public final void a(Map<String, String> map, boolean z10) {
        if (z10 && TextUtils.isEmpty(com.ironsource.mediationsdk.r.m().p()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.a(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.ironsource.mediationsdk.r.m().g(str);
                    return;
                }
            }
        }
    }
}
