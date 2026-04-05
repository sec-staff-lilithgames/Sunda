package l2;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {
    public static final f AndroidFontResolveInterceptor(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return new f(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
