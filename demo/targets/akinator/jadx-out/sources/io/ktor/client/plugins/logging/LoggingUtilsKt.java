package io.ktor.client.plugins.logging;

import bv.d;
import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.StringsKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LoggingUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0, 0}, l = {TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER}, m = "logResponseBody", n = {"$this$logResponseBody_u24lambda_u244", "charset$iv"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1, reason: invalid class name */
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
            return LoggingUtilsKt.logResponseBody(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0}, l = {50}, m = "tryReadText", n = {"charset"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39151 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39151(zu.d<? super C39151> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoggingUtilsKt.tryReadText(null, null, this);
        }
    }

    public static final void logHeader(Appendable appendable, String key, String value) throws IOException {
        e0.checkNotNullParameter(appendable, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        Appendable appendableAppend = appendable.append("-> " + key + ": " + value);
        e0.checkNotNullExpressionValue(appendableAppend, "append(value)");
        e0.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
    }

    public static final void logHeaders(Appendable appendable, Set<? extends Map.Entry<String, ? extends List<String>>> headers, List<SanitizedHeader> sanitizedHeaders) throws IOException {
        Object next;
        e0.checkNotNullParameter(appendable, "<this>");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : y0.sortedWith(y0.toList(headers), new Comparator() { // from class: io.ktor.client.plugins.logging.LoggingUtilsKt$logHeaders$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return xu.d.compareValues((String) ((Map.Entry) t10).getKey(), (String) ((Map.Entry) t11).getKey());
            }
        })) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator<T> it = sanitizedHeaders.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((Boolean) ((SanitizedHeader) next).getPredicate().invoke(str)).booleanValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SanitizedHeader sanitizedHeader = (SanitizedHeader) next;
            String placeholder = sanitizedHeader != null ? sanitizedHeader.getPlaceholder() : null;
            if (placeholder == null) {
                placeholder = y0.joinToString$default(list, "; ", null, null, 0, null, null, 62, null);
            }
            logHeader(appendable, str, placeholder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object logResponseBody(java.lang.StringBuilder r12, io.ktor.http.ContentType r13, io.ktor.utils.io.ByteReadChannel r14, zu.d<? super tu.x0> r15) {
        /*
            boolean r0 = r15 instanceof io.ktor.client.plugins.logging.LoggingUtilsKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r15
            io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1 r0 = (io.ktor.client.plugins.logging.LoggingUtilsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1 r0 = new io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 0
            r2 = 1
            java.lang.String r8 = "append('\\n')"
            r9 = 10
            java.lang.String r10 = "append(value)"
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3c
            java.lang.Object r12 = r4.L$1
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r13 = r4.L$0
            java.lang.StringBuilder r13 = (java.lang.StringBuilder) r13
            tu.a0.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L3a
            goto L8e
        L3a:
            r12 = r13
            goto L97
        L3c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L44:
            tu.a0.throwOnFailure(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "BODY Content-Type: "
            r15.<init>(r1)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            r12.append(r15)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r10)
            r12.append(r9)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r8)
            java.lang.String r15 = "BODY START"
            r12.append(r15)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r10)
            r12.append(r9)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r8)
            if (r13 == 0) goto L77
            java.nio.charset.Charset r13 = io.ktor.http.ContentTypesKt.charset(r13)
            if (r13 != 0) goto L79
        L77:
            java.nio.charset.Charset r13 = sv.g.f86134b
        L79:
            r4.L$0 = r12     // Catch: java.lang.Throwable -> L97
            r4.L$1 = r13     // Catch: java.lang.Throwable -> L97
            r4.label = r2     // Catch: java.lang.Throwable -> L97
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r14
            java.lang.Object r15 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L97
            if (r15 != r0) goto L8b
            return r0
        L8b:
            r11 = r13
            r13 = r12
            r12 = r11
        L8e:
            io.ktor.utils.io.core.Input r15 = (io.ktor.utils.io.core.Input) r15     // Catch: java.lang.Throwable -> L3a
            r14 = 0
            r0 = 2
            java.lang.String r7 = io.ktor.utils.io.core.StringsKt.readText$default(r15, r12, r14, r0, r7)     // Catch: java.lang.Throwable -> L3a
            goto L98
        L97:
            r13 = r12
        L98:
            if (r7 != 0) goto L9c
            java.lang.String r7 = "[response body omitted]"
        L9c:
            r13.append(r7)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r10)
            r13.append(r9)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r8)
            java.lang.String r12 = "BODY END"
            r13.append(r12)
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.LoggingUtilsKt.logResponseBody(java.lang.StringBuilder, io.ktor.http.ContentType, io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }

    public static final void logResponseHeader(StringBuilder log, HttpResponse response, LogLevel level, List<SanitizedHeader> sanitizedHeaders) throws IOException {
        e0.checkNotNullParameter(log, "log");
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(level, "level");
        e0.checkNotNullParameter(sanitizedHeaders, "sanitizedHeaders");
        if (level.getInfo()) {
            log.append("RESPONSE: " + response.getStatus());
            e0.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            e0.checkNotNullExpressionValue(log, "append('\\n')");
            log.append("METHOD: " + response.getCall().getRequest().getMethod());
            e0.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            e0.checkNotNullExpressionValue(log, "append('\\n')");
            log.append("FROM: " + response.getCall().getRequest().getUrl());
            e0.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            e0.checkNotNullExpressionValue(log, "append('\\n')");
        }
        if (level.getHeaders()) {
            log.append("COMMON HEADERS");
            e0.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            e0.checkNotNullExpressionValue(log, "append('\\n')");
            logHeaders(log, response.getHeaders().entries(), sanitizedHeaders);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object tryReadText(io.ktor.utils.io.ByteReadChannel r8, java.nio.charset.Charset r9, zu.d<? super java.lang.String> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.logging.LoggingUtilsKt.C39151
            if (r0 == 0) goto L14
            r0 = r10
            io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1 r0 = (io.ktor.client.plugins.logging.LoggingUtilsKt.C39151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1 r0 = new io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r8 = r4.L$0
            r9 = r8
            java.nio.charset.Charset r9 = (java.nio.charset.Charset) r9
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L55
            goto L4c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            tu.a0.throwOnFailure(r10)
            r4.L$0 = r9     // Catch: java.lang.Throwable -> L55
            r4.label = r2     // Catch: java.lang.Throwable -> L55
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r10 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L55
            if (r10 != r0) goto L4c
            return r0
        L4c:
            io.ktor.utils.io.core.Input r10 = (io.ktor.utils.io.core.Input) r10     // Catch: java.lang.Throwable -> L55
            r8 = 0
            r0 = 2
            java.lang.String r8 = io.ktor.utils.io.core.StringsKt.readText$default(r10, r9, r8, r0, r7)     // Catch: java.lang.Throwable -> L55
            return r8
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.LoggingUtilsKt.tryReadText(io.ktor.utils.io.ByteReadChannel, java.nio.charset.Charset, zu.d):java.lang.Object");
    }

    private static final Object tryReadText$$forInline(ByteReadChannel byteReadChannel, Charset charset, zu.d<? super String> dVar) {
        try {
            b0.mark(0);
            Object remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel, 0L, dVar, 1, null);
            b0.mark(1);
            return StringsKt.readText$default((Input) remaining$default, charset, 0, 2, (Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
