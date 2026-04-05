package io.odeeo.internal.n1;

import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.k;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f65065c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final CoroutineExceptionHandler f65066d;

    /* renamed from: e, reason: collision with root package name */
    public static CoroutineScope f65067e;

    /* renamed from: a, reason: collision with root package name */
    public MutableSharedFlow<io.odeeo.internal.n1.c> f65068a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedFlow<io.odeeo.internal.n1.c> f65069b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public l f65070a;

        /* renamed from: b, reason: collision with root package name */
        public l f65071b;

        /* renamed from: c, reason: collision with root package name */
        public l f65072c;

        /* renamed from: d, reason: collision with root package name */
        public l f65073d;

        /* renamed from: e, reason: collision with root package name */
        public l f65074e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f65075f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.n1.e$a$a, reason: collision with other inner class name */
        public static final class C0626a extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0626a f65076a = new C0626a();

            public C0626a() {
                super(1);
            }

            public final void invoke(io.odeeo.internal.n1.a it) {
                e0.checkNotNullParameter(it, "it");
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.a) obj);
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f65077a = new b();

            public b() {
                super(1);
            }

            public final void invoke(io.odeeo.internal.n1.b it) {
                e0.checkNotNullParameter(it, "it");
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.b) obj);
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f65078a = new c();

            public c() {
                super(1);
            }

            public final void invoke(g it) {
                e0.checkNotNullParameter(it, "it");
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((g) obj);
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class d extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public static final d f65079a = new d();

            public d() {
                super(1);
            }

            public final void invoke(f it) {
                e0.checkNotNullParameter(it, "it");
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((f) obj);
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.n1.e$a$e, reason: collision with other inner class name */
        public static final class C0627e extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0627e f65080a = new C0627e();

            public C0627e() {
                super(1);
            }

            public final void invoke(h it) {
                e0.checkNotNullParameter(it, "it");
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((h) obj);
                return x0.f87415a;
            }
        }

        public a(e this$0) {
            e0.checkNotNullParameter(this$0, "this$0");
            this.f65075f = this$0;
            this.f65070a = d.f65079a;
            this.f65071b = c.f65078a;
            this.f65072c = C0626a.f65076a;
            this.f65073d = C0627e.f65080a;
            this.f65074e = b.f65077a;
        }

        public final l getOnBadInternetError() {
            return this.f65072c;
        }

        public final l getOnBadRequestError() {
            return this.f65074e;
        }

        public final l getOnError() {
            return this.f65071b;
        }

        public final l getOnSuccess() {
            return this.f65070a;
        }

        public final l getOnWrongAuthenticationDataError() {
            return this.f65073d;
        }

        public final void onBadInternetError(l block) {
            e0.checkNotNullParameter(block, "block");
            this.f65072c = block;
        }

        public final void onBadRequestError(l block) {
            e0.checkNotNullParameter(block, "block");
            this.f65074e = block;
        }

        public final void onError(l block) {
            e0.checkNotNullParameter(block, "block");
            this.f65071b = block;
        }

        public final void onSuccess(l block) {
            e0.checkNotNullParameter(block, "block");
            this.f65070a = block;
        }

        public final void onWrongAuthenticationDataError(l block) {
            e0.checkNotNullParameter(block, "block");
            this.f65073d = block;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @bv.f(c = "io.odeeo.sdk.state.StateListener$Companion$clearFlow$1", f = "StateListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends n implements q {

            /* renamed from: a, reason: collision with root package name */
            public int f65081a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f65082b;

            public a(zu.d<? super a> dVar) {
                super(3, dVar);
            }

            @Override // kv.q
            public final Object invoke(io.odeeo.internal.n1.c cVar, f fVar, zu.d<? super f> dVar) {
                a aVar = new a(dVar);
                aVar.f65082b = fVar;
                return aVar.invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                if (this.f65081a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return (f) this.f65082b;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @bv.f(c = "io.odeeo.sdk.state.StateListener$Companion$combine$1", f = "StateListener.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.odeeo.internal.n1.e$b$b, reason: collision with other inner class name */
        public static final class C0628b extends n implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f65083a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f65084b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e[] f65085c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l f65086d;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @bv.f(c = "io.odeeo.sdk.state.StateListener$Companion$combine$1$1$1", f = "StateListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: io.odeeo.internal.n1.e$b$b$a */
            public static final class a extends n implements q {

                /* renamed from: a, reason: collision with root package name */
                public int f65087a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f65088b;

                /* renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f65089c;

                public a(zu.d<? super a> dVar) {
                    super(3, dVar);
                }

                @Override // kv.q
                public final Object invoke(io.odeeo.internal.n1.c cVar, io.odeeo.internal.n1.c cVar2, zu.d<? super io.odeeo.internal.n1.c> dVar) {
                    a aVar = new a(dVar);
                    aVar.f65088b = cVar;
                    aVar.f65089c = cVar2;
                    return aVar.invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    if (this.f65087a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return ((io.odeeo.internal.n1.c) this.f65088b).plus((io.odeeo.internal.n1.c) this.f65089c);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @bv.f(c = "io.odeeo.sdk.state.StateListener$Companion$combine$1$2", f = "StateListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: io.odeeo.internal.n1.e$b$b$b, reason: collision with other inner class name */
            public static final class C0629b extends n implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f65090a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f65091b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l f65092c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f65093d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ b1 f65094e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0629b(l lVar, CoroutineScope coroutineScope, b1 b1Var, zu.d<? super C0629b> dVar) {
                    super(2, dVar);
                    this.f65092c = lVar;
                    this.f65093d = coroutineScope;
                    this.f65094e = b1Var;
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    C0629b c0629b = new C0629b(this.f65092c, this.f65093d, this.f65094e, dVar);
                    c0629b.f65091b = obj;
                    return c0629b;
                }

                @Override // kv.p
                public final Object invoke(io.odeeo.internal.n1.c cVar, zu.d<? super x0> dVar) {
                    return ((C0629b) create(cVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    if (this.f65090a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    io.odeeo.internal.n1.c cVar = (io.odeeo.internal.n1.c) this.f65091b;
                    this.f65092c.invoke(cVar);
                    cVar.cancel(this.f65093d);
                    b1 b1Var = this.f65094e;
                    b1Var.f71816b = e.f65065c.a((Flow) b1Var.f71816b);
                    return x0.f87415a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0628b(e[] eVarArr, l lVar, zu.d<? super C0628b> dVar) {
                super(2, dVar);
                this.f65085c = eVarArr;
                this.f65086d = lVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0628b c0628b = new C0628b(this.f65085c, this.f65086d, dVar);
                c0628b.f65084b = obj;
                return c0628b;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f65083a;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f65084b;
                    e[] eVarArr = this.f65085c;
                    ArrayList arrayList = new ArrayList(eVarArr.length);
                    for (e eVar : eVarArr) {
                        arrayList.add(eVar.getCurrentState());
                    }
                    b1 b1Var = new b1();
                    String simpleName = coroutineScope.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
                    b1Var.f71816b = StateFlowKt.MutableStateFlow(new f(simpleName, null, null, 6, null));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        b1Var.f71816b = FlowKt.flowCombine((Flow) b1Var.f71816b, (SharedFlow) it.next(), new a(null));
                    }
                    Flow flowCancellable = FlowKt.cancellable((Flow) b1Var.f71816b);
                    C0629b c0629b = new C0629b(this.f65086d, coroutineScope, b1Var, null);
                    this.f65083a = 1;
                    if (FlowKt.collectLatest(flowCancellable, c0629b, this) == coroutine_suspended) {
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

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0628b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public b() {
        }

        public final Flow<io.odeeo.internal.n1.c> a(Flow<? extends io.odeeo.internal.n1.c> flow) {
            String simpleName = b.class.getSimpleName();
            e0.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
            return FlowKt.flowCombine(flow, StateFlowKt.MutableStateFlow(new f(simpleName, null, null, 6, null)), new a(null));
        }

        public final Job combine(e[] initListeners, l block) {
            e0.checkNotNullParameter(initListeners, "initListeners");
            e0.checkNotNullParameter(block, "block");
            return BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new C0628b(initListeners, block, null), 3, null);
        }

        public final CoroutineScope getScope() {
            return e.f65067e;
        }

        public final void setScope(CoroutineScope coroutineScope) {
            e0.checkNotNullParameter(coroutineScope, "<set-?>");
            e.f65067e = coroutineScope;
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.state.StateListener$setState$1", f = "StateListener.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f65095a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.n1.c f65097c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.odeeo.internal.n1.c cVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f65097c = cVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return e.this.new c(this.f65097c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f65095a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = e.this.f65068a;
                io.odeeo.internal.n1.c cVar = this.f65097c;
                this.f65095a = 1;
                if (mutableSharedFlow.emit(cVar, this) == coroutine_suspended) {
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

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends zu.a implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(m mVar, Throwable th2) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            CoroutineName coroutineName = (CoroutineName) mVar.get(CoroutineName.Key);
            sb2.append((Object) (coroutineName == null ? null : coroutineName.getName()));
            sb2.append(" ::: ");
            sb2.append(th2.getCause());
            printStream.println((Object) sb2.toString());
            th2.printStackTrace(System.out);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.state.StateListener$stateListenerLaunch$1", f = "StateListener.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.odeeo.internal.n1.e$e, reason: collision with other inner class name */
    public static final class C0630e extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f65098a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65099b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f65101d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.n1.e$e$a */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f65102a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f65103b;

            public a(a aVar, CoroutineScope coroutineScope) {
                this.f65102a = aVar;
                this.f65103b = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return emit((io.odeeo.internal.n1.c) obj, (zu.d<? super x0>) dVar);
            }

            public final Object emit(io.odeeo.internal.n1.c cVar, zu.d<? super x0> dVar) {
                if (cVar instanceof f) {
                    this.f65102a.getOnSuccess().invoke(cVar);
                } else if (cVar instanceof io.odeeo.internal.n1.a) {
                    this.f65102a.getOnBadInternetError().invoke(cVar);
                } else if (cVar instanceof h) {
                    this.f65102a.getOnWrongAuthenticationDataError().invoke(cVar);
                } else if (cVar instanceof io.odeeo.internal.n1.b) {
                    this.f65102a.getOnBadRequestError().invoke(cVar);
                } else if (cVar instanceof g) {
                    this.f65102a.getOnError().invoke(cVar);
                }
                cVar.cancel(this.f65103b);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0630e(l lVar, zu.d<? super C0630e> dVar) {
            super(2, dVar);
            this.f65101d = lVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C0630e c0630e = e.this.new C0630e(this.f65101d, dVar);
            c0630e.f65099b = obj;
            return c0630e;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f65098a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f65099b;
                a aVar = new a(e.this);
                this.f65101d.invoke(aVar);
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(e.this.getCurrentState(), coroutineScope, SharingStarted.Companion.getLazily(), 0);
                a aVar2 = new a(aVar, coroutineScope);
                this.f65098a = 1;
                if (sharedFlowShareIn.collect(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C0630e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    static {
        d dVar = new d(CoroutineExceptionHandler.Key);
        f65066d = dVar;
        f65067e = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()).plus(new CoroutineName("InitializationListenerScope")).plus(dVar));
    }

    public e() {
        MutableSharedFlow<io.odeeo.internal.n1.c> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, 0, BufferOverflow.DROP_OLDEST);
        this.f65068a = MutableSharedFlow;
        this.f65069b = MutableSharedFlow;
    }

    public final SharedFlow<io.odeeo.internal.n1.c> getCurrentState() {
        return this.f65069b;
    }

    public final void setState(io.odeeo.internal.n1.c state) {
        e0.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(f65067e, null, null, new c(state, null), 3, null);
    }

    public final Job stateListenerLaunch(l block) {
        e0.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(f65067e, null, null, new C0630e(block, null), 3, null);
    }
}
