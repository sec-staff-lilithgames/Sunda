package io.ktor.client.statement;

import bv.d;
import bv.f;
import io.ktor.client.request.HttpRequest;
import io.ktor.util.InternalAPI;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import sv.g;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpResponseKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {97}, m = "bodyAsChannel", n = {}, s = {})
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsChannel(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0}, l = {97}, m = "bodyAsText", n = {"decoder"}, s = {"L$0"})
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsText$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39791 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39791(zu.d<? super C39791> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsText(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bodyAsChannel(io.ktor.client.statement.HttpResponse r5, zu.d<? super io.ktor.utils.io.ByteReadChannel> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpResponseKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 r0 = (io.ktor.client.statement.HttpResponseKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r6)
            io.ktor.client.call.HttpClientCall r5 = r5.getCall()
            java.lang.Class<io.ktor.utils.io.ByteReadChannel> r6 = io.ktor.utils.io.ByteReadChannel.class
            kotlin.reflect.KType r2 = kotlin.jvm.internal.c1.typeOf(r6)
            java.lang.reflect.Type r4 = kotlin.reflect.TypesJVMKt.getJavaType(r2)
            kotlin.reflect.KClass r6 = kotlin.jvm.internal.c1.getOrCreateKotlinClass(r6)
            io.ktor.util.reflect.TypeInfo r6 = io.ktor.util.reflect.TypeInfoJvmKt.typeInfoImpl(r4, r6, r2)
            r0.label = r3
            java.lang.Object r6 = r5.bodyNullable(r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            if (r6 == 0) goto L58
            io.ktor.utils.io.ByteReadChannel r6 = (io.ktor.utils.io.ByteReadChannel) r6
            return r6
        L58:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.bodyAsChannel(io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bodyAsText(io.ktor.client.statement.HttpResponse r5, java.nio.charset.Charset r6, zu.d<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.client.statement.HttpResponseKt.C39791
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = (io.ktor.client.statement.HttpResponseKt.C39791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5
            tu.a0.throwOnFailure(r7)
            goto L66
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r7)
            java.nio.charset.Charset r7 = io.ktor.http.HttpMessagePropertiesKt.charset(r5)
            if (r7 != 0) goto L3f
            goto L40
        L3f:
            r6 = r7
        L40:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            io.ktor.client.call.HttpClientCall r5 = r5.getCall()
            java.lang.Class<io.ktor.utils.io.core.ByteReadPacket> r7 = io.ktor.utils.io.core.ByteReadPacket.class
            kotlin.reflect.KType r2 = kotlin.jvm.internal.c1.typeOf(r7)
            java.lang.reflect.Type r4 = kotlin.reflect.TypesJVMKt.getJavaType(r2)
            kotlin.reflect.KClass r7 = kotlin.jvm.internal.c1.getOrCreateKotlinClass(r7)
            io.ktor.util.reflect.TypeInfo r7 = io.ktor.util.reflect.TypeInfoJvmKt.typeInfoImpl(r4, r7, r2)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.bodyNullable(r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r5 = r6
        L66:
            if (r7 == 0) goto L77
            io.ktor.utils.io.core.ByteReadPacket r7 = (io.ktor.utils.io.core.ByteReadPacket) r7
            java.lang.String r6 = "decoder"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
            r6 = 2
            r0 = 0
            r1 = 0
            java.lang.String r5 = io.ktor.utils.io.charsets.EncodingKt.decode$default(r5, r7, r1, r6, r0)
            return r5
        L77:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.bodyAsText(io.ktor.client.statement.HttpResponse, java.nio.charset.Charset, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        return bodyAsText(httpResponse, charset, dVar);
    }

    @InternalAPI
    public static final void complete(HttpResponse httpResponse) {
        e0.checkNotNullParameter(httpResponse, "<this>");
        k kVar = httpResponse.getCoroutineContext().get(Job.Key);
        e0.checkNotNull(kVar);
        ((CompletableJob) kVar).complete();
    }

    public static final HttpRequest getRequest(HttpResponse httpResponse) {
        e0.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }
}
