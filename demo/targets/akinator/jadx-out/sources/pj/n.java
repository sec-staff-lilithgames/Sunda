package pj;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Application f81455a;

    public n(Application application) {
        this.f81455a = application;
    }

    public nj.k developerListenerManager(Executor executor) {
        return new nj.k(executor);
    }

    public Application providesApplication() {
        return this.f81455a;
    }
}
