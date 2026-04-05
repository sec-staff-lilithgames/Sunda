package com.applovin.shadow.okio;

import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* renamed from: com.applovin.shadow.okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @f
    public final long size(String string) {
        e0.checkNotNullParameter(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    @f
    public final long size(String string, int i10, int i11) {
        e0.checkNotNullParameter(string, "string");
        return Utf8.size(string, i10, i11);
    }
}
