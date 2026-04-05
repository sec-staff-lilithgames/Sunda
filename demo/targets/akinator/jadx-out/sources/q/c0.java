package q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c0 extends PopupWindow {
    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, k.a.f69996t, i10, i11);
        if (n3VarObtainStyledAttributes.hasValue(2)) {
            e4.p.setOverlapAnchor(this, n3VarObtainStyledAttributes.getBoolean(2, false));
        }
        setBackgroundDrawable(n3VarObtainStyledAttributes.getDrawable(0));
        n3VarObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
    }

    public c0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }
}
