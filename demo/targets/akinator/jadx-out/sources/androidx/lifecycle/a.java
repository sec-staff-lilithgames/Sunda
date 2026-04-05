package androidx.lifecycle;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a extends g3 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f6513a;

    public a(Application application) {
        kotlin.jvm.internal.e0.checkNotNullParameter(application, "application");
        this.f6513a = application;
    }

    public <T extends Application> T getApplication() {
        T t10 = (T) this.f6513a;
        kotlin.jvm.internal.e0.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
