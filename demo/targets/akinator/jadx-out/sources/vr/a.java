package vr;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f89605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89606c;

    /* renamed from: e, reason: collision with root package name */
    public final int f89607e;

    public a(int i10, int i11, int i12) {
        this.f89605b = i10;
        this.f89606c = i11;
        this.f89607e = i12;
    }

    public static a parseVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i10 < strArrSplit.length) {
                if (i10 == 0) {
                    i11 = Integer.parseInt(strArrSplit[0]);
                } else if (i10 != 1) {
                    i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArrSplit[i10]) : Integer.parseInt(strArrSplit[2]);
                } else {
                    i12 = Integer.parseInt(strArrSplit[1]);
                }
                i10++;
            }
            return new a(i11, i12, i13);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f89605b == aVar.f89605b && this.f89606c == aVar.f89606c && this.f89607e == aVar.f89607e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f89605b), Integer.valueOf(this.f89606c), Integer.valueOf(this.f89607e));
    }

    public boolean isAfter(a aVar) {
        return compareTo(aVar) > 0;
    }

    public boolean isAfterOrEquals(a aVar) {
        return compareTo(aVar) >= 0;
    }

    public boolean isBefore(a aVar) {
        return compareTo(aVar) < 0;
    }

    public boolean isBeforeOrEquals(a aVar) {
        return compareTo(aVar) <= 0;
    }

    public String toString() {
        return this.f89605b + "." + this.f89606c + "." + this.f89607e;
    }

    @Override // java.lang.Comparable
    public int compareTo(a aVar) {
        int iCompare = Integer.compare(this.f89605b, aVar.f89605b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f89606c, aVar.f89606c);
        return iCompare2 != 0 ? iCompare2 : Integer.compare(this.f89607e, aVar.f89607e);
    }
}
