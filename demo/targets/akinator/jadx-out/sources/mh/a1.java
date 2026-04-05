package mh;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f74582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(d1 d1Var, d1 d1Var2) {
        super(d1Var2);
        this.f74582b = d1Var;
    }

    @Override // mh.d1
    public <A extends Appendable> A appendTo(A a10, Iterator<?> it) throws IOException {
        d1 d1Var;
        p1.checkNotNull(a10, "appendable");
        p1.checkNotNull(it, "parts");
        while (true) {
            boolean zHasNext = it.hasNext();
            d1Var = this.f74582b;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                a10.append(d1Var.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                a10.append(d1Var.f74600a);
                a10.append(d1Var.a(next2));
            }
        }
        return a10;
    }

    @Override // mh.d1
    public String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    @Override // mh.d1
    public d1 useForNull(String str) {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    @Override // mh.d1
    public c1 withKeyValueSeparator(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}
