package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h f47624a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.c f47625b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public c0 f47626i;

        /* renamed from: j, reason: collision with root package name */
        public a0 f47627j;

        /* renamed from: k, reason: collision with root package name */
        public String f47628k;

        /* renamed from: l, reason: collision with root package name */
        public String f47629l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f47630m;

        /* renamed from: o, reason: collision with root package name */
        public int f47632o;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47630m = obj;
            this.f47632o |= Integer.MIN_VALUE;
            return c0.this.a(null, null, this);
        }
    }

    public c0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h mediaCacheRepository, com.moloco.sdk.internal.error.c errorReportingService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.f47624a = mediaCacheRepository;
        this.f47625b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0 r19, java.lang.String r20, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0.a
            if (r4 == 0) goto L1b
            r4 = r3
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0$a r4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0.a) r4
            int r5 = r4.f47632o
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f47632o = r5
            goto L20
        L1b:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0$a r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0$a
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.f47630m
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            int r6 = r4.f47632o
            java.lang.String r7 = "UNKNOWN_MTID"
            r8 = 1
            if (r6 == 0) goto L44
            if (r6 != r8) goto L3c
            java.lang.String r1 = r4.f47629l
            java.lang.String r2 = r4.f47628k
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0 r5 = r4.f47627j
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 r4 = r4.f47626i
            tu.a0.throwOnFailure(r3)
            r8 = r5
            goto L7c
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L44:
            tu.a0.throwOnFailure(r3)
            java.lang.String r3 = r1.h()
            if (r3 != 0) goto L65
            com.moloco.sdk.internal.error.a r3 = new com.moloco.sdk.internal.error.a
            if (r2 == 0) goto L55
            r3.<init>(r2)
            goto L58
        L55:
            r3.<init>(r7)
        L58:
            com.moloco.sdk.internal.error.c r2 = r0.f47625b
            java.lang.String r4 = "DEC_LOADED_WITH_NO_APP_ICON"
            r2.a(r4, r3)
            java.lang.String r2 = "can't precache DEC: appIconUri is null"
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0.a(r2)
            return r1
        L65:
            r4.f47626i = r0
            r4.f47627j = r1
            r4.f47628k = r2
            r4.f47629l = r3
            r4.f47632o = r8
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h r6 = r0.f47624a
            java.lang.Object r4 = r6.a(r3, r4)
            if (r4 != r5) goto L78
            return r5
        L78:
            r8 = r1
            r1 = r3
            r3 = r4
            r4 = r0
        L7c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) r3
            boolean r5 = r3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g.b
            if (r5 == 0) goto L9b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g$b r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g.b) r3
            java.io.File r1 = r3.a()
            java.lang.String r9 = r1.getAbsolutePath()
            r16 = 126(0x7e, float:1.77E-43)
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0 r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lc7
        L9b:
            com.moloco.sdk.internal.error.c r4 = r4.f47625b
            com.moloco.sdk.internal.error.a r5 = new com.moloco.sdk.internal.error.a
            if (r2 == 0) goto La5
            r5.<init>(r2)
            goto La8
        La5:
            r5.<init>(r7)
        La8:
            java.lang.String r2 = "DEC_FAILED_TO_LOAD"
            r4.a(r2, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "dec loading error: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ": `Not found` for "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0.a(r1)
            r1 = 0
        Lc7:
            if (r1 != 0) goto Lca
            return r8
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0, java.lang.String, zu.d):java.lang.Object");
    }
}
