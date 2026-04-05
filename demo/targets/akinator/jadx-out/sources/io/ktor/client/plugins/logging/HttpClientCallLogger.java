package io.ktor.client.plugins.logging;

import bv.d;
import bv.f;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpClientCallLogger {
    private static final /* synthetic */ AtomicIntegerFieldUpdater requestLogged$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCallLogger.class, "requestLogged");
    private static final /* synthetic */ AtomicIntegerFieldUpdater responseLogged$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCallLogger.class, "responseLogged");
    private final Logger logger;
    private final StringBuilder requestLog;
    private volatile /* synthetic */ int requestLogged;
    private final CompletableJob requestLoggedMonitor;
    private final CompletableJob responseHeaderMonitor;
    private final StringBuilder responseLog;
    private volatile /* synthetic */ int responseLogged;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0}, l = {52}, m = "closeResponseLog", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1, reason: invalid class name */
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
            return HttpClientCallLogger.this.closeResponseLog(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0, 0}, l = {34}, m = "logResponseBody", n = {"this", PglCryptUtils.KEY_MESSAGE}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39111 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39111(zu.d<? super C39111> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCallLogger.this.logResponseBody(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0, 0}, l = {29}, m = "logResponseException", n = {"this", PglCryptUtils.KEY_MESSAGE}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39121 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39121(zu.d<? super C39121> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCallLogger.this.logResponseException(null, this);
        }
    }

    public HttpClientCallLogger(Logger logger) {
        e0.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.requestLog = new StringBuilder();
        this.responseLog = new StringBuilder();
        this.requestLoggedMonitor = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.responseHeaderMonitor = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.requestLogged = 0;
        this.responseLogged = 0;
    }

    public final void closeRequestLog() {
        if (requestLogged$FU.compareAndSet(this, 0, 1)) {
            try {
                String string = n0.trim(this.requestLog).toString();
                if (string.length() > 0) {
                    this.logger.log(string);
                }
            } finally {
                this.requestLoggedMonitor.complete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object closeResponseLog(zu.d<? super tu.x0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.logging.HttpClientCallLogger.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1 r0 = (io.ktor.client.plugins.logging.HttpClientCallLogger.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1 r0 = new io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.logging.HttpClientCallLogger r0 = (io.ktor.client.plugins.logging.HttpClientCallLogger) r0
            tu.a0.throwOnFailure(r6)
            goto L52
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            tu.a0.throwOnFailure(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = io.ktor.client.plugins.logging.HttpClientCallLogger.responseLogged$FU
            r2 = 0
            boolean r6 = r6.compareAndSet(r5, r2, r4)
            if (r6 != 0) goto L44
            return r3
        L44:
            kotlinx.coroutines.CompletableJob r6 = r5.requestLoggedMonitor
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            java.lang.StringBuilder r6 = r0.responseLog
            java.lang.CharSequence r6 = sv.n0.trim(r6)
            java.lang.String r6 = r6.toString()
            int r1 = r6.length()
            if (r1 <= 0) goto L67
            io.ktor.client.plugins.logging.Logger r0 = r0.logger
            r0.log(r6)
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.HttpClientCallLogger.closeResponseLog(zu.d):java.lang.Object");
    }

    public final void logRequest(String message) {
        e0.checkNotNullParameter(message, "message");
        StringBuilder sb2 = this.requestLog;
        sb2.append(n0.trim(message).toString());
        e0.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        e0.checkNotNullExpressionValue(sb2, "append('\\n')");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logResponseBody(java.lang.String r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.logging.HttpClientCallLogger.C39111
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1 r0 = (io.ktor.client.plugins.logging.HttpClientCallLogger.C39111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1 r0 = new io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.logging.HttpClientCallLogger r0 = (io.ktor.client.plugins.logging.HttpClientCallLogger) r0
            tu.a0.throwOnFailure(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.CompletableJob r6 = r4.responseHeaderMonitor
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            java.lang.StringBuilder r6 = r0.responseLog
            r6.append(r5)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.HttpClientCallLogger.logResponseBody(java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logResponseException(java.lang.String r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.logging.HttpClientCallLogger.C39121
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1 r0 = (io.ktor.client.plugins.logging.HttpClientCallLogger.C39121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1 r0 = new io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.logging.HttpClientCallLogger r0 = (io.ktor.client.plugins.logging.HttpClientCallLogger) r0
            tu.a0.throwOnFailure(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.CompletableJob r6 = r4.requestLoggedMonitor
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            io.ktor.client.plugins.logging.Logger r6 = r0.logger
            java.lang.CharSequence r5 = sv.n0.trim(r5)
            java.lang.String r5 = r5.toString()
            r6.log(r5)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.HttpClientCallLogger.logResponseException(java.lang.String, zu.d):java.lang.Object");
    }

    public final void logResponseHeader(String message) {
        e0.checkNotNullParameter(message, "message");
        StringBuilder sb2 = this.responseLog;
        sb2.append(n0.trim(message).toString());
        e0.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        this.responseHeaderMonitor.complete();
    }
}
