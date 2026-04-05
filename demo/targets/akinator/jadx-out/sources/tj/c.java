package tj;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f86926c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f86927e;

    public /* synthetic */ c(e eVar, boolean z10, int i10) {
        this.f86925b = i10;
        this.f86926c = eVar;
        this.f86927e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vj.f fVarF;
        switch (this.f86925b) {
            case 0:
                this.f86926c.a(this.f86927e);
                return;
            default:
                e eVar = this.f86926c;
                boolean z10 = this.f86927e;
                vj.f fVarC = eVar.c();
                try {
                    if (fVarC.isErrored() || fVarC.isUnregistered()) {
                        fVarF = eVar.f(fVarC);
                    } else {
                        if (!z10 && !eVar.f86933d.isAuthTokenExpired(fVarC)) {
                            return;
                        }
                        fVarF = eVar.b(fVarC);
                    }
                    eVar.d(fVarF);
                    synchronized (eVar) {
                        try {
                            if (eVar.f86940k.size() != 0 && !TextUtils.equals(fVarC.getFirebaseInstallationId(), fVarF.getFirebaseInstallationId())) {
                                Iterator it = eVar.f86940k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    fVarF.getFirebaseInstallationId();
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (fVarF.isRegistered()) {
                        String firebaseInstallationId = fVarF.getFirebaseInstallationId();
                        synchronized (eVar) {
                            eVar.f86939j = firebaseInstallationId;
                        }
                    }
                    if (fVarF.isErrored()) {
                        eVar.g(new h(g.f86942b));
                        return;
                    } else if (fVarF.isNotGenerated()) {
                        eVar.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        eVar.h(fVarF);
                        return;
                    }
                } catch (h e10) {
                    eVar.g(e10);
                    return;
                }
        }
    }
}
