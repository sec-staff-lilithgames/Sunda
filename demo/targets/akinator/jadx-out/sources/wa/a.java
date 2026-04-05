package wa;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface a extends ServiceConnection, ab.b {
    void a(ComponentName componentName, IBinder iBinder);

    void a(String str);

    void a(a aVar);

    boolean a();

    void b();

    void b(String str);

    void b(a aVar);

    void c(String str);

    boolean c();

    String d();

    void destroy();

    String e();

    boolean f();

    Context g();

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();

    void l();

    @Override // ab.b
    /* synthetic */ void onCredentialsRequestFailed(String str);

    @Override // ab.b
    /* synthetic */ void onCredentialsRequestSuccess(String str, String str2);
}
