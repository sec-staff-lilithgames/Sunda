package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6212b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6213c;

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f6212b = arrayList;
        this.f6213c = arrayList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f6212b);
        parcel.writeTypedList(this.f6213c);
    }

    public BackStackState(Parcel parcel) {
        this.f6212b = parcel.createStringArrayList();
        this.f6213c = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
