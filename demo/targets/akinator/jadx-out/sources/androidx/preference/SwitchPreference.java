package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import g5.s;
import g5.t;
import g5.w;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final w U;
    public CharSequence V;
    public CharSequence W;

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.U = new w(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57324j, i10, i11);
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
    public final void k(View view) {
        performClick();
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            r(view.findViewById(R.id.switch_widget));
            q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(s sVar) {
        super.onBindViewHolder(sVar);
        r(sVar.findViewById(R.id.switch_widget));
        q(sVar.findViewById(R.id.summary));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.V);
            r42.setTextOff(this.W);
            r42.setOnCheckedChangeListener(this.U);
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

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, com.digidust.elokence.akinator.freemium.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context) {
        this(context, null);
    }
}
