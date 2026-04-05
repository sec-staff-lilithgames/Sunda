package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import we.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new c();

    /* renamed from: c, reason: collision with root package name */
    public final String f27745c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27746e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27747f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27748g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27749h;

    /* renamed from: i, reason: collision with root package name */
    public final Id3Frame[] f27750i;

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame.ID);
        this.f27745c = str;
        this.f27746e = i10;
        this.f27747f = i11;
        this.f27748g = j10;
        this.f27749h = j11;
        this.f27750i = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.f27746e == chapterFrame.f27746e && this.f27747f == chapterFrame.f27747f && this.f27748g == chapterFrame.f27748g && this.f27749h == chapterFrame.f27749h && n1.areEqual(this.f27745c, chapterFrame.f27745c) && Arrays.equals(this.f27750i, chapterFrame.f27750i)) {
                return true;
            }
        }
        return false;
    }

    public Id3Frame getSubFrame(int i10) {
        return this.f27750i[i10];
    }

    public int getSubFrameCount() {
        return this.f27750i.length;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ z0 getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27746e) * 31) + this.f27747f) * 31) + ((int) this.f27748g)) * 31) + ((int) this.f27749h)) * 31;
        String str = this.f27745c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27745c);
        parcel.writeInt(this.f27746e);
        parcel.writeInt(this.f27747f);
        parcel.writeLong(this.f27748g);
        parcel.writeLong(this.f27749h);
        Id3Frame[] id3FrameArr = this.f27750i;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame.ID);
        this.f27745c = (String) n1.castNonNull(parcel.readString());
        this.f27746e = parcel.readInt();
        this.f27747f = parcel.readInt();
        this.f27748g = parcel.readLong();
        this.f27749h = parcel.readLong();
        int i10 = parcel.readInt();
        this.f27750i = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f27750i[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
