package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67499b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67500c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67501d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<e> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f67499b = str;
        this.f67500c = str2;
        this.f67501d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (g0.areEqual(this.f67500c, eVar.f67500c) && g0.areEqual(this.f67499b, eVar.f67499b) && g0.areEqual(this.f67501d, eVar.f67501d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67499b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f67500c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67501d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": language=" + this.f67499b + ", description=" + this.f67500c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67511a);
        parcel.writeString(this.f67499b);
        parcel.writeString(this.f67501d);
    }

    public e(Parcel parcel) {
        super(CommentFrame.ID);
        this.f67499b = (String) g0.castNonNull(parcel.readString());
        this.f67500c = (String) g0.castNonNull(parcel.readString());
        this.f67501d = (String) g0.castNonNull(parcel.readString());
    }
}
