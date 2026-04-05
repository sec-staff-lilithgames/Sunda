package x7;

import java.util.List;
import p0.o2;
import z7.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f91776a;

    /* renamed from: b, reason: collision with root package name */
    public final char f91777b;

    /* renamed from: c, reason: collision with root package name */
    public final double f91778c;

    /* renamed from: d, reason: collision with root package name */
    public final String f91779d;

    /* renamed from: e, reason: collision with root package name */
    public final String f91780e;

    public e(List<t> list, char c10, double d10, double d11, String str, String str2) {
        this.f91776a = list;
        this.f91777b = c10;
        this.f91778c = d11;
        this.f91779d = str;
        this.f91780e = str2;
    }

    public static int hashFor(char c10, String str, String str2) {
        return str2.hashCode() + o2.e(c10 * 31, 31, str);
    }

    public List<t> getShapes() {
        return this.f91776a;
    }

    public double getWidth() {
        return this.f91778c;
    }

    public int hashCode() {
        return hashFor(this.f91777b, this.f91780e, this.f91779d);
    }
}
