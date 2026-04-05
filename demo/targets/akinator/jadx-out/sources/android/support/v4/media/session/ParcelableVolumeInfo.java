package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new k0();

    /* renamed from: b, reason: collision with root package name */
    public final int f4561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4562c;

    /* renamed from: e, reason: collision with root package name */
    public final int f4563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4564f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4565g;

    public ParcelableVolumeInfo(int i10, int i11, int i12, int i13, int i14) {
        this.f4561b = i10;
        this.f4562c = i11;
        this.f4563e = i12;
        this.f4564f = i13;
        this.f4565g = i14;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4561b);
        parcel.writeInt(this.f4563e);
        parcel.writeInt(this.f4564f);
        parcel.writeInt(this.f4565g);
        parcel.writeInt(this.f4562c);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f4561b = parcel.readInt();
        this.f4563e = parcel.readInt();
        this.f4564f = parcel.readInt();
        this.f4565g = parcel.readInt();
        this.f4562c = parcel.readInt();
    }
}
