package com.unity3d.services.core.di;

import kotlin.jvm.internal.e0;
import kv.a;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ServiceFactoryKt {
    public static final <T> o factoryOf(a initializer) {
        e0.checkNotNullParameter(initializer, "initializer");
        return new Factory(initializer);
    }
}
