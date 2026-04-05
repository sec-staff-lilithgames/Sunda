package androidx.browser.customtabs;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5235c;

    public /* synthetic */ i(Object obj, int i10) {
        this.f5234b = i10;
        this.f5235c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5234b) {
            case 0:
                ((Handler) this.f5235c).post(runnable);
                break;
            default:
                ((io.bidmachine.media3.common.util.v) this.f5235c).post(runnable);
                break;
        }
    }
}
