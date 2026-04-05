package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import java.util.List;
import mh.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List f27787b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public final long f27788b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27789c;

        /* renamed from: e, reason: collision with root package name */
        public final int f27790e;

        public Segment(long j10, long j11, int i10) {
            com.google.android.exoplayer2.util.a.checkArgument(j10 < j11);
            this.f27788b = j10;
            this.f27789c = j11;
            this.f27790e = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.f27788b == segment.f27788b && this.f27789c == segment.f27789c && this.f27790e == segment.f27790e) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return h1.hashCode(Long.valueOf(this.f27788b), Long.valueOf(this.f27789c), Integer.valueOf(this.f27790e));
        }

        public String toString() {
            return n1.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f27788b), Long.valueOf(this.f27789c), Integer.valueOf(this.f27790e));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f27788b);
            parcel.writeLong(this.f27789c);
            parcel.writeInt(this.f27790e);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f27787b = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = list.get(0).f27789c;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (list.get(i10).f27788b < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = list.get(i10).f27789c;
                    i10++;
                }
            }
        }
        com.google.android.exoplayer2.util.a.checkArgument(!z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f27787b.equals(((SlowMotionData) obj).f27787b);
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
        return this.f27787b.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f27787b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f27787b);
    }
}
