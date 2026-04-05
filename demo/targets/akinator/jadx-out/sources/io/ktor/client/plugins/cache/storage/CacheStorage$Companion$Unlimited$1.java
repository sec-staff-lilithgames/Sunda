package io.ktor.client.plugins.cache.storage;

import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CacheStorage$Companion$Unlimited$1 extends f0 implements a {
    public static final CacheStorage$Companion$Unlimited$1 INSTANCE = new CacheStorage$Companion$Unlimited$1();

    public CacheStorage$Companion$Unlimited$1() {
        super(0);
    }

    @Override // kv.a
    public final UnlimitedStorage invoke() {
        return new UnlimitedStorage();
    }
}
