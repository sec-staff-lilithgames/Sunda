package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends o {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f25665b;

    public d(String str, byte[] bArr) {
        super(str);
        this.f25665b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f25689a.equals(dVar.f25689a) && Arrays.equals(this.f25665b, dVar.f25665b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25665b) + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f25689a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25689a);
        parcel.writeByteArray(this.f25665b);
    }

    public d(Parcel parcel) {
        super(parcel.readString());
        this.f25665b = parcel.createByteArray();
    }
}
