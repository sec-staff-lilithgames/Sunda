package vr;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f89608a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89609b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89610c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f89611d;

    public b(a aVar, a aVar2, boolean z10, boolean z11) {
        this.f89608a = aVar;
        this.f89609b = aVar2;
        this.f89610c = z10;
        this.f89611d = z11;
    }

    public static b parseVersionRange(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean zStartsWith = str.startsWith(C3191e4.i.f36529d);
            boolean zStartsWith2 = str.startsWith("(");
            if (zStartsWith || zStartsWith2) {
                str = str.substring(1);
            } else {
                zStartsWith = true;
            }
            boolean zEndsWith = str.endsWith(C3191e4.i.f36531e);
            boolean zEndsWith2 = str.endsWith(")");
            if (zEndsWith || zEndsWith2) {
                str = str.substring(0, str.length() - 1);
            } else {
                zEndsWith = true;
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length >= 2) {
                return new b(a.parseVersion(strArrSplit[0]), a.parseVersion(strArrSplit[1]), zStartsWith, zEndsWith);
            }
            a version = a.parseVersion(str);
            if (version != null) {
                return new b(version, version, zStartsWith, zEndsWith);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean contains(a aVar) {
        boolean z10 = this.f89611d;
        boolean z11 = this.f89610c;
        a aVar2 = this.f89609b;
        a aVar3 = this.f89608a;
        if (aVar3 != null && aVar2 != null && (((z11 && aVar.isAfterOrEquals(aVar3)) || (!z11 && aVar.isAfter(aVar3))) && ((z10 && aVar.isBeforeOrEquals(aVar2)) || (!z10 && aVar.isBefore(aVar2))))) {
            return true;
        }
        if (aVar3 != null && aVar2 == null && ((z11 && aVar.isAfterOrEquals(aVar3)) || (!z11 && aVar.isAfter(aVar3)))) {
            return true;
        }
        if (aVar3 != null || aVar2 == null || (!(z10 && aVar.isBeforeOrEquals(aVar2)) && (z10 || !aVar.isBefore(aVar2)))) {
            return aVar3 == null && aVar2 == null;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f89610c == bVar.f89610c && this.f89611d == bVar.f89611d && Objects.equals(this.f89608a, bVar.f89608a) && Objects.equals(this.f89609b, bVar.f89609b)) {
                return true;
            }
        }
        return false;
    }
}
