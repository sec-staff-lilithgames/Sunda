package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.q0.g0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67524b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67525c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<m> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f67524b = str2;
        this.f67525c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f67511a.equals(mVar.f67511a) && g0.areEqual(this.f67524b, mVar.f67524b) && g0.areEqual(this.f67525c, mVar.f67525c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f67511a);
        String str = this.f67524b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67525c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": url=" + this.f67525c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67511a);
        parcel.writeString(this.f67524b);
        parcel.writeString(this.f67525c);
    }

    public m(Parcel parcel) {
        super((String) g0.castNonNull(parcel.readString()));
        this.f67524b = parcel.readString();
        this.f67525c = (String) g0.castNonNull(parcel.readString());
    }
}
