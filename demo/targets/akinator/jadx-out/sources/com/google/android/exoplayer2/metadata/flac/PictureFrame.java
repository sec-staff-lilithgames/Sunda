package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import mh.h0;
import p0.o2;
import ue.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f27721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27722c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27723e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27724f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27725g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27726h;

    /* renamed from: i, reason: collision with root package name */
    public final int f27727i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f27728j;

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f27721b = i10;
        this.f27722c = str;
        this.f27723e = str2;
        this.f27724f = i11;
        this.f27725g = i12;
        this.f27726h = i13;
        this.f27727i = i14;
        this.f27728j = bArr;
    }

    public static PictureFrame fromPictureBlock(v0 v0Var) {
        int i10 = v0Var.readInt();
        String string = v0Var.readString(v0Var.readInt(), h0.f74626a);
        String string2 = v0Var.readString(v0Var.readInt());
        int i11 = v0Var.readInt();
        int i12 = v0Var.readInt();
        int i13 = v0Var.readInt();
        int i14 = v0Var.readInt();
        int i15 = v0Var.readInt();
        byte[] bArr = new byte[i15];
        v0Var.readBytes(bArr, 0, i15);
        return new PictureFrame(i10, string, string2, i11, i12, i13, i14, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.f27721b == pictureFrame.f27721b && this.f27722c.equals(pictureFrame.f27722c) && this.f27723e.equals(pictureFrame.f27723e) && this.f27724f == pictureFrame.f27724f && this.f27725g == pictureFrame.f27725g && this.f27726h == pictureFrame.f27726h && this.f27727i == pictureFrame.f27727i && Arrays.equals(this.f27728j, pictureFrame.f27728j)) {
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
        return Arrays.hashCode(this.f27728j) + ((((((((o2.e(o2.e((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27721b) * 31, 31, this.f27722c), 31, this.f27723e) + this.f27724f) * 31) + this.f27725g) * 31) + this.f27726h) * 31) + this.f27727i) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(v1 v1Var) {
        v1Var.maybeSetArtworkData(this.f27728j, this.f27721b);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f27722c + ", description=" + this.f27723e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27721b);
        parcel.writeString(this.f27722c);
        parcel.writeString(this.f27723e);
        parcel.writeInt(this.f27724f);
        parcel.writeInt(this.f27725g);
        parcel.writeInt(this.f27726h);
        parcel.writeInt(this.f27727i);
        parcel.writeByteArray(this.f27728j);
    }

    public PictureFrame(Parcel parcel) {
        this.f27721b = parcel.readInt();
        this.f27722c = (String) n1.castNonNull(parcel.readString());
        this.f27723e = (String) n1.castNonNull(parcel.readString());
        this.f27724f = parcel.readInt();
        this.f27725g = parcel.readInt();
        this.f27726h = parcel.readInt();
        this.f27727i = parcel.readInt();
        this.f27728j = (byte[]) n1.castNonNull(parcel.createByteArray());
    }
}
