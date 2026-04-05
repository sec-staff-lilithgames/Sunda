package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import bx.a;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.Me;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultTransformKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.defaultTransformers");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            OutgoingContent outgoingContentPlatformRequestDefaultTransform;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final PipelineContext pipelineContext = (PipelineContext) this.L$0;
                final Object obj2 = this.L$1;
                HeadersBuilder headers = ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                if (headers.get(httpHeaders.getAccept()) == null) {
                    ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().append(httpHeaders.getAccept(), "*/*");
                }
                final ContentType contentType = HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (contentType == null) {
                        contentType = ContentType.Text.INSTANCE.getPlain();
                    }
                    outgoingContentPlatformRequestDefaultTransform = new TextContent(str, contentType, null, 4, null);
                } else {
                    outgoingContentPlatformRequestDefaultTransform = obj2 instanceof byte[] ? new OutgoingContent.ByteArrayContent(contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$1
                        final /* synthetic */ Object $body;
                        private final long contentLength;
                        private final ContentType contentType;

                        {
                            this.$body = obj2;
                            this.contentType = contentType == null ? ContentType.Application.INSTANCE.getOctetStream() : contentType;
                            this.contentLength = ((byte[]) obj2).length;
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                        public byte[] bytes() {
                            return (byte[]) this.$body;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public Long getContentLength() {
                            return Long.valueOf(this.contentLength);
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public ContentType getContentType() {
                            return this.contentType;
                        }
                    } : obj2 instanceof ByteReadChannel ? new OutgoingContent.ReadChannelContent(pipelineContext, contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$2
                        final /* synthetic */ Object $body;
                        private final Long contentLength;
                        private final ContentType contentType;

                        {
                            this.$body = obj2;
                            String str2 = pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                            this.contentLength = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                            this.contentType = contentType == null ? ContentType.Application.INSTANCE.getOctetStream() : contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public Long getContentLength() {
                            return this.contentLength;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public ContentType getContentType() {
                            return this.contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                        public ByteReadChannel readFrom() {
                            return (ByteReadChannel) this.$body;
                        }
                    } : obj2 instanceof OutgoingContent ? (OutgoingContent) obj2 : DefaultTransformersJvmKt.platformRequestDefaultTransform(contentType, (HttpRequestBuilder) pipelineContext.getContext(), obj2);
                }
                if ((outgoingContentPlatformRequestDefaultTransform != null ? outgoingContentPlatformRequestDefaultTransform.getContentType() : null) != null) {
                    ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().remove(httpHeaders.getContentType());
                    DefaultTransformKt.LOGGER.trace("Transformed with default transformers request body for " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl() + " from " + c1.getOrCreateKotlinClass(obj2.getClass()));
                    this.L$0 = null;
                    this.label = 1;
                    if (pipelineContext.proceedWith(outgoingContentPlatformRequestDefaultTransform, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, 78, 78, 82, 90, 116, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", Me.f34938n, "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = httpResponseContainer;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02ef  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 824
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultTransformKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void defaultTransformers(HttpClient httpClient) {
        e0.checkNotNullParameter(httpClient, "<this>");
        httpClient.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getRender(), new AnonymousClass1(null));
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getParse(), new AnonymousClass2(null));
        DefaultTransformersJvmKt.platformResponseDefaultTransformers(httpClient);
    }
}
