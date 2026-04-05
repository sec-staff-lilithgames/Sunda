package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.wqx.Cif;
import com.bytedance.sdk.openadsdk.wqx.yd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr extends com.bytedance.sdk.openadsdk.core.jj.wqx implements yd.jd {

    /* renamed from: cm, reason: collision with root package name */
    private Context f19747cm;

    /* renamed from: jd, reason: collision with root package name */
    private dt f19748jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f19749jj;
    private View jpo;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.wqx.yd f19750qk;
    private jpo wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jd(View view);

        void jpo(View view);

        void jpo(FilterWord filterWord);
    }

    public prr(Context context, dt dtVar) {
        this(context.getApplicationContext());
        this.f19748jd = dtVar;
        this.f19747cm = context;
        cm();
        my();
    }

    private void cm() {
        this.f19750qk.jpo(this.f19748jd.fxd());
        this.f19750qk.jpo(this);
    }

    private Cif.jpo jj() {
        return new Cif.jpo() { // from class: com.bytedance.sdk.openadsdk.common.prr.2
            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void jd() {
                prr.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void jpo() {
                prr.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void wqx() {
                prr.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void jpo(int i10, FilterWord filterWord, String str) {
                prr.this.f19750qk.wqx(str);
                prr.this.setVisibility(0);
            }
        };
    }

    private void my() {
        com.bytedance.sdk.openadsdk.wqx.yd ydVar;
        dt dtVar = this.f19748jd;
        if (dtVar == null || (ydVar = this.f19750qk) == null) {
            return;
        }
        ydVar.jpo(dtVar.pve());
    }

    public void jd() {
        setVisibility(8);
        this.f19749jj = false;
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jd(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.wqx.yd ydVar = this.f19750qk;
        if (ydVar != null) {
            ydVar.jpo();
        }
    }

    public void setCallback(jpo jpoVar) {
        this.wqx = jpoVar;
    }

    public void setDislikeSource(String str) {
        this.my = str;
        this.f19750qk.jd(str);
    }

    public void wqx() {
        Context context = this.f19747cm;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            Cif cif = new Cif(this.f19747cm, this.f19750qk);
            cif.jpo(jj());
            cif.jpo("", this.f19748jd);
            if (zIsFinishing || cif.isShowing()) {
                return;
            }
            cif.show();
        }
    }

    private void jpo(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.prr.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (prr.this.f19750qk != null) {
                    prr.this.f19750qk.my();
                } else {
                    prr.this.jd();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.jpo = new com.bytedance.sdk.openadsdk.wqx.zz(context, this.f19750qk);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = va.jd(getContext(), 20.0f);
        layoutParams.rightMargin = va.jd(getContext(), 20.0f);
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setClickable(true);
        my();
    }

    public prr(Context context) {
        this(context, (AttributeSet) null);
    }

    public prr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public prr(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19749jj = false;
        this.f19750qk = new com.bytedance.sdk.openadsdk.wqx.yd();
        jpo(context, attributeSet);
    }

    public void jpo() {
        if (this.jpo.getParent() == null) {
            addView(this.jpo);
        }
        setVisibility(0);
        this.f19749jj = true;
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.jd
    public void jpo(int i10) {
        if (com.bytedance.sdk.openadsdk.wqx.yd.f21646jd == i10) {
            FilterWord filterWordJd = this.f19750qk.jd();
            if (filterWordJd == null || com.bytedance.sdk.openadsdk.wqx.yd.jpo.equals(filterWordJd)) {
                return;
            }
            jpo jpoVar = this.wqx;
            if (jpoVar != null) {
                try {
                    jpoVar.jpo(filterWordJd);
                } catch (Throwable unused) {
                }
            }
            jd();
            return;
        }
        if (com.bytedance.sdk.openadsdk.wqx.yd.wqx == i10) {
            jd();
        } else if (com.bytedance.sdk.openadsdk.wqx.yd.my == i10) {
            wqx();
        }
    }
}
