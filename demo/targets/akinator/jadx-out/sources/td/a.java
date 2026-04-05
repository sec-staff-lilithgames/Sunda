package td;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import jd.m;
import md.d0;
import md.h0;
import md.u;
import nd.f;
import ud.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f86813f = Logger.getLogger(h0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f86814a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f86815b;

    /* renamed from: c, reason: collision with root package name */
    public final f f86816c;

    /* renamed from: d, reason: collision with root package name */
    public final vd.d f86817d;

    /* renamed from: e, reason: collision with root package name */
    public final wd.c f86818e;

    public a(Executor executor, f fVar, l lVar, vd.d dVar, wd.c cVar) {
        this.f86815b = executor;
        this.f86816c = fVar;
        this.f86814a = lVar;
        this.f86817d = dVar;
        this.f86818e = cVar;
    }

    @Override // td.c
    public void schedule(d0 d0Var, u uVar, m mVar) {
        this.f86815b.execute(new al.a(28, this, d0Var, mVar, uVar));
    }
}
