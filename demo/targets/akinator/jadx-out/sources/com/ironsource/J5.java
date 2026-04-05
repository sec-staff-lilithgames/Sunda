package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class J5 implements C0 {
    public final Map<String, Object> a(C3205f0 adProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = adProperties.a().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adProperties.adFormat.toString()");
        map.put(C3144bb.f36069f, string);
        map.put("adf", Integer.valueOf(C3518wf.c(adProperties.a())));
        String string2 = adProperties.b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "adProperties.adId.toString()");
        map.put(C3144bb.f36072i, string2);
        map.put("mediationAdUnitId", adProperties.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
