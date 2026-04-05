package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l2 {
    public static List<q> getClientInterceptors() {
        List<q> list;
        synchronized (p1.class) {
            p1.f91089e = true;
            list = p1.f91085a;
        }
        return list;
    }

    public static List<o5> getServerInterceptors() {
        List<o5> list;
        synchronized (p1.class) {
            p1.f91089e = true;
            list = p1.f91086b;
        }
        return list;
    }

    public static List<b6.a> getServerStreamTracerFactories() {
        List<b6.a> list;
        synchronized (p1.class) {
            p1.f91089e = true;
            list = p1.f91087c;
        }
        return list;
    }

    public static void setInterceptorsTracers(List<q> list, List<o5> list2, List<b6.a> list3) {
        synchronized (p1.class) {
            if (p1.f91089e) {
                throw new IllegalStateException("Set cannot be called after any get call");
            }
            if (p1.f91088d) {
                throw new IllegalStateException("Global interceptors and tracers are already set");
            }
            mh.p1.checkNotNull(list);
            mh.p1.checkNotNull(list2);
            mh.p1.checkNotNull(list3);
            p1.f91085a = Collections.unmodifiableList(new ArrayList(list));
            p1.f91086b = Collections.unmodifiableList(new ArrayList(list2));
            p1.f91087c = Collections.unmodifiableList(new ArrayList(list3));
            p1.f91088d = true;
        }
    }
}
