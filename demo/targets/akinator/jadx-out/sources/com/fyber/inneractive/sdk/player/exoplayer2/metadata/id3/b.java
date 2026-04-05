package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends o {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f25661b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25663d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f25664e;

    public b(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f25661b = str;
        this.f25662c = str2;
        this.f25663d = i10;
        this.f25664e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f25663d == bVar.f25663d && z.a(this.f25661b, bVar.f25661b) && z.a(this.f25662c, bVar.f25662c) && Arrays.equals(this.f25664e, bVar.f25664e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f25663d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f25661b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25662c;
        return Arrays.hashCode(this.f25664e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25661b);
        parcel.writeString(this.f25662c);
        parcel.writeInt(this.f25663d);
        parcel.writeByteArray(this.f25664e);
    }

    public b(Parcel parcel) {
        super(ApicFrame.ID);
        this.f25661b = parcel.readString();
        this.f25662c = parcel.readString();
        this.f25663d = parcel.readInt();
        this.f25664e = parcel.createByteArray();
    }
}
