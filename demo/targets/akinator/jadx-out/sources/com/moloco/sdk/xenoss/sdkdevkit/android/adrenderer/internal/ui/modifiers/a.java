package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers;

import androidx.lifecycle.c3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import e1.v;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.x0;
import x1.d0;
import x1.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {
    public static final v a(v modifier, a.c savedStateButton, l updateButtonState) {
        e0.checkNotNullParameter(modifier, "modifier");
        e0.checkNotNullParameter(savedStateButton, "savedStateButton");
        e0.checkNotNullParameter(updateButtonState, "updateButtonState");
        return k1.onGloballyPositioned(modifier, new c3(9, savedStateButton, updateButtonState));
    }

    public static final x0 a(a.c cVar, l lVar, d0 it) {
        e0.checkNotNullParameter(it, "it");
        c cVar2 = c.f48771a;
        a.c cVarA = cVar2.a(it, cVar.d());
        if (cVar2.a(cVarA) && !e0.areEqual(cVarA, cVar)) {
            lVar.invoke(cVarA);
        }
        return x0.f87415a;
    }
}
