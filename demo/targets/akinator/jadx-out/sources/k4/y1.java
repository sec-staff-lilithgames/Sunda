package k4;

import k4.c2;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements DisposableHandle {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f70563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70564c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f70565e;

    public /* synthetic */ y1(int i10, Object obj, Object obj2) {
        this.f70563b = i10;
        this.f70564c = obj;
        this.f70565e = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.f70563b) {
            case 0:
                String str = (String) this.f70564c;
                kv.l observer = (kv.l) this.f70565e;
                kotlin.jvm.internal.e0.checkNotNullParameter(observer, "$observer");
                synchronized (c2.f70302d) {
                    c2.a aVar = c2.f70301c;
                    c2 c2Var = aVar.getFileObservers$datastore_core_release().get(str);
                    if (c2Var != null) {
                        c2Var.f70305b.remove(observer);
                        if (c2Var.f70305b.isEmpty()) {
                            aVar.getFileObservers$datastore_core_release().remove(str);
                            c2Var.stopWatching();
                        }
                    }
                }
                return;
            default:
                HandlerContext.invokeOnTimeout$lambda$3((HandlerContext) this.f70564c, (Runnable) this.f70565e);
                return;
        }
    }
}
