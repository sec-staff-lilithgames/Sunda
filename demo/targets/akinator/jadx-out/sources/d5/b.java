package d5;

import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.n3;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static void enableDebugLogging(boolean z10) {
        g.f51861c = z10;
    }

    public static <T extends b1 & n3> b getInstance(T t10) {
        return new g(t10, t10.getViewModelStore());
    }

    public abstract void destroyLoader(int i10);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> e5.c getLoader(int i10);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> e5.c initLoader(int i10, Bundle bundle, a aVar);

    public abstract void markForRedelivery();

    public abstract <D> e5.c restartLoader(int i10, Bundle bundle, a aVar);
}
