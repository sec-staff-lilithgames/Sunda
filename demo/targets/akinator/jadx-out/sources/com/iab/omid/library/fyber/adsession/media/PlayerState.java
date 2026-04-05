package com.iab.omid.library.fyber.adsession.media;

import com.amazon.device.ads.DTBAdActivity;
import com.vungle.ads.internal.Constants;

/* loaded from: classes7.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED(DTBAdActivity.EXPANDED),
    FULLSCREEN(Constants.TEMPLATE_TYPE_FULLSCREEN);

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
