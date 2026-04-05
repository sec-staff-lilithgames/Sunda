package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import sb.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23012b;

    public WrappedParcelable(Parcel parcel) {
        this.f23012b = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArr = this.f23012b;
        if (bArr == null) {
            return null;
        }
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Parcelable parcelable = parcelObtain.readParcelable(classLoader);
        parcelObtain.recycle();
        return parcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f23012b);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f23012b = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f23012b = bArr;
    }
}
