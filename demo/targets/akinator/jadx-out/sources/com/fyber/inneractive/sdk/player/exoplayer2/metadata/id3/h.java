package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends o {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: b, reason: collision with root package name */
    public final String f25672b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25673c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25674d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f25675e;

    /* renamed from: f, reason: collision with root package name */
    public final o[] f25676f;

    public h(String str, boolean z10, boolean z11, String[] strArr, o[] oVarArr) {
        super(ChapterTocFrame.ID);
        this.f25672b = str;
        this.f25673c = z10;
        this.f25674d = z11;
        this.f25675e = strArr;
        this.f25676f = oVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f25673c == hVar.f25673c && this.f25674d == hVar.f25674d && z.a(this.f25672b, hVar.f25672b) && Arrays.equals(this.f25675e, hVar.f25675e) && Arrays.equals(this.f25676f, hVar.f25676f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f25673c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f25674d ? 1 : 0)) * 31;
        String str = this.f25672b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25672b);
        parcel.writeByte(this.f25673c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25674d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f25675e);
        parcel.writeInt(this.f25676f.length);
        int i11 = 0;
        while (true) {
            o[] oVarArr = this.f25676f;
            if (i11 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i11], 0);
            i11++;
        }
    }

    public h(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.f25672b = parcel.readString();
        this.f25673c = parcel.readByte() != 0;
        this.f25674d = parcel.readByte() != 0;
        this.f25675e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f25676f = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25676f[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
