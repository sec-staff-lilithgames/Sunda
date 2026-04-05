package com.moloco.sdk.internal.services.proto;

import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {
    public static /* synthetic */ String a(b bVar, UserIntent$UserAdInteractionExt userIntent$UserAdInteractionExt, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeUserAdInteractionExt");
        }
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return bVar.a(userIntent$UserAdInteractionExt, i10);
    }
}
