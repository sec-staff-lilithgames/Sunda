package com.google.android.exoplayer2.metadata.icy;

import a.b;
import android.os.Parcel;
import android.os.Parcelable;
import b3.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.a;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import java.util.Arrays;
import ve.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27737b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27738c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27739e;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f27737b = bArr;
        this.f27738c = str;
        this.f27739e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27737b, ((IcyInfo) obj).f27737b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ z0 getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f27737b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(v1 v1Var) {
        String str = this.f27738c;
        if (str != null) {
            v1Var.setTitle(str);
        }
    }

    public String toString() {
        return b.f(this.f27737b.length, "\"", h.b("ICY: title=\"", this.f27738c, "\", url=\"", this.f27739e, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f27737b);
        parcel.writeString(this.f27738c);
        parcel.writeString(this.f27739e);
    }

    public IcyInfo(Parcel parcel) {
        this.f27737b = (byte[]) a.checkNotNull(parcel.createByteArray());
        this.f27738c = parcel.readString();
        this.f27739e = parcel.readString();
    }
}
