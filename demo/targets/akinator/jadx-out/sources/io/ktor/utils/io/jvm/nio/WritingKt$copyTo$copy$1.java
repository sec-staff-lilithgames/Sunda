package io.ktor.utils.io.jvm.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WritingKt$copyTo$copy$1 extends f0 implements l {
    final /* synthetic */ WritableByteChannel $channel;
    final /* synthetic */ a1 $copied;
    final /* synthetic */ long $limit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingKt$copyTo$copy$1(long j10, a1 a1Var, WritableByteChannel writableByteChannel) {
        super(1);
        this.$limit = j10;
        this.$copied = a1Var;
        this.$channel = writableByteChannel;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
        invoke((ByteBuffer) obj);
        return x0.f87415a;
    }

    public final void invoke(ByteBuffer bb2) throws IOException {
        e0.checkNotNullParameter(bb2, "bb");
        long j10 = this.$limit - this.$copied.f71813b;
        if (j10 >= bb2.remaining()) {
            long jWrite = 0;
            while (bb2.hasRemaining()) {
                jWrite += this.$channel.write(bb2);
            }
            this.$copied.f71813b += jWrite;
            return;
        }
        int iLimit = bb2.limit();
        bb2.limit(bb2.position() + ((int) j10));
        while (bb2.hasRemaining()) {
            this.$channel.write(bb2);
        }
        bb2.limit(iLimit);
        this.$copied.f71813b += j10;
    }
}
