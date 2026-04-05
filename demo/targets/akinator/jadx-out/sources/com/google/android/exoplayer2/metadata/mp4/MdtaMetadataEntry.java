package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new xe.a();

    /* renamed from: b, reason: collision with root package name */
    public final String f27778b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27779c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27780e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27781f;

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f27778b = str;
        this.f27779c = bArr;
        this.f27780e = i10;
        this.f27781f = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.f27778b.equals(mdtaMetadataEntry.f27778b) && Arrays.equals(this.f27779c, mdtaMetadataEntry.f27779c) && this.f27780e == mdtaMetadataEntry.f27780e && this.f27781f == mdtaMetadataEntry.f27781f) {
                return true;
            }
        }
        return false;
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
        return ((((Arrays.hashCode(this.f27779c) + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f27778b)) * 31) + this.f27780e) * 31) + this.f27781f;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    public String toString() {
        byte[] bArr = this.f27779c;
        int i10 = this.f27781f;
        return a.b.o(new StringBuilder("mdta: key="), this.f27778b, ", value=", i10 != 1 ? i10 != 23 ? i10 != 67 ? n1.toHexString(bArr) : String.valueOf(n1.toInteger(bArr)) : String.valueOf(n1.toFloat(bArr)) : n1.fromUtf8Bytes(bArr));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27778b);
        parcel.writeByteArray(this.f27779c);
        parcel.writeInt(this.f27780e);
        parcel.writeInt(this.f27781f);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f27778b = (String) n1.castNonNull(parcel.readString());
        this.f27779c = (byte[]) n1.castNonNull(parcel.createByteArray());
        this.f27780e = parcel.readInt();
        this.f27781f = parcel.readInt();
    }
}
