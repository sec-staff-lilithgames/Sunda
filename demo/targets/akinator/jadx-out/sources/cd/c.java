package cd;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final c f12134a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f12135b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f12136c;

    public c(Class<?> cls) {
        this(null, cls);
    }

    public void addSelfReference(m mVar) {
        if (this.f12136c == null) {
            this.f12136c = new ArrayList();
        }
        this.f12136c.add(mVar);
    }

    public c child(Class<?> cls) {
        return new c(this, cls);
    }

    public c find(Class<?> cls) {
        if (this.f12135b == cls) {
            return this;
        }
        for (c cVar = this.f12134a; cVar != null; cVar = cVar.f12134a) {
            if (cVar.f12135b == cls) {
                return cVar;
            }
        }
        return null;
    }

    public void resolveSelfReferences(jc.o oVar) {
        ArrayList arrayList = this.f12136c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).setReference(oVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList arrayList = this.f12136c;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (c cVar = this; cVar != null; cVar = cVar.f12134a) {
            sb2.append(' ');
            sb2.append(cVar.f12135b.getName());
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public c(c cVar, Class cls) {
        this.f12134a = cVar;
        this.f12135b = cls;
    }
}
