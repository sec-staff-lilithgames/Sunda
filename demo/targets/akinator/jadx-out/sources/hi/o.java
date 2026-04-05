package hi;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f58857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f58858c;

    public o(p pVar, String str) {
        this.f58858c = pVar;
        this.f58857b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(pi.d dVar) throws Exception {
        p pVar = this.f58858c;
        u uVar = pVar.f58864h;
        if (dVar != null) {
            return Tasks.whenAll((Task<?>[]) new Task[]{u.a(uVar), uVar.f58893m.sendReports(uVar.f58885e.f59614a, pVar.f58863g ? this.f58857b : null)});
        }
        ei.f.getLogger().w("Received null app settings, cannot send reports at crash time.");
        return Tasks.forResult(null);
    }
}
