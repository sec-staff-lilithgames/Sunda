package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name */
    public final h f96670b;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f96669a = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final s f96671c = new s();

    public a0(h hVar) {
        this.f96670b = hVar;
    }

    public boolean isEmpty(p pVar) throws Exception {
        return this.f96671c.top() == pVar && this.f96670b.peek().isEnd();
    }

    public boolean isRoot(p pVar) {
        return this.f96671c.bottom() == pVar;
    }

    public p readElement(p pVar) throws Exception {
        s sVar = this.f96671c;
        if (!sVar.isRelevant(pVar)) {
            return null;
        }
        h hVar = this.f96670b;
        for (g next = hVar.next(); next != null; next = hVar.next()) {
            if (next.isEnd()) {
                if (sVar.pop() == pVar) {
                    return null;
                }
            } else if (next.isStart()) {
                o oVar = new o(pVar, this, next);
                StringBuilder sb2 = this.f96669a;
                if (sb2.length() > 0) {
                    sb2.setLength(0);
                }
                return next.isStart() ? (p) sVar.push(oVar) : oVar;
            }
        }
        return null;
    }

    public p readRoot() throws Exception {
        if (!this.f96671c.isEmpty()) {
            return null;
        }
        p element = readElement(null);
        if (element != null) {
            return element;
        }
        throw new x("Document has no root element");
    }

    public String readValue(p pVar) throws Exception {
        s sVar = this.f96671c;
        if (!sVar.isRelevant(pVar)) {
            return null;
        }
        StringBuilder sb2 = this.f96669a;
        int length = sb2.length();
        h hVar = this.f96670b;
        if (length <= 0 && hVar.peek().isEnd()) {
            if (sVar.top() == pVar) {
                return null;
            }
            sVar.pop();
            hVar.next();
        }
        for (g gVarPeek = hVar.peek(); sVar.top() == pVar && gVarPeek.isText(); gVarPeek = hVar.peek()) {
            g gVarPeek2 = hVar.peek();
            if (gVarPeek2.isText()) {
                sb2.append(gVarPeek2.getValue());
            }
            hVar.next();
        }
        if (sb2.length() <= 0) {
            return null;
        }
        String string = sb2.toString();
        sb2.setLength(0);
        return string;
    }

    public void skipElement(p pVar) throws Exception {
        while (readElement(pVar) != null) {
        }
    }

    public p readElement(p pVar, String str) throws Exception {
        s sVar = this.f96671c;
        if (!sVar.isRelevant(pVar)) {
            return null;
        }
        h hVar = this.f96670b;
        for (g gVarPeek = hVar.peek(); gVarPeek != null; gVarPeek = hVar.peek()) {
            if (gVarPeek.isText()) {
                g gVarPeek2 = hVar.peek();
                if (gVarPeek2.isText()) {
                    this.f96669a.append(gVarPeek2.getValue());
                }
            } else if (gVarPeek.isEnd()) {
                if (sVar.top() == pVar) {
                    return null;
                }
                sVar.pop();
            } else if (gVarPeek.isStart()) {
                String name = gVarPeek.getName();
                if (name == null ? false : name.equals(str)) {
                    return readElement(pVar);
                }
                return null;
            }
            hVar.next();
        }
        return null;
    }
}
