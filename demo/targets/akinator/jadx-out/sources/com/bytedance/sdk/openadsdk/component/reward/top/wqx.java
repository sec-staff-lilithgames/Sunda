package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.hna;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends View implements jpo<wqx> {
    private jpo<wqx> jpo;

    public wqx(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void clickSkip() {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void clickSound(String str) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public View getCloseButton() {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.jpo;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public wqx jpo(dt dtVar) {
        if (this.jpo == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(dtVar);
            this.jpo = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                jpo(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setListener(jd jdVar) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setListener(jdVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowDislike(boolean z10) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowEndCardNextAd(boolean z10, dt dtVar) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setShowEndCardNextAd(z10, dtVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowPlayableNextAd(boolean z10, dt dtVar) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setShowPlayableNextAd(z10, dtVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowSkip(boolean z10) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowSound(boolean z10) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSkipEnable(boolean z10) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSkipInvisiable() {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSkipText(CharSequence charSequence) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSoundMute(boolean z10) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void showCloseButton() {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void showCountDownText() {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void showSkipButton() {
        jpo<wqx> jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.showSkipButton();
        }
    }

    public wqx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public wqx(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void jpo(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(hna.bl);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
