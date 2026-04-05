package io.ktor.client.plugins.cache.storage;

import bv.d;
import bv.f;
import com.ironsource.C3191e4;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Set;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CachingCacheStorage implements CacheStorage {
    private final CacheStorage delegate;
    private final ConcurrentMap<Url, Set<CachedResponseData>> store;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0}, l = {43}, m = "find", n = {"this", "url", "varyKeys"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.find(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {53}, m = "findAll", n = {"this", "url"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39021 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C39021(zu.d<? super C39021> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.findAll(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {37, 38}, m = C3191e4.h.U, n = {"this", "url"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39031 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39031(zu.d<? super C39031> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.store(null, null, this);
        }
    }

    public CachingCacheStorage(CacheStorage delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.store = new ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object find(io.ktor.http.Url r6, java.util.Map<java.lang.String, java.lang.String> r7, zu.d<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.L$4
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r7 = r0.L$3
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r1 = r0.L$2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r0.L$1
            io.ktor.http.Url r2 = (io.ktor.http.Url) r2
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cache.storage.CachingCacheStorage r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) r0
            tu.a0.throwOnFailure(r8)
            goto L6c
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            tu.a0.throwOnFailure(r8)
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r8 = r5.store
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L72
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r8 = r5.store
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r5.delegate
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.L$4 = r6
            r0.label = r3
            java.lang.Object r0 = r2.findAll(r6, r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r2 = r6
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r5
        L6c:
            r7.put(r6, r8)
            r7 = r1
            r6 = r2
            goto L73
        L72:
            r0 = r5
        L73:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r8 = r0.store
            java.lang.Object r6 = uu.p1.getValue(r8, r6)
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L81:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lc5
            java.lang.Object r8 = r6.next()
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r0 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L95
            return r8
        L95:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L9d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r4 = r0.getVaryKeys()
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.e0.areEqual(r3, r2)
            if (r2 != 0) goto L9d
            goto L81
        Lc4:
            return r8
        Lc5:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.find(io.ktor.http.Url, java.util.Map, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object findAll(io.ktor.http.Url r5, zu.d<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C39021
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C39021) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.L$3
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r1 = r0.L$2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r0.L$1
            io.ktor.http.Url r2 = (io.ktor.http.Url) r2
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cache.storage.CachingCacheStorage r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) r0
            tu.a0.throwOnFailure(r6)
            goto L65
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            tu.a0.throwOnFailure(r6)
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r4.store
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L6a
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r4.store
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r4.delegate
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r0 = r2.findAll(r5, r0)
            if (r0 != r1) goto L61
            return r1
        L61:
            r2 = r5
            r1 = r6
            r6 = r0
            r0 = r4
        L65:
            r1.put(r5, r6)
            r5 = r2
            goto L6b
        L6a:
            r0 = r4
        L6b:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r0.store
            java.lang.Object r5 = uu.p1.getValue(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.findAll(io.ktor.http.Url, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object store(io.ktor.http.Url r7, io.ktor.client.plugins.cache.storage.CachedResponseData r8, zu.d<? super tu.x0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C39031
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C39031) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            io.ktor.http.Url r7 = (io.ktor.http.Url) r7
            java.lang.Object r8 = r0.L$0
            java.util.Map r8 = (java.util.Map) r8
            tu.a0.throwOnFailure(r9)
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$1
            io.ktor.http.Url r7 = (io.ktor.http.Url) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.client.plugins.cache.storage.CachingCacheStorage r8 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) r8
            tu.a0.throwOnFailure(r9)
            goto L5b
        L48:
            tu.a0.throwOnFailure(r9)
            io.ktor.client.plugins.cache.storage.CacheStorage r9 = r6.delegate
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r9.store(r7, r8, r0)
            if (r8 != r1) goto L5a
            goto L6b
        L5a:
            r8 = r6
        L5b:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r9 = r8.store
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = r8.delegate
            r0.L$0 = r9
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r8.findAll(r7, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r5 = r9
            r9 = r8
            r8 = r5
        L6f:
            r8.put(r7, r9)
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.store(io.ktor.http.Url, io.ktor.client.plugins.cache.storage.CachedResponseData, zu.d):java.lang.Object");
    }
}
