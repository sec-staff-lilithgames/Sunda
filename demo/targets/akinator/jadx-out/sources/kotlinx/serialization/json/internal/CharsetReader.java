package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.e0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CharsetReader {
    private final ByteBuffer byteBuffer;
    private final Charset charset;
    private final CharsetDecoder decoder;
    private boolean hasLeftoverPotentiallySurrogateChar;
    private final InputStream inputStream;
    private char leftoverChar;

    public CharsetReader(InputStream inputStream, Charset charset) {
        e0.checkNotNullParameter(inputStream, "inputStream");
        e0.checkNotNullParameter(charset, "charset");
        this.inputStream = inputStream;
        this.charset = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.decoder = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        this.byteBuffer = byteBufferWrap;
        byteBufferWrap.flip();
    }

    private final int doRead(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.decoder.decode(this.byteBuffer, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (fillByteBuffer() < 0) {
                        if (charBufferWrap.position() == 0 && !this.byteBuffer.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.decoder.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.decoder.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int fillByteBuffer() {
        this.byteBuffer.compact();
        try {
            int iLimit = this.byteBuffer.limit();
            int iPosition = this.byteBuffer.position();
            int i10 = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            e0.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            this.byteBuffer.flip();
            return this.byteBuffer.remaining();
        } finally {
            this.byteBuffer.flip();
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.hasLeftoverPotentiallySurrogateChar) {
            this.hasLeftoverPotentiallySurrogateChar = false;
            return this.leftoverChar;
        }
        char[] cArr = new char[2];
        int i10 = read(cArr, 0, 2);
        if (i10 == -1) {
            return -1;
        }
        if (i10 == 1) {
            return cArr[0];
        }
        if (i10 == 2) {
            this.leftoverChar = cArr[1];
            this.hasLeftoverPotentiallySurrogateChar = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + i10).toString());
    }

    public final int read(char[] array, int i10, int i11) {
        e0.checkNotNullParameter(array, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= array.length || i11 < 0 || i10 + i11 > array.length) {
            StringBuilder sbF = i.f(i10, i11, "Unexpected arguments: ", ", ", ", ");
            sbF.append(array.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        if (this.hasLeftoverPotentiallySurrogateChar) {
            array[i10] = this.leftoverChar;
            i10++;
            i11--;
            this.hasLeftoverPotentiallySurrogateChar = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return doRead(array, i10, i11) + i12;
        }
        int iOneShotReadSlowPath = oneShotReadSlowPath();
        if (iOneShotReadSlowPath != -1) {
            array[i10] = (char) iOneShotReadSlowPath;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void release() {
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.INSTANCE;
        byte[] bArrArray = this.byteBuffer.array();
        e0.checkNotNullExpressionValue(bArrArray, "array(...)");
        byteArrayPool8k.release(bArrArray);
    }
}
