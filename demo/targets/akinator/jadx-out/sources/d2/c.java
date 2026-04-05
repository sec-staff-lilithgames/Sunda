package d2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d2.b;
import j1.x0;
import j1.y0;
import kotlin.jvm.internal.e0;
import n1.i1;
import p0.v;
import p0.w;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final m1.e painterResource(int i10, w wVar, int i11) {
        m1.e eVarRememberVectorPainter;
        wVar.startReplaceableGroup(473971343);
        Context context = (Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources res = context.getResources();
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = new TypedValue();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) objRememberedValue;
        res.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !n0.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null)) {
            wVar.startReplaceableGroup(-738265196);
            Object objValueOf = Integer.valueOf(i10);
            wVar.startReplaceableGroup(511388516);
            boolean zChanged = wVar.changed(objValueOf) | wVar.changed(charSequence);
            Object objRememberedValue2 = wVar.rememberedValue();
            if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
                e0.checkNotNullExpressionValue(res, "res");
                objRememberedValue2 = a.imageResource(x0.f69046a, res, i10);
                wVar.updateRememberedValue(objRememberedValue2);
            }
            wVar.endReplaceableGroup();
            m1.a aVar = new m1.a((y0) objRememberedValue2, 0L, 0L, 6, null);
            wVar.endReplaceableGroup();
            eVarRememberVectorPainter = aVar;
        } else {
            wVar.startReplaceableGroup(-738265321);
            Resources.Theme theme = context.getTheme();
            e0.checkNotNullExpressionValue(theme, "context.theme");
            e0.checkNotNullExpressionValue(res, "res");
            wVar.startReplaceableGroup(2112503116);
            b bVar = (b) wVar.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
            b.C0554b c0554b = new b.C0554b(theme, i10);
            b.a aVarLoadVectorResourceInner = bVar.get(c0554b);
            if (aVarLoadVectorResourceInner == null) {
                XmlResourceParser xml = res.getXml(i10);
                e0.checkNotNullExpressionValue(xml, "res.getXml(id)");
                if (!e0.areEqual(o1.c.seekToStartTag(xml).getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
                aVarLoadVectorResourceInner = e.loadVectorResourceInner(theme, res, xml);
                bVar.set(c0554b, aVarLoadVectorResourceInner);
            }
            n1.c imageVector = aVarLoadVectorResourceInner.getImageVector();
            wVar.endReplaceableGroup();
            eVarRememberVectorPainter = i1.rememberVectorPainter(imageVector, wVar, 0);
            wVar.endReplaceableGroup();
        }
        wVar.endReplaceableGroup();
        return eVarRememberVectorPainter;
    }
}
