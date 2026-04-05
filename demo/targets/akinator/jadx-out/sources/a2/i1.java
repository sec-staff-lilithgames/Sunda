package a2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 implements l2.v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3650a;

    public i1(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f3650a = context;
    }

    @Override // l2.v
    @tu.f
    public Typeface load(l2.w font) throws Resources.NotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        if (!(font instanceof l2.p1)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f3650a;
        if (i10 >= 26) {
            return j1.f3664a.create(context, ((l2.p1) font).getResId());
        }
        Typeface font2 = n3.p.getFont(context, ((l2.p1) font).getResId());
        kotlin.jvm.internal.e0.checkNotNull(font2);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(font2, "{\n                    Re…esId)!!\n                }");
        return font2;
    }
}
