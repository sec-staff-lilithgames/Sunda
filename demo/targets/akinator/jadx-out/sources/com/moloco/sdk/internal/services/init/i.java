package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import android.util.Base64;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import sv.n0;
import tu.a0;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f47100b;

    /* renamed from: c, reason: collision with root package name */
    public final zu.m f47101c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {
        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return i.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            i.this.f47100b.edit().clear().commit();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f47103i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f47104j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ i f47105k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.acm.recorder.c cVar, com.moloco.sdk.internal.services.init.a aVar, i iVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f47103i = cVar;
            this.f47104j = aVar;
            this.f47105k = iVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f47103i, this.f47104j, this.f47105k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            i iVar = this.f47105k;
            com.moloco.sdk.internal.services.init.a aVar = this.f47104j;
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            com.moloco.sdk.acm.recorder.c cVar = this.f47103i;
            com.moloco.sdk.acm.g gVarStartTimerEvent = cVar.startTimerEvent("SDKInitCacheClear");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Clearing cache for cacheKey: " + aVar.c(), null, false, 12, null);
                SharedPreferences.Editor editorEdit = iVar.f47100b.edit();
                e0.checkNotNull(editorEdit);
                iVar.a(aVar, editorEdit);
                editorEdit.remove(aVar.c());
                if (editorEdit.commit()) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully cleared cache for cacheKey: " + aVar.c(), null, false, 12, null);
                    cVar.recordCountEvent(new com.moloco.sdk.acm.d("SDKInitCacheClear").withTag("Result", "success"));
                    cVar.recordTimerEvent(gVarStartTimerEvent.withTag("Result", "success"));
                } else {
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to clear cache for cacheKey: " + aVar.c(), null, false, 12, null);
                    cVar.recordCountEvent(new com.moloco.sdk.acm.d("SDKInitCacheClear").withTag("Result", "failure").withTag("Reason", "commit_failure"));
                    cVar.recordTimerEvent(gVarStartTimerEvent.withTag("Result", "failure").withTag("Reason", "commit_failure"));
                }
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to clear cache for cacheKey: " + aVar.c() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d("SDKInitCacheClear").withTag("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                cVar.recordCountEvent(dVarWithTag.withTag("Reason", simpleName));
                com.moloco.sdk.acm.g gVarWithTag = gVarStartTimerEvent.withTag("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                cVar.recordTimerEvent(gVarWithTag.withTag("Reason", simpleName2));
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f47106i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f47107j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ i f47108k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.c cVar, com.moloco.sdk.internal.services.init.a aVar, i iVar, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f47106i = cVar;
            this.f47107j = aVar;
            this.f47108k = iVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Init$SDKInitResponse> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f47106i, this.f47107j, this.f47108k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            i iVar = this.f47108k;
            com.moloco.sdk.internal.services.init.a aVar = this.f47107j;
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            com.moloco.sdk.acm.recorder.c cVar = this.f47106i;
            com.moloco.sdk.acm.g gVarStartTimerEvent = cVar.startTimerEvent("SDKInitCacheRead");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Reading cache for cacheKey: " + aVar.c(), null, false, 12, null);
                iVar.b(aVar, iVar.f47100b);
                String string = iVar.f47100b.getString(aVar.c(), null);
                Init$SDKInitResponse from = string != null ? Init$SDKInitResponse.parseFrom(Base64.decode(string, 0)) : null;
                if (from != null) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully read cache for cacheKey: " + aVar.c(), null, false, 12, null);
                    cVar.recordTimerEvent(gVarStartTimerEvent.withTag("Result", "success"));
                    cVar.recordCountEvent(new com.moloco.sdk.acm.d("SDKInitCacheRead").withTag("Result", "success"));
                    return from;
                }
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Failed to read from cache (cache_miss) for cacheKey: " + aVar.c(), null, false, 12, null);
                cVar.recordTimerEvent(gVarStartTimerEvent.withTag("Result", "failure").withTag("Reason", "cache_miss"));
                cVar.recordCountEvent(new com.moloco.sdk.acm.d("SDKInitCacheRead").withTag("Result", "failure").withTag("Reason", "cache_miss"));
                return from;
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to read cache for cacheKey: " + aVar.c() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.g gVarWithTag = gVarStartTimerEvent.withTag("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                cVar.recordTimerEvent(gVarWithTag.withTag("Reason", simpleName));
                com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d("SDKInitCacheRead").withTag("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                cVar.recordCountEvent(dVarWithTag.withTag("Reason", simpleName2));
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f47109i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f47110j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Init$SDKInitResponse f47111k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f47112l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.c cVar, com.moloco.sdk.internal.services.init.a aVar, Init$SDKInitResponse init$SDKInitResponse, i iVar, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f47109i = cVar;
            this.f47110j = aVar;
            this.f47111k = init$SDKInitResponse;
            this.f47112l = iVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new e(this.f47109i, this.f47110j, this.f47111k, this.f47112l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            boolean zCommit;
            com.moloco.sdk.internal.services.init.a aVar = this.f47110j;
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            com.moloco.sdk.acm.recorder.c cVar = this.f47109i;
            com.moloco.sdk.acm.g gVarStartTimerEvent = cVar.startTimerEvent("SDKInitCacheWrite");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Updating cache for cacheKey: " + aVar.c(), null, false, 12, null);
                boolean z10 = false;
                String strEncodeToString = Base64.encodeToString(this.f47111k.toByteArray(), 0);
                if (strEncodeToString == null || strEncodeToString.length() == 0) {
                    zCommit = false;
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to encode SDKInitResponse for cacheKey: " + aVar.c(), null, false, 12, null);
                    z10 = true;
                } else {
                    zCommit = false;
                }
                if (!z10) {
                    zCommit = this.f47112l.f47100b.edit().putString(aVar.c(), strEncodeToString).commit();
                }
                if (zCommit) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully updated cache for cacheKey: " + aVar.c(), null, false, 12, null);
                    cVar.recordTimerEvent(gVarStartTimerEvent.withTag("Result", "success"));
                    cVar.recordCountEvent(new com.moloco.sdk.acm.d("SDKInitCacheWrite").withTag("Result", "success"));
                } else {
                    String str = z10 ? "encoding_failure" : "commit_failure";
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to update cache for cacheKey: " + aVar.c() + " with error: " + str, null, false, 12, null);
                    cVar.recordTimerEvent(gVarStartTimerEvent.withTag("Result", "failure").withTag("Reason", str));
                    cVar.recordCountEvent(new com.moloco.sdk.acm.d("SDKInitCacheWrite").withTag("Result", "failure").withTag("Reason", str));
                }
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to update cache for cacheKey: " + aVar.c() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.g gVarWithTag = gVarStartTimerEvent.withTag("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                cVar.recordTimerEvent(gVarWithTag.withTag("Reason", simpleName));
                com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d("SDKInitCacheWrite").withTag("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                cVar.recordCountEvent(dVarWithTag.withTag("Reason", simpleName2));
            }
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public i(SharedPreferences sharedPreferences, zu.m ioDispatcherContext) {
        e0.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        e0.checkNotNullParameter(ioDispatcherContext, "ioDispatcherContext");
        this.f47100b = sharedPreferences;
        this.f47101c = ioDispatcherContext;
    }

    @Override // com.moloco.sdk.internal.services.init.h
    public Object b(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.c cVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f47101c, new c(cVar, aVar, this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final void b(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences sharedPreferences) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Performing migration for cache key: " + aVar.c(), null, false, 12, null);
        a(aVar, sharedPreferences);
    }

    @Override // com.moloco.sdk.internal.services.init.h
    public Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.c cVar, Init$SDKInitResponse init$SDKInitResponse, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f47101c, new e(cVar, aVar, init$SDKInitResponse, this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    @Override // com.moloco.sdk.internal.services.init.h
    public Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.c cVar, zu.d<? super Init$SDKInitResponse> dVar) {
        return BuildersKt.withContext(this.f47101c, new d(cVar, aVar, this, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.init.h
    public Object a(zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f47101c, new b(null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final void a(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences sharedPreferences) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Migrating from v0 to v1 for cache key: " + aVar.c(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Total keys in cache: " + sharedPreferences.getAll().size(), null, false, 12, null);
        Map<String, ?> all = sharedPreferences.getAll();
        e0.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            e0.checkNotNullExpressionValue(key, "<get-key>(...)");
            List listSplit$default = n0.split$default((CharSequence) key, new String[]{"___"}, false, 0, 6, (Object) null);
            if (e0.areEqual(y0.firstOrNull(listSplit$default), aVar.b()) && e0.areEqual(y0.lastOrNull(listSplit$default), "v0")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Number of existing V0 keys in cache: " + linkedHashMap.size(), null, false, 12, null);
        if (linkedHashMap.isEmpty()) {
            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "No v0 cache keys found for migration for appKey: " + aVar.b(), null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Found v0 cache key: " + ((String) y0.first(linkedHashMap.keySet())) + ", migrating to new key: " + aVar.c(), null, false, 12, null);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        String strC = aVar.c();
        Object objFirst = y0.first(linkedHashMap.values());
        editor.putString(strC, objFirst instanceof String ? (String) objFirst : null);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            editor.remove((String) ((Map.Entry) it.next()).getKey());
        }
        editor.commit();
    }

    public final void a(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences.Editor editor) {
        Iterator<String> it = aVar.d().iterator();
        while (it.hasNext()) {
            editor.remove(it.next());
        }
    }
}
