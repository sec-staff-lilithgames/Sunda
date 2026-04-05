package k4;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f70366b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final NativeSharedCounter f70367c = new NativeSharedCounter();

    /* renamed from: a, reason: collision with root package name */
    public final long f70368a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final i2 a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd = parcelFileDescriptor.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new i2(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        public final i2 create$datastore_core_release(kv.a produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            kotlin.jvm.internal.e0.checkNotNullParameter(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                try {
                    i2 i2VarA = a(parcelFileDescriptorOpen);
                    parcelFileDescriptorOpen.close();
                    return i2VarA;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptorOpen = null;
            }
        }

        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return i2.f70367c;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }
    }

    public i2(long j10, kotlin.jvm.internal.u uVar) {
        this.f70368a = j10;
    }

    public final int getValue() {
        return f70367c.nativeGetCounterValue(this.f70368a);
    }

    public final int incrementAndGetValue() {
        return f70367c.nativeIncrementAndGetCounterValue(this.f70368a);
    }
}
