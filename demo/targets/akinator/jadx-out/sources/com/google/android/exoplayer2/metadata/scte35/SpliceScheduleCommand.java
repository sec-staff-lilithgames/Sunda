package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ye.f;
import ye.g;
import ye.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new f();

    /* renamed from: b, reason: collision with root package name */
    public final List f27809b;

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f27809b = Collections.unmodifiableList(arrayList);
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f27809b;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f94372a);
            parcel.writeByte(hVar.f94373b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f94374c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f94375d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f94377f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f94370a);
                parcel.writeLong(gVar.f94371b);
            }
            parcel.writeLong(hVar.f94376e);
            parcel.writeByte(hVar.f94378g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f94379h);
            parcel.writeInt(hVar.f94380i);
            parcel.writeInt(hVar.f94381j);
            parcel.writeInt(hVar.f94382k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new h(parcel));
        }
        this.f27809b = Collections.unmodifiableList(arrayList);
    }
}
