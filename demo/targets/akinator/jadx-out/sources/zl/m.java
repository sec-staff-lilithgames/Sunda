package zl;

import android.content.Context;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import j1.o2;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f98258a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f98259b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final am.b f98260c;

    /* renamed from: d, reason: collision with root package name */
    public final l f98261d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98262e;

    public m(Context context, am.b bVar, String str, HashMap map, String str2, long j10, boolean z10) {
        this.f98258a = new pr.n(o2.l(str, AndroidInitializeBoldSDK.MSG_NETWORK));
        this.f98260c = bVar;
        this.f98261d = new l(context, bVar, str, map, str2, j10);
        this.f98262e = z10;
    }

    public static void a(c cVar, t tVar, pr.a aVar) {
        if (tVar != null) {
            try {
                tVar.destroy();
            } catch (Throwable unused) {
            }
        }
        if (aVar == null) {
            aVar = pr.a.f81798p;
        }
        cVar.onAdLoadFailed(aVar);
    }

    public l getGAMLoader() {
        return this.f98261d;
    }

    public String getVersion() {
        try {
            vr.a version = this.f98260c.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isOverrideCallbacks() {
        return this.f98262e;
    }
}
