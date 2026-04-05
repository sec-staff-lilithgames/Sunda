package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import rh.o;
import xe.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final float f27791b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27792c;

    public SmtaMetadataEntry(float f10, int i10) {
        this.f27791b = f10;
        this.f27792c = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.f27791b == smtaMetadataEntry.f27791b && this.f27792c == smtaMetadataEntry.f27792c) {
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
        return ((o.hashCode(this.f27791b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f27792c;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f27791b + ", svcTemporalLayerCount=" + this.f27792c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f27791b);
        parcel.writeInt(this.f27792c);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f27791b = parcel.readFloat();
        this.f27792c = parcel.readInt();
    }
}
