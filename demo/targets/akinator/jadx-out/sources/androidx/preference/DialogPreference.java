package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.digidust.elokence.akinator.freemium.R;
import g5.t;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence P;
    public CharSequence Q;
    public Drawable R;
    public CharSequence S;
    public CharSequence T;
    public int U;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57316b, i10, i11);
        String string = q.getString(typedArrayObtainStyledAttributes, 9, 0);
        this.P = string;
        if (string == null) {
            this.P = getTitle();
        }
        this.Q = q.getString(typedArrayObtainStyledAttributes, 8, 1);
        this.R = q.getDrawable(typedArrayObtainStyledAttributes, 6, 2);
        this.S = q.getString(typedArrayObtainStyledAttributes, 11, 3);
        this.T = q.getString(typedArrayObtainStyledAttributes, 10, 4);
        this.U = q.getResourceId(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void f() {
        getPreferenceManager().showDialog(this);
    }

    public Drawable getDialogIcon() {
        return this.R;
    }

    public int getDialogLayoutResource() {
        return this.U;
    }

    public CharSequence getDialogMessage() {
        return this.Q;
    }

    public CharSequence getDialogTitle() {
        return this.P;
    }

    public CharSequence getNegativeButtonText() {
        return this.T;
    }

    public CharSequence getPositiveButtonText() {
        return this.S;
    }

    public void setDialogIcon(Drawable drawable) {
        this.R = drawable;
    }

    public void setDialogLayoutResource(int i10) {
        this.U = i10;
    }

    public void setDialogMessage(CharSequence charSequence) {
        this.Q = charSequence;
    }

    public void setDialogTitle(CharSequence charSequence) {
        this.P = charSequence;
    }

    public void setNegativeButtonText(CharSequence charSequence) {
        this.T = charSequence;
    }

    public void setPositiveButtonText(CharSequence charSequence) {
        this.S = charSequence;
    }

    public void setDialogIcon(int i10) {
        this.R = l.a.getDrawable(getContext(), i10);
    }

    public void setDialogMessage(int i10) {
        setDialogMessage(getContext().getString(i10));
    }

    public void setDialogTitle(int i10) {
        setDialogTitle(getContext().getString(i10));
    }

    public void setNegativeButtonText(int i10) {
        setNegativeButtonText(getContext().getString(i10));
    }

    public void setPositiveButtonText(int i10) {
        setPositiveButtonText(getContext().getString(i10));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context) {
        this(context, null);
    }
}
