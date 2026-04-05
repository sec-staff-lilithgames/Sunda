package fq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cr.t;
import dq.d0;
import eq.c;
import kotlin.jvm.internal.e0;
import vq.b;
import yq.d;
import yq.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends eq.a {

    /* renamed from: s, reason: collision with root package name */
    public final e f55990s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: fq.a$a, reason: collision with other inner class name */
    public final class C0567a implements d {
        public C0567a() {
        }

        @Override // yq.d
        public void a() {
            a.this.o().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, b repository, br.a adElementParams, c adFormListener, tq.b eventCallback, rq.a aVar) {
        super(context, repository, adElementParams, adFormListener, eventCallback, aVar);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        e eVar = new e(context);
        eVar.setListener(new C0567a());
        this.f55990s = eVar;
    }

    @Override // eq.a, dq.h
    public /* bridge */ /* synthetic */ void a(ViewGroup viewGroup) {
        super.a(viewGroup);
    }

    @Override // eq.a, dq.h
    public void c() {
        this.f54991g.b(this);
    }

    @Override // eq.a, dq.h
    public void d() {
        this.f55990s.e();
        super.d();
    }

    @Override // eq.a, dq.h
    public void f() {
        super.f();
        this.f55990s.g();
    }

    @Override // eq.a
    public final void r() {
        this.f55990s.b();
    }

    @Override // eq.a
    public View v() {
        return this.f55990s;
    }

    @Override // dq.p0, dq.m0
    public void a(String str) {
        Integer intOrNull = t.toIntOrNull(str);
        if (intOrNull == null) {
            d0.a("Can't obtain time to start", new Object[0]);
            return;
        }
        long jIntValue = intOrNull.intValue();
        e eVar = this.f55990s;
        eVar.setDuration(jIntValue);
        eVar.f();
    }
}
