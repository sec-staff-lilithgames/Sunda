package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import rh.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new xe.b();

    /* renamed from: b, reason: collision with root package name */
    public final long f27782b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27783c;

    /* renamed from: e, reason: collision with root package name */
    public final long f27784e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27785f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27786g;

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f27782b = j10;
        this.f27783c = j11;
        this.f27784e = j12;
        this.f27785f = j13;
        this.f27786g = j14;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.f27782b == motionPhotoMetadata.f27782b && this.f27783c == motionPhotoMetadata.f27783c && this.f27784e == motionPhotoMetadata.f27784e && this.f27785f == motionPhotoMetadata.f27785f && this.f27786g == motionPhotoMetadata.f27786g) {
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
        return b0.hashCode(this.f27786g) + ((b0.hashCode(this.f27785f) + ((b0.hashCode(this.f27784e) + ((b0.hashCode(this.f27783c) + ((b0.hashCode(this.f27782b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f27782b + ", photoSize=" + this.f27783c + ", photoPresentationTimestampUs=" + this.f27784e + ", videoStartPosition=" + this.f27785f + ", videoSize=" + this.f27786g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27782b);
        parcel.writeLong(this.f27783c);
        parcel.writeLong(this.f27784e);
        parcel.writeLong(this.f27785f);
        parcel.writeLong(this.f27786g);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f27782b = parcel.readLong();
        this.f27783c = parcel.readLong();
        this.f27784e = parcel.readLong();
        this.f27785f = parcel.readLong();
        this.f27786g = parcel.readLong();
    }
}
