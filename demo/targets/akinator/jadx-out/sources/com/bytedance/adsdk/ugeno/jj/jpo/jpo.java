package com.bytedance.adsdk.ugeno.jj.jpo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.jj.cm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo extends LinearLayout {

    /* renamed from: cm, reason: collision with root package name */
    private List<View> f17864cm;

    /* renamed from: if, reason: not valid java name */
    private String f38if;

    /* renamed from: jd, reason: collision with root package name */
    protected int f17865jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f17866jj;
    protected Context jpo;

    /* renamed from: ju, reason: collision with root package name */
    private float f17867ju;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private int f17868qk;
    protected int wqx;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private float f17869yd;
    private int zz;

    public jpo(Context context) {
        super(context);
        this.my = -65536;
        this.f17866jj = -16776961;
        this.f17868qk = 5;
        this.f17865jd = 40;
        this.wqx = 20;
        this.f38if = "row";
        this.jpo = context;
        this.f17864cm = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.f17867ju) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.f17869yd) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.f17864cm.size();
    }

    public abstract Drawable jd(int i10);

    public void jd() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof jd) {
            this.wqx = this.f17865jd;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f17865jd, this.wqx);
        if (getOrientation() == 1) {
            int i10 = this.f17868qk;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.f17868qk;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        addView(view, layoutParams);
        view.setBackground(jd(this.f17866jj));
        this.f17864cm.add(view);
    }

    public void setIndicatorDirection(String str) {
        this.f38if = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i10) {
        this.wqx = i10;
    }

    public void setIndicatorWidth(int i10) {
        this.f17865jd = i10;
    }

    public void setIndicatorX(float f10) {
        this.f17869yd = f10;
    }

    public void setIndicatorY(float f10) {
        this.f17867ju = f10;
    }

    public void setLoop(boolean z10) {
        this.xyk = z10;
    }

    public void setSelectedColor(int i10) {
        this.my = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.f17866jj = i10;
    }

    public void wqx() {
        this.f17864cm.clear();
        removeAllViews();
    }

    public void jpo(int i10, int i11) {
        Iterator<View> it = this.f17864cm.iterator();
        while (it.hasNext()) {
            it.next().setBackground(jd(this.f17866jj));
        }
        if (i10 < 0 || i10 >= this.f17864cm.size()) {
            i10 = 0;
        }
        if (this.f17864cm.size() > 0) {
            this.f17864cm.get(i10).setBackground(jd(this.my));
            this.zz = i11;
        }
    }

    public void jpo() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jj.jpo.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                jpo.this.cm();
            }
        });
    }

    public void jpo(int i10) {
        if (this instanceof jd) {
            this.wqx = this.f17865jd;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f17865jd, this.wqx);
        if (getOrientation() == 1) {
            int i11 = this.f17868qk;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
        } else {
            int i12 = this.f17868qk;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f17865jd, this.wqx);
        if (getOrientation() == 1) {
            int i13 = this.f17868qk;
            layoutParams2.topMargin = i13;
            layoutParams2.bottomMargin = i13;
        } else {
            int i14 = this.f17868qk;
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i14;
        }
        int iJpo = cm.jpo(this.xyk, this.zz, this.f17864cm.size());
        int iJpo2 = cm.jpo(this.xyk, i10, this.f17864cm.size());
        if (this.f17864cm.size() == 0) {
            iJpo2 = 0;
        }
        if (!this.f17864cm.isEmpty() && cm.jpo(iJpo, this.f17864cm) && cm.jpo(iJpo2, this.f17864cm)) {
            this.f17864cm.get(iJpo).setBackground(jd(this.f17866jj));
            this.f17864cm.get(iJpo).setLayoutParams(layoutParams2);
            this.f17864cm.get(iJpo2).setBackground(jd(this.my));
            this.f17864cm.get(iJpo2).setLayoutParams(layoutParams);
            this.zz = i10;
        }
    }
}
