package io.odeeo.internal.o1;

import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.odeeo.internal.j1.k;
import io.odeeo.internal.y1.r;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.l;
import kv.p;
import p0.o2;
import tu.a0;
import tu.x0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.j1.h f65177a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<CoroutineScope> f65178b;

    /* renamed from: c, reason: collision with root package name */
    public io.odeeo.internal.x1.a<k> f65179c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager$sendExternalTrackingEvents$1$1", f = "EventTrackingManager.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f65180a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65181b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f65183d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager$sendExternalTrackingEvents$1$1$1", f = "EventTrackingManager.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.odeeo.internal.o1.e$a$a, reason: collision with other inner class name */
        public static final class C0632a extends n implements l {

            /* renamed from: a, reason: collision with root package name */
            public int f65184a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f65185b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f65186c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0632a(e eVar, String str, zu.d<? super C0632a> dVar) {
                super(1, dVar);
                this.f65185b = eVar;
                this.f65186c = str;
            }

            @Override // bv.a
            public final zu.d<x0> create(zu.d<?> dVar) {
                return new C0632a(this.f65185b, this.f65186c, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f65184a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return obj;
                }
                a0.throwOnFailure(obj);
                io.odeeo.internal.j1.h hVar = this.f65185b.f65177a;
                String str = this.f65186c;
                this.f65184a = 1;
                Object objTrackExternalEvent = hVar.trackExternalEvent(str, this);
                return objTrackExternalEvent == coroutine_suspended ? coroutine_suspended : objTrackExternalEvent;
            }

            @Override // kv.l
            public final Object invoke(zu.d<? super r<w0>> dVar) {
                return ((C0632a) create(dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f65183d = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = e.this.new a(this.f65183d, dVar);
            aVar.f65181b = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f65180a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f65181b;
                k retryManager = e.this.getRetryManagerProvider().get();
                e eVar = e.this;
                e0.checkNotNullExpressionValue(retryManager, "retryManager");
                C0632a c0632a = new C0632a(e.this, this.f65183d, null);
                this.f65180a = 1;
                if (eVar.a(retryManager, "ExternalTrackingEvent", coroutineScope, c0632a, this) == coroutine_suspended) {
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
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager$sendInternalTrackingEvent$1", f = "EventTrackingManager.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f65187a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65188b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f65190d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.o1.b f65191e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager$sendInternalTrackingEvent$1$1", f = "EventTrackingManager.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends n implements l {

            /* renamed from: a, reason: collision with root package name */
            public int f65192a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f65193b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ io.odeeo.internal.o1.b f65194c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, io.odeeo.internal.o1.b bVar, zu.d<? super a> dVar) {
                super(1, dVar);
                this.f65193b = eVar;
                this.f65194c = bVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(zu.d<?> dVar) {
                return new a(this.f65193b, this.f65194c, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f65192a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return obj;
                }
                a0.throwOnFailure(obj);
                io.odeeo.internal.j1.h hVar = this.f65193b.f65177a;
                String url = this.f65194c.getUrl();
                io.odeeo.internal.o1.c parameters = this.f65194c.getParameters();
                this.f65192a = 1;
                Object objTrackInternalEvent = hVar.trackInternalEvent(url, parameters, this);
                return objTrackInternalEvent == coroutine_suspended ? coroutine_suspended : objTrackInternalEvent;
            }

            @Override // kv.l
            public final Object invoke(zu.d<? super r<w0>> dVar) {
                return ((a) create(dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, io.odeeo.internal.o1.b bVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f65190d = kVar;
            this.f65191e = bVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = e.this.new b(this.f65190d, this.f65191e, dVar);
            bVar.f65188b = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f65187a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f65188b;
                e eVar = e.this;
                k kVar = this.f65190d;
                a aVar = new a(eVar, this.f65191e, null);
                this.f65187a = 1;
                if (eVar.a(kVar, "InternalTrackingEvent", coroutineScope, aVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager$sendSessionEvent$1", f = "EventTrackingManager.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f65195a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65196b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f65198d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f65199e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f65200f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager$sendSessionEvent$1$1", f = "EventTrackingManager.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends n implements l {

            /* renamed from: a, reason: collision with root package name */
            public int f65201a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f65202b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f65203c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f65204d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, String str, h hVar, zu.d<? super a> dVar) {
                super(1, dVar);
                this.f65202b = eVar;
                this.f65203c = str;
                this.f65204d = hVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(zu.d<?> dVar) {
                return new a(this.f65202b, this.f65203c, this.f65204d, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f65201a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return obj;
                }
                a0.throwOnFailure(obj);
                io.odeeo.internal.j1.h hVar = this.f65202b.f65177a;
                String str = this.f65203c;
                h hVar2 = this.f65204d;
                this.f65201a = 1;
                Object objTrackSessionEvent = hVar.trackSessionEvent(str, hVar2, this);
                return objTrackSessionEvent == coroutine_suspended ? coroutine_suspended : objTrackSessionEvent;
            }

            @Override // kv.l
            public final Object invoke(zu.d<? super r<w0>> dVar) {
                return ((a) create(dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, String str, h hVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f65198d = kVar;
            this.f65199e = str;
            this.f65200f = hVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = e.this.new c(this.f65198d, this.f65199e, this.f65200f, dVar);
            cVar.f65196b = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f65195a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f65196b;
                e eVar = e.this;
                k kVar = this.f65198d;
                a aVar = new a(eVar, this.f65199e, this.f65200f, null);
                this.f65195a = 1;
                if (eVar.a(kVar, "SessionEvent", coroutineScope, aVar, this) == coroutine_suspended) {
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
    @bv.f(c = "io.odeeo.sdk.tracking.EventTrackingManager", f = "EventTrackingManager.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {78, 81}, m = "trackEvent", n = {"retryManager", "eventDescription", "scope", "trackingCall", "retryManager", "eventDescription", "scope", "trackingCall", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class d extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f65205a;

        /* renamed from: b, reason: collision with root package name */
        public Object f65206b;

        /* renamed from: c, reason: collision with root package name */
        public Object f65207c;

        /* renamed from: d, reason: collision with root package name */
        public Object f65208d;

        /* renamed from: e, reason: collision with root package name */
        public Object f65209e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f65210f;

        /* renamed from: h, reason: collision with root package name */
        public int f65212h;

        public d(zu.d<? super d> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f65210f = obj;
            this.f65212h |= Integer.MIN_VALUE;
            return e.this.a(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.o1.e$e, reason: collision with other inner class name */
    public static final class C0633e extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65213a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f65214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0633e(String str, CoroutineScope coroutineScope) {
            super(0);
            this.f65213a = str;
            this.f65214b = coroutineScope;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4592invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4592invoke() {
            io.odeeo.internal.b2.a.w(o2.q(new StringBuilder("Max retries exceeded for "), this.f65213a, '.'), new Object[0]);
            CoroutineScopeKt.cancel$default(this.f65214b, null, 1, null);
        }
    }

    public e(io.odeeo.internal.j1.h sdkApi, io.odeeo.internal.x1.a<CoroutineScope> scopeProvider) {
        e0.checkNotNullParameter(sdkApi, "sdkApi");
        e0.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f65177a = sdkApi;
        this.f65178b = scopeProvider;
    }

    public static /* synthetic */ Job sendInternalTrackingEvent$default(e eVar, io.odeeo.internal.o1.b bVar, k kVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            k kVar2 = eVar.getRetryManagerProvider().get();
            e0.checkNotNullExpressionValue(kVar2, "fun sendInternalTracking…        }\n        )\n    }");
            kVar = kVar2;
        }
        return eVar.sendInternalTrackingEvent(bVar, kVar);
    }

    public static /* synthetic */ Job sendSessionEvent$default(e eVar, String str, h hVar, k kVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            k kVar2 = eVar.getRetryManagerProvider().get();
            e0.checkNotNullExpressionValue(kVar2, "fun sendSessionEvent(\n  …nEvent) }\n        )\n    }");
            kVar = kVar2;
        }
        return eVar.sendSessionEvent(str, hVar, kVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:12|36|(2:40|41)|42|21|(8:24|25|30|(2:32|(1:35))(0)|36|(1:38)|40|41)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r8 = r13;
        r13 = r10;
        r10 = r8;
        r8 = r12;
        r12 = r11;
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        r8 = r13;
        r13 = r10;
        r10 = r8;
        r8 = r12;
        r12 = r11;
        r11 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.odeeo.internal.j1.k r10, java.lang.String r11, kotlinx.coroutines.CoroutineScope r12, kv.l r13, zu.d<? super tu.x0> r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.o1.e.a(io.odeeo.internal.j1.k, java.lang.String, kotlinx.coroutines.CoroutineScope, kv.l, zu.d):java.lang.Object");
    }

    public final io.odeeo.internal.x1.a<k> getRetryManagerProvider() {
        io.odeeo.internal.x1.a<k> aVar = this.f65179c;
        if (aVar != null) {
            return aVar;
        }
        e0.throwUninitializedPropertyAccessException("retryManagerProvider");
        return null;
    }

    public final void sendExternalTrackingEvents(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            CoroutineScope coroutineScope = this.f65178b.get();
            e0.checkNotNullExpressionValue(coroutineScope, "scopeProvider.get()");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(str, null), 3, null);
        }
    }

    public final Job sendInternalTrackingEvent(io.odeeo.internal.o1.b customEventRequest, k retryManager) {
        e0.checkNotNullParameter(customEventRequest, "customEventRequest");
        e0.checkNotNullParameter(retryManager, "retryManager");
        CoroutineScope coroutineScope = this.f65178b.get();
        e0.checkNotNullExpressionValue(coroutineScope, "scopeProvider.get()");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(retryManager, customEventRequest, null), 3, null);
    }

    public final Job sendSessionEvent(String str, h sessionEvent, k retryManager) {
        e0.checkNotNullParameter(sessionEvent, "sessionEvent");
        e0.checkNotNullParameter(retryManager, "retryManager");
        CoroutineScope coroutineScope = this.f65178b.get();
        e0.checkNotNullExpressionValue(coroutineScope, "scopeProvider.get()");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(retryManager, str, sessionEvent, null), 3, null);
    }

    public final void setRetryManagerProvider(io.odeeo.internal.x1.a<k> aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f65179c = aVar;
    }
}
