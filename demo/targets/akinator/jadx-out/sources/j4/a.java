package j4;

import a.b;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final File dataStoreFile(Context context, String fileName) {
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), b.k("datastore/", fileName));
    }
}
