package vw;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b0 implements c4 {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f89690a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f89691b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f89692c;

    /* renamed from: d, reason: collision with root package name */
    public final y1 f89693d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.t0 f89694e;

    /* renamed from: f, reason: collision with root package name */
    public final xw.f f89695f;

    public b0(l0 l0Var, y1 y1Var, o1 o1Var, xw.f fVar) throws Exception {
        this.f89690a = y1Var.getElements();
        this.f89694e = l0Var.getStyle();
        this.f89692c = l0Var;
        this.f89693d = y1Var;
        this.f89695f = fVar;
        this.f89691b = o1Var;
    }

    public final void a(yw.h0 h0Var, Collection collection) throws Exception {
        for (Object obj : collection) {
            if (obj != null) {
                Class<?> cls = obj.getClass();
                y1 y1Var = this.f89693d;
                i2 label = y1Var.getLabel(cls);
                if (label == null) {
                    throw new i5("Entry of %s not declared in %s with annotation %s", cls, this.f89695f, y1Var);
                }
                n0 converter = label.getConverter(this.f89692c);
                Set setSingleton = Collections.singleton(obj);
                if (!label.isInline()) {
                    String element = ((yw.l) this.f89694e).getElement(label.getName());
                    if (!h0Var.isCommitted()) {
                        h0Var.setName(element);
                    }
                }
                converter.write(h0Var, setSingleton);
            }
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar) throws Exception {
        y1 y1Var = this.f89693d;
        i2 text = y1Var.getText();
        l0 l0Var = this.f89692c;
        if (text != null) {
            return y1Var.getText().getConverter(l0Var).read(pVar);
        }
        return ((i2) this.f89690a.get(this.f89691b.getElement(pVar.getName()))).getConverter(l0Var).read(pVar);
    }

    @Override // vw.c4, vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        return ((i2) this.f89690a.get(this.f89691b.getElement(pVar.getName()))).getConverter(this.f89692c).validate(pVar);
    }

    @Override // vw.c4, vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Collection collection = (Collection) obj;
        if (!this.f89693d.isInline()) {
            a(h0Var, collection);
        } else if (!collection.isEmpty()) {
            a(h0Var, collection);
        } else {
            if (h0Var.isCommitted()) {
                return;
            }
            h0Var.remove();
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        i2 i2Var = (i2) this.f89690a.get(this.f89691b.getElement(pVar.getName()));
        l0 l0Var = this.f89692c;
        Object obj2 = i2Var.getConverter(l0Var).read(pVar, obj);
        y1 y1Var = this.f89693d;
        return y1Var.getText() != null ? y1Var.getText().getConverter(l0Var).read(pVar.getParent(), obj) : obj2;
    }
}
