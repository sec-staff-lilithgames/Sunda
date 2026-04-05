package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import bv.n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import p0.o2;
import tu.a0;
import tu.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public final t f50013b;

    /* renamed from: e, reason: collision with root package name */
    public p0 f50015e;

    /* renamed from: f, reason: collision with root package name */
    public Job f50016f;

    /* renamed from: g, reason: collision with root package name */
    public int f50017g;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f50014c = com.google.android.gms.internal.play_billing.a.o();

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f50018h = StateFlowKt.MutableStateFlow(d.c.f49900a);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50019i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return i.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            StateFlow<k0> stateFlowA;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50019i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                i iVar = i.this;
                if (iVar.f50015e == null) {
                    iVar.f50015e = new p0(iVar.f50017g, iVar.f50014c, null);
                } else {
                    p0 p0Var = iVar.f50015e;
                    if (p0Var != null) {
                        p0Var.a(iVar.f50017g);
                    }
                }
                p0 p0Var2 = iVar.f50015e;
                if (p0Var2 != null && (stateFlowA = p0Var2.a()) != null) {
                    C0482a c0482a = new C0482a(iVar, null);
                    this.f50019i = 1;
                    if (FlowKt.collectLatest(stateFlowA, c0482a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i$a$a, reason: collision with other inner class name */
        public static final class C0482a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ int f50021i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ i f50022j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0482a(i iVar, zu.d<? super C0482a> dVar) {
                super(2, dVar);
                this.f50022j = iVar;
            }

            public final Object a(int i10, zu.d<? super x0> dVar) {
                return ((C0482a) create(k0.m7055boximpl(i10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0482a c0482a = new C0482a(this.f50022j, dVar);
                c0482a.f50021i = ((k0) obj).m7061unboximpl();
                return c0482a;
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((k0) obj).m7061unboximpl(), (zu.d) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                int i10 = this.f50021i;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                i iVar = this.f50022j;
                MolocoLogger.info$default(molocoLogger, i.d(iVar), duhsDlGWdBkekB.GVxnFHQ + ((Object) k0.m7060toStringimpl(i10)), null, false, 12, null);
                iVar.f50017g = i10;
                MolocoLogger.info$default(molocoLogger, i.d(iVar), "Propagating state: " + j.b(i10), null, false, 12, null);
                iVar.m().setValue(j.b(i10));
                return x0.f87415a;
            }
        }
    }

    public i(t tVar) {
        this.f50013b = tVar;
    }

    public static final /* synthetic */ String d(i iVar) {
        iVar.getClass();
        return "LinearGoNextActionImpl";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h
    public void J() {
        m().setValue(d.c.f49900a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        return this.f50018h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h
    public void pause() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "LinearGoNextActionImpl", "Canceling timer", null, false, 12, null);
        Job job = this.f50016f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h
    public void t() {
        if (Integer.compare(this.f50017g ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0) {
            a(this.f50017g & 4294967295L);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h
    public void a(int i10, int i11) {
        double d10 = (i10 / i11) * 100;
        if (i10 >= i11) {
            m().setValue(d.a.f49898a);
            return;
        }
        t tVar = this.f50013b;
        if (tVar == null) {
            m().setValue(d.c.f49900a);
            return;
        }
        if (this.f50016f == null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Starting timer", null, false, 12, null);
            if (tVar instanceof t.a) {
                MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Offset Percents detected", null, false, 12, null);
                a(j.b(new qv.m((int) d10, ((t.a) tVar).a()), i11) & 4294967295L);
            } else {
                if (tVar instanceof t.b) {
                    MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Offset Millis detected", null, false, 12, null);
                    a(j.b(((t.b) tVar).a()));
                    return;
                }
                throw new tu.t();
            }
        }
    }

    public final void a(long j10) {
        if (j.b(this.f50016f)) {
            this.f50017g = k0.m7056constructorimpl((int) j10);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "LinearGoNextActionImpl", o2.n(j10, "Start timer for duration: ", " seconds"), null, false, 12, null);
            this.f50016f = BuildersKt__Builders_commonKt.launch$default(this.f50014c, null, null, new a(null), 3, null);
        }
    }
}
