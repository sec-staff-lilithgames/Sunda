package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.core.app.NotificationCompat;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.http.ContentType;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.p;
import org.json.JSONException;
import org.json.JSONObject;
import tu.a0;
import tu.x0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f48429a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f48430b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48432j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48432j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return e.this.new a(this.f48432j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            e.this.f48429a.a(this.f48432j);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48433i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e f48434j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48435k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ContentType f48436l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, e eVar, String str2, ContentType contentType, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48433i = str;
            this.f48434j = eVar;
            this.f48435k = str2;
            this.f48436l = contentType;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f48433i, this.f48434j, this.f48435k, this.f48436l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            byte[] bytes = this.f48433i.getBytes(sv.g.f86134b);
            e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a(this.f48434j.f48429a, this.f48435k, bytes, this.f48436l, null, 8, null);
            return x0.f87415a;
        }
    }

    public e(k persistentHttpRequest) {
        e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f48429a = persistentHttpRequest;
        this.f48430b = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getIo());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "HttpEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set<String> a() {
        return c2.setOf((Object[]) new String[]{"sendGet", "sendPost"});
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws BadContentTypeFormatException, JSONException {
        e0.checkNotNullParameter(event, "event");
        String string = event.getString(NotificationCompat.CATEGORY_EVENT);
        if (e0.areEqual(string, "sendGet")) {
            String string2 = event.getString("url");
            e0.checkNotNull(string2);
            a(string2);
        } else {
            if (e0.areEqual(string, "sendPost")) {
                String string3 = event.getString("url");
                String string4 = event.getString("body");
                ContentType.Companion companion = ContentType.Companion;
                String strOptString = event.optString("contentType", companion.getAny().toString());
                e0.checkNotNullExpressionValue(strOptString, "optString(...)");
                ContentType contentType = companion.parse(strOptString);
                e0.checkNotNull(string3);
                e0.checkNotNull(string4);
                a(string3, string4, contentType);
                return;
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, b(), a.b.k("Unsupported event type: ", string), null, false, 12, null);
        }
    }

    public final Job a(String str) {
        return BuildersKt__Builders_commonKt.launch$default(this.f48430b, null, null, new a(str, null), 3, null);
    }

    public final Job a(String str, String str2, ContentType contentType) {
        return BuildersKt__Builders_commonKt.launch$default(this.f48430b, null, null, new b(str2, this, str, contentType, null), 3, null);
    }
}
