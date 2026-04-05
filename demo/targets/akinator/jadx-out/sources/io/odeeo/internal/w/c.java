package io.odeeo.internal.w;

import android.os.Parcel;
import android.os.Parcelable;
import b3.h;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.s.a;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f67299a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67300b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67301c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<c> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f67299a = bArr;
        this.f67300b = str;
        this.f67301c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f67299a, ((c) obj).f67299a);
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
        return Arrays.hashCode(this.f67299a);
    }

    @Override // io.odeeo.internal.s.a.b
    public void populateMediaMetadata(a0.b bVar) {
        String str = this.f67300b;
        if (str != null) {
            bVar.setTitle(str);
        }
    }

    public String toString() {
        return a.b.f(this.f67299a.length, "\"", h.b("ICY: title=\"", this.f67300b, "\", url=\"", this.f67301c, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f67299a);
        parcel.writeString(this.f67300b);
        parcel.writeString(this.f67301c);
    }

    public c(Parcel parcel) {
        this.f67299a = (byte[]) io.odeeo.internal.q0.a.checkNotNull(parcel.createByteArray());
        this.f67300b = parcel.readString();
        this.f67301c = parcel.readString();
    }
}
