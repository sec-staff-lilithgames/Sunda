package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import we.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new i();

    /* renamed from: c, reason: collision with root package name */
    public final String f27764c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27765e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27766f;

    public InternalFrame(String str, String str2, String str3) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame.ID);
        this.f27764c = str;
        this.f27765e = str2;
        this.f27766f = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (n1.areEqual(this.f27765e, internalFrame.f27765e) && n1.areEqual(this.f27764c, internalFrame.f27764c) && n1.areEqual(this.f27766f, internalFrame.f27766f)) {
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
        String str = this.f27764c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27765e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27766f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f27763b + ": domain=" + this.f27764c + ", description=" + this.f27765e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27763b);
        parcel.writeString(this.f27764c);
        parcel.writeString(this.f27766f);
    }

    public InternalFrame(Parcel parcel) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame.ID);
        this.f27764c = (String) n1.castNonNull(parcel.readString());
        this.f27765e = (String) n1.castNonNull(parcel.readString());
        this.f27766f = (String) n1.castNonNull(parcel.readString());
    }
}
