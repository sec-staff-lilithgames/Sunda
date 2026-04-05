package a2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f3664a = new j1();

    public final Typeface create(Context context, int i10) throws Resources.NotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Typeface font = context.getResources().getFont(i10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(font, "context.resources.getFont(resourceId)");
        return font;
    }
}
