package d0;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a4 implements y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final a4 f51295a = new a4();

    @Override // d0.y3
    public boolean getCanUpdateZoom() {
        return false;
    }

    @Override // d0.y3
    public z3 create(k3 style, View view, s2.e density, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return new z3(new Magnifier(view));
    }
}
