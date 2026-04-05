package com.bytedance.adsdk.ugeno.core;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum oya {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    TWIST_EVENT("onTwist", 18),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17),
    RENDER_SUCCESS("onRenderSuccess", 22);


    /* renamed from: rq, reason: collision with root package name */
    private String f17754rq;

    /* renamed from: tu, reason: collision with root package name */
    private int f17755tu;

    oya(String str, int i10) {
        this.f17754rq = str;
        this.f17755tu = i10;
    }

    public int jpo() {
        return this.f17755tu;
    }

    public static oya jpo(String str) {
        for (oya oyaVar : values()) {
            if (oyaVar.f17754rq.equals(str)) {
                return oyaVar;
            }
        }
        return UNKNOWN_EVENT;
    }
}
