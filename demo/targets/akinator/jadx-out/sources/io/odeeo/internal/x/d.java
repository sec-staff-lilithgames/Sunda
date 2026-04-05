package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67494b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67495c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67496d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f67497e;

    /* renamed from: f, reason: collision with root package name */
    public final h[] f67498f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<d> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super(ChapterTocFrame.ID);
        this.f67494b = str;
        this.f67495c = z10;
        this.f67496d = z11;
        this.f67497e = strArr;
        this.f67498f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f67495c == dVar.f67495c && this.f67496d == dVar.f67496d && g0.areEqual(this.f67494b, dVar.f67494b) && Arrays.equals(this.f67497e, dVar.f67497e) && Arrays.equals(this.f67498f, dVar.f67498f)) {
                return true;
            }
        }
        return false;
    }

    public h getSubFrame(int i10) {
        return this.f67498f[i10];
    }

    public int getSubFrameCount() {
        return this.f67498f.length;
    }

    public int hashCode() {
        int i10 = ((((this.f67495c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f67496d ? 1 : 0)) * 31;
        String str = this.f67494b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67494b);
        parcel.writeByte(this.f67495c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67496d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f67497e);
        parcel.writeInt(this.f67498f.length);
        for (h hVar : this.f67498f) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public d(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.f67494b = (String) g0.castNonNull(parcel.readString());
        this.f67495c = parcel.readByte() != 0;
        this.f67496d = parcel.readByte() != 0;
        this.f67497e = (String[]) g0.castNonNull(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f67498f = new h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f67498f[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
