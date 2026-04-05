package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import qv.p;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class OutgoingContent {
    private Attributes extensionProperties;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class ByteArrayContent extends OutgoingContent {
        public ByteArrayContent() {
            super(null);
        }

        public abstract byte[] bytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class NoContent extends OutgoingContent {
        public NoContent() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class ProtocolUpgrade extends OutgoingContent {
        public ProtocolUpgrade() {
            super(null);
        }

        @Override // io.ktor.http.content.OutgoingContent
        public final HttpStatusCode getStatus() {
            return HttpStatusCode.Companion.getSwitchingProtocols();
        }

        public abstract Object upgrade(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, m mVar, m mVar2, d<? super Job> dVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class ReadChannelContent extends OutgoingContent {
        public ReadChannelContent() {
            super(null);
        }

        public abstract ByteReadChannel readFrom();

        public ByteReadChannel readFrom(p range) {
            e0.checkNotNullParameter(range, "range");
            return range.isEmpty() ? ByteReadChannel.Companion.getEmpty() : CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, (m) Dispatchers.getUnconfined(), true, (kv.p) new OutgoingContent$ReadChannelContent$readFrom$1(this, range, null)).getChannel();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class WriteChannelContent extends OutgoingContent {
        public WriteChannelContent() {
            super(null);
        }

        public abstract Object writeTo(ByteWriteChannel byteWriteChannel, d<? super x0> dVar);
    }

    public /* synthetic */ OutgoingContent(u uVar) {
        this();
    }

    public Long getContentLength() {
        return null;
    }

    public ContentType getContentType() {
        return null;
    }

    public Headers getHeaders() {
        return Headers.Companion.getEmpty();
    }

    public <T> T getProperty(AttributeKey<T> key) {
        e0.checkNotNullParameter(key, "key");
        Attributes attributes = this.extensionProperties;
        if (attributes != null) {
            return (T) attributes.getOrNull(key);
        }
        return null;
    }

    public HttpStatusCode getStatus() {
        return null;
    }

    public <T> void setProperty(AttributeKey<T> key, T t10) {
        e0.checkNotNullParameter(key, "key");
        if (t10 == null && this.extensionProperties == null) {
            return;
        }
        if (t10 == null) {
            Attributes attributes = this.extensionProperties;
            if (attributes != null) {
                attributes.remove(key);
                return;
            }
            return;
        }
        Attributes attributesAttributes$default = this.extensionProperties;
        if (attributesAttributes$default == null) {
            attributesAttributes$default = AttributesJvmKt.Attributes$default(false, 1, null);
        }
        this.extensionProperties = attributesAttributes$default;
        attributesAttributes$default.put(key, t10);
    }

    public Headers trailers() {
        return null;
    }

    private OutgoingContent() {
    }
}
