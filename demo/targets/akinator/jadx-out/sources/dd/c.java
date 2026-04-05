package dd;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f51986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f51988c;

    public c(Class cls, int i10, Object obj) {
        this.f51986a = cls;
        this.f51987b = i10;
        this.f51988c = obj;
    }

    public boolean equals(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == this) {
            return true;
        }
        if (!i.hasClass(obj, this.f51986a)) {
            return false;
        }
        int length = Array.getLength(obj);
        int i10 = this.f51987b;
        if (length != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj2 = Array.get(this.f51988c, i11);
            Object obj3 = Array.get(obj, i11);
            if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }
}
