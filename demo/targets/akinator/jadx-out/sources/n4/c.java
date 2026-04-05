package n4;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final File preferencesDataStoreFile(Context context, String name) {
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(name, "name");
        return j4.a.dataStoreFile(context, name + ".preferences_pb");
    }
}
