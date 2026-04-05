package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {
    public static /* synthetic */ void a(n nVar, List list, z zVar, Integer num, String str, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, a.f fVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClick");
        }
        if ((i10 & 2) != 0) {
            zVar = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        nVar.a(list, zVar, num, str, list2, bVar, fVar);
    }

    public static /* synthetic */ void a(n nVar, List list, z zVar, Integer num, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 2) != 0) {
            zVar = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        nVar.a(list, zVar, num, str);
    }
}
