package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ma, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3340ma {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
            }
        }
        return map;
    }
}
