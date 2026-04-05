package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import h4.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f5786b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbsSavedState f5785c = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.f5786b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.f5786b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5786b, i10);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5786b = parcelable == f5785c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f5786b = parcelable == null ? f5785c : parcelable;
    }
}
