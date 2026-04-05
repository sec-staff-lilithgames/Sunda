package io.ktor.client.plugins.cache;

import bv.d;
import bv.f;
import com.ironsource.C3191e4;
import com.ironsource.Me;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import sv.j0;
import sv.k0;
import sv.n0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCacheEntryKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", i = {0, 0}, l = {18}, m = "HttpCacheEntry", n = {Me.f34938n, "isShared"}, s = {"L$0", "Z$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheEntryKt.HttpCacheEntry(false, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheEntryKt$cacheExpires$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39001 extends f0 implements a {
        public static final C39001 INSTANCE = new C39001();

        public C39001() {
            super(0);
        }

        @Override // kv.a
        public final GMTDate invoke() {
            return DateJvmKt.GMTDate$default(null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object HttpCacheEntry(boolean r8, io.ktor.client.statement.HttpResponse r9, zu.d<? super io.ktor.client.plugins.cache.HttpCacheEntry> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.HttpCacheEntryKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r10
            io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 r0 = (io.ktor.client.plugins.cache.HttpCacheEntryKt.AnonymousClass1) r0
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
            io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 r0 = new io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L39
            if (r1 != r7) goto L31
            boolean r8 = r4.Z$0
            java.lang.Object r9 = r4.L$0
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            tu.a0.throwOnFailure(r10)
            goto L51
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            tu.a0.throwOnFailure(r10)
            io.ktor.utils.io.ByteReadChannel r1 = r9.getContent()
            r4.L$0 = r9
            r4.Z$0 = r8
            r4.label = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r10 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r1, r2, r4, r5, r6)
            if (r10 != r0) goto L51
            return r0
        L51:
            io.ktor.utils.io.core.ByteReadPacket r10 = (io.ktor.utils.io.core.ByteReadPacket) r10
            r0 = 0
            r1 = 0
            byte[] r10 = io.ktor.utils.io.core.StringsKt.readBytes$default(r10, r0, r7, r1)
            io.ktor.client.statement.HttpResponseKt.complete(r9)
            io.ktor.client.plugins.cache.HttpCacheEntry r0 = new io.ktor.client.plugins.cache.HttpCacheEntry
            r2 = 2
            io.ktor.util.date.GMTDate r8 = cacheExpires$default(r9, r8, r1, r2, r1)
            java.util.Map r1 = varyKeys(r9)
            r0.<init>(r8, r1, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(boolean, io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final io.ktor.util.date.GMTDate cacheExpires(io.ktor.client.statement.HttpResponse r10, boolean r11, kv.a r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "fallback"
            kotlin.jvm.internal.e0.checkNotNullParameter(r12, r0)
            java.util.List r0 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(r10)
            r1 = 2
            r2 = 0
            r3 = 0
            if (r11 == 0) goto L41
            r11 = r0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r4 = r11 instanceof java.util.Collection
            if (r4 == 0) goto L24
            r4 = r11
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L24
            goto L41
        L24:
            java.util.Iterator r11 = r11.iterator()
        L28:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r11.next()
            io.ktor.http.HeaderValue r4 = (io.ktor.http.HeaderValue) r4
            java.lang.String r4 = r4.getValue()
            java.lang.String r5 = "s-maxage"
            boolean r4 = sv.k0.startsWith$default(r4, r5, r2, r1, r3)
            if (r4 == 0) goto L28
            goto L43
        L41:
            java.lang.String r5 = "max-age"
        L43:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r11 = r0.iterator()
        L49:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r11.next()
            r4 = r0
            io.ktor.http.HeaderValue r4 = (io.ktor.http.HeaderValue) r4
            java.lang.String r4 = r4.getValue()
            boolean r4 = sv.k0.startsWith$default(r4, r5, r2, r1, r3)
            if (r4 == 0) goto L49
            goto L62
        L61:
            r0 = r3
        L62:
            io.ktor.http.HeaderValue r0 = (io.ktor.http.HeaderValue) r0
            if (r0 == 0) goto L89
            java.lang.String r4 = r0.getValue()
            if (r4 == 0) goto L89
            java.lang.String r11 = "="
            java.lang.String[] r5 = new java.lang.String[]{r11}
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            java.util.List r11 = sv.n0.split$default(r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L89
            r0 = 1
            java.lang.Object r11 = r11.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L89
            java.lang.Long r3 = sv.j0.toLongOrNull(r11)
        L89:
            if (r3 == 0) goto L9b
            io.ktor.util.date.GMTDate r10 = r10.getRequestTime()
            long r11 = r3.longValue()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            io.ktor.util.date.GMTDate r10 = io.ktor.util.date.DateKt.plus(r10, r11)
            return r10
        L9b:
            io.ktor.http.Headers r10 = r10.getHeaders()
            io.ktor.http.HttpHeaders r11 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r11 = r11.getExpires()
            java.lang.String r10 = r10.get(r11)
            if (r10 == 0) goto Lcd
            java.lang.String r11 = "0"
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r10, r11)
            if (r11 != 0) goto Lc6
            boolean r11 = sv.n0.isBlank(r10)
            if (r11 == 0) goto Lba
            goto Lc6
        Lba:
            io.ktor.util.date.GMTDate r10 = io.ktor.http.DateUtilsKt.fromHttpToGmtDate(r10)     // Catch: java.lang.Throwable -> Lbf
            return r10
        Lbf:
            java.lang.Object r10 = r12.invoke()
            io.ktor.util.date.GMTDate r10 = (io.ktor.util.date.GMTDate) r10
            return r10
        Lc6:
            java.lang.Object r10 = r12.invoke()
            io.ktor.util.date.GMTDate r10 = (io.ktor.util.date.GMTDate) r10
            return r10
        Lcd:
            java.lang.Object r10 = r12.invoke()
            io.ktor.util.date.GMTDate r10 = (io.ktor.util.date.GMTDate) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires(io.ktor.client.statement.HttpResponse, boolean, kv.a):io.ktor.util.date.GMTDate");
    }

    public static /* synthetic */ GMTDate cacheExpires$default(HttpResponse httpResponse, boolean z10, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C39001.INSTANCE;
        }
        return cacheExpires(httpResponse, z10, aVar);
    }

    public static final ValidateStatus shouldValidate(GMTDate cacheExpires, Headers responseHeaders, HttpRequestBuilder request) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String value;
        Integer intOrNull;
        String value2;
        List listSplit$default;
        String str;
        e0.checkNotNullParameter(cacheExpires, "cacheExpires");
        e0.checkNotNullParameter(responseHeaders, "responseHeaders");
        e0.checkNotNullParameter(request, "request");
        HeadersBuilder headers = request.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        List<String> all = responseHeaders.getAll(httpHeaders.getCacheControl());
        Object obj = null;
        List<HeaderValue> headerValue = HttpHeaderValueParserKt.parseHeaderValue(all != null ? y0.joinToString$default(all, ",", null, null, 0, null, null, 62, null) : null);
        List<String> all2 = headers.getAll(httpHeaders.getCacheControl());
        List<HeaderValue> headerValue2 = HttpHeaderValueParserKt.parseHeaderValue(all2 != null ? y0.joinToString$default(all2, ",", null, null, 0, null, null, 62, null) : null);
        if (headerValue2.contains(CacheControl.INSTANCE.getNO_CACHE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().trace("\"no-cache\" is set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        List<HeaderValue> list = headerValue2;
        Iterator<T> it = list.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (k0.startsWith$default(((HeaderValue) next).getValue(), "max-age=", false, 2, null)) {
                break;
            }
        }
        HeaderValue headerValue3 = (HeaderValue) next;
        if (headerValue3 == null || (value2 = headerValue3.getValue()) == null || (listSplit$default = n0.split$default((CharSequence) value2, new String[]{C3191e4.i.f36525b}, false, 0, 6, (Object) null)) == null || (str = (String) listSplit$default.get(1)) == null) {
            numValueOf = null;
        } else {
            Integer intOrNull2 = j0.toIntOrNull(str);
            numValueOf = Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            HttpCacheKt.getLOGGER().trace("\"max-age\" is not set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        CacheControl cacheControl = CacheControl.INSTANCE;
        if (headerValue.contains(cacheControl.getNO_CACHE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().trace("\"no-cache\" is set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        long timestamp = cacheExpires.getTimestamp() - DateJvmKt.getTimeMillis();
        if (timestamp > 0) {
            HttpCacheKt.getLOGGER().trace("Cached response is valid for " + request.getUrl() + ", should not validate");
            return ValidateStatus.ShouldNotValidate;
        }
        if (headerValue.contains(cacheControl.getMUST_REVALIDATE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().trace("\"must-revalidate\" is set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (k0.startsWith$default(((HeaderValue) next2).getValue(), "max-stale=", false, 2, null)) {
                obj = next2;
                break;
            }
        }
        HeaderValue headerValue4 = (HeaderValue) obj;
        if (headerValue4 != null && (value = headerValue4.getValue()) != null) {
            String strSubstring = value.substring(10);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring != null && (intOrNull = j0.toIntOrNull(strSubstring)) != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        if ((iIntValue * 1000) + timestamp > 0) {
            HttpCacheKt.getLOGGER().trace("Cached response is stale for " + request.getUrl() + " but less than max-stale, should warn");
            return ValidateStatus.ShouldWarn;
        }
        HttpCacheKt.getLOGGER().trace("Cached response is stale for " + request.getUrl() + ", should validate cached response");
        return ValidateStatus.ShouldValidate;
    }

    public static final Map<String, String> varyKeys(HttpResponse httpResponse) {
        e0.checkNotNullParameter(httpResponse, "<this>");
        List<String> listVary = HttpMessagePropertiesKt.vary(httpResponse);
        if (listVary == null) {
            return p1.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Headers headers = httpResponse.getCall().getRequest().getHeaders();
        for (String str : listVary) {
            String str2 = headers.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
