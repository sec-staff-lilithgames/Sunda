package com.moloco.sdk.acm.eventprocessing;

import kotlin.jvm.internal.e0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.http.f f45578a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.e f45579b;

    /* renamed from: c, reason: collision with root package name */
    public final g f45580c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.l f45581d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public k f45582i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f45583j;

        /* renamed from: l, reason: collision with root package name */
        public int f45585l;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45583j = obj;
            this.f45585l |= Integer.MIN_VALUE;
            Object objA = k.this.a(this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : z.m7130boximpl(objA);
        }
    }

    public k(com.moloco.sdk.acm.http.f metricsRequest, com.moloco.sdk.acm.db.e metricsDAO, g dataAgeChecker, kv.l headers) {
        e0.checkNotNullParameter(metricsRequest, "metricsRequest");
        e0.checkNotNullParameter(metricsDAO, "metricsDAO");
        e0.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        e0.checkNotNullParameter(headers, "headers");
        this.f45578a = metricsRequest;
        this.f45579b = metricsDAO;
        this.f45580c = dataAgeChecker;
        this.f45581d = headers;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zu.d<? super tu.z> r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.k.a(zu.d):java.lang.Object");
    }
}
