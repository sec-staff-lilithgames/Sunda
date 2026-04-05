package bi;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9570a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9571b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9572c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public j f9573d = j.f9565z8;

    public m(Executor executor) {
        this.f9570a = executor;
    }

    public m addComponent(c cVar) {
        this.f9572c.add(cVar);
        return this;
    }

    public m addComponentRegistrar(ComponentRegistrar componentRegistrar) {
        this.f9571b.add(new e(componentRegistrar, 1));
        return this;
    }

    public m addLazyComponentRegistrars(Collection<sj.c> collection) {
        this.f9571b.addAll(collection);
        return this;
    }

    public n build() {
        return new n(this.f9570a, this.f9571b, this.f9572c, this.f9573d);
    }

    public m setProcessor(j jVar) {
        this.f9573d = jVar;
        return this;
    }
}
