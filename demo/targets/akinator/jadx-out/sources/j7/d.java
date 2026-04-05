package j7;

import android.os.Parcel;
import android.os.Parcelable;
import coil.memory.MemoryCache$Key;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MemoryCache$Key createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        e0.checkNotNull(string);
        int i10 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            String string2 = parcel.readString();
            e0.checkNotNull(string2);
            String string3 = parcel.readString();
            e0.checkNotNull(string3);
            linkedHashMap.put(string2, string3);
        }
        return new MemoryCache$Key(string, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public MemoryCache$Key[] newArray(int i10) {
        return new MemoryCache$Key[i10];
    }
}
