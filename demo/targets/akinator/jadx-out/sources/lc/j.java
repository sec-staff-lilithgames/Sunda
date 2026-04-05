package lc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import rc.i1;
import rc.j1;
import tb.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public Map f73120b;

    /* renamed from: c, reason: collision with root package name */
    public tb.d0 f73121c;

    /* renamed from: e, reason: collision with root package name */
    public q0 f73122e;

    /* renamed from: f, reason: collision with root package name */
    public j1 f73123f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f73124g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f73125h;

    public j() {
        this(null, tb.d0.empty(), q0.empty(), i1.defaultInstance(), null, null);
    }

    public j copy() {
        HashMap map;
        if (this.f73120b == null) {
            map = null;
        } else {
            map = new HashMap();
            for (Map.Entry entry : this.f73120b.entrySet()) {
                map.put(entry.getKey(), ((c0) entry.getValue()).copy());
            }
        }
        return new j(map, this.f73121c, this.f73122e, this.f73123f, this.f73124g, this.f73125h);
    }

    public tb.t findFormatDefaults(Class<?> cls) {
        i iVar;
        tb.t format;
        Map map = this.f73120b;
        if (map != null && (iVar = (i) map.get(cls)) != null && (format = iVar.getFormat()) != null) {
            return !format.hasLenient() ? format.withLenient(this.f73125h) : format;
        }
        Boolean bool = this.f73125h;
        return bool == null ? tb.t.empty() : tb.t.forLeniency(bool.booleanValue());
    }

    public c0 findOrCreateOverride(Class<?> cls) {
        if (this.f73120b == null) {
            this.f73120b = new HashMap();
        }
        c0 c0Var = (c0) this.f73120b.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0();
        this.f73120b.put(cls, c0Var2);
        return c0Var2;
    }

    public i findOverride(Class<?> cls) {
        Map map = this.f73120b;
        if (map == null) {
            return null;
        }
        return (i) map.get(cls);
    }

    public tb.d0 getDefaultInclusion() {
        return this.f73121c;
    }

    public Boolean getDefaultLeniency() {
        return this.f73125h;
    }

    public Boolean getDefaultMergeable() {
        return this.f73124g;
    }

    public q0 getDefaultSetterInfo() {
        return this.f73122e;
    }

    public j1 getDefaultVisibility() {
        return this.f73123f;
    }

    public void setDefaultInclusion(tb.d0 d0Var) {
        this.f73121c = d0Var;
    }

    public void setDefaultLeniency(Boolean bool) {
        this.f73125h = bool;
    }

    public void setDefaultMergeable(Boolean bool) {
        this.f73124g = bool;
    }

    public void setDefaultSetterInfo(q0 q0Var) {
        this.f73122e = q0Var;
    }

    public void setDefaultVisibility(j1 j1Var) {
        this.f73123f = j1Var;
    }

    public j(HashMap map, tb.d0 d0Var, q0 q0Var, j1 j1Var, Boolean bool, Boolean bool2) {
        this.f73120b = map;
        this.f73121c = d0Var;
        this.f73122e = q0Var;
        this.f73123f = j1Var;
        this.f73124g = bool;
        this.f73125h = bool2;
    }
}
