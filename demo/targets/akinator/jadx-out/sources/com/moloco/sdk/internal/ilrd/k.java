package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import bv.n;
import com.moloco.sdk.h9;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import tu.a0;
import tu.o;
import tu.q;
import tu.t;
import tu.x0;
import tu.z;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f46024a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.b f46025b;

    /* renamed from: c, reason: collision with root package name */
    public final o f46026c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f46027d;

    /* renamed from: e, reason: collision with root package name */
    public Job f46028e;

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
            return k.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            k kVar = k.this;
            for (h hVar : kVar.a()) {
                m value = hVar.getState().getValue();
                if (value instanceof m.a) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + hVar.a() + " ILRD: " + ((m.a) value).b(), null, false, 12, null);
                } else if (value instanceof m.c) {
                    kVar.a(hVar);
                } else if (!(value instanceof m.b)) {
                    throw new t();
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f46030i;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, zu.d<? super x0> dVar) {
            return ((c) create(gVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = k.this.new c(dVar);
            cVar.f46030i = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            g gVar = (g) this.f46030i;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Revenue event: " + gVar, null, false, 12, null);
            k.this.f46025b.b(gVar);
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public k(CoroutineScope scope, Context context, com.moloco.sdk.internal.ilrd.b eventsRepository, List<? extends h9> supportedNetworksList) {
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(eventsRepository, "eventsRepository");
        e0.checkNotNullParameter(supportedNetworksList, "supportedNetworksList");
        this.f46024a = scope;
        this.f46025b = eventsRepository;
        this.f46026c = q.lazy(new j(supportedNetworksList, 0, context, this));
        this.f46027d = Collections.synchronizedSet(new LinkedHashSet());
    }

    public final synchronized void c() {
        Job job = this.f46028e;
        if (job == null || !job.isActive()) {
            this.f46028e = BuildersKt__Builders_commonKt.launch$default(this.f46024a, null, null, new b(null), 3, null);
        }
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.q b() {
        com.moloco.sdk.internal.services.bidtoken.providers.q qVarB;
        com.moloco.sdk.internal.ilrd.b bVar = this.f46025b;
        bVar.i();
        com.moloco.sdk.internal.ilrd.a aVarE = bVar.e();
        if (aVarE != null && (qVarB = l.b(aVarE)) != null) {
            return qVarB;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public final List<h> a() {
        return (List) this.f46026c.getValue();
    }

    public static final List a(List list, Context context, k kVar) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(h9.MAX)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding AppLovin as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.b(context, kVar.f46024a));
        }
        if (list.contains(h9.f45819f)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding IronSource as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.d(context, kVar.f46024a));
        }
        return y0.toList(arrayList);
    }

    public final void a(h hVar) {
        Object objB = hVar.b();
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objB);
        if (thM7134exceptionOrNullimpl != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + hVar.a() + " ILRD: " + thM7134exceptionOrNullimpl, null, false, 12, null);
        }
        if (z.m7137isSuccessimpl(objB)) {
            this.f46027d.add(hVar);
            FlowKt.launchIn(FlowKt.onEach(hVar.c(), new c(null)), this.f46024a);
        }
    }
}
