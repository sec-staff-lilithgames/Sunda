package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import we.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f27740c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27741e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27742f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f27743g;

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame.ID);
        this.f27740c = str;
        this.f27741e = str2;
        this.f27742f = i10;
        this.f27743g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.f27742f == apicFrame.f27742f && n1.areEqual(this.f27740c, apicFrame.f27740c) && n1.areEqual(this.f27741e, apicFrame.f27741e) && Arrays.equals(this.f27743g, apicFrame.f27743g)) {
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
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27742f) * 31;
        String str = this.f27740c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27741e;
        return Arrays.hashCode(this.f27743g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(v1 v1Var) {
        v1Var.maybeSetArtworkData(this.f27743g, this.f27742f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f27763b + ": mimeType=" + this.f27740c + ", description=" + this.f27741e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27740c);
        parcel.writeString(this.f27741e);
        parcel.writeInt(this.f27742f);
        parcel.writeByteArray(this.f27743g);
    }

    public ApicFrame(Parcel parcel) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame.ID);
        this.f27740c = (String) n1.castNonNull(parcel.readString());
        this.f27741e = parcel.readString();
        this.f27742f = parcel.readInt();
        this.f27743g = (byte[]) n1.castNonNull(parcel.createByteArray());
    }
}
