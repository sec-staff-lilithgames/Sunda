package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3431rd implements C0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f38294a;

    public C3431rd(String placementName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        this.f38294a = placementName;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        HashMap map = new HashMap();
        map.put("placement", this.f38294a);
        return map;
    }
}
