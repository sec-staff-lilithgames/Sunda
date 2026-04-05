package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public LottieAnimationView.SavedState createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.f12492b = parcel.readString();
        savedState.f12494e = parcel.readFloat();
        savedState.f12495f = parcel.readInt() == 1;
        savedState.f12496g = parcel.readString();
        savedState.f12497h = parcel.readInt();
        savedState.f12498i = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public LottieAnimationView.SavedState[] newArray(int i10) {
        return new LottieAnimationView.SavedState[i10];
    }
}
