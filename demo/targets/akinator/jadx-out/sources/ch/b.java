package ch;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b extends View {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f12302b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f12303c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12304e;

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, uf.a.O);
        this.f12302b = n3VarObtainStyledAttributes.getText(2);
        this.f12303c = n3VarObtainStyledAttributes.getDrawable(0);
        this.f12304e = n3VarObtainStyledAttributes.getResourceId(1, 0);
        n3VarObtainStyledAttributes.recycle();
    }
}
