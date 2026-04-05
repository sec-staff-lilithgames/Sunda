package i0;

import android.view.View;
import kotlin.jvm.internal.e0;
import tu.x0;
import x1.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final View f59296b;

    public a(View view) {
        e0.checkNotNullParameter(view, "view");
        this.f59296b = view;
    }

    @Override // i0.e
    public Object bringChildIntoView(i1.j jVar, d0 d0Var, zu.d<? super x0> dVar) {
        this.f59296b.requestRectangleOnScreen(t.access$toRect(jVar.m4216translatek4lQ0M(x1.e0.positionInRoot(d0Var))), false);
        return x0.f87415a;
    }
}
