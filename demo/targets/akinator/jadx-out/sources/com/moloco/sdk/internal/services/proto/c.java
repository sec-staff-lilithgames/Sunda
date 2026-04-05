package com.moloco.sdk.internal.services.proto;

import android.util.Base64;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements b {
    @Override // com.moloco.sdk.internal.services.proto.b
    public String a(UserIntent$UserAdInteractionExt input, int i10) {
        e0.checkNotNullParameter(input, "input");
        String strEncodeToString = Base64.encodeToString(input.toByteArray(), i10);
        e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
