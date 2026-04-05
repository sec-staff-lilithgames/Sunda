package io.ktor.client.request;

import av.e;
import io.ktor.http.Headers;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.InternalAPI;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteWriteChannel;
import tu.o;
import tu.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
/* loaded from: classes7.dex */
public abstract class ClientUpgradeContent extends OutgoingContent.NoContent {
    private final o content$delegate = q.lazy(ClientUpgradeContent$content$2.INSTANCE);

    private final ByteChannel getContent() {
        return (ByteChannel) this.content$delegate.getValue();
    }

    public final ByteWriteChannel getOutput() {
        return getContent();
    }

    public final Object pipeTo(ByteWriteChannel byteWriteChannel, d<? super x0> dVar) {
        Object objCopyAndClose$default = ByteReadChannelKt.copyAndClose$default(getContent(), byteWriteChannel, 0L, dVar, 2, null);
        return objCopyAndClose$default == e.getCOROUTINE_SUSPENDED() ? objCopyAndClose$default : x0.f87415a;
    }

    public abstract void verify(Headers headers);
}
