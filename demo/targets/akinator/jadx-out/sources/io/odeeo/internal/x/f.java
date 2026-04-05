package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67502b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67503c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67504d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f67505e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<f> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f67502b = str;
        this.f67503c = str2;
        this.f67504d = str3;
        this.f67505e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (g0.areEqual(this.f67502b, fVar.f67502b) && g0.areEqual(this.f67503c, fVar.f67503c) && g0.areEqual(this.f67504d, fVar.f67504d) && Arrays.equals(this.f67505e, fVar.f67505e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67502b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f67503c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67504d;
        return Arrays.hashCode(this.f67505e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": mimeType=" + this.f67502b + ", filename=" + this.f67503c + ", description=" + this.f67504d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67502b);
        parcel.writeString(this.f67503c);
        parcel.writeString(this.f67504d);
        parcel.writeByteArray(this.f67505e);
    }

    public f(Parcel parcel) {
        super(GeobFrame.ID);
        this.f67502b = (String) g0.castNonNull(parcel.readString());
        this.f67503c = (String) g0.castNonNull(parcel.readString());
        this.f67504d = (String) g0.castNonNull(parcel.readString());
        this.f67505e = (byte[]) g0.castNonNull(parcel.createByteArray());
    }
}
