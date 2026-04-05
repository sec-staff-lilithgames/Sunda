package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int i10, int i11) {
        getHolder().setFixedSize(i10, i11);
        requestLayout();
        invalidate();
    }
}
