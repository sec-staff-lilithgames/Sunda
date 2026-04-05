package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f82018a;

    /* renamed from: b, reason: collision with root package name */
    public k3 f82019b;

    /* renamed from: c, reason: collision with root package name */
    public int f82020c = 0;

    public a0(ImageView imageView) {
        this.f82018a = imageView;
    }

    public final void a() {
        k3 k3Var;
        ImageView imageView = this.f82018a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable == null || (k3Var = this.f82019b) == null) {
            return;
        }
        w.a(drawable, k3Var, imageView.getDrawableState());
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = this.f82018a;
        Context context = imageView.getContext();
        int[] iArr = k.a.f69982f;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        ImageView imageView2 = this.f82018a;
        x3.z1.saveAttributeDataForStyleable(imageView2, imageView2.getContext(), iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = n3VarObtainStyledAttributes.getResourceId(1, -1)) != -1 && (drawable = l.a.getDrawable(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l1.a(drawable);
            }
            if (n3VarObtainStyledAttributes.hasValue(2)) {
                e4.j.setImageTintList(imageView, n3VarObtainStyledAttributes.getColorStateList(2));
            }
            if (n3VarObtainStyledAttributes.hasValue(3)) {
                e4.j.setImageTintMode(imageView, l1.parseTintMode(n3VarObtainStyledAttributes.getInt(3, -1), null));
            }
            n3VarObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            n3VarObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setImageResource(int i10) {
        ImageView imageView = this.f82018a;
        if (i10 != 0) {
            Drawable drawable = l.a.getDrawable(imageView.getContext(), i10);
            if (drawable != null) {
                l1.a(drawable);
            }
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
