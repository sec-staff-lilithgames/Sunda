package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.a;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ve.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final int f27731b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27732c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27733e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27734f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27735g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27736h;

    public IcyHeaders(int i10, String str, String str2, String str3, boolean z10, int i11) {
        a.checkArgument(i11 == -1 || i11 > 0);
        this.f27731b = i10;
        this.f27732c = str;
        this.f27733e = str2;
        this.f27734f = str3;
        this.f27735g = z10;
        this.f27736h = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.parse(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.f27731b == icyHeaders.f27731b && n1.areEqual(this.f27732c, icyHeaders.f27732c) && n1.areEqual(this.f27733e, icyHeaders.f27733e) && n1.areEqual(this.f27734f, icyHeaders.f27734f) && this.f27735g == icyHeaders.f27735g && this.f27736h == icyHeaders.f27736h) {
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
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27731b) * 31;
        String str = this.f27732c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27733e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27734f;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f27735g ? 1 : 0)) * 31) + this.f27736h;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(v1 v1Var) {
        String str = this.f27733e;
        if (str != null) {
            v1Var.setStation(str);
        }
        String str2 = this.f27732c;
        if (str2 != null) {
            v1Var.setGenre(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f27733e + "\", genre=\"" + this.f27732c + "\", bitrate=" + this.f27731b + ", metadataInterval=" + this.f27736h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27731b);
        parcel.writeString(this.f27732c);
        parcel.writeString(this.f27733e);
        parcel.writeString(this.f27734f);
        n1.writeBoolean(parcel, this.f27735g);
        parcel.writeInt(this.f27736h);
    }

    public IcyHeaders(Parcel parcel) {
        this.f27731b = parcel.readInt();
        this.f27732c = parcel.readString();
        this.f27733e = parcel.readString();
        this.f27734f = parcel.readString();
        this.f27735g = n1.readBoolean(parcel);
        this.f27736h = parcel.readInt();
    }
}
