package com.moloco.sdk.internal.ilrd;

import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import j1.o2;
import java.text.SimpleDateFormat;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f46008a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46009b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46010c;

    /* renamed from: d, reason: collision with root package name */
    public Job f46011d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDateFormat f46012e;

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

        /* renamed from: i, reason: collision with root package name */
        public int f46013i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f46015k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv.l f46016l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f46017i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ i f46018j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ kv.l f46019k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, kv.l lVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f46018j = iVar;
                this.f46019k = lVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f46018j, this.f46019k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f46017i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + this.f46018j.f46010c + " invoked", null, false, 12, null);
                    this.f46017i = 1;
                    if (this.f46019k.invoke(this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, kv.l lVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f46015k = j10;
            this.f46016l = lVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return i.this.new b(this.f46015k, this.f46016l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46013i;
            i iVar = i.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                SimpleDateFormat simpleDateFormat = iVar.f46012e;
                long jA = iVar.f46009b.a();
                long j10 = this.f46015k;
                String str = simpleDateFormat.format(bv.b.boxLong(tv.f.m7195getInWholeMillisecondsimpl(j10) + jA));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + iVar.f46010c + " scheduled at " + str, null, false, 12, null);
                this.f46013i = 1;
                if (DelayKt.m5128delayVtjQ1oo(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(iVar.f46008a, null, null, new a(iVar, this.f46016l, null), 3, null);
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public i(CoroutineScope scope, com.moloco.sdk.internal.services.i timeProvider, String name) {
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(timeProvider, "timeProvider");
        e0.checkNotNullParameter(name, "name");
        this.f46008a = scope;
        this.f46009b = timeProvider;
        this.f46010c = name;
        this.f46012e = new SimpleDateFormat("HH:mm:ss");
    }

    public final synchronized void a(long j10, kv.l task) {
        Throwable th2;
        try {
            try {
                e0.checkNotNullParameter(task, "task");
                Job job = this.f46011d;
                if (job != null) {
                    try {
                        a(job);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        try {
            this.f46011d = BuildersKt__Builders_commonKt.launch$default(this.f46008a, null, null, new b(j10, task, null), 3, null);
        } catch (Throwable th6) {
            th = th6;
            th2 = th;
            throw th2;
        }
    }

    public final void a(Job job) {
        e0.checkNotNullParameter(job, "job");
        if (job.isActive()) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", o2.o(new StringBuilder("Task "), this.f46010c, " cancelled"), null, false, 12, null);
        }
    }
}
