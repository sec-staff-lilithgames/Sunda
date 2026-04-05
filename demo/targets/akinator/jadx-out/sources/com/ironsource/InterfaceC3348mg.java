package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.mg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3348mg {
    void a() throws C3399pe;

    default void a(boolean z10, kv.a lazyError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lazyError, "lazyError");
        if (!z10) {
            throw new C3399pe((IronSourceError) lazyError.invoke());
        }
    }
}
