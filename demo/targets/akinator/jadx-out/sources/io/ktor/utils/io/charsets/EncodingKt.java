package io.ktor.utils.io.charsets;

import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.internal.CharArraySequence;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class EncodingKt {
    public static final String decode(CharsetDecoder charsetDecoder, Input input, int i10) {
        e0.checkNotNullParameter(charsetDecoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, sizeEstimate(input)));
        CharsetJVMKt.decode(charsetDecoder, input, sb2, i10);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String decode$default(CharsetDecoder charsetDecoder, Input input, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return decode(charsetDecoder, input, i10);
    }

    @f
    public static final void encode(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11, Output output) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(output, KGUkpTlXZlJLy.GgVlC);
        encodeToImpl(charsetEncoder, output, input, i10, i11);
    }

    public static /* synthetic */ ByteReadPacket encode$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return encode(charsetEncoder, charSequence, i10, i11);
    }

    public static final int encodeArrayImpl(CharsetEncoder charsetEncoder, char[] input, int i10, int i11, Buffer dst) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(dst, "dst");
        int i12 = i11 - i10;
        return CharsetJVMKt.encodeImpl(charsetEncoder, new CharArraySequence(input, i10, i12), 0, i12, dst);
    }

    private static final int encodeCompleteImpl(CharsetEncoder charsetEncoder, Output output) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        int i10 = 1;
        int limit = 0;
        while (true) {
            try {
                int limit2 = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                i10 = CharsetJVMKt.encodeComplete(charsetEncoder, chunkBufferPrepareWriteHead) ? 0 : i10 + 1;
                limit += limit2 - (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                if (i10 <= 0) {
                    return limit;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    @f
    public static final byte[] encodeToByteArrayImpl(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        return CharsetJVMKt.encodeToByteArray(charsetEncoder, input, i10, i11);
    }

    public static /* synthetic */ byte[] encodeToByteArrayImpl$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return encodeToByteArrayImpl(charsetEncoder, charSequence, i10, i11);
    }

    public static final int encodeToImpl(CharsetEncoder charsetEncoder, Output destination, CharSequence input, int i10, int i11) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        e0.checkNotNullParameter(input, "input");
        if (i10 >= i11) {
            return 0;
        }
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(destination, 1, null);
        int limit = 0;
        while (true) {
            try {
                int limit2 = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                int iEncodeImpl = CharsetJVMKt.encodeImpl(charsetEncoder, input, i10, i11, chunkBufferPrepareWriteHead);
                if (iEncodeImpl < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i10 += iEncodeImpl;
                limit += limit2 - (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                int i12 = i10 >= i11 ? 0 : iEncodeImpl == 0 ? 8 : 1;
                if (i12 <= 0) {
                    destination.afterHeadWrite();
                    return limit + encodeCompleteImpl(charsetEncoder, destination);
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(destination, i12, chunkBufferPrepareWriteHead);
            } catch (Throwable th2) {
                destination.afterHeadWrite();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ByteReadPacket encodeUTF8(CharsetEncoder charsetEncoder, ByteReadPacket input) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            CharsetJVMKt.encodeUTF8(charsetEncoder, input, bytePacketBuilder);
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final long sizeEstimate(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return input instanceof ByteReadPacket ? input.getRemaining() : Math.max(input.getRemaining(), 16L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ByteReadPacket encode(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            encodeToImpl(charsetEncoder, bytePacketBuilder, input, i10, i11);
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final void encode(CharsetEncoder charsetEncoder, char[] input, int i10, int i11, Output dst) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(dst, "dst");
        if (i10 >= i11) {
            return;
        }
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, null);
        while (true) {
            try {
                int iEncodeArrayImpl = encodeArrayImpl(charsetEncoder, input, i10, i11, chunkBufferPrepareWriteHead);
                if (iEncodeArrayImpl < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i10 += iEncodeArrayImpl;
                int i12 = i10 >= i11 ? 0 : iEncodeArrayImpl == 0 ? 8 : 1;
                if (i12 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, i12, chunkBufferPrepareWriteHead);
                } else {
                    dst.afterHeadWrite();
                    encodeCompleteImpl(charsetEncoder, dst);
                    return;
                }
            } catch (Throwable th2) {
                dst.afterHeadWrite();
                throw th2;
            }
        }
    }
}
