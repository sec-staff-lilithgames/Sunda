package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends o {
    public static final Parcelable.Creator<u> CREATOR = new t();

    /* renamed from: b, reason: collision with root package name */
    public final String f25694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25695c;

    public u(String str, String str2, String str3) {
        super(str);
        this.f25694b = str2;
        this.f25695c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f25689a.equals(uVar.f25689a) && z.a(this.f25694b, uVar.f25694b) && z.a(this.f25695c, uVar.f25695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f25689a);
        String str = this.f25694b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25695c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25689a);
        parcel.writeString(this.f25694b);
        parcel.writeString(this.f25695c);
    }

    public u(Parcel parcel) {
        super(parcel.readString());
        this.f25694b = parcel.readString();
        this.f25695c = parcel.readString();
    }
}
