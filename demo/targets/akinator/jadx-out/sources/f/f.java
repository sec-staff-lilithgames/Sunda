package f;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.x2;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f55223c;

    public /* synthetic */ f(ComponentActivity componentActivity, int i10) {
        this.f55222b = i10;
        this.f55223c = componentActivity;
    }

    @Override // kv.a
    public final Object invoke() {
        int i10 = this.f55222b;
        ComponentActivity componentActivity = this.f55223c;
        switch (i10) {
            case 0:
                int i11 = ComponentActivity.f4643b;
                componentActivity.reportFullyDrawn();
                return x0.f87415a;
            case 1:
                return ComponentActivity.d(componentActivity);
            case 2:
                int i12 = ComponentActivity.f4643b;
                return new x2(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i13 = ComponentActivity.f4643b;
                d0 d0Var = new d0(new e(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.e0.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.getLifecycle().addObserver(new androidx.lifecycle.l0(2, d0Var, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new com.ironsource.environment.thread.a(27, componentActivity, d0Var));
                    }
                }
                return d0Var;
        }
    }
}
