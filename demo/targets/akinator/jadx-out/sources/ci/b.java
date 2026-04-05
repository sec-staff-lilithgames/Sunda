package ci;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ki.h2;
import md.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements j, sj.a, wd.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12325c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12328g;

    public /* synthetic */ b(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f12324b = i10;
        this.f12325c = obj;
        this.f12328g = obj2;
        this.f12326e = j10;
        this.f12327f = obj3;
    }

    @Override // ci.j
    public ScheduledFuture addCompleter(i iVar) {
        switch (this.f12324b) {
            case 0:
                g gVar = (g) this.f12325c;
                Runnable runnable = (Runnable) this.f12328g;
                return gVar.f12347c.schedule(new e(gVar, runnable, iVar, 1), this.f12326e, (TimeUnit) this.f12327f);
            default:
                g gVar2 = (g) this.f12325c;
                Callable callable = (Callable) this.f12328g;
                return gVar2.f12347c.schedule(new f(gVar2, 0, callable, iVar), this.f12326e, (TimeUnit) this.f12327f);
        }
    }

    @Override // wd.b
    public Object execute() {
        ud.h hVar = (ud.h) this.f12325c;
        Iterable<vd.m> iterable = (Iterable) this.f12328g;
        d0 d0Var = (d0) this.f12327f;
        vd.p pVar = (vd.p) hVar.f88429c;
        pVar.recordFailure(iterable);
        pVar.recordNextCallTime(d0Var, hVar.f88433g.getTime() + this.f12326e);
        return null;
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
        ((ei.a) cVar.get()).prepareNativeSession((String) this.f12325c, (String) this.f12328g, this.f12326e, (h2) this.f12327f);
    }

    public /* synthetic */ b(ud.h hVar, Iterable iterable, d0 d0Var, long j10) {
        this.f12324b = 3;
        this.f12325c = hVar;
        this.f12328g = iterable;
        this.f12327f = d0Var;
        this.f12326e = j10;
    }
}
