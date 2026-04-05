package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.digidust.elokence.akinator.freemium.R;
import g5.t;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] V;
    public CharSequence[] W;
    public String X;
    public String Y;
    public boolean Z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public String f6892b;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6892b);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57318d, i10, i11);
        this.V = q.getTextArray(typedArrayObtainStyledAttributes, 2, 0);
        this.W = q.getTextArray(typedArrayObtainStyledAttributes, 3, 1);
        if (q.getBoolean(typedArrayObtainStyledAttributes, 4, 4, false)) {
            setSummaryProvider(g5.e.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t.f57320f, i10, i11);
        this.Y = q.getString(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
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
        return typedArray.getString(i10);
    }

    public CharSequence[] getEntries() {
        return this.V;
    }

    public CharSequence getEntry() {
        CharSequence[] charSequenceArr;
        int iFindIndexOfValue = findIndexOfValue(this.X);
        if (iFindIndexOfValue < 0 || (charSequenceArr = this.V) == null) {
            return null;
        }
        return charSequenceArr[iFindIndexOfValue];
    }

    public CharSequence[] getEntryValues() {
        return this.W;
    }

    @Override // androidx.preference.Preference
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        CharSequence entry = getEntry();
        CharSequence summary = super.getSummary();
        String str = this.Y;
        if (str != null) {
            if (entry == null) {
                entry = "";
            }
            String str2 = String.format(str, entry);
            if (!TextUtils.equals(str2, summary)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return summary;
    }

    public String getValue() {
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
        setValue(savedState.f6892b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable i() {
        super.i();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6892b = getValue();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void j(Object obj) {
        setValue(c((String) obj));
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        this.V = charSequenceArr;
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
        this.W = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    public void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.Y = null;
        } else {
            this.Y = charSequence.toString();
        }
    }

    public void setValue(String str) {
        boolean zEquals = TextUtils.equals(this.X, str);
        if (zEquals && this.Z) {
            return;
        }
        this.X = str;
        this.Z = true;
        l(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public void setValueIndex(int i10) {
        CharSequence[] charSequenceArr = this.W;
        if (charSequenceArr != null) {
            setValue(charSequenceArr[i10].toString());
        }
    }

    public void setEntries(int i10) {
        setEntries(getContext().getResources().getTextArray(i10));
    }

    public void setEntryValues(int i10) {
        setEntryValues(getContext().getResources().getTextArray(i10));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
