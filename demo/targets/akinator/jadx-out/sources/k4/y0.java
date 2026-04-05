package k4;

import android.os.Build;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y0 {
    public static final boolean atomicMoveTo(File file, File toFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? b.f70280a.move(file, toFile) : file.renameTo(toFile);
    }
}
