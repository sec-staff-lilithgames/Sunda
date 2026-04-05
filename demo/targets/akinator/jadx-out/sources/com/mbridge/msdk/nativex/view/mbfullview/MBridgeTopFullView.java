package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.e2;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName().concat("WithResault");

    /* renamed from: j, reason: collision with root package name */
    protected ImageView f42092j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f42093k;

    /* renamed from: l, reason: collision with root package name */
    protected TextView f42094l;

    /* renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f42095m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(h0.a(getContext(), "mbridge_nativex_fullscreen_top", TtmlNode.TAG_LAYOUT), this.f42088i);
        if (viewInflate != null) {
            this.f42092j = (ImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f42093k = (TextView) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f42094l = (TextView) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f42095m = (StarLevelLayoutView) viewInflate.findViewById(h0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f42094l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f42094l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f42092j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f42093k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f42095m;
    }

    public void updateLayoutParams() {
        this.f42080a.setLayoutParams(e2.e(-1, -1, 10));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f42081b.setLayoutParams(layoutParams);
    }
}
