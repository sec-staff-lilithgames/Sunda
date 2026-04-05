package zc;

import java.util.Collections;
import java.util.List;
import jc.s0;
import jc.w;
import jc.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: i, reason: collision with root package name */
    public static final d[] f97776i = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public final jc.d f97777a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f97778b;

    /* renamed from: c, reason: collision with root package name */
    public List f97779c = Collections.EMPTY_LIST;

    /* renamed from: d, reason: collision with root package name */
    public d[] f97780d;

    /* renamed from: e, reason: collision with root package name */
    public a f97781e;

    /* renamed from: f, reason: collision with root package name */
    public Object f97782f;

    /* renamed from: g, reason: collision with root package name */
    public rc.l f97783g;

    /* renamed from: h, reason: collision with root package name */
    public ad.l f97784h;

    public f(jc.d dVar) {
        this.f97777a = dVar;
    }

    public w build() {
        d[] dVarArr;
        if (this.f97783g != null && this.f97778b.isEnabled(y.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f97783g.fixAccess(this.f97778b.isEnabled(y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        a aVar = this.f97781e;
        if (aVar != null) {
            aVar.fixAccess(this.f97778b);
        }
        List list = this.f97779c;
        if (list == null || list.isEmpty()) {
            if (this.f97781e == null && this.f97784h == null) {
                return null;
            }
            dVarArr = f97776i;
        } else {
            List list2 = this.f97779c;
            dVarArr = (d[]) list2.toArray(new d[list2.size()]);
            if (this.f97778b.isEnabled(y.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (d dVar : dVarArr) {
                    dVar.fixAccess(this.f97778b);
                }
            }
        }
        d[] dVarArr2 = this.f97780d;
        if (dVarArr2 == null || dVarArr2.length == this.f97779c.size()) {
            return new e(this.f97777a.getType(), this, dVarArr, this.f97780d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f97779c.size()), Integer.valueOf(this.f97780d.length)));
    }

    public e createDummy() {
        return e.createDummy(this.f97777a.getType(), this);
    }

    public a getAnyGetter() {
        return this.f97781e;
    }

    public jc.d getBeanDescription() {
        return this.f97777a;
    }

    public rc.e getClassInfo() {
        return this.f97777a.getClassInfo();
    }

    public Object getFilterId() {
        return this.f97782f;
    }

    public d[] getFilteredProperties() {
        return this.f97780d;
    }

    public ad.l getObjectIdWriter() {
        return this.f97784h;
    }

    public List<d> getProperties() {
        return this.f97779c;
    }

    public rc.l getTypeId() {
        return this.f97783g;
    }

    public boolean hasProperties() {
        List list = this.f97779c;
        return list != null && list.size() > 0;
    }

    public void setAnyGetter(a aVar) {
        this.f97781e = aVar;
    }

    public void setFilterId(Object obj) {
        this.f97782f = obj;
    }

    public void setFilteredProperties(d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != this.f97779c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(dVarArr.length), Integer.valueOf(this.f97779c.size())));
        }
        this.f97780d = dVarArr;
    }

    public void setObjectIdWriter(ad.l lVar) {
        this.f97784h = lVar;
    }

    public void setProperties(List<d> list) {
        this.f97779c = list;
    }

    public void setTypeId(rc.l lVar) {
        if (this.f97783g == null) {
            this.f97783g = lVar;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f97783g + " and " + lVar);
    }
}
