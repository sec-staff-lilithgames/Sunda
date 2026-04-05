package com.google.android.exoplayer2.offline;

import af.u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable, i {
    public static final Parcelable.Creator<StreamKey> CREATOR = new u();

    /* renamed from: f, reason: collision with root package name */
    public static final String f27885f = n1.intToStringMaxRadix(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f27886g = n1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27887h = n1.intToStringMaxRadix(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f27888b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27889c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27890e;

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    public static StreamKey fromBundle(Bundle bundle) {
        return new StreamKey(bundle.getInt(f27885f, 0), bundle.getInt(f27886g, 0), bundle.getInt(f27887h, 0));
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
            if (this.f27888b == streamKey.f27888b && this.f27889c == streamKey.f27889c && this.f27890e == streamKey.f27890e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f27888b * 31) + this.f27889c) * 31) + this.f27890e;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f27888b;
        if (i10 != 0) {
            bundle.putInt(f27885f, i10);
        }
        int i11 = this.f27889c;
        if (i11 != 0) {
            bundle.putInt(f27886g, i11);
        }
        int i12 = this.f27890e;
        if (i12 != 0) {
            bundle.putInt(f27887h, i12);
        }
        return bundle;
    }

    public String toString() {
        return this.f27888b + "." + this.f27889c + "." + this.f27890e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27888b);
        parcel.writeInt(this.f27889c);
        parcel.writeInt(this.f27890e);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f27888b = i10;
        this.f27889c = i11;
        this.f27890e = i12;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f27888b - streamKey.f27888b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f27889c - streamKey.f27889c;
        return i11 == 0 ? this.f27890e - streamKey.f27890e : i11;
    }

    public StreamKey(Parcel parcel) {
        this.f27888b = parcel.readInt();
        this.f27889c = parcel.readInt();
        this.f27890e = parcel.readInt();
    }
}
