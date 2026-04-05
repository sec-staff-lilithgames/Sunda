package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67512b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67513c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67514d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<i> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f67512b = str;
        this.f67513c = str2;
        this.f67514d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (g0.areEqual(this.f67513c, iVar.f67513c) && g0.areEqual(this.f67512b, iVar.f67512b) && g0.areEqual(this.f67514d, iVar.f67514d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67512b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f67513c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67514d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": domain=" + this.f67512b + ", description=" + this.f67513c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67511a);
        parcel.writeString(this.f67512b);
        parcel.writeString(this.f67514d);
    }

    public i(Parcel parcel) {
        super(InternalFrame.ID);
        this.f67512b = (String) g0.castNonNull(parcel.readString());
        this.f67513c = (String) g0.castNonNull(parcel.readString());
        this.f67514d = (String) g0.castNonNull(parcel.readString());
    }
}
