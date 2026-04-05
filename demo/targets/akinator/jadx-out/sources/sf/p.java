package sf;

import android.content.Context;
import android.view.WindowManager;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f85700a;

    public p(WindowManager windowManager) {
        this.f85700a = windowManager;
    }

    public static o maybeBuildNewInstance(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new p(windowManager);
        }
        return null;
    }

    @Override // sf.o
    public void register(n nVar) {
        ((b3) nVar).onDefaultDisplayChanged(this.f85700a.getDefaultDisplay());
    }

    @Override // sf.o
    public void unregister() {
    }
}
