package io.ktor.util;

import i2.hQ.aTNDubNmpwAqdU;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Identity implements Encoder {
    public static final Identity INSTANCE = new Identity();

    private Identity() {
    }

    @Override // io.ktor.util.Encoder
    public ByteReadChannel encode(CoroutineScope coroutineScope, ByteReadChannel source) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(source, "source");
        return source;
    }

    @Override // io.ktor.util.Encoder
    public ByteReadChannel decode(CoroutineScope coroutineScope, ByteReadChannel source) {
        e0.checkNotNullParameter(coroutineScope, aTNDubNmpwAqdU.mbJQ);
        e0.checkNotNullParameter(source, "source");
        return source;
    }
}
