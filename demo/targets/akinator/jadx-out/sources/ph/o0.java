package ph;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o0 {
    public static Writer asWriter(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static long copy(Readable readable, Appendable appendable) throws IOException {
        long jRemaining = 0;
        if (!(readable instanceof Reader)) {
            p1.checkNotNull(readable);
            p1.checkNotNull(appendable);
            CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
            while (readable.read(charBufferAllocate) != -1) {
                charBufferAllocate.flip();
                appendable.append(charBufferAllocate);
                jRemaining += charBufferAllocate.remaining();
                charBufferAllocate.clear();
            }
            return jRemaining;
        }
        if (appendable instanceof StringBuilder) {
            Reader reader = (Reader) readable;
            StringBuilder sb2 = (StringBuilder) appendable;
            p1.checkNotNull(reader);
            p1.checkNotNull(sb2);
            char[] cArr = new char[2048];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 == -1) {
                    return jRemaining;
                }
                sb2.append(cArr, 0, i10);
                jRemaining += i10;
            }
        } else {
            Reader reader2 = (Reader) readable;
            Writer writerAsWriter = asWriter(appendable);
            p1.checkNotNull(reader2);
            p1.checkNotNull(writerAsWriter);
            char[] cArr2 = new char[2048];
            while (true) {
                int i11 = reader2.read(cArr2);
                if (i11 == -1) {
                    return jRemaining;
                }
                writerAsWriter.write(cArr2, 0, i11);
                jRemaining += i11;
            }
        }
    }

    public static long exhaust(Readable readable) throws IOException {
        CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
        long j10 = 0;
        while (true) {
            long j11 = readable.read(charBufferAllocate);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            charBufferAllocate.clear();
        }
    }

    public static Writer nullWriter() {
        return n0.f81336b;
    }

    public static List<String> readLines(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        u0 u0Var = new u0(readable);
        while (true) {
            String line = u0Var.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static void skipFully(Reader reader, long j10) throws IOException {
        p1.checkNotNull(reader);
        while (j10 > 0) {
            long jSkip = reader.skip(j10);
            if (jSkip == 0) {
                throw new EOFException();
            }
            j10 -= jSkip;
        }
    }

    public static String toString(Readable readable) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            p1.checkNotNull(reader);
            p1.checkNotNull(sb2);
            char[] cArr = new char[2048];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 == -1) {
                    break;
                }
                sb2.append(cArr, 0, i10);
            }
        } else {
            copy(readable, sb2);
        }
        return sb2.toString();
    }

    public static <T> T readLines(Readable readable, t0 t0Var) throws IOException {
        p1.checkNotNull(readable);
        p1.checkNotNull(t0Var);
        u0 u0Var = new u0(readable);
        while (u0Var.readLine() != null && t0Var.a()) {
        }
        return (T) t0Var.getResult();
    }
}
