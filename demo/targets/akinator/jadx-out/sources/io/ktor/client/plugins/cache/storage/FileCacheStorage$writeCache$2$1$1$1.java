package io.ktor.client.plugins.cache.storage;

import bv.f;
import bv.n;
import io.ktor.utils.io.ByteChannel;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", f = "FileCacheStorage.kt", i = {}, l = {96, 98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class FileCacheStorage$writeCache$2$1$1$1 extends n implements p {
    final /* synthetic */ List<CachedResponseData> $caches;
    final /* synthetic */ ByteChannel $channel;
    Object L$0;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2$1$1$1(ByteChannel byteChannel, List<CachedResponseData> list, FileCacheStorage fileCacheStorage, d<? super FileCacheStorage$writeCache$2$1$1$1> dVar) {
        super(2, dVar);
        this.$channel = byteChannel;
        this.$caches = list;
        this.this$0 = fileCacheStorage;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new FileCacheStorage$writeCache$2$1$1$1(this.$channel, this.$caches, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r6.writeInt(r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r5.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            tu.a0.throwOnFailure(r6)
            goto L3d
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            tu.a0.throwOnFailure(r6)
            goto L36
        L22:
            tu.a0.throwOnFailure(r6)
            io.ktor.utils.io.ByteChannel r6 = r5.$channel
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> r1 = r5.$caches
            int r1 = r1.size()
            r5.label = r3
            java.lang.Object r6 = r6.writeInt(r1, r5)
            if (r6 != r0) goto L36
            goto L57
        L36:
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> r6 = r5.$caches
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
        L3d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r1.next()
            io.ktor.client.plugins.cache.storage.CachedResponseData r6 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r6
            io.ktor.client.plugins.cache.storage.FileCacheStorage r3 = r5.this$0
            io.ktor.utils.io.ByteChannel r4 = r5.$channel
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = io.ktor.client.plugins.cache.storage.FileCacheStorage.access$writeCache(r3, r4, r6, r5)
            if (r6 != r0) goto L3d
        L57:
            return r0
        L58:
            io.ktor.utils.io.ByteChannel r6 = r5.$channel
            io.ktor.utils.io.ByteWriteChannelKt.close(r6)
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((FileCacheStorage$writeCache$2$1$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
