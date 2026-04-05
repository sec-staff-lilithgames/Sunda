package com.fyber.inneractive.sdk.mraid;

import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidResizeCommand;
import com.moloco.sdk.BKC.JzVV;
import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum k {
    CLOSE("close"),
    EXPAND(MraidExpandCommand.NAME),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN("open"),
    RESIZE(MraidResizeCommand.NAME),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES("setResizeProperties"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION(JzVV.efDvjnyFghKSTT),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT("createCalendarEvent"),
    UNSPECIFIED("");

    private String mCommand;

    k(String str) {
        this.mCommand = str;
    }

    public static k a(String str) {
        for (k kVar : values()) {
            if (kVar.mCommand.equals(str)) {
                return kVar;
            }
        }
        return UNSPECIFIED;
    }

    public final String a() {
        return this.mCommand;
    }
}
