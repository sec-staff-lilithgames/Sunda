package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BaseView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected RelativeLayout f42080a;

    /* renamed from: b, reason: collision with root package name */
    protected RelativeLayout f42081b;

    /* renamed from: c, reason: collision with root package name */
    protected RelativeLayout f42082c;

    /* renamed from: d, reason: collision with root package name */
    protected ImageView f42083d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f42084e;

    /* renamed from: f, reason: collision with root package name */
    protected ProgressBar f42085f;

    /* renamed from: g, reason: collision with root package name */
    protected FrameLayout f42086g;

    /* renamed from: h, reason: collision with root package name */
    protected LinearLayout f42087h;

    /* renamed from: i, reason: collision with root package name */
    protected RelativeLayout f42088i;
    public a style;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(h0.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f42088i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f42080a = (RelativeLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f42081b = (RelativeLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f42082c = (RelativeLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f42083d = (ImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f42084e = (TextView) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f42085f = (ProgressBar) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f42086g = (FrameLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f42087h = (LinearLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f42082c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f42083d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f42085f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f42080a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f42081b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f42084e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f42086g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f42087h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
