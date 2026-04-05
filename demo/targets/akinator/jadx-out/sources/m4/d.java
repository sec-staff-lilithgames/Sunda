package m4;

import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final boolean deleteSharedPreferences(Context context, String name) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
