package a1;

import androidx.lifecycle.n3;
import androidx.lifecycle.t2;
import b1.l0;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c;
import ek.b2;
import ek.c2;
import fw.q;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import o5.y0;
import o6.d0;
import tu.x0;
import uu.q0;
import xv.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3396c;

    public /* synthetic */ e(Object obj, int i10) {
        this.f3395b = i10;
        this.f3396c = obj;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f3395b) {
            case 0:
                f fVar = (f) this.f3396c;
                m mVar = fVar.f3397b;
                Object obj = fVar.f3400f;
                if (obj != null) {
                    return ((p) mVar).save(fVar, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 1:
                ((androidx.lifecycle.m) this.f3396c).f6661m = null;
                return x0.f87415a;
            case 2:
                return t2.getSavedStateHandlesVM((n3) this.f3396c);
            case 3:
                l0 l0Var = (l0) this.f3396c;
                do {
                    synchronized (l0Var.f8634g) {
                        try {
                            if (!l0Var.f8630c) {
                                l0Var.f8630c = true;
                                try {
                                    r0.c cVar = l0Var.f8633f;
                                    Object[] objArr = cVar.f83647b;
                                    int size = cVar.getSize();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((l0.a) objArr[i10]).notifyInvalidatedScopes();
                                    }
                                    l0Var.f8630c = false;
                                } finally {
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } while (l0Var.a());
                return x0.f87415a;
            case 4:
                return MolocoLogger.a.a((MolocoLogger.a) this.f3396c);
            case 5:
                return Boolean.valueOf(com.moloco.sdk.internal.f.a((com.moloco.sdk.internal.f) this.f3396c));
            case 6:
                return com.moloco.sdk.internal.ilrd.a.a((String) this.f3396c);
            case 7:
                return com.moloco.sdk.internal.publisher.nativead.d.a((com.moloco.sdk.internal.ortb.model.c) this.f3396c);
            case 8:
                return com.moloco.sdk.internal.publisher.nativead.d.a((com.moloco.sdk.internal.publisher.nativead.d) this.f3396c);
            case 9:
                return com.moloco.sdk.internal.publisher.nativead.model.c.a((com.moloco.sdk.internal.publisher.nativead.model.c) this.f3396c);
            case 10:
                return Boolean.valueOf(t.a((t) this.f3396c));
            case 11:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a.f((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a) this.f3396c);
            case 12:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d) this.f3396c);
            case 13:
                return c.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.f3396c);
            case 14:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0) this.f3396c);
            case 15:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a) this.f3396c);
            case 16:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d) this.f3396c);
            case 17:
                return m0.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k) this.f3396c);
            case 18:
                return c.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c) this.f3396c);
            case 19:
                return r0.d((r0) this.f3396c);
            case 20:
                return com.moloco.sdk.xenoss.sdkdevkit.android.core.d.a((com.moloco.sdk.xenoss.sdkdevkit.android.core.d) this.f3396c);
            case 21:
                e0 e0Var = (e0) this.f3396c;
                int i11 = cw.d.f51115y;
                List<Certificate> listPeerCertificates = e0Var.peerCertificates();
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listPeerCertificates, 10));
                for (Certificate certificate : listPeerCertificates) {
                    kotlin.jvm.internal.e0.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 22:
                String string = ((c2) ((b2) this.f3396c)).next().toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            case 23:
                fw.q qVar = (fw.q) this.f3396c;
                q.b bVar = fw.q.F;
                qVar.writePing(false, 2, 0);
                return x0.f87415a;
            case 24:
                return ApsInterstitialActivity.imageView_delegate$lambda$2((ApsInterstitialActivity) this.f3396c);
            case 25:
                return Integer.valueOf(SerialDescriptorImpl._hashCode_delegate$lambda$1((SerialDescriptorImpl) this.f3396c));
            case 26:
                Runnable runnable = (Runnable) this.f3396c;
                y0.c cVar2 = y0.Companion;
                runnable.run();
                return x0.f87415a;
            case 27:
                Callable callable = (Callable) this.f3396c;
                y0.c cVar3 = y0.Companion;
                return callable.call();
            case 28:
                o5.c2 c2Var = (o5.c2) this.f3396c;
                return c2Var.f77520a.compileStatement(c2Var.createQuery());
            default:
                d0 d0Var = (d0) this.f3396c;
                String str = d0.f77875j;
                d0Var.getClass();
                w6.f.enqueue(d0Var);
                return x0.f87415a;
        }
    }
}
