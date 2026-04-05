package gv;

import com.applovin.shadow.okio.Segment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o extends m {
    public static void appendBytes(File file, byte[] array) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            d.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void appendText(File file, String text, Charset charset) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            writeTextImpl(fileOutputStream, text, charset);
            d.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = sv.g.f86134b;
        }
        appendText(file, str, charset);
    }

    public static ByteBuffer byteBufferForEncoding(int i10, CharsetEncoder encoder) {
        e0.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        e0.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void forEachBlock(File file, kv.p action) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(action, "action");
        forEachBlock(file, 4096, action);
    }

    public static final void forEachLine(File file, Charset charset, kv.l action) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        e0.checkNotNullParameter(action, "action");
        y.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = sv.g.f86134b;
        }
        forEachLine(file, charset, lVar);
    }

    public static CharsetEncoder newReplaceEncoder(Charset charset) {
        e0.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final byte[] readBytes(File file) {
        e0.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrCopyInto = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrCopyInto, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i12);
                e0.checkNotNullExpressionValue(bArrCopyInto, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    f fVar = new f(8193);
                    fVar.write(i14);
                    c.copyTo$default(fileInputStream, fVar, 0, 2, null);
                    int size = fVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = fVar.getBuffer();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrCopyInto, size);
                    e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    bArrCopyInto = f0.copyInto(buffer, bArrCopyOf, i10, 0, fVar.size());
                }
            }
            d.closeFinally(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.closeFinally(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static final List<String> readLines(File file, Charset charset) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new n(0, arrayList));
        return arrayList;
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = sv.g.f86134b;
        }
        return readLines(file, charset);
    }

    public static final String readText(File file, Charset charset) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String text = y.readText(inputStreamReader);
            d.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = sv.g.f86134b;
        }
        return readText(file, charset);
    }

    public static final <T> T useLines(File file, Charset charset, kv.l block) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        e0.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), Segment.SIZE);
        try {
            T t10 = (T) block.invoke(y.lineSequence(bufferedReader));
            b0.finallyStart(1);
            d.closeFinally(bufferedReader, null);
            b0.finallyEnd(1);
            return t10;
        } finally {
        }
    }

    public static /* synthetic */ Object useLines$default(File file, Charset charset, kv.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = sv.g.f86134b;
        }
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        e0.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), Segment.SIZE);
        try {
            Object objInvoke = block.invoke(y.lineSequence(bufferedReader));
            b0.finallyStart(1);
            d.closeFinally(bufferedReader, null);
            b0.finallyEnd(1);
            return objInvoke;
        } finally {
        }
    }

    public static void writeBytes(File file, byte[] array) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            d.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static void writeText(File file, String text, Charset charset) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTextImpl(fileOutputStream, text, charset);
            d.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = sv.g.f86134b;
        }
        writeText(file, str, charset);
    }

    public static void writeTextImpl(OutputStream outputStream, String text, Charset charset) throws IOException {
        e0.checkNotNullParameter(outputStream, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewReplaceEncoder = newReplaceEncoder(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(Segment.SIZE);
        e0.checkNotNull(charsetEncoderNewReplaceEncoder);
        ByteBuffer byteBufferByteBufferForEncoding = byteBufferForEncoding(Segment.SIZE, charsetEncoderNewReplaceEncoder);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            e0.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderNewReplaceEncoder.encode(charBufferAllocate, byteBufferByteBufferForEncoding, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferByteBufferForEncoding.array(), 0, byteBufferByteBufferForEncoding.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferByteBufferForEncoding.clear();
            i10 = i12;
        }
    }

    public static final void forEachBlock(File file, int i10, kv.p action) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(action, "action");
        byte[] bArr = new byte[qv.v.coerceAtLeast(i10, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    d.closeFinally(fileInputStream, null);
                    return;
                }
                action.invoke(bArr, Integer.valueOf(i11));
            } finally {
            }
        }
    }
}
