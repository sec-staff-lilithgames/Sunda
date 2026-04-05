package com.moloco.sdk.internal.services;

import androidx.lifecycle.k0;
import com.moloco.sdk.internal.MolocoLogger;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f47166a;

    /* renamed from: b, reason: collision with root package name */
    public final l f47167b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f47168c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47169d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
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
            return s.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            s.this.c();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {
        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return s.this.new c(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Tracking next bg / fg of the application", false, 4, null);
            s sVar = s.this;
            sVar.c();
            sVar.f47167b.a();
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public s(k0 lifecycle, l fgBgListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.e0.checkNotNullParameter(fgBgListener, "fgBgListener");
        this.f47166a = lifecycle;
        this.f47167b = fgBgListener;
        this.f47168c = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getMainImmediate());
    }

    public final void c() {
        if (this.f47169d) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
        this.f47166a.addObserver(this.f47167b);
        this.f47169d = true;
    }

    @Override // com.moloco.sdk.internal.services.r
    public void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Start observing application lifecycle events", false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(this.f47168c, null, null, new b(null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.r
    public void b() {
        BuildersKt__Builders_commonKt.launch$default(this.f47168c, null, null, new c(null), 3, null);
    }
}
