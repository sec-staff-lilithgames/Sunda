package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private final RotateAnimation f18462cm;

    /* renamed from: jd, reason: collision with root package name */
    private final ImageView f18463jd;
    private final TextView jpo;
    private final Cif wqx;

    public ju(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.wqx.jpo.cm(context));
        this.jpo = (TextView) findViewById(2097610742);
        this.f18463jd = (ImageView) findViewById(2097610745);
        this.wqx = (Cif) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.f18462cm = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.ju.1
            @Override // java.lang.Runnable
            public void run() {
                ju.this.f18463jd.startAnimation(ju.this.f18462cm);
                ju.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.ju.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ju.this.wqx.jpo(4);
                    }
                }, 100L);
                ju.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.ju.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ju.this.wqx.jpo(4);
                    }
                }, 300L);
                ju juVar = ju.this;
                juVar.postDelayed(juVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.jpo;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void jd() {
        this.f18462cm.cancel();
    }

    public void jpo() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
