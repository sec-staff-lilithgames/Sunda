package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import we.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new d();

    /* renamed from: c, reason: collision with root package name */
    public final String f27751c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27752e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27753f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f27754g;

    /* renamed from: h, reason: collision with root package name */
    public final Id3Frame[] f27755h;

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame.ID);
        this.f27751c = str;
        this.f27752e = z10;
        this.f27753f = z11;
        this.f27754g = strArr;
        this.f27755h = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.f27752e == chapterTocFrame.f27752e && this.f27753f == chapterTocFrame.f27753f && n1.areEqual(this.f27751c, chapterTocFrame.f27751c) && Arrays.equals(this.f27754g, chapterTocFrame.f27754g) && Arrays.equals(this.f27755h, chapterTocFrame.f27755h)) {
                return true;
            }
        }
        return false;
    }

    public Id3Frame getSubFrame(int i10) {
        return this.f27755h[i10];
    }

    public int getSubFrameCount() {
        return this.f27755h.length;
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
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f27752e ? 1 : 0)) * 31) + (this.f27753f ? 1 : 0)) * 31;
        String str = this.f27751c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27751c);
        parcel.writeByte(this.f27752e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27753f ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f27754g);
        Id3Frame[] id3FrameArr = this.f27755h;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame.ID);
        this.f27751c = (String) n1.castNonNull(parcel.readString());
        this.f27752e = parcel.readByte() != 0;
        this.f27753f = parcel.readByte() != 0;
        this.f27754g = (String[]) n1.castNonNull(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f27755h = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f27755h[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
