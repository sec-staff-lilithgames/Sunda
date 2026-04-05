package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import a1.o;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d;
import gv.s;
import j1.o2;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.p;
import rv.f0;
import tu.a0;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final a f47945k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final String f47946l = "MediaCacheRepository";

    /* renamed from: a, reason: collision with root package name */
    public final j f47947a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d f47948b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a f47949c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e f47950d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f47951e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f47952f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f47953g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f47954h;

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineScope f47955i;

    /* renamed from: j, reason: collision with root package name */
    public Job f47956j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }

        public final String a(String str) {
            return o2.l(str, "TEMP");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f47957i;

        /* renamed from: j, reason: collision with root package name */
        public Object f47958j;

        /* renamed from: k, reason: collision with root package name */
        public Object f47959k;

        /* renamed from: l, reason: collision with root package name */
        public File f47960l;

        /* renamed from: m, reason: collision with root package name */
        public int f47961m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47962n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ i f47963o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, i iVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47962n = str;
            this.f47963o = iVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super g> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f47962n, this.f47963o, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0197 A[Catch: all -> 0x0030, Exception -> 0x0033, TryCatch #0 {all -> 0x0030, blocks: (B:7:0x0027, B:61:0x0191, B:63:0x0197, B:65:0x01ae, B:68:0x01d3, B:78:0x01eb), top: B:84:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 542
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f47964i;

        /* renamed from: j, reason: collision with root package name */
        public i f47965j;

        /* renamed from: k, reason: collision with root package name */
        public String f47966k;

        /* renamed from: l, reason: collision with root package name */
        public String f47967l;

        /* renamed from: m, reason: collision with root package name */
        public int f47968m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47969n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ i f47970o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47971p;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f47972i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ i f47973j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f47974k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ File f47975l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f47976m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c f47977n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f47973j = iVar;
                this.f47974k = str;
                this.f47975l = file;
                this.f47976m = str2;
                this.f47977n = cVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f47973j, this.f47974k, this.f47975l, this.f47976m, this.f47977n, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47972i;
                i iVar = this.f47973j;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar2 = iVar.f47949c;
                    this.f47972i = 1;
                    aVar = this;
                    if (aVar2.a(this.f47974k, this.f47975l, this.f47976m, this.f47977n, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    aVar = this;
                }
                HashSet hashSet = iVar.f47953g;
                String str = aVar.f47974k;
                hashSet.remove(str);
                iVar.f47954h.remove(str);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, i iVar, String str2, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f47969n = str;
            this.f47970o = iVar;
            this.f47971p = str2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f47969n, this.f47970o, this.f47971p, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            i iVar;
            String str;
            String str2;
            Object objPutIfAbsent;
            Object objPutIfAbsent2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d cVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47968m;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                String str3 = i.f47946l;
                String str4 = this.f47969n;
                MolocoLogger.info$default(molocoLogger, str3, a.b.k("Streaming media for: ", str4), null, false, 12, null);
                if (str4.length() == 0) {
                    return new d.b(g.a.k.f47936a);
                }
                i iVar2 = this.f47970o;
                ConcurrentHashMap concurrentHashMap = iVar2.f47952f;
                Object objMutex$default = concurrentHashMap.get(str4);
                if (objMutex$default == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str4, (objMutex$default = MutexKt.Mutex$default(false, 1, null)))) != null) {
                    objMutex$default = objPutIfAbsent;
                }
                mutex = (Mutex) objMutex$default;
                e0.checkNotNull(mutex);
                this.f47964i = mutex;
                this.f47965j = iVar2;
                this.f47966k = str4;
                String str5 = this.f47971p;
                this.f47967l = str5;
                this.f47968m = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = iVar2;
                str = str5;
                str2 = str4;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = this.f47967l;
                str2 = this.f47966k;
                iVar = this.f47965j;
                mutex = this.f47964i;
                a0.throwOnFailure(obj);
                str = str6;
            }
            try {
                w wVarC = iVar.c();
                if (wVarC instanceof w.a) {
                    return ((w.a) wVarC).a();
                }
                if (!(wVarC instanceof w.b)) {
                    throw new t();
                }
                File fileA = iVar.a(str2, (File) ((w.b) wVarC).a());
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, i.f47946l, "Going to download the media file to location: " + fileA.getAbsolutePath(), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) iVar.f47954h.get(str2);
                if (iVar.f47953g.contains(str2)) {
                    MolocoLogger.info$default(molocoLogger2, i.f47946l, "Media file is already being downloaded, so returning in progress status for url: " + str2, null, false, 12, null);
                    if (cVar2 == null || (cVar = cVar2.a()) == null) {
                        cVar = new d.c(fileA, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e.a());
                    }
                    return cVar;
                }
                if (iVar.f47949c.b(fileA)) {
                    return new d.a(fileA);
                }
                MolocoLogger.info$default(molocoLogger2, i.f47946l, "Media file needs to be downloaded: " + str2, null, false, 12, null);
                iVar.f47953g.add(str2);
                ConcurrentHashMap concurrentHashMap2 = iVar.f47954h;
                Object cVar3 = concurrentHashMap2.get(str2);
                if (cVar3 == null && (objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(str2, (cVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c(new d.c(fileA, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e.a()))))) != null) {
                    cVar3 = objPutIfAbsent2;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) cVar3;
                BuildersKt__Builders_commonKt.launch$default(iVar.f47951e, null, null, new a(iVar, str2, fileA, str, cVar4, null), 3, null);
                return cVar4.a();
            } finally {
                mutex.unlock(null);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f47978i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47979j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ File f47980k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f47980k = file;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> flowCollector, zu.d<? super x0> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = new d(this.f47980k, dVar);
            dVar2.f47979j = obj;
            return dVar2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47978i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f47979j;
                d.a aVar = new d.a(this.f47980k);
                this.f47978i = 1;
                if (flowCollector.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ w f47981i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w wVar, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f47981i = wVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> flowCollector, zu.d<? super x0> dVar) {
            return ((e) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new e(this.f47981i, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            ((w.a) this.f47981i).a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements p {
        public f(zu.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return i.this.new f(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            i iVar = i.this;
            w wVarA = iVar.f47950d.a();
            if (wVarA instanceof w.b) {
                iVar.a((File) ((w.b) wVarA).a());
            } else {
                if (!(wVarA instanceof w.a)) {
                    throw new t();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, i.f47946l, "Failed to cleanup external cache directory", null, false, 12, null);
            }
            w wVarB = iVar.f47950d.b();
            if (wVarB instanceof w.b) {
                iVar.a((File) ((w.b) wVarB).a());
            } else {
                if (!(wVarB instanceof w.a)) {
                    throw new t();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, i.f47946l, "Failed to cleanup internal cache directory", null, false, 12, null);
            }
            return x0.f87415a;
        }
    }

    public i(j mediaConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d legacyMediaDownloader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a chunkedMediaDownloader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e mediaCacheLocationProvider) {
        e0.checkNotNullParameter(mediaConfig, "mediaConfig");
        e0.checkNotNullParameter(legacyMediaDownloader, "legacyMediaDownloader");
        e0.checkNotNullParameter(chunkedMediaDownloader, "chunkedMediaDownloader");
        e0.checkNotNullParameter(mediaCacheLocationProvider, "mediaCacheLocationProvider");
        this.f47947a = mediaConfig;
        this.f47948b = legacyMediaDownloader;
        this.f47949c = chunkedMediaDownloader;
        this.f47950d = mediaCacheLocationProvider;
        this.f47951e = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getIo());
        this.f47952f = new ConcurrentHashMap();
        this.f47953g = new HashSet();
        this.f47954h = new ConcurrentHashMap();
        this.f47955i = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getIo());
    }

    public final w c() {
        w wVarD = d();
        if (!(wVarD instanceof w.a)) {
            if (wVarD instanceof w.b) {
                return new w.b(((w.b) wVarD).a());
            }
            throw new t();
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("Failed to retrieve storageDir with error code: ");
        w.a aVar = (w.a) wVarD;
        sb2.append(((com.moloco.sdk.internal.n) aVar.a()).b());
        MolocoLogger.warn$default(molocoLogger, f47946l, sb2.toString(), null, false, 12, null);
        switch (((com.moloco.sdk.internal.n) aVar.a()).b()) {
            case 100:
                return new w.a(new d.b(g.a.c.f47928a));
            case 101:
                return new w.a(new d.b(g.a.b.f47927a));
            case 102:
                return new w.a(new d.b(g.a.C0410a.f47926a));
            default:
                return new w.a(new d.b(g.a.d.f47929a));
        }
    }

    public final w d() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e eVar = this.f47950d;
        w wVarA = eVar.a();
        if (wVarA instanceof w.a) {
            return eVar.b();
        }
        if (wVarA instanceof w.b) {
            return wVarA;
        }
        throw new t();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
    public Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> b(String url) {
        e0.checkNotNullParameter(url, "url");
        w wVarC = c();
        if (wVarC instanceof w.a) {
            return FlowKt.flow(new e(wVarC, null));
        }
        if (wVarC instanceof w.b) {
            File file = (File) ((w.b) wVarC).a();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String strK = a.b.k("Collecting status for media file: ", url);
            String str = f47946l;
            MolocoLogger.info$default(molocoLogger, str, strK, null, false, 12, null);
            File fileA = a(url, file);
            if (fileA.exists() && this.f47949c.b(fileA)) {
                return FlowKt.flow(new d(fileA, null));
            }
            MolocoLogger.info$default(molocoLogger, str, a.b.k("Media file needs to be downloaded: ", url), null, false, 12, null);
            ConcurrentHashMap concurrentHashMap = this.f47954h;
            Object cVar = concurrentHashMap.get(url);
            if (cVar == null) {
                MolocoLogger.info$default(molocoLogger, str, a.b.k("Download has not yet started for: ", url), null, false, 12, null);
                cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c(new d.c(fileA, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e.a()));
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(url, cVar);
                if (objPutIfAbsent != null) {
                    cVar = objPutIfAbsent;
                }
            }
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) cVar).b();
        }
        throw new t();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
    public Object a(String str, zu.d<? super g> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new b(str, this, null), dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
    public Object a(String str, String str2, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new c(str, this, str2, null), dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d a(String url) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVarA;
        e0.checkNotNullParameter(url, "url");
        w wVarC = c();
        if (wVarC instanceof w.a) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) ((w.a) wVarC).a();
        }
        if (wVarC instanceof w.b) {
            File fileA = a(url, (File) ((w.b) wVarC).a());
            if (fileA.exists() && this.f47949c.b(fileA)) {
                return new d.a(fileA);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.f47954h.get(url);
            return (cVar == null || (dVarA = cVar.a()) == null) ? new d.c(fileA, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e.a()) : dVarA;
        }
        throw new t();
    }

    public final File a(String str, File file) {
        return new File(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c.b(str));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
    public Job a() {
        Job job = this.f47956j;
        if (job != null && job.isActive()) {
            return job;
        }
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f47955i, null, null, new f(null), 3, null);
        this.f47956j = jobLaunch$default;
        return jobLaunch$default;
    }

    public final void a(File file) {
        try {
            if (f0.sumOfLong(f0.map(gv.p.walkTopDown(file), new o(12))) < this.f47947a.f()) {
                return;
            }
            try {
                s.deleteRecursively(file);
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, f47946l, e10.toString(), e10, false, 8, null);
            }
        } catch (Exception e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f47946l, e11.toString(), e11, false, 8, null);
        }
    }

    public static final long b(File it) {
        e0.checkNotNullParameter(it, "it");
        return it.length();
    }
}
