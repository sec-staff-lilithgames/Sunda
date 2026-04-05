package wr;

import java.util.concurrent.Executor;
import wr.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 extends f {

    /* renamed from: a, reason: collision with root package name */
    public final f f90813a;

    /* renamed from: b, reason: collision with root package name */
    public final f f90814b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public final f.a f90815a;

        /* renamed from: b, reason: collision with root package name */
        public final e4 f90816b;

        public a(f.a aVar, e4 e4Var) {
            this.f90815a = aVar;
            this.f90816b = e4Var;
        }

        @Override // wr.f.a
        public void apply(e4 e4Var) {
            mh.p1.checkNotNull(e4Var, "headers");
            e4 e4Var2 = new e4();
            e4Var2.merge(this.f90816b);
            e4Var2.merge(e4Var);
            this.f90815a.apply(e4Var2);
        }

        @Override // wr.f.a
        public void fail(m6 m6Var) {
            this.f90815a.fail(m6Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public final f.b f90817a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f90818b;

        /* renamed from: c, reason: collision with root package name */
        public final f.a f90819c;

        /* renamed from: d, reason: collision with root package name */
        public final u0 f90820d;

        public b(f.b bVar, Executor executor, f.a aVar, u0 u0Var) {
            this.f90817a = bVar;
            this.f90818b = executor;
            this.f90819c = (f.a) mh.p1.checkNotNull(aVar, "delegate");
            this.f90820d = (u0) mh.p1.checkNotNull(u0Var, "context");
        }

        @Override // wr.f.a
        public void apply(e4 e4Var) {
            mh.p1.checkNotNull(e4Var, "headers");
            u0 u0Var = this.f90820d;
            u0 u0VarAttach = u0Var.attach();
            try {
                b0.this.f90814b.applyRequestMetadata(this.f90817a, this.f90818b, new a(this.f90819c, e4Var));
            } finally {
                u0Var.detach(u0VarAttach);
            }
        }

        @Override // wr.f.a
        public void fail(m6 m6Var) {
            this.f90819c.fail(m6Var);
        }
    }

    public b0(f fVar, f fVar2) {
        this.f90813a = (f) mh.p1.checkNotNull(fVar, "creds1");
        this.f90814b = (f) mh.p1.checkNotNull(fVar2, "creds2");
    }

    @Override // wr.f
    public void applyRequestMetadata(f.b bVar, Executor executor, f.a aVar) {
        this.f90813a.applyRequestMetadata(bVar, executor, new b(bVar, executor, aVar, u0.current()));
    }
}
