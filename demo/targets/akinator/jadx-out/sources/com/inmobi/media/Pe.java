package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Pe {

    /* renamed from: a, reason: collision with root package name */
    public final byte f32140a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f32141b = new LinkedHashMap();

    public Pe(byte b10) {
        this.f32140a = b10;
    }

    public final Object a(String key, Class classType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(classType, "classType");
        Object obj = this.f32141b.get(key);
        if (classType.isInstance(obj)) {
            return classType.cast(obj);
        }
        return null;
    }
}
