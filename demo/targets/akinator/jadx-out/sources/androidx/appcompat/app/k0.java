package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4764b;

    public /* synthetic */ k0(Object obj, int i10) {
        this.f4763a = i10;
        this.f4764b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = this.f4763a;
        Object obj = this.f4764b;
        switch (i10) {
            case 0:
                ((t0) obj).u();
                break;
            case 1:
                io.bidmachine.rendering.internal.a this$0 = (io.bidmachine.rendering.internal.a) obj;
                int i11 = io.bidmachine.rendering.internal.a.f61997b;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
                this$0.a();
                break;
            case 2:
                ((kv.a) obj).invoke();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ((sg.b) obj).handleBackInvoked();
                break;
            default:
                InMobiAdActivity.a((InMobiAdActivity) obj);
                break;
        }
    }
}
