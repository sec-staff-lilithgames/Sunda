package d0;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c4 implements y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final c4 f51348a = new c4();

    @Override // d0.y3
    public boolean getCanUpdateZoom() {
        return true;
    }

    @Override // d0.y3
    public b4 create(k3 style, View view, s2.e density, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        if (kotlin.jvm.internal.e0.areEqual(style, k3.f51464g.getTextDefault())) {
            return new b4(new Magnifier(view));
        }
        long jMo3426toSizeXkaWNTQ = density.mo3426toSizeXkaWNTQ(style.m3718getSizeMYxV2XQ$foundation_release());
        float fMo3425toPx0680j_4 = density.mo3425toPx0680j_4(style.m3716getCornerRadiusD9Ej5fM$foundation_release());
        float fMo3425toPx0680j_42 = density.mo3425toPx0680j_4(style.m3717getElevationD9Ej5fM$foundation_release());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo3426toSizeXkaWNTQ != i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            builder.setSize(mv.d.roundToInt(i1.o.m4252getWidthimpl(jMo3426toSizeXkaWNTQ)), mv.d.roundToInt(i1.o.m4249getHeightimpl(jMo3426toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo3425toPx0680j_4)) {
            builder.setCornerRadius(fMo3425toPx0680j_4);
        }
        if (!Float.isNaN(fMo3425toPx0680j_42)) {
            builder.setElevation(fMo3425toPx0680j_42);
        }
        if (!Float.isNaN(f10)) {
            builder.setInitialZoom(f10);
        }
        builder.setClippingEnabled(style.getClippingEnabled$foundation_release());
        Magnifier magnifierBuild = builder.build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new b4(magnifierBuild);
    }
}
