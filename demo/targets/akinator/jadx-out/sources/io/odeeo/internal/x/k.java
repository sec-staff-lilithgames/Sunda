package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67520b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f67521c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<k> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f67520b = str;
        this.f67521c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (g0.areEqual(this.f67520b, kVar.f67520b) && Arrays.equals(this.f67521c, kVar.f67521c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67520b;
        return Arrays.hashCode(this.f67521c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": owner=" + this.f67520b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67520b);
        parcel.writeByteArray(this.f67521c);
    }

    public k(Parcel parcel) {
        super(PrivFrame.ID);
        this.f67520b = (String) g0.castNonNull(parcel.readString());
        this.f67521c = (byte[]) g0.castNonNull(parcel.createByteArray());
    }
}
