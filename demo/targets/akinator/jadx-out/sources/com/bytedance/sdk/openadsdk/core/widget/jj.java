package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.sdk.openadsdk.core.jj.cm {

    /* renamed from: jd, reason: collision with root package name */
    private int f20897jd;
    private float jpo;

    public jj(Context context) {
        super(context);
        this.jpo = 2.25f;
        this.f20897jd = 12;
        jpo();
    }

    public static com.bytedance.sdk.openadsdk.core.jj.cm jd(Context context) {
        return new jj(context, 28, 5.0f);
    }

    private void jpo() {
        setBackground(cm.jpo());
        setImageResource(dt.cm(getContext(), "tt_close_btn"));
        int iJd = va.jd(getContext(), this.jpo);
        setPadding(iJd, iJd, iJd, iJd);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.cm, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iJd = va.jd(getContext(), this.f20897jd);
            layoutParams.width = iJd;
            layoutParams.height = iJd;
        }
        super.setLayoutParams(layoutParams);
    }

    public jj(Context context, int i10, float f10) {
        super(context);
        this.jpo = f10;
        this.f20897jd = i10;
        jpo();
    }

    public static com.bytedance.sdk.openadsdk.core.jj.cm jpo(Context context) {
        return new jj(context);
    }
}
