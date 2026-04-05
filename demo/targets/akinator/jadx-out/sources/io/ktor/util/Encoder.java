package io.ktor.util;

import io.ktor.utils.io.ByteReadChannel;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Encoder {
    ByteReadChannel decode(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel);

    ByteReadChannel encode(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel);
}
