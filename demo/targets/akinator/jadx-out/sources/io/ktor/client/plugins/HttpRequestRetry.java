package io.ktor.client.plugins;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kv.l;
import kv.p;
import kv.q;
import ov.g;
import tu.f;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry {
    private final p delay;
    private final p delayMillis;
    private final int maxRetries;
    private final p modifyRequest;
    private final q shouldRetry;
    private final q shouldRetryOnException;
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<HttpRequestRetry> key = new AttributeKey<>("RetryFeature");
    private static final EventDefinition<RetryEventData> HttpRequestRetryEvent = new EventDefinition<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Configuration {
        public p delayMillis;
        private int maxRetries;
        public q shouldRetry;
        public q shouldRetryOnException;
        private p modifyRequest = HttpRequestRetry$Configuration$modifyRequest$1.INSTANCE;
        private p delay = new HttpRequestRetry$Configuration$delay$1(null);

        public Configuration() {
            retryOnExceptionOrServerErrors(3);
            exponentialDelay$default(this, 0.0d, 0L, 0L, false, 15, null);
        }

        public static /* synthetic */ void constantDelay$default(Configuration configuration, long j10, long j11, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 1000;
            }
            if ((i10 & 2) != 0) {
                j11 = 1000;
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            configuration.constantDelay(j10, j11, z10);
        }

        public static /* synthetic */ void delayMillis$default(Configuration configuration, boolean z10, p pVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            configuration.delayMillis(z10, pVar);
        }

        public static /* synthetic */ void exponentialDelay$default(Configuration configuration, double d10, long j10, long j11, boolean z10, int i10, Object obj) {
            configuration.exponentialDelay((i10 & 1) != 0 ? 2.0d : d10, (i10 & 2) != 0 ? ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS : j10, (i10 & 4) != 0 ? 1000L : j11, (i10 & 8) != 0 ? true : z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long randomMs(long j10) {
            if (j10 == 0) {
                return 0L;
            }
            return g.f79860b.nextLong(j10);
        }

        public static /* synthetic */ void retryIf$default(Configuration configuration, int i10, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            configuration.retryIf(i10, qVar);
        }

        public static /* synthetic */ void retryOnException$default(Configuration configuration, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            configuration.retryOnException(i10);
        }

        public static /* synthetic */ void retryOnExceptionIf$default(Configuration configuration, int i10, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            configuration.retryOnExceptionIf(i10, qVar);
        }

        public static /* synthetic */ void retryOnExceptionOrServerErrors$default(Configuration configuration, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            configuration.retryOnExceptionOrServerErrors(i10);
        }

        public static /* synthetic */ void retryOnServerErrors$default(Configuration configuration, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            configuration.retryOnServerErrors(i10);
        }

        public final void constantDelay(long j10, long j11, boolean z10) {
            if (j10 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            delayMillis(z10, new HttpRequestRetry$Configuration$constantDelay$1(j10, this, j11));
        }

        public final void delay(p block) {
            e0.checkNotNullParameter(block, "block");
            this.delay = block;
        }

        public final void delayMillis(boolean z10, p block) {
            e0.checkNotNullParameter(block, "block");
            setDelayMillis$ktor_client_core(new HttpRequestRetry$Configuration$delayMillis$1(z10, block));
        }

        public final void exponentialDelay(double d10, long j10, long j11, boolean z10) {
            if (d10 <= 0.0d) {
                throw new IllegalStateException("Check failed.");
            }
            if (j10 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            delayMillis(z10, new HttpRequestRetry$Configuration$exponentialDelay$1(d10, j10, this, j11));
        }

        public final p getDelay$ktor_client_core() {
            return this.delay;
        }

        public final p getDelayMillis$ktor_client_core() {
            p pVar = this.delayMillis;
            if (pVar != null) {
                return pVar;
            }
            e0.throwUninitializedPropertyAccessException("delayMillis");
            return null;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final p getModifyRequest$ktor_client_core() {
            return this.modifyRequest;
        }

        public final q getShouldRetry$ktor_client_core() {
            q qVar = this.shouldRetry;
            if (qVar != null) {
                return qVar;
            }
            e0.throwUninitializedPropertyAccessException("shouldRetry");
            return null;
        }

        public final q getShouldRetryOnException$ktor_client_core() {
            q qVar = this.shouldRetryOnException;
            if (qVar != null) {
                return qVar;
            }
            e0.throwUninitializedPropertyAccessException("shouldRetryOnException");
            return null;
        }

        public final void modifyRequest(p block) {
            e0.checkNotNullParameter(block, "block");
            this.modifyRequest = block;
        }

        public final void noRetry() {
            this.maxRetries = 0;
            setShouldRetry$ktor_client_core(HttpRequestRetry$Configuration$noRetry$1.INSTANCE);
            setShouldRetryOnException$ktor_client_core(HttpRequestRetry$Configuration$noRetry$2.INSTANCE);
        }

        public final void retryIf(int i10, q block) {
            e0.checkNotNullParameter(block, "block");
            if (i10 != -1) {
                this.maxRetries = i10;
            }
            setShouldRetry$ktor_client_core(block);
        }

        @f
        public final /* synthetic */ void retryOnException(int i10) {
            retryOnException(i10, false);
        }

        public final void retryOnExceptionIf(int i10, q block) {
            e0.checkNotNullParameter(block, "block");
            if (i10 != -1) {
                this.maxRetries = i10;
            }
            setShouldRetryOnException$ktor_client_core(block);
        }

        public final void retryOnExceptionOrServerErrors(int i10) {
            retryOnServerErrors(i10);
            retryOnException$default(this, i10, false, 2, null);
        }

        public final void retryOnServerErrors(int i10) {
            retryIf(i10, HttpRequestRetry$Configuration$retryOnServerErrors$1.INSTANCE);
        }

        public final void setDelay$ktor_client_core(p pVar) {
            e0.checkNotNullParameter(pVar, "<set-?>");
            this.delay = pVar;
        }

        public final void setDelayMillis$ktor_client_core(p pVar) {
            e0.checkNotNullParameter(pVar, "<set-?>");
            this.delayMillis = pVar;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setModifyRequest$ktor_client_core(p pVar) {
            e0.checkNotNullParameter(pVar, "<set-?>");
            this.modifyRequest = pVar;
        }

        public final void setShouldRetry$ktor_client_core(q qVar) {
            e0.checkNotNullParameter(qVar, "<set-?>");
            this.shouldRetry = qVar;
        }

        public final void setShouldRetryOnException$ktor_client_core(q qVar) {
            e0.checkNotNullParameter(qVar, "<set-?>");
            this.shouldRetryOnException = qVar;
        }

        public static /* synthetic */ void retryOnException$default(Configuration configuration, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            if ((i11 & 2) != 0) {
                z10 = false;
            }
            configuration.retryOnException(i10, z10);
        }

        public final void retryOnException(int i10, boolean z10) {
            retryOnExceptionIf(i10, new HttpRequestRetry$Configuration$retryOnException$1(z10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DelayContext {
        private final Throwable cause;
        private final HttpRequestBuilder request;
        private final HttpResponse response;

        public DelayContext(HttpRequestBuilder request, HttpResponse httpResponse, Throwable th2) {
            e0.checkNotNullParameter(request, "request");
            this.request = request;
            this.response = httpResponse;
            this.cause = th2;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final HttpRequestBuilder getRequest() {
            return this.request;
        }

        public final HttpResponse getResponse() {
            return this.response;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ModifyRequestContext {
        private final Throwable cause;
        private final HttpRequestBuilder request;
        private final HttpResponse response;
        private final int retryCount;

        public ModifyRequestContext(HttpRequestBuilder request, HttpResponse httpResponse, Throwable th2, int i10) {
            e0.checkNotNullParameter(request, "request");
            this.request = request;
            this.response = httpResponse;
            this.cause = th2;
            this.retryCount = i10;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final HttpRequestBuilder getRequest() {
            return this.request;
        }

        public final HttpResponse getResponse() {
            return this.response;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Configuration, HttpRequestRetry> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        public final EventDefinition<RetryEventData> getHttpRequestRetryEvent() {
            return HttpRequestRetry.HttpRequestRetryEvent;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpRequestRetry> getKey() {
            return HttpRequestRetry.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpRequestRetry plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            plugin.intercept$ktor_client_core(scope);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpRequestRetry prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Configuration configuration = new Configuration();
            block.invoke(configuration);
            return new HttpRequestRetry(configuration);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class RetryEventData {
        private final Throwable cause;
        private final HttpRequestBuilder request;
        private final HttpResponse response;
        private final int retryCount;

        public RetryEventData(HttpRequestBuilder request, int i10, HttpResponse httpResponse, Throwable th2) {
            e0.checkNotNullParameter(request, "request");
            this.request = request;
            this.retryCount = i10;
            this.response = httpResponse;
            this.cause = th2;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final HttpRequestBuilder getRequest() {
            return this.request;
        }

        public final HttpResponse getResponse() {
            return this.response;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ShouldRetryContext {
        private final int retryCount;

        public ShouldRetryContext(int i10) {
            this.retryCount = i10;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.HttpRequestRetry$prepareRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ HttpRequestBuilder $subRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequestBuilder httpRequestBuilder) {
            super(1);
            this.$subRequest = httpRequestBuilder;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            Job executionContext = this.$subRequest.getExecutionContext();
            e0.checkNotNull(executionContext, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
            CompletableJob completableJob = (CompletableJob) executionContext;
            if (th2 == null) {
                completableJob.complete();
            } else {
                completableJob.completeExceptionally(th2);
            }
        }
    }

    public HttpRequestRetry(Configuration configuration) {
        e0.checkNotNullParameter(configuration, "configuration");
        this.shouldRetry = configuration.getShouldRetry$ktor_client_core();
        this.shouldRetryOnException = configuration.getShouldRetryOnException$ktor_client_core();
        this.delayMillis = configuration.getDelayMillis$ktor_client_core();
        this.delay = configuration.getDelay$ktor_client_core();
        this.maxRetries = configuration.getMaxRetries();
        this.modifyRequest = configuration.getModifyRequest$ktor_client_core();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequestBuilder prepareRequest(HttpRequestBuilder httpRequestBuilder) {
        HttpRequestBuilder httpRequestBuilderTakeFrom = new HttpRequestBuilder().takeFrom(httpRequestBuilder);
        httpRequestBuilder.getExecutionContext().invokeOnCompletion(new AnonymousClass1(httpRequestBuilderTakeFrom));
        return httpRequestBuilderTakeFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRetry(int i10, int i11, q qVar, HttpClientCall httpClientCall) {
        return i10 < i11 && ((Boolean) qVar.invoke(new ShouldRetryContext(i10 + 1), httpClientCall.getRequest(), httpClientCall.getResponse())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRetryOnException(int i10, int i11, q qVar, HttpRequestBuilder httpRequestBuilder, Throwable th2) {
        return i10 < i11 && ((Boolean) qVar.invoke(new ShouldRetryContext(i10 + 1), httpRequestBuilder, th2)).booleanValue();
    }

    public final void intercept$ktor_client_core(HttpClient client) {
        e0.checkNotNullParameter(client, "client");
        ((HttpSend) HttpClientPluginKt.plugin(client, HttpSend.Plugin)).intercept(new HttpRequestRetry$intercept$1(this, client, null));
    }
}
