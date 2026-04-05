package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends View {

    /* renamed from: jd, reason: collision with root package name */
    private View f19746jd;
    private final jpo jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        View jpo(Context context);
    }

    public oya(Context context, jpo jpoVar) {
        super(context);
        this.jpo = jpoVar;
        jpo();
    }

    private View jd() {
        jpo jpoVar;
        if (this.f19746jd == null && (jpoVar = this.jpo) != null) {
            this.f19746jd = jpoVar.jpo(getContext());
            jpo(this.f19746jd, (ViewGroup) getParent());
        }
        return this.f19746jd;
    }

    private void jpo() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.f19746jd;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            jd();
        }
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
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
