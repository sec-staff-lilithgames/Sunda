package wa;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class f implements a {

    /* renamed from: b, reason: collision with root package name */
    public final a f90493b;

    /* renamed from: c, reason: collision with root package name */
    public ab.a f90494c;

    public f(a aVar, ab.a aVar2) {
        this.f90493b = aVar;
        this.f90494c = aVar2;
        aVar.b(this);
        aVar.a(this);
    }

    @Override // wa.a
    public boolean a() {
        return this.f90493b.a();
    }

    @Override // wa.a
    public void b() {
        this.f90493b.b();
    }

    @Override // wa.a
    public boolean c() {
        return this.f90493b.c();
    }

    @Override // wa.a
    public String d() {
        return null;
    }

    @Override // wa.a
    public void destroy() {
        this.f90494c = null;
        this.f90493b.destroy();
    }

    @Override // wa.a
    public final String e() {
        return this.f90493b.e();
    }

    @Override // wa.a
    public boolean f() {
        return this.f90493b.f();
    }

    @Override // wa.a
    public Context g() {
        return this.f90493b.g();
    }

    @Override // wa.a
    public boolean h() {
        return this.f90493b.h();
    }

    @Override // wa.a
    public String i() {
        return null;
    }

    @Override // wa.a
    public boolean j() {
        return false;
    }

    @Override // wa.a
    public IIgniteServiceAPI k() {
        return this.f90493b.k();
    }

    @Override // wa.a
    public void l() {
        this.f90493b.l();
    }

    @Override // wa.a, ab.b
    public void onCredentialsRequestFailed(String str) {
        this.f90493b.onCredentialsRequestFailed(str);
    }

    @Override // wa.a, ab.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f90493b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f90493b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f90493b.onServiceDisconnected(componentName);
    }

    @Override // wa.a
    public void a(String str) {
        ab.a aVar = this.f90494c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // wa.a
    public void b(String str) {
        ab.a aVar = this.f90494c;
        if (aVar != null) {
            aVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // wa.a
    public void c(String str) {
        ab.a aVar = this.f90494c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // wa.a
    public void a(ComponentName componentName, IBinder iBinder) {
        ab.a aVar = this.f90494c;
        if (aVar != null) {
            aVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // wa.a
    public final void b(a aVar) {
        this.f90493b.b(aVar);
    }

    @Override // wa.a
    public final void a(a aVar) {
        this.f90493b.a(aVar);
    }
}
