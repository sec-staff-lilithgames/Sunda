package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import rh.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new re.a();

    /* renamed from: b, reason: collision with root package name */
    public final Entry[] f27699b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27700c;

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata(this.f27700c, (Entry[]) n1.nullSafeArrayConcatenation(this.f27699b, entryArr));
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.f27699b);
    }

    public Metadata copyWithPresentationTimeUs(long j10) {
        return this.f27700c == j10 ? this : new Metadata(j10, this.f27699b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f27699b, metadata.f27699b) && this.f27700c == metadata.f27700c) {
                return true;
            }
        }
        return false;
    }

    public Entry get(int i10) {
        return this.f27699b[i10];
    }

    public int hashCode() {
        return b0.hashCode(this.f27700c) + (Arrays.hashCode(this.f27699b) * 31);
    }

    public int length() {
        return this.f27699b.length;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f27699b));
        long j10 = this.f27700c;
        if (j10 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Entry[] entryArr = this.f27699b;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f27700c);
    }

    public Metadata(long j10, Entry... entryArr) {
        this.f27700c = j10;
        this.f27699b = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j10, List<? extends Entry> list) {
        this(j10, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f27699b = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f27699b;
            if (i10 < entryArr.length) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                this.f27700c = parcel.readLong();
                return;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Entry extends Parcelable {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default z0 getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(v1 v1Var) {
        }
    }
}
