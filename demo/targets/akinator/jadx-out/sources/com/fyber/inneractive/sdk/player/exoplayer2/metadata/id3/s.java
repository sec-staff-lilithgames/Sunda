package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* renamed from: b, reason: collision with root package name */
    public final String f25692b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25693c;

    public s(String str, String str2, String str3) {
        super(str);
        this.f25692b = str2;
        this.f25693c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f25689a.equals(sVar.f25689a) && z.a(this.f25692b, sVar.f25692b) && z.a(this.f25693c, sVar.f25693c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f25689a);
        String str = this.f25692b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25693c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25689a);
        parcel.writeString(this.f25692b);
        parcel.writeString(this.f25693c);
    }

    public s(Parcel parcel) {
        super(parcel.readString());
        this.f25692b = parcel.readString();
        this.f25693c = parcel.readString();
    }
}
