package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.digidust.elokence.akinator.freemium.R;
import g5.k;
import g5.s;
import g5.t;
import g5.u;
import g5.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public SeekBar U;
    public TextView V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final u Z;

    /* renamed from: a0, reason: collision with root package name */
    public final v f6919a0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();

        /* renamed from: b, reason: collision with root package name */
        public int f6920b;

        /* renamed from: c, reason: collision with root package name */
        public int f6921c;

        /* renamed from: e, reason: collision with root package name */
        public int f6922e;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6920b);
            parcel.writeInt(this.f6921c);
            parcel.writeInt(this.f6922e);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Z = new u(this);
        this.f6919a0 = new v(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57323i, i10, i11);
        this.Q = typedArrayObtainStyledAttributes.getInt(3, 0);
        setMax(typedArrayObtainStyledAttributes.getInt(1, 100));
        setSeekBarIncrement(typedArrayObtainStyledAttributes.getInt(4, 0));
        this.W = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.X = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.Y = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object g(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public int getMax() {
        return this.R;
    }

    public int getMin() {
        return this.Q;
    }

    public final int getSeekBarIncrement() {
        return this.S;
    }

    public boolean getShowSeekBarValue() {
        return this.X;
    }

    public boolean getUpdatesContinuously() {
        return this.Y;
    }

    public int getValue() {
        return this.P;
    }

    @Override // androidx.preference.Preference
    public final void h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.h(savedState.getSuperState());
        this.P = savedState.f6920b;
        this.Q = savedState.f6921c;
        this.R = savedState.f6922e;
    }

    @Override // androidx.preference.Preference
    public final Parcelable i() {
        super.i();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6920b = this.P;
        savedState.f6921c = this.Q;
        savedState.f6922e = this.R;
        return savedState;
    }

    public boolean isAdjustable() {
        return this.W;
    }

    @Override // androidx.preference.Preference
    public final void j(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (o()) {
            k preferenceDataStore = getPreferenceDataStore();
            iIntValue = preferenceDataStore != null ? preferenceDataStore.getInt(this.f6905n, iIntValue) : this.f6895c.getSharedPreferences().getInt(this.f6905n, iIntValue);
        }
        setValue(iIntValue);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(s sVar) {
        super.onBindViewHolder(sVar);
        sVar.itemView.setOnKeyListener(this.f6919a0);
        this.U = (SeekBar) sVar.findViewById(R.id.seekbar);
        TextView textView = (TextView) sVar.findViewById(R.id.seekbar_value);
        this.V = textView;
        if (this.X) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.V = null;
        }
        SeekBar seekBar = this.U;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.Z);
        this.U.setMax(this.R - this.Q);
        int i10 = this.S;
        if (i10 != 0) {
            this.U.setKeyProgressIncrement(i10);
        } else {
            this.S = this.U.getKeyProgressIncrement();
        }
        this.U.setProgress(this.P - this.Q);
        int i11 = this.P;
        TextView textView2 = this.V;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i11));
        }
        this.U.setEnabled(isEnabled());
    }

    public final void q(int i10) {
        int i11 = this.Q;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.R;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.P) {
            this.P = i10;
            TextView textView = this.V;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
            }
            if (o()) {
                int i13 = ~i10;
                if (o()) {
                    k preferenceDataStore = getPreferenceDataStore();
                    i13 = preferenceDataStore != null ? preferenceDataStore.getInt(this.f6905n, i13) : this.f6895c.getSharedPreferences().getInt(this.f6905n, i13);
                }
                if (i10 == i13) {
                    return;
                }
                k preferenceDataStore2 = getPreferenceDataStore();
                if (preferenceDataStore2 != null) {
                    preferenceDataStore2.putInt(this.f6905n, i10);
                    return;
                }
                SharedPreferences.Editor editorB = this.f6895c.b();
                editorB.putInt(this.f6905n, i10);
                if (this.f6895c.f57306f) {
                    return;
                }
                editorB.apply();
            }
        }
    }

    public final void r(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.Q;
        if (progress != this.P) {
            if (callChangeListener(Integer.valueOf(progress))) {
                q(progress);
                return;
            }
            seekBar.setProgress(this.P - this.Q);
            int i10 = this.P;
            TextView textView = this.V;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
            }
        }
    }

    public void setAdjustable(boolean z10) {
        this.W = z10;
    }

    public final void setMax(int i10) {
        int i11 = this.Q;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.R) {
            this.R = i10;
        }
    }

    public void setMin(int i10) {
        int i11 = this.R;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 != this.Q) {
            this.Q = i10;
        }
    }

    public final void setSeekBarIncrement(int i10) {
        if (i10 != this.S) {
            this.S = Math.min(this.R - this.Q, Math.abs(i10));
        }
    }

    public void setShowSeekBarValue(boolean z10) {
        this.X = z10;
    }

    public void setUpdatesContinuously(boolean z10) {
        this.Y = z10;
    }

    public void setValue(int i10) {
        q(i10);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context) {
        this(context, null);
    }
}
