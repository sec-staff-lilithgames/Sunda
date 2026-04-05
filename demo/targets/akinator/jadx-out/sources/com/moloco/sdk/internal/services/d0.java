package com.moloco.sdk.internal.services;

import kotlinx.coroutines.flow.MutableSharedFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f46986a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46987b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public d0 f46988i;

        /* renamed from: j, reason: collision with root package name */
        public MutableSharedFlow f46989j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f46990k;

        /* renamed from: m, reason: collision with root package name */
        public int f46992m;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46990k = obj;
            this.f46992m |= Integer.MIN_VALUE;
            return d0.this.a(null, null, null, null, this);
        }
    }

    static {
        new a(null);
    }

    public d0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        this.f46986a = externalLinkHandler;
        this.f46987b = customUserEventBuilderService;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.moloco.sdk.internal.services.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r19, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a r20, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p r21, kotlinx.coroutines.flow.MutableSharedFlow<tu.x0> r22, zu.d<? super tu.x0> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r23
            boolean r2 = r1 instanceof com.moloco.sdk.internal.services.d0.b
            if (r2 == 0) goto L18
            r2 = r1
            com.moloco.sdk.internal.services.d0$b r2 = (com.moloco.sdk.internal.services.d0.b) r2
            int r3 = r2.f46992m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f46992m = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            com.moloco.sdk.internal.services.d0$b r2 = new com.moloco.sdk.internal.services.d0$b
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f46990k
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r8.f46992m
            r9 = 2
            r4 = 1
            tu.x0 r10 = tu.x0.f87415a
            if (r3 == 0) goto L49
            if (r3 == r4) goto L3c
            if (r3 != r9) goto L34
            tu.a0.throwOnFailure(r1)
            return r10
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            kotlinx.coroutines.flow.MutableSharedFlow r3 = r8.f46989j
            com.moloco.sdk.internal.services.d0 r4 = r8.f46988i
            tu.a0.throwOnFailure(r1)
            r17 = r3
            r3 = r1
            r1 = r17
            goto Lb0
        L49:
            tu.a0.throwOnFailure(r1)
            long r5 = java.lang.System.currentTimeMillis()
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$f r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$f
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c r3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f48771a
            int r7 = r20.g()
            float r7 = r3.a(r7)
            int r11 = r20.h()
            float r11 = r3.a(r11)
            r1.<init>(r7, r11)
            r11 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$d r6 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$d
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$f r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$f
            int r7 = r20.i()
            float r7 = r3.a(r7)
            int r13 = r20.j()
            float r13 = r3.a(r13)
            r5.<init>(r7, r13)
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$g r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$g
            int r13 = r20.l()
            float r13 = r3.a(r13)
            int r14 = r20.k()
            float r3 = r3.a(r14)
            r7.<init>(r13, r3)
            java.util.List r3 = r21.q()
            r6.<init>(r1, r5, r7, r3)
            r8.f46988i = r0
            r1 = r22
            r8.f46989j = r1
            r8.f46992m = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b r3 = r0.f46987b
            r7 = r19
            r4 = r11
            java.lang.Object r3 = r3.a(r4, r6, r7, r8)
            if (r3 != r2) goto Laf
            goto Lde
        Laf:
            r4 = r0
        Lb0:
            java.lang.String r3 = (java.lang.String) r3
            com.moloco.sdk.internal.MolocoLogger r11 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r5 = "Launching url: "
            java.lang.String r13 = a.b.k(r5, r3)
            r15 = 4
            r16 = 0
            java.lang.String r12 = "ClickthroughService"
            r14 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r11, r12, r13, r14, r15, r16)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 r4 = r4.f46986a
            if (r3 != 0) goto Lc9
            java.lang.String r3 = ""
        Lc9:
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto Ldf
            if (r1 == 0) goto Ldf
            r3 = 0
            r8.f46988i = r3
            r8.f46989j = r3
            r8.f46992m = r9
            java.lang.Object r1 = r1.emit(r10, r8)
            if (r1 != r2) goto Ldf
        Lde:
            return r2
        Ldf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.d0.a(java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p, kotlinx.coroutines.flow.MutableSharedFlow, zu.d):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.c0
    public Object a(String str, MutableSharedFlow<x0> mutableSharedFlow, zu.d<? super x0> dVar) {
        Object objEmit;
        if (str == null) {
            str = "";
        }
        boolean zA = this.f46986a.a(str);
        x0 x0Var = x0.f87415a;
        return (zA && mutableSharedFlow != null && (objEmit = mutableSharedFlow.emit(x0Var, dVar)) == av.e.getCOROUTINE_SUSPENDED()) ? objEmit : x0Var;
    }
}
