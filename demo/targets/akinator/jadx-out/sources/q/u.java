package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f82257a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f82258b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f82259c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82260d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82261e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f82262f;

    public /* synthetic */ u(TextView textView) {
        this.f82262f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f82262f;
        Drawable buttonDrawable = e4.f.getButtonDrawable(compoundButton);
        if (buttonDrawable != null) {
            if (this.f82259c || this.f82260d) {
                Drawable drawableMutate = p3.a.wrap(buttonDrawable).mutate();
                if (this.f82259c) {
                    p3.a.setTintList(drawableMutate, this.f82257a);
                }
                if (this.f82260d) {
                    p3.a.setTintMode(drawableMutate, this.f82258b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        t tVar = (t) this.f82262f;
        Drawable checkMarkDrawable = e4.e.getCheckMarkDrawable(tVar);
        if (checkMarkDrawable != null) {
            if (this.f82259c || this.f82260d) {
                Drawable drawableMutate = p3.a.wrap(checkMarkDrawable).mutate();
                if (this.f82259c) {
                    p3.a.setTintList(drawableMutate, this.f82257a);
                }
                if (this.f82260d) {
                    p3.a.setTintMode(drawableMutate, this.f82258b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(tVar.getDrawableState());
                }
                tVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f82262f;
        Context context = compoundButton.getContext();
        int[] iArr = k.a.f69989m;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton2 = (CompoundButton) this.f82262f;
        x3.z1.saveAttributeDataForStyleable(compoundButton2, compoundButton2.getContext(), iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            if (n3VarObtainStyledAttributes.hasValue(1) && (resourceId2 = n3VarObtainStyledAttributes.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.a.getDrawable(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (n3VarObtainStyledAttributes.hasValue(0) && (resourceId = n3VarObtainStyledAttributes.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.a.getDrawable(compoundButton.getContext(), resourceId));
            }
            if (n3VarObtainStyledAttributes.hasValue(2)) {
                e4.f.setButtonTintList(compoundButton, n3VarObtainStyledAttributes.getColorStateList(2));
            }
            if (n3VarObtainStyledAttributes.hasValue(3)) {
                e4.f.setButtonTintMode(compoundButton, l1.parseTintMode(n3VarObtainStyledAttributes.getInt(3, -1), null));
            }
            n3VarObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            n3VarObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
