package uu;

import hr.kNq.ikJMrW;
import java.util.Iterator;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements rv.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rv.t f88734a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f88735b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f88736c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f88737d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f88738e;

        public a(rv.t tVar, int i10, int i11, boolean z10, boolean z11) {
            this.f88734a = tVar;
            this.f88735b = i10;
            this.f88736c = i11;
            this.f88737d = z10;
            this.f88738e = z11;
        }

        @Override // rv.t
        public Iterator<List<? extends T>> iterator() {
            return g2.windowedIterator(this.f88734a.iterator(), this.f88735b, this.f88736c, this.f88737d, this.f88738e);
        }
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? a1.f88698b : rv.w.iterator(new f2(i10, i11, iterator, z11, z10, null));
    }

    public static final <T> rv.t windowedSequence(rv.t tVar, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        checkWindowSizeStep(i10, i11);
        return new a(tVar, i10, i11, z10, z11);
    }

    public static final void checkWindowSizeStep(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            String str = ikJMrW.pGtlq;
            throw new IllegalArgumentException((i10 != i11 ? o2.i(i10, i11, "Both size ", " and step ", str) : o2.k(i10, "size ", str)).toString());
        }
    }
}
