package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class IronSourceQaProperties {

    /* renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f38841a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, String> f38842b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f38841a == null) {
            f38841a = new IronSourceQaProperties();
        }
        return f38841a;
    }

    public static boolean isInitialized() {
        return f38841a != null;
    }

    public Map<String, String> getParameters() {
        return f38842b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f38842b.put(str, str2);
    }
}
