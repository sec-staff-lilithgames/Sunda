package qg;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class u0 extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public int f83236b;

    public u0(Context context) {
        this(context, null);
    }

    public final int getUserSetVisibility() {
        return this.f83236b;
    }

    public final void internalSetVisibility(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f83236b = i10;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        internalSetVisibility(i10, true);
    }

    public u0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public u0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f83236b = getVisibility();
    }
}
