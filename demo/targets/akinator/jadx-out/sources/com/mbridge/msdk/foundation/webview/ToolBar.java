package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        b();
    }

    private View a() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    private void b() {
        setOrientation(0);
        try {
            int iA = u0.a(getContext(), 10.0f);
            setPadding(0, iA, 0, iA);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) a();
            imageView.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) a();
            imageView2.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) a();
            imageView3.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) a();
            imageView4.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS);
            imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
            addView(imageView4);
        } catch (Exception unused5) {
        }
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setOnClickListener(onClickListener);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
