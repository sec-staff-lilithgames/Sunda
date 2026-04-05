package hi;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f58865b;

    public r(s sVar) {
        this.f58865b = sVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(pi.d dVar) throws Exception {
        if (dVar == null) {
            ei.f.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
            return Tasks.forResult(null);
        }
        s sVar = this.f58865b;
        u.a(sVar.f58869c);
        u uVar = sVar.f58869c;
        uVar.f58893m.sendReports(uVar.f58885e.f59614a);
        sVar.f58869c.f58898r.trySetResult(null);
        return Tasks.forResult(null);
    }
}
