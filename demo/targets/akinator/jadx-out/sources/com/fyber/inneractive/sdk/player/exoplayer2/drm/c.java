package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.UUID;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public int f24632a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f24633b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24634c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f24635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24636e;

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f24633b = uuid;
        this.f24634c = str;
        bArr.getClass();
        this.f24635d = bArr;
        this.f24636e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.f24634c.equals(cVar.f24634c) && z.a(this.f24633b, cVar.f24633b) && Arrays.equals(this.f24635d, cVar.f24635d);
    }

    public final int hashCode() {
        if (this.f24632a == 0) {
            this.f24632a = Arrays.hashCode(this.f24635d) + o2.e(this.f24633b.hashCode() * 31, 31, this.f24634c);
        }
        return this.f24632a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24633b.getMostSignificantBits());
        parcel.writeLong(this.f24633b.getLeastSignificantBits());
        parcel.writeString(this.f24634c);
        parcel.writeByteArray(this.f24635d);
        parcel.writeByte(this.f24636e ? (byte) 1 : (byte) 0);
    }

    public c(Parcel parcel) {
        this.f24633b = new UUID(parcel.readLong(), parcel.readLong());
        this.f24634c = parcel.readString();
        this.f24635d = parcel.createByteArray();
        this.f24636e = parcel.readByte() != 0;
    }
}
