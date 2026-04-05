package ye;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public TimeSignalCommand[] newArray(int i10) {
        return new TimeSignalCommand[i10];
    }
}
