package ye;

import android.os.Parcel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f94367a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94368b;

    /* renamed from: c, reason: collision with root package name */
    public final long f94369c;

    public d(int i10, long j10, long j11) {
        this.f94367a = i10;
        this.f94368b = j10;
        this.f94369c = j11;
    }

    public static d createFromParcel(Parcel parcel) {
        return new d(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public void writeToParcel(Parcel parcel) {
        parcel.writeInt(this.f94367a);
        parcel.writeLong(this.f94368b);
        parcel.writeLong(this.f94369c);
    }
}
