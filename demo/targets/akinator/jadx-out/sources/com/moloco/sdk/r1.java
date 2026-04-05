package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum r1 implements Internal.EnumLite {
    AUDIO_AUTO_PLAY(1),
    AUDIO_USER_INITIATED(2),
    EXPANDABLE_AUTOMATIC(3),
    EXPANDABLE_CLICK_INITIATED(4),
    EXPANDABLE_ROLLOVER_INITIATED(5),
    VIDEO_IN_BANNER_AUTO_PLAY(6),
    VIDEO_IN_BANNER_USER_INITIATED(7),
    POP(8),
    PROVOCATIVE_OR_SUGGESTIVE(9),
    ANNOYING(10),
    SURVEYS(11),
    TEXT_ONLY(12),
    USER_INTERACTIVE(13),
    WINDOWS_DIALOG_OR_ALERT_STYLE(14),
    HAS_AUDIO_ON_OFF_BUTTON(15),
    AD_CAN_BE_SKIPPED(16),
    FLASH(17),
    RESPONSIVE(18);


    /* renamed from: v, reason: collision with root package name */
    public static final p1 f47408v = new p1();

    /* renamed from: b, reason: collision with root package name */
    public final int f47410b;

    r1(int i10) {
        this.f47410b = i10;
    }

    public static r1 forNumber(int i10) {
        switch (i10) {
            case 1:
                return AUDIO_AUTO_PLAY;
            case 2:
                return AUDIO_USER_INITIATED;
            case 3:
                return EXPANDABLE_AUTOMATIC;
            case 4:
                return EXPANDABLE_CLICK_INITIATED;
            case 5:
                return EXPANDABLE_ROLLOVER_INITIATED;
            case 6:
                return VIDEO_IN_BANNER_AUTO_PLAY;
            case 7:
                return VIDEO_IN_BANNER_USER_INITIATED;
            case 8:
                return POP;
            case 9:
                return PROVOCATIVE_OR_SUGGESTIVE;
            case 10:
                return ANNOYING;
            case 11:
                return SURVEYS;
            case 12:
                return TEXT_ONLY;
            case 13:
                return USER_INTERACTIVE;
            case 14:
                return WINDOWS_DIALOG_OR_ALERT_STYLE;
            case 15:
                return HAS_AUDIO_ON_OFF_BUTTON;
            case 16:
                return AD_CAN_BE_SKIPPED;
            case 17:
                return FLASH;
            case 18:
                return RESPONSIVE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<r1> internalGetValueMap() {
        return f47408v;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return q1.f47376a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47410b;
    }

    @Deprecated
    public static r1 valueOf(int i10) {
        return forNumber(i10);
    }
}
