package com.unity3d.ads.injection;

import kotlin.jvm.internal.e0;
import kv.a;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Factory<T> implements o {
    private final a initializer;

    public Factory(a initializer) {
        e0.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // tu.o
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    @Override // tu.o
    public boolean isInitialized() {
        return false;
    }
}
