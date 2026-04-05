package io.odeeo.internal.f;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.odeeo.internal.q0.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f63908a;

    /* renamed from: b, reason: collision with root package name */
    public int f63909b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63910c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63911d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<e> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f63912a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f63913b;

        /* renamed from: c, reason: collision with root package name */
        public final String f63914c;

        /* renamed from: d, reason: collision with root package name */
        public final String f63915d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f63916e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Parcelable.Creator<b> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean canReplace(b bVar) {
            return hasData() && !bVar.hasData() && matches(bVar.f63913b);
        }

        public b copyWithData(byte[] bArr) {
            return new b(this.f63913b, this.f63914c, this.f63915d, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return g0.areEqual(this.f63914c, bVar.f63914c) && g0.areEqual(this.f63915d, bVar.f63915d) && g0.areEqual(this.f63913b, bVar.f63913b) && Arrays.equals(this.f63916e, bVar.f63916e);
        }

        public boolean hasData() {
            return this.f63916e != null;
        }

        public int hashCode() {
            if (this.f63912a == 0) {
                int iHashCode = this.f63913b.hashCode() * 31;
                String str = this.f63914c;
                this.f63912a = Arrays.hashCode(this.f63916e) + o2.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63915d);
            }
            return this.f63912a;
        }

        public boolean matches(UUID uuid) {
            return io.odeeo.internal.b.h.f62709a.equals(this.f63913b) || uuid.equals(this.f63913b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f63913b.getMostSignificantBits());
            parcel.writeLong(this.f63913b.getLeastSignificantBits());
            parcel.writeString(this.f63914c);
            parcel.writeString(this.f63915d);
            parcel.writeByteArray(this.f63916e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f63913b = (UUID) io.odeeo.internal.q0.a.checkNotNull(uuid);
            this.f63914c = str;
            this.f63915d = (String) io.odeeo.internal.q0.a.checkNotNull(str2);
            this.f63916e = bArr;
        }

        public b(Parcel parcel) {
            this.f63913b = new UUID(parcel.readLong(), parcel.readLong());
            this.f63914c = parcel.readString();
            this.f63915d = (String) g0.castNonNull(parcel.readString());
            this.f63916e = parcel.createByteArray();
        }
    }

    public e(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static boolean a(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f63913b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static e createSessionCreationData(e eVar, e eVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f63910c;
            for (b bVar : eVar.f63908a) {
                if (bVar.hasData()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f63910c;
            }
            int size = arrayList.size();
            for (b bVar2 : eVar2.f63908a) {
                if (bVar2.hasData() && !a(arrayList, size, bVar2.f63913b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e(str, arrayList);
    }

    public e copyWithSchemeType(String str) {
        return g0.areEqual(this.f63910c, str) ? this : new e(str, false, this.f63908a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (g0.areEqual(this.f63910c, eVar.f63910c) && Arrays.equals(this.f63908a, eVar.f63908a)) {
                return true;
            }
        }
        return false;
    }

    public b get(int i10) {
        return this.f63908a[i10];
    }

    public int hashCode() {
        if (this.f63909b == 0) {
            String str = this.f63910c;
            this.f63909b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f63908a);
        }
        return this.f63909b;
    }

    public e merge(e eVar) {
        String str;
        String str2 = this.f63910c;
        io.odeeo.internal.q0.a.checkState(str2 == null || (str = eVar.f63910c) == null || TextUtils.equals(str2, str));
        String str3 = this.f63910c;
        if (str3 == null) {
            str3 = eVar.f63910c;
        }
        return new e(str3, (b[]) g0.nullSafeArrayConcatenation(this.f63908a, eVar.f63908a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f63910c);
        parcel.writeTypedArray(this.f63908a, 0);
    }

    public e(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        UUID uuid = io.odeeo.internal.b.h.f62709a;
        return uuid.equals(bVar.f63913b) ? uuid.equals(bVar2.f63913b) ? 0 : 1 : bVar.f63913b.compareTo(bVar2.f63913b);
    }

    public e(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public e(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public e(String str, boolean z10, b... bVarArr) {
        this.f63910c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f63908a = bVarArr;
        this.f63911d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public e(Parcel parcel) {
        this.f63910c = parcel.readString();
        b[] bVarArr = (b[]) g0.castNonNull((b[]) parcel.createTypedArray(b.CREATOR));
        this.f63908a = bVarArr;
        this.f63911d = bVarArr.length;
    }
}
