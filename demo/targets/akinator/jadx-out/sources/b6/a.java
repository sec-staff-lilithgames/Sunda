package b6;

import android.util.Log;
import j1.o2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0012a f8758e = new C0012a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f8759f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8760a;

    /* renamed from: b, reason: collision with root package name */
    public final File f8761b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f8762c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f8763d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: b6.a$a, reason: collision with other inner class name */
    public static final class C0012a {
        public C0012a(u uVar) {
        }

        public static final Lock access$getThreadLock(C0012a c0012a, String str) {
            Lock lock;
            c0012a.getClass();
            synchronized (a.f8759f) {
                try {
                    Map map = a.f8759f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }
    }

    public a(String name, File file, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        this.f8760a = z10;
        this.f8761b = file != null ? new File(file, o2.l(name, ".lck")) : null;
        this.f8762c = C0012a.access$getThreadLock(f8758e, name);
    }

    public static /* synthetic */ void lock$default(a aVar, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = aVar.f8760a;
        }
        aVar.lock(z10);
    }

    public final void lock(boolean z10) throws IOException {
        this.f8762c.lock();
        if (z10) {
            File file = this.f8761b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f8763d = channel;
            } catch (IOException e10) {
                this.f8763d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void unlock() throws IOException {
        try {
            FileChannel fileChannel = this.f8763d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f8762c.unlock();
    }
}
