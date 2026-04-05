package wa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: g, reason: collision with root package name */
    public Context f90480g;

    /* renamed from: h, reason: collision with root package name */
    public String f90481h;

    /* renamed from: i, reason: collision with root package name */
    public String f90482i;

    /* renamed from: j, reason: collision with root package name */
    public final String f90483j;

    /* renamed from: k, reason: collision with root package name */
    public xa.a f90484k;

    /* renamed from: l, reason: collision with root package name */
    public IIgniteServiceAPI f90485l;

    /* renamed from: p, reason: collision with root package name */
    public a f90489p;

    /* renamed from: q, reason: collision with root package name */
    public a f90490q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f90476b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f90477c = false;

    /* renamed from: e, reason: collision with root package name */
    public long f90478e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90479f = false;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f90486m = new Bundle();

    /* renamed from: n, reason: collision with root package name */
    public final Object f90487n = new Object();

    /* renamed from: r, reason: collision with root package name */
    public String f90491r = null;

    /* renamed from: s, reason: collision with root package name */
    public final b f90492s = new b(this);

    /* renamed from: o, reason: collision with root package name */
    public final va.a f90488o = new va.a(this);

    public e(Context context) {
        String str = null;
        this.f90480g = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f90480g;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f90483j = str;
        this.f90484k = new xa.a(false, "");
    }

    @Override // wa.a
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f90479f && (iIgniteServiceAPI = this.f90485l) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // wa.a
    public final void b() {
        if (TextUtils.isEmpty(this.f90483j)) {
            cb.b.b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            eb.c.f53999a.execute(this.f90492s);
        } else {
            if (!this.f90476b || f()) {
                m();
                return;
            }
            Object[] objArr = {"IgniteAuthenticationComponent"};
            cb.a aVar = cb.b.f12046b.f12047a;
            if (aVar != null) {
                aVar.i("%s : already authenticated", objArr);
            }
        }
    }

    @Override // wa.a
    public final void c(String str) {
        String str2;
        cb.b.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f90477c = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f90491r = str;
        this.f90486m.putString("clientToken", str);
        this.f90476b = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), C.UTF8_NAME);
            } catch (Exception e10) {
                cb.b.b("%s : decodeJwtBody : %s", "JwtUtil", e10.toString());
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong("exp");
                this.f90478e = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                cb.b.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e11) {
                ya.b.a(ya.d.ONE_DT_GENERAL_ERROR, e11);
                cb.b.b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e11.toString());
            }
        }
        a aVar = this.f90489p;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // wa.a
    public final String d() {
        return this.f90483j;
    }

    @Override // wa.a
    public final void destroy() {
        if (this.f90480g != null && a()) {
            this.f90480g.unbindService(this);
            this.f90480g = null;
        }
        this.f90490q = null;
        this.f90489p = null;
        this.f90485l = null;
    }

    @Override // wa.a
    public final String e() {
        return this.f90491r;
    }

    @Override // wa.a
    public final boolean f() {
        return this.f90478e > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f90478e;
    }

    @Override // wa.a
    public final Context g() {
        return this.f90480g;
    }

    @Override // wa.a
    public final boolean h() {
        return this.f90476b;
    }

    @Override // wa.a
    public final String i() {
        return this.f90484k.f91890a;
    }

    @Override // wa.a
    public final boolean j() {
        return this.f90484k.f91891b;
    }

    @Override // wa.a
    public final IIgniteServiceAPI k() {
        return this.f90485l;
    }

    @Override // wa.a
    public final void l() {
        b();
    }

    public final void m() {
        Bundle bundle = this.f90486m;
        if (a()) {
            String str = this.f90481h;
            String str2 = this.f90482i;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f90477c) {
                return;
            }
            if ((f() || !this.f90476b) && this.f90485l != null) {
                try {
                    this.f90477c = true;
                    bundle.putInt("sdkFlowTypeKey", 1);
                    this.f90485l.authenticate(this.f90481h, this.f90482i, bundle, this.f90488o);
                } catch (RemoteException e10) {
                    this.f90477c = false;
                    ya.b.a(ya.d.ONE_DT_AUTHENTICATION_ERROR, e10);
                    cb.b.b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e10.toString());
                }
            }
        }
    }

    @Override // wa.a, ab.b
    public final void onCredentialsRequestFailed(String str) {
        cb.b.b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // wa.a, ab.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f90481h = str;
        this.f90482i = str2;
        m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cb.b.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f90485l = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f90479f = true;
        eb.c.f53999a.execute(new c(this, new d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f90479f = false;
        this.f90478e = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // wa.a
    public final void a(String str) {
        cb.b.b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f90477c = false;
        a aVar = this.f90489p;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // wa.a
    public final void a(ComponentName componentName, IBinder iBinder) {
        a aVar = this.f90490q;
        if (aVar != null) {
            aVar.a(componentName, iBinder);
        }
    }

    @Override // wa.a
    public final void a(a aVar) {
        this.f90489p = aVar;
    }

    @Override // wa.a
    public final void b(String str) {
        cb.b.b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        a aVar = this.f90490q;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // wa.a
    public final void b(a aVar) {
        this.f90490q = aVar;
    }

    @Override // wa.a
    public final boolean c() {
        return f() || !a();
    }
}
