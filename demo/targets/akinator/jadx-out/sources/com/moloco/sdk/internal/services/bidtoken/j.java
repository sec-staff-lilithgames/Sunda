package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.publisher.j0;
import com.moloco.sdk.publisher.MolocoBidTokenListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f46844a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f46845b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46846c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public j f46847i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f46848j;

        /* renamed from: k, reason: collision with root package name */
        public MolocoBidTokenListener f46849k;

        /* renamed from: l, reason: collision with root package name */
        public long f46850l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f46851m;

        /* renamed from: o, reason: collision with root package name */
        public int f46853o;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46851m = obj;
            this.f46853o |= Integer.MIN_VALUE;
            return j.this.a(null, null, this);
        }
    }

    public j(m bidTokenService, j0 initializationHandler, com.moloco.sdk.internal.services.i timeProviderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenService, "bidTokenService");
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationHandler, "initializationHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f46844a = bidTokenService;
        this.f46845b = initializationHandler;
        this.f46846c = timeProviderService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.moloco.sdk.internal.services.bidtoken.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.c r19, com.moloco.sdk.publisher.MolocoBidTokenListener r20, zu.d<? super tu.x0> r21) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.j.a(com.moloco.sdk.acm.recorder.c, com.moloco.sdk.publisher.MolocoBidTokenListener, zu.d):java.lang.Object");
    }
}
