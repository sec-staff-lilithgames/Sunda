package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67489c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67490d;

    /* renamed from: e, reason: collision with root package name */
    public final long f67491e;

    /* renamed from: f, reason: collision with root package name */
    public final long f67492f;

    /* renamed from: g, reason: collision with root package name */
    public final h[] f67493g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<c> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super(ChapterFrame.ID);
        this.f67488b = str;
        this.f67489c = i10;
        this.f67490d = i11;
        this.f67491e = j10;
        this.f67492f = j11;
        this.f67493g = hVarArr;
    }

    @Override // io.odeeo.internal.x.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f67489c == cVar.f67489c && this.f67490d == cVar.f67490d && this.f67491e == cVar.f67491e && this.f67492f == cVar.f67492f && g0.areEqual(this.f67488b, cVar.f67488b) && Arrays.equals(this.f67493g, cVar.f67493g)) {
                return true;
            }
        }
        return false;
    }

    public h getSubFrame(int i10) {
        return this.f67493g[i10];
    }

    public int getSubFrameCount() {
        return this.f67493g.length;
    }

    public int hashCode() {
        int i10 = (((((((this.f67489c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f67490d) * 31) + ((int) this.f67491e)) * 31) + ((int) this.f67492f)) * 31;
        String str = this.f67488b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67488b);
        parcel.writeInt(this.f67489c);
        parcel.writeInt(this.f67490d);
        parcel.writeLong(this.f67491e);
        parcel.writeLong(this.f67492f);
        parcel.writeInt(this.f67493g.length);
        for (h hVar : this.f67493g) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public c(Parcel parcel) {
        super(ChapterFrame.ID);
        this.f67488b = (String) g0.castNonNull(parcel.readString());
        this.f67489c = parcel.readInt();
        this.f67490d = parcel.readInt();
        this.f67491e = parcel.readLong();
        this.f67492f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f67493g = new h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f67493g[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
