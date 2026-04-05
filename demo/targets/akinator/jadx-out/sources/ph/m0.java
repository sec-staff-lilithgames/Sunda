package ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import mh.k1;
import mh.p1;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m0 {
    public static m0 concat(Iterable<? extends m0> iterable) {
        return new j0(iterable);
    }

    public static m0 empty() {
        return k0.f81319c;
    }

    public static m0 wrap(CharSequence charSequence) {
        return charSequence instanceof String ? new l0((String) charSequence) : new i0(charSequence);
    }

    public z asByteSource(Charset charset) {
        return new h0(this, charset);
    }

    public long copyTo(Appendable appendable) throws Throwable {
        p1.checkNotNull(appendable);
        try {
            return o0.copy((Reader) s0.create().register(openStream()), appendable);
        } finally {
        }
    }

    public void forEachLine(Consumer<? super String> consumer) throws IOException {
        try {
            Stream<String> streamLines = lines();
            try {
                streamLines.forEachOrdered(consumer);
                streamLines.close();
            } finally {
            }
        } catch (UncheckedIOException e10) {
            throw e10.getCause();
        }
    }

    public boolean isEmpty() throws Throwable {
        k1 k1VarLengthIfKnown = lengthIfKnown();
        if (k1VarLengthIfKnown.isPresent()) {
            return ((Long) k1VarLengthIfKnown.get()).longValue() == 0;
        }
        try {
            return ((Reader) s0.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public long length() throws Throwable {
        k1 k1VarLengthIfKnown = lengthIfKnown();
        if (k1VarLengthIfKnown.isPresent()) {
            return ((Long) k1VarLengthIfKnown.get()).longValue();
        }
        try {
            Reader reader = (Reader) s0.create().register(openStream());
            long j10 = 0;
            while (true) {
                long jSkip = reader.skip(Long.MAX_VALUE);
                if (jSkip == 0) {
                    return j10;
                }
                j10 += jSkip;
            }
        } finally {
        }
    }

    public k1 lengthIfKnown() {
        return k1.absent();
    }

    public Stream<String> lines() throws IOException {
        BufferedReader bufferedReaderOpenBufferedStream = openBufferedStream();
        return (Stream) bufferedReaderOpenBufferedStream.lines().onClose(new on.w(bufferedReaderOpenBufferedStream, 3));
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader readerOpenStream = openStream();
        return readerOpenStream instanceof BufferedReader ? (BufferedReader) readerOpenStream : new BufferedReader(readerOpenStream);
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws Throwable {
        try {
            return o0.toString((Reader) s0.create().register(openStream()));
        } finally {
        }
    }

    public String readFirstLine() throws Throwable {
        try {
            return ((BufferedReader) s0.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public b5 readLines() throws Throwable {
        try {
            BufferedReader bufferedReader = (BufferedReader) s0.create().register(openBufferedStream());
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return b5.copyOf((Collection) arrayList);
                }
                arrayList.add(line);
            }
        } finally {
        }
    }

    public static m0 concat(Iterator<? extends m0> it) {
        return concat(b5.copyOf(it));
    }

    public static m0 concat(m0... m0VarArr) {
        return concat(b5.copyOf(m0VarArr));
    }

    public long copyTo(g0 g0Var) throws Throwable {
        p1.checkNotNull(g0Var);
        s0 s0VarCreate = s0.create();
        try {
            return o0.copy((Reader) s0VarCreate.register(openStream()), (Writer) s0VarCreate.register(g0Var.openStream()));
        } finally {
        }
    }

    public <T> T readLines(t0 t0Var) throws Throwable {
        p1.checkNotNull(t0Var);
        try {
            return (T) o0.readLines((Reader) s0.create().register(openStream()), t0Var);
        } finally {
        }
    }
}
