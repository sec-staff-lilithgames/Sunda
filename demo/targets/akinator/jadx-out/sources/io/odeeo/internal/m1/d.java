package io.odeeo.internal.m1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.odeeo.internal.m1.c;
import io.odeeo.internal.v1.m;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends io.odeeo.internal.n1.e {

    /* renamed from: j, reason: collision with root package name */
    public static final a f64727j = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.m1.a f64728f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference<Context> f64729g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64730h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f64731i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public final synchronized void a(Context context, io.odeeo.internal.m1.a aVar) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("io.sdk.settings.identifier", 0).edit();
            editorEdit.putBoolean("privacy.limit.ad.tracking", aVar.isDoNotTrack());
            editorEdit.putString("privacy.identifier.ifa", aVar.getAdvertiserIdentifier());
            editorEdit.putString("privacy.identifier.odeeo.sdk", aVar.getOdeeoSDKIdentifier());
            editorEdit.apply();
        }

        public final synchronized void clearStorage(Context context) {
            e0.checkNotNullParameter(context, "context");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("io.sdk.settings.identifier", 0).edit();
            editorEdit.remove("privacy.limit.ad.tracking");
            editorEdit.remove("privacy.identifier.ifa");
            editorEdit.remove("privacy.identifier.odeeo.sdk");
            editorEdit.remove("privacy.identifier.time");
            editorEdit.apply();
        }

        public final synchronized io.odeeo.internal.m1.a readIdFromStorage(Context appContext) {
            e0.checkNotNullParameter(appContext, "appContext");
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences("io.sdk.settings.identifier", 0);
                String string = sharedPreferences.getString("privacy.identifier.ifa", "");
                String string2 = sharedPreferences.getString("privacy.identifier.odeeo.sdk", "");
                boolean z10 = sharedPreferences.getBoolean("privacy.limit.ad.tracking", false);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    e0.checkNotNull(string);
                    e0.checkNotNull(string2);
                    return new io.odeeo.internal.m1.a(string, string2, z10);
                }
            } catch (ClassCastException unused) {
                io.odeeo.internal.b2.a.d("Cannot read identifier from shared preferences", new Object[0]);
            }
            return null;
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.odeeo.sdk.privacy.OdeeoSDKIdentifier$performRefreshAdvertisingInfo$2", f = "OdeeoSDKIdentifier.kt", i = {0, 0}, l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$withContext", "oldInfo"}, s = {"L$0", "L$1"})
    public static final class b extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f64732a;

        /* renamed from: b, reason: collision with root package name */
        public int f64733b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f64734c;

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f64734c = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            io.odeeo.internal.m1.a aVar;
            io.odeeo.internal.m1.a aVarA;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f64733b;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f64734c;
                io.odeeo.internal.m1.a aVar2 = d.this.f64728f;
                io.odeeo.internal.m1.c cVar = io.odeeo.internal.m1.c.f64722a;
                Context context = (Context) d.this.f64729g.get();
                this.f64734c = coroutineScope;
                this.f64732a = aVar2;
                this.f64733b = 1;
                Object objFetchAdvertisingInfoSync = cVar.fetchAdvertisingInfoSync(context, this);
                if (objFetchAdvertisingInfoSync == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar2;
                obj = objFetchAdvertisingInfoSync;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (io.odeeo.internal.m1.a) this.f64732a;
                coroutineScope = (CoroutineScope) this.f64734c;
                a0.throwOnFailure(obj);
            }
            c.a aVar3 = (c.a) obj;
            if (aVar3 == null || TextUtils.isEmpty(aVar3.getAdvertisingId())) {
                d dVar = d.this;
                aVarA = dVar.a((Context) dVar.f64729g.get());
            } else {
                aVarA = new io.odeeo.internal.m1.a(aVar3.getAdvertisingId(), aVar.getOdeeoSDKIdentifier(), aVar3.getLimitAdTracking());
            }
            if (aVarA != null) {
                d.this.a(aVarA.getAdvertiserIdentifier(), aVar.getOdeeoSDKIdentifier(), aVarA.isDoNotTrack());
            } else {
                d dVar2 = d.this;
                dVar2.setAdvertisingInfo(dVar2.f64728f);
            }
            d dVar3 = d.this;
            String simpleName = coroutineScope.getClass().getSimpleName();
            e0.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            dVar3.setState(new io.odeeo.internal.n1.f(simpleName, null, null, 6, null));
            d.this.f64730h = false;
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.odeeo.sdk.privacy.OdeeoSDKIdentifier$refreshAdvertisingInfo$1", f = "OdeeoSDKIdentifier.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f64736a;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new c(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f64736a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                d dVar = d.this;
                this.f64736a = 1;
                if (dVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public d(Context appContext) {
        e0.checkNotNullParameter(appContext, "appContext");
        m.f67284a.checkNotNull(appContext);
        WeakReference<Context> weakReference = new WeakReference<>(appContext);
        this.f64729g = weakReference;
        a aVar = f64727j;
        Context context = weakReference.get();
        e0.checkNotNull(context);
        e0.checkNotNullExpressionValue(context, "mAppContext.get()!!");
        io.odeeo.internal.m1.a idFromStorage = aVar.readIdFromStorage(context);
        this.f64728f = idFromStorage == null ? io.odeeo.internal.m1.a.f64689d.generateFreshAdvertisingId() : idFromStorage;
        a();
    }

    public final void a() {
        if (this.f64730h) {
            return;
        }
        this.f64730h = true;
        BuildersKt__Builders_commonKt.launch$default(io.odeeo.internal.n1.e.f65065c.getScope(), null, null, new c(null), 3, null);
    }

    public final io.odeeo.internal.m1.a getAdvertisingInfo() {
        io.odeeo.internal.m1.a aVar = this.f64728f;
        a();
        return aVar;
    }

    public final boolean isInitialized() {
        return this.f64731i;
    }

    public final void setAdvertisingInfo(io.odeeo.internal.m1.a newId) {
        e0.checkNotNullParameter(newId, "newId");
        this.f64728f = newId;
        a aVar = f64727j;
        Context context = this.f64729g.get();
        e0.checkNotNull(context);
        e0.checkNotNullExpressionValue(context, "mAppContext.get()!!");
        aVar.a(context, this.f64728f);
        this.f64731i = true;
    }

    public final void a(String str, String str2, boolean z10) {
        setAdvertisingInfo(new io.odeeo.internal.m1.a(str, str2, z10));
    }

    public final io.odeeo.internal.m1.a a(Context context) {
        e0.checkNotNull(context);
        ContentResolver contentResolver = context.getContentResolver();
        int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", -1);
        String advertisingId = Settings.Secure.getString(contentResolver, "advertising_id");
        if (i10 == -1 || TextUtils.isEmpty(advertisingId)) {
            return null;
        }
        boolean z10 = i10 != 0;
        io.odeeo.internal.m1.a aVar = this.f64728f;
        e0.checkNotNullExpressionValue(advertisingId, "advertisingId");
        return new io.odeeo.internal.m1.a(advertisingId, aVar.getOdeeoSDKIdentifier(), z10);
    }

    public final Object a(zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new b(null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
