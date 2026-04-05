package mj;

import android.view.View;
import android.widget.ScrollView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f74741a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74742b;

    /* renamed from: c, reason: collision with root package name */
    public int f74743c;

    /* renamed from: d, reason: collision with root package name */
    public int f74744d;

    public e(View view, boolean z10) {
        this.f74741a = view;
        this.f74742b = z10;
    }

    public int getDesiredHeight() {
        View view = this.f74741a;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom();
    }

    public int getDesiredWidth() {
        View view = this.f74741a;
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public int getMaxHeight() {
        return this.f74744d;
    }

    public int getMaxWidth() {
        return this.f74743c;
    }

    public View getView() {
        return this.f74741a;
    }

    public boolean isFlex() {
        return this.f74742b;
    }

    public void preMeasure(int i10, int i11) {
        b.measureAtMost(this.f74741a, i10, i11);
    }

    public void setMaxDimens(int i10, int i11) {
        this.f74743c = i10;
        this.f74744d = i11;
    }
}
