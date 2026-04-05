package a2;

import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f3792a = new s0();

    public final void setPointerIcon(View view, u1.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        PointerIcon pointerIcon = tVar instanceof u1.a ? ((u1.a) tVar).getPointerIcon() : tVar instanceof u1.b ? PointerIcon.getSystemIcon(view.getContext(), ((u1.b) tVar).getType()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (kotlin.jvm.internal.e0.areEqual(view.getPointerIcon(), pointerIcon)) {
            return;
        }
        view.setPointerIcon(pointerIcon);
    }
}
