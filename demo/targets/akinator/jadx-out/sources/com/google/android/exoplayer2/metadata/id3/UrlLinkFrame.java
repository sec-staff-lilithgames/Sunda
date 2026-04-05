package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;
import we.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new m();

    /* renamed from: c, reason: collision with root package name */
    public final String f27776c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27777e;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f27776c = str2;
        this.f27777e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.f27763b.equals(urlLinkFrame.f27763b) && n1.areEqual(this.f27776c, urlLinkFrame.f27776c) && n1.areEqual(this.f27777e, urlLinkFrame.f27777e)) {
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
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f27763b);
        String str = this.f27776c;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27777e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f27763b + ": url=" + this.f27777e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27763b);
        parcel.writeString(this.f27776c);
        parcel.writeString(this.f27777e);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) n1.castNonNull(parcel.readString()));
        this.f27776c = parcel.readString();
        this.f27777e = (String) n1.castNonNull(parcel.readString());
    }
}
