package j9;

import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends z.f {

    /* renamed from: i, reason: collision with root package name */
    public int f69179i;

    @Override // z.t1, java.util.Map
    public void clear() {
        this.f69179i = 0;
        super.clear();
    }

    @Override // z.t1, java.util.Map
    public int hashCode() {
        if (this.f69179i == 0) {
            this.f69179i = super.hashCode();
        }
        return this.f69179i;
    }

    @Override // z.t1, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f69179i = 0;
        return super.put(obj, obj2);
    }

    @Override // z.t1
    public void putAll(t1 t1Var) {
        this.f69179i = 0;
        super.putAll(t1Var);
    }

    @Override // z.t1
    public Object removeAt(int i10) {
        this.f69179i = 0;
        return super.removeAt(i10);
    }

    @Override // z.t1
    public Object setValueAt(int i10, Object obj) {
        this.f69179i = 0;
        return super.setValueAt(i10, obj);
    }
}
