package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum e1 implements Internal.EnumLite {
    LEFT(1),
    RIGHT(2),
    UP(3),
    DOWN(4),
    EXPANDABLE_FULLSCREEN(5),
    RESIZE_MINIMIZE(6);


    /* renamed from: j, reason: collision with root package name */
    public static final c1 f45738j = new c1();

    /* renamed from: b, reason: collision with root package name */
    public final int f45740b;

    e1(int i10) {
        this.f45740b = i10;
    }

    public static e1 forNumber(int i10) {
        switch (i10) {
            case 1:
                return LEFT;
            case 2:
                return RIGHT;
            case 3:
                return UP;
            case 4:
                return DOWN;
            case 5:
                return EXPANDABLE_FULLSCREEN;
            case 6:
                return RESIZE_MINIMIZE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<e1> internalGetValueMap() {
        return f45738j;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return d1.f45719a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45740b;
    }

    @Deprecated
    public static e1 valueOf(int i10) {
        return forNumber(i10);
    }
}
