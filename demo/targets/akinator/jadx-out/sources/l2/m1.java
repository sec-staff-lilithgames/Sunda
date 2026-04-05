package l2;

import android.graphics.Typeface;
import l2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 implements l1 {
    public static Typeface a(String str, c1 c1Var, int i10) {
        x0 x0Var = y0.f72394b;
        if (y0.m5485equalsimpl0(i10, x0Var.m5480getNormal_LCdwA()) && kotlin.jvm.internal.e0.areEqual(c1Var, c1.f72258c.getNormal()) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        Typeface typefaceCreate = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1Var.getWeight(), y0.m5485equalsimpl0(i10, x0Var.m5479getItalic_LCdwA()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
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
        return a(name.getName(), fontWeight, i10);
    }

    @Override // l2.l1
    /* renamed from: optionalOnDeviceFontFamilyByName-RetOiIg */
    public Typeface mo5445optionalOnDeviceFontFamilyByNameRetOiIg(String familyName, c1 weight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(familyName, "familyName");
        kotlin.jvm.internal.e0.checkNotNullParameter(weight, "weight");
        x.a aVar = x.f72386c;
        if (kotlin.jvm.internal.e0.areEqual(familyName, aVar.getSansSerif().getName())) {
            return mo5444createNamedRetOiIg(aVar.getSansSerif(), weight, i10);
        }
        if (kotlin.jvm.internal.e0.areEqual(familyName, aVar.getSerif().getName())) {
            return mo5444createNamedRetOiIg(aVar.getSerif(), weight, i10);
        }
        if (kotlin.jvm.internal.e0.areEqual(familyName, aVar.getMonospace().getName())) {
            return mo5444createNamedRetOiIg(aVar.getMonospace(), weight, i10);
        }
        if (kotlin.jvm.internal.e0.areEqual(familyName, aVar.getCursive().getName())) {
            return mo5444createNamedRetOiIg(aVar.getCursive(), weight, i10);
        }
        if (familyName.length() != 0) {
            Typeface typefaceA = a(familyName, weight, i10);
            boolean zM5485equalsimpl0 = y0.m5485equalsimpl0(i10, y0.f72394b.m5479getItalic_LCdwA());
            Typeface DEFAULT = Typeface.DEFAULT;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            if (!kotlin.jvm.internal.e0.areEqual(typefaceA, t1.f72372a.create(DEFAULT, weight.getWeight(), zM5485equalsimpl0)) && !kotlin.jvm.internal.e0.areEqual(typefaceA, a(null, weight, i10))) {
                return typefaceA;
            }
        }
        return null;
    }
}
