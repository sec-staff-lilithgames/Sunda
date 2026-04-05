package ye;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public PrivateCommand[] newArray(int i10) {
        return new PrivateCommand[i10];
    }
}
