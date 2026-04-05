package io.bidmachine.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gn.o1;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new o1();

    /* renamed from: f, reason: collision with root package name */
    public static final String f60621f = a1.intToStringMaxRadix(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f60622g = a1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f60623h = a1.intToStringMaxRadix(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f60624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60625c;

    /* renamed from: e, reason: collision with root package name */
    public final int f60626e;

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    public static StreamKey fromBundle(Bundle bundle) {
        return new StreamKey(bundle.getInt(f60621f, 0), bundle.getInt(f60622g, 0), bundle.getInt(f60623h, 0));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f60624b == streamKey.f60624b && this.f60625c == streamKey.f60625c && this.f60626e == streamKey.f60626e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f60624b * 31) + this.f60625c) * 31) + this.f60626e;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f60624b;
        if (i10 != 0) {
            bundle.putInt(f60621f, i10);
        }
        int i11 = this.f60625c;
        if (i11 != 0) {
            bundle.putInt(f60622g, i11);
        }
        int i12 = this.f60626e;
        if (i12 != 0) {
            bundle.putInt(f60623h, i12);
        }
        return bundle;
    }

    public String toString() {
        return this.f60624b + "." + this.f60625c + "." + this.f60626e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f60624b);
        parcel.writeInt(this.f60625c);
        parcel.writeInt(this.f60626e);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f60624b = i10;
        this.f60625c = i11;
        this.f60626e = i12;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f60624b - streamKey.f60624b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f60625c - streamKey.f60625c;
        return i11 == 0 ? this.f60626e - streamKey.f60626e : i11;
    }

    public StreamKey(Parcel parcel) {
        this.f60624b = parcel.readInt();
        this.f60625c = parcel.readInt();
        this.f60626e = parcel.readInt();
    }
}
