package io.ktor.util.cio;

import av.e;
import com.applovin.shadow.okio.Segment;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import sv.g;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OutputStreamAdaptersKt {
    public static final BufferedWriter bufferedWriter(ByteWriteChannel byteWriteChannel, Charset charset) {
        e0.checkNotNullParameter(byteWriteChannel, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(BlockingKt.toOutputStream$default(byteWriteChannel, null, 1, null), charset), Segment.SIZE);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(ByteWriteChannel byteWriteChannel, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        return bufferedWriter(byteWriteChannel, charset);
    }

    @f
    public static final Object write(ByteWriteChannel byteWriteChannel, String str, Charset charset, d<? super x0> dVar) {
        byte[] bytes = str.getBytes(charset);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Object objWriteFully = ByteWriteChannelKt.writeFully(byteWriteChannel, bytes, dVar);
        return objWriteFully == e.getCOROUTINE_SUSPENDED() ? objWriteFully : x0.f87415a;
    }

    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, String str, Charset charset, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = g.f86134b;
        }
        return write(byteWriteChannel, str, charset, dVar);
    }

    public static final Writer writer(ByteWriteChannel byteWriteChannel, Charset charset) {
        e0.checkNotNullParameter(byteWriteChannel, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(BlockingKt.toOutputStream$default(byteWriteChannel, null, 1, null), charset);
    }

    public static /* synthetic */ Writer writer$default(ByteWriteChannel byteWriteChannel, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        return writer(byteWriteChannel, charset);
    }
}
