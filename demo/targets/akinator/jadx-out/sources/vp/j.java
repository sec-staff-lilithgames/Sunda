package vp;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f89523b;

    /* renamed from: c, reason: collision with root package name */
    public int f89524c;

    /* renamed from: e, reason: collision with root package name */
    public int f89525e;

    public j(View view) {
        this.f89523b = new WeakReference(view);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2;
        if (view == null) {
            return;
        }
        int i18 = i12 - i10;
        int i19 = i13 - i11;
        if ((i18 == this.f89524c && i19 == this.f89525e) || (view2 = (View) this.f89523b.get()) == null) {
            return;
        }
        this.f89524c = i18;
        this.f89525e = i19;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(i18, i19));
            return;
        }
        layoutParams.width = i18;
        layoutParams.height = i19;
        view2.requestLayout();
    }
}
