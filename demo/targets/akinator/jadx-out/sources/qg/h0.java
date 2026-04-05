package qg;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class h0 {

    /* renamed from: c, reason: collision with root package name */
    public float f83185c;

    /* renamed from: d, reason: collision with root package name */
    public float f83186d;

    /* renamed from: g, reason: collision with root package name */
    public ug.g f83189g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f83183a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final f0 f83184b = new f0(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f83187e = true;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f83188f = new WeakReference(null);

    public h0(g0 g0Var) {
        setDelegate(g0Var);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f83183a;
        this.f83185c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f83186d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f83187e = false;
    }

    public ug.g getTextAppearance() {
        return this.f83189g;
    }

    public float getTextHeight(String str) {
        if (!this.f83187e) {
            return this.f83186d;
        }
        a(str);
        return this.f83186d;
    }

    public TextPaint getTextPaint() {
        return this.f83183a;
    }

    public float getTextWidth(String str) {
        if (!this.f83187e) {
            return this.f83185c;
        }
        a(str);
        return this.f83185c;
    }

    public boolean isTextWidthDirty() {
        return this.f83187e;
    }

    public void setDelegate(g0 g0Var) {
        this.f83188f = new WeakReference(g0Var);
    }

    public void setTextAppearance(ug.g gVar, Context context) {
        if (this.f83189g != gVar) {
            this.f83189g = gVar;
            if (gVar != null) {
                TextPaint textPaint = this.f83183a;
                f0 f0Var = this.f83184b;
                gVar.updateMeasureState(context, textPaint, f0Var);
                g0 g0Var = (g0) this.f83188f.get();
                if (g0Var != null) {
                    textPaint.drawableState = g0Var.getState();
                }
                gVar.updateDrawState(context, textPaint, f0Var);
                this.f83187e = true;
            }
            g0 g0Var2 = (g0) this.f83188f.get();
            if (g0Var2 != null) {
                g0Var2.onTextSizeChange();
                g0Var2.onStateChange(g0Var2.getState());
            }
        }
    }

    public void setTextSizeDirty(boolean z10) {
        this.f83187e = z10;
    }

    public void setTextWidthDirty(boolean z10) {
        this.f83187e = z10;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f83189g.updateDrawState(context, this.f83183a, this.f83184b);
    }
}
