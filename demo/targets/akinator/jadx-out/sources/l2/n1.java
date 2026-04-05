package l2;

import android.graphics.Typeface;
import l2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 implements l1 {
    public static Typeface a(String str, c1 c1Var, int i10) {
        if (y0.m5485equalsimpl0(i10, y0.f72394b.m5480getNormal_LCdwA()) && kotlin.jvm.internal.e0.areEqual(c1Var, c1.f72258c.getNormal()) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int iM5438getAndroidTypefaceStyleFO1MlWM = h.m5438getAndroidTypefaceStyleFO1MlWM(c1Var, i10);
        if (str == null || str.length() == 0) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(iM5438getAndroidTypefaceStyleFO1MlWM);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreate = Typeface.create(str, iM5438getAndroidTypefaceStyleFO1MlWM);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }

    public static Typeface b(String str, c1 c1Var, int i10) {
        if (str.length() != 0) {
            Typeface typefaceA = a(str, c1Var, i10);
            if (!kotlin.jvm.internal.e0.areEqual(typefaceA, Typeface.create(Typeface.DEFAULT, h.m5438getAndroidTypefaceStyleFO1MlWM(c1Var, i10))) && !kotlin.jvm.internal.e0.areEqual(typefaceA, a(null, c1Var, i10))) {
                return typefaceA;
            }
        }
        return null;
    }

    @Override // l2.l1
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo5443createDefaultFO1MlWM(c1 fontWeight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        return a(null, fontWeight, i10);
    }

    @Override // l2.l1
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo5444createNamedRetOiIg(e1 name, c1 fontWeight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface typefaceB = b(o1.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, i10);
        return typefaceB == null ? a(name.getName(), fontWeight, i10) : typefaceB;
    }

    @Override // l2.l1
    /* renamed from: optionalOnDeviceFontFamilyByName-RetOiIg */
    public Typeface mo5445optionalOnDeviceFontFamilyByNameRetOiIg(String familyName, c1 weight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(familyName, "familyName");
        kotlin.jvm.internal.e0.checkNotNullParameter(weight, "weight");
        x.a aVar = x.f72386c;
        return kotlin.jvm.internal.e0.areEqual(familyName, aVar.getSansSerif().getName()) ? mo5444createNamedRetOiIg(aVar.getSansSerif(), weight, i10) : kotlin.jvm.internal.e0.areEqual(familyName, aVar.getSerif().getName()) ? mo5444createNamedRetOiIg(aVar.getSerif(), weight, i10) : kotlin.jvm.internal.e0.areEqual(familyName, aVar.getMonospace().getName()) ? mo5444createNamedRetOiIg(aVar.getMonospace(), weight, i10) : kotlin.jvm.internal.e0.areEqual(familyName, aVar.getCursive().getName()) ? mo5444createNamedRetOiIg(aVar.getCursive(), weight, i10) : b(familyName, weight, i10);
    }
}
