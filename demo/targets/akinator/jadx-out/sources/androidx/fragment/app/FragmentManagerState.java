package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new v1();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f6248b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f6249c;

    /* renamed from: e, reason: collision with root package name */
    public BackStackRecordState[] f6250e;

    /* renamed from: f, reason: collision with root package name */
    public int f6251f;

    /* renamed from: g, reason: collision with root package name */
    public String f6252g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6253h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6254i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f6255j;

    public FragmentManagerState() {
        this.f6252g = null;
        this.f6253h = new ArrayList();
        this.f6254i = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f6248b);
        parcel.writeStringList(this.f6249c);
        parcel.writeTypedArray(this.f6250e, i10);
        parcel.writeInt(this.f6251f);
        parcel.writeString(this.f6252g);
        parcel.writeStringList(this.f6253h);
        parcel.writeTypedList(this.f6254i);
        parcel.writeTypedList(this.f6255j);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f6252g = null;
        this.f6253h = new ArrayList();
        this.f6254i = new ArrayList();
        this.f6248b = parcel.createStringArrayList();
        this.f6249c = parcel.createStringArrayList();
        this.f6250e = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f6251f = parcel.readInt();
        this.f6252g = parcel.readString();
        this.f6253h = parcel.createStringArrayList();
        this.f6254i = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f6255j = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
