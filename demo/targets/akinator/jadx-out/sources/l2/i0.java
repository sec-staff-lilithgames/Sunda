package l2;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i0 {
    public static final y createFontFamilyResolver(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return new g0(new c(context), g.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    public static final y emptyCacheFontFamilyResolver(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return new g0(new c(context), null, new w1(), new m0(new o(), null, 2, null), null, 18, null);
    }

    public static final y createFontFamilyResolver(Context context, zu.m coroutineContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new g0(new c(context), g.AndroidFontResolveInterceptor(context), h0.getGlobalTypefaceRequestCache(), new m0(h0.getGlobalAsyncTypefaceCache(), coroutineContext), null, 16, null);
    }
}
