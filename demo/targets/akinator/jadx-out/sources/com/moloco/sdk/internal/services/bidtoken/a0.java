package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a0 implements z {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.bidtoken.b f46768b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46769c;

    /* renamed from: d, reason: collision with root package name */
    public l f46770d;

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
        public a0 f46771i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46772j;

        /* renamed from: l, reason: collision with root package name */
        public int f46774l;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46772j = obj;
            this.f46774l |= Integer.MIN_VALUE;
            return a0.this.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public a0 f46775i;

        /* renamed from: j, reason: collision with root package name */
        public l f46776j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.internal.bidtoken.a f46777k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46778l;

        /* renamed from: n, reason: collision with root package name */
        public int f46780n;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46778l = obj;
            this.f46780n |= Integer.MIN_VALUE;
            return a0.this.a(null, this);
        }
    }

    static {
        new a(null);
    }

    public a0(com.moloco.sdk.internal.bidtoken.b bidTokenParser, com.moloco.sdk.internal.services.i timeProviderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenParser, "bidTokenParser");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f46768b = bidTokenParser;
        this.f46769c = timeProviderService;
        this.f46770d = new l("", "", f.a());
    }

    public final void a(l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f46770d = lVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.z
    public void b() {
        this.f46770d = new l("", "", f.a());
    }

    public final l c() {
        return this.f46770d;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.z
    public l a() {
        return this.f46770d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zu.d<? super com.moloco.sdk.internal.services.bidtoken.b> r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.a0.a(zu.d):java.lang.Object");
    }

    public static /* synthetic */ void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.internal.services.bidtoken.l r9, zu.d<? super tu.x0> r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.a0.a(com.moloco.sdk.internal.services.bidtoken.l, zu.d):java.lang.Object");
    }

    public final void a(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }
}
