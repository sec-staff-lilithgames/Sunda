package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Xc {

    /* renamed from: a, reason: collision with root package name */
    public Constructor f32516a;

    public Xc(Constructor constructor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(constructor, "constructor");
        this.f32516a = constructor;
    }

    public final Constructor<Object> a() {
        return this.f32516a;
    }

    public final void a(Constructor<Object> constructor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(constructor, "<set-?>");
        this.f32516a = constructor;
    }
}
