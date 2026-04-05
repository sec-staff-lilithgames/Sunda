package vw;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d0 implements c4 {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f89735a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f89736b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f89737c;

    /* renamed from: d, reason: collision with root package name */
    public final y1 f89738d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.t0 f89739e;

    /* renamed from: f, reason: collision with root package name */
    public final xw.f f89740f;

    public d0(l0 l0Var, y1 y1Var, o1 o1Var, xw.f fVar) throws Exception {
        this.f89735a = y1Var.getElements();
        this.f89739e = l0Var.getStyle();
        this.f89737c = l0Var;
        this.f89738d = y1Var;
        this.f89740f = fVar;
        this.f89736b = o1Var;
    }

    public final void a(yw.h0 h0Var, Map map) throws Exception {
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                Class<?> cls = obj2.getClass();
                y1 y1Var = this.f89738d;
                i2 label = y1Var.getLabel(cls);
                if (label == null) {
                    throw new i5("Value of %s not declared in %s with annotation %s", cls, this.f89740f, y1Var);
                }
                n0 converter = label.getConverter(this.f89737c);
                Map mapSingletonMap = Collections.singletonMap(obj, obj2);
                if (!label.isInline()) {
                    String element = ((yw.l) this.f89739e).getElement(label.getName());
                    if (!h0Var.isCommitted()) {
                        h0Var.setName(element);
                    }
                }
                converter.write(h0Var, mapSingletonMap);
            }
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar) throws Exception {
        return ((i2) this.f89735a.get(this.f89736b.getElement(pVar.getName()))).getConverter(this.f89737c).read(pVar);
    }

    @Override // vw.c4, vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        return ((i2) this.f89735a.get(this.f89736b.getElement(pVar.getName()))).getConverter(this.f89737c).validate(pVar);
    }

    @Override // vw.c4, vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Map map = (Map) obj;
        if (!this.f89738d.isInline()) {
            a(h0Var, map);
        } else if (!map.isEmpty()) {
            a(h0Var, map);
        } else {
            if (h0Var.isCommitted()) {
                return;
            }
            h0Var.remove();
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        return ((i2) this.f89735a.get(this.f89736b.getElement(pVar.getName()))).getConverter(this.f89737c).read(pVar, obj);
    }
}
