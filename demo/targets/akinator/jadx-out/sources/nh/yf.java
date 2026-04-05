package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class yf extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterator f76796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set f76797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Iterator f76798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f76799h;

    public yf(Iterator it, Set set, Iterator it2, Set set2) {
        this.f76796e = it;
        this.f76797f = set;
        this.f76798g = it2;
        this.f76799h = set2;
    }

    @Override // nh.b
    public Object computeNext() {
        Object next;
        Object next2;
        do {
            Iterator it = this.f76796e;
            if (!it.hasNext()) {
                do {
                    Iterator it2 = this.f76798g;
                    if (!it2.hasNext()) {
                        this.f76111b = 3;
                        return null;
                    }
                    next = it2.next();
                } while (this.f76799h.contains(next));
                return next;
            }
            next2 = it.next();
        } while (this.f76797f.contains(next2));
        return next2;
    }
}
