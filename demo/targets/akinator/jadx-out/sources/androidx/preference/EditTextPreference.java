package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.digidust.elokence.akinator.freemium.R;
import g5.t;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String V;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public String f6891b;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6891b);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57317c, i10, i11);
        if (q.getBoolean(typedArrayObtainStyledAttributes, 0, 0, false)) {
            setSummaryProvider(g5.d.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object g(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public String getText() {
        return this.V;
    }

    @Override // androidx.preference.Preference
    public final void h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.h(savedState.getSuperState());
        setText(savedState.f6891b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable i() {
        super.i();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6891b = getText();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void j(Object obj) {
        setText(c((String) obj));
    }

    public void setText(String str) {
        boolean zShouldDisableDependents = shouldDisableDependents();
        this.V = str;
        l(str);
        boolean zShouldDisableDependents2 = shouldDisableDependents();
        if (zShouldDisableDependents2 != zShouldDisableDependents) {
            notifyDependencyChange(zShouldDisableDependents2);
        }
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return TextUtils.isEmpty(this.V) || super.shouldDisableDependents();
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context) {
        this(context, null);
    }

    public void setOnBindEditTextListener(g5.c cVar) {
    }
}
