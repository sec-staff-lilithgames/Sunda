package zu;

import com.ironsource.C3191e4;
import java.io.Serializable;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements m, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final m f98851b;

    /* renamed from: c, reason: collision with root package name */
    public final k f98852c;

    public c(m left, k element) {
        e0.checkNotNullParameter(left, "left");
        e0.checkNotNullParameter(element, "element");
        this.f98851b = left;
        this.f98852c = element;
    }

    public boolean equals(Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                m mVar = cVar2.f98851b;
                cVar2 = mVar instanceof c ? (c) mVar : null;
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                m mVar2 = cVar3.f98851b;
                cVar3 = mVar2 instanceof c ? (c) mVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                c cVar4 = this;
                while (true) {
                    k kVar = cVar4.f98852c;
                    if (!e0.areEqual(cVar.get(kVar.getKey()), kVar)) {
                        zAreEqual = false;
                        break;
                    }
                    m mVar3 = cVar4.f98851b;
                    if (!(mVar3 instanceof c)) {
                        e0.checkNotNull(mVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        k kVar2 = (k) mVar3;
                        zAreEqual = e0.areEqual(cVar.get(kVar2.getKey()), kVar2);
                        break;
                    }
                    cVar4 = (c) mVar3;
                }
                if (zAreEqual) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // zu.m
    public <R> R fold(R r10, p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) operation.invoke(this.f98851b.fold(r10, operation), this.f98852c);
    }

    @Override // zu.m
    public <E extends k> E get(l key) {
        e0.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            E e10 = (E) cVar.f98852c.get(key);
            if (e10 != null) {
                return e10;
            }
            m mVar = cVar.f98851b;
            if (!(mVar instanceof c)) {
                return (E) mVar.get(key);
            }
            cVar = (c) mVar;
        }
    }

    public int hashCode() {
        return this.f98852c.hashCode() + this.f98851b.hashCode();
    }

    @Override // zu.m
    public m minusKey(l key) {
        e0.checkNotNullParameter(key, "key");
        k kVar = this.f98852c;
        k kVar2 = kVar.get(key);
        m mVar = this.f98851b;
        if (kVar2 != null) {
            return mVar;
        }
        m mVarMinusKey = mVar.minusKey(key);
        return mVarMinusKey == mVar ? this : mVarMinusKey == n.f98854b ? kVar : new c(mVarMinusKey, kVar);
    }

    @Override // zu.m
    public m plus(m mVar) {
        return i.plus(this, mVar);
    }

    public String toString() {
        return o2.q(new StringBuilder(C3191e4.i.f36529d), (String) fold("", new a1.n(13)), AbstractJsonLexerKt.END_LIST);
    }
}
