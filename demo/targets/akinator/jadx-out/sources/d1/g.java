package d1;

import androidx.lifecycle.x0;
import java.util.List;
import q0.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements f, p0, zu.k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f51699c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final p0.z f51700b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements zu.l {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public String toString() {
            return "CompositionErrorContext";
        }
    }

    public g(p0.z zVar) {
        this.f51700b = zVar;
    }

    @Override // d1.f
    public boolean attachComposeStackTrace(Throwable th2, Object obj) {
        return d.tryAttachComposeStackTrace(th2, new x0(8, this, obj));
    }

    @Override // q0.p0
    public List<c> buildStackTrace(Integer num) {
        return this.f51700b.parentStackTrace();
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) zu.j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) zu.j.get(this, lVar);
    }

    @Override // zu.k
    public zu.l getKey() {
        return f51699c;
    }

    @Override // zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return zu.j.minusKey(this, lVar);
    }

    @Override // zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return zu.j.plus(this, mVar);
    }
}
