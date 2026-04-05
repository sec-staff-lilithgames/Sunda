package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public AdSession f24013a;

    /* renamed from: b, reason: collision with root package name */
    public AdEvents f24014b;

    /* renamed from: c, reason: collision with root package name */
    public MediaEvents f24015c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24016d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24017e = false;

    /* renamed from: f, reason: collision with root package name */
    public t0 f24018f;

    public final void a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String strK = a.b.k("OpenMeasurementNativeVideoTracker - ", th2.getMessage());
        t0 t0Var = this.f24018f;
        z.a(simpleName, strK, t0Var != null ? t0Var.f23944a : null, t0Var != null ? t0Var.f23945b : null);
    }

    public final ArrayList a(List list) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.f24021a != null) {
                    if (!TextUtils.isEmpty(hVar.f24025e) && !TextUtils.isEmpty(hVar.f24024d)) {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.f24025e, hVar.f24021a, hVar.f24024d);
                    } else {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f24021a);
                    }
                    verificationScriptResource = verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th2) {
                a(th2);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
