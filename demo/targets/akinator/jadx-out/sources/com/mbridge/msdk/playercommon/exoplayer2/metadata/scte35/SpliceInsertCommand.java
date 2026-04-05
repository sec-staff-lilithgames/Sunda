package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        private ComponentSplice(int i10, long j10, long j11) {
            this.componentTag = i10;
            this.componentSplicePts = j10;
            this.componentSplicePlaybackPositionUs = j11;
        }
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j10, TimestampAdjuster timestampAdjuster) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int unsignedByte;
        int unsignedByte2;
        boolean z14;
        int i11;
        long spliceTime;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z15 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = C.TIME_UNSET;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z16 = (unsignedByte3 & 128) != 0;
            boolean z17 = (unsignedByte3 & 64) != 0;
            boolean z18 = (unsignedByte3 & 32) != 0;
            boolean z19 = (unsignedByte3 & 16) != 0;
            long spliceTime2 = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j10);
            if (!z17) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i12 = 0;
                while (i12 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    if (z19) {
                        i11 = unsignedByte4;
                        spliceTime = -9223372036854775807L;
                    } else {
                        i11 = unsignedByte4;
                        spliceTime = TimeSignalCommand.parseSpliceTime(parsableByteArray, j10);
                    }
                    arrayList.add(new ComponentSplice(unsignedByte5, spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime)));
                    i12++;
                    unsignedByte4 = i11;
                }
                list2 = arrayList;
            }
            if (z18) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z20 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j12 = spliceTime2;
            j11 = unsignedInt2;
            unsignedInt2 = j12;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i10 = unsignedShort;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new SpliceInsertCommand(unsignedInt, z15, z10, z11, z12, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z13, j11, i10, unsignedByte, unsignedByte2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.componentSpliceList.get(i11).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<ComponentSplice> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.spliceEventId = j10;
        this.spliceEventCancelIndicator = z10;
        this.outOfNetworkIndicator = z11;
        this.programSpliceFlag = z12;
        this.spliceImmediateFlag = z13;
        this.programSplicePts = j11;
        this.programSplicePlaybackPositionUs = j12;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z14;
        this.breakDurationUs = j13;
        this.uniqueProgramId = i10;
        this.availNum = i11;
        this.availsExpected = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
