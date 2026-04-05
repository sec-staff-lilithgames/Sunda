package io.ktor.utils.io.jvm.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReadingKt$copyTo$copy$1 extends f0 implements l {
    final /* synthetic */ a1 $copied;
    final /* synthetic */ w0 $eof;
    final /* synthetic */ long $limit;
    final /* synthetic */ ReadableByteChannel $this_copyTo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadingKt$copyTo$copy$1(long j10, a1 a1Var, ReadableByteChannel readableByteChannel, w0 w0Var) {
        super(1);
        this.$limit = j10;
        this.$copied = a1Var;
        this.$this_copyTo = readableByteChannel;
        this.$eof = w0Var;
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
            int i10 = this.$this_copyTo.read(bb2);
            if (i10 == -1) {
                this.$eof.f71863b = true;
                return;
            } else {
                this.$copied.f71813b += i10;
                return;
            }
        }
        int iLimit = bb2.limit();
        bb2.limit(bb2.position() + ((int) j10));
        int i11 = this.$this_copyTo.read(bb2);
        if (i11 == -1) {
            this.$eof.f71863b = true;
        } else {
            this.$copied.f71813b += i11;
        }
        bb2.limit(iLimit);
    }
}
