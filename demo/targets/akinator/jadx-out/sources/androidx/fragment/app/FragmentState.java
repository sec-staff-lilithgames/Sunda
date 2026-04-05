package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new c2();

    /* renamed from: b, reason: collision with root package name */
    public final String f6256b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6257c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6258e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6259f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6260g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6261h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6262i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6263j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6264k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f6265l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6266m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6267n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f6268o;

    public FragmentState(Fragment fragment) {
        this.f6256b = fragment.getClass().getName();
        this.f6257c = fragment.mWho;
        this.f6258e = fragment.mFromLayout;
        this.f6259f = fragment.mFragmentId;
        this.f6260g = fragment.mContainerId;
        this.f6261h = fragment.mTag;
        this.f6262i = fragment.mRetainInstance;
        this.f6263j = fragment.mRemoving;
        this.f6264k = fragment.mDetached;
        this.f6265l = fragment.mArguments;
        this.f6266m = fragment.mHidden;
        this.f6267n = fragment.mMaxState.ordinal();
    }

    public final Fragment a(s0 s0Var, ClassLoader classLoader) {
        Fragment fragmentInstantiate = s0Var.instantiate(classLoader, this.f6256b);
        Bundle bundle = this.f6265l;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle);
        fragmentInstantiate.mWho = this.f6257c;
        fragmentInstantiate.mFromLayout = this.f6258e;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = this.f6259f;
        fragmentInstantiate.mContainerId = this.f6260g;
        fragmentInstantiate.mTag = this.f6261h;
        fragmentInstantiate.mRetainInstance = this.f6262i;
        fragmentInstantiate.mRemoving = this.f6263j;
        fragmentInstantiate.mDetached = this.f6264k;
        fragmentInstantiate.mHidden = this.f6266m;
        fragmentInstantiate.mMaxState = androidx.lifecycle.j0.values()[this.f6267n];
        Bundle bundle2 = this.f6268o;
        if (bundle2 != null) {
            fragmentInstantiate.mSavedFragmentState = bundle2;
            return fragmentInstantiate;
        }
        fragmentInstantiate.mSavedFragmentState = new Bundle();
        return fragmentInstantiate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f6256b);
        sb2.append(" (");
        sb2.append(this.f6257c);
        sb2.append(")}:");
        if (this.f6258e) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f6260g;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f6261h;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f6262i) {
            sb2.append(" retainInstance");
        }
        if (this.f6263j) {
            sb2.append(" removing");
        }
        if (this.f6264k) {
            sb2.append(" detached");
        }
        if (this.f6266m) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6256b);
        parcel.writeString(this.f6257c);
        parcel.writeInt(this.f6258e ? 1 : 0);
        parcel.writeInt(this.f6259f);
        parcel.writeInt(this.f6260g);
        parcel.writeString(this.f6261h);
        parcel.writeInt(this.f6262i ? 1 : 0);
        parcel.writeInt(this.f6263j ? 1 : 0);
        parcel.writeInt(this.f6264k ? 1 : 0);
        parcel.writeBundle(this.f6265l);
        parcel.writeInt(this.f6266m ? 1 : 0);
        parcel.writeBundle(this.f6268o);
        parcel.writeInt(this.f6267n);
    }

    public FragmentState(Parcel parcel) {
        this.f6256b = parcel.readString();
        this.f6257c = parcel.readString();
        this.f6258e = parcel.readInt() != 0;
        this.f6259f = parcel.readInt();
        this.f6260g = parcel.readInt();
        this.f6261h = parcel.readString();
        this.f6262i = parcel.readInt() != 0;
        this.f6263j = parcel.readInt() != 0;
        this.f6264k = parcel.readInt() != 0;
        this.f6265l = parcel.readBundle();
        this.f6266m = parcel.readInt() != 0;
        this.f6268o = parcel.readBundle();
        this.f6267n = parcel.readInt();
    }
}
