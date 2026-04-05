package io.ktor.client.request;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.util.AttributesKt;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.HttpRequestKt$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(URLBuilder uRLBuilder) {
            e0.checkNotNullParameter(uRLBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((URLBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.HttpRequestKt$url$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(URLBuilder uRLBuilder) {
            e0.checkNotNullParameter(uRLBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((URLBuilder) obj);
            return x0.f87415a;
        }
    }

    public static final HeadersBuilder headers(HttpMessageBuilder httpMessageBuilder, l block) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        block.invoke(headers);
        return headers;
    }

    public static final HttpRequestBuilder invoke(HttpRequestBuilder.Companion companion, l block) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(block, "block");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, block);
        return httpRequestBuilder;
    }

    public static /* synthetic */ HttpRequestBuilder invoke$default(HttpRequestBuilder.Companion companion, String str, String str2, Integer num, String str3, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        return invoke(companion, str, str2, num, str3, lVar);
    }

    @InternalAPI
    public static final boolean isUpgradeRequest(HttpRequestData httpRequestData) {
        e0.checkNotNullParameter(httpRequestData, "<this>");
        return httpRequestData.getBody() instanceof ClientUpgradeContent;
    }

    public static final HttpRequestBuilder takeFrom(HttpRequestBuilder httpRequestBuilder, HttpRequest request) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(request, "request");
        httpRequestBuilder.setMethod(request.getMethod());
        httpRequestBuilder.setBody(request.getContent());
        httpRequestBuilder.setBodyType((TypeInfo) httpRequestBuilder.getAttributes().getOrNull(RequestBodyKt.getBodyTypeAttributeKey()));
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), request.getUrl());
        httpRequestBuilder.getHeaders().appendAll(request.getHeaders());
        AttributesKt.putAll(httpRequestBuilder.getAttributes(), request.getAttributes());
        return httpRequestBuilder;
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, l block) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        block.invoke(httpRequestBuilder.getUrl());
    }

    public static /* synthetic */ void url$default(HttpRequestBuilder httpRequestBuilder, String str, String str2, Integer num, String str3, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        url(httpRequestBuilder, str, str2, num, str3, lVar);
    }

    public static final HttpRequestBuilder invoke(HttpRequestBuilder.Companion companion, String str, String str2, Integer num, String str3, l block) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(block, "block");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, str, str2, num, str3, block);
        return httpRequestBuilder;
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, String str, String str2, Integer num, String str3, l block) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        URLBuilderKt.set(httpRequestBuilder.getUrl(), str, str2, num, str3, block);
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, String urlString) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(urlString, "urlString");
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), urlString);
    }

    public static final HttpRequestBuilder takeFrom(HttpRequestBuilder httpRequestBuilder, HttpRequestData request) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(request, "request");
        httpRequestBuilder.setMethod(request.getMethod());
        httpRequestBuilder.setBody(request.getBody());
        httpRequestBuilder.setBodyType((TypeInfo) httpRequestBuilder.getAttributes().getOrNull(RequestBodyKt.getBodyTypeAttributeKey()));
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), request.getUrl());
        httpRequestBuilder.getHeaders().appendAll(request.getHeaders());
        AttributesKt.putAll(httpRequestBuilder.getAttributes(), request.getAttributes());
        return httpRequestBuilder;
    }
}
