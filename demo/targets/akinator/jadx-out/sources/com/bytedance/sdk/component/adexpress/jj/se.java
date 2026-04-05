package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class se extends LinearLayout {

    /* renamed from: cm, reason: collision with root package name */
    private jpo f18482cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.utils.hmu f18483jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jj f18484jj;
    private TextView jpo;
    private LinearLayout my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.yd f18485qk;
    private TextView wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
    }

    public se(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.cm.yd ydVar) {
        super(context);
        this.f18485qk = ydVar;
        jpo(context, view);
    }

    public TextView getTopTextView() {
        return this.jpo;
    }

    public LinearLayout getWriggleLayout() {
        return this.my;
    }

    public View getWriggleProgressIv() {
        return this.f18484jj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f18483jd == null) {
                this.f18483jd = new com.bytedance.sdk.component.utils.hmu(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.jj.se.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.cm.yd ydVar = this.f18485qk;
            if (ydVar != null) {
                ydVar.wqx();
                this.f18485qk.my();
                this.f18485qk.jj();
                this.f18485qk.xyk();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.jd.jj jjVar = this.f18484jj;
            if (jjVar != null) {
                jjVar.my();
            }
        } catch (Exception unused) {
        }
    }

    public void setOnShakeViewListener(jpo jpoVar) {
        this.f18482cm = jpoVar;
    }

    public void setShakeText(String str) {
        this.wqx.setText(str);
    }

    private void jpo(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.my = (LinearLayout) findViewById(2097610722);
        this.jpo = (TextView) findViewById(2097610719);
        this.wqx = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.jd.jj jjVar = (com.bytedance.adsdk.jd.jj) findViewById(2097610706);
        this.f18484jj = jjVar;
        jjVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.f18484jj.setImageAssetsFolder("images/");
        this.f18484jj.jpo(true);
    }

    public void jpo() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.se.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    se.this.f18484jj.jpo();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }
}
