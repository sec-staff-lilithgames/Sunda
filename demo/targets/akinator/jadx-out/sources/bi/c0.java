package bi;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c0 implements yi.c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f9551a;

    /* renamed from: b, reason: collision with root package name */
    public final yi.c f9552b;

    public c0(Set<Class<?>> set, yi.c cVar) {
        this.f9551a = set;
        this.f9552b = cVar;
    }

    @Override // yi.c
    public void publish(yi.a aVar) {
        if (!this.f9551a.contains(aVar.getType())) {
            throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
        }
        this.f9552b.publish(aVar);
    }
}
