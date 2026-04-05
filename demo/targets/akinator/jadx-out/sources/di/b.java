package di;

import bi.y;
import fi.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public volatile fi.a f52338a;

    /* renamed from: b, reason: collision with root package name */
    public volatile gi.b f52339b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f52340c;

    public b(sj.b bVar) {
        this(bVar, new gi.c(), new f());
    }

    public fi.a getAnalyticsEventLogger() {
        return new a(this);
    }

    public gi.b getDeferredBreadcrumbSource() {
        return new a(this);
    }

    public b(sj.b bVar, gi.b bVar2, fi.a aVar) {
        this.f52339b = bVar2;
        this.f52340c = new ArrayList();
        this.f52338a = aVar;
        ((y) bVar).whenAvailable(new a(this));
    }
}
