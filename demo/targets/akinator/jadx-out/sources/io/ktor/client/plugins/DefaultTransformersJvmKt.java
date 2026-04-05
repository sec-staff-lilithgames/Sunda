package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultTransformersJvmKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38961 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C38961(d<? super C38961> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
            C38961 c38961 = new C38961(dVar);
            c38961.L$0 = pipelineContext;
            c38961.L$1 = httpResponseContainer;
            return c38961.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final PipelineContext pipelineContext = (PipelineContext) this.L$0;
                HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
                TypeInfo typeInfoComponent1 = httpResponseContainer.component1();
                Object objComponent2 = httpResponseContainer.component2();
                if ((objComponent2 instanceof ByteReadChannel) && e0.areEqual(typeInfoComponent1.getType(), c1.getOrCreateKotlinClass(InputStream.class))) {
                    final InputStream inputStream = BlockingKt.toInputStream((ByteReadChannel) objComponent2, (Job) ((HttpClientCall) pipelineContext.getContext()).getCoroutineContext().get(Job.Key));
                    HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfoComponent1, new InputStream() { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1$response$1
                        @Override // java.io.InputStream
                        public int available() {
                            return inputStream.available();
                        }

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
                            super.close();
                            inputStream.close();
                            HttpResponseKt.complete(pipelineContext.getContext().getResponse());
                        }

                        @Override // java.io.InputStream
                        public int read() {
                            return inputStream.read();
                        }

                        @Override // java.io.InputStream
                        public int read(byte[] b10, int i11, int i12) {
                            e0.checkNotNullParameter(b10, "b");
                            return inputStream.read(b10, i11, i12);
                        }
                    });
                    this.L$0 = null;
                    this.label = 1;
                    if (pipelineContext.proceedWith(httpResponseContainer2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0Var;
        }
    }

    public static final OutgoingContent platformRequestDefaultTransform(ContentType contentType, HttpRequestBuilder context, Object body) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(body, "body");
        if (body instanceof InputStream) {
            return new OutgoingContent.ReadChannelContent(context, contentType, body) { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt.platformRequestDefaultTransform.1
                final /* synthetic */ Object $body;
                private final Long contentLength;
                private final ContentType contentType;

                {
                    this.$body = body;
                    String str = context.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                    this.contentLength = str != null ? Long.valueOf(Long.parseLong(str)) : null;
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
                    return ReadingKt.toByteReadChannelWithArrayPool$default((InputStream) this.$body, null, null, 3, null);
                }
            };
        }
        return null;
    }

    public static final void platformResponseDefaultTransformers(HttpClient httpClient) {
        e0.checkNotNullParameter(httpClient, "<this>");
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getParse(), new C38961(null));
    }
}
