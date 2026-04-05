package com.google.android.exoplayer2.container;

import ae.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.a;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import rh.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final float f27358b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27359c;

    public Mp4LocationData(float f10, float f11) {
        a.checkArgument(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f27358b = f10;
        this.f27359c = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.f27358b == mp4LocationData.f27358b && this.f27359c == mp4LocationData.f27359c) {
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
        return o.hashCode(this.f27359c) + ((o.hashCode(this.f27358b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    public String toString() {
        return "xyz: latitude=" + this.f27358b + ", longitude=" + this.f27359c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f27358b);
        parcel.writeFloat(this.f27359c);
    }

    public Mp4LocationData(Parcel parcel) {
        this.f27358b = parcel.readFloat();
        this.f27359c = parcel.readFloat();
    }
}
