package p5;

import j1.o2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f80684a;

    /* renamed from: b, reason: collision with root package name */
    public FileChannel f80685b;

    public c(String filename) {
        e0.checkNotNullParameter(filename, "filename");
        this.f80684a = o2.l(filename, ".lck");
    }

    public final void lock() throws IOException {
        String str = this.f80684a;
        if (this.f80685b != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f80685b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = this.f80685b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f80685b = null;
            throw new IllegalStateException(a.b.l("Unable to lock file: '", str, "'."), th2);
        }
    }

    public final void unlock() {
        FileChannel fileChannel = this.f80685b;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.f80685b = null;
        }
    }
}
