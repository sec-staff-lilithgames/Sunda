package wa;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends f {

    /* renamed from: e, reason: collision with root package name */
    public ua.d f90495e;

    /* renamed from: f, reason: collision with root package name */
    public ua.a f90496f;

    /* renamed from: g, reason: collision with root package name */
    public final ib.a f90497g;

    /* renamed from: h, reason: collision with root package name */
    public final db.b f90498h;

    /* renamed from: i, reason: collision with root package name */
    public ua.c f90499i;

    /* renamed from: j, reason: collision with root package name */
    public za.a f90500j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f90501k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f90502l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f90503m;

    public h(a aVar, boolean z10, boolean z11, ab.a aVar2, ua.a aVar3) {
        super(aVar, aVar2);
        this.f90501k = false;
        this.f90502l = false;
        this.f90503m = new AtomicBoolean(false);
        this.f90496f = aVar3;
        this.f90501k = z10;
        this.f90498h = new db.b();
        this.f90497g = new ib.a(aVar.g());
        this.f90502l = z11;
        if (z11) {
            this.f90495e = new ua.d(aVar.g(), this, this);
        }
    }

    @Override // wa.f, wa.a
    public final void a(ComponentName componentName, IBinder iBinder) {
        ab.a aVar;
        a aVar2 = this.f90493b;
        boolean zJ = aVar2.j();
        if (!zJ && (aVar = this.f90494c) != null) {
            aVar.onOdtUnsupported();
        }
        if (this.f90495e != null && aVar2.j() && this.f90502l) {
            this.f90495e.a();
        }
        if (zJ || this.f90501k) {
            super.a(componentName, iBinder);
        }
    }

    @Override // wa.f, wa.a
    public final void b() throws JSONException {
        ua.c cVar = this.f90499i;
        AtomicBoolean atomicBoolean = this.f90503m;
        if (cVar == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            cb.a aVar = cb.b.f12046b.f12047a;
            if (aVar != null) {
                aVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            ib.a aVar2 = this.f90497g;
            aVar2.getClass();
            try {
                aVar2.f59446b.a();
            } catch (IOException e10) {
                e = e10;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e12) {
                e = e12;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e13) {
                e = e13;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e14) {
                e = e14;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e15) {
                e = e15;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e16) {
                e = e16;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e17) {
                e = e17;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e18) {
                e = e18;
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e19) {
                ya.b.a(ya.d.ENCRYPTION_EXCEPTION, fb.a.a(e19, ya.c.FAILED_INIT_ENCRYPTION));
            }
            String strA = aVar2.a();
            this.f90498h.getClass();
            ua.c cVarA = db.b.a(strA);
            this.f90499i = cVarA;
            if (cVarA.f88179b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                cb.b.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                ua.c cVar2 = this.f90499i;
                ua.a aVar3 = this.f90496f;
                if (aVar3 != null) {
                    cb.b.a("%s : setting one dt entity", "IgniteManager");
                    aVar3.f88176b = cVar2;
                }
            } else {
                atomicBoolean.set(true);
            }
        }
        boolean z10 = this.f90502l;
        if (z10 && this.f90495e == null) {
            cb.b.b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f90501k && !atomicBoolean.get()) {
            if (z10) {
                this.f90495e.a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            cb.a aVar4 = cb.b.f12046b.f12047a;
            if (aVar4 != null) {
                aVar4.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f90493b.b();
        }
    }

    @Override // wa.f, wa.a
    public final void c(String str) {
        super.c(str);
        a aVar = this.f90493b;
        if (aVar.h()) {
            AtomicBoolean atomicBoolean = this.f90503m;
            if (atomicBoolean.get() && aVar.j()) {
                atomicBoolean.set(false);
                m();
            }
        }
    }

    @Override // wa.f, wa.a
    public final String d() {
        a aVar = this.f90493b;
        if (aVar instanceof f) {
            return aVar.d();
        }
        return null;
    }

    @Override // wa.f, wa.a
    public final void destroy() {
        this.f90496f = null;
        ua.d dVar = this.f90495e;
        if (dVar != null) {
            com.digitalturbine.ignite.authenticator.receiver.a aVar = dVar.f88180a;
            if (aVar != null && aVar.f21828b) {
                dVar.f88181b.unregisterReceiver(aVar);
                dVar.f88180a.f21828b = false;
            }
            com.digitalturbine.ignite.authenticator.receiver.a aVar2 = dVar.f88180a;
            if (aVar2 != null) {
                aVar2.f21827a = null;
                dVar.f88180a = null;
            }
            dVar.f88182c = null;
            dVar.f88181b = null;
            dVar.f88183d = null;
            this.f90495e = null;
        }
        za.a aVar3 = this.f90500j;
        if (aVar3 != null) {
            va.b bVar = aVar3.f97734b;
            if (bVar != null) {
                bVar.f89200c.clear();
                aVar3.f97734b = null;
            }
            aVar3.f97735c = null;
            aVar3.f97733a = null;
            this.f90500j = null;
        }
        this.f90494c = null;
        this.f90493b.destroy();
    }

    @Override // wa.f, wa.a
    public final String i() {
        a aVar = this.f90493b;
        if (aVar instanceof f) {
            return aVar.i();
        }
        return null;
    }

    @Override // wa.f, wa.a
    public final boolean j() {
        return this.f90493b.j();
    }

    @Override // wa.f, wa.a
    public final void l() throws JSONException {
        b();
    }

    public final void m() {
        a aVar = this.f90493b;
        IIgniteServiceAPI iIgniteServiceAPIK = aVar.k();
        if (iIgniteServiceAPIK == null) {
            cb.b.b("%s : service is unavailable", "OneDTAuthenticator");
            ya.b.a(ya.d.ONE_DT_REQUEST_ERROR, "error_code", ya.c.IGNITE_SERVICE_UNAVAILABLE.a());
            return;
        }
        if (this.f90500j == null) {
            this.f90500j = new za.a(iIgniteServiceAPIK, this);
        }
        if (TextUtils.isEmpty(aVar.e())) {
            ya.b.a(ya.d.ONE_DT_REQUEST_ERROR, "error_code", ya.c.IGNITE_SERVICE_INVALID_SESSION.a());
            cb.b.b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        za.a aVar2 = this.f90500j;
        String strE = aVar.e();
        aVar2.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            aVar2.f97735c.getProperty("onedtid", bundle, new Bundle(), aVar2.f97734b);
        } catch (RemoteException e10) {
            ya.b.a(ya.d.ONE_DT_REQUEST_ERROR, e10);
            cb.b.b("%s : request failed : %s", "OneDTPropertyHandler", e10.toString());
        }
    }
}
