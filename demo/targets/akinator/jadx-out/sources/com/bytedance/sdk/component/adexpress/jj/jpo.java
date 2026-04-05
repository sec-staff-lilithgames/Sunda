package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.hx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends TextSwitcher implements ViewSwitcher.ViewFactory, hx.jpo {

    /* renamed from: au, reason: collision with root package name */
    private int f18448au;

    /* renamed from: cm, reason: collision with root package name */
    private final int f18449cm;

    /* renamed from: if, reason: not valid java name */
    private int f60if;

    /* renamed from: jd, reason: collision with root package name */
    private List<String> f18450jd;

    /* renamed from: jj, reason: collision with root package name */
    private TextView f18451jj;
    Animation.AnimationListener jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f18452ju;
    private Context my;
    private Handler oya;

    /* renamed from: qk, reason: collision with root package name */
    private int f18453qk;
    private int wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f18454yd;
    private float zz;

    public jpo(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.f18450jd = new ArrayList();
        this.wqx = 0;
        this.f18449cm = 1;
        this.oya = new hx(Looper.getMainLooper(), this);
        this.jpo = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.jj.jpo.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (jpo.this.f18451jj != null) {
                    jpo.this.f18451jj.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.my = context;
        this.xyk = i10;
        this.zz = f10;
        this.f18454yd = i11;
        this.f18448au = i12;
        wqx();
    }

    private void wqx() {
        setFactory(this);
    }

    public void jd() {
        List<String> list = this.f18450jd;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.wqx;
        this.wqx = i10 + 1;
        this.f18452ju = i10;
        setText(this.f18450jd.get(i10));
        if (this.wqx > this.f18450jd.size() - 1) {
            this.wqx = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f18451jj = textView;
        textView.setTextColor(this.xyk);
        this.f18451jj.setTextSize(this.zz);
        this.f18451jj.setMaxLines(this.f18454yd);
        this.f18451jj.setTextAlignment(this.f18448au);
        return this.f18451jj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.oya.sendEmptyMessageDelayed(1, this.f18453qk);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.oya.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd(this.f18450jd.get(this.f18452ju), this.zz, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.f18453qk = i10;
    }

    public void setAnimationText(List<String> list) {
        this.f18450jd = list;
    }

    public void setAnimationType(int i10) {
        this.f60if = i10;
    }

    public void setMaxLines(int i10) {
        this.f18454yd = i10;
    }

    public void setTextColor(int i10) {
        this.xyk = i10;
    }

    public void setTextSize(float f10) {
        this.zz = f10;
    }

    public void jpo() {
        int i10 = this.f60if;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.dt.zz(this.my, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.dt.zz(this.my, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.dt.zz(this.my, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.dt.zz(this.my, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.jpo);
            getOutAnimation().setAnimationListener(this.jpo);
        }
        this.oya.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message.what != 1) {
            return;
        }
        jd();
        this.oya.sendEmptyMessageDelayed(1, this.f18453qk);
    }
}
