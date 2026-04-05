package ph;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.stream.Stream;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g0 {
    public final void a(Iterator it, String str) throws IOException {
        p1.checkNotNull(str);
        Writer writerOpenBufferedStream = openBufferedStream();
        while (it.hasNext()) {
            try {
                writerOpenBufferedStream.append((CharSequence) it.next()).append((CharSequence) str);
            } catch (Throwable th2) {
                if (writerOpenBufferedStream != null) {
                    try {
                        writerOpenBufferedStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (writerOpenBufferedStream != null) {
            writerOpenBufferedStream.close();
        }
    }

    public Writer openBufferedStream() throws IOException {
        Writer writerOpenStream = openStream();
        return writerOpenStream instanceof BufferedWriter ? (BufferedWriter) writerOpenStream : new BufferedWriter(writerOpenStream);
    }

    public abstract Writer openStream() throws IOException;

    public void write(CharSequence charSequence) throws IOException {
        p1.checkNotNull(charSequence);
        Writer writerOpenStream = openStream();
        try {
            writerOpenStream.append(charSequence);
            writerOpenStream.close();
        } catch (Throwable th2) {
            if (writerOpenStream != null) {
                try {
                    writerOpenStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public long writeFrom(Readable readable) throws IOException {
        p1.checkNotNull(readable);
        Writer writerOpenStream = openStream();
        try {
            long jCopy = o0.copy(readable, writerOpenStream);
            if (writerOpenStream != null) {
                writerOpenStream.close();
            }
            return jCopy;
        } catch (Throwable th2) {
            if (writerOpenStream != null) {
                try {
                    writerOpenStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void writeLines(Iterable<? extends CharSequence> iterable) throws IOException {
        writeLines(iterable, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws IOException {
        a(iterable.iterator(), str);
    }

    public void writeLines(Stream<? extends CharSequence> stream, String str) throws IOException {
        a(stream.iterator(), str);
    }

    public void writeLines(Stream<? extends CharSequence> stream) throws IOException {
        String str;
        switch (25) {
            case 1:
                str = "java.version";
                break;
            case 2:
                str = "java.vendor";
                break;
            case 3:
                str = "java.vendor.url";
                break;
            case 4:
                str = "java.home";
                break;
            case 5:
                str = "java.vm.specification.version";
                break;
            case 6:
                str = "java.vm.specification.vendor";
                break;
            case 7:
                str = "java.vm.specification.name";
                break;
            case 8:
                str = "java.vm.version";
                break;
            case 9:
                str = "java.vm.vendor";
                break;
            case 10:
                str = "java.vm.name";
                break;
            case 11:
                str = "java.specification.version";
                break;
            case 12:
                str = "java.specification.vendor";
                break;
            case 13:
                str = "java.specification.name";
                break;
            case 14:
                str = "java.class.version";
                break;
            case 15:
                str = "java.class.path";
                break;
            case 16:
                str = "java.library.path";
                break;
            case 17:
                str = "java.io.tmpdir";
                break;
            case 18:
                str = "java.compiler";
                break;
            case 19:
                str = "java.ext.dirs";
                break;
            case 20:
                str = "os.name";
                break;
            case 21:
                str = "os.arch";
                break;
            case 22:
                str = "os.version";
                break;
            case 23:
                str = "file.separator";
                break;
            case 24:
                str = "path.separator";
                break;
            case 25:
                str = "line.separator";
                break;
            case 26:
                str = "user.name";
                break;
            case 27:
                str = "user.home";
                break;
            case 28:
                str = "user.dir";
                break;
            default:
                throw null;
        }
        writeLines(stream, System.getProperty(str));
    }
}
