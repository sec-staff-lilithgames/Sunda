package k6;

import android.content.Context;
import l6.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static boolean isFeatureSupported(String str) {
        return t0.isSupported(str);
    }

    public static boolean isStartupFeatureSupported(Context context, String str) {
        return t0.isStartupFeatureSupported(str, context);
    }
}
