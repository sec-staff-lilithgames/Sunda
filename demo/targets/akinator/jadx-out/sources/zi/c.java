package zi;

import android.content.Context;
import bi.b0;
import bi.l;
import bi.q;
import bi.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.u;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements f, h {

    /* renamed from: a, reason: collision with root package name */
    public final v f97983a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f97984b;

    /* renamed from: c, reason: collision with root package name */
    public final sj.c f97985c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f97986d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f97987e;

    public c(Context context, String str, Set set, sj.c cVar, Executor executor) {
        this.f97983a = new v(new l(2, context, str));
        this.f97986d = set;
        this.f97987e = executor;
        this.f97985c = cVar;
        this.f97984b = context;
    }

    public static bi.c component() {
        b0 b0VarQualified = b0.qualified(ai.a.class, Executor.class);
        return bi.c.builder(c.class, f.class, h.class).add(q.required((Class<?>) Context.class)).add(q.required((Class<?>) com.google.firebase.g.class)).add(q.setOf((Class<?>) d.class)).add(q.requiredProvider((Class<?>) bk.j.class)).add(q.required(b0VarQualified)).factory(new u(b0VarQualified, 1)).build();
    }

    @Override // zi.h
    public synchronized g getHeartBeatCode(String str) {
        boolean zE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        j jVar = (j) this.f97983a.get();
        synchronized (jVar) {
            zE = jVar.e(j.f97995b, jCurrentTimeMillis);
        }
        if (!zE) {
            return g.NONE;
        }
        synchronized (jVar) {
            jVar.f97998a.editSync(new i(0, jVar, jVar.b(System.currentTimeMillis())));
        }
        return g.GLOBAL;
    }

    @Override // zi.f
    public Task<String> getHeartBeatsHeader() {
        if (!t3.v.isUserUnlocked(this.f97984b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f97987e, new b(this, 0));
    }

    public Task<Void> registerHeartBeat() {
        if (this.f97986d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!t3.v.isUserUnlocked(this.f97984b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f97987e, new b(this, 1));
    }
}
