package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {
    public static r0 a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        HashMap map = iAConfigManager.f23207b;
        if (map != null && map.containsKey(str)) {
            return (r0) iAConfigManager.f23207b.get(str);
        }
        IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }
}
