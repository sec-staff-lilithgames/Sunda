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
import java.util.HashSet;
import java.util.Set;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] V;
    public CharSequence[] W;
    public final HashSet X;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();

        /* renamed from: b, reason: collision with root package name */
        public Set f6893b;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6893b.size());
            Set set = this.f6893b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.X = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57319e, i10, i11);
        this.V = q.getTextArray(typedArrayObtainStyledAttributes, 2, 0);
        this.W = q.getTextArray(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int findIndexOfValue(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.W) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.W[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    public final Object g(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public CharSequence[] getEntries() {
        return this.V;
    }

    public CharSequence[] getEntryValues() {
        return this.W;
    }

    public Set<String> getValues() {
        return this.X;
    }

    @Override // androidx.preference.Preference
    public final void h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.h(savedState.getSuperState());
        setValues(savedState.f6893b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable i() {
        super.i();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6893b = getValues();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void j(Object obj) {
        setValues(getPersistedStringSet((Set) obj));
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        this.V = charSequenceArr;
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
        this.W = charSequenceArr;
    }

    public void setValues(Set<String> set) {
        HashSet hashSet = this.X;
        hashSet.clear();
        hashSet.addAll(set);
        persistStringSet(set);
    }

    public void setEntries(int i10) {
        setEntries(getContext().getResources().getTextArray(i10));
    }

    public void setEntryValues(int i10) {
        setEntryValues(getContext().getResources().getTextArray(i10));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(Context context) {
        this(context, null);
    }
}
