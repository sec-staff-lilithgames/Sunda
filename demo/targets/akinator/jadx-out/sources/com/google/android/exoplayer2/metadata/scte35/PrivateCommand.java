package com.google.android.exoplayer2.metadata.scte35;

import a.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import ye.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f27793b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27794c;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f27795e;

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f27793b = j11;
        this.f27794c = j10;
        this.f27795e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ z0 getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f27793b);
        sb2.append(", identifier= ");
        return b.g(this.f27794c, " }", sb2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27793b);
        parcel.writeLong(this.f27794c);
        parcel.writeByteArray(this.f27795e);
    }

    public PrivateCommand(Parcel parcel) {
        this.f27793b = parcel.readLong();
        this.f27794c = parcel.readLong();
        this.f27795e = (byte[]) n1.castNonNull(parcel.createByteArray());
    }
}
