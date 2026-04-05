package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5017b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, f5017b);
        setBackgroundDrawable(n3VarObtainStyledAttributes.getDrawable(0));
        n3VarObtainStyledAttributes.recycle();
    }
}
