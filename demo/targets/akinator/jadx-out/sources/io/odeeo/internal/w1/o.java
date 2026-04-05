package io.odeeo.internal.w1;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.e0;
import x3.e3;
import x3.s;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o {
    public static final void checkForUnsafeZones(int i10, int i11, int i12, Rect safeAreaInsets, int i13, int i14) {
        e0.checkNotNullParameter(safeAreaInsets, "safeAreaInsets");
        int i15 = safeAreaInsets.top;
        int i16 = safeAreaInsets.bottom;
        int i17 = safeAreaInsets.left;
        int i18 = safeAreaInsets.right;
        if (i10 == 0 && i11 == 0) {
            return;
        }
        boolean z10 = true;
        boolean z11 = i10 < i17 || i10 + i12 > i13 - i18;
        if (i11 >= i16 && i11 + i12 <= i14 - i15) {
            z10 = false;
        }
        if (z11) {
            io.odeeo.internal.b2.a.d("Icon was displayed at offset X due to unsafe zone restrictions.", new Object[0]);
        }
        if (z10) {
            io.odeeo.internal.b2.a.d("Icon was displayed at offset Y due to unsafe zone restrictions.", new Object[0]);
        }
    }

    public static final Rect getSafeAreaInsets(View view, s sVar) {
        e0.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        if (sVar == null) {
            return rect;
        }
        rect.set(sVar.getSafeInsetLeft(), sVar.getSafeInsetTop(), sVar.getSafeInsetRight(), sVar.getSafeInsetBottom());
        return rect;
    }

    public static /* synthetic */ Rect getSafeAreaInsets$default(View view, s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e3 rootWindowInsets = z1.getRootWindowInsets(view);
            sVar = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
        }
        return getSafeAreaInsets(view, sVar);
    }

    public static final void setDebounceClickListener(View view, long j10, kv.a action) {
        e0.checkNotNullParameter(view, "<this>");
        e0.checkNotNullParameter(action, "action");
        view.setOnClickListener(new d(j10, action));
    }

    public static /* synthetic */ void setDebounceClickListener$default(View view, long j10, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1000;
        }
        setDebounceClickListener(view, j10, aVar);
    }
}
