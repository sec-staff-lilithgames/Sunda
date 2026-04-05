package sb;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public WrappedParcelable createFromParcel(Parcel parcel) {
        return new WrappedParcelable(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public WrappedParcelable[] newArray(int i10) {
        return new WrappedParcelable[i10];
    }
}
