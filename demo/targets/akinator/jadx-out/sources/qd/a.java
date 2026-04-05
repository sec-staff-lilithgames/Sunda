package qd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public m f82742a = null;

    /* renamed from: b, reason: collision with root package name */
    public List f82743b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public d f82744c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f82745d = "";

    public a addLogSourceMetrics(i iVar) {
        this.f82743b.add(iVar);
        return this;
    }

    public b build() {
        return new b(this.f82742a, Collections.unmodifiableList(this.f82743b), this.f82744c, this.f82745d);
    }

    public a setAppNamespace(String str) {
        this.f82745d = str;
        return this;
    }

    public a setGlobalMetrics(d dVar) {
        this.f82744c = dVar;
        return this;
    }

    public a setLogSourceMetricsList(List<i> list) {
        this.f82743b = list;
        return this;
    }

    public a setWindow(m mVar) {
        this.f82742a = mVar;
        return this;
    }
}
