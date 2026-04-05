package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3494v8 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f39113a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.f39113a;
    }

    public C3494v8 a(String str, Object obj) {
        if (obj != null) {
            this.f39113a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
