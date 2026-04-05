package i;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public ActivityResult createFromParcel(Parcel parcel) {
        e0.checkNotNullParameter(parcel, "parcel");
        return new ActivityResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public ActivityResult[] newArray(int i10) {
        return new ActivityResult[i10];
    }
}
