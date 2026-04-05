package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2682a7 extends Xc {

    /* renamed from: b, reason: collision with root package name */
    public final Class f32647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2682a7(Constructor<List<Object>> constructor, Class<Object> valueClass) {
        super(constructor);
        kotlin.jvm.internal.e0.checkNotNullParameter(constructor, "constructor");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueClass, "valueClass");
        this.f32647b = valueClass;
    }

    public final List<Object> b() {
        return (List) a().construct();
    }

    public final Class<Object> c() {
        return this.f32647b;
    }
}
