package io.odeeo.sdk;

import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnit$provideHandlePageLoadFun$1 extends f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zu.d<x0> f67905b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AdUnit$provideHandlePageLoadFun$1$1", f = "AdUnit.kt", i = {}, l = {597}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.odeeo.sdk.AdUnit$provideHandlePageLoadFun$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67906a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zu.d<x0> f67907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(zu.d<? super x0> dVar, zu.d<? super AnonymousClass1> dVar2) {
            super(2, dVar2);
            this.f67907b = dVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass1(this.f67907b, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(1:(1:5)(2:6|7))(3:8|(2:10|(1:12))|17)|18|13|17) */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            io.odeeo.internal.b2.a.w(r6);
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.f67906a
                tu.x0 r2 = tu.x0.f87415a
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 != r3) goto L11
                tu.a0.throwOnFailure(r6)
                goto L33
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                tu.a0.throwOnFailure(r6)
                zu.d<tu.x0> r6 = r5.f67907b
                zu.m r6 = r6.getContext()
                boolean r6 = kotlinx.coroutines.JobKt.isActive(r6)
                if (r6 == 0) goto L43
                r5.f67906a = r3
                r3 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L33
                return r0
            L33:
                zu.d<tu.x0> r6 = r5.f67907b     // Catch: java.lang.Exception -> L3f
                int r0 = tu.z.f87419c     // Catch: java.lang.Exception -> L3f
                java.lang.Object r0 = tu.z.m7131constructorimpl(r2)     // Catch: java.lang.Exception -> L3f
                r6.resumeWith(r0)     // Catch: java.lang.Exception -> L3f
                goto L43
            L3f:
                r6 = move-exception
                io.odeeo.internal.b2.a.w(r6)
            L43:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.AdUnit$provideHandlePageLoadFun$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdUnit$provideHandlePageLoadFun$1(AdUnit adUnit, zu.d<? super x0> dVar) {
        super(0);
        this.f67904a = adUnit;
        this.f67905b = dVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m4620invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4620invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f67904a.getAdUnitScope$odeeoSdk_release(), null, null, new AnonymousClass1(this.f67905b, null), 3, null);
    }
}
