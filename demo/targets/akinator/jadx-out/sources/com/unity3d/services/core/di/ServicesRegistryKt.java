package com.unity3d.services.core.di;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(l registry) {
        e0.checkNotNullParameter(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
