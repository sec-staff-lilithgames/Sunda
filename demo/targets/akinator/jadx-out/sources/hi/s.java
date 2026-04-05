package hi;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f58868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f58869c;

    public s(u uVar, Task task) {
        this.f58869c = uVar;
        this.f58868b = task;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(Boolean bool) throws Exception {
        boolean zBooleanValue = bool.booleanValue();
        u uVar = this.f58869c;
        if (zBooleanValue) {
            ei.f.getLogger().d("Sending cached crash reports...");
            uVar.f58882b.grantDataCollectionPermission(bool.booleanValue());
            return this.f58868b.onSuccessTask(uVar.f58885e.f59614a, new r(this));
        }
        ei.f.getLogger().v("Deleting cached crash reports...");
        Iterator<File> it = uVar.f58887g.getCommonFiles(u.f58879t).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        uVar.f58893m.removeAllReports();
        uVar.f58898r.trySetResult(null);
        return Tasks.forResult(null);
    }
}
