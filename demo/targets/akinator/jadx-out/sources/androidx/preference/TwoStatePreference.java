package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import g5.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean P;
    public CharSequence Q;
    public CharSequence R;
    public boolean S;
    public boolean T;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();

        /* renamed from: b, reason: collision with root package name */
        public boolean f6923b;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6923b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public final void f() {
        boolean z10 = !isChecked();
        if (callChangeListener(Boolean.valueOf(z10))) {
            setChecked(z10);
        }
    }

    @Override // androidx.preference.Preference
    public final Object g(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    public boolean getDisableDependentsState() {
        return this.T;
    }

    public CharSequence getSummaryOff() {
        return this.R;
    }

    public CharSequence getSummaryOn() {
        return this.Q;
    }

    @Override // androidx.preference.Preference
    public final void h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.h(savedState.getSuperState());
        setChecked(savedState.f6923b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable i() {
        super.i();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6923b = isChecked();
        return savedState;
    }

    public boolean isChecked() {
        return this.P;
    }

    @Override // androidx.preference.Preference
    public final void j(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (o()) {
            k preferenceDataStore = getPreferenceDataStore();
            zBooleanValue = preferenceDataStore != null ? preferenceDataStore.getBoolean(this.f6905n, zBooleanValue) : this.f6895c.getSharedPreferences().getBoolean(this.f6905n, zBooleanValue);
        }
        setChecked(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.P
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.Q
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.P
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.R
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.getSummary()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.q(android.view.View):void");
    }

    public void setChecked(boolean z10) {
        boolean z11 = this.P != z10;
        if (z11 || !this.S) {
            this.P = z10;
            this.S = true;
            if (o()) {
                boolean z12 = !z10;
                if (o()) {
                    k preferenceDataStore = getPreferenceDataStore();
                    z12 = preferenceDataStore != null ? preferenceDataStore.getBoolean(this.f6905n, z12) : this.f6895c.getSharedPreferences().getBoolean(this.f6905n, z12);
                }
                if (z10 != z12) {
                    k preferenceDataStore2 = getPreferenceDataStore();
                    if (preferenceDataStore2 != null) {
                        preferenceDataStore2.putBoolean(this.f6905n, z10);
                    } else {
                        SharedPreferences.Editor editorB = this.f6895c.b();
                        editorB.putBoolean(this.f6905n, z10);
                        if (!this.f6895c.f57306f) {
                            editorB.apply();
                        }
                    }
                }
            }
            if (z11) {
                notifyDependencyChange(shouldDisableDependents());
            }
        }
    }

    public void setDisableDependentsState(boolean z10) {
        this.T = z10;
    }

    public void setSummaryOff(CharSequence charSequence) {
        this.R = charSequence;
        isChecked();
    }

    public void setSummaryOn(CharSequence charSequence) {
        this.Q = charSequence;
        isChecked();
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return (this.T ? this.P : !this.P) || super.shouldDisableDependents();
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setSummaryOff(int i10) {
        setSummaryOff(getContext().getString(i10));
    }

    public void setSummaryOn(int i10) {
        setSummaryOn(getContext().getString(i10));
    }

    public TwoStatePreference(Context context) {
        this(context, null);
    }
}
