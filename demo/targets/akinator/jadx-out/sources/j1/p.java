package j1;

import android.graphics.Path;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Multi-variable type inference failed */
    public static final l1 Path() {
        return new l(null, 1, 0 == true ? 1 : 0);
    }

    public static final Path asAndroidPath(l1 l1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        if (l1Var instanceof l) {
            return ((l) l1Var).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final l1 asComposePath(Path path) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "<this>");
        return new l(path);
    }
}
