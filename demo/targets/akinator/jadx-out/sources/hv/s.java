package hv;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s {
    public static final void appendText(Path path, CharSequence text, Charset charset) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        writeText(path, text, charset, StandardOpenOption.APPEND);
    }

    public static /* synthetic */ void appendText$default(Path path, CharSequence charSequence, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = sv.g.f86134b;
        }
        appendText(path, charSequence, charset);
    }

    public static final String readText(Path path, Charset charset) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String text = gv.y.readText(inputStreamReader);
            gv.d.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = sv.g.f86134b;
        }
        return readText(path, charset);
    }

    public static final void writeText(Path path, CharSequence text, Charset charset, OpenOption... options) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        e0.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        try {
            if (text instanceof String) {
                e0.checkNotNull(outputStreamNewOutputStream);
                gv.o.writeTextImpl(outputStreamNewOutputStream, (String) text, charset);
            } else {
                CharsetEncoder charsetEncoderNewReplaceEncoder = gv.o.newReplaceEncoder(charset);
                CharBuffer charBufferAsReadOnlyBuffer = text instanceof CharBuffer ? ((CharBuffer) text).asReadOnlyBuffer() : CharBuffer.wrap(text);
                int iMin = Math.min(text.length(), Segment.SIZE);
                e0.checkNotNull(charsetEncoderNewReplaceEncoder);
                ByteBuffer byteBufferByteBufferForEncoding = gv.o.byteBufferForEncoding(iMin, charsetEncoderNewReplaceEncoder);
                while (charBufferAsReadOnlyBuffer.hasRemaining()) {
                    if (charsetEncoderNewReplaceEncoder.encode(charBufferAsReadOnlyBuffer, byteBufferByteBufferForEncoding, true).isError()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    outputStreamNewOutputStream.write(byteBufferByteBufferForEncoding.array(), 0, byteBufferByteBufferForEncoding.position());
                    byteBufferByteBufferForEncoding.clear();
                }
            }
            gv.d.closeFinally(outputStreamNewOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                gv.d.closeFinally(outputStreamNewOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void writeText$default(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = sv.g.f86134b;
        }
        writeText(path, charSequence, charset, openOptionArr);
    }
}
