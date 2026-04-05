package com.moloco.sdk.acm;

import androidx.lifecycle.b2;
import bv.n;
import com.moloco.sdk.acm.db.MetricsDb;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static com.moloco.sdk.acm.eventprocessing.h f45483b;

    /* renamed from: c, reason: collision with root package name */
    public static com.moloco.sdk.acm.services.d f45484c;

    /* renamed from: d, reason: collision with root package name */
    public static i f45485d;

    /* renamed from: e, reason: collision with root package name */
    public static h f45486e;

    /* renamed from: k, reason: collision with root package name */
    public static com.moloco.sdk.acm.eventprocessing.l f45492k;

    /* renamed from: a, reason: collision with root package name */
    public static final a f45482a = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final Mutex f45487f = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: g, reason: collision with root package name */
    public static final CoroutineScope f45488g = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReference f45489h = new AtomicReference(m.f45646e);

    /* renamed from: i, reason: collision with root package name */
    public static final CopyOnWriteArrayList f45490i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final CopyOnWriteArrayList f45491j = new CopyOnWriteArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.acm.a$a, reason: collision with other inner class name */
    public static final class C0360a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f45493i;

        /* renamed from: j, reason: collision with root package name */
        public int f45494j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ f f45495k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0360a(f fVar, com.moloco.sdk.acm.c cVar, zu.d<? super C0360a> dVar) {
            super(2, dVar);
            this.f45495k = fVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C0360a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C0360a(this.f45495k, null, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            Mutex mutex2;
            f fVar = this.f45495k;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f45494j;
            try {
            } catch (IllegalStateException e10) {
                com.moloco.sdk.acm.services.f.a(com.moloco.sdk.acm.services.f.f45659a, "MetricsDb", "Unable to create metrics db", e10, false, 8, null);
                a.f45489h.set(m.f45646e);
            } catch (Exception e11) {
                com.moloco.sdk.acm.services.f.a(com.moloco.sdk.acm.services.f.f45659a, "AndroidClientMetrics", "Initialization error", e11, false, 8, null);
                a.f45489h.set(m.f45646e);
            }
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    com.moloco.sdk.acm.db.e eVarB = MetricsDb.f45510m.b(fVar.getContext()).b();
                    com.moloco.sdk.acm.services.i iVar = new com.moloco.sdk.acm.services.i();
                    a aVar = a.f45482a;
                    com.moloco.sdk.acm.eventprocessing.e eVar = new com.moloco.sdk.acm.eventprocessing.e(aVar.getOpsConfig$moloco_android_client_metrics_release(), fVar.getContext());
                    a.f45492k = new com.moloco.sdk.acm.eventprocessing.m(eVar, aVar.getOpsConfig$moloco_android_client_metrics_release(), null, a.f45488g, 4, null);
                    a.f45484c = new com.moloco.sdk.acm.services.d(b2.f6515k.get().getLifecycle(), new com.moloco.sdk.acm.services.a(eVar, a.f45488g));
                    com.moloco.sdk.acm.eventprocessing.l lVar = a.f45492k;
                    if (lVar == null) {
                        e0.throwUninitializedPropertyAccessException("requestScheduler");
                        lVar = null;
                    }
                    com.moloco.sdk.acm.services.d dVar = a.f45484c;
                    if (dVar == null) {
                        e0.throwUninitializedPropertyAccessException("applicationLifecycleTracker");
                        dVar = null;
                    }
                    a.f45483b = new com.moloco.sdk.acm.eventprocessing.i(eVarB, iVar, lVar, dVar);
                    a.f45489h.set(m.f45644b);
                    mutex = a.f45487f;
                    this.f45493i = mutex;
                    this.f45494j = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = this.f45493i;
                    try {
                        a0.throwOnFailure(obj);
                        mutex = mutex2;
                        mutex.unlock(null);
                        a.access$processQueuedEvents(a.f45482a);
                        return x0.f87415a;
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        mutex2.unlock(null);
                        throw th3;
                    }
                }
                Mutex mutex3 = this.f45493i;
                a0.throwOnFailure(obj);
                mutex = mutex3;
                h hVar = a.f45486e;
                if (hVar != null) {
                    a aVar2 = a.f45482a;
                    a.f45486e = null;
                    com.moloco.sdk.acm.services.f.a(com.moloco.sdk.acm.services.f.f45659a, "AndroidClientMetrics", "Updating config with pending config", false, 4, null);
                    this.f45493i = mutex;
                    this.f45494j = 2;
                    if (a.access$updateConfigInternal(aVar2, hVar, this) != coroutine_suspended) {
                        mutex2 = mutex;
                        mutex = mutex2;
                    }
                    return coroutine_suspended;
                }
                mutex.unlock(null);
                a.access$processQueuedEvents(a.f45482a);
                return x0.f87415a;
            } catch (Throwable th4) {
                th = th4;
                mutex2 = mutex;
                Throwable th32 = th;
                mutex2.unlock(null);
                throw th32;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f45496i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.d f45497j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.acm.d dVar, zu.d<? super b> dVar2) {
            super(2, dVar2);
            this.f45497j = dVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f45497j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f45496i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.eventprocessing.h hVar = a.f45483b;
                if (hVar == null) {
                    e0.throwUninitializedPropertyAccessException("eventProcessor");
                    hVar = null;
                }
                this.f45496i = 1;
                if (hVar.a(this.f45497j, this) == coroutine_suspended) {
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
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f45498i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ g f45499j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f45499j = gVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f45499j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f45498i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.eventprocessing.h hVar = a.f45483b;
                if (hVar == null) {
                    e0.throwUninitializedPropertyAccessException("eventProcessor");
                    hVar = null;
                }
                this.f45498i = 1;
                if (hVar.a(this.f45499j, this) == coroutine_suspended) {
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
    public static final class d extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public h f45500i;

        /* renamed from: j, reason: collision with root package name */
        public Mutex f45501j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f45502k;

        /* renamed from: m, reason: collision with root package name */
        public int f45504m;

        public d(zu.d<? super d> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45502k = obj;
            this.f45504m |= Integer.MIN_VALUE;
            return a.this.updateConfig(null, this);
        }
    }

    public static Object a(h hVar, zu.d dVar) {
        String postAnalyticsUrl = hVar.getPostAnalyticsUrl();
        a aVar = f45482a;
        if (postAnalyticsUrl != null) {
            aVar.getOpsConfig$moloco_android_client_metrics_release().a(postAnalyticsUrl);
        }
        Long requestPeriodSeconds = hVar.getRequestPeriodSeconds();
        if (requestPeriodSeconds != null) {
            aVar.getOpsConfig$moloco_android_client_metrics_release().a(requestPeriodSeconds.longValue());
        }
        com.moloco.sdk.acm.eventprocessing.l lVar = f45492k;
        if (lVar == null) {
            e0.throwUninitializedPropertyAccessException("requestScheduler");
            lVar = null;
        }
        Object objA = lVar.a(dVar);
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0.f87415a;
    }

    public static final void access$processQueuedEvents(a aVar) {
        aVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(f45488g, null, null, new com.moloco.sdk.acm.b(null), 3, null);
    }

    public static final /* synthetic */ Object access$updateConfigInternal(a aVar, h hVar, zu.d dVar) {
        aVar.getClass();
        return a(hVar, dVar);
    }

    public static /* synthetic */ void initialize$default(a aVar, f fVar, com.moloco.sdk.acm.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        aVar.initialize(fVar, cVar);
    }

    public final m getInitializationStatus$moloco_android_client_metrics_release() {
        Object obj = f45489h.get();
        e0.checkNotNullExpressionValue(obj, "get(...)");
        return (m) obj;
    }

    public final i getOpsConfig$moloco_android_client_metrics_release() {
        i iVar = f45485d;
        if (iVar != null) {
            return iVar;
        }
        e0.throwUninitializedPropertyAccessException("opsConfig");
        return null;
    }

    public final void initialize(f config, com.moloco.sdk.acm.c cVar) {
        AtomicReference atomicReference;
        e0.checkNotNullParameter(config, "config");
        com.moloco.sdk.acm.services.f.b(com.moloco.sdk.acm.services.f.f45659a, "AndroidClientMetrics", "ACM initialize", false, 4, null);
        m mVar = m.f45646e;
        m mVar2 = m.f45645c;
        do {
            atomicReference = f45489h;
            if (atomicReference.compareAndSet(mVar, mVar2)) {
                setOpsConfig$moloco_android_client_metrics_release(l.a(config));
                BuildersKt__Builders_commonKt.launch$default(f45488g, null, null, new C0360a(config, cVar, null), 3, null);
                return;
            }
        } while (atomicReference.get() == mVar);
    }

    public final void recordCountEvent$moloco_android_client_metrics_release(com.moloco.sdk.acm.d event) {
        e0.checkNotNullParameter(event, "event");
        if (f45489h.get() != m.f45644b) {
            f45491j.add(event);
            com.moloco.sdk.acm.services.f.a(com.moloco.sdk.acm.services.f.f45659a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(f45488g, null, null, new b(event, null), 3, null);
        }
    }

    public final void recordTimerEvent$moloco_android_client_metrics_release(g event) {
        e0.checkNotNullParameter(event, "event");
        event.stopTimer();
        if (f45489h.get() != m.f45644b) {
            f45490i.add(event);
            com.moloco.sdk.acm.services.f.a(com.moloco.sdk.acm.services.f.f45659a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(f45488g, null, null, new c(event, null), 3, null);
        }
    }

    public final void setOpsConfig$moloco_android_client_metrics_release(i iVar) {
        e0.checkNotNullParameter(iVar, "<set-?>");
        f45485d = iVar;
    }

    public final g startTimerEvent$moloco_android_client_metrics_release(String eventName) {
        e0.checkNotNullParameter(eventName, "eventName");
        if (f45489h.get() != m.f45644b) {
            com.moloco.sdk.acm.services.f.a(com.moloco.sdk.acm.services.f.f45659a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
        g gVarCreate = g.Companion.create(eventName);
        gVarCreate.startTimer();
        return gVarCreate;
    }

    public final void triggerBackgroundEvent$moloco_android_client_metrics_release() {
        com.moloco.sdk.acm.services.d dVar = f45484c;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r1.lock(null, r2) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConfig(com.moloco.sdk.acm.h r18, zu.d<? super tu.x0> r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.moloco.sdk.acm.a.d
            if (r2 == 0) goto L19
            r2 = r1
            com.moloco.sdk.acm.a$d r2 = (com.moloco.sdk.acm.a.d) r2
            int r3 = r2.f45504m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f45504m = r3
            r3 = r17
            goto L20
        L19:
            com.moloco.sdk.acm.a$d r2 = new com.moloco.sdk.acm.a$d
            r3 = r17
            r2.<init>(r1)
        L20:
            java.lang.Object r1 = r2.f45502k
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()
            int r5 = r2.f45504m
            tu.x0 r6 = tu.x0.f87415a
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L49
            if (r5 == r8) goto L3f
            if (r5 != r7) goto L37
            tu.a0.throwOnFailure(r1)
            return r6
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            kotlinx.coroutines.sync.Mutex r0 = r2.f45501j
            com.moloco.sdk.acm.h r2 = r2.f45500i
            tu.a0.throwOnFailure(r1)
            r1 = r0
            r0 = r2
            goto L74
        L49:
            tu.a0.throwOnFailure(r1)
            java.util.concurrent.atomic.AtomicReference r1 = com.moloco.sdk.acm.a.f45489h
            java.lang.Object r1 = r1.get()
            com.moloco.sdk.acm.m r5 = com.moloco.sdk.acm.m.f45644b
            if (r1 == r5) goto L7f
            com.moloco.sdk.acm.services.f r10 = com.moloco.sdk.acm.services.f.f45659a
            r15 = 12
            r16 = 0
            java.lang.String r11 = "AndroidClientMetrics"
            java.lang.String r12 = "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first."
            r13 = 0
            r14 = 0
            com.moloco.sdk.acm.services.f.b(r10, r11, r12, r13, r14, r15, r16)
            r2.f45500i = r0
            kotlinx.coroutines.sync.Mutex r1 = com.moloco.sdk.acm.a.f45487f
            r2.f45501j = r1
            r2.f45504m = r8
            java.lang.Object r2 = r1.lock(r9, r2)
            if (r2 != r4) goto L74
            goto L93
        L74:
            com.moloco.sdk.acm.a.f45486e = r0     // Catch: java.lang.Throwable -> L7a
            r1.unlock(r9)
            return r6
        L7a:
            r0 = move-exception
            r1.unlock(r9)
            throw r0
        L7f:
            com.moloco.sdk.acm.services.f r10 = com.moloco.sdk.acm.services.f.f45659a
            r14 = 4
            r15 = 0
            java.lang.String r11 = "AndroidClientMetrics"
            java.lang.String r12 = "ACM update called. ACM initialized already, proceeding with update"
            r13 = 0
            com.moloco.sdk.acm.services.f.b(r10, r11, r12, r13, r14, r15)
            r2.f45504m = r7
            java.lang.Object r0 = a(r0, r2)
            if (r0 != r4) goto L94
        L93:
            return r4
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.a.updateConfig(com.moloco.sdk.acm.h, zu.d):java.lang.Object");
    }

    public static /* synthetic */ void getOpsConfig$moloco_android_client_metrics_release$annotations() {
    }
}
