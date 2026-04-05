package we;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public ChapterFrame createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public ChapterFrame[] newArray(int i10) {
        return new ChapterFrame[i10];
    }
}
