package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import g5.h;
import g5.i;
import g5.j;
import g5.k;
import g5.r;
import g5.s;
import g5.t;
import java.util.ArrayList;
import java.util.Set;
import n3.q;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public ArrayList J;
    public PreferenceGroup K;
    public boolean L;
    public i M;
    public j N;
    public final g5.f O;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6894b;

    /* renamed from: c, reason: collision with root package name */
    public r f6895c;

    /* renamed from: e, reason: collision with root package name */
    public k f6896e;

    /* renamed from: f, reason: collision with root package name */
    public long f6897f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6898g;

    /* renamed from: h, reason: collision with root package name */
    public int f6899h;

    /* renamed from: i, reason: collision with root package name */
    public int f6900i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f6901j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6902k;

    /* renamed from: l, reason: collision with root package name */
    public int f6903l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f6904m;

    /* renamed from: n, reason: collision with root package name */
    public String f6905n;

    /* renamed from: o, reason: collision with root package name */
    public Intent f6906o;

    /* renamed from: p, reason: collision with root package name */
    public String f6907p;

    /* renamed from: q, reason: collision with root package name */
    public Bundle f6908q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6909r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6910s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6911t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6912u;

    /* renamed from: v, reason: collision with root package name */
    public String f6913v;

    /* renamed from: w, reason: collision with root package name */
    public Object f6914w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6915x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6916y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6917z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new d();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f6899h = Integer.MAX_VALUE;
        this.f6900i = 0;
        this.f6909r = true;
        this.f6910s = true;
        this.f6912u = true;
        this.f6915x = true;
        this.f6916y = true;
        this.f6917z = true;
        this.A = true;
        this.B = true;
        this.D = true;
        this.G = true;
        this.H = R.layout.preference;
        this.O = new g5.f(this);
        this.f6894b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f57320f, i10, i11);
        this.f6903l = q.getResourceId(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.f6905n = q.getString(typedArrayObtainStyledAttributes, 26, 6);
        this.f6901j = q.getText(typedArrayObtainStyledAttributes, 34, 4);
        this.f6902k = q.getText(typedArrayObtainStyledAttributes, 33, 7);
        this.f6899h = q.getInt(typedArrayObtainStyledAttributes, 28, 8, Integer.MAX_VALUE);
        this.f6907p = q.getString(typedArrayObtainStyledAttributes, 22, 13);
        this.H = q.getResourceId(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.I = q.getResourceId(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.f6909r = q.getBoolean(typedArrayObtainStyledAttributes, 21, 2, true);
        this.f6910s = q.getBoolean(typedArrayObtainStyledAttributes, 30, 5, true);
        this.f6912u = q.getBoolean(typedArrayObtainStyledAttributes, 29, 1, true);
        this.f6913v = q.getString(typedArrayObtainStyledAttributes, 19, 10);
        this.A = q.getBoolean(typedArrayObtainStyledAttributes, 16, 16, this.f6910s);
        this.B = q.getBoolean(typedArrayObtainStyledAttributes, 17, 17, this.f6910s);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f6914w = g(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f6914w = g(typedArrayObtainStyledAttributes, 11);
        }
        this.G = q.getBoolean(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.C = zHasValue;
        if (zHasValue) {
            this.D = q.getBoolean(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.E = q.getBoolean(typedArrayObtainStyledAttributes, 24, 15, false);
        this.f6917z = q.getBoolean(typedArrayObtainStyledAttributes, 25, 25, true);
        this.F = q.getBoolean(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void n(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                n(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        if (!hasKey() || (parcelable = bundle.getParcelable(this.f6905n)) == null) {
            return;
        }
        this.L = false;
        h(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void b(Bundle bundle) {
        if (hasKey()) {
            this.L = false;
            Parcelable parcelableI = i();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableI != null) {
                bundle.putParcelable(this.f6905n, parcelableI);
            }
        }
    }

    public final String c(String str) {
        if (!o()) {
            return str;
        }
        k preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getString(this.f6905n, str) : this.f6895c.getSharedPreferences().getString(this.f6905n, str);
    }

    public boolean callChangeListener(Object obj) {
        return true;
    }

    public final void e(r rVar) {
        long j10;
        this.f6895c = rVar;
        if (!this.f6898g) {
            synchronized (rVar) {
                j10 = rVar.f57302b;
                rVar.f57302b = 1 + j10;
            }
            this.f6897f = j10;
        }
        if (getPreferenceDataStore() != null) {
            j(this.f6914w);
            return;
        }
        if (o() && getSharedPreferences().contains(this.f6905n)) {
            j(null);
            return;
        }
        Object obj = this.f6914w;
        if (obj != null) {
            j(obj);
        }
    }

    public Object g(TypedArray typedArray, int i10) {
        return null;
    }

    public Context getContext() {
        return this.f6894b;
    }

    public String getDependency() {
        return this.f6913v;
    }

    public Bundle getExtras() {
        if (this.f6908q == null) {
            this.f6908q = new Bundle();
        }
        return this.f6908q;
    }

    public String getFragment() {
        return this.f6907p;
    }

    public Drawable getIcon() {
        int i10;
        if (this.f6904m == null && (i10 = this.f6903l) != 0) {
            this.f6904m = l.a.getDrawable(this.f6894b, i10);
        }
        return this.f6904m;
    }

    public Intent getIntent() {
        return this.f6906o;
    }

    public String getKey() {
        return this.f6905n;
    }

    public final int getLayoutResource() {
        return this.H;
    }

    public g5.g getOnPreferenceChangeListener() {
        return null;
    }

    public h getOnPreferenceClickListener() {
        return null;
    }

    public int getOrder() {
        return this.f6899h;
    }

    public PreferenceGroup getParent() {
        return this.K;
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!o()) {
            return set;
        }
        k preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getStringSet(this.f6905n, set) : this.f6895c.getSharedPreferences().getStringSet(this.f6905n, set);
    }

    public k getPreferenceDataStore() {
        k kVar = this.f6896e;
        if (kVar != null) {
            return kVar;
        }
        r rVar = this.f6895c;
        if (rVar != null) {
            return rVar.getPreferenceDataStore();
        }
        return null;
    }

    public r getPreferenceManager() {
        return this.f6895c;
    }

    public SharedPreferences getSharedPreferences() {
        if (this.f6895c == null || getPreferenceDataStore() != null) {
            return null;
        }
        return this.f6895c.getSharedPreferences();
    }

    public boolean getShouldDisableView() {
        return this.G;
    }

    public CharSequence getSummary() {
        return getSummaryProvider() != null ? getSummaryProvider().provideSummary(this) : this.f6902k;
    }

    public final j getSummaryProvider() {
        return this.N;
    }

    public CharSequence getTitle() {
        return this.f6901j;
    }

    public final int getWidgetLayoutResource() {
        return this.I;
    }

    public void h(Parcelable parcelable) {
        this.L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.f6905n);
    }

    public Parcelable i() {
        this.L = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public boolean isCopyingEnabled() {
        return this.F;
    }

    public boolean isEnabled() {
        return this.f6909r && this.f6915x && this.f6916y;
    }

    public boolean isIconSpaceReserved() {
        return this.E;
    }

    public boolean isPersistent() {
        return this.f6912u;
    }

    public boolean isSelectable() {
        return this.f6910s;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().getPreferenceScreen()) {
            return true;
        }
        PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    public boolean isSingleLineTitle() {
        return this.D;
    }

    public final boolean isVisible() {
        return this.f6917z;
    }

    public void k(View view) {
        performClick();
    }

    public final void l(String str) {
        if (o() && !TextUtils.equals(str, c(null))) {
            k preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                preferenceDataStore.putString(this.f6905n, str);
                return;
            }
            SharedPreferences.Editor editorB = this.f6895c.b();
            editorB.putString(this.f6905n, str);
            if (this.f6895c.f57306f) {
                return;
            }
            editorB.apply();
        }
    }

    public final void m() {
        if (TextUtils.isEmpty(this.f6913v)) {
            return;
        }
        String str = this.f6913v;
        r rVar = this.f6895c;
        Preference preferenceFindPreference = rVar == null ? null : rVar.findPreference(str);
        if (preferenceFindPreference != null) {
            if (preferenceFindPreference.J == null) {
                preferenceFindPreference.J = new ArrayList();
            }
            preferenceFindPreference.J.add(this);
            onDependencyChanged(preferenceFindPreference, preferenceFindPreference.shouldDisableDependents());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f6913v + "\" not found for preference \"" + this.f6905n + "\" (title: \"" + ((Object) this.f6901j) + "\"");
    }

    public void notifyDependencyChange(boolean z10) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Preference) arrayList.get(i10)).onDependencyChanged(this, z10);
        }
    }

    public final boolean o() {
        return this.f6895c != null && isPersistent() && hasKey();
    }

    public void onAttached() {
        m();
    }

    public void onBindViewHolder(s sVar) {
        Integer numValueOf;
        View view = sVar.itemView;
        view.setOnClickListener(this.O);
        view.setId(this.f6900i);
        TextView textView = (TextView) sVar.findViewById(android.R.id.summary);
        if (textView != null) {
            CharSequence summary = getSummary();
            if (TextUtils.isEmpty(summary)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(summary);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) sVar.findViewById(android.R.id.title);
        if (textView2 != null) {
            CharSequence title = getTitle();
            if (TextUtils.isEmpty(title)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(title);
                textView2.setVisibility(0);
                if (this.C) {
                    textView2.setSingleLine(this.D);
                }
                if (!isSelectable() && isEnabled() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) sVar.findViewById(android.R.id.icon);
        if (imageView != null) {
            int i10 = this.f6903l;
            if (i10 != 0 || this.f6904m != null) {
                if (this.f6904m == null) {
                    this.f6904m = l.a.getDrawable(this.f6894b, i10);
                }
                Drawable drawable = this.f6904m;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f6904m != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.E ? 4 : 8);
            }
        }
        View viewFindViewById = sVar.findViewById(R.id.icon_frame);
        if (viewFindViewById == null) {
            viewFindViewById = sVar.findViewById(android.R.id.icon_frame);
        }
        if (viewFindViewById != null) {
            if (this.f6904m != null) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(this.E ? 4 : 8);
            }
        }
        if (this.G) {
            n(view, isEnabled());
        } else {
            n(view, true);
        }
        boolean zIsSelectable = isSelectable();
        view.setFocusable(zIsSelectable);
        view.setClickable(zIsSelectable);
        sVar.setDividerAllowedAbove(this.A);
        sVar.setDividerAllowedBelow(this.B);
        boolean zIsCopyingEnabled = isCopyingEnabled();
        if (zIsCopyingEnabled && this.M == null) {
            this.M = new i(this);
        }
        view.setOnCreateContextMenuListener(zIsCopyingEnabled ? this.M : null);
        view.setLongClickable(zIsCopyingEnabled);
        if (!zIsCopyingEnabled || zIsSelectable) {
            return;
        }
        z1.setBackground(view, null);
    }

    public void onDependencyChanged(Preference preference, boolean z10) {
        if (this.f6915x == z10) {
            this.f6915x = !z10;
            notifyDependencyChange(shouldDisableDependents());
            d();
        }
    }

    public void onDetached() {
        p();
    }

    public void onParentChanged(Preference preference, boolean z10) {
        if (this.f6916y == z10) {
            this.f6916y = !z10;
            notifyDependencyChange(shouldDisableDependents());
            d();
        }
    }

    public final void p() {
        ArrayList arrayList;
        String str = this.f6913v;
        if (str != null) {
            r rVar = this.f6895c;
            Preference preferenceFindPreference = rVar == null ? null : rVar.findPreference(str);
            if (preferenceFindPreference == null || (arrayList = preferenceFindPreference.J) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Bundle peekExtras() {
        return this.f6908q;
    }

    public void performClick() {
        if (isEnabled() && isSelectable()) {
            f();
            r preferenceManager = getPreferenceManager();
            if (preferenceManager != null) {
                preferenceManager.getOnPreferenceTreeClickListener();
            }
            if (this.f6906o != null) {
                getContext().startActivity(this.f6906o);
            }
        }
    }

    public boolean persistStringSet(Set<String> set) {
        if (!o()) {
            return false;
        }
        if (!set.equals(getPersistedStringSet(null))) {
            k preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                preferenceDataStore.putStringSet(this.f6905n, set);
                return true;
            }
            SharedPreferences.Editor editorB = this.f6895c.b();
            editorB.putStringSet(this.f6905n, set);
            if (!this.f6895c.f57306f) {
                editorB.apply();
            }
        }
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        a(bundle);
    }

    public void saveHierarchyState(Bundle bundle) {
        b(bundle);
    }

    public void setCopyingEnabled(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            d();
        }
    }

    public void setDefaultValue(Object obj) {
        this.f6914w = obj;
    }

    public void setDependency(String str) {
        p();
        this.f6913v = str;
        m();
    }

    public void setEnabled(boolean z10) {
        if (this.f6909r != z10) {
            this.f6909r = z10;
            notifyDependencyChange(shouldDisableDependents());
            d();
        }
    }

    public void setFragment(String str) {
        this.f6907p = str;
    }

    public void setIcon(Drawable drawable) {
        if (this.f6904m != drawable) {
            this.f6904m = drawable;
            this.f6903l = 0;
            d();
        }
    }

    public void setIconSpaceReserved(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            d();
        }
    }

    public void setIntent(Intent intent) {
        this.f6906o = intent;
    }

    public void setKey(String str) {
        this.f6905n = str;
        if (!this.f6911t || hasKey()) {
            return;
        }
        if (TextUtils.isEmpty(this.f6905n)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f6911t = true;
    }

    public void setLayoutResource(int i10) {
        this.H = i10;
    }

    public void setOrder(int i10) {
        if (i10 != this.f6899h) {
            this.f6899h = i10;
        }
    }

    public void setPersistent(boolean z10) {
        this.f6912u = z10;
    }

    public void setPreferenceDataStore(k kVar) {
        this.f6896e = kVar;
    }

    public void setSelectable(boolean z10) {
        if (this.f6910s != z10) {
            this.f6910s = z10;
            d();
        }
    }

    public void setShouldDisableView(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            d();
        }
    }

    public void setSingleLineTitle(boolean z10) {
        this.C = true;
        this.D = z10;
    }

    public void setSummary(CharSequence charSequence) {
        if (getSummaryProvider() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f6902k, charSequence)) {
            return;
        }
        this.f6902k = charSequence;
        d();
    }

    public final void setSummaryProvider(j jVar) {
        this.N = jVar;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6901j)) {
            return;
        }
        this.f6901j = charSequence;
        d();
    }

    public void setViewId(int i10) {
        this.f6900i = i10;
    }

    public final void setVisible(boolean z10) {
        if (this.f6917z != z10) {
            this.f6917z = z10;
        }
    }

    public void setWidgetLayoutResource(int i10) {
        this.I = i10;
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb2.append(title);
            sb2.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb2.append(summary);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        int i10 = this.f6899h;
        int i11 = preference.f6899h;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f6901j;
        CharSequence charSequence2 = preference.f6901j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f6901j.toString());
    }

    public void setTitle(int i10) {
        setTitle(this.f6894b.getString(i10));
    }

    public void setIcon(int i10) {
        setIcon(l.a.getDrawable(this.f6894b, i10));
        this.f6903l = i10;
    }

    public void setSummary(int i10) {
        setSummary(this.f6894b.getString(i10));
    }

    public void d() {
    }

    public void f() {
    }

    public void j(Object obj) {
    }

    @Deprecated
    public void onInitializeAccessibilityNodeInfo(y3.c cVar) {
    }

    public void setOnPreferenceChangeListener(g5.g gVar) {
    }

    public void setOnPreferenceClickListener(h hVar) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.getAttr(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
