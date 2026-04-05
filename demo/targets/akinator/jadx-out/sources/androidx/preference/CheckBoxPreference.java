package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import g5.s;
import g5.t;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final g5.a U;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    @Override // androidx.preference.Preference
    public final void k(View view) {
        performClick();
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            r(view.findViewById(R.id.checkbox));
            q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(s sVar) {
        super.onBindViewHolder(sVar);
        r(sVar.findViewById(R.id.checkbox));
        q(sVar.findViewById(R.id.summary));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.U);
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.U = new g5.a(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57315a, i10, i11);
        setSummaryOn(q.getString(typedArrayObtainStyledAttributes, 5, 0));
        setSummaryOff(q.getString(typedArrayObtainStyledAttributes, 4, 1));
        setDisableDependentsState(q.getBoolean(typedArrayObtainStyledAttributes, 3, 2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, com.digidust.elokence.akinator.freemium.R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }
}
