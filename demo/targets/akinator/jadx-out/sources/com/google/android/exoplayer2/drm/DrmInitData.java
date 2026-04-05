package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.n1;
import de.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new l();

    /* renamed from: b, reason: collision with root package name */
    public final SchemeData[] f27367b;

    /* renamed from: c, reason: collision with root package name */
    public int f27368c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27369e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27370f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new c();

        /* renamed from: b, reason: collision with root package name */
        public int f27371b;

        /* renamed from: c, reason: collision with root package name */
        public final UUID f27372c;

        /* renamed from: e, reason: collision with root package name */
        public final String f27373e;

        /* renamed from: f, reason: collision with root package name */
        public final String f27374f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f27375g;

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean canReplace(SchemeData schemeData) {
            return hasData() && !schemeData.hasData() && matches(schemeData.f27372c);
        }

        public SchemeData copyWithData(byte[] bArr) {
            return new SchemeData(this.f27372c, this.f27373e, this.f27374f, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return n1.areEqual(this.f27373e, schemeData.f27373e) && n1.areEqual(this.f27374f, schemeData.f27374f) && n1.areEqual(this.f27372c, schemeData.f27372c) && Arrays.equals(this.f27375g, schemeData.f27375g);
        }

        public boolean hasData() {
            return this.f27375g != null;
        }

        public int hashCode() {
            if (this.f27371b == 0) {
                int iHashCode = this.f27372c.hashCode() * 31;
                String str = this.f27373e;
                this.f27371b = Arrays.hashCode(this.f27375g) + o2.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27374f);
            }
            return this.f27371b;
        }

        public boolean matches(UUID uuid) {
            UUID uuid2 = j.f27534a;
            UUID uuid3 = this.f27372c;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f27372c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f27373e);
            parcel.writeString(this.f27374f);
            parcel.writeByteArray(this.f27375g);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f27372c = (UUID) com.google.android.exoplayer2.util.a.checkNotNull(uuid);
            this.f27373e = str;
            this.f27374f = (String) com.google.android.exoplayer2.util.a.checkNotNull(str2);
            this.f27375g = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f27372c = new UUID(parcel.readLong(), parcel.readLong());
            this.f27373e = parcel.readString();
            this.f27374f = (String) n1.castNonNull(parcel.readString());
            this.f27375g = parcel.createByteArray();
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static DrmInitData createSessionCreationData(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f27369e;
            for (SchemeData schemeData : drmInitData.f27367b) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f27369e;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f27367b) {
                if (schemeData2.hasData()) {
                    UUID uuid = schemeData2.f27372c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            arrayList.add(schemeData2);
                            break;
                        }
                        if (((SchemeData) arrayList.get(i10)).f27372c.equals(uuid)) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public DrmInitData copyWithSchemeType(String str) {
        return n1.areEqual(this.f27369e, str) ? this : new DrmInitData(str, false, this.f27367b);
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
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (n1.areEqual(this.f27369e, drmInitData.f27369e) && Arrays.equals(this.f27367b, drmInitData.f27367b)) {
                return true;
            }
        }
        return false;
    }

    public SchemeData get(int i10) {
        return this.f27367b[i10];
    }

    public int hashCode() {
        if (this.f27368c == 0) {
            String str = this.f27369e;
            this.f27368c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f27367b);
        }
        return this.f27368c;
    }

    public DrmInitData merge(DrmInitData drmInitData) {
        String str;
        String str2 = this.f27369e;
        com.google.android.exoplayer2.util.a.checkState(str2 == null || (str = drmInitData.f27369e) == null || TextUtils.equals(str2, str));
        if (str2 == null) {
            str2 = drmInitData.f27369e;
        }
        return new DrmInitData(str2, (SchemeData[]) n1.nullSafeArrayConcatenation(this.f27367b, drmInitData.f27367b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27369e);
        parcel.writeTypedArray(this.f27367b, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    @Override // java.util.Comparator
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = j.f27534a;
        return uuid.equals(schemeData.f27372c) ? uuid.equals(schemeData2.f27372c) ? 0 : 1 : schemeData.f27372c.compareTo(schemeData2.f27372c);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f27369e = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f27367b = schemeDataArr;
        this.f27370f = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f27369e = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) n1.castNonNull((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f27367b = schemeDataArr;
        this.f27370f = schemeDataArr.length;
    }
}
