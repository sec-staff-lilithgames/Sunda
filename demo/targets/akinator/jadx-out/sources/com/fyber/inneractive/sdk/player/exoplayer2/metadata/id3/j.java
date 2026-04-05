package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends o {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    public final String f25677b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25678c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25679d;

    public j(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f25677b = str;
        this.f25678c = str2;
        this.f25679d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (z.a(this.f25678c, jVar.f25678c) && z.a(this.f25677b, jVar.f25677b) && z.a(this.f25679d, jVar.f25679d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25677b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f25678c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25679d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25689a);
        parcel.writeString(this.f25677b);
        parcel.writeString(this.f25679d);
    }

    public j(Parcel parcel) {
        super(CommentFrame.ID);
        this.f25677b = parcel.readString();
        this.f25678c = parcel.readString();
        this.f25679d = parcel.readString();
    }
}
