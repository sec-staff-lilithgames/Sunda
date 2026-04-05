package io.odeeo.internal.v;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f67250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67251b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<b> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, String str2) {
        this.f67250a = str;
        this.f67251b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f67250a.equals(bVar.f67250a) && this.f67251b.equals(bVar.f67251b)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ t getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return this.f67251b.hashCode() + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f67250a);
    }

    @Override // io.odeeo.internal.s.a.b
    public void populateMediaMetadata(a0.b bVar) {
        String str = this.f67250a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                bVar.setAlbumTitle(this.f67251b);
                break;
            case "TITLE":
                bVar.setTitle(this.f67251b);
                break;
            case "DESCRIPTION":
                bVar.setDescription(this.f67251b);
                break;
            case "ALBUMARTIST":
                bVar.setAlbumArtist(this.f67251b);
                break;
            case "ARTIST":
                bVar.setArtist(this.f67251b);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f67250a + C3191e4.i.f36525b + this.f67251b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67250a);
        parcel.writeString(this.f67251b);
    }

    public b(Parcel parcel) {
        this.f67250a = (String) g0.castNonNull(parcel.readString());
        this.f67251b = (String) g0.castNonNull(parcel.readString());
    }
}
