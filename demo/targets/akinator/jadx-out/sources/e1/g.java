package e1;

import com.ironsource.C3191e4;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: b, reason: collision with root package name */
    public final v f53475b;

    /* renamed from: c, reason: collision with root package name */
    public final v f53476c;

    public g(v outer, v inner) {
        e0.checkNotNullParameter(outer, "outer");
        e0.checkNotNullParameter(inner, "inner");
        this.f53475b = outer;
        this.f53476c = inner;
    }

    @Override // e1.v
    public boolean all(kv.l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return this.f53475b.all(predicate) && this.f53476c.all(predicate);
    }

    @Override // e1.v
    public boolean any(kv.l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return this.f53475b.any(predicate) || this.f53476c.any(predicate);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return e0.areEqual(this.f53475b, gVar.f53475b) && e0.areEqual(this.f53476c, gVar.f53476c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e1.v
    public <R> R foldIn(R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) this.f53476c.foldIn(this.f53475b.foldIn(r10, operation), operation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e1.v
    public <R> R foldOut(R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) this.f53475b.foldOut(this.f53476c.foldOut(r10, operation), operation);
    }

    public int hashCode() {
        return (this.f53476c.hashCode() * 31) + this.f53475b.hashCode();
    }

    @Override // e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return o2.q(new StringBuilder(C3191e4.i.f36529d), (String) foldIn("", f.f53474e), AbstractJsonLexerKt.END_LIST);
    }
}
