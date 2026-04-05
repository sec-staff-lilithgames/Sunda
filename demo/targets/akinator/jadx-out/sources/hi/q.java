package hi;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q implements SuccessContinuation {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Boolean> then(Void r12) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
