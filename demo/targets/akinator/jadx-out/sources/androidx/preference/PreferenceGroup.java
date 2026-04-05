package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import g5.l;
import g5.m;
import g5.r;
import g5.t;
import java.util.ArrayList;
import java.util.Collections;
import n3.q;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final t1 P;
    public final Handler Q;
    public final ArrayList R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public final l W;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* renamed from: b, reason: collision with root package name */
        public int f6918b;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6918b);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.P = new t1();
        this.Q = new Handler(Looper.getMainLooper());
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = Integer.MAX_VALUE;
        this.W = new l(this);
        this.R = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57321g, i10, i11);
        this.S = q.getBoolean(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setInitialExpandedChildrenCount(q.getInt(typedArrayObtainStyledAttributes, 1, 1, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).a(bundle);
        }
    }

    public void addItemFromInflater(Preference preference) {
        addPreference(preference);
    }

    public boolean addPreference(Preference preference) {
        long jLongValue;
        if (!this.R.contains(preference)) {
            if (preference.getKey() != null) {
                PreferenceGroup parent = this;
                while (parent.getParent() != null) {
                    parent = parent.getParent();
                }
                String key = preference.getKey();
                if (parent.findPreference(key) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + key + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.getOrder() == Integer.MAX_VALUE) {
                if (this.S) {
                    int i10 = this.T;
                    this.T = i10 + 1;
                    preference.setOrder(i10);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).setOrderingAsAdded(this.S);
                }
            }
            int iBinarySearch = Collections.binarySearch(this.R, preference);
            if (iBinarySearch < 0) {
                iBinarySearch = (iBinarySearch * (-1)) - 1;
            }
            preference.onParentChanged(this, shouldDisableDependents());
            synchronized (this) {
                this.R.add(iBinarySearch, preference);
            }
            r preferenceManager = getPreferenceManager();
            String key2 = preference.getKey();
            if (key2 == null || !this.P.containsKey(key2)) {
                synchronized (preferenceManager) {
                    jLongValue = preferenceManager.f57302b;
                    preferenceManager.f57302b = 1 + jLongValue;
                }
            } else {
                jLongValue = ((Long) this.P.get(key2)).longValue();
                this.P.remove(key2);
            }
            preference.f6897f = jLongValue;
            preference.f6898g = true;
            try {
                preference.e(preferenceManager);
                preference.f6898g = false;
                if (preference.K != null) {
                    throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                }
                preference.K = this;
                if (this.U) {
                    preference.onAttached();
                }
            } catch (Throwable th2) {
                preference.f6898g = false;
                throw th2;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).b(bundle);
        }
    }

    public <T extends Preference> T findPreference(CharSequence charSequence) {
        T t10;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(getKey(), charSequence)) {
            return this;
        }
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            PreferenceGroup preferenceGroup = (T) getPreference(i10);
            if (TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t10 = (T) preferenceGroup.findPreference(charSequence)) != null) {
                return t10;
            }
        }
        return null;
    }

    public int getInitialExpandedChildrenCount() {
        return this.V;
    }

    public m getOnExpandButtonClickListener() {
        return null;
    }

    public Preference getPreference(int i10) {
        return (Preference) this.R.get(i10);
    }

    public int getPreferenceCount() {
        return this.R.size();
    }

    @Override // androidx.preference.Preference
    public final void h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.V = savedState.f6918b;
        super.h(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable i() {
        super.i();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        int i10 = this.V;
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6918b = i10;
        return savedState;
    }

    public boolean isAttached() {
        return this.U;
    }

    public boolean isOrderingAsAdded() {
        return this.S;
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z10) {
        super.notifyDependencyChange(z10);
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).onParentChanged(this, z10);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.U = true;
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.U = false;
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).onDetached();
        }
    }

    public final boolean q(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.p();
                if (preference.getParent() == this) {
                    preference.K = null;
                }
                zRemove = this.R.remove(preference);
                if (zRemove) {
                    String key = preference.getKey();
                    if (key != null) {
                        this.P.put(key, Long.valueOf(preference.f6897f));
                        this.Q.removeCallbacks(this.W);
                        this.Q.post(this.W);
                    }
                    if (this.U) {
                        preference.onDetached();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    public void removeAll() {
        synchronized (this) {
            try {
                ArrayList arrayList = this.R;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    q((Preference) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean removePreference(Preference preference) {
        return q(preference);
    }

    public boolean removePreferenceRecursively(CharSequence charSequence) {
        Preference preferenceFindPreference = findPreference(charSequence);
        if (preferenceFindPreference == null) {
            return false;
        }
        return preferenceFindPreference.getParent().removePreference(preferenceFindPreference);
    }

    public void setInitialExpandedChildrenCount(int i10) {
        if (i10 != Integer.MAX_VALUE && !hasKey()) {
            Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        this.V = i10;
    }

    public void setOrderingAsAdded(boolean z10) {
        this.S = z10;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setOnExpandButtonClickListener(m mVar) {
    }
}
