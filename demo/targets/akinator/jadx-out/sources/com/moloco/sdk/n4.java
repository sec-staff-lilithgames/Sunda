package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum n4 implements Internal.EnumLite {
    f47308c(1),
    AUTO_PLAY_SOUND_OFF(2),
    CLICK_TO_PLAY(3),
    MOUSE_OVER(4),
    ENTER_SOUND_ON(5),
    ENTER_SOUND_OFF(6),
    CONTINUOUS(7);


    /* renamed from: k, reason: collision with root package name */
    public static final l4 f47315k = new l4();

    /* renamed from: b, reason: collision with root package name */
    public final int f47317b;

    n4(int i10) {
        this.f47317b = i10;
    }

    public static n4 forNumber(int i10) {
        switch (i10) {
            case 1:
                return f47308c;
            case 2:
                return AUTO_PLAY_SOUND_OFF;
            case 3:
                return CLICK_TO_PLAY;
            case 4:
                return MOUSE_OVER;
            case 5:
                return ENTER_SOUND_ON;
            case 6:
                return ENTER_SOUND_OFF;
            case 7:
                return CONTINUOUS;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<n4> internalGetValueMap() {
        return f47315k;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return m4.f47305a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47317b;
    }

    @Deprecated
    public static n4 valueOf(int i10) {
        return forNumber(i10);
    }
}
