package com.ironsource;

import com.ironsource.C3484uf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.cg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3167cg implements InterfaceC3254hd {

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f36187a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f36188b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36189c;

    /* renamed from: d, reason: collision with root package name */
    private final List<AbstractC3236gd> f36190d;

    /* renamed from: e, reason: collision with root package name */
    private final C3484uf f36191e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3167cg(C3350n0 adTools, Runnable task, long j10, List<? extends AbstractC3236gd> pauseTriggers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.e0.checkNotNullParameter(pauseTriggers, "pauseTriggers");
        this.f36187a = adTools;
        this.f36188b = task;
        this.f36189c = j10;
        this.f36190d = pauseTriggers;
        this.f36191e = new C3484uf(adTools.a(), new xh(this, 1), j10);
        for (AbstractC3236gd abstractC3236gd : pauseTriggers) {
            abstractC3236gd.a(this);
            if (abstractC3236gd.d()) {
                a(abstractC3236gd.b());
            }
        }
        if (a()) {
            C3484uf.a aVarA = this.f36191e.a();
            List<AbstractC3236gd> list = this.f36190d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AbstractC3236gd) obj).d()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long jC = ((AbstractC3236gd) next).c();
                do {
                    Object next2 = it.next();
                    long jC2 = ((AbstractC3236gd) next2).c();
                    if (jC > jC2) {
                        next = next2;
                        jC = jC2;
                    }
                } while (it.hasNext());
            }
            a(((AbstractC3236gd) next).b(), aVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3167cg this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    @Override // com.ironsource.InterfaceC3254hd
    public void a(AbstractC3236gd pauseableTrigger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.f36187a.d(new yh(this, pauseableTrigger, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3167cg this$0, AbstractC3236gd pauseableTrigger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.a(pauseableTrigger.b());
        if (!this$0.a() || this$0.f36191e.e()) {
            return;
        }
        this$0.a(pauseableTrigger.b(), this$0.f36191e.a());
    }

    @Override // com.ironsource.InterfaceC3254hd
    public void b(AbstractC3236gd pauseableTrigger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.f36187a.d(new yh(this, pauseableTrigger, 1));
    }

    public final void c() {
        this.f36187a.d(new xh(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3167cg this$0, AbstractC3236gd pauseableTrigger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.b(pauseableTrigger.b());
        if (this$0.a() || !this$0.f36191e.e()) {
            return;
        }
        this$0.b(pauseableTrigger.b(), this$0.f36191e.b());
    }

    private final void a(String str) {
        this.f36187a.e().h().d(str);
    }

    private final void a(String str, C3484uf.a aVar) {
        this.f36187a.e().h().a(str, this.f36189c, aVar.c(), aVar.d());
    }

    private final void b(String str) {
        this.f36187a.e().h().e(str);
    }

    private final void b(String str, C3484uf.a aVar) {
        this.f36187a.e().h().b(str, this.f36189c, aVar.c(), aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3167cg this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Iterator<AbstractC3236gd> it = this$0.f36190d.iterator();
        while (it.hasNext()) {
            it.next().a((InterfaceC3254hd) null);
        }
        this$0.f36191e.a();
    }

    private final void b() {
        c();
        this.f36188b.run();
    }

    private final boolean a() {
        List<AbstractC3236gd> list = this.f36190d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC3236gd) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ C3167cg(C3350n0 c3350n0, Runnable runnable, long j10, List list, int i10, kotlin.jvm.internal.u uVar) {
        this(c3350n0, runnable, j10, (i10 & 8) != 0 ? new ArrayList() : list);
    }
}
