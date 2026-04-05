package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final o[] f25660a;

    public b(ArrayList arrayList) {
        o[] oVarArr = new o[arrayList.size()];
        this.f25660a = oVarArr;
        arrayList.toArray(oVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f25660a, ((b) obj).f25660a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25660a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25660a.length);
        for (o oVar : this.f25660a) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public b(Parcel parcel) {
        this.f25660a = new o[parcel.readInt()];
        int i10 = 0;
        while (true) {
            o[] oVarArr = this.f25660a;
            if (i10 >= oVarArr.length) {
                return;
            }
            oVarArr[i10] = (o) parcel.readParcelable(o.class.getClassLoader());
            i10++;
        }
    }
}
