package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.work.b;
import com.moloco.sdk.internal.MolocoLogger;
import io.ktor.http.ContentType;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import n6.b0;
import n6.d0;
import n6.f;
import n6.f0;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    public final n f50307b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public l(n worker) {
        e0.checkNotNullParameter(worker, "worker");
        this.f50307b = worker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url) {
        androidx.work.b bVarA;
        e0.checkNotNullParameter(url, "url");
        if (f.a(url) && (bVarA = m.a(url)) != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", a.b.k("Enqueuing request to ", url), null, false, 12, null);
            this.f50307b.a((f0) ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) UrlGetRequestWorker.class).setConstraints(new f.a().setRequiredNetworkType(d0.f75706c).build())).setBackoffCriteria(n6.a.f75681c, 10000L, TimeUnit.MILLISECONDS)).setInputData(bVarA)).build());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url, byte[] body, ContentType contentType, String str) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(contentType, "contentType");
        if (f.a(url)) {
            try {
                v[] vVarArr = {tu.e0.to("url", url), tu.e0.to("body", body), tu.e0.to("contentType", contentType.toString()), tu.e0.to("contentEncoding", str)};
                b.a aVar = new b.a();
                for (int i10 = 0; i10 < 4; i10++) {
                    v vVar = vVarArr[i10];
                    aVar.put((String) vVar.getFirst(), vVar.getSecond());
                }
                androidx.work.b bVarBuild = aVar.build();
                e0.checkNotNullExpressionValue(bVarBuild, "dataBuilder.build()");
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", a.b.k("Enqueuing request to ", url), null, false, 12, null);
                this.f50307b.a((f0) ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) UrlPostRequestWorker.class).setConstraints(new f.a().setRequiredNetworkType(d0.f75706c).build())).setBackoffCriteria(n6.a.f75681c, 10000L, TimeUnit.MILLISECONDS)).setInputData(bVarBuild)).build());
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", a.b.k("Failed to enqueue persistent request for url: ", url), e10, false, 8, null);
            }
        }
    }

    public final /* synthetic */ <W extends b0> f0 a(androidx.work.b bVar) {
        e0.reifiedOperationMarker(4, "W");
        return (f0) ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) b0.class).setConstraints(new f.a().setRequiredNetworkType(d0.f75706c).build())).setBackoffCriteria(n6.a.f75681c, 10000L, TimeUnit.MILLISECONDS)).setInputData(bVar)).build();
    }
}
