package k4;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {
    public static final l1 createSingleProcessCoordinator(File file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return m1.createSingleProcessCoordinator(absolutePath);
    }
}
