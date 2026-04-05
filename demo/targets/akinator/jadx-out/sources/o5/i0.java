package o5;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import o5.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends y.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f77592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, String[] strArr) {
        super(strArr);
        this.f77592b = f0Var;
    }

    @Override // o5.y.b
    public boolean isRemote$room_runtime_release() {
        return true;
    }

    @Override // o5.y.b
    public void onInvalidated(Set<String> tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        f0 f0Var = this.f77592b;
        if (f0Var.f77551e.get()) {
            return;
        }
        try {
            v vVar = f0Var.f77553g;
            if (vVar != null) {
                vVar.broadcastInvalidation(f0Var.f77552f, (String[]) tables.toArray(new String[0]));
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot broadcast invalidation", e10);
        }
    }
}
