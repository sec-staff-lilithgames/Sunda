package y5;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final File getNoBackupFilesDir(Context context) {
        e0.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        e0.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return noBackupFilesDir;
    }
}
