package d2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j1.g;
import j1.x0;
import j1.y0;
import kotlin.jvm.internal.e0;
import p0.v;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final y0 imageResource(x0 x0Var, Resources res, int i10) throws Resources.NotFoundException {
        e0.checkNotNullParameter(x0Var, "<this>");
        e0.checkNotNullParameter(res, "res");
        Drawable drawable = res.getDrawable(i10, null);
        if (drawable == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        e0.checkNotNullExpressionValue(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return g.asImageBitmap(bitmap);
    }

    public static final y0 imageResource(x0 x0Var, int i10, w wVar, int i11) throws Resources.NotFoundException {
        e0.checkNotNullParameter(x0Var, "<this>");
        wVar.startReplaceableGroup(-304919470);
        Context context = (Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = new TypedValue();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) objRememberedValue;
        context.getResources().getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        e0.checkNotNull(charSequence);
        String string = charSequence.toString();
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(string);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
            Resources resources = context.getResources();
            e0.checkNotNullExpressionValue(resources, "context.resources");
            objRememberedValue2 = imageResource(x0Var, resources, i10);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        y0 y0Var = (y0) objRememberedValue2;
        wVar.endReplaceableGroup();
        return y0Var;
    }
}
