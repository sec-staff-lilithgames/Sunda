package io.ktor.client.plugins.cookies;

import bv.d;
import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.http.Cookie;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.l;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AcceptAllCookiesStorage implements CookiesStorage {
    private final List<Cookie> container = new ArrayList();
    private volatile /* synthetic */ long oldestCookie = 0;
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0, 0}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "addCookie", n = {"this", IronSourceConstants.REQUEST_URL, "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcceptAllCookiesStorage.this.addCookie(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$cleanup$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39081 extends f0 implements l {
        final /* synthetic */ long $timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39081(long j10) {
            super(1);
            this.$timestamp = j10;
        }

        @Override // kv.l
        public final Boolean invoke(Cookie cookie) {
            e0.checkNotNullParameter(cookie, "cookie");
            GMTDate expires = cookie.getExpires();
            if (expires != null) {
                return Boolean.valueOf(expires.getTimestamp() < this.$timestamp);
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "get", n = {"this", IronSourceConstants.REQUEST_URL, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39091 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C39091(zu.d<? super C39091> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcceptAllCookiesStorage.this.get(null, this);
        }
    }

    private final void cleanup(long j10) {
        v0.removeAll((List) this.container, (l) new C39081(j10));
        Iterator<T> it = this.container.iterator();
        long jMin = Long.MAX_VALUE;
        while (it.hasNext()) {
            GMTDate expires = ((Cookie) it.next()).getExpires();
            if (expires != null) {
                jMin = Math.min(jMin, expires.getTimestamp());
            }
        }
        this.oldestCookie = jMin;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addCookie(io.ktor.http.Url r6, io.ktor.http.Cookie r7, zu.d<? super tu.x0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 r0 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.L$3
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.L$2
            io.ktor.http.Cookie r7 = (io.ktor.http.Cookie) r7
            java.lang.Object r1 = r0.L$1
            io.ktor.http.Url r1 = (io.ktor.http.Url) r1
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage) r0
            tu.a0.throwOnFailure(r8)
            r8 = r6
            r6 = r1
            goto L5b
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r5.mutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r0 = r5
        L5b:
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Throwable -> L8b
            boolean r1 = sv.n0.isBlank(r1)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L8d
            java.util.List<io.ktor.http.Cookie> r1 = r0.container     // Catch: java.lang.Throwable -> L8b
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$2$2 r2 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$2$2     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r7, r6)     // Catch: java.lang.Throwable -> L8b
            uu.v0.removeAll(r1, r2)     // Catch: java.lang.Throwable -> L8b
            java.util.List<io.ktor.http.Cookie> r1 = r0.container     // Catch: java.lang.Throwable -> L8b
            io.ktor.http.Cookie r6 = io.ktor.client.plugins.cookies.CookiesStorageKt.fillDefaults(r7, r6)     // Catch: java.lang.Throwable -> L8b
            r1.add(r6)     // Catch: java.lang.Throwable -> L8b
            io.ktor.util.date.GMTDate r6 = r7.getExpires()     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L8d
            long r6 = r6.getTimestamp()     // Catch: java.lang.Throwable -> L8b
            long r1 = r0.oldestCookie     // Catch: java.lang.Throwable -> L8b
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L8d
            r0.oldestCookie = r6     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r6 = move-exception
            goto L93
        L8d:
            r8.unlock(r4)
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L93:
            r8.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.addCookie(io.ktor.http.Url, io.ktor.http.Cookie, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(io.ktor.http.Url r8, zu.d<? super java.util.List<io.ktor.http.Cookie>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.C39091
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.C39091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 r0 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r1 = r0.L$1
            io.ktor.http.Url r1 = (io.ktor.http.Url) r1
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage) r0
            tu.a0.throwOnFailure(r9)
            goto L55
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            tu.a0.throwOnFailure(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r7
            r1 = r8
            r8 = r9
        L55:
            long r2 = io.ktor.util.date.DateJvmKt.getTimeMillis()     // Catch: java.lang.Throwable -> L63
            long r5 = r0.oldestCookie     // Catch: java.lang.Throwable -> L63
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 < 0) goto L65
            r0.cleanup(r2)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r9 = move-exception
            goto L8d
        L65:
            java.util.List<io.ktor.http.Cookie> r9 = r0.container     // Catch: java.lang.Throwable -> L63
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L63
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L63
        L72:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L89
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L63
            r3 = r2
            io.ktor.http.Cookie r3 = (io.ktor.http.Cookie) r3     // Catch: java.lang.Throwable -> L63
            boolean r3 = io.ktor.client.plugins.cookies.CookiesStorageKt.matches(r3, r1)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L72
            r0.add(r2)     // Catch: java.lang.Throwable -> L63
            goto L72
        L89:
            r8.unlock(r4)
            return r0
        L8d:
            r8.unlock(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.get(io.ktor.http.Url, zu.d):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
