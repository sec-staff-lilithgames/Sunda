package io.odeeo.internal.z;

import android.os.Parcel;
import android.os.Parcelable;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0696a();

    /* renamed from: a, reason: collision with root package name */
    public final long f67746a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67747b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f67748c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.z.a$a, reason: collision with other inner class name */
    public class C0696a implements Parcelable.Creator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public /* synthetic */ a(Parcel parcel, C0696a c0696a) {
        this(parcel);
    }

    public static a a(x xVar, int i10, long j10) {
        long unsignedInt = xVar.readUnsignedInt();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        xVar.readBytes(bArr, 0, i11);
        return new a(unsignedInt, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f67746a);
        parcel.writeLong(this.f67747b);
        parcel.writeByteArray(this.f67748c);
    }

    public a(long j10, byte[] bArr, long j11) {
        this.f67746a = j11;
        this.f67747b = j10;
        this.f67748c = bArr;
    }

    public a(Parcel parcel) {
        this.f67746a = parcel.readLong();
        this.f67747b = parcel.readLong();
        this.f67748c = (byte[]) g0.castNonNull(parcel.createByteArray());
    }
}
