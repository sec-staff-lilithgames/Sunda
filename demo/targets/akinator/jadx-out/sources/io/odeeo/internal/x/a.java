package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0687a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67483b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67485d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f67486e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.x.a$a, reason: collision with other inner class name */
    public class C0687a implements Parcelable.Creator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f67483b = str;
        this.f67484c = str2;
        this.f67485d = i10;
        this.f67486e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f67485d == aVar.f67485d && g0.areEqual(this.f67483b, aVar.f67483b) && g0.areEqual(this.f67484c, aVar.f67484c) && Arrays.equals(this.f67486e, aVar.f67486e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f67485d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f67483b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67484c;
        return Arrays.hashCode(this.f67486e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // io.odeeo.internal.x.h, io.odeeo.internal.s.a.b
    public void populateMediaMetadata(a0.b bVar) {
        bVar.maybeSetArtworkData(this.f67486e, this.f67485d);
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": mimeType=" + this.f67483b + ", description=" + this.f67484c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67483b);
        parcel.writeString(this.f67484c);
        parcel.writeInt(this.f67485d);
        parcel.writeByteArray(this.f67486e);
    }

    public a(Parcel parcel) {
        super(ApicFrame.ID);
        this.f67483b = (String) g0.castNonNull(parcel.readString());
        this.f67484c = parcel.readString();
        this.f67485d = parcel.readInt();
        this.f67486e = (byte[]) g0.castNonNull(parcel.createByteArray());
    }
}
