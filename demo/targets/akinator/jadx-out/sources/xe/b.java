package xe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MotionPhotoMetadata createFromParcel(Parcel parcel) {
        return new MotionPhotoMetadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public MotionPhotoMetadata[] newArray(int i10) {
        return new MotionPhotoMetadata[i10];
    }
}
