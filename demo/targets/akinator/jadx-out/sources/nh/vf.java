package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class vf extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76719e;

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f76720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Set f76721g;

    public vf(Set set, Set set2, int i10) {
        this.f76719e = i10;
        switch (i10) {
            case 1:
                this.f76721g = set2;
                this.f76720f = set.iterator();
                break;
            default:
                this.f76721g = set2;
                this.f76720f = set.iterator();
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // nh.b
    public final Object computeNext() {
        Object next;
        Object next2;
        switch (this.f76719e) {
            case 0:
                do {
                    Iterator it = this.f76720f;
                    if (!it.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!this.f76721g.contains(next));
            default:
                do {
                    Iterator it2 = this.f76720f;
                    if (!it2.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        next2 = it2.next();
                    }
                } while (this.f76721g.contains(next2));
        }
        return null;
    }
}
