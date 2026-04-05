package ik;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h implements ik.a {

    /* renamed from: a, reason: collision with root package name */
    public final ek.b f59688a;

    /* renamed from: b, reason: collision with root package name */
    public final zu.m f59689b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public h(ek.b appInfo, @ai.b zu.m blockingDispatcher) {
        e0.checkNotNullParameter(appInfo, "appInfo");
        e0.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.f59688a = appInfo;
        this.f59689b = blockingDispatcher;
    }

    public static final URL access$settingsUrl(h hVar) {
        hVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ek.b bVar = hVar.f59688a;
        return new URL(builderAppendPath.appendPath(bVar.getAppId()).appendPath("settings").appendQueryParameter("build_version", bVar.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", bVar.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // ik.a
    public Object doConfigFetch(Map<String, String> map, kv.p pVar, kv.p pVar2, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f59689b, new i(this, map, pVar, pVar2, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
