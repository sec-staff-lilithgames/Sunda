package io.odeeo.internal.d1;

import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.state.CancellationOption;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.p;
import p0.o2;
import tu.a0;
import tu.o;
import tu.q;
import tu.x0;
import uu.o1;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.n1.e {

    /* renamed from: p, reason: collision with root package name */
    public static final b f63618p = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.j1.f f63619f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.u1.a f63620g;

    /* renamed from: h, reason: collision with root package name */
    public final CoroutineScope f63621h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.q1.a f63622i;

    /* renamed from: j, reason: collision with root package name */
    public final io.odeeo.internal.t1.a f63623j;

    /* renamed from: k, reason: collision with root package name */
    public io.odeeo.internal.e1.a f63624k;

    /* renamed from: l, reason: collision with root package name */
    public io.odeeo.internal.e1.b f63625l;

    /* renamed from: m, reason: collision with root package name */
    public io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> f63626m;

    /* renamed from: n, reason: collision with root package name */
    public final o f63627n;

    /* renamed from: o, reason: collision with root package name */
    public final o f63628o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.d1.a$a, reason: collision with other inner class name */
    public static final class C0601a {

        @lk.a
        @lk.c("error_code")
        private final int code;

        @lk.a
        @lk.c("error")
        private final String message;

        public C0601a(int i10, String message) {
            e0.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }

        public static /* synthetic */ C0601a copy$default(C0601a c0601a, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = c0601a.code;
            }
            if ((i11 & 2) != 0) {
                str = c0601a.message;
            }
            return c0601a.copy(i10, str);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final C0601a copy(int i10, String message) {
            e0.checkNotNullParameter(message, "message");
            return new C0601a(i10, message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0601a)) {
                return false;
            }
            C0601a c0601a = (C0601a) obj;
            return this.code == c0601a.code && e0.areEqual(this.message, c0601a.message);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AppConfigError(code=");
            sb2.append(this.code);
            sb2.append(", message=");
            return o2.q(sb2, this.message, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63629a;

        static {
            int[] iArr = new int[AdUnit.RewardType.values().length];
            iArr[AdUnit.RewardType.EndLevel.ordinal()] = 1;
            iArr[AdUnit.RewardType.InLevel.ordinal()] = 2;
            f63629a = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f63630a = new d();

        public d() {
            super(0);
        }

        @Override // kv.a
        public final io.odeeo.internal.n1.g invoke() {
            io.odeeo.internal.n1.g gVar = new io.odeeo.internal.n1.g(1000, "Exception during SDK initialization, internal server error");
            gVar.setOnCancellation(CancellationOption.DoNotCancel);
            gVar.setParameters(o1.mapOf(tu.e0.to("delaySecs", 30)));
            return gVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.config.ConfigManager$fetchAppConfig$1", f = "ConfigManager.kt", i = {0, 1}, l = {58, TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class e extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f63631a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f63632b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.j1.k f63634d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.d1.a$e$a, reason: collision with other inner class name */
        public static final class C0602a extends f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f63635a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0602a(CoroutineScope coroutineScope) {
                super(0);
                this.f63635a = coroutineScope;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m4586invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4586invoke() {
                CoroutineScopeKt.cancel$default(this.f63635a, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.odeeo.internal.j1.k kVar, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f63634d = kVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            e eVar = a.this.new e(this.f63634d, dVar);
            eVar.f63632b = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        
            if (r5.retryFetch$odeeoSdk_release(r10, "AppConfig", r6, r9) == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:7:0x0016). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:7:0x0016). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0082 -> B:7:0x0016). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0085 -> B:7:0x0016). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.f63631a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r1 = r9.f63632b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r10)
            L16:
                r10 = r1
                goto L90
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f63632b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r10)
                goto L4b
            L29:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.f63632b
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r5 = "Fetching AppConfig"
                io.odeeo.internal.b2.a.i(r5, r1)
            L37:
                io.odeeo.internal.d1.a r1 = io.odeeo.internal.d1.a.this
                io.odeeo.internal.q1.a r1 = io.odeeo.internal.d1.a.access$getFetchAppConfigUseCase$p(r1)
                r9.f63632b = r10
                r9.f63631a = r4
                java.lang.Object r1 = r1.invoke(r9)
                if (r1 != r0) goto L48
                goto L84
            L48:
                r8 = r1
                r1 = r10
                r10 = r8
            L4b:
                io.odeeo.internal.a.c r10 = (io.odeeo.internal.a.c) r10
                boolean r5 = r10 instanceof io.odeeo.internal.a.b
                r6 = 0
                if (r5 == 0) goto L63
                io.odeeo.internal.d1.a r5 = io.odeeo.internal.d1.a.this
                io.odeeo.internal.a.b r10 = (io.odeeo.internal.a.b) r10
                java.lang.Object r10 = r10.getValue()
                io.odeeo.internal.e1.a r10 = (io.odeeo.internal.e1.a) r10
                r5.setAppConfig(r10)
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(r1, r6, r4, r6)
                goto L16
            L63:
                boolean r5 = r10 instanceof io.odeeo.internal.a.a
                if (r5 == 0) goto L16
                io.odeeo.internal.a.a r10 = (io.odeeo.internal.a.a) r10
                java.lang.Object r5 = r10.getError()
                boolean r5 = r5 instanceof io.odeeo.internal.q1.a.AbstractC0638a.C0639a
                if (r5 == 0) goto L85
                io.odeeo.internal.j1.k r5 = r9.f63634d
                io.odeeo.internal.d1.a$e$a r6 = new io.odeeo.internal.d1.a$e$a
                r6.<init>(r1)
                r9.f63632b = r1
                r9.f63631a = r3
                java.lang.String r7 = "AppConfig"
                java.lang.Object r10 = r5.retryFetch$odeeoSdk_release(r10, r7, r6, r9)
                if (r10 != r0) goto L16
            L84:
                return r0
            L85:
                java.lang.Object[] r10 = new java.lang.Object[r2]
                java.lang.String r5 = "Code 500 while fetching AppConfig"
                io.odeeo.internal.b2.a.w(r5, r10)
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(r1, r6, r4, r6)
                goto L16
            L90:
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r10)
                if (r1 != 0) goto L37
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.d1.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.config.ConfigManager$fetchGlobalConfig$1", f = "ConfigManager.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f63636a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f63638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f63638c = i10;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return a.this.new f(this.f63638c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f63636a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                a aVar = a.this;
                long j10 = this.f63638c;
                this.f63636a = 1;
                if (aVar.a(j10, this) == coroutine_suspended) {
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
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0, 1}, l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "fetchWithDelay", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class g extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f63639a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f63640b;

        /* renamed from: d, reason: collision with root package name */
        public int f63642d;

        public g(zu.d<? super g> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f63640b = obj;
            this.f63642d |= Integer.MIN_VALUE;
            return a.this.a(0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f63643a = new h();

        public h() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.n1.c) obj);
            return x0.f87415a;
        }

        public final void invoke(io.odeeo.internal.n1.c setErrorState) {
            e0.checkNotNullParameter(setErrorState, "$this$setErrorState");
            setErrorState.setOnCancellation(CancellationOption.Cancel);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final i f63644a = new i();

        public i() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.n1.c) obj);
            return x0.f87415a;
        }

        public final void invoke(io.odeeo.internal.n1.c setErrorState) {
            e0.checkNotNullParameter(setErrorState, "$this$setErrorState");
            setErrorState.setOnCancellation(CancellationOption.Cancel);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final j f63645a = new j();

        public j() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.n1.c) obj);
            return x0.f87415a;
        }

        public final void invoke(io.odeeo.internal.n1.c setErrorState) {
            e0.checkNotNullParameter(setErrorState, "$this$setErrorState");
            setErrorState.setOnCancellation(CancellationOption.DoNotCancel);
            setErrorState.setParameters(o1.mapOf(tu.e0.to("delaySecs", 30)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final k f63646a = new k();

        public k() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.n1.c) obj);
            return x0.f87415a;
        }

        public final void invoke(io.odeeo.internal.n1.c setErrorState) {
            e0.checkNotNullParameter(setErrorState, "$this$setErrorState");
            setErrorState.setOnCancellation(CancellationOption.DoNotCancel);
            setErrorState.setParameters(o1.mapOf(tu.e0.to("delaySecs", 30)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l extends f0 implements kv.a {
        public l() {
            super(0);
        }

        @Override // kv.a
        public final io.odeeo.internal.j1.k invoke() {
            return a.this.getRetryManagerProvider().get();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(io.odeeo.internal.j1.f networkManager, io.odeeo.internal.u1.a personalInfo, CoroutineScope configManagerScope, io.odeeo.internal.q1.a fetchAppConfigUseCase, io.odeeo.internal.t1.a fetchGlobalConfigUseCase) {
        e0.checkNotNullParameter(networkManager, "networkManager");
        e0.checkNotNullParameter(personalInfo, "personalInfo");
        e0.checkNotNullParameter(configManagerScope, "configManagerScope");
        e0.checkNotNullParameter(fetchAppConfigUseCase, "fetchAppConfigUseCase");
        e0.checkNotNullParameter(fetchGlobalConfigUseCase, "fetchGlobalConfigUseCase");
        this.f63619f = networkManager;
        this.f63620g = personalInfo;
        this.f63621h = configManagerScope;
        this.f63622i = fetchAppConfigUseCase;
        this.f63623j = fetchGlobalConfigUseCase;
        int i10 = 0;
        this.f63624k = new io.odeeo.internal.e1.a(false, i10, false, 7, null);
        Object[] objArr = 0 == true ? 1 : 0;
        this.f63625l = new io.odeeo.internal.e1.b(i10, objArr, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, 32767, null);
        this.f63627n = q.lazy(new l());
        this.f63628o = q.lazy(d.f63630a);
    }

    public static /* synthetic */ Job fetchAppConfig$default(a aVar, io.odeeo.internal.j1.k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            io.odeeo.internal.j1.k kVar2 = aVar.getRetryManagerProvider().get();
            e0.checkNotNullExpressionValue(kVar2, "fun fetchAppConfig(retry… } while (isActive)\n    }");
            kVar = kVar2;
        }
        return aVar.fetchAppConfig(kVar);
    }

    public static /* synthetic */ Job fetchGlobalConfig$default(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return aVar.fetchGlobalConfig(i10);
    }

    public static /* synthetic */ void setErrorState$odeeoSdk_release$default(a aVar, Class cls, w0 w0Var, String str, kv.l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        aVar.setErrorState$odeeoSdk_release(cls, w0Var, str, lVar);
    }

    public final io.odeeo.internal.n1.g a() {
        return (io.odeeo.internal.n1.g) this.f63628o.getValue();
    }

    public final io.odeeo.internal.j1.k b() {
        Object value = this.f63627n.getValue();
        e0.checkNotNullExpressionValue(value, "<get-retryManager>(...)");
        return (io.odeeo.internal.j1.k) value;
    }

    public final Job fetchAppConfig(io.odeeo.internal.j1.k retryManager) {
        e0.checkNotNullParameter(retryManager, "retryManager");
        return BuildersKt__Builders_commonKt.launch$default(this.f63621h, null, null, new e(retryManager, null), 3, null);
    }

    public final Job fetchGlobalConfig(int i10) {
        return BuildersKt__Builders_commonKt.launch$default(this.f63621h, null, null, new f(i10, null), 3, null);
    }

    public final io.odeeo.internal.e1.a getAppConfig() {
        return this.f63624k;
    }

    public final io.odeeo.internal.e1.b getGlobalConfig() {
        return this.f63625l;
    }

    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> getRetryManagerProvider() {
        io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar = this.f63626m;
        if (aVar != null) {
            return aVar;
        }
        e0.throwUninitializedPropertyAccessException("retryManagerProvider");
        return null;
    }

    public final int getRewardLevelTimeMS(AdUnit.RewardType rewardType) {
        e0.checkNotNullParameter(rewardType, "rewardType");
        int i10 = c.f63629a[rewardType.ordinal()];
        return i10 != 1 ? i10 != 2 ? this.f63625l.getRewardInLevelTimeMs() : this.f63625l.getRewardInLevelTimeMs() : this.f63625l.getRewardEndLevelTimeMs();
    }

    public final <T extends io.odeeo.internal.n1.c> io.odeeo.internal.n1.c parseError$odeeoSdk_release(Class<T> clazz, w0 w0Var) {
        e0.checkNotNullParameter(clazz, "clazz");
        io.odeeo.internal.y1.f fVarConverter$default = io.odeeo.internal.j1.f.converter$default(this.f63619f, clazz, null, 2, null);
        if (w0Var != null) {
            try {
                return (io.odeeo.internal.n1.c) fVarConverter$default.convert(w0Var);
            } catch (Exception e10) {
                io.odeeo.internal.b2.a.w(e10, e10.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    public final void setAppConfig(io.odeeo.internal.e1.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f63624k = aVar;
    }

    public final <T extends io.odeeo.internal.n1.c> void setErrorState$odeeoSdk_release(Class<T> clazz, w0 w0Var, String str, kv.l lVar) {
        String message;
        e0.checkNotNullParameter(clazz, "clazz");
        io.odeeo.internal.n1.c error$odeeoSdk_release = parseError$odeeoSdk_release(clazz, w0Var);
        if (error$odeeoSdk_release != null && (message = error$odeeoSdk_release.getMessage()) != null) {
            str = message;
        }
        io.odeeo.internal.b2.a.w(str, new Object[0]);
        if (error$odeeoSdk_release == null) {
            error$odeeoSdk_release = null;
        } else if (lVar != null) {
            lVar.invoke(error$odeeoSdk_release);
        }
        if (error$odeeoSdk_release == null) {
            error$odeeoSdk_release = a();
        }
        setState(error$odeeoSdk_release);
    }

    public final void setGlobalConfig(io.odeeo.internal.e1.b bVar) {
        e0.checkNotNullParameter(bVar, "<set-?>");
        this.f63625l = bVar;
    }

    public final void setRetryManagerProvider(io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f63626m = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r19, zu.d<? super tu.x0> r21) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.d1.a.a(long, zu.d):java.lang.Object");
    }

    public final void a(io.odeeo.internal.e1.b bVar) {
        this.f63620g.setCountry$odeeoSdk_release(bVar.getCountry());
        this.f63625l = bVar;
    }
}
