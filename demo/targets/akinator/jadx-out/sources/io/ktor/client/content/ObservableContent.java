package io.ktor.client.content;

import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.utils.ByteChannelUtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CoroutinesKt;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kv.p;
import kv.q;
import tu.t;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ObservableContent extends OutgoingContent.ReadChannelContent {
    private final m callContext;
    private final ByteReadChannel content;
    private final OutgoingContent delegate;
    private final q listener;

    public ObservableContent(OutgoingContent delegate, m callContext, q listener) {
        ByteReadChannel channel;
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(callContext, "callContext");
        e0.checkNotNullParameter(listener, "listener");
        this.delegate = delegate;
        this.callContext = callContext;
        this.listener = listener;
        if (delegate instanceof OutgoingContent.ByteArrayContent) {
            channel = ByteChannelCtorKt.ByteReadChannel(((OutgoingContent.ByteArrayContent) delegate).bytes());
        } else {
            if (delegate instanceof OutgoingContent.ProtocolUpgrade) {
                throw new UnsupportedContentTypeException(delegate);
            }
            if (delegate instanceof OutgoingContent.NoContent) {
                channel = ByteReadChannel.Companion.getEmpty();
            } else if (delegate instanceof OutgoingContent.ReadChannelContent) {
                channel = ((OutgoingContent.ReadChannelContent) delegate).readFrom();
            } else {
                if (!(delegate instanceof OutgoingContent.WriteChannelContent)) {
                    throw new t();
                }
                channel = CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, callContext, true, (p) new ObservableContent$content$1(this, null)).getChannel();
            }
        }
        this.content = channel;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.delegate.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Headers getHeaders() {
        return this.delegate.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(AttributeKey<T> key) {
        e0.checkNotNullParameter(key, "key");
        return (T) this.delegate.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.delegate.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom() {
        return ByteChannelUtilsKt.observable(this.content, this.callContext, getContentLength(), this.listener);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(AttributeKey<T> key, T t10) {
        e0.checkNotNullParameter(key, "key");
        this.delegate.setProperty(key, t10);
    }

    private static /* synthetic */ void getContent$annotations() {
    }
}
