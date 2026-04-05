package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final x f47539a = new x();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i10) {
        return y.forNumber(i10) != null;
    }
}
