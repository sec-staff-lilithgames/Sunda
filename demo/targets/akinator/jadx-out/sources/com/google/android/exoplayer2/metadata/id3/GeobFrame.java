package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import we.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new f();

    /* renamed from: c, reason: collision with root package name */
    public final String f27759c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27760e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27761f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f27762g;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame.ID);
        this.f27759c = str;
        this.f27760e = str2;
        this.f27761f = str3;
        this.f27762g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (n1.areEqual(this.f27759c, geobFrame.f27759c) && n1.areEqual(this.f27760e, geobFrame.f27760e) && n1.areEqual(this.f27761f, geobFrame.f27761f) && Arrays.equals(this.f27762g, geobFrame.f27762g)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ z0 getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        String str = this.f27759c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27760e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27761f;
        return Arrays.hashCode(this.f27762g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f27763b + ": mimeType=" + this.f27759c + ", filename=" + this.f27760e + ", description=" + this.f27761f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27759c);
        parcel.writeString(this.f27760e);
        parcel.writeString(this.f27761f);
        parcel.writeByteArray(this.f27762g);
    }

    public GeobFrame(Parcel parcel) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame.ID);
        this.f27759c = (String) n1.castNonNull(parcel.readString());
        this.f27760e = (String) n1.castNonNull(parcel.readString());
        this.f27761f = (String) n1.castNonNull(parcel.readString());
        this.f27762g = (byte[]) n1.castNonNull(parcel.createByteArray());
    }
}
