package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum a4 implements Internal.EnumLite {
    SLOT_POSITION_POD_ANY(0),
    SLOT_POSITION_POD_LAST(-1),
    SLOT_POSITION_POD_FIRST(1),
    SLOT_POSITION_POD_FIRST_OR_LAST(2);


    /* renamed from: h, reason: collision with root package name */
    public static final y3 f45479h = new y3();

    /* renamed from: b, reason: collision with root package name */
    public final int f45481b;

    a4(int i10) {
        this.f45481b = i10;
    }

    public static a4 forNumber(int i10) {
        if (i10 == -1) {
            return SLOT_POSITION_POD_LAST;
        }
        if (i10 == 0) {
            return SLOT_POSITION_POD_ANY;
        }
        if (i10 == 1) {
            return SLOT_POSITION_POD_FIRST;
        }
        if (i10 != 2) {
            return null;
        }
        return SLOT_POSITION_POD_FIRST_OR_LAST;
    }

    public static Internal.EnumLiteMap<a4> internalGetValueMap() {
        return f45479h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return z3.f50320a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45481b;
    }

    @Deprecated
    public static a4 valueOf(int i10) {
        return forNumber(i10);
    }
}
