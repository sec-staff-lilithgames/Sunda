package io.ktor.client.plugins.logging;

import av.e;
import bv.f;
import bv.n;
import com.ironsource.C3191e4;
import com.ironsource.Me;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.observer.ResponseObserver;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.StringsKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.l;
import kv.p;
import kv.q;
import sv.g;
import tu.a0;
import tu.x0;
import uu.p0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Logging {
    public static final Companion Companion = new Companion(null);
    private static final AttributeKey<Logging> key = new AttributeKey<>("ClientLogging");
    private List<? extends l> filters;
    private LogLevel level;
    private final Logger logger;
    private final List<SanitizedHeader> sanitizedHeaders;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion implements HttpClientPlugin<Config, Logging> {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<Logging> getKey() {
            return Logging.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(Logging plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            plugin.setupRequestLogging(scope);
            plugin.setupResponseLogging(scope);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public Logging prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new Logging(config.getLogger(), config.getLevel(), config.getFilters$ktor_client_logging(), config.getSanitizedHeaders$ktor_client_logging(), null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private Logger _logger;
        private List<l> filters = new ArrayList();
        private final List<SanitizedHeader> sanitizedHeaders = new ArrayList();
        private LogLevel level = LogLevel.HEADERS;

        public static /* synthetic */ void sanitizeHeader$default(Config config, String str, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "***";
            }
            config.sanitizeHeader(str, lVar);
        }

        public final void filter(l predicate) {
            e0.checkNotNullParameter(predicate, "predicate");
            this.filters.add(predicate);
        }

        public final List<l> getFilters$ktor_client_logging() {
            return this.filters;
        }

        public final LogLevel getLevel() {
            return this.level;
        }

        public final Logger getLogger() {
            Logger logger = this._logger;
            return logger == null ? LoggerJvmKt.getDEFAULT(Logger.Companion) : logger;
        }

        public final List<SanitizedHeader> getSanitizedHeaders$ktor_client_logging() {
            return this.sanitizedHeaders;
        }

        public final void sanitizeHeader(String placeholder, l predicate) {
            e0.checkNotNullParameter(placeholder, "placeholder");
            e0.checkNotNullParameter(predicate, "predicate");
            this.sanitizedHeaders.add(new SanitizedHeader(placeholder, predicate));
        }

        public final void setFilters$ktor_client_logging(List<l> list) {
            e0.checkNotNullParameter(list, "<set-?>");
            this.filters = list;
        }

        public final void setLevel(LogLevel logLevel) {
            e0.checkNotNullParameter(logLevel, "<set-?>");
            this.level = logLevel;
        }

        public final void setLogger(Logger value) {
            e0.checkNotNullParameter(value, "value");
            this._logger = value;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.Logging$logRequestBody$2", f = "Logging.kt", i = {0}, l = {268}, m = "invokeSuspend", n = {"charset$iv"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$logRequestBody$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ ByteChannel $channel;
        final /* synthetic */ Charset $charset;
        final /* synthetic */ StringBuilder $requestLog;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteChannel byteChannel, Charset charset, StringBuilder sb2, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$channel = byteChannel;
            this.$charset = charset;
            this.$requestLog = sb2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$channel, this.$charset, this.$requestLog, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            Charset charset;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            String text$default = null;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    ByteChannel byteChannel = this.$channel;
                    Charset charset2 = this.$charset;
                    this.L$0 = charset2;
                    this.label = 1;
                    anonymousClass2 = this;
                    try {
                        obj = ByteReadChannel.DefaultImpls.readRemaining$default(byteChannel, 0L, anonymousClass2, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        charset = charset2;
                    } catch (Throwable unused) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charset = (Charset) this.L$0;
                    a0.throwOnFailure(obj);
                    anonymousClass2 = this;
                }
                text$default = StringsKt.readText$default((Input) obj, charset, 0, 2, (Object) null);
            } catch (Throwable unused2) {
                anonymousClass2 = this;
            }
            if (text$default == null) {
                text$default = "[request body omitted]";
            }
            StringBuilder sb2 = anonymousClass2.$requestLog;
            sb2.append("BODY START");
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
            StringBuilder sb3 = anonymousClass2.$requestLog;
            sb3.append(text$default);
            e0.checkNotNullExpressionValue(sb3, "append(value)");
            sb3.append('\n');
            e0.checkNotNullExpressionValue(sb3, "append('\\n')");
            anonymousClass2.$requestLog.append("BODY END");
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.logging.Logging$logRequestBody$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        final /* synthetic */ HttpClientCallLogger $logger;
        final /* synthetic */ StringBuilder $requestLog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HttpClientCallLogger httpClientCallLogger, StringBuilder sb2) {
            super(1);
            this.$logger = httpClientCallLogger;
            this.$requestLog = sb2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            HttpClientCallLogger httpClientCallLogger = this.$logger;
            String string = this.$requestLog.toString();
            e0.checkNotNullExpressionValue(string, "requestLog.toString()");
            httpClientCallLogger.logRequest(string);
            this.$logger.closeRequestLog();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.Logging$setupRequestLogging$1", f = "Logging.kt", i = {0, 1}, l = {84, 90}, m = "invokeSuspend", n = {"$this$intercept", "$this$intercept"}, s = {"L$0", "L$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$setupRequestLogging$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = Logging.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.util.pipeline.PipelineContext, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5, types: [io.ktor.util.pipeline.PipelineContext, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v8, types: [io.ktor.util.pipeline.PipelineContext] */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object subject;
            ?? r12;
            PipelineContext pipelineContext;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            try {
            } catch (Throwable unused) {
                subject = null;
                r12 = i10;
            }
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                ?? r13 = (PipelineContext) this.L$0;
                if (!Logging.this.shouldBeLogged((HttpRequestBuilder) r13.getContext())) {
                    ((HttpRequestBuilder) r13.getContext()).getAttributes().put(LoggingKt.DisableLogging, x0Var);
                    return x0Var;
                }
                Logging logging = Logging.this;
                HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) r13.getContext();
                this.L$0 = r13;
                this.label = 1;
                obj = logging.logRequest(httpRequestBuilder, this);
                i10 = r13;
                if (obj == coroutine_suspended) {
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pipelineContext = (PipelineContext) this.L$0;
                    try {
                        a0.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Logging.this.logRequestException((HttpRequestBuilder) pipelineContext.getContext(), th);
                        throw th;
                    }
                }
                ?? r14 = (PipelineContext) this.L$0;
                a0.throwOnFailure(obj);
                i10 = r14;
            }
            subject = (OutgoingContent) obj;
            r12 = i10;
            if (subject == null) {
                try {
                    subject = r12.getSubject();
                } catch (Throwable th3) {
                    th = th3;
                    pipelineContext = r12;
                    Logging.this.logRequestException((HttpRequestBuilder) pipelineContext.getContext(), th);
                    throw th;
                }
            }
            this.L$0 = r12;
            this.label = 2;
            return r12.proceedWith(subject, this) == coroutine_suspended ? coroutine_suspended : x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$1", f = "Logging.kt", i = {0, 0, 0, 0}, l = {184, 191, 191}, m = "invokeSuspend", n = {Me.f34938n, "logger", "header", C3191e4.h.f36509t}, s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$setupResponseLogging$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39131 extends n implements q {
        int I$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;

        public C39131(d<? super C39131> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<HttpResponse, x0> pipelineContext, HttpResponse httpResponse, d<? super x0> dVar) {
            C39131 c39131 = Logging.this.new C39131(dVar);
            c39131.L$0 = pipelineContext;
            c39131.L$1 = httpResponse;
            return c39131.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            HttpResponse httpResponse;
            HttpClientCallLogger httpClientCallLogger;
            StringBuilder sb2;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            int i11 = 1;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    PipelineContext pipelineContext = (PipelineContext) this.L$0;
                    httpResponse = (HttpResponse) this.L$1;
                    if (Logging.this.getLevel() == LogLevel.NONE || httpResponse.getCall().getAttributes().contains(LoggingKt.DisableLogging)) {
                        return x0Var;
                    }
                    httpClientCallLogger = (HttpClientCallLogger) httpResponse.getCall().getAttributes().get(LoggingKt.ClientCallLogger);
                    sb2 = new StringBuilder();
                    i10 = 0;
                    LoggingUtilsKt.logResponseHeader(sb2, httpResponse.getCall().getResponse(), Logging.this.getLevel(), Logging.this.sanitizedHeaders);
                    Object subject = pipelineContext.getSubject();
                    this.L$0 = httpResponse;
                    this.L$1 = httpClientCallLogger;
                    this.L$2 = sb2;
                    this.I$0 = 0;
                    this.label = 1;
                    if (pipelineContext.proceedWith(subject, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        a0.throwOnFailure(obj);
                        return x0Var;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.L$0;
                    a0.throwOnFailure(obj);
                    throw th2;
                }
                i10 = this.I$0;
                sb2 = (StringBuilder) this.L$2;
                httpClientCallLogger = (HttpClientCallLogger) this.L$1;
                httpResponse = (HttpResponse) this.L$0;
                a0.throwOnFailure(obj);
                String string = sb2.toString();
                e0.checkNotNullExpressionValue(string, "header.toString()");
                httpClientCallLogger.logResponseHeader(string);
                if (i10 != 0 || !Logging.this.getLevel().getBody()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (httpClientCallLogger.closeResponseLog(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return x0Var;
            } catch (Throwable th3) {
                try {
                    Logging.this.logResponseException(sb2, httpResponse.getCall().getRequest(), th3);
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        String string2 = sb2.toString();
                        e0.checkNotNullExpressionValue(string2, "header.toString()");
                        httpClientCallLogger.logResponseHeader(string2);
                        if (i11 == 0 && Logging.this.getLevel().getBody()) {
                            throw th;
                        }
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (httpClientCallLogger.closeResponseLog(this) != coroutine_suspended) {
                            th2 = th;
                            throw th2;
                        }
                        return coroutine_suspended;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i11 = i10;
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$2", f = "Logging.kt", i = {0, 1, 1, 2}, l = {201, 206, 207}, m = "invokeSuspend", n = {"$this$intercept", "cause", "logger", "cause"}, s = {"L$0", "L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.client.plugins.logging.Logging$setupResponseLogging$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39142 extends n implements q {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C39142(d<? super C39142> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
            C39142 c39142 = Logging.this.new C39142(dVar);
            c39142.L$0 = pipelineContext;
            return c39142.invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r8 == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L32
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1b
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r0 = r7.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                tu.a0.throwOnFailure(r8)
                goto Lbd
            L24:
                java.lang.Object r1 = r7.L$1
                io.ktor.client.plugins.logging.HttpClientCallLogger r1 = (io.ktor.client.plugins.logging.HttpClientCallLogger) r1
                java.lang.Object r2 = r7.L$0
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                tu.a0.throwOnFailure(r8)
                r8 = r2
                goto Lae
            L32:
                java.lang.Object r1 = r7.L$0
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3a
                goto L6e
            L3a:
                r8 = move-exception
                goto L6f
            L3c:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                io.ktor.client.plugins.logging.Logging r8 = io.ktor.client.plugins.logging.Logging.this
                io.ktor.client.plugins.logging.LogLevel r8 = r8.getLevel()
                io.ktor.client.plugins.logging.LogLevel r6 = io.ktor.client.plugins.logging.LogLevel.NONE
                if (r8 == r6) goto Lbe
                java.lang.Object r8 = r1.getContext()
                io.ktor.client.call.HttpClientCall r8 = (io.ktor.client.call.HttpClientCall) r8
                io.ktor.util.Attributes r8 = r8.getAttributes()
                io.ktor.util.AttributeKey r6 = io.ktor.client.plugins.logging.LoggingKt.access$getDisableLogging$p()
                boolean r8 = r8.contains(r6)
                if (r8 == 0) goto L63
                goto Lbe
            L63:
                r7.L$0 = r1     // Catch: java.lang.Throwable -> L3a
                r7.label = r5     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r8 = r1.proceed(r7)     // Catch: java.lang.Throwable -> L3a
                if (r8 != r0) goto L6e
                goto Lbb
            L6e:
                return r2
            L6f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.Object r5 = r1.getContext()
                io.ktor.client.call.HttpClientCall r5 = (io.ktor.client.call.HttpClientCall) r5
                io.ktor.util.Attributes r5 = r5.getAttributes()
                io.ktor.util.AttributeKey r6 = io.ktor.client.plugins.logging.LoggingKt.access$getClientCallLogger$p()
                java.lang.Object r5 = r5.get(r6)
                io.ktor.client.plugins.logging.HttpClientCallLogger r5 = (io.ktor.client.plugins.logging.HttpClientCallLogger) r5
                io.ktor.client.plugins.logging.Logging r6 = io.ktor.client.plugins.logging.Logging.this
                java.lang.Object r1 = r1.getContext()
                io.ktor.client.call.HttpClientCall r1 = (io.ktor.client.call.HttpClientCall) r1
                io.ktor.client.request.HttpRequest r1 = r1.getRequest()
                io.ktor.client.plugins.logging.Logging.access$logResponseException(r6, r2, r1, r8)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "log.toString()"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
                r7.L$0 = r8
                r7.L$1 = r5
                r7.label = r4
                java.lang.Object r1 = r5.logResponseException(r1, r7)
                if (r1 != r0) goto Lad
                goto Lbb
            Lad:
                r1 = r5
            Lae:
                r7.L$0 = r8
                r2 = 0
                r7.L$1 = r2
                r7.label = r3
                java.lang.Object r1 = r1.closeResponseLog(r7)
                if (r1 != r0) goto Lbc
            Lbb:
                return r0
            Lbc:
                r0 = r8
            Lbd:
                throw r0
            Lbe:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.Logging.C39142.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ Logging(Logger logger, LogLevel logLevel, List list, List list2, u uVar) {
        this(logger, logLevel, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object logRequest(HttpRequestBuilder httpRequestBuilder, d<? super OutgoingContent> dVar) throws IOException {
        Object next;
        Object next2;
        Object body = httpRequestBuilder.getBody();
        e0.checkNotNull(body, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        OutgoingContent outgoingContent = (OutgoingContent) body;
        HttpClientCallLogger httpClientCallLogger = new HttpClientCallLogger(this.logger);
        httpRequestBuilder.getAttributes().put(LoggingKt.ClientCallLogger, httpClientCallLogger);
        StringBuilder sb2 = new StringBuilder();
        if (this.level.getInfo()) {
            sb2.append("REQUEST: " + URLUtilsKt.Url(httpRequestBuilder.getUrl()));
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
            sb2.append("METHOD: " + httpRequestBuilder.getMethod());
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        }
        if (this.level.getHeaders()) {
            sb2.append("COMMON HEADERS");
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
            LoggingUtilsKt.logHeaders(sb2, httpRequestBuilder.getHeaders().entries(), this.sanitizedHeaders);
            sb2.append("CONTENT HEADERS");
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
            Iterator<T> it = this.sanitizedHeaders.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Boolean) ((SanitizedHeader) next).getPredicate().invoke(HttpHeaders.INSTANCE.getContentLength())).booleanValue()) {
                    break;
                }
            }
            SanitizedHeader sanitizedHeader = (SanitizedHeader) next;
            String placeholder = sanitizedHeader != null ? sanitizedHeader.getPlaceholder() : null;
            Iterator<T> it2 = this.sanitizedHeaders.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((Boolean) ((SanitizedHeader) next2).getPredicate().invoke(HttpHeaders.INSTANCE.getContentType())).booleanValue()) {
                    break;
                }
            }
            SanitizedHeader sanitizedHeader2 = (SanitizedHeader) next2;
            String placeholder2 = sanitizedHeader2 != null ? sanitizedHeader2.getPlaceholder() : null;
            Long contentLength = outgoingContent.getContentLength();
            if (contentLength != null) {
                long jLongValue = contentLength.longValue();
                String contentLength2 = HttpHeaders.INSTANCE.getContentLength();
                if (placeholder == null) {
                    placeholder = String.valueOf(jLongValue);
                }
                LoggingUtilsKt.logHeader(sb2, contentLength2, placeholder);
            }
            ContentType contentType = outgoingContent.getContentType();
            if (contentType != null) {
                String contentType2 = HttpHeaders.INSTANCE.getContentType();
                if (placeholder2 == null) {
                    placeholder2 = contentType.toString();
                }
                LoggingUtilsKt.logHeader(sb2, contentType2, placeholder2);
            }
            LoggingUtilsKt.logHeaders(sb2, outgoingContent.getHeaders().entries(), this.sanitizedHeaders);
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        if (string.length() > 0) {
            httpClientCallLogger.logRequest(string);
        }
        if (string.length() != 0 && this.level.getBody()) {
            return logRequestBody(outgoingContent, httpClientCallLogger, dVar);
        }
        httpClientCallLogger.closeRequestLog();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object logRequestBody(OutgoingContent outgoingContent, HttpClientCallLogger httpClientCallLogger, d<? super OutgoingContent> dVar) {
        Charset charset;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BODY Content-Type: " + outgoingContent.getContentType());
        e0.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        ContentType contentType = outgoingContent.getContentType();
        if (contentType == null || (charset = ContentTypesKt.charset(contentType)) == null) {
            charset = g.f86134b;
        }
        ByteChannel byteChannelByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new AnonymousClass2(byteChannelByteChannel$default, charset, sb2, null), 2, null).invokeOnCompletion(new AnonymousClass3(httpClientCallLogger, sb2));
        return ObservingUtilsKt.observe(outgoingContent, byteChannelByteChannel$default, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logRequestException(HttpRequestBuilder httpRequestBuilder, Throwable th2) {
        if (this.level.getInfo()) {
            this.logger.log("REQUEST " + URLUtilsKt.Url(httpRequestBuilder.getUrl()) + " failed with exception: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logResponseException(StringBuilder sb2, HttpRequest httpRequest, Throwable th2) {
        if (this.level.getInfo()) {
            sb2.append("RESPONSE " + httpRequest.getUrl() + " failed with exception: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupRequestLogging(HttpClient httpClient) {
        httpClient.getSendPipeline().intercept(HttpSendPipeline.Phases.getMonitoring(), new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupResponseLogging(HttpClient httpClient) {
        httpClient.getReceivePipeline().intercept(HttpReceivePipeline.Phases.getState(), new C39131(null));
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getReceive(), new C39142(null));
        if (this.level.getBody()) {
            ResponseObserver.Plugin.install(new ResponseObserver(new Logging$setupResponseLogging$observer$1(this, null), null, 2, null), httpClient);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldBeLogged(HttpRequestBuilder httpRequestBuilder) {
        if (this.filters.isEmpty()) {
            return true;
        }
        List<? extends l> list = this.filters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((l) it.next()).invoke(httpRequestBuilder)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<l> getFilters() {
        return this.filters;
    }

    public final LogLevel getLevel() {
        return this.level;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final void setFilters(List<? extends l> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.filters = list;
    }

    public final void setLevel(LogLevel logLevel) {
        e0.checkNotNullParameter(logLevel, "<set-?>");
        this.level = logLevel;
    }

    private Logging(Logger logger, LogLevel logLevel, List<? extends l> list, List<SanitizedHeader> list2) {
        this.logger = logger;
        this.level = logLevel;
        this.filters = list;
        this.sanitizedHeaders = list2;
    }

    public /* synthetic */ Logging(Logger logger, LogLevel logLevel, List list, List list2, int i10, u uVar) {
        this(logger, logLevel, (i10 & 4) != 0 ? p0.emptyList() : list, list2);
    }
}
