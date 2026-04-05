package io.ktor.utils.io;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ChannelScope implements ReaderScope, WriterScope, CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    private final ByteChannel channel;

    public ChannelScope(CoroutineScope delegate, ByteChannel channel) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.$$delegate_0 = delegate;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.utils.io.WriterScope
    public ByteChannel getChannel() {
        return this.channel;
    }
}
