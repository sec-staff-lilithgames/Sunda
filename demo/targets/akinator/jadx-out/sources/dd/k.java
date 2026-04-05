package dd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final k f52045f = new k(1, 0, new Object[4]);

    /* renamed from: b, reason: collision with root package name */
    public final int f52046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52047c;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f52048e;

    public k(int i10, int i11, Object[] objArr) {
        this.f52046b = i10;
        this.f52047c = i11;
        this.f52048e = objArr;
    }

    public static <T> k construct(Map<String, T> map) {
        int i10;
        if (map.isEmpty()) {
            return f52045f;
        }
        int size = map.size();
        if (size <= 5) {
            i10 = 8;
        } else if (size <= 12) {
            i10 = 16;
        } else {
            int i11 = 32;
            while (i11 < size + (size >> 2)) {
                i11 += i11;
            }
            i10 = i11;
        }
        int i12 = i10 - 1;
        int i13 = (i10 >> 1) + i10;
        Object[] objArrCopyOf = new Object[i13 * 2];
        int i14 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int iHashCode = key.hashCode() & i12;
                int i15 = iHashCode + iHashCode;
                if (objArrCopyOf[i15] != null) {
                    i15 = ((iHashCode >> 1) + i10) << 1;
                    if (objArrCopyOf[i15] != null) {
                        i15 = (i13 << 1) + i14;
                        i14 += 2;
                        if (i15 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i15] = key;
                objArrCopyOf[i15 + 1] = entry.getValue();
            }
        }
        return new k(i12, i14, objArrCopyOf);
    }

    public Object find(String str) {
        int iHashCode = str.hashCode();
        int i10 = this.f52046b;
        int i11 = iHashCode & i10;
        int i12 = i11 << 1;
        Object[] objArr = this.f52048e;
        Object obj = objArr[i12];
        if (obj == str || str.equals(obj)) {
            return objArr[i12 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i13 = i10 + 1;
        int i14 = ((i11 >> 1) + i13) << 1;
        Object obj2 = objArr[i14];
        if (str.equals(obj2)) {
            return objArr[i14 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i15 = (i13 + (i13 >> 1)) << 1;
        int i16 = this.f52047c + i15;
        while (i15 < i16) {
            Object obj3 = objArr[i15];
            if (obj3 == str || str.equals(obj3)) {
                return objArr[i15 + 1];
            }
            i15 += 2;
        }
        return null;
    }

    public Object findCaseInsensitive(String str) {
        Object[] objArr = this.f52048e;
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = objArr[i10];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return objArr[i10 + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        Object[] objArr = this.f52048e;
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = objArr[i10];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
