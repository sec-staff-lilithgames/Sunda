package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();

    /* renamed from: b, reason: collision with root package name */
    public final String f25690b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25691c;

    public q(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f25690b = str;
        this.f25691c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (z.a(this.f25690b, qVar.f25690b) && Arrays.equals(this.f25691c, qVar.f25691c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25690b;
        return Arrays.hashCode(this.f25691c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25690b);
        parcel.writeByteArray(this.f25691c);
    }

    public q(Parcel parcel) {
        super(PrivFrame.ID);
        this.f25690b = parcel.readString();
        this.f25691c = parcel.createByteArray();
    }
}
