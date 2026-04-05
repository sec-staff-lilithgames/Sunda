package com.google.android.exoplayer2.metadata.scte35;

import a.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ye.c;
import ye.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final long f27796b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27797c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27798e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27799f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27800g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27801h;

    /* renamed from: i, reason: collision with root package name */
    public final long f27802i;

    /* renamed from: j, reason: collision with root package name */
    public final List f27803j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27804k;

    /* renamed from: l, reason: collision with root package name */
    public final long f27805l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27806m;

    /* renamed from: n, reason: collision with root package name */
    public final int f27807n;

    /* renamed from: o, reason: collision with root package name */
    public final int f27808o;

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f27796b = j10;
        this.f27797c = z10;
        this.f27798e = z11;
        this.f27799f = z12;
        this.f27800g = z13;
        this.f27801h = j11;
        this.f27802i = j12;
        this.f27803j = Collections.unmodifiableList(list);
        this.f27804k = z14;
        this.f27805l = j13;
        this.f27806m = i10;
        this.f27807n = i11;
        this.f27808o = i12;
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
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f27801h);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return b.g(this.f27802i, " }", sb2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27796b);
        parcel.writeByte(this.f27797c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27798e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27799f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27800g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27801h);
        parcel.writeLong(this.f27802i);
        List list = this.f27803j;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((d) list.get(i11)).writeToParcel(parcel);
        }
        parcel.writeByte(this.f27804k ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27805l);
        parcel.writeInt(this.f27806m);
        parcel.writeInt(this.f27807n);
        parcel.writeInt(this.f27808o);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f27796b = parcel.readLong();
        this.f27797c = parcel.readByte() == 1;
        this.f27798e = parcel.readByte() == 1;
        this.f27799f = parcel.readByte() == 1;
        this.f27800g = parcel.readByte() == 1;
        this.f27801h = parcel.readLong();
        this.f27802i = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(d.createFromParcel(parcel));
        }
        this.f27803j = Collections.unmodifiableList(arrayList);
        this.f27804k = parcel.readByte() == 1;
        this.f27805l = parcel.readLong();
        this.f27806m = parcel.readInt();
        this.f27807n = parcel.readInt();
        this.f27808o = parcel.readInt();
    }
}
