package com.digidust.elokence.akinator.graphic.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import com.digidust.elokence.akinator.graphic.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public CarouselLayoutManager.CarouselSavedState createFromParcel(Parcel parcel) {
        return new CarouselLayoutManager.CarouselSavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public CarouselLayoutManager.CarouselSavedState[] newArray(int i10) {
        return new CarouselLayoutManager.CarouselSavedState[i10];
    }
}
