package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends o {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: b, reason: collision with root package name */
    public final String f25680b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25681c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25682d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f25683e;

    public l(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f25680b = str;
        this.f25681c = str2;
        this.f25682d = str3;
        this.f25683e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (z.a(this.f25680b, lVar.f25680b) && z.a(this.f25681c, lVar.f25681c) && z.a(this.f25682d, lVar.f25682d) && Arrays.equals(this.f25683e, lVar.f25683e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25680b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f25681c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25682d;
        return Arrays.hashCode(this.f25683e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25680b);
        parcel.writeString(this.f25681c);
        parcel.writeString(this.f25682d);
        parcel.writeByteArray(this.f25683e);
    }

    public l(Parcel parcel) {
        super(GeobFrame.ID);
        this.f25680b = parcel.readString();
        this.f25681c = parcel.readString();
        this.f25682d = parcel.readString();
        this.f25683e = parcel.createByteArray();
    }
}
