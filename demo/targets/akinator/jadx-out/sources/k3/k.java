package k3;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70204c;

    public k(Object obj, Object obj2) {
        this.f70203b = obj;
        this.f70204c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = m.f70219d;
            Object obj = this.f70204c;
            Object obj2 = this.f70203b;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                m.f70220e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
        }
    }
}
