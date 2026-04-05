package io.odeeo.internal.u;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f66511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66512b;

    /* renamed from: c, reason: collision with root package name */
    public final long f66513c;

    /* renamed from: d, reason: collision with root package name */
    public final long f66514d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f66515e;

    /* renamed from: f, reason: collision with root package name */
    public int f66516f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f66509g = new t.b().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();

    /* renamed from: h, reason: collision with root package name */
    public static final t f66510h = new t.b().setSampleMimeType(MimeTypes.APPLICATION_SCTE35).build();
    public static final Parcelable.Creator<a> CREATOR = new C0655a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.u.a$a, reason: collision with other inner class name */
    public class C0655a implements Parcelable.Creator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f66511a = str;
        this.f66512b = str2;
        this.f66513c = j10;
        this.f66514d = j11;
        this.f66515e = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f66513c == aVar.f66513c && this.f66514d == aVar.f66514d && g0.areEqual(this.f66511a, aVar.f66511a) && g0.areEqual(this.f66512b, aVar.f66512b) && Arrays.equals(this.f66515e, aVar.f66515e)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.s.a.b
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f66515e;
        }
        return null;
    }

    @Override // io.odeeo.internal.s.a.b
    public t getWrappedMetadataFormat() {
        String str = this.f66511a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f66510h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f66509g;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f66516f == 0) {
            String str = this.f66511a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f66512b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f66513c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f66514d;
            this.f66516f = Arrays.hashCode(this.f66515e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f66516f;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f66511a + ", id=" + this.f66514d + ", durationMs=" + this.f66513c + ", value=" + this.f66512b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f66511a);
        parcel.writeString(this.f66512b);
        parcel.writeLong(this.f66513c);
        parcel.writeLong(this.f66514d);
        parcel.writeByteArray(this.f66515e);
    }

    public a(Parcel parcel) {
        this.f66511a = (String) g0.castNonNull(parcel.readString());
        this.f66512b = (String) g0.castNonNull(parcel.readString());
        this.f66513c = parcel.readLong();
        this.f66514d = parcel.readLong();
        this.f66515e = (byte[]) g0.castNonNull(parcel.createByteArray());
    }
}
