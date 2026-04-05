package vw;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b3 implements k4 {

    /* renamed from: b, reason: collision with root package name */
    public m2 f89711b;

    /* renamed from: c, reason: collision with root package name */
    public m2 f89712c;

    /* renamed from: e, reason: collision with root package name */
    public a3 f89713e;

    /* renamed from: f, reason: collision with root package name */
    public final x2 f89714f;

    public b3(x2 x2Var) {
        this.f89714f = x2Var;
    }

    @Override // vw.k4
    public String getAttribute(String str) throws Exception {
        o1 expression = this.f89714f.getExpression();
        return expression == null ? str : expression.getAttribute(str);
    }

    @Override // vw.k4
    public m2 getAttributes() throws Exception {
        if (this.f89711b == null) {
            this.f89711b = this.f89714f.getAttributes();
        }
        return this.f89711b;
    }

    @Override // vw.k4
    public i2 getElement(String str) throws Exception {
        return getElements().getLabel(str);
    }

    @Override // vw.k4
    public m2 getElements() throws Exception {
        if (this.f89712c == null) {
            this.f89712c = this.f89714f.getElements();
        }
        return this.f89712c;
    }

    public a3 getModels() throws Exception {
        if (this.f89713e == null) {
            this.f89713e = this.f89714f.getModels();
        }
        return this.f89713e;
    }

    @Override // vw.k4
    public String getName() {
        return this.f89714f.getName();
    }

    @Override // vw.k4
    public String getPath(String str) throws Exception {
        o1 expression = this.f89714f.getExpression();
        return expression == null ? str : expression.getElement(str);
    }

    @Override // vw.k4
    public String getPrefix() {
        return this.f89714f.getPrefix();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vw.k4
    public k4 getSection(String str) throws Exception {
        x2 x2VarTake;
        z2 z2Var = (z2) getModels().get(str);
        if (z2Var == null || (x2VarTake = z2Var.take()) == null) {
            return null;
        }
        return new b3(x2VarTake);
    }

    @Override // vw.k4
    public i2 getText() throws Exception {
        return this.f89714f.getText();
    }

    @Override // vw.k4
    public boolean isSection(String str) throws Exception {
        return getModels().get(str) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f89714f.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }
}
