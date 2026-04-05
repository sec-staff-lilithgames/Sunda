package io.ktor.client.plugins.cache.storage;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.Url;
import io.ktor.util.CryptoKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import java.io.File;
import java.security.MessageDigest;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kv.p;
import sv.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class FileCacheStorage implements CacheStorage {
    private final File directory;
    private final CoroutineDispatcher dispatcher;
    private final ConcurrentMap<String, Mutex> mutexes;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {81}, m = "find", n = {"varyKeys"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.find(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {}, l = {77}, m = "findAll", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39041 extends d {
        int label;
        /* synthetic */ Object result;

        public C39041(zu.d<? super C39041> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.findAll(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {202, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "readCache", n = {"this", "urlHex", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "closed$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "caches", "closed$iv", "requestsCount", "i", "$this$withLock_u24default$iv", "$this$use$iv", "caches", "closed$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39051 extends d {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C39051(zu.d<? super C39051> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((String) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {159, 160, 160, 161, 162, 165, 166, 169, 170, 171, 172, 175, 176, 180, 182}, m = "readCache", n = {"channel", "channel", "url", "channel", "url", "channel", "url", "status", "channel", "url", "status", "version", "channel", "url", "status", "version", "headers", "headersCount", "j", "channel", "url", "status", "version", "headers", C3191e4.h.W, "headersCount", "j", "channel", "url", "status", "version", "headers", "channel", "url", "status", "version", "headers", "requestTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "varyKeysCount", "j", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", C3191e4.h.W, "varyKeysCount", "j", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "body"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3, reason: invalid class name */
    public static final class AnonymousClass3 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(zu.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((ByteReadChannel) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend", n = {"urlHex"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ CachedResponseData $data;
        final /* synthetic */ Url $url;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Url url, CachedResponseData cachedResponseData, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$url = url;
            this.$data = cachedResponseData;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return FileCacheStorage.this.new AnonymousClass2(this.$url, this.$data, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        
            if (r3.writeCache(r1, (java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData>) r9, r8) == r0) goto L21;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r9)
                goto L7a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.L$0
                java.lang.String r1 = (java.lang.String) r1
                tu.a0.throwOnFailure(r9)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r9)
                io.ktor.client.plugins.cache.storage.FileCacheStorage r9 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this
                io.ktor.http.Url r1 = r8.$url
                java.lang.String r1 = io.ktor.client.plugins.cache.storage.FileCacheStorage.access$key(r9, r1)
                io.ktor.client.plugins.cache.storage.FileCacheStorage r9 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = io.ktor.client.plugins.cache.storage.FileCacheStorage.access$readCache(r9, r1, r8)
                if (r9 != r0) goto L3a
                goto L79
            L3a:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                io.ktor.client.plugins.cache.storage.CachedResponseData r3 = r8.$data
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r9 = r9.iterator()
            L47:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L66
                java.lang.Object r5 = r9.next()
                r6 = r5
                io.ktor.client.plugins.cache.storage.CachedResponseData r6 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r6
                java.util.Map r6 = r6.getVaryKeys()
                java.util.Map r7 = r3.getVaryKeys()
                boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r7)
                if (r6 != 0) goto L47
                r4.add(r5)
                goto L47
            L66:
                io.ktor.client.plugins.cache.storage.CachedResponseData r9 = r8.$data
                java.util.List r9 = uu.y0.plus(r4, r9)
                io.ktor.client.plugins.cache.storage.FileCacheStorage r3 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this
                r4 = 0
                r8.L$0 = r4
                r8.label = r2
                java.lang.Object r9 = io.ktor.client.plugins.cache.storage.FileCacheStorage.access$writeCache(r3, r1, r9, r8)
                if (r9 != r0) goto L7a
            L79:
                return r0
            L7a:
                tu.x0 r9 = tu.x0.f87415a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 1}, l = {202, 102}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39062 extends n implements p {
        final /* synthetic */ List<CachedResponseData> $caches;
        final /* synthetic */ String $urlHex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39062(String str, List<CachedResponseData> list, zu.d<? super C39062> dVar) {
            super(2, dVar);
            this.$urlHex = str;
            this.$caches = list;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C39062 c39062 = FileCacheStorage.this.new C39062(this.$urlHex, this.$caches, dVar);
            c39062.L$0 = obj;
            return c39062;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(9:(1:67)|(1:(1:(8:6|56|7|8|27|28|50|51)(2:11|12))(1:13))(3:14|(1:17)|25)|65|21|22|60|23|(5:26|27|28|50|51)|25)|18|63|19|54|20|(2:(0)|(1:62))) */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.C39062.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
            return ((C39062) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, 139, 141, 143, 144, 146, 147, 148, 149, 151, 152, 154, ModuleDescriptor.MODULE_VERSION}, m = "writeCache", n = {"channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "headers", "channel", "cache", "value", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "value", "channel", "cache", "channel", "cache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$3, reason: invalid class name and case insensitive filesystem */
    public static final class C39073 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C39073(zu.d<? super C39073> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.writeCache((ByteChannel) null, (CachedResponseData) null, this);
        }
    }

    public FileCacheStorage(File directory, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(directory, "directory");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        this.directory = directory;
        this.dispatcher = dispatcher;
        this.mutexes = new ConcurrentMap<>(0, 1, null);
        directory.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String key(Url url) {
        byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(k0.encodeToByteArray(url.toString()));
        e0.checkNotNullExpressionValue(bArrDigest, "getInstance(\"MD5\").diges…ng().encodeToByteArray())");
        return CryptoKt.hex(bArrDigest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:51:0x0127, B:59:0x015c, B:49:0x0114), top: B:89:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c A[Catch: all -> 0x0157, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:51:0x0127, B:59:0x015c, B:49:0x0114), top: B:89:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0142 -> B:55:0x014b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readCache(java.lang.String r18, zu.d<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeCache(String str, List<CachedResponseData> list, zu.d<Object> dVar) {
        return CoroutineScopeKt.coroutineScope(new C39062(str, list, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object find(io.ktor.http.Url r6, java.util.Map<java.lang.String, java.lang.String> r7, zu.d<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            tu.a0.throwOnFailure(r8)
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            tu.a0.throwOnFailure(r8)
            java.lang.String r6 = r5.key(r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r5.readCache(r6, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L50:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r6.next()
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r0 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L64
            return r8
        L64:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r4 = r0.getVaryKeys()
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.e0.areEqual(r3, r2)
            if (r2 != 0) goto L6c
            goto L50
        L93:
            return r8
        L94:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.find(io.ktor.http.Url, java.util.Map, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object findAll(io.ktor.http.Url r5, zu.d<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.C39041
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.C39041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r6)
            java.lang.String r5 = r4.key(r5)
            r0.label = r3
            java.lang.Object r6 = r4.readCache(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r5 = uu.y0.toSet(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.findAll(io.ktor.http.Url, zu.d):java.lang.Object");
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new AnonymousClass2(url, cachedResponseData, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a9, code lost:
    
        if (r2.writeInt(r11, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0273, code lost:
    
        if (r10.writeInt(r11, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x030e, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.writeFully(r10, r9, r0) != r1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[PHI: r9 r10
      0x00df: PHI (r9v12 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r9v9 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r9v16 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:39:0x018c, B:23:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r10v11 io.ktor.utils.io.ByteChannel) = (r10v8 io.ktor.utils.io.ByteChannel), (r10v14 io.ktor.utils.io.ByteChannel) binds: [B:39:0x018c, B:23:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e A[PHI: r9 r10
      0x016e: PHI (r9v9 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r9v6 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r9v11 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:36:0x016a, B:25:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r10v8 io.ktor.utils.io.ByteChannel) = (r10v5 io.ktor.utils.io.ByteChannel), (r10v10 io.ktor.utils.io.ByteChannel) binds: [B:36:0x016a, B:25:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0249 A[PHI: r9 r10
      0x0249: PHI (r9v38 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r9v35 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r9v40 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:60:0x0245, B:18:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r10v30 io.ktor.utils.io.ByteChannel) = (r10v27 io.ktor.utils.io.ByteChannel), (r10v32 io.ktor.utils.io.ByteChannel) binds: [B:60:0x0245, B:18:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f A[PHI: r9 r10
      0x025f: PHI (r9v41 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r9v38 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r9v43 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:63:0x025b, B:17:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r10v33 io.ktor.utils.io.ByteChannel) = (r10v30 io.ktor.utils.io.ByteChannel), (r10v35 io.ktor.utils.io.ByteChannel) binds: [B:63:0x025b, B:17:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0211 -> B:45:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x02e4 -> B:69:0x0283). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeCache(io.ktor.utils.io.ByteChannel r9, io.ktor.client.plugins.cache.storage.CachedResponseData r10, zu.d<? super tu.x0> r11) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.writeCache(io.ktor.utils.io.ByteChannel, io.ktor.client.plugins.cache.storage.CachedResponseData, zu.d):java.lang.Object");
    }

    public /* synthetic */ FileCacheStorage(File file, CoroutineDispatcher coroutineDispatcher, int i10, u uVar) {
        this(file, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02b3, code lost:
    
        if (r1 != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0307, code lost:
    
        if (r1 != r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03a1, code lost:
    
        if (r1 != r4) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0276 A[PHI: r0 r1 r5 r7
      0x0276: PHI (r0v7 int) = (r0v4 int), (r0v9 int) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r5v8 java.lang.String) = (r5v4 java.lang.String), (r5v11 java.lang.String) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r7v4 io.ktor.utils.io.ByteReadChannel) = (r7v2 io.ktor.utils.io.ByteReadChannel), (r7v7 io.ktor.utils.io.ByteReadChannel) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x035b A[PHI: r0 r1 r5 r7 r8 r9 r10
      0x035b: PHI (r0v28 io.ktor.util.date.GMTDate) = (r0v25 io.ktor.util.date.GMTDate), (r0v30 io.ktor.util.date.GMTDate) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r1v36 java.lang.Object) = (r1v35 java.lang.Object), (r1v1 java.lang.Object) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r5v30 io.ktor.http.HeadersBuilder) = (r5v26 io.ktor.http.HeadersBuilder), (r5v33 io.ktor.http.HeadersBuilder) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r7v28 io.ktor.http.HttpProtocolVersion) = (r7v24 io.ktor.http.HttpProtocolVersion), (r7v31 io.ktor.http.HttpProtocolVersion) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r8v23 io.ktor.http.HttpStatusCode) = (r8v19 io.ktor.http.HttpStatusCode), (r8v26 io.ktor.http.HttpStatusCode) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r9v16 java.lang.String) = (r9v12 java.lang.String), (r9v19 java.lang.String) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r10v15 io.ktor.utils.io.ByteReadChannel) = (r10v13 io.ktor.utils.io.ByteReadChannel), (r10v18 io.ktor.utils.io.ByteReadChannel) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0484  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0307 -> B:23:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0415 -> B:16:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readCache(io.ktor.utils.io.ByteReadChannel r24, zu.d<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r25) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }
}
