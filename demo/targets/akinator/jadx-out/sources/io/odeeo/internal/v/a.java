package io.odeeo.internal.v;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0676a();

    /* renamed from: a, reason: collision with root package name */
    public final int f67242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67243b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67245d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67246e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67247f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67248g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f67249h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.v.a$a, reason: collision with other inner class name */
    public class C0676a implements Parcelable.Creator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f67242a = i10;
        this.f67243b = str;
        this.f67244c = str2;
        this.f67245d = i11;
        this.f67246e = i12;
        this.f67247f = i13;
        this.f67248g = i14;
        this.f67249h = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f67242a == aVar.f67242a && this.f67243b.equals(aVar.f67243b) && this.f67244c.equals(aVar.f67244c) && this.f67245d == aVar.f67245d && this.f67246e == aVar.f67246e && this.f67247f == aVar.f67247f && this.f67248g == aVar.f67248g && Arrays.equals(this.f67249h, aVar.f67249h)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ t getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67249h) + ((((((((o2.e(o2.e((this.f67242a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31, this.f67243b), 31, this.f67244c) + this.f67245d) * 31) + this.f67246e) * 31) + this.f67247f) * 31) + this.f67248g) * 31);
    }

    @Override // io.odeeo.internal.s.a.b
    public void populateMediaMetadata(a0.b bVar) {
        bVar.maybeSetArtworkData(this.f67249h, this.f67242a);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f67243b + ", description=" + this.f67244c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f67242a);
        parcel.writeString(this.f67243b);
        parcel.writeString(this.f67244c);
        parcel.writeInt(this.f67245d);
        parcel.writeInt(this.f67246e);
        parcel.writeInt(this.f67247f);
        parcel.writeInt(this.f67248g);
        parcel.writeByteArray(this.f67249h);
    }

    public a(Parcel parcel) {
        this.f67242a = parcel.readInt();
        this.f67243b = (String) g0.castNonNull(parcel.readString());
        this.f67244c = (String) g0.castNonNull(parcel.readString());
        this.f67245d = parcel.readInt();
        this.f67246e = parcel.readInt();
        this.f67247f = parcel.readInt();
        this.f67248g = parcel.readInt();
        this.f67249h = (byte[]) g0.castNonNull(parcel.createByteArray());
    }
}
