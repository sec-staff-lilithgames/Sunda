package io.ktor.serialization;

import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import rw.hIT.uQjDr;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ContentConverterKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "deserialize", n = {"body", "typeInfo"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentConverterKt.deserialize(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.util.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deserialize(java.util.List<? extends io.ktor.serialization.ContentConverter> r5, final io.ktor.utils.io.ByteReadChannel r6, final io.ktor.util.reflect.TypeInfo r7, final java.nio.charset.Charset r8, zu.d<java.lang.Object> r9) throws io.ktor.serialization.ContentConvertException {
        /*
            boolean r0 = r9 instanceof io.ktor.serialization.ContentConverterKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.serialization.ContentConverterKt$deserialize$1 r0 = (io.ktor.serialization.ContentConverterKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.serialization.ContentConverterKt$deserialize$1 r0 = new io.ktor.serialization.ContentConverterKt$deserialize$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r5 = r0.L$1
            r7 = r5
            io.ktor.util.reflect.TypeInfo r7 = (io.ktor.util.reflect.TypeInfo) r7
            java.lang.Object r5 = r0.L$0
            r6 = r5
            io.ktor.utils.io.ByteReadChannel r6 = (io.ktor.utils.io.ByteReadChannel) r6
            tu.a0.throwOnFailure(r9)
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            tu.a0.throwOnFailure(r9)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.asFlow(r5)
            io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1 r9 = new io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1
            r9.<init>()
            io.ktor.serialization.ContentConverterKt$deserialize$result$2 r5 = new io.ktor.serialization.ContentConverterKt$deserialize$result$2
            r5.<init>(r6, r3)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r5, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            if (r9 != 0) goto L89
            boolean r5 = r6.isClosedForRead()
            if (r5 != 0) goto L65
            return r6
        L65:
            kotlin.reflect.KType r5 = r7.getKotlinType()
            if (r5 == 0) goto L74
            boolean r5 = r5.isMarkedNullable()
            if (r5 != r4) goto L74
            io.ktor.http.content.NullBody r5 = io.ktor.http.content.NullBody.INSTANCE
            return r5
        L74:
            io.ktor.serialization.ContentConvertException r5 = new io.ktor.serialization.ContentConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "No suitable converter found for "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            throw r5
        L89:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.ContentConverterKt.deserialize(java.util.List, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, java.nio.charset.Charset, zu.d):java.lang.Object");
    }

    public static final Charset suitableCharset(Headers headers, Charset defaultCharset) {
        e0.checkNotNullParameter(headers, "<this>");
        e0.checkNotNullParameter(defaultCharset, "defaultCharset");
        Charset charsetSuitableCharsetOrNull = suitableCharsetOrNull(headers, defaultCharset);
        return charsetSuitableCharsetOrNull == null ? defaultCharset : charsetSuitableCharsetOrNull;
    }

    public static /* synthetic */ Charset suitableCharset$default(Headers headers, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        return suitableCharset(headers, charset);
    }

    public static /* synthetic */ Charset suitableCharsetOrNull$default(Headers headers, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        return suitableCharsetOrNull(headers, charset);
    }

    public static final Charset suitableCharsetOrNull(Headers headers, Charset defaultCharset) {
        e0.checkNotNullParameter(headers, "<this>");
        e0.checkNotNullParameter(defaultCharset, "defaultCharset");
        Iterator<HeaderValue> it = HttpHeaderValueParserKt.parseAndSortHeader(headers.get(HttpHeaders.INSTANCE.getAcceptCharset())).iterator();
        while (it.hasNext()) {
            String strComponent1 = it.next().component1();
            if (e0.areEqual(strComponent1, uQjDr.QcejJalYKzSbzH)) {
                return defaultCharset;
            }
            if (Charset.isSupported(strComponent1)) {
                return Charset.forName(strComponent1);
            }
        }
        return null;
    }
}
