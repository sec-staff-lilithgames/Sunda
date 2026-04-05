package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public CalendarConstraints createFromParcel(Parcel parcel) {
        return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public CalendarConstraints[] newArray(int i10) {
        return new CalendarConstraints[i10];
    }
}
