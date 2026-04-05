package com.sfbx.appconsent.core.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import bv.d;
import bv.f;
import com.sfbx.appconsent.core.BuildConfig;
import com.sfbx.appconsent.core.exception.ACException;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.i;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCodeKt;
import io.ktor.http.content.ByteArrayContent;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentService {
    private static final String AC_ASSETS_ENDPOINT = "com.sfbx.appconsent.AC_ASSETS_ENDPOINT";
    private static final String AC_ASSETS_ENDPOINT_PATH = "/tcf2-clear/illustrations/v1.1.0/";
    private static final String AC_ENDPOINT = "com.sfbx.appconsent.AC_ENDPOINT";
    private static final String HELLO_PATH = "/hello";
    private static final String METRIC_DISPLAY_PATH = "/t2.gif";
    private static final String QRCODE = "/qrcode";
    private static final String SAVE_EXTERNAL_IDS_PATH = "/save-external";
    private static final String SAVE_FLOATING_PATH = "/save-floating-ep";
    private static final String SAVE_PATH = "/save";
    private static final String SHIP_PATH = "/ship2";
    private static final String URL = "{URL}";
    private static final String VENDOR_EXPIRATION_PATH = "/translate-cookie-retention";
    private String assetsEndpointUrl;
    private HttpClient client;
    private String endpointUrl;
    public static final Companion Companion = new Companion(null);
    private static String METRIC_DISPLAY_URL = "{URL}/t2.gif";
    private static String HELLO_URL = "{URL}/hello";
    private static String SAVE_URL = "{URL}/save";
    private static String SAVE_FLOATING_URL = "{URL}/save-floating-ep";
    private static String SHIP_URL = "{URL}/ship2";
    private static String SAVE_EXTERNAL_IDS_URL = "{URL}/save-external";
    private static String VENDOR_EXPIRATION_URL = "{URL}/translate-cookie-retention";
    private static String QRCODE_URL = "{URL}/qrcode";
    private static String ILLUSTRATION_BASE_URL = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateURLs(String str) {
            AppConsentService.METRIC_DISPLAY_URL = k0.replace$default(AppConsentService.METRIC_DISPLAY_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.HELLO_URL = k0.replace$default(AppConsentService.HELLO_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.SAVE_URL = k0.replace$default(AppConsentService.SAVE_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.SAVE_FLOATING_URL = k0.replace$default(AppConsentService.SAVE_FLOATING_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.SHIP_URL = k0.replace$default(AppConsentService.SHIP_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.SAVE_EXTERNAL_IDS_URL = k0.replace$default(AppConsentService.SAVE_EXTERNAL_IDS_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.VENDOR_EXPIRATION_URL = k0.replace$default(AppConsentService.VENDOR_EXPIRATION_URL, AppConsentService.URL, str, false, 4, (Object) null);
            AppConsentService.QRCODE_URL = k0.replace$default(AppConsentService.QRCODE_URL, AppConsentService.URL, str, false, 4, (Object) null);
        }

        public final String provideIllustrationBaseUrl() {
            String str = AppConsentService.ILLUSTRATION_BASE_URL;
            if (str.length() <= 0) {
                str = null;
            }
            return str == null ? BuildConfig.ILLUSTRATION_BASE_URL : str;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {0}, l = {274, 244}, m = "generateQrCode", n = {"this"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$generateQrCode$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.generateQrCode(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {212, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "getVendorExpiration", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35921 extends d {
        int label;
        /* synthetic */ Object result;

        public C35921(zu.d<? super C35921> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.getVendorExpiration(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {0}, l = {257}, m = "postContentAsByteArrayTo", n = {"this"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35931 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C35931(zu.d<? super C35931> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.postContentAsByteArrayTo(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {206, 208}, m = "saveExternalIds", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35941 extends d {
        int label;
        /* synthetic */ Object result;

        public C35941(zu.d<? super C35941> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.saveExternalIds(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {196, 197}, m = "saveFloatingPurposes", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35951 extends d {
        int label;
        /* synthetic */ Object result;

        public C35951(zu.d<? super C35951> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.saveFloatingPurposes(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {183, 184}, m = "sayHello", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$sayHello$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35961 extends d {
        int label;
        /* synthetic */ Object result;

        public C35961(zu.d<? super C35961> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.sayHello(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {190, 191}, m = "sendConsents", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35971 extends d {
        int label;
        /* synthetic */ Object result;

        public C35971(zu.d<? super C35971> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.sendConsents(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {201, 202}, m = "ship", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$ship$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35981 extends d {
        int label;
        /* synthetic */ Object result;

        public C35981(zu.d<? super C35981> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConsentService.this.ship(null, this);
        }
    }

    public AppConsentService(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.client = i.f59272a.createClient(context);
        this.endpointUrl = BuildConfig.BASE_URL;
        this.assetsEndpointUrl = BuildConfig.ILLUSTRATION_BASE_URL;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            e0.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            tryToExtractEndpoint(bundle);
            tryToExtractAssetsEndpoint(bundle);
        } catch (Exception unused) {
            tryToExtractEndpoint(null);
            tryToExtractAssetsEndpoint(null);
        } catch (Throwable th2) {
            tryToExtractEndpoint(null);
            tryToExtractAssetsEndpoint(null);
            throw th2;
        }
    }

    private final void buildRequest(HttpRequestBuilder httpRequestBuilder, byte[] bArr) {
        ContentType.Application application = ContentType.Application.INSTANCE;
        UtilsKt.accept(httpRequestBuilder, application.getProtoBuf());
        httpRequestBuilder.setBody(new ByteArrayContent(bArr, application.getProtoBuf(), null, 4, null));
        httpRequestBuilder.setBodyType(null);
    }

    private final HttpResponse manageError(HttpResponse httpResponse) {
        if (HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
            return httpResponse;
        }
        String description = httpResponse.getStatus().getDescription();
        if (n0.contains((CharSequence) description, (CharSequence) "Appkey", true) || n0.contains((CharSequence) description, (CharSequence) "not found", true)) {
            throw new ACException.ACAppKeyNotFoundException();
        }
        throw new ACException.ACUnknownException(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postContentAsByteArrayTo(io.ktor.client.HttpClient r5, java.lang.String r6, byte[] r7, zu.d<? super io.ktor.client.statement.HttpResponse> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35931
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.sfbx.appconsent.core.api.AppConsentService r5 = (com.sfbx.appconsent.core.api.AppConsentService) r5
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5f
        L2d:
            r5 = move-exception
            goto L65
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.request.HttpRequestBuilder r8 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.lang.Throwable -> L2d
            r8.<init>()     // Catch: java.lang.Throwable -> L2d
            io.ktor.client.request.HttpRequestKt.url(r8, r6)     // Catch: java.lang.Throwable -> L2d
            r4.buildRequest(r8, r7)     // Catch: java.lang.Throwable -> L2d
            io.ktor.http.HttpMethod$Companion r6 = io.ktor.http.HttpMethod.Companion     // Catch: java.lang.Throwable -> L2d
            io.ktor.http.HttpMethod r6 = r6.getPost()     // Catch: java.lang.Throwable -> L2d
            r8.setMethod(r6)     // Catch: java.lang.Throwable -> L2d
            io.ktor.client.statement.HttpStatement r6 = new io.ktor.client.statement.HttpStatement     // Catch: java.lang.Throwable -> L2d
            r6.<init>(r8, r5)     // Catch: java.lang.Throwable -> L2d
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r6.execute(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r5 = r4
        L5f:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8     // Catch: java.lang.Throwable -> L2d
            r5.manageError(r8)
            return r8
        L65:
            boolean r6 = r5 instanceof java.security.cert.CertPathValidatorException
            if (r6 == 0) goto L6a
            goto L6c
        L6a:
            boolean r3 = r5 instanceof javax.net.ssl.SSLHandshakeException
        L6c:
            if (r3 == 0) goto L74
            com.sfbx.appconsent.core.exception.ACException$ACCertificationPathValidatorException r6 = new com.sfbx.appconsent.core.exception.ACException$ACCertificationPathValidatorException
            r6.<init>(r5)
            throw r6
        L74:
            com.sfbx.appconsent.core.exception.ACException$ACUnknownException r6 = new com.sfbx.appconsent.core.exception.ACException$ACUnknownException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.postContentAsByteArrayTo(io.ktor.client.HttpClient, java.lang.String, byte[], zu.d):java.lang.Object");
    }

    private final void tryToExtractAssetsEndpoint(Bundle bundle) {
        String string;
        String str = BuildConfig.ILLUSTRATION_BASE_URL;
        boolean z10 = false;
        if (bundle != null && bundle.containsKey(AC_ASSETS_ENDPOINT) && (string = bundle.getString(AC_ASSETS_ENDPOINT)) != null && !n0.isBlank(string)) {
            z10 = true;
            str = string;
        }
        this.assetsEndpointUrl = str;
        if (z10) {
            this.assetsEndpointUrl = o2.o(new StringBuilder(), this.assetsEndpointUrl, AC_ASSETS_ENDPOINT_PATH);
        }
        ILLUSTRATION_BASE_URL = this.assetsEndpointUrl;
    }

    private final void tryToExtractEndpoint(Bundle bundle) {
        String str = BuildConfig.BASE_URL;
        if (bundle != null && bundle.containsKey(AC_ENDPOINT)) {
            String string = bundle.getString(AC_ENDPOINT);
            if (string == null || n0.isBlank(string)) {
                string = null;
            }
            if (string != null) {
                str = string;
            }
        }
        this.endpointUrl = str;
        Companion.updateURLs(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateQrCode(java.lang.String r10, java.lang.String r11, zu.d<? super android.graphics.Bitmap> r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.generateQrCode(java.lang.String, java.lang.String, zu.d):java.lang.Object");
    }

    public final HttpClient getClient$appconsent_core_prodXchangeRelease() {
        return this.client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVendorExpiration(ac.Api.TranslateVendorCookieRetentionRequest r7, zu.d<? super ac.Api.TranslateVendorCookieRetentionReply> r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35921
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            tu.a0.throwOnFailure(r8)
            goto L51
        L38:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.VENDOR_EXPIRATION_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "request.toByteArray()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L51
            goto L5b
        L51:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            byte[] r8 = (byte[]) r8
            ac.Api$TranslateVendorCookieRetentionReply r7 = ac.Api.TranslateVendorCookieRetentionReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.getVendorExpiration(ac.Api$TranslateVendorCookieRetentionRequest, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveExternalIds(ac.Api.SaveExternalRequest r7, zu.d<? super ac.Api.SaveExternalReply> r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35941
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            tu.a0.throwOnFailure(r8)
            goto L51
        L38:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SAVE_EXTERNAL_IDS_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "saveExternalRequest.toByteArray()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L51
            goto L5b
        L51:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            byte[] r8 = (byte[]) r8
            ac.Api$SaveExternalReply r7 = ac.Api.SaveExternalReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…eadBytes())\n            }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.saveExternalIds(ac.Api$SaveExternalRequest, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveFloatingPurposes(ac.Api.SaveFloatingExtraPurposeRequest r7, zu.d<? super ac.Api.SaveFloatingExtraPurposeReply> r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35951
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            tu.a0.throwOnFailure(r8)
            goto L51
        L38:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SAVE_FLOATING_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "saveFloatingRequest.toByteArray()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L51
            goto L5b
        L51:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            byte[] r8 = (byte[]) r8
            ac.Api$SaveFloatingExtraPurposeReply r7 = ac.Api.SaveFloatingExtraPurposeReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.saveFloatingPurposes(ac.Api$SaveFloatingExtraPurposeRequest, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sayHello(ac.Api.HelloRequest r7, zu.d<? super ac.Api.HelloReply> r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35961
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$sayHello$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$sayHello$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$sayHello$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            tu.a0.throwOnFailure(r8)
            goto L51
        L38:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.HELLO_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "helloRequest.toByteArray()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L51
            goto L5b
        L51:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            byte[] r8 = (byte[]) r8
            ac.Api$HelloReply r7 = ac.Api.HelloReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…     helloReply\n        }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.sayHello(ac.Api$HelloRequest, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendConsents(ac.Api.SaveRequest r7, zu.d<? super ac.Api.SaveReply> r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35971
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            tu.a0.throwOnFailure(r8)
            goto L51
        L38:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SAVE_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "saveRequest.toByteArray()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L51
            goto L5b
        L51:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            byte[] r8 = (byte[]) r8
            ac.Api$SaveReply r7 = ac.Api.SaveReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.sendConsents(ac.Api$SaveRequest, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: sendDisplayMetric-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3442sendDisplayMetric0E7RQCE(java.util.Map<java.lang.String, java.lang.String> r8, java.util.Map<java.lang.String, java.lang.String> r9, zu.d<? super tu.z> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1
            if (r0 == 0) goto L13
            r0 = r10
            com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            com.sfbx.appconsent.core.api.AppConsentService r8 = (com.sfbx.appconsent.core.api.AppConsentService) r8
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L2e
            goto Lb8
        L2e:
            r8 = move-exception
            goto Lc5
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            tu.a0.throwOnFailure(r10)
            int r10 = tu.z.f87419c     // Catch: java.lang.Throwable -> L2e
            io.ktor.client.HttpClient r10 = r7.client     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.METRIC_DISPLAY_URL     // Catch: java.lang.Throwable -> L2e
            io.ktor.client.request.HttpRequestBuilder r4 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            io.ktor.client.request.HttpRequestKt.url(r4, r2)     // Catch: java.lang.Throwable -> L2e
            io.ktor.http.URLBuilder r2 = r4.getUrl()     // Catch: java.lang.Throwable -> L2e
            io.ktor.http.ParametersBuilder r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L2e
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e
        L5a:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L76
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            r2.append(r6, r5)     // Catch: java.lang.Throwable -> L2e
            goto L5a
        L76:
            java.util.Set r8 = r9.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e
        L7e:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L9e
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L2e
            io.ktor.http.HeadersBuilder r2 = r4.getHeaders()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r9.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2e
            r2.append(r5, r9)     // Catch: java.lang.Throwable -> L2e
            goto L7e
        L9e:
            io.ktor.http.HttpMethod$Companion r8 = io.ktor.http.HttpMethod.Companion     // Catch: java.lang.Throwable -> L2e
            io.ktor.http.HttpMethod r8 = r8.getGet()     // Catch: java.lang.Throwable -> L2e
            r4.setMethod(r8)     // Catch: java.lang.Throwable -> L2e
            io.ktor.client.statement.HttpStatement r8 = new io.ktor.client.statement.HttpStatement     // Catch: java.lang.Throwable -> L2e
            r8.<init>(r4, r10)     // Catch: java.lang.Throwable -> L2e
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L2e
            r0.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r8.execute(r0)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r1) goto Lb7
            return r1
        Lb7:
            r8 = r7
        Lb8:
            r9 = r10
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9     // Catch: java.lang.Throwable -> L2e
            r8.manageError(r9)     // Catch: java.lang.Throwable -> L2e
            io.ktor.client.statement.HttpResponse r10 = (io.ktor.client.statement.HttpResponse) r10     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = tu.z.m7131constructorimpl(r10)     // Catch: java.lang.Throwable -> L2e
            return r8
        Lc5:
            int r9 = tu.z.f87419c
            java.lang.Object r8 = tu.a0.createFailure(r8)
            java.lang.Object r8 = tu.z.m7131constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.m3442sendDisplayMetric0E7RQCE(java.util.Map, java.util.Map, zu.d):java.lang.Object");
    }

    public final void setClient$appconsent_core_prodXchangeRelease(HttpClient httpClient) {
        e0.checkNotNullParameter(httpClient, "<set-?>");
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ship(ac.Xchange.ShipRequest r7, zu.d<? super ac.Xchange.ShipReply> r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C35981
            if (r0 == 0) goto L13
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$ship$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C35981) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sfbx.appconsent.core.api.AppConsentService$ship$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$ship$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            tu.a0.throwOnFailure(r8)
            goto L51
        L38:
            tu.a0.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SHIP_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "shipRequest.toByteArray()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L51
            goto L5b
        L51:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            byte[] r8 = (byte[]) r8
            ac.Xchange$ShipReply r7 = ac.Xchange.ShipReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.ship(ac.Xchange$ShipRequest, zu.d):java.lang.Object");
    }

    public static /* synthetic */ void getClient$appconsent_core_prodXchangeRelease$annotations() {
    }
}
