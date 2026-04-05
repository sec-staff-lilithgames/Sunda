package dh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class w extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f52313b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f52314c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f52315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f52315e = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.f52315e;
        ColorStateList colorStateList2 = xVar.f52323n;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f52314c = colorStateList;
        if (xVar.f52322m != 0 && xVar.f52323n != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{jg.b.layer(xVar.f52322m, xVar.f52323n.getColorForState(iArr3, 0)), jg.b.layer(xVar.f52322m, xVar.f52323n.getColorForState(iArr2, 0)), xVar.f52322m});
        }
        this.f52313b = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f52315e;
            Drawable rippleDrawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f52322m != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f52322m);
                if (this.f52314c != null) {
                    colorDrawable.setTintList(this.f52313b);
                    rippleDrawable = new RippleDrawable(this.f52314c, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
