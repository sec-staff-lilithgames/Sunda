package com.moloco.sdk.acm.services;

import androidx.lifecycle.b2;
import androidx.lifecycle.k0;
import bv.n;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f45655a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.a f45656b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f45657c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
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
            return d.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            d dVar = d.this;
            if (dVar.f45657c.compareAndSet(false, true)) {
                f.a(f.f45659a, "ApplicationLifecycleTrackerServiceImpl", "Start observing application lifecycle events", false, 4, null);
                dVar.f45655a.addObserver(dVar.f45656b);
            }
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public d(k0 lifecycle, com.moloco.sdk.acm.services.a bgListener) {
        e0.checkNotNullParameter(lifecycle, "lifecycle");
        e0.checkNotNullParameter(bgListener, "bgListener");
        this.f45655a = lifecycle;
        this.f45656b = bgListener;
        this.f45657c = new AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.acm.services.c
    public Object a(zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new b(null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final void a() {
        this.f45656b.onStop(b2.f6515k.get());
    }
}
