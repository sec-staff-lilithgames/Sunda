package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import we.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new j();

    /* renamed from: c, reason: collision with root package name */
    public final int f27767c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27768e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27769f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f27770g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f27771h;

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f27767c = i10;
        this.f27768e = i11;
        this.f27769f = i12;
        this.f27770g = iArr;
        this.f27771h = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.f27767c == mlltFrame.f27767c && this.f27768e == mlltFrame.f27768e && this.f27769f == mlltFrame.f27769f && Arrays.equals(this.f27770g, mlltFrame.f27770g) && Arrays.equals(this.f27771h, mlltFrame.f27771h)) {
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
        return Arrays.hashCode(this.f27771h) + ((Arrays.hashCode(this.f27770g) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27767c) * 31) + this.f27768e) * 31) + this.f27769f) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27767c);
        parcel.writeInt(this.f27768e);
        parcel.writeInt(this.f27769f);
        parcel.writeIntArray(this.f27770g);
        parcel.writeIntArray(this.f27771h);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f27767c = parcel.readInt();
        this.f27768e = parcel.readInt();
        this.f27769f = parcel.readInt();
        this.f27770g = (int[]) n1.castNonNull(parcel.createIntArray());
        this.f27771h = (int[]) n1.castNonNull(parcel.createIntArray());
    }
}
