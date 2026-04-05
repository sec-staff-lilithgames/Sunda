package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.app.y;
import q.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f5043b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f5044c;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f5045e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f5046f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f5047g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f5048h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f5049i;

    /* renamed from: j, reason: collision with root package name */
    public g1 f5050j;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5047g == null) {
            this.f5047g = new TypedValue();
        }
        return this.f5047g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5048h == null) {
            this.f5048h = new TypedValue();
        }
        return this.f5048h;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5045e == null) {
            this.f5045e = new TypedValue();
        }
        return this.f5045e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5046f == null) {
            this.f5046f = new TypedValue();
        }
        return this.f5046f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5043b == null) {
            this.f5043b = new TypedValue();
        }
        return this.f5043b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5044c == null) {
            this.f5044c = new TypedValue();
        }
        return this.f5044c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g1 g1Var = this.f5050j;
        if (g1Var != null) {
            ((y) g1Var).onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g1 g1Var = this.f5050j;
        if (g1Var != null) {
            ((y) g1Var).onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(g1 g1Var) {
        this.f5050j = g1Var;
    }

    public void setDecorPadding(int i10, int i11, int i12, int i13) {
        this.f5049i.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5049i = new Rect();
    }
}
