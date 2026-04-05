package com.unity3d.services.banners.view;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum BannerPosition {
    TOP_LEFT(new int[]{10, 9}, 51),
    TOP_CENTER(new int[]{10, 14}, 49),
    TOP_RIGHT(new int[]{10, 11}, 53),
    BOTTOM_LEFT(new int[]{12, 9}, 83),
    BOTTOM_CENTER(new int[]{12, 14}, 81),
    BOTTOM_RIGHT(new int[]{12, 11}, 85),
    CENTER(new int[]{13}, 17),
    NONE(new int[0], 0);

    private int _gravity;
    private final int[] _rules;

    BannerPosition(int[] iArr, int i10) {
        this._rules = iArr;
        this._gravity = i10;
    }

    public static BannerPosition fromString(String str) {
        return (str == null || str.equals("none")) ? NONE : str.equals("topleft") ? TOP_LEFT : str.equals("topright") ? TOP_RIGHT : str.equals("topcenter") ? TOP_CENTER : str.equals("bottomleft") ? BOTTOM_LEFT : str.equals("bottomright") ? BOTTOM_RIGHT : str.equals("bottomcenter") ? BOTTOM_CENTER : str.equals(TtmlNode.CENTER) ? CENTER : NONE;
    }

    public ViewGroup.LayoutParams addLayoutRules(RelativeLayout.LayoutParams layoutParams) {
        for (int i10 : this._rules) {
            layoutParams.addRule(i10);
        }
        return layoutParams;
    }

    public int getGravity() {
        return this._gravity;
    }
}
