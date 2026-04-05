package z8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import n3.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f97695a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f97695a) {
                return b(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return m3.a.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f97695a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return p.getDrawable(context2.getResources(), i10, theme);
    }

    public static Drawable b(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            o.e eVar = new o.e(context, theme);
            eVar.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = eVar;
        }
        return l.a.getDrawable(context, i10);
    }

    public static Drawable getDrawable(Context context, Context context2, int i10) {
        return a(context, context2, i10, null);
    }

    public static Drawable getDrawable(Context context, int i10, Resources.Theme theme) {
        return a(context, context, i10, theme);
    }
}
