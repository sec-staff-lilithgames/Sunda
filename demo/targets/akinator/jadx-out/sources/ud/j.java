package ud;

import java.util.concurrent.Executor;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f88445a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.d f88446b;

    /* renamed from: c, reason: collision with root package name */
    public final l f88447c;

    /* renamed from: d, reason: collision with root package name */
    public final wd.c f88448d;

    public j(Executor executor, vd.d dVar, l lVar, wd.c cVar) {
        this.f88445a = executor;
        this.f88446b = dVar;
        this.f88447c = lVar;
        this.f88448d = cVar;
    }

    public void ensureContextsScheduled() {
        this.f88445a.execute(new w(this, 19));
    }
}
