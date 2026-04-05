package io.bidmachine.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import gn.l;
import gn.r;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new r();

    /* renamed from: b, reason: collision with root package name */
    public final SchemeData[] f60612b;

    /* renamed from: c, reason: collision with root package name */
    public int f60613c;

    /* renamed from: e, reason: collision with root package name */
    public final String f60614e;

    /* renamed from: f, reason: collision with root package name */
    public final int f60615f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f60616b;

        /* renamed from: c, reason: collision with root package name */
        public final UUID f60617c;

        /* renamed from: e, reason: collision with root package name */
        public final String f60618e;

        /* renamed from: f, reason: collision with root package name */
        public final String f60619f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f60620g;

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean canReplace(SchemeData schemeData) {
            return hasData() && !schemeData.hasData() && matches(schemeData.f60617c);
        }

        public SchemeData copyWithData(byte[] bArr) {
            return new SchemeData(this.f60617c, this.f60618e, this.f60619f, bArr);
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
            return Objects.equals(this.f60618e, schemeData.f60618e) && Objects.equals(this.f60619f, schemeData.f60619f) && Objects.equals(this.f60617c, schemeData.f60617c) && Arrays.equals(this.f60620g, schemeData.f60620g);
        }

        public boolean hasData() {
            return this.f60620g != null;
        }

        public int hashCode() {
            if (this.f60616b == 0) {
                int iHashCode = this.f60617c.hashCode() * 31;
                String str = this.f60618e;
                this.f60616b = Arrays.hashCode(this.f60620g) + o2.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f60619f);
            }
            return this.f60616b;
        }

        public boolean matches(UUID uuid) {
            UUID uuid2 = l.f57984a;
            UUID uuid3 = this.f60617c;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f60617c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f60618e);
            parcel.writeString(this.f60619f);
            parcel.writeByteArray(this.f60620g);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f60617c = (UUID) io.bidmachine.media3.common.util.a.checkNotNull(uuid);
            this.f60618e = str;
            this.f60619f = x0.normalizeMimeType((String) io.bidmachine.media3.common.util.a.checkNotNull(str2));
            this.f60620g = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f60617c = new UUID(parcel.readLong(), parcel.readLong());
            this.f60618e = parcel.readString();
            this.f60619f = (String) a1.castNonNull(parcel.readString());
            this.f60620g = parcel.createByteArray();
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static DrmInitData createSessionCreationData(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f60614e;
            for (SchemeData schemeData : drmInitData.f60612b) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f60614e;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f60612b) {
                if (schemeData2.hasData()) {
                    UUID uuid = schemeData2.f60617c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            arrayList.add(schemeData2);
                            break;
                        }
                        if (((SchemeData) arrayList.get(i10)).f60617c.equals(uuid)) {
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
        return Objects.equals(this.f60614e, str) ? this : new DrmInitData(str, false, this.f60612b);
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
            if (Objects.equals(this.f60614e, drmInitData.f60614e) && Arrays.equals(this.f60612b, drmInitData.f60612b)) {
                return true;
            }
        }
        return false;
    }

    public SchemeData get(int i10) {
        return this.f60612b[i10];
    }

    public int hashCode() {
        if (this.f60613c == 0) {
            String str = this.f60614e;
            this.f60613c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f60612b);
        }
        return this.f60613c;
    }

    public DrmInitData merge(DrmInitData drmInitData) {
        String str;
        String str2 = this.f60614e;
        io.bidmachine.media3.common.util.a.checkState(str2 == null || (str = drmInitData.f60614e) == null || TextUtils.equals(str2, str));
        if (str2 == null) {
            str2 = drmInitData.f60614e;
        }
        return new DrmInitData(str2, (SchemeData[]) a1.nullSafeArrayConcatenation(this.f60612b, drmInitData.f60612b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f60614e);
        parcel.writeTypedArray(this.f60612b, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    @Override // java.util.Comparator
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = l.f57984a;
        return uuid.equals(schemeData.f60617c) ? uuid.equals(schemeData2.f60617c) ? 0 : 1 : schemeData.f60617c.compareTo(schemeData2.f60617c);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f60614e = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f60612b = schemeDataArr;
        this.f60615f = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f60614e = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) a1.castNonNull((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f60612b = schemeDataArr;
        this.f60615f = schemeDataArr.length;
    }
}
