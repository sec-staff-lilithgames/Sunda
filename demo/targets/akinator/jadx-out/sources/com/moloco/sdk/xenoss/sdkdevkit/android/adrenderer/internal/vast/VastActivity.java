package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p0.w;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VastActivity extends ComponentActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final a f48810f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final MutableSharedFlow f48811g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: h, reason: collision with root package name */
    public static WeakReference f48812h = new WeakReference(null);

    /* renamed from: i, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f48813i;

    /* renamed from: j, reason: collision with root package name */
    public static kv.p f48814j;

    /* renamed from: k, reason: collision with root package name */
    public static kv.a f48815k;

    /* renamed from: l, reason: collision with root package name */
    public static Job f48816l;

    /* renamed from: m, reason: collision with root package name */
    public static e0 f48817m;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f48818c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f48819e = com.google.android.gms.internal.play_billing.a.o();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        public static final class C0451a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f48820i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f48821j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ d0 f48822k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ kv.l f48823l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Context f48824m;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0452a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48825i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ kv.l f48826j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Context f48827k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ d0 f48828l;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C0453a extends bv.n implements kv.p {

                    /* renamed from: i, reason: collision with root package name */
                    public int f48829i;

                    /* renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ kv.l f48830j;

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0454a extends bv.n implements kv.p {

                        /* renamed from: i, reason: collision with root package name */
                        public /* synthetic */ Object f48831i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ kv.l f48832j;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0454a(kv.l lVar, zu.d<? super C0454a> dVar) {
                            super(2, dVar);
                            this.f48832j = lVar;
                        }

                        @Override // kv.p
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, zu.d<? super x0> dVar) {
                            return ((C0454a) create(bVar, dVar)).invokeSuspend(x0.f87415a);
                        }

                        @Override // bv.a
                        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                            C0454a c0454a = new C0454a(this.f48832j, dVar);
                            c0454a.f48831i = obj;
                            return c0454a;
                        }

                        @Override // bv.a
                        public final Object invokeSuspend(Object obj) {
                            av.e.getCOROUTINE_SUSPENDED();
                            a0.throwOnFailure(obj);
                            this.f48832j.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48831i);
                            return x0.f87415a;
                        }
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    public static final class b extends bv.n implements kv.p {

                        /* renamed from: i, reason: collision with root package name */
                        public /* synthetic */ Object f48833i;

                        public b(zu.d<? super b> dVar) {
                            super(2, dVar);
                        }

                        @Override // kv.p
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, zu.d<? super Boolean> dVar) {
                            return ((b) create(bVar, dVar)).invokeSuspend(x0.f87415a);
                        }

                        @Override // bv.a
                        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                            b bVar = new b(dVar);
                            bVar.f48833i = obj;
                            return bVar;
                        }

                        @Override // bv.a
                        public final Object invokeSuspend(Object obj) {
                            av.e.getCOROUTINE_SUSPENDED();
                            a0.throwOnFailure(obj);
                            return bv.b.boxBoolean(VastActivity.f48810f.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48833i));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0453a(kv.l lVar, zu.d<? super C0453a> dVar) {
                        super(2, dVar);
                        this.f48830j = lVar;
                    }

                    @Override // kv.p
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                        return ((C0453a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                    }

                    @Override // bv.a
                    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                        return new C0453a(this.f48830j, dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                        int i10 = this.f48829i;
                        if (i10 == 0) {
                            a0.throwOnFailure(obj);
                            Flow flowOnEach = FlowKt.onEach(VastActivity.f48811g, new C0454a(this.f48830j, null));
                            b bVar = new b(null);
                            this.f48829i = 1;
                            if (FlowKt.firstOrNull(flowOnEach, bVar, this) == coroutine_suspended) {
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
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                public static final class b extends bv.n implements kv.p {

                    /* renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ Context f48834i;

                    /* renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ d0 f48835j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Context context, d0 d0Var, zu.d<? super b> dVar) {
                        super(2, dVar);
                        this.f48834i = context;
                        this.f48835j = d0Var;
                    }

                    @Override // kv.p
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                        return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                    }

                    @Override // bv.a
                    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                        return new b(this.f48834i, this.f48835j, dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        av.e.getCOROUTINE_SUSPENDED();
                        a0.throwOnFailure(obj);
                        Context context = this.f48834i;
                        Intent intent = new Intent(context, (Class<?>) VastActivity.class);
                        d0 d0Var = this.f48835j;
                        j0.c(intent, d0Var.g());
                        j0.a(intent, d0Var.c());
                        j0.b(intent, d0Var.d());
                        j0.a(intent, d0Var.e());
                        j0.c(intent, d0Var.f());
                        j0.b(intent, d0Var.b());
                        j0.a(intent, d0Var.a());
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        return x0.f87415a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0452a(kv.l lVar, Context context, d0 d0Var, zu.d<? super C0452a> dVar) {
                    super(2, dVar);
                    this.f48826j = lVar;
                    this.f48827k = context;
                    this.f48828l = d0Var;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Job> dVar) {
                    return ((C0452a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    C0452a c0452a = new C0452a(this.f48826j, this.f48827k, this.f48828l, dVar);
                    c0452a.f48825i = obj;
                    return c0452a;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f48825i;
                    a aVar = VastActivity.f48810f;
                    VastActivity.f48816l = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0453a(this.f48826j, null), 3, null);
                    return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(this.f48827k, this.f48828l, null), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0451a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, d0 d0Var, kv.l lVar, Context context, zu.d<? super C0451a> dVar) {
                super(2, dVar);
                this.f48821j = aVar;
                this.f48822k = d0Var;
                this.f48823l = lVar;
                this.f48824m = context;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Job> dVar) {
                return ((C0451a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0451a(this.f48821j, this.f48822k, this.f48823l, this.f48824m, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = this.f48822k;
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48820i;
                try {
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        a aVar = VastActivity.f48810f;
                        VastActivity.f48813i = this.f48821j;
                        VastActivity.f48814j = d0Var.h();
                        C0452a c0452a = new C0452a(this.f48823l, this.f48824m, d0Var, null);
                        this.f48820i = 1;
                        obj = CoroutineScopeKt.coroutineScope(c0452a, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                    }
                    return (Job) obj;
                } finally {
                    a aVar2 = VastActivity.f48810f;
                    VastActivity vastActivityB = aVar2.b();
                    if (vastActivityB != null) {
                        vastActivityB.finish();
                    }
                    VastActivity.f48815k = null;
                    VastActivity.f48813i = null;
                    VastActivity.f48814j = null;
                    aVar2.a();
                }
            }
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }

        public final VastActivity b() {
            return (VastActivity) VastActivity.f48812h.get();
        }

        public final void a(VastActivity vastActivity) {
            VastActivity.f48812h = new WeakReference(vastActivity);
            if (vastActivity == null) {
                a();
            }
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Context context, d0 d0Var, kv.a aVar2, e0 e0Var, kv.l lVar, zu.d<? super x0> dVar) {
            VastActivity.f48817m = e0Var;
            VastActivity.f48815k = aVar2;
            Object objWithContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getMain(), new C0451a(aVar, d0Var, lVar, context, null), dVar);
            return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
        }

        public final void a() {
            Job job = VastActivity.f48816l;
            if (job == null || !job.isActive()) {
                return;
            }
            Job job2 = VastActivity.f48816l;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            VastActivity.f48816l = null;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof b.f) || kotlin.jvm.internal.e0.areEqual(bVar, b.e.f49467a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48836i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f48837j;

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, zu.d<? super x0> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = VastActivity.this.new b(dVar);
            bVar.f48837j = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48836i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48837j;
                MutableSharedFlow mutableSharedFlow = VastActivity.f48811g;
                this.f48837j = bVar2;
                this.f48836i = 1;
                if (mutableSharedFlow.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48837j;
                a0.throwOnFailure(obj);
            }
            if (VastActivity.f48810f.a(bVar)) {
                VastActivity.this.finish();
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements kv.p {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f48840c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.p f48841e;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, kv.p pVar) {
            this.f48840c = aVar;
            this.f48841e = pVar;
        }

        public final void a(w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1009520481, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:104)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(VastActivity.this, this.f48840c, this.f48841e, VastActivity.f48817m, wVar, 0, 0);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = f48813i;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        kv.p pVar = f48814j;
        if (pVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0VarF = a.h.f47463a.f();
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVarB = a.k.f47476a.b();
        Intent intent = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean zG = j0.g(intent);
        Intent intent2 = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent2, "getIntent(...)");
        Boolean boolE = j0.e(intent2);
        Intent intent3 = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent3, "getIntent(...)");
        int iF = j0.f(intent3);
        Intent intent4 = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent4, "getIntent(...)");
        int iC = j0.c(intent4);
        Intent intent5 = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent5, "getIntent(...)");
        int iD = j0.d(intent5);
        Intent intent6 = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent6, "getIntent(...)");
        boolean zB = j0.b(intent6);
        Intent intent7 = getIntent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent7, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a(aVar, e0VarF, this, bVarB, zG, boolE, iF, iC, iD, zB, j0.a(intent7));
        this.f48818c = aVarA;
        f48810f.a(this);
        FlowKt.launchIn(FlowKt.onEach(aVarA.a(), new b(null)), this.f48819e);
        g.d.setContent$default(this, null, z0.u.composableLambdaInstance(-1009520481, true, new c(aVarA, pVar)), 1, null);
        aVarA.d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kv.a aVar = f48815k;
        if (aVar != null) {
            aVar.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar2 = this.f48818c;
        if (aVar2 != null) {
            aVar2.destroy();
        }
        this.f48818c = null;
        CoroutineScopeKt.cancel$default(this.f48819e, null, 1, null);
        f48810f.a((VastActivity) null);
    }
}
