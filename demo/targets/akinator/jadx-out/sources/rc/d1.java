package rc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public c1 f84152a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f84153b;

    /* renamed from: c, reason: collision with root package name */
    public List f84154c;

    /* renamed from: d, reason: collision with root package name */
    public List f84155d;

    public void addExplicitDelegating(c1 c1Var) {
        if (this.f84153b == null) {
            this.f84153b = new ArrayList();
        }
        this.f84153b.add(c1Var);
    }

    public List<c1> getExplicitDelegating() {
        ArrayList arrayList = this.f84153b;
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public List<c1> getImplicitDelegatingConstructors() {
        List<c1> list = this.f84154c;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public List<c1> getImplicitDelegatingFactories() {
        List<c1> list = this.f84155d;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean hasDelegating() {
        ArrayList arrayList = this.f84153b;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean hasPropertiesBased() {
        return this.f84152a != null;
    }

    public boolean hasPropertiesBasedOrDelegating() {
        if (this.f84152a != null) {
            return true;
        }
        ArrayList arrayList = this.f84153b;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public void setImplicitDelegating(List<c1> list, List<c1> list2) {
        this.f84154c = list;
        this.f84155d = list2;
    }

    public void setPropertiesBased(lc.z zVar, c1 c1Var, String str) {
        if (this.f84152a != null) {
            throw new IllegalArgumentException(String.format("Conflicting property-based creators: already had %s creator %s, encountered another: %s", str, this.f84152a.creator(), c1Var.creator()));
        }
        this.f84152a = c1Var.introspectParamNames(zVar);
    }
}
