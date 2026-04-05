package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f26105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26107c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26108d;

    /* renamed from: e, reason: collision with root package name */
    public int f26109e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f26105a = i10;
        this.f26106b = i11;
        this.f26107c = i12;
        this.f26108d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f26105a == cVar.f26105a && this.f26106b == cVar.f26106b && this.f26107c == cVar.f26107c && Arrays.equals(this.f26108d, cVar.f26108d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26109e == 0) {
            this.f26109e = Arrays.hashCode(this.f26108d) + ((((((this.f26105a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f26106b) * 31) + this.f26107c) * 31);
        }
        return this.f26109e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f26105a);
        sb2.append(", ");
        sb2.append(this.f26106b);
        sb2.append(", ");
        sb2.append(this.f26107c);
        sb2.append(", ");
        return a.b.q(sb2, this.f26108d != null, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f26105a);
        parcel.writeInt(this.f26106b);
        parcel.writeInt(this.f26107c);
        parcel.writeInt(this.f26108d != null ? 1 : 0);
        byte[] bArr = this.f26108d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public c(Parcel parcel) {
        this.f26105a = parcel.readInt();
        this.f26106b = parcel.readInt();
        this.f26107c = parcel.readInt();
        this.f26108d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
