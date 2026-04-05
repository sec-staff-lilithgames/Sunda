package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public List f28136b;

    /* renamed from: c, reason: collision with root package name */
    public f f28137c;

    /* renamed from: e, reason: collision with root package name */
    public int f28138e;

    /* renamed from: f, reason: collision with root package name */
    public float f28139f;

    /* renamed from: g, reason: collision with root package name */
    public float f28140g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28141h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28142i;

    /* renamed from: j, reason: collision with root package name */
    public int f28143j;

    /* renamed from: k, reason: collision with root package name */
    public q0 f28144k;

    /* renamed from: l, reason: collision with root package name */
    public View f28145l;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<ef.b> getCuesWithStylingPreferencesApplied() {
        if (this.f28141h && this.f28142i) {
            return this.f28136b;
        }
        ArrayList arrayList = new ArrayList(this.f28136b.size());
        for (int i10 = 0; i10 < this.f28136b.size(); i10++) {
            ef.a aVarBuildUpon = ((ef.b) this.f28136b.get(i10)).buildUpon();
            if (!this.f28141h) {
                r0.removeAllEmbeddedStyling(aVarBuildUpon);
            } else if (!this.f28142i) {
                r0.removeEmbeddedFontSizes(aVarBuildUpon);
            }
            arrayList.add(aVarBuildUpon.build());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (n1.f28506a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private f getUserCaptionStyle() {
        if (n1.f28506a < 19 || isInEditMode()) {
            return f.f28186g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? f.f28186g : f.createFromCaptionStyle(captioningManager.getUserStyle());
    }

    private <T extends View & q0> void setView(T t10) {
        removeView(this.f28145l);
        View view = this.f28145l;
        if (view instanceof a1) {
            ((a1) view).destroy();
        }
        this.f28145l = t10;
        this.f28144k = t10;
        addView(t10);
    }

    public final void a() {
        this.f28144k.update(getCuesWithStylingPreferencesApplied(), this.f28137c, this.f28139f, this.f28138e, this.f28140g);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f28142i = z10;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f28141h = z10;
        a();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f28140g = f10;
        a();
    }

    public void setCues(List<ef.b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f28136b = list;
        a();
    }

    public void setFixedTextSize(int i10, float f10) {
        Context context = getContext();
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        this.f28138e = 2;
        this.f28139f = fApplyDimension;
        a();
    }

    public void setFractionalTextSize(float f10) {
        setFractionalTextSize(f10, false);
    }

    public void setStyle(f fVar) {
        this.f28137c = fVar;
        a();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i10) {
        if (this.f28143j == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new e(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new a1(getContext()));
        }
        this.f28143j = i10;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28136b = Collections.EMPTY_LIST;
        this.f28137c = f.f28186g;
        this.f28138e = 0;
        this.f28139f = 0.0533f;
        this.f28140g = 0.08f;
        this.f28141h = true;
        this.f28142i = true;
        e eVar = new e(context);
        this.f28144k = eVar;
        this.f28145l = eVar;
        addView(eVar);
        this.f28143j = 1;
    }

    public void setFractionalTextSize(float f10, boolean z10) {
        this.f28138e = z10 ? 1 : 0;
        this.f28139f = f10;
        a();
    }
}
