package io.odeeo.internal.y;

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
    public static final Parcelable.Creator<a> CREATOR = new C0688a();

    /* renamed from: a, reason: collision with root package name */
    public final String f67526a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f67527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67529d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.y.a$a, reason: collision with other inner class name */
    public class C0688a implements Parcelable.Creator<a> {
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

    public /* synthetic */ a(Parcel parcel, C0688a c0688a) {
        this(parcel);
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
            if (this.f67526a.equals(aVar.f67526a) && Arrays.equals(this.f67527b, aVar.f67527b) && this.f67528c == aVar.f67528c && this.f67529d == aVar.f67529d) {
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
        return ((((Arrays.hashCode(this.f67527b) + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f67526a)) * 31) + this.f67528c) * 31) + this.f67529d;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        return "mdta: key=" + this.f67526a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67526a);
        parcel.writeByteArray(this.f67527b);
        parcel.writeInt(this.f67528c);
        parcel.writeInt(this.f67529d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f67526a = str;
        this.f67527b = bArr;
        this.f67528c = i10;
        this.f67529d = i11;
    }

    public a(Parcel parcel) {
        this.f67526a = (String) g0.castNonNull(parcel.readString());
        this.f67527b = (byte[]) g0.castNonNull(parcel.createByteArray());
        this.f67528c = parcel.readInt();
        this.f67529d = parcel.readInt();
    }
}
