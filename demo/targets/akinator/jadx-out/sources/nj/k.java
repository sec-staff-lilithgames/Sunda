package nj;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f76950a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f76951b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f76952c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f76953d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f76954e = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends d {
        public a(bj.x0 x0Var, Executor executor) {
            super(executor);
        }

        @Override // nj.k.d
        public /* bridge */ /* synthetic */ Object getListener() {
            getListener();
            return null;
        }

        public a(bj.x0 x0Var) {
            super(null);
        }

        @Override // nj.k.d
        public bj.x0 getListener() {
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends d {
        public b(bj.y0 y0Var, Executor executor) {
            super(executor);
        }

        @Override // nj.k.d
        public /* bridge */ /* synthetic */ Object getListener() {
            getListener();
            return null;
        }

        public b(bj.y0 y0Var) {
            super(null);
        }

        @Override // nj.k.d
        public bj.y0 getListener() {
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends d {
        public c(bj.c1 c1Var, Executor executor) {
            super(executor);
        }

        @Override // nj.k.d
        public /* bridge */ /* synthetic */ Object getListener() {
            getListener();
            return null;
        }

        public c(bj.c1 c1Var) {
            super(null);
        }

        @Override // nj.k.d
        public bj.c1 getListener() {
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f76955a;

        public d(Executor executor) {
            this.f76955a = executor;
        }

        public abstract Object getListener();

        public Executor withExecutor(Executor executor) {
            Executor executor2 = this.f76955a;
            return executor2 == null ? executor : executor2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends d {
        public e(bj.d1 d1Var, Executor executor) {
            super(executor);
        }

        @Override // nj.k.d
        public /* bridge */ /* synthetic */ Object getListener() {
            getListener();
            return null;
        }

        public e(bj.d1 d1Var) {
            super(null);
        }

        @Override // nj.k.d
        public bj.d1 getListener() {
            return null;
        }
    }

    public k(Executor executor) {
        this.f76950a = executor;
    }

    public void addClickListener(bj.x0 x0Var) {
        this.f76951b.put(x0Var, new a(x0Var));
    }

    public void addDismissListener(bj.y0 y0Var) {
        this.f76952c.put(y0Var, new b(y0Var));
    }

    public void addDisplayErrorListener(bj.c1 c1Var) {
        this.f76953d.put(c1Var, new c(c1Var));
    }

    public void addImpressionListener(bj.d1 d1Var) {
        this.f76954e.put(d1Var, new e(d1Var));
    }

    public void displayErrorEncountered(rj.o oVar, bj.a1 a1Var) {
        for (c cVar : this.f76953d.values()) {
            cVar.withExecutor(this.f76950a).execute(new ji.t(cVar, oVar, a1Var, 16));
        }
    }

    public Map getAllListeners() {
        HashMap map = new HashMap();
        map.putAll(this.f76951b);
        map.putAll(this.f76954e);
        map.putAll(this.f76953d);
        map.putAll(this.f76952c);
        return map;
    }

    public void impressionDetected(rj.o oVar) {
        for (e eVar : this.f76954e.values()) {
            eVar.withExecutor(this.f76950a).execute(new ji.t(eVar, oVar, 19));
        }
    }

    public void messageClicked(rj.o oVar, rj.b bVar) {
        for (a aVar : this.f76951b.values()) {
            aVar.withExecutor(this.f76950a).execute(new ji.t(aVar, oVar, bVar, 17));
        }
    }

    public void messageDismissed(rj.o oVar) {
        for (b bVar : this.f76952c.values()) {
            bVar.withExecutor(this.f76950a).execute(new ji.t(bVar, oVar, 18));
        }
    }

    public void removeAllListeners() {
        this.f76951b.clear();
        this.f76954e.clear();
        this.f76953d.clear();
        this.f76952c.clear();
    }

    public void removeClickListener(bj.x0 x0Var) {
        this.f76951b.remove(x0Var);
    }

    public void removeDismissListener(bj.y0 y0Var) {
        this.f76952c.remove(y0Var);
    }

    public void removeDisplayErrorListener(bj.c1 c1Var) {
        this.f76953d.remove(c1Var);
    }

    public void removeImpressionListener(bj.d1 d1Var) {
        this.f76954e.remove(d1Var);
    }

    public void addClickListener(bj.x0 x0Var, Executor executor) {
        this.f76951b.put(x0Var, new a(x0Var, executor));
    }

    public void addDismissListener(bj.y0 y0Var, Executor executor) {
        this.f76952c.put(y0Var, new b(y0Var, executor));
    }

    public void addDisplayErrorListener(bj.c1 c1Var, Executor executor) {
        this.f76953d.put(c1Var, new c(c1Var, executor));
    }

    public void addImpressionListener(bj.d1 d1Var, Executor executor) {
        this.f76954e.put(d1Var, new e(d1Var, executor));
    }
}
