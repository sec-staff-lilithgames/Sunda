package l2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static final Typeface access$load(p1 p1Var, Context context) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.f72359a.load(context, p1Var);
        }
        Typeface font = n3.p.getFont(context, p1Var.getResId());
        kotlin.jvm.internal.e0.checkNotNull(font);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(font, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return font;
    }
}
