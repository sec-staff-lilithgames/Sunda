package io.odeeo.internal.h1;

import android.text.TextUtils;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {
    /* renamed from: isPidValid-00XPtyU, reason: not valid java name */
    public static final boolean m4591isPidValid00XPtyU(String isPidValid) {
        e0.checkNotNullParameter(isPidValid, "$this$isPidValid");
        return TextUtils.isDigitsOnly(isPidValid) && isPidValid.length() > 0;
    }
}
