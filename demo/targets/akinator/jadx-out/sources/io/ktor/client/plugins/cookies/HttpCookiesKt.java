package io.ktor.client.plugins.cookies;

import bv.d;
import bv.f;
import bx.a;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.http.Cookie;
import io.ktor.http.CookieKt;
import io.ktor.http.Url;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.l;
import qm.zMPW.GalEuEfxjome;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCookiesKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCookies");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "cookies", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1, reason: invalid class name */
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
            return HttpCookiesKt.cookies((HttpClient) null, (Url) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {142}, m = "cookies", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2, reason: invalid class name */
    public static final class AnonymousClass2 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookiesKt.cookies((HttpClient) null, (String) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C39101 extends a0 implements l {
        public static final C39101 INSTANCE = new C39101();

        public C39101() {
            super(1, CookieKt.class, GalEuEfxjome.IFGLqAMpLe, "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
        }

        @Override // kv.l
        public final String invoke(Cookie p02) {
            e0.checkNotNullParameter(p02, "p0");
            return CookieKt.renderCookieHeader(p02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient r4, io.ktor.http.Url r5, zu.d<? super java.util.List<io.ktor.http.Cookie>> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1 r0 = (io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1 r0 = new io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r6)
            io.ktor.client.plugins.cookies.HttpCookies$Companion r6 = io.ktor.client.plugins.cookies.HttpCookies.Companion
            java.lang.Object r4 = io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(r4, r6)
            io.ktor.client.plugins.cookies.HttpCookies r4 = (io.ktor.client.plugins.cookies.HttpCookies) r4
            if (r4 == 0) goto L4d
            r0.label = r3
            java.lang.Object r6 = r4.get(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            return r6
        L4d:
            java.util.List r4 = uu.p0.emptyList()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookiesKt.cookies(io.ktor.client.HttpClient, io.ktor.http.Url, zu.d):java.lang.Object");
    }

    public static final Cookie get(List<Cookie> list, String name) {
        Object next;
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(name, "name");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((Cookie) next).getName(), name)) {
                break;
            }
        }
        return (Cookie) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderClientCookies(List<Cookie> list) {
        return y0.joinToString$default(list, "; ", null, null, 0, null, C39101.INSTANCE, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient r4, java.lang.String r5, zu.d<? super java.util.List<io.ktor.http.Cookie>> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2 r0 = (io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2 r0 = new io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r6)
            io.ktor.client.plugins.cookies.HttpCookies$Companion r6 = io.ktor.client.plugins.cookies.HttpCookies.Companion
            java.lang.Object r4 = io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(r4, r6)
            io.ktor.client.plugins.cookies.HttpCookies r4 = (io.ktor.client.plugins.cookies.HttpCookies) r4
            if (r4 == 0) goto L51
            io.ktor.http.Url r5 = io.ktor.http.URLUtilsKt.Url(r5)
            r0.label = r3
            java.lang.Object r6 = r4.get(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L50
            goto L51
        L50:
            return r6
        L51:
            java.util.List r4 = uu.p0.emptyList()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookiesKt.cookies(io.ktor.client.HttpClient, java.lang.String, zu.d):java.lang.Object");
    }
}
