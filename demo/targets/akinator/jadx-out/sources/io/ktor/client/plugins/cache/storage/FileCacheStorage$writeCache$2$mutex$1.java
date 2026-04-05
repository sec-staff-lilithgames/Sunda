package io.ktor.client.plugins.cache.storage;

import kotlin.jvm.internal.f0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FileCacheStorage$writeCache$2$mutex$1 extends f0 implements a {
    public static final FileCacheStorage$writeCache$2$mutex$1 INSTANCE = new FileCacheStorage$writeCache$2$mutex$1();

    public FileCacheStorage$writeCache$2$mutex$1() {
        super(0);
    }

    @Override // kv.a
    public final Mutex invoke() {
        return MutexKt.Mutex$default(false, 1, null);
    }
}
