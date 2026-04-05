package ec;

import java.util.HashSet;
import ub.o;
import ub.p;
import ub.q;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f54009a;

    /* renamed from: b, reason: collision with root package name */
    public String f54010b;

    /* renamed from: c, reason: collision with root package name */
    public String f54011c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f54012d;

    public b(Object obj) {
        this.f54009a = obj;
    }

    public static b rootDetector(u uVar) {
        return new b(uVar);
    }

    public b child() {
        return new b(this.f54009a);
    }

    public p findLocation() {
        Object obj = this.f54009a;
        if (obj instanceof u) {
            return ((u) obj).currentLocation();
        }
        return null;
    }

    public Object getSource() {
        return this.f54009a;
    }

    public boolean isDup(String str) throws q {
        String str2 = this.f54010b;
        if (str2 == null) {
            this.f54010b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f54011c;
        if (str3 == null) {
            this.f54011c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f54012d == null) {
            HashSet hashSet = new HashSet(16);
            this.f54012d = hashSet;
            hashSet.add(this.f54010b);
            this.f54012d.add(this.f54011c);
        }
        return !this.f54012d.add(str);
    }

    public void reset() {
        this.f54010b = null;
        this.f54011c = null;
        this.f54012d = null;
    }

    public static b rootDetector(o oVar) {
        return new b(oVar);
    }
}
