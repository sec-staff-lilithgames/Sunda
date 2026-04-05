package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends o {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    public final String f25666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25668d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25669e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25670f;

    /* renamed from: g, reason: collision with root package name */
    public final o[] f25671g;

    public f(String str, int i10, int i11, long j10, long j11, o[] oVarArr) {
        super(ChapterFrame.ID);
        this.f25666b = str;
        this.f25667c = i10;
        this.f25668d = i11;
        this.f25669e = j10;
        this.f25670f = j11;
        this.f25671g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f25667c == fVar.f25667c && this.f25668d == fVar.f25668d && this.f25669e == fVar.f25669e && this.f25670f == fVar.f25670f && z.a(this.f25666b, fVar.f25666b) && Arrays.equals(this.f25671g, fVar.f25671g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f25667c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f25668d) * 31) + ((int) this.f25669e)) * 31) + ((int) this.f25670f)) * 31;
        String str = this.f25666b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25666b);
        parcel.writeInt(this.f25667c);
        parcel.writeInt(this.f25668d);
        parcel.writeLong(this.f25669e);
        parcel.writeLong(this.f25670f);
        parcel.writeInt(this.f25671g.length);
        for (o oVar : this.f25671g) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public f(Parcel parcel) {
        super(ChapterFrame.ID);
        this.f25666b = parcel.readString();
        this.f25667c = parcel.readInt();
        this.f25668d = parcel.readInt();
        this.f25669e = parcel.readLong();
        this.f25670f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f25671g = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25671g[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
