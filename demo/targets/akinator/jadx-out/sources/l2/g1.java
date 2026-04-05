package l2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f72294a = o1.PlatformTypefaces();

    @Override // l2.j0
    public z1 resolve(u1 typefaceRequest, h1 platformFontLoader, kv.l onAsyncCompletion, kv.l createDefaultTypeface) {
        Typeface typefaceMo5444createNamedRetOiIg;
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        kotlin.jvm.internal.e0.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        x fontFamily = typefaceRequest.getFontFamily();
        boolean z10 = fontFamily == null ? true : fontFamily instanceof q;
        l1 l1Var = this.f72294a;
        if (z10) {
            typefaceMo5444createNamedRetOiIg = l1Var.mo5443createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m5467getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof e1)) {
                if (!(fontFamily instanceof f1)) {
                    return null;
                }
                ((f1) typefaceRequest.getFontFamily()).getTypeface();
                typefaceRequest.getFontWeight();
                typefaceRequest.m5467getFontStyle_LCdwA();
                typefaceRequest.m5468getFontSynthesisGVVA2EU();
                throw null;
            }
            typefaceMo5444createNamedRetOiIg = l1Var.mo5444createNamedRetOiIg((e1) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m5467getFontStyle_LCdwA());
        }
        return new y1(typefaceMo5444createNamedRetOiIg, false, 2, null);
    }
}
