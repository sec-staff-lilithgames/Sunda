package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;
import ue.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final String f27729b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27730c;

    public VorbisComment(String str, String str2) {
        this.f27729b = str;
        this.f27730c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f27729b.equals(vorbisComment.f27729b) && this.f27730c.equals(vorbisComment.f27730c)) {
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
        return this.f27730c.hashCode() + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f27729b);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(v1 v1Var) {
        String str = this.f27729b;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f27730c;
        switch (c10) {
            case 0:
                v1Var.setAlbumTitle(str2);
                break;
            case 1:
                v1Var.setTitle(str2);
                break;
            case 2:
                v1Var.setDescription(str2);
                break;
            case 3:
                v1Var.setAlbumArtist(str2);
                break;
            case 4:
                v1Var.setArtist(str2);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f27729b + C3191e4.i.f36525b + this.f27730c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27729b);
        parcel.writeString(this.f27730c);
    }

    public VorbisComment(Parcel parcel) {
        this.f27729b = (String) n1.castNonNull(parcel.readString());
        this.f27730c = (String) n1.castNonNull(parcel.readString());
    }
}
