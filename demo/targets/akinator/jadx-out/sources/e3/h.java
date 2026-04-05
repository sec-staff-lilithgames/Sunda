package e3;

import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: d, reason: collision with root package name */
    public final s f53665d;

    /* renamed from: f, reason: collision with root package name */
    public int f53667f;

    /* renamed from: g, reason: collision with root package name */
    public int f53668g;

    /* renamed from: a, reason: collision with root package name */
    public s f53662a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f53663b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53664c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f53666e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f53669h = 1;

    /* renamed from: i, reason: collision with root package name */
    public i f53670i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f53671j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f53672k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f53673l = new ArrayList();

    public h(s sVar) {
        this.f53665d = sVar;
    }

    public void addDependency(e eVar) {
        this.f53672k.add(eVar);
        if (this.f53671j) {
            eVar.update(eVar);
        }
    }

    public void clear() {
        this.f53673l.clear();
        this.f53672k.clear();
        this.f53671j = false;
        this.f53668g = 0;
        this.f53664c = false;
        this.f53663b = false;
    }

    public String name() {
        String str;
        String debugName = this.f53665d.f53696b.getDebugName();
        int i10 = this.f53666e;
        StringBuilder sbT = a.b.t((i10 == 4 || i10 == 5) ? o2.l(debugName, "_HORIZONTAL") : o2.l(debugName, "_VERTICAL"), ":");
        switch (this.f53666e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                throw null;
        }
        sbT.append(str);
        return sbT.toString();
    }

    public void resolve(int i10) {
        if (this.f53671j) {
            return;
        }
        this.f53671j = true;
        this.f53668g = i10;
        Iterator it = this.f53672k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.update(eVar);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53665d.f53696b.getDebugName());
        sb2.append(":");
        switch (this.f53666e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = AbstractJsonLexerKt.NULL;
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.f53671j ? Integer.valueOf(this.f53668g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f53673l.size());
        sb2.append(":d=");
        sb2.append(this.f53672k.size());
        sb2.append(">");
        return sb2.toString();
    }

    @Override // e3.e
    public void update(e eVar) {
        ArrayList arrayList = this.f53673l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).f53671j) {
                return;
            }
        }
        this.f53664c = true;
        s sVar = this.f53662a;
        if (sVar != null) {
            sVar.update(this);
        }
        if (this.f53663b) {
            this.f53665d.update(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        h hVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            if (!(hVar2 instanceof i)) {
                i10++;
                hVar = hVar2;
            }
        }
        if (hVar != null && i10 == 1 && hVar.f53671j) {
            i iVar = this.f53670i;
            if (iVar != null) {
                if (!iVar.f53671j) {
                    return;
                } else {
                    this.f53667f = this.f53669h * iVar.f53668g;
                }
            }
            resolve(hVar.f53668g + this.f53667f);
        }
        s sVar2 = this.f53662a;
        if (sVar2 != null) {
            sVar2.update(this);
        }
    }
}
