package l2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f72359a = new q1();

    public final Typeface load(Context context, p1 font) throws Resources.NotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        Typeface font2 = context.getResources().getFont(font.getResId());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(font2, "context.resources.getFont(font.resId)");
        return font2;
    }
}
