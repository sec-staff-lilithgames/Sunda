package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.jj.wqx {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
            sDislikeSendTip = dt.jpo(contextJpo, "tt_feedback_thank_text") + "\n" + dt.jpo(contextJpo, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = dt.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = dt.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = va.jd(getContext(), 75.0f);
        int iJd = va.jd(com.bytedance.sdk.openadsdk.core.sq.jpo(), 16.0f);
        int iJd2 = va.jd(com.bytedance.sdk.openadsdk.core.sq.jpo(), 12.0f);
        this.mTextView.setPadding(iJd, iJd2, iJd, iJd2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(8388611);
        Drawable drawableWqx = dt.wqx(getContext(), "tt_dislike_toast");
        int iJd3 = va.jd(getContext(), 16.0f);
        drawableWqx.setBounds(0, 0, iJd3, iJd3);
        this.mTextView.setCompoundDrawablePadding(iJd3 / 2);
        this.mTextView.setCompoundDrawables(drawableWqx, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(va.jd(com.bytedance.sdk.openadsdk.core.sq.jpo(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        sSkipText = dt.jpo(contextJpo, "tt_reward_screen_skip_tx");
        sDislikeTip = dt.jpo(contextJpo, "tt_feedback_submit_text");
        sDislikeSendTip = dt.jpo(contextJpo, "tt_feedback_thank_text") + "\n" + dt.jpo(contextJpo, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
