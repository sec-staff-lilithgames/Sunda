package io.ktor.utils.io;

import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteReadChannel$Companion$Empty$2 extends f0 implements a {
    public static final ByteReadChannel$Companion$Empty$2 INSTANCE = new ByteReadChannel$Companion$Empty$2();

    public ByteReadChannel$Companion$Empty$2() {
        super(0);
    }

    @Override // kv.a
    public final ByteChannel invoke() {
        ByteChannel byteChannelByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
        ByteWriteChannelKt.close(byteChannelByteChannel$default);
        return byteChannelByteChannel$default;
    }
}
