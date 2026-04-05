package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import j1.o2;
import j7.d;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class MemoryCache$Key implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<MemoryCache$Key> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final String f12476b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f12477c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        CREATOR = new d();
    }

    public MemoryCache$Key(String str, Map<String, String> map) {
        this.f12476b = str;
        this.f12477c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemoryCache$Key copy$default(MemoryCache$Key memoryCache$Key, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = memoryCache$Key.f12476b;
        }
        if ((i10 & 2) != 0) {
            map = memoryCache$Key.f12477c;
        }
        return memoryCache$Key.copy(str, map);
    }

    public final MemoryCache$Key copy(String str, Map<String, String> map) {
        return new MemoryCache$Key(str, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryCache$Key)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
        return e0.areEqual(this.f12476b, memoryCache$Key.f12476b) && e0.areEqual(this.f12477c, memoryCache$Key.f12477c);
    }

    public final Map<String, String> getExtras() {
        return this.f12477c;
    }

    public final String getKey() {
        return this.f12476b;
    }

    public int hashCode() {
        return this.f12477c.hashCode() + (this.f12476b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Key(key=");
        sb2.append(this.f12476b);
        sb2.append(", extras=");
        return o2.q(sb2, this.f12477c, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12476b);
        Map map = this.f12477c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ MemoryCache$Key(String str, Map map, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? p1.emptyMap() : map);
    }
}
