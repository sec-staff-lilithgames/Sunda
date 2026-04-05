package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public List f61634b;

    /* renamed from: c, reason: collision with root package name */
    public d f61635c;

    /* renamed from: e, reason: collision with root package name */
    public int f61636e;

    /* renamed from: f, reason: collision with root package name */
    public float f61637f;

    /* renamed from: g, reason: collision with root package name */
    public float f61638g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f61639h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f61640i;

    /* renamed from: j, reason: collision with root package name */
    public int f61641j;

    /* renamed from: k, reason: collision with root package name */
    public m0 f61642k;

    /* renamed from: l, reason: collision with root package name */
    public View f61643l;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<in.b> getCuesWithStylingPreferencesApplied() {
        if (this.f61639h && this.f61640i) {
            return this.f61634b;
        }
        ArrayList arrayList = new ArrayList(this.f61634b.size());
        for (int i10 = 0; i10 < this.f61634b.size(); i10++) {
            in.a aVarBuildUpon = ((in.b) this.f61634b.get(i10)).buildUpon();
            if (!this.f61639h) {
                n0.removeAllEmbeddedStyling(aVarBuildUpon);
            } else if (!this.f61640i) {
                n0.removeEmbeddedFontSizes(aVarBuildUpon);
            }
            arrayList.add(aVarBuildUpon.build());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        if (isInEditMode()) {
            return d.f61721g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? d.f61721g : d.createFromCaptionStyle(captioningManager.getUserStyle());
    }

    private <T extends View & m0> void setView(T t10) {
        removeView(this.f61643l);
        View view = this.f61643l;
        if (view instanceof v0) {
            ((v0) view).destroy();
        }
        this.f61643l = t10;
        this.f61642k = t10;
        addView(t10);
    }

    public final void a() {
        this.f61642k.update(getCuesWithStylingPreferencesApplied(), this.f61635c, this.f61637f, this.f61636e, this.f61638g);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f61640i = z10;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f61639h = z10;
        a();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f61638g = f10;
        a();
    }

    public void setCues(List<in.b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f61634b = list;
        a();
    }

    public void setFixedTextSize(int i10, float f10) {
        Context context = getContext();
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        this.f61636e = 2;
        this.f61637f = fApplyDimension;
        a();
    }

    public void setFractionalTextSize(float f10) {
        setFractionalTextSize(f10, false);
    }

    public void setStyle(d dVar) {
        this.f61635c = dVar;
        a();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i10) {
        if (this.f61641j == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new c(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new v0(getContext()));
        }
        this.f61641j = i10;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61634b = Collections.EMPTY_LIST;
        this.f61635c = d.f61721g;
        this.f61636e = 0;
        this.f61637f = 0.0533f;
        this.f61638g = 0.08f;
        this.f61639h = true;
        this.f61640i = true;
        c cVar = new c(context);
        this.f61642k = cVar;
        this.f61643l = cVar;
        addView(cVar);
        this.f61641j = 1;
    }

    public void setFractionalTextSize(float f10, boolean z10) {
        this.f61636e = z10 ? 1 : 0;
        this.f61637f = f10;
        a();
    }
}
