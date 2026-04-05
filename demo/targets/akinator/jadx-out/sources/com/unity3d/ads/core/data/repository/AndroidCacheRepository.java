package com.unity3d.ads.core.data.repository;

import android.content.Context;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.MutableStateFlow;
import kv.l;
import kv.p;
import org.json.JSONArray;
import rv.f0;
import sv.n0;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final CoroutineScope scope;
    private final SessionRepository sessionRepository;
    private final File webviewCacheDir;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidCacheRepository.this.new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            boolean cleanCache = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            if (cleanCache || !AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                File[] fileArrListFiles = AndroidCacheRepository.this.cacheDir.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
            } else {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
            }
            x0 x0Var = x0.f87415a;
            if (!cleanCache && AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                return x0Var;
            }
            File[] fileArrListFiles2 = AndroidCacheRepository.this.webviewCacheDir.listFiles();
            if (fileArrListFiles2 == null) {
                return null;
            }
            for (File file2 : fileArrListFiles2) {
                file2.delete();
            }
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", i = {}, l = {100}, m = "doesFileExist", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37772 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.a0 implements l {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @Override // kv.l
            public final Boolean invoke(File p02) {
                e0.checkNotNullParameter(p02, "p0");
                return Boolean.valueOf(p02.isFile());
            }
        }

        public C37772(d<? super C37772> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidCacheRepository.this.new C37772(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Iterator<Object> it = f0.filter(gv.p.walk$default(AndroidCacheRepository.this.cacheDir, null, 1, null), AnonymousClass1.INSTANCE).iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((File) it.next()).length();
            }
            return b.boxLong(length);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super Long> dVar) {
            return ((C37772) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", i = {0, 1}, l = {TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER, 77, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {ContentDisposition.Parameters.FileName, "fileResult"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37782 extends n implements p {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", i = {}, l = {79, 85}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements l {
            final /* synthetic */ File $cacheDirectory;
            final /* synthetic */ MutableStateFlow<CacheResult> $fileResult;
            final /* synthetic */ String $filename;
            final /* synthetic */ int $priority;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i10, MutableStateFlow<CacheResult> mutableStateFlow, d<? super AnonymousClass1> dVar) {
                super(1, dVar);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i10;
                this.$fileResult = mutableStateFlow;
            }

            @Override // bv.a
            public final d<x0> create(d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
            
                if (r12 == r0) goto L21;
             */
            @Override // bv.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                    int r1 = r11.label
                    tu.x0 r2 = tu.x0.f87415a
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r4) goto L1d
                    if (r1 != r3) goto L15
                    tu.a0.throwOnFailure(r12)
                    r9 = r11
                    goto L73
                L15:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1d:
                    tu.a0.throwOnFailure(r12)
                    r9 = r11
                    goto L42
                L22:
                    tu.a0.throwOnFailure(r12)
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r11.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r5 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r12)
                    java.io.File r6 = r11.$cacheDirectory
                    java.lang.String r7 = r11.$filename
                    java.lang.String r8 = r11.$url
                    int r12 = r11.$priority
                    java.lang.Integer r9 = bv.b.boxInt(r12)
                    r11.label = r4
                    r10 = r11
                    java.lang.Object r12 = r5.getFile(r6, r7, r8, r9, r10)
                    r9 = r10
                    if (r12 != r0) goto L42
                    goto L72
                L42:
                    com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
                    boolean r1 = r12 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                    if (r1 == 0) goto L58
                    kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.CacheResult> r1 = r9.$fileResult
                L4a:
                    java.lang.Object r0 = r1.getValue()
                    r3 = r0
                    com.unity3d.ads.core.data.model.CacheResult r3 = (com.unity3d.ads.core.data.model.CacheResult) r3
                    boolean r0 = r1.compareAndSet(r0, r12)
                    if (r0 == 0) goto L4a
                    return r2
                L58:
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r9.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r4 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r12)
                    java.io.File r5 = r9.$cacheDirectory
                    java.lang.String r6 = r9.$filename
                    java.lang.String r7 = r9.$url
                    int r12 = r9.$priority
                    java.lang.Integer r8 = bv.b.boxInt(r12)
                    r9.label = r3
                    java.lang.Object r12 = r4.getFile(r5, r6, r7, r8, r9)
                    if (r12 != r0) goto L73
                L72:
                    return r0
                L73:
                    com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
                    kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.CacheResult> r0 = r9.$fileResult
                L77:
                    java.lang.Object r1 = r0.getValue()
                    r3 = r1
                    com.unity3d.ads.core.data.model.CacheResult r3 = (com.unity3d.ads.core.data.model.CacheResult) r3
                    boolean r1 = r0.compareAndSet(r1, r12)
                    if (r1 == 0) goto L77
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C37782.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kv.l
            public final Object invoke(d<? super x0> dVar) {
                return ((AnonymousClass1) create(dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37782(String str, File file, int i10, d<? super C37782> dVar) {
            super(2, dVar);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidCacheRepository.this.new C37782(this.$url, this.$cacheDirectory, this.$priority, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r5 = r18
                java.lang.Object r6 = av.e.getCOROUTINE_SUSPENDED()
                int r0 = r5.label
                r7 = 0
                r8 = 3
                r9 = 2
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 == r1) goto L28
                if (r0 == r9) goto L20
                if (r0 != r8) goto L18
                tu.a0.throwOnFailure(r19)
                return r19
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
                tu.a0.throwOnFailure(r19)
                goto L8b
            L28:
                java.lang.Object r0 = r5.L$0
                java.lang.String r0 = (java.lang.String) r0
                tu.a0.throwOnFailure(r19)
                r13 = r0
                r0 = r19
                goto L5d
            L33:
                tu.a0.throwOnFailure(r19)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.lang.String r2 = r5.$url
                java.lang.String r2 = r0.getFilename(r2)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r3 = r5.$cacheDirectory
                r4 = r3
                java.lang.String r3 = r5.$url
                int r10 = r5.$priority
                java.lang.Integer r10 = bv.b.boxInt(r10)
                r5.L$0 = r2
                r5.label = r1
                r1 = r4
                r4 = r10
                java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
                if (r0 != r6) goto L5c
                goto L99
            L5c:
                r13 = r2
            L5d:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.MutableStateFlow r16 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r7)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.domain.work.DownloadPriorityQueue r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r0)
                int r15 = r5.$priority
                com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r10 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.io.File r12 = r5.$cacheDirectory
                java.lang.String r14 = r5.$url
                r17 = 0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                r1 = r16
                r5.L$0 = r1
                r5.label = r9
                java.lang.Object r0 = r0.invoke(r15, r10, r5)
                if (r0 != r6) goto L8a
                goto L99
            L8a:
                r0 = r1
            L8b:
                kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r0)
                r5.L$0 = r7
                r5.label = r8
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r5)
                if (r0 != r6) goto L9a
            L99:
                return r6
            L9a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C37782.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super CacheResult> dVar) {
            return ((C37782) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidCacheRepository(CoroutineDispatcher ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile) {
        e0.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        e0.checkNotNullParameter(getCacheDirectory, "getCacheDirectory");
        e0.checkNotNullParameter(localCacheDataSource, "localCacheDataSource");
        e0.checkNotNullParameter(remoteCacheDataSource, "remoteCacheDataSource");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(cleanupDirectory, "cleanupDirectory");
        e0.checkNotNullParameter(downloadPriorityQueue, "downloadPriorityQueue");
        e0.checkNotNullParameter(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = CoroutineScopeKt.plus(CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(ioDispatcher), new CoroutineName("CacheRepository")), NonCancellable.INSTANCE);
        this.cacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i10, d<? super CacheResult> dVar) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new C37782(str, file, i10, null), dVar);
    }

    private final File initCacheDir(String str) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        e0.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        File fileInvoke = getCacheDirectory.invoke(cacheDir, str);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(d<? super x0> dVar) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new AnonymousClass2(null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doesFileExist(java.lang.String r5, zu.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r6)
            r0.label = r3
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(d<? super Long> dVar) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new C37772(null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i10, d<? super CacheResult> dVar) {
        return getFileInternal(this.cacheDir, str, jSONArray, i10, dVar);
    }

    public final String getFilename(String url) {
        e0.checkNotNullParameter(url, "url");
        return StringExtensionsKt.getSHA256Hash(url) + '.' + n0.substringAfterLast$default(url, '.', (String) null, 2, (Object) null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, d<? super CacheResult> dVar) {
        File fileInvoke = this.createFile.invoke(this.webviewCacheDir, str2);
        fileInvoke.mkdirs();
        return getFileInternal(fileInvoke, str, null, 0, dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        e0.checkNotNullParameter(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, d<? super CacheResult> dVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, dVar, 12, null);
    }
}
