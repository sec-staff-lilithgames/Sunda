package w6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g0 implements n6.p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f90409d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final x6.b f90410a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.a f90411b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.c0 f90412c;

    static {
        n6.c0.tagWithPrefix("WMFgUpdater");
    }

    public g0(WorkDatabase workDatabase, u6.a aVar, x6.b bVar) {
        this.f90411b = aVar;
        this.f90410a = bVar;
        this.f90412c = workDatabase.workSpecDao();
    }

    @Override // n6.p
    public n1 setForegroundAsync(Context context, UUID uuid, n6.o oVar) {
        return n6.w.executeAsync(this.f90410a.getSerialTaskExecutor(), "setForegroundAsync", new p0.y(1, this, uuid, oVar, context));
    }
}
