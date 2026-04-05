package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends Button {
    public qk(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        setId(com.bytedance.sdk.openadsdk.utils.hna.ux);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, va.jd(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_browser_download_selector"));
        setText(dt.jpo(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
