package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.digidust.elokence.akinator.freemium.R;
import g5.s;
import g5.t;
import g5.x;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final x U;
    public CharSequence V;
    public CharSequence W;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.U = new x(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57325k, i10, i11);
        setSummaryOn(q.getString(typedArrayObtainStyledAttributes, 7, 0));
        setSummaryOff(q.getString(typedArrayObtainStyledAttributes, 6, 1));
        setSwitchTextOn(q.getString(typedArrayObtainStyledAttributes, 9, 3));
        setSwitchTextOff(q.getString(typedArrayObtainStyledAttributes, 8, 4));
        setDisableDependentsState(q.getBoolean(typedArrayObtainStyledAttributes, 5, 2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence getSwitchTextOff() {
        return this.W;
    }

    public CharSequence getSwitchTextOn() {
        return this.V;
    }

    @Override // androidx.preference.Preference
    public final void k(View view) throws Resources.NotFoundException {
        performClick();
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            r(view.findViewById(R.id.switchWidget));
            q(view.findViewById(android.R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(s sVar) throws Resources.NotFoundException {
        super.onBindViewHolder(sVar);
        r(sVar.findViewById(R.id.switchWidget));
        q(sVar.findViewById(android.R.id.summary));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view) throws Resources.NotFoundException {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.V);
            switchCompat.setTextOff(this.W);
            switchCompat.setOnCheckedChangeListener(this.U);
        }
    }

    public void setSwitchTextOff(CharSequence charSequence) {
        this.W = charSequence;
    }

    public void setSwitchTextOn(CharSequence charSequence) {
        this.V = charSequence;
    }

    public void setSwitchTextOff(int i10) {
        setSwitchTextOff(getContext().getString(i10));
    }

    public void setSwitchTextOn(int i10) {
        setSwitchTextOn(getContext().getString(i10));
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }
}
