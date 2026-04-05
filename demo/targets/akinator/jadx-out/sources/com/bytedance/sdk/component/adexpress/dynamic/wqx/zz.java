package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends FrameLayout implements xyk {

    /* renamed from: cm, reason: collision with root package name */
    private View f18349cm;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.component.adexpress.jd.au f53if;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my f18350jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f18351jj;
    private Context jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.yd f18352ju;
    private qk my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jj.opi f18353qk;
    private com.bytedance.sdk.component.adexpress.dynamic.cm.qk wqx;
    private View.OnTouchListener xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f18354yd;
    private int zz;

    public zz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        super(context);
        this.jpo = context;
        this.f18350jd = myVar;
        this.wqx = qkVar;
        qk();
    }

    private void qk() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f18351jj = this.wqx.roc();
        this.zz = this.wqx.ic();
        this.f18354yd = this.wqx.cgn();
        qk qkVarJpo = yd.jpo(this.jpo, this.f18350jd, this.wqx, this.f18352ju, this.f53if);
        this.my = qkVarJpo;
        if (qkVarJpo != null) {
            this.f18349cm = qkVarJpo.wqx();
            if (this.wqx.pe()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.f18351jj, "6")) {
                if (!this.wqx.hks() || TextUtils.isEmpty(this.wqx.rxq())) {
                    this.f18353qk = new com.bytedance.sdk.component.adexpress.jj.opi(this.jpo, Color.parseColor("#99000000"));
                } else {
                    this.f18353qk = new com.bytedance.sdk.component.adexpress.jj.opi(this.jpo, com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(this.wqx.rxq()));
                }
                FrameLayout frameLayout = new FrameLayout(this.jpo);
                frameLayout.addView(this.f18353qk, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.zz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zz.this.f18353qk.jd();
                    }
                });
            }
            if (jpo(this.f18351jj) && com.bytedance.sdk.component.adexpress.cm.jd()) {
                int color = Color.parseColor("#99000000");
                if (this.wqx.hks() && !TextUtils.isEmpty(this.wqx.rxq())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(this.wqx.rxq());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.jpo);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.my.wqx());
            jpo(this.my.wqx());
            setVisibility(0);
        }
    }

    private boolean xyk() {
        return (this.wqx.cgn() || TextUtils.equals("9", this.f18351jj) || TextUtils.equals("16", this.f18351jj) || TextUtils.equals("17", this.f18351jj) || TextUtils.equals("18", this.f18351jj) || TextUtils.equals("20", this.f18351jj) || TextUtils.equals("29", this.f18351jj) || TextUtils.equals("10", this.f18351jj)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zz() {
        if (this.xyk != null) {
            setOnClickListener((View.OnClickListener) this.f18350jd.getDynamicClickListener());
            performClick();
            if (this.wqx.kb()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void cm() {
        qk qkVar = this.my;
        if (qkVar != null) {
            qkVar.jd();
        }
    }

    public void jj() {
        if (this.f18349cm != null && TextUtils.equals(this.f18351jj, "2")) {
            View view = this.f18349cm;
            if (view instanceof com.bytedance.sdk.component.adexpress.jj.wqx) {
                ((com.bytedance.sdk.component.adexpress.jj.wqx) view).cm();
            }
        }
    }

    public void my() {
        if (this.f18349cm != null && TextUtils.equals(this.f18351jj, "2")) {
            View view = this.f18349cm;
            if (view instanceof com.bytedance.sdk.component.adexpress.jj.wqx) {
                ((com.bytedance.sdk.component.adexpress.jj.wqx) view).wqx();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            qk qkVar = this.my;
            if (qkVar != null) {
                qkVar.jd();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.xyk instanceof com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo.wqx) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void wqx() {
        qk qkVar = this.my;
        if (qkVar != null) {
            qkVar.jpo();
        }
    }

    private boolean jpo(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk
    public void jd() {
        if (xyk()) {
            setOnClickListener((View.OnClickListener) this.f18350jd.getDynamicClickListener());
            performClick();
            if (this.wqx.kb()) {
                return;
            }
            setVisibility(8);
        }
    }

    public zz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, com.bytedance.sdk.component.adexpress.dynamic.cm.yd ydVar, com.bytedance.sdk.component.adexpress.jd.au auVar) {
        super(context);
        this.jpo = context;
        this.f18350jd = myVar;
        this.wqx = qkVar;
        this.f18352ju = ydVar;
        this.f53if = auVar;
        qk();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.wqx.zz.jpo(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk
    public void jpo() {
        if (TextUtils.equals(this.f18351jj, "6")) {
            com.bytedance.sdk.component.adexpress.jj.opi opiVar = this.f18353qk;
            if (opiVar != null) {
                opiVar.wqx();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.zz.2
                    @Override // java.lang.Runnable
                    public void run() {
                        zz.this.zz();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.f18351jj, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    zz.this.zz();
                }
            }, 400L);
        } else {
            zz();
        }
    }
}
