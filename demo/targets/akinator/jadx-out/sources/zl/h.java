package zl;

import android.app.Activity;
import android.content.Context;
import io.bidmachine.AdsFormat;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98234c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f98235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f98236f;

    public /* synthetic */ h(Object obj, int i10, Object obj2, Object obj3) {
        this.f98233b = i10;
        this.f98234c = obj;
        this.f98235e = obj2;
        this.f98236f = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98233b) {
            case 0:
                i iVar = (i) this.f98234c;
                k kVar = (k) this.f98235e;
                AdsFormat adsFormat = (AdsFormat) this.f98236f;
                int i10 = i.f98237d;
                iVar.getClass();
                kVar.run();
                String str = kVar.f98242b;
                synchronized (iVar.f98240c) {
                    try {
                        Map map = (Map) iVar.f98239b.get(adsFormat);
                        if (map != null) {
                            map.remove(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                t tVar = (t) this.f98234c;
                Context context = (Context) this.f98235e;
                j jVar = (j) this.f98236f;
                try {
                    tVar.f98282f = 2;
                    tVar.loadAd(context, jVar);
                    return;
                } catch (Throwable th3) {
                    nm.a.w(th3);
                    jVar.onAdLoadFailed(tVar, pr.a.throwable("Exception loading InternalGAM object", th3));
                    return;
                }
            default:
                y yVar = (y) this.f98234c;
                Activity activity = (Activity) this.f98235e;
                z zVar = (z) this.f98236f;
                try {
                    yVar.f98282f = 4;
                    yVar.c(activity, zVar);
                    return;
                } catch (Throwable th4) {
                    nm.a.w(th4);
                    ((c) zVar).onAdShowFailed(pr.a.throwable("Exception showing InternalGAM object", th4));
                    return;
                }
        }
    }
}
