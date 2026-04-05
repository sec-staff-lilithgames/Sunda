package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public FragmentManager.LaunchedFragmentInfo createFromParcel(Parcel parcel) {
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = new FragmentManager.LaunchedFragmentInfo();
        launchedFragmentInfo.f6246b = parcel.readString();
        launchedFragmentInfo.f6247c = parcel.readInt();
        return launchedFragmentInfo;
    }

    @Override // android.os.Parcelable.Creator
    public FragmentManager.LaunchedFragmentInfo[] newArray(int i10) {
        return new FragmentManager.LaunchedFragmentInfo[i10];
    }
}
