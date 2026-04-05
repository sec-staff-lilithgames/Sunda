package com.google.android.exoplayer2.metadata.scte35;

import a.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ye.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    public final long f27810b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27811c;

    public TimeSignalCommand(long j10, long j11) {
        this.f27810b = j10;
        this.f27811c = j11;
    }

    public static long a(v0 v0Var, long j10) {
        long unsignedByte = v0Var.readUnsignedByte();
        return (128 & unsignedByte) != 0 ? 8589934591L & ((((unsignedByte & 1) << 32) | v0Var.readUnsignedInt()) + j10) : C.TIME_UNSET;
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
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f27810b);
        sb2.append(", playbackPositionUs= ");
        return b.g(this.f27811c, " }", sb2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27810b);
        parcel.writeLong(this.f27811c);
    }
}
