package io.ktor.http.content;

import av.e;
import bv.f;
import bv.n;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.Closeable;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class OutputStreamContent extends OutgoingContent.WriteChannelContent {
    private final p body;
    private final Long contentLength;
    private final ContentType contentType;
    private final HttpStatusCode status;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.http.content.OutputStreamContent$writeTo$2", f = "OutputStreamContent.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.http.content.OutputStreamContent$writeTo$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements l {
        final /* synthetic */ ByteWriteChannel $channel;
        Object L$0;
        int label;
        final /* synthetic */ OutputStreamContent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteWriteChannel byteWriteChannel, OutputStreamContent outputStreamContent, d<? super AnonymousClass2> dVar) {
            super(1, dVar);
            this.$channel = byteWriteChannel;
            this.this$0 = outputStreamContent;
        }

        @Override // bv.a
        public final d<x0> create(d<?> dVar) {
            return new AnonymousClass2(this.$channel, this.this$0, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Closeable closeable;
            Throwable th2;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.L$0;
                try {
                    a0.throwOnFailure(obj);
                    gv.d.closeFinally(closeable, null);
                    return x0.f87415a;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        gv.d.closeFinally(closeable, th2);
                        throw th4;
                    }
                }
            }
            a0.throwOnFailure(obj);
            OutputStream outputStream$default = BlockingKt.toOutputStream$default(this.$channel, null, 1, null);
            try {
                p pVar = this.this$0.body;
                this.L$0 = outputStream$default;
                this.label = 1;
                if (pVar.invoke(outputStream$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = outputStream$default;
                gv.d.closeFinally(closeable, null);
                return x0.f87415a;
            } catch (Throwable th5) {
                closeable = outputStream$default;
                th2 = th5;
                throw th2;
            }
        }

        @Override // kv.l
        public final Object invoke(d<? super x0> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public /* synthetic */ OutputStreamContent(p pVar, ContentType contentType, HttpStatusCode httpStatusCode, Long l9, int i10, u uVar) {
        this(pVar, contentType, (i10 & 4) != 0 ? null : httpStatusCode, (i10 & 8) != 0 ? null : l9);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public Object writeTo(ByteWriteChannel byteWriteChannel, d<? super x0> dVar) {
        Object objWithBlocking = BlockingBridgeKt.withBlocking(new AnonymousClass2(byteWriteChannel, this, null), dVar);
        return objWithBlocking == e.getCOROUTINE_SUSPENDED() ? objWithBlocking : x0.f87415a;
    }

    public OutputStreamContent(p body, ContentType contentType, HttpStatusCode httpStatusCode, Long l9) {
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(contentType, "contentType");
        this.body = body;
        this.contentType = contentType;
        this.status = httpStatusCode;
        this.contentLength = l9;
    }
}
