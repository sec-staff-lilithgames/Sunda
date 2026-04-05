package com.moloco.sdk.acm.eventprocessing;

import a2.s;
import bv.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final d f45586a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.i f45587b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f45588c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f45589d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f45590e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f45591f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public m f45592i;

        /* renamed from: j, reason: collision with root package name */
        public Mutex f45593j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f45594k;

        /* renamed from: m, reason: collision with root package name */
        public int f45596m;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45594k = obj;
            this.f45596m |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {
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
            return m.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            m.this.f45586a.a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public m f45598i;

        /* renamed from: j, reason: collision with root package name */
        public Mutex f45599j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f45600k;

        /* renamed from: m, reason: collision with root package name */
        public int f45602m;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45600k = obj;
            this.f45602m |= Integer.MIN_VALUE;
            return m.this.b(this);
        }
    }

    public m(d dbWorkRequest, com.moloco.sdk.acm.i opsConfig, ScheduledExecutorService scheduler, CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        e0.checkNotNullParameter(opsConfig, "opsConfig");
        e0.checkNotNullParameter(scheduler, "scheduler");
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f45586a = dbWorkRequest;
        this.f45587b = opsConfig;
        this.f45588c = scheduler;
        this.f45589d = coroutineScope;
        this.f45591f = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(zu.d<? super tu.x0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.acm.eventprocessing.m.c
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.eventprocessing.m$c r0 = (com.moloco.sdk.acm.eventprocessing.m.c) r0
            int r1 = r0.f45602m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45602m = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.m$c r0 = new com.moloco.sdk.acm.eventprocessing.m$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45600k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45602m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlinx.coroutines.sync.Mutex r1 = r0.f45599j
            com.moloco.sdk.acm.eventprocessing.m r0 = r0.f45598i
            tu.a0.throwOnFailure(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            tu.a0.throwOnFailure(r6)
            r0.f45598i = r5
            kotlinx.coroutines.sync.Mutex r6 = r5.f45591f
            r0.f45599j = r6
            r0.f45602m = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            r0.a()     // Catch: java.lang.Throwable -> L53
            tu.x0 r6 = tu.x0.f87415a     // Catch: java.lang.Throwable -> L53
            r1.unlock(r4)
            return r6
        L53:
            r6 = move-exception
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.m.b(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zu.d<? super tu.x0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.acm.eventprocessing.m.a
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.eventprocessing.m$a r0 = (com.moloco.sdk.acm.eventprocessing.m.a) r0
            int r1 = r0.f45596m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45596m = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.m$a r0 = new com.moloco.sdk.acm.eventprocessing.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45594k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45596m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlinx.coroutines.sync.Mutex r1 = r0.f45593j
            com.moloco.sdk.acm.eventprocessing.m r0 = r0.f45592i
            tu.a0.throwOnFailure(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            tu.a0.throwOnFailure(r6)
            r0.f45592i = r5
            kotlinx.coroutines.sync.Mutex r6 = r5.f45591f
            r0.f45593j = r6
            r0.f45596m = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            java.util.concurrent.ScheduledFuture r6 = r0.f45590e     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L59
            r2 = 0
            boolean r6 = r6.cancel(r2)     // Catch: java.lang.Throwable -> L57
            bv.b.boxBoolean(r6)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r6 = move-exception
            goto L62
        L59:
            r0.a()     // Catch: java.lang.Throwable -> L57
            tu.x0 r6 = tu.x0.f87415a     // Catch: java.lang.Throwable -> L57
            r1.unlock(r4)
            return r6
        L62:
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.m.a(zu.d):java.lang.Object");
    }

    public /* synthetic */ m(d dVar, com.moloco.sdk.acm.i iVar, ScheduledExecutorService scheduledExecutorService, CoroutineScope coroutineScope, int i10, u uVar) {
        this(dVar, iVar, (i10 & 4) != 0 ? Executors.newSingleThreadScheduledExecutor() : scheduledExecutorService, coroutineScope);
    }

    public static final void b(m mVar) {
        BuildersKt__Builders_commonKt.launch$default(mVar.f45589d, null, null, mVar.new b(null), 3, null);
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.f45590e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            s sVar = new s(this, 23);
            com.moloco.sdk.acm.i iVar = this.f45587b;
            this.f45590e = this.f45588c.scheduleWithFixedDelay(sVar, iVar.h(), iVar.h(), TimeUnit.SECONDS);
        }
    }
}
