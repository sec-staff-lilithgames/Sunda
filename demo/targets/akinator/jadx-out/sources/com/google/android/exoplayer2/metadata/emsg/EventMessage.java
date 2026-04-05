package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import te.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class EventMessage implements Metadata.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final String f27715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27716c;

    /* renamed from: e, reason: collision with root package name */
    public final long f27717e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27718f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f27719g;

    /* renamed from: h, reason: collision with root package name */
    public int f27720h;

    /* renamed from: i, reason: collision with root package name */
    public static final z0 f27713i = new y0().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();

    /* renamed from: j, reason: collision with root package name */
    public static final z0 f27714j = new y0().setSampleMimeType(MimeTypes.APPLICATION_SCTE35).build();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f27715b = str;
        this.f27716c = str2;
        this.f27717e = j10;
        this.f27718f = j11;
        this.f27719g = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.f27717e == eventMessage.f27717e && this.f27718f == eventMessage.f27718f && n1.areEqual(this.f27715b, eventMessage.f27715b) && n1.areEqual(this.f27716c, eventMessage.f27716c) && Arrays.equals(this.f27719g, eventMessage.f27719g)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f27719g;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public z0 getWrappedMetadataFormat() {
        String str = this.f27715b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f27714j;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f27713i;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f27720h == 0) {
            String str = this.f27715b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f27716c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f27717e;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f27718f;
            this.f27720h = Arrays.hashCode(this.f27719g) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f27720h;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(v1 v1Var) {
        super.populateMediaMetadata(v1Var);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f27715b + ", id=" + this.f27718f + ", durationMs=" + this.f27717e + ", value=" + this.f27716c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27715b);
        parcel.writeString(this.f27716c);
        parcel.writeLong(this.f27717e);
        parcel.writeLong(this.f27718f);
        parcel.writeByteArray(this.f27719g);
    }

    public EventMessage(Parcel parcel) {
        this.f27715b = (String) n1.castNonNull(parcel.readString());
        this.f27716c = (String) n1.castNonNull(parcel.readString());
        this.f27717e = parcel.readLong();
        this.f27718f = parcel.readLong();
        this.f27719g = (byte[]) n1.castNonNull(parcel.createByteArray());
    }
}
