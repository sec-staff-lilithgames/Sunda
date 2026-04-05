package l2;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {
    @tu.f
    public static final y createFontFamilyResolver(v fontResourceLoader, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontResourceLoader, "fontResourceLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return new g0(new r(fontResourceLoader, applicationContext), null, null, null, null, 30, null);
    }

    @tu.f
    public static final y createFontFamilyResolver(v fontResourceLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontResourceLoader, "fontResourceLoader");
        return new g0(new s(fontResourceLoader), null, null, null, null, 30, null);
    }
}
