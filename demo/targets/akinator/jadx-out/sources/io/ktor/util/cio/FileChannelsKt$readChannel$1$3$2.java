package io.ktor.util.cio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FileChannelsKt$readChannel$1$3$2 extends f0 implements l {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ FileChannel $fileChannel;
    final /* synthetic */ a1 $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$readChannel$1$3$2(long j10, a1 a1Var, FileChannel fileChannel) {
        super(1);
        this.$endInclusive = j10;
        this.$position = a1Var;
        this.$fileChannel = fileChannel;
    }

    @Override // kv.l
    public final Boolean invoke(ByteBuffer buffer) throws IOException {
        int i10;
        e0.checkNotNullParameter(buffer, "buffer");
        long j10 = (this.$endInclusive - this.$position.f71813b) + 1;
        if (j10 < buffer.remaining()) {
            int iLimit = buffer.limit();
            buffer.limit(buffer.position() + ((int) j10));
            i10 = this.$fileChannel.read(buffer);
            buffer.limit(iLimit);
        } else {
            i10 = this.$fileChannel.read(buffer);
        }
        if (i10 > 0) {
            this.$position.f71813b += i10;
        }
        return Boolean.valueOf(i10 != -1 && this.$position.f71813b <= this.$endInclusive);
    }
}
