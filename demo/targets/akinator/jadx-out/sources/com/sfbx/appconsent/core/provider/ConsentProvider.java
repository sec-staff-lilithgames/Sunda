package com.sfbx.appconsent.core.provider;

import ac.Models;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import av.e;
import be.nVUQ.UupKET;
import bv.f;
import bv.n;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.sfbx.appconsent.core.AppConsentError;
import com.sfbx.appconsent.core.IABConstants;
import com.sfbx.appconsent.core.SFBXConstants;
import com.sfbx.appconsent.core.dao.ReducerDao;
import com.sfbx.appconsent.core.dao.StateDao;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.reducer.MobileTcfStorage;
import com.sfbx.appconsent.core.model.reducer.State;
import com.sfbx.appconsent.core.model.reducer.StateKt;
import com.sfbx.appconsent.core.model.reducer.action.Action;
import com.sfbx.appconsent.core.model.reducer.action.AllowAll;
import com.sfbx.appconsent.core.model.reducer.action.DenyAll;
import com.sfbx.appconsent.core.model.reducer.action.Hello;
import com.sfbx.appconsent.core.model.reducer.action.ResetEvents;
import com.sfbx.appconsent.core.model.reducer.action.Save;
import com.sfbx.appconsent.core.model.reducer.action.SetConsentable;
import com.sfbx.appconsent.core.model.reducer.action.SetStack;
import com.sfbx.appconsent.core.model.reducer.action.SetVendor;
import com.sfbx.appconsent.core.model.reducer.action.Track;
import com.sfbx.appconsent.core.util.ExtensionKt;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import hr.kNq.ikJMrW;
import io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import j1.o2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kv.p;
import kv.q;
import sv.n0;
import tu.a0;
import tu.o;
import tu.x0;
import uu.o1;
import uu.p0;
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentProvider {
    private static final String JS_PROPERTY_STORE = "store";
    private static final String JS_PROPERTY_STORE_LIB = "storeLib";
    private static final String KEY_EXTERNAL_IDS = "appconsent_external_ids";
    private static final String KEY_FlOATING_PURPOSES = "appconsent_floating_purposes";
    private static final String KEY_FlOATING_TIMESTAMP = "appconsent_floating_timestamp";
    private static final String KEY_FlOATING_VERSION = "appconsent_floating_version";
    public static final String KEY_GEOLOCATION_EXPIRATION = "appconsent_geolocation_expiration";
    private static final String KEY_NEED_TO_UPDATE = "appconsent_need_to_update";
    public static final String KEY_NOTICE_EXPIRATION = "appconsent_notice_expiration";
    public static final String KEY_SYNC_NEEDED = "appconsent_sync_needed";
    private final Context context;
    private final GCMRepositoryContract gcmRepositoryContract;
    private Handler handler;
    private final Json json;
    private WebView mWebView;
    private final o reducer$delegate;
    private final ReducerDao reducerDao;

    /* renamed from: sp, reason: collision with root package name */
    private final SharedPreferences f50533sp;
    private final StateDao stateDao;
    private boolean storeCreated;
    private final TimeoutProvider timeoutProvider;
    public static final Companion Companion = new Companion(null);
    private static final String tag = "ConsentProvider";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements kv.a {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3450invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3450invoke() {
            ConsentProvider.this.tryToInstantiateWebViewComponent$appconsent_core_prodXchangeRelease();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getKEY_GEOLOCATION_EXPIRATION$appconsent_core_prodXchangeRelease$annotations() {
        }

        public static /* synthetic */ void getKEY_NOTICE_EXPIRATION$appconsent_core_prodXchangeRelease$annotations() {
        }

        public static /* synthetic */ void getKEY_SYNC_NEEDED$appconsent_core_prodXchangeRelease$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$createStore$1", f = "ConsentProvider.kt", i = {}, l = {IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$createStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36461 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36461(d<? super C36461> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36461 c36461 = ConsentProvider.this.new C36461(dVar);
            c36461.L$0 = obj;
            return c36461;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ConsentProvider.this.setStoreCreated(true);
                String strCreateJSValueToCreateStoreWithStateValue$appconsent_core_prodXchangeRelease = ConsentProvider.this.createJSValueToCreateStoreWithStateValue$appconsent_core_prodXchangeRelease(ConsentProvider.this.stateDao.getTemporaryState());
                this.label = 1;
                if (flowCollector.emit(strCreateJSValueToCreateStoreWithStateValue$appconsent_core_prodXchangeRelease, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((C36461) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$createStore$2", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$createStore$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = ConsentProvider.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return ConsentProvider.this.evaluateScript$appconsent_core_prodXchangeRelease((String) this.L$0);
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((AnonymousClass2) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$1", f = "ConsentProvider.kt", i = {}, l = {746}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36481 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36481(d<? super C36481> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36481 c36481 = new C36481(dVar);
            c36481.L$0 = obj;
            return c36481;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                this.label = 1;
                if (flowCollector.emit("", this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((C36481) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$2", f = "ConsentProvider.kt", i = {}, l = {749}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36492 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36492(d<? super C36492> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36492 c36492 = ConsentProvider.this.new C36492(dVar);
            c36492.L$0 = obj;
            return c36492;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String reducer = ConsentProvider.this.getReducer();
                this.label = 1;
                if (flowCollector.emit(reducer, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((C36492) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$3", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = ConsentProvider.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return ConsentProvider.this.setReducer((String) this.L$0);
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((AnonymousClass3) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$4", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$4, reason: invalid class name */
    public static final class AnonymousClass4 extends n implements p {
        int label;

        public AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return ConsentProvider.this.new AnonymousClass4(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return ConsentProvider.this.createStore();
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((AnonymousClass4) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$5", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$5, reason: invalid class name */
    public static final class AnonymousClass5 extends n implements p {
        final /* synthetic */ Action $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Action action, d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.$action = action;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return ConsentProvider.this.new AnonymousClass5(this.$action, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return ConsentProvider.this.fromActionToFlow(this.$action);
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((AnonymousClass5) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$6", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$6, reason: invalid class name */
    public static final class AnonymousClass6 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass6(d<? super AnonymousClass6> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass6 anonymousClass6 = ConsentProvider.this.new AnonymousClass6(dVar);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return ConsentProvider.this.dispatchActionResultToJSEngine$appconsent_core_prodXchangeRelease((String) this.L$0);
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((AnonymousClass6) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$7", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$7, reason: invalid class name */
    public static final class AnonymousClass7 extends n implements p {
        int label;

        public AnonymousClass7(d<? super AnonymousClass7> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return ConsentProvider.this.new AnonymousClass7(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return ConsentProvider.this.getStateFromWebView$appconsent_core_prodXchangeRelease();
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((AnonymousClass7) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$9", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$9, reason: invalid class name */
    public static final class AnonymousClass9 extends n implements q {
        final /* synthetic */ List<AppConsentNoticeListener> $listeners;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(List<? extends AppConsentNoticeListener> list, d<? super AnonymousClass9> dVar) {
            super(3, dVar);
            this.$listeners = list;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            Iterator<T> it = this.$listeners.iterator();
            while (it.hasNext()) {
                ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.ReducerError(null, 1, null));
            }
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super State> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$listeners, dVar);
            anonymousClass9.L$0 = th2;
            return anonymousClass9.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$1", f = "ConsentProvider.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36501 extends n implements p {
        final /* synthetic */ State $state;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConsentProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36501(State state, ConsentProvider consentProvider, d<? super C36501> dVar) {
            super(2, dVar);
            this.$state = state;
            this.this$0 = consentProvider;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36501 c36501 = new C36501(this.$state, this.this$0, dVar);
            c36501.L$0 = obj;
            return c36501;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String str = "storeLib.selectors.google_providers(" + StateKt.toJson(this.$state, this.this$0.json) + ')';
                this.label = 1;
                if (flowCollector.emit(str, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((C36501) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36512 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36512(d<? super C36512> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36512 c36512 = ConsentProvider.this.new C36512(dVar);
            c36512.L$0 = obj;
            return c36512;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            final Flow<String> flowEvaluateScript$appconsent_core_prodXchangeRelease = ConsentProvider.this.evaluateScript$appconsent_core_prodXchangeRelease((String) this.L$0);
            final ConsentProvider consentProvider = ConsentProvider.this;
            return new Flow<String>() { // from class: com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ConsentProvider this$0;

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1$2", f = "ConsentProvider.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends bv.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // bv.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ConsentProvider consentProvider) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = consentProvider;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            tu.a0.throwOnFailure(r6)
                            goto L4b
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            tu.a0.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            java.lang.String r5 = (java.lang.String) r5
                            com.sfbx.appconsent.core.provider.ConsentProvider r2 = r4.this$0
                            kotlinx.serialization.json.Json r2 = com.sfbx.appconsent.core.provider.ConsentProvider.access$getJson$p(r2)
                            java.lang.String r5 = com.sfbx.appconsent.core.util.ExtensionKt.serialized(r5, r2)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4b
                            return r1
                        L4b:
                            tu.x0 r5 = tu.x0.f87415a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.provider.ConsentProvider$getGoogleAdditionalConsent$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, d dVar) {
                    Object objCollect = flowEvaluateScript$appconsent_core_prodXchangeRelease.collect(new AnonymousClass2(flowCollector, consentProvider), dVar);
                    return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                }
            };
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((C36512) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$1", f = "ConsentProvider.kt", i = {}, l = {LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36521 extends n implements p {
        final /* synthetic */ String $consentString;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36521(String str, d<? super C36521> dVar) {
            super(2, dVar);
            this.$consentString = str;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36521 c36521 = new C36521(this.$consentString, dVar);
            c36521.L$0 = obj;
            return c36521;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String strO = o2.o(new StringBuilder("storeLib.mobileTcfStorage('"), this.$consentString, "')");
                this.label = 1;
                if (flowCollector.emit(strO, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((C36521) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36532 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36532(d<? super C36532> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36532 c36532 = ConsentProvider.this.new C36532(dVar);
            c36532.L$0 = obj;
            return c36532;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            final Flow<String> flowEvaluateScript$appconsent_core_prodXchangeRelease = ConsentProvider.this.evaluateScript$appconsent_core_prodXchangeRelease((String) this.L$0);
            final ConsentProvider consentProvider = ConsentProvider.this;
            return new Flow<MobileTcfStorage>() { // from class: com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ConsentProvider this$0;

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1$2", f = "ConsentProvider.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends bv.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // bv.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ConsentProvider consentProvider) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = consentProvider;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            tu.a0.throwOnFailure(r7)
                            goto L51
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            tu.a0.throwOnFailure(r7)
                            kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                            java.lang.String r6 = (java.lang.String) r6
                            com.sfbx.appconsent.core.provider.ConsentProvider r2 = r5.this$0
                            kotlinx.serialization.json.Json r2 = com.sfbx.appconsent.core.provider.ConsentProvider.access$getJson$p(r2)
                            com.sfbx.appconsent.core.model.reducer.MobileTcfStorage$Companion r4 = com.sfbx.appconsent.core.model.reducer.MobileTcfStorage.Companion
                            kotlinx.serialization.KSerializer r4 = r4.serializer()
                            java.lang.Object r6 = r2.decodeFromString(r4, r6)
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L51
                            return r1
                        L51:
                            tu.x0 r6 = tu.x0.f87415a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.provider.ConsentProvider$getMobileTcfStorage$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super MobileTcfStorage> flowCollector, d dVar) {
                    Object objCollect = flowEvaluateScript$appconsent_core_prodXchangeRelease.collect(new AnonymousClass2(flowCollector, consentProvider), dVar);
                    return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                }
            };
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<MobileTcfStorage>> dVar) {
            return ((C36532) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$1", f = "ConsentProvider.kt", i = {}, l = {632}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36541 extends n implements p {
        final /* synthetic */ String $consentstring;
        final /* synthetic */ State $state;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConsentProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36541(String str, State state, ConsentProvider consentProvider, d<? super C36541> dVar) {
            super(2, dVar);
            this.$consentstring = str;
            this.$state = state;
            this.this$0 = consentProvider;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36541 c36541 = new C36541(this.$consentstring, this.$state, this.this$0, dVar);
            c36541.L$0 = obj;
            return c36541;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String str = "storeLib.mobileUpdateConsent('" + this.$consentstring + "'," + StateKt.toJson(this.$state, this.this$0.json) + ')';
                this.label = 1;
                if (flowCollector.emit(str, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((C36541) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2", f = "ConsentProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36552 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36552(d<? super C36552> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36552 c36552 = ConsentProvider.this.new C36552(dVar);
            c36552.L$0 = obj;
            return c36552;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            final Flow<String> flowEvaluateScript$appconsent_core_prodXchangeRelease = ConsentProvider.this.evaluateScript$appconsent_core_prodXchangeRelease((String) this.L$0);
            final ConsentProvider consentProvider = ConsentProvider.this;
            return new Flow<String>() { // from class: com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ConsentProvider this$0;

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1$2", f = "ConsentProvider.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                    /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends bv.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // bv.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ConsentProvider consentProvider) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = consentProvider;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            tu.a0.throwOnFailure(r7)
                            goto L63
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            tu.a0.throwOnFailure(r7)
                            kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                            java.lang.String r6 = (java.lang.String) r6
                            java.lang.String r2 = "null"
                            boolean r2 = kotlin.jvm.internal.e0.areEqual(r6, r2)
                            if (r2 != 0) goto L59
                            boolean r2 = sv.n0.isBlank(r6)
                            if (r2 != 0) goto L59
                            com.sfbx.appconsent.core.provider.ConsentProvider r2 = r5.this$0
                            kotlinx.serialization.json.Json r2 = com.sfbx.appconsent.core.provider.ConsentProvider.access$getJson$p(r2)
                            kotlin.jvm.internal.g1 r4 = kotlin.jvm.internal.g1.f71834a
                            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(r4)
                            java.lang.Object r6 = r2.decodeFromString(r4, r6)
                            java.lang.String r6 = (java.lang.String) r6
                            goto L5a
                        L59:
                            r6 = 0
                        L5a:
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L63
                            return r1
                        L63:
                            tu.x0 r6 = tu.x0.f87415a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.provider.ConsentProvider$updateConsentStringRestrictions$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, d dVar) {
                    Object objCollect = flowEvaluateScript$appconsent_core_prodXchangeRelease.collect(new AnonymousClass2(flowCollector, consentProvider), dVar);
                    return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                }
            };
        }

        @Override // kv.p
        public final Object invoke(String str, d<? super Flow<String>> dVar) {
            return ((C36552) create(str, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    private final void configureSettings(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setOffscreenPreRaster(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setBlockNetworkImage(true);
        webView.getSettings().setAllowFileAccess(false);
        webView.setLayerType(0, null);
    }

    private final void defineWebChromeClient(WebView webView) {
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.sfbx.appconsent.core.provider.ConsentProvider.defineWebChromeClient.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                ConsentProvider.this.logConsoleMessage$appconsent_core_prodXchangeRelease(consoleMessage);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayExecutionOnMainThread$lambda$0(kv.a block) {
        e0.checkNotNullParameter(block, "$block");
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: current Looper is Thread MAIN !", null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: we are safe to init webview", null, 4, null);
        block.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow dispatch$default(ConsentProvider consentProvider, Action action, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        return consentProvider.dispatch(action, list);
    }

    public static /* synthetic */ void getMWebView$annotations() {
    }

    public static /* synthetic */ void getStoreCreated$annotations() {
    }

    private final void removeCmpSdkId(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.CMP_SDK_ID).apply();
    }

    private final void removeCmpSdkVersion(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.CMP_SDK_VERSION).apply();
    }

    private final void removeConsentString(SharedPreferences.Editor editor) {
        editor.remove("IABTCF_TCString").apply();
    }

    private final void removeExtraVendorConsents(SharedPreferences.Editor editor) {
        editor.remove(SFBXConstants.EXTRA_VENDOR_CONSENTS).apply();
    }

    private final void removeGeolocationExpiration(SharedPreferences.Editor editor) {
        editor.remove(KEY_GEOLOCATION_EXPIRATION).apply();
    }

    private final void removeGoogleAdditionalConsent(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.GOOGLE_ADDITIONAL_CONSENT).apply();
    }

    private final void removeNeedToUpdate(SharedPreferences.Editor editor) {
        editor.remove(KEY_NEED_TO_UPDATE).apply();
    }

    private final void removeNoticeExpiration(SharedPreferences.Editor editor) {
        editor.remove(KEY_NOTICE_EXPIRATION).apply();
    }

    private final void removePublisherCC(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PUBLISHER_CC).apply();
    }

    private final void removePublisherConsent(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PUBLISHER_CONSENT).apply();
    }

    private final void removePublisherCustomPurposesConsents(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PUBLISHER_CUSTOM_PURPOSES_CONSENTS).apply();
    }

    private final void removePublisherCustomPurposesLegitimateInterests(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS).apply();
    }

    private final void removePublisherLegitimateInterests(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PUBLISHER_LEGITIMATE_INTERESTS).apply();
    }

    private final void removePurposeConsents(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PURPOSE_CONSENTS).apply();
    }

    private final void removePurposeLegitimateInterests(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PURPOSE_LEGITIMATE_INTERESTS).apply();
    }

    private final void removePurposeOneTreatment(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.PURPOSE_ONE_TREATMENT).apply();
    }

    private final void removeSFBXGdprApply() {
        this.f50533sp.edit().remove(SFBXConstants.SFBX_GDPR_APPLIES).apply();
    }

    private final void removeSpecialFeatureOptIns(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.SPECIAL_FEATURE_OPT_INS).apply();
    }

    private final void removeSyncNeeded(SharedPreferences.Editor editor) {
        editor.remove(KEY_SYNC_NEEDED).apply();
    }

    private final void removeTcfPolicyVersion(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.POLICY_VERSION).apply();
    }

    private final void removeUseNonStandardStacks(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.USE_NON_STANDARD_STACKS).apply();
    }

    private final void removeVendorConsents(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.VENDOR_CONSENTS).apply();
    }

    private final void removeVendorLegitimateInterests(SharedPreferences.Editor editor) {
        editor.remove(IABConstants.VENDOR_LEGITIMATE_INTERESTS).apply();
    }

    private final void updateCmpSdkId(SharedPreferences.Editor editor, int i10) {
        editor.putInt(IABConstants.CMP_SDK_ID, i10).apply();
    }

    private final void updateCmpSdkVersion(SharedPreferences.Editor editor, int i10) {
        editor.putInt(IABConstants.CMP_SDK_VERSION, i10).apply();
    }

    private final void updateConsentString(SharedPreferences.Editor editor, String str) {
        editor.putString("IABTCF_TCString", str).apply();
    }

    private final void updateExtraVendorConsents(SharedPreferences.Editor editor, List<String> list) {
        editor.putString(SFBXConstants.EXTRA_VENDOR_CONSENTS, y0.joinToString$default(list, ",", null, null, 0, null, null, 62, null)).apply();
    }

    private final void updateForceApplyGdprFromClientInCache(boolean z10) {
        this.f50533sp.edit().putInt("IABTCF_gdprApplies", z10 ? 1 : 0).apply();
    }

    private final void updatePublisherCC(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PUBLISHER_CC, str).apply();
    }

    private final void updatePublisherConsent(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PUBLISHER_CONSENT, str).apply();
    }

    private final void updatePublisherCustomPurposesConsents(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PUBLISHER_CUSTOM_PURPOSES_CONSENTS, str).apply();
    }

    private final void updatePublisherCustomPurposesLegitimateInterests(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, str).apply();
    }

    private final void updatePublisherLegitimateInterests(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PUBLISHER_LEGITIMATE_INTERESTS, str).apply();
    }

    private final void updatePurposeConsents(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PURPOSE_CONSENTS, str).apply();
    }

    private final void updatePurposeLegitimateInterests(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.PURPOSE_LEGITIMATE_INTERESTS, str).apply();
    }

    private final void updatePurposeOneTreatment(SharedPreferences.Editor editor, int i10) {
        editor.putInt(IABConstants.PURPOSE_ONE_TREATMENT, i10).apply();
    }

    private final void updateSpecialFeatureOptIns(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.SPECIAL_FEATURE_OPT_INS, str).apply();
    }

    private final void updateTcfPolicyVersion(SharedPreferences.Editor editor, int i10) {
        editor.putInt(IABConstants.POLICY_VERSION, i10).apply();
    }

    private final void updateUseNonStandardStacks(SharedPreferences.Editor editor, int i10) {
        editor.putInt(IABConstants.USE_NON_STANDARD_STACKS, i10).apply();
    }

    private final void updateVendorConsents(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.VENDOR_CONSENTS, str).apply();
    }

    private final void updateVendorLegitimateInterests(SharedPreferences.Editor editor, String str) {
        editor.putString(IABConstants.VENDOR_LEGITIMATE_INTERESTS, str).apply();
    }

    public final void clearCache() {
        this.stateDao.save(null);
        this.timeoutProvider.clear();
        this.gcmRepositoryContract.clearGCM();
        SharedPreferences.Editor clearCache$lambda$27 = this.f50533sp.edit();
        e0.checkNotNullExpressionValue(clearCache$lambda$27, "clearCache$lambda$27");
        removePurposeConsents(clearCache$lambda$27);
        removePurposeLegitimateInterests(clearCache$lambda$27);
        removeVendorConsents(clearCache$lambda$27);
        removeVendorLegitimateInterests(clearCache$lambda$27);
        removeSpecialFeatureOptIns(clearCache$lambda$27);
        removeConsentString(clearCache$lambda$27);
        removePublisherCC(clearCache$lambda$27);
        removePurposeOneTreatment(clearCache$lambda$27);
        removeUseNonStandardStacks(clearCache$lambda$27);
        removePublisherConsent(clearCache$lambda$27);
        removePublisherLegitimateInterests(clearCache$lambda$27);
        removePublisherCustomPurposesConsents(clearCache$lambda$27);
        removePublisherCustomPurposesLegitimateInterests(clearCache$lambda$27);
        removeExtraVendorConsents(clearCache$lambda$27);
        removeNoticeExpiration(clearCache$lambda$27);
        removeGeolocationExpiration(clearCache$lambda$27);
        removeSyncNeeded(clearCache$lambda$27);
        removeCmpSdkId(clearCache$lambda$27);
        removeTcfPolicyVersion(clearCache$lambda$27);
        removeGoogleAdditionalConsent(clearCache$lambda$27);
        removeCmpSdkVersion(clearCache$lambda$27);
        removeNeedToUpdate(clearCache$lambda$27);
        removeSaveFloatingTime();
        removeSFBXGdprApply();
        clearCache$lambda$27.apply();
    }

    public final void clearConsents() {
        SharedPreferences.Editor clearConsents$lambda$26 = this.f50533sp.edit();
        e0.checkNotNullExpressionValue(clearConsents$lambda$26, "clearConsents$lambda$26");
        removePurposeConsents(clearConsents$lambda$26);
        removePurposeLegitimateInterests(clearConsents$lambda$26);
        removeVendorConsents(clearConsents$lambda$26);
        removeVendorLegitimateInterests(clearConsents$lambda$26);
        removeSpecialFeatureOptIns(clearConsents$lambda$26);
        removeConsentString(clearConsents$lambda$26);
        removePublisherCC(clearConsents$lambda$26);
        removePurposeOneTreatment(clearConsents$lambda$26);
        removeUseNonStandardStacks(clearConsents$lambda$26);
        removePublisherConsent(clearConsents$lambda$26);
        removePublisherLegitimateInterests(clearConsents$lambda$26);
        removePublisherCustomPurposesConsents(clearConsents$lambda$26);
        removePublisherCustomPurposesLegitimateInterests(clearConsents$lambda$26);
        removeExtraVendorConsents(clearConsents$lambda$26);
        removeNoticeExpiration(clearConsents$lambda$26);
        removeGeolocationExpiration(clearConsents$lambda$26);
        removeSyncNeeded(clearConsents$lambda$26);
        removeCmpSdkId(clearConsents$lambda$26);
        removeTcfPolicyVersion(clearConsents$lambda$26);
        removeGoogleAdditionalConsent(clearConsents$lambda$26);
        removeCmpSdkVersion(clearConsents$lambda$26);
        removeNeedToUpdate(clearConsents$lambda$26);
        removeSaveFloatingTime();
        clearConsents$lambda$26.apply();
        this.gcmRepositoryContract.clearGCM();
    }

    public final void clearTemporaryState() {
        this.stateDao.clearTemporaryState();
    }

    public final State convertLiteralStateAsState$appconsent_core_prodXchangeRelease(String literalState) {
        e0.checkNotNullParameter(literalState, "literalState");
        try {
            return (State) this.json.decodeFromString(State.Companion.serializer(), literalState);
        } catch (Throwable th2) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.e(tag2, "Unable to parse IAB State", th2);
            throw th2;
        }
    }

    public final String createJSValueToCreateStoreWithStateValue$appconsent_core_prodXchangeRelease(State state) {
        return "var store = storeLib.createStore(" + StateKt.toJson(state, this.json) + ", null, false, 3600)";
    }

    public final Flow<String> createStore() {
        return FlowKt.flatMapConcat(FlowKt.flow(new C36461(null)), new AnonymousClass2(null));
    }

    public final void delayExecutionOnMainThread$appconsent_core_prodXchangeRelease(final kv.a block) {
        e0.checkNotNullParameter(block, "block");
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: current Looper IS NOT Thread MAIN !", null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: We preparing an execution task to force run init webview on Main Thread", null, 4, null);
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.sfbx.appconsent.core.provider.a
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentProvider.delayExecutionOnMainThread$lambda$0(block);
                }
            });
        }
    }

    public final Flow<State> dispatch(Action action, List<? extends AppConsentNoticeListener> listeners) {
        e0.checkNotNullParameter(action, "action");
        e0.checkNotNullParameter(listeners, "listeners");
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(FlowKt.flatMapConcat(FlowKt.flatMapConcat(this.storeCreated ? FlowKt.flow(new C36481(null)) : FlowKt.flatMapConcat(FlowKt.flatMapConcat(FlowKt.flow(new C36492(null)), new AnonymousClass3(null)), new AnonymousClass4(null)), new AnonymousClass5(action, null)), new AnonymousClass6(null)), new AnonymousClass7(null));
        return FlowKt.m5171catch(new Flow<State>() { // from class: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentProvider this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1$2", f = "ConsentProvider.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConsentProvider consentProvider) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = consentProvider;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        java.lang.String r5 = (java.lang.String) r5
                        com.sfbx.appconsent.core.provider.ConsentProvider r2 = r4.this$0
                        com.sfbx.appconsent.core.model.reducer.State r5 = r2.convertLiteralStateAsState$appconsent_core_prodXchangeRelease(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.provider.ConsentProvider$dispatch$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super State> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass9(listeners, null));
    }

    public final Flow<String> dispatchActionResultToJSEngine$appconsent_core_prodXchangeRelease(String actionResult) {
        e0.checkNotNullParameter(actionResult, "actionResult");
        return evaluateScript$appconsent_core_prodXchangeRelease("store.dispatch(" + actionResult + ')');
    }

    public final Flow<String> evaluateScript$appconsent_core_prodXchangeRelease(String script) {
        e0.checkNotNullParameter(script, "script");
        return FlowKt.channelFlow(new ConsentProvider$evaluateScript$1(this, script, null));
    }

    public final void executeOnMainThread$appconsent_core_prodXchangeRelease(kv.a block) {
        e0.checkNotNullParameter(block, "block");
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: current Thread ? " + Thread.currentThread(), null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: is current Looper is Thread MAIN ?", null, 4, null);
        if (!e0.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            delayExecutionOnMainThread$appconsent_core_prodXchangeRelease(new ConsentProvider$executeOnMainThread$1(block));
            return;
        }
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: current Looper is Thread MAIN !", null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: init :: we are safe to init webview", null, 4, null);
        block.invoke();
    }

    public final int getCachedFloatingPurposesVersion() {
        return this.f50533sp.getInt(KEY_FlOATING_VERSION, -1);
    }

    public final int getCmpSDKId() {
        return this.f50533sp.getInt(IABConstants.CMP_SDK_ID, -1);
    }

    public final int getCmpSDKVersion() {
        return this.f50533sp.getInt(IABConstants.CMP_SDK_VERSION, -1);
    }

    public final String getConsentString() {
        return this.f50533sp.getString("IABTCF_TCString", null);
    }

    public final Map<String, String> getExternalIds() {
        String string = this.f50533sp.getString(KEY_EXTERNAL_IDS, null);
        if (string == null) {
            string = "{}";
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(this.json.parseToJsonElement(string));
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JsonElementKt.getJsonPrimitive((JsonElement) entry.getValue()).getContent());
        }
        return linkedHashMap;
    }

    public final Map<String, Boolean> getFloatingPurposes() {
        String string = this.f50533sp.getString(KEY_FlOATING_PURPOSES, null);
        if (string == null) {
            string = "{}";
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(this.json.parseToJsonElement(string));
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Boolean.valueOf(JsonElementKt.getBoolean(JsonElementKt.getJsonPrimitive((JsonElement) entry.getValue()))));
        }
        return linkedHashMap;
    }

    public final long getGeolocationExpirationTime() {
        return this.f50533sp.getLong(KEY_GEOLOCATION_EXPIRATION, -1L);
    }

    public final Flow<String> getGoogleAdditionalConsent(State state) {
        e0.checkNotNullParameter(state, "state");
        return FlowKt.flatMapConcat(FlowKt.flow(new C36501(state, this, null)), new C36512(null));
    }

    public final Handler getHandler$appconsent_core_prodXchangeRelease() {
        return this.handler;
    }

    public final WebView getMWebView() {
        return this.mWebView;
    }

    public final Flow<MobileTcfStorage> getMobileTcfStorage(String consentString) {
        e0.checkNotNullParameter(consentString, "consentString");
        return FlowKt.flatMapConcat(FlowKt.flow(new C36521(consentString, null)), new C36532(null));
    }

    public final long getNoticeExpirationTime() {
        return this.f50533sp.getLong(KEY_NOTICE_EXPIRATION, -1L);
    }

    public final String getPurposeConsents() {
        return this.f50533sp.getString(IABConstants.PURPOSE_CONSENTS, null);
    }

    public final String getPurposeLegitimateInterests() {
        return this.f50533sp.getString(IABConstants.PURPOSE_LEGITIMATE_INTERESTS, null);
    }

    public final String getReducer() {
        return (String) this.reducer$delegate.getValue();
    }

    public final long getSaveFloatingTime() {
        return this.f50533sp.getLong(KEY_FlOATING_TIMESTAMP, -1L);
    }

    public final String getSpecialFeatureOptIns() {
        return this.f50533sp.getString(IABConstants.SPECIAL_FEATURE_OPT_INS, null);
    }

    public final Flow<String> getStateFromWebView$appconsent_core_prodXchangeRelease() {
        return evaluateScript$appconsent_core_prodXchangeRelease("store.getState()");
    }

    public final boolean getStoreCreated() {
        return this.storeCreated;
    }

    public final String getVendorConsents() {
        return this.f50533sp.getString(IABConstants.VENDOR_CONSENTS, null);
    }

    public final String getVendorLegitimateInterests() {
        return this.f50533sp.getString(IABConstants.VENDOR_LEGITIMATE_INTERESTS, null);
    }

    public final PackageInfo getWebViewPackageName$appconsent_core_prodXchangeRelease() {
        try {
            try {
                PackageManager packageManager = this.context.getPackageManager();
                e0.checkNotNullExpressionValue(packageManager, "context.packageManager");
                return ExtensionKt.getPackageInfoCompat$default(packageManager, "com.google.android.webview", 0, 2, null);
            } catch (Exception unused) {
                PackageManager packageManager2 = this.context.getPackageManager();
                e0.checkNotNullExpressionValue(packageManager2, "context.packageManager");
                return ExtensionKt.getPackageInfoCompat$default(packageManager2, "com.android.webview", 0, 2, null);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final boolean isGdprForcedByBO() {
        return this.f50533sp.getInt(SFBXConstants.SFBX_GDPR_APPLIES, 1) == 1;
    }

    public final boolean isGdprForcedByBOKeyPresent() {
        return this.f50533sp.contains(SFBXConstants.SFBX_GDPR_APPLIES);
    }

    public final boolean isGdprForcedByClient() {
        return this.f50533sp.getInt("IABTCF_gdprApplies", 0) == 1;
    }

    public final boolean isNeededToUpdate() {
        return this.f50533sp.getBoolean(KEY_NEED_TO_UPDATE, false);
    }

    public final boolean isSubjectToGdpr() {
        return isGdprForcedByClient() || isGdprForcedByBO();
    }

    public final boolean isSyncNeeded() {
        return this.f50533sp.getBoolean(KEY_SYNC_NEEDED, false);
    }

    public final void logConsoleMessage$appconsent_core_prodXchangeRelease(ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            String strMessage = consoleMessage.message();
            e0.checkNotNullExpressionValue(strMessage, "it.message()");
            if (n0.contains$default((CharSequence) strMessage, (CharSequence) "XMLHttpRequest", false, 2, (Object) null)) {
                return;
            }
            PackageInfo webViewPackageName$appconsent_core_prodXchangeRelease = getWebViewPackageName$appconsent_core_prodXchangeRelease();
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.e$default(aCLogger, tag2, consoleMessage.message() + " -- From line `" + consoleMessage.lineNumber() + "` of `" + consoleMessage.sourceId() + '`', null, 4, null);
            if (webViewPackageName$appconsent_core_prodXchangeRelease != null) {
                e0.checkNotNullExpressionValue(tag2, "tag");
                StringBuilder sb2 = new StringBuilder("Your System component WebView, can't evaluate the IAB script (try to update it): ");
                sb2.append(webViewPackageName$appconsent_core_prodXchangeRelease.packageName);
                sb2.append('(');
                ACLoggerContract.DefaultImpls.e$default(aCLogger, tag2, p0.o2.q(sb2, webViewPackageName$appconsent_core_prodXchangeRelease.versionName, ')'), null, 4, null);
            }
        }
    }

    public final void removeSaveFloatingTime() {
        this.f50533sp.edit().remove(KEY_FlOATING_TIMESTAMP).apply();
    }

    public final void setCmpSDKId(int i10) {
        this.f50533sp.edit().putInt(IABConstants.CMP_SDK_ID, i10).apply();
    }

    public final void setCmpSDKVersion(int i10) {
        this.f50533sp.edit().putInt(IABConstants.CMP_SDK_VERSION, i10).apply();
    }

    public final void setExternalIds(Map<String, String> ids) {
        e0.checkNotNullParameter(ids, "ids");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(ids.size()));
        Iterator<T> it = ids.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JsonElementKt.JsonPrimitive((String) entry.getValue()));
        }
        this.f50533sp.edit().putString(KEY_EXTERNAL_IDS, new JsonObject(linkedHashMap).toString()).apply();
    }

    public final void setFloatingPurposes(Map<String, Boolean> ids) {
        e0.checkNotNullParameter(ids, "ids");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(ids.size()));
        Iterator<T> it = ids.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JsonElementKt.JsonPrimitive((Boolean) entry.getValue()));
        }
        this.f50533sp.edit().putString(KEY_FlOATING_PURPOSES, new JsonObject(linkedHashMap).toString()).apply();
    }

    public final void setFloatingPurposesVersion(int i10) {
        this.f50533sp.edit().putInt(KEY_FlOATING_VERSION, i10).apply();
    }

    public final void setGeolocationExpirationTime(long j10) {
        this.f50533sp.edit().putLong(KEY_GEOLOCATION_EXPIRATION, j10).apply();
    }

    public final void setHandler$appconsent_core_prodXchangeRelease(Handler handler) {
        this.handler = handler;
    }

    public final void setMWebView(WebView webView) {
        this.mWebView = webView;
    }

    public final void setNeedToUpdate(boolean z10) {
        this.f50533sp.edit().putBoolean(KEY_NEED_TO_UPDATE, z10).apply();
    }

    public final void setNoticeExpirationTime(long j10) {
        this.f50533sp.edit().putLong(KEY_NOTICE_EXPIRATION, j10).apply();
    }

    public final Flow<String> setReducer(String reducer) {
        e0.checkNotNullParameter(reducer, "reducer");
        return evaluateScript$appconsent_core_prodXchangeRelease(reducer);
    }

    public final void setSaveFloatingTime(long j10) {
        this.f50533sp.edit().putLong(KEY_FlOATING_TIMESTAMP, j10).apply();
    }

    public final void setStoreCreated(boolean z10) {
        this.storeCreated = z10;
    }

    public final void setSyncNeeded(boolean z10) {
        this.f50533sp.edit().putBoolean(KEY_SYNC_NEEDED, z10).apply();
    }

    public final void tryToInstantiateWebViewComponent$appconsent_core_prodXchangeRelease() {
        try {
            if (this.mWebView == null) {
                ACLogger aCLogger = ACLogger.INSTANCE;
                String tag2 = tag;
                e0.checkNotNullExpressionValue(tag2, "tag");
                ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ">> Starting init WebView", null, 4, null);
                WebView webView = new WebView(this.context);
                configureSettings(webView);
                defineWebChromeClient(webView);
                this.mWebView = webView;
                e0.checkNotNullExpressionValue(tag2, "tag");
                ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "<< WebView initializing ended !", null, 4, null);
                WebView webView2 = this.mWebView;
                if (webView2 != null) {
                    webView2.loadUrl("#");
                }
            }
        } catch (Throwable th2) {
            String str = System.lineSeparator() + "*****************************************************************************************************************" + System.lineSeparator() + "* It seems that the \"WebView\" system component is not present on your device, or that it is being updated.      *" + System.lineSeparator() + "* Please take the time to check whether it is present or not.                                                   *" + System.lineSeparator() + "* If it is and this log continues to appear, please contact support.                                            *" + System.lineSeparator() + "* If the component is not present and you are unwilling/unable to install it, CMP will not be able to function. *" + System.lineSeparator() + "*****************************************************************************************************************";
            ACLogger aCLogger2 = ACLogger.INSTANCE;
            String tag3 = tag;
            e0.checkNotNullExpressionValue(tag3, "tag");
            aCLogger2.e(tag3, str, th2);
        }
    }

    public final Flow<String> updateConsentStringRestrictions(String consentstring, State state) {
        e0.checkNotNullParameter(consentstring, "consentstring");
        e0.checkNotNullParameter(state, "state");
        return FlowKt.flatMapConcat(FlowKt.flow(new C36541(consentstring, state, this, null)), new C36552(null));
    }

    public final void updateGdprFromBOInCache(boolean z10) {
        this.f50533sp.edit().putInt(SFBXConstants.SFBX_GDPR_APPLIES, z10 ? 1 : 0).apply();
    }

    public final void updateGdprInCacheFromInit(boolean z10) {
        updateForceApplyGdprFromClientInCache(z10);
        if (z10) {
            updateGdprFromBOInCache(true);
        }
    }

    public final void updateGoogleAdditionalConsent(String str) {
        this.f50533sp.edit().putString(IABConstants.GOOGLE_ADDITIONAL_CONSENT, str).apply();
    }

    public final void updateIABConsentsInCache(MobileTcfStorage tcfStorage, List<String> extraVendorIds) {
        e0.checkNotNullParameter(tcfStorage, "tcfStorage");
        e0.checkNotNullParameter(extraVendorIds, "extraVendorIds");
        SharedPreferences.Editor updateIABConsentsInCache$lambda$25 = this.f50533sp.edit();
        e0.checkNotNullExpressionValue(updateIABConsentsInCache$lambda$25, "updateIABConsentsInCache$lambda$25");
        updateExtraVendorConsents(updateIABConsentsInCache$lambda$25, extraVendorIds);
        updateVendorConsents(updateIABConsentsInCache$lambda$25, tcfStorage.getVendorConsents());
        updateVendorLegitimateInterests(updateIABConsentsInCache$lambda$25, tcfStorage.getVendorLegInt());
        updatePurposeConsents(updateIABConsentsInCache$lambda$25, tcfStorage.getPurposeConsents());
        updatePurposeLegitimateInterests(updateIABConsentsInCache$lambda$25, tcfStorage.getPurposeLegInt());
        updateConsentString(updateIABConsentsInCache$lambda$25, tcfStorage.getConsentString());
        updateSpecialFeatureOptIns(updateIABConsentsInCache$lambda$25, tcfStorage.getSpecialFeatureOptIns());
        updateCmpSdkId(updateIABConsentsInCache$lambda$25, tcfStorage.getCmpSdkId());
        updateCmpSdkVersion(updateIABConsentsInCache$lambda$25, tcfStorage.getCmpSdkVersion());
        updateTcfPolicyVersion(updateIABConsentsInCache$lambda$25, tcfStorage.getPolicyVersion());
        updatePublisherCC(updateIABConsentsInCache$lambda$25, tcfStorage.getPublisherCountryCode());
        updatePurposeOneTreatment(updateIABConsentsInCache$lambda$25, tcfStorage.getPurposeOneTreatment());
        updateUseNonStandardStacks(updateIABConsentsInCache$lambda$25, tcfStorage.getUseNonStandardStacks());
        updatePublisherConsent(updateIABConsentsInCache$lambda$25, tcfStorage.getPublisherConsent());
        updatePublisherLegitimateInterests(updateIABConsentsInCache$lambda$25, tcfStorage.getPublisherLegInt());
        updatePublisherCustomPurposesConsents(updateIABConsentsInCache$lambda$25, tcfStorage.getPublisherCustomPurposeConsent());
        updatePublisherCustomPurposesLegitimateInterests(updateIABConsentsInCache$lambda$25, tcfStorage.getPublisherCustomPurposeLegInt());
        updateIABConsentsInCache$lambda$25.apply();
    }

    public ConsentProvider(Context context, SharedPreferences sp2, Json json, StateDao stateDao, ReducerDao reducerDao, TimeoutProvider timeoutProvider, GCMRepositoryContract gcmRepositoryContract) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sp2, "sp");
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(stateDao, PcrIk.vEicJlwOrSDUlUB);
        e0.checkNotNullParameter(reducerDao, "reducerDao");
        e0.checkNotNullParameter(timeoutProvider, "timeoutProvider");
        e0.checkNotNullParameter(gcmRepositoryContract, "gcmRepositoryContract");
        this.context = context;
        this.f50533sp = sp2;
        this.json = json;
        this.stateDao = stateDao;
        this.reducerDao = reducerDao;
        this.timeoutProvider = timeoutProvider;
        this.gcmRepositoryContract = gcmRepositoryContract;
        this.reducer$delegate = tu.q.lazy(new ConsentProvider$reducer$2(this));
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ">> init", null, 4, null);
        executeOnMainThread$appconsent_core_prodXchangeRelease(new AnonymousClass1());
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "<< init", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<String> fromActionToFlow(Action action) {
        String str;
        if (action instanceof Hello) {
            return evaluateScript$appconsent_core_prodXchangeRelease("storeLib.actions.hello(" + this.json.encodeToString(HelloReply.Companion.serializer(), ((Hello) action).getPayload()) + ')');
        }
        if (action instanceof AllowAll) {
            return evaluateScript$appconsent_core_prodXchangeRelease("storeLib.actions.allowAll(" + y0.joinToString$default(((AllowAll) action).getExcludedConsentables(), null, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, null, 57, null) + ')');
        }
        if (action instanceof DenyAll) {
            DenyAll denyAll = (DenyAll) action;
            Models.Consent.EnumConsentType consentType = denyAll.getConsentType();
            Integer numValueOf = consentType != null ? Integer.valueOf(consentType.getNumber()) : null;
            if (numValueOf != null) {
                str = UupKET.cVZTlO + numValueOf;
            } else {
                str = "";
            }
            return evaluateScript$appconsent_core_prodXchangeRelease("storeLib.actions.denyAll(" + y0.joinToString$default(denyAll.getExcludedConsentables(), null, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, null, 57, null) + str + ')');
        }
        boolean z10 = action instanceof SetStack;
        String str2 = ikJMrW.XUiyIELrpWmlgdU;
        if (z10) {
            StringBuilder sb2 = new StringBuilder("storeLib.actions.setStack(");
            SetStack setStack = (SetStack) action;
            sb2.append(setStack.getId());
            sb2.append(str2);
            sb2.append(setStack.getStatus().getValue$appconsent_core_prodXchangeRelease());
            sb2.append(str2);
            sb2.append(setStack.getLegint());
            sb2.append(')');
            return evaluateScript$appconsent_core_prodXchangeRelease(sb2.toString());
        }
        if (action instanceof SetConsentable) {
            StringBuilder sb3 = new StringBuilder("storeLib.actions.setConsent(");
            SetConsentable setConsentable = (SetConsentable) action;
            sb3.append(setConsentable.getId());
            sb3.append(str2);
            sb3.append(setConsentable.getStatus().getValue$appconsent_core_prodXchangeRelease());
            sb3.append(str2);
            sb3.append(setConsentable.getLegint());
            sb3.append(')');
            return evaluateScript$appconsent_core_prodXchangeRelease(sb3.toString());
        }
        if (action instanceof SetVendor) {
            StringBuilder sb4 = new StringBuilder("storeLib.actions.setVendor(");
            SetVendor setVendor = (SetVendor) action;
            sb4.append(setVendor.getId());
            sb4.append(str2);
            sb4.append(setVendor.getStatus().getValue$appconsent_core_prodXchangeRelease());
            sb4.append(str2);
            sb4.append(setVendor.getLegint());
            sb4.append(')');
            return evaluateScript$appconsent_core_prodXchangeRelease(sb4.toString());
        }
        if (action instanceof Save) {
            return evaluateScript$appconsent_core_prodXchangeRelease("storeLib.actions.save()");
        }
        if (!(action instanceof Track)) {
            if (action instanceof ResetEvents) {
                return evaluateScript$appconsent_core_prodXchangeRelease("storeLib.actions.resetEvents()");
            }
            throw new IllegalArgumentException("Action doesn't recognize !");
        }
        return evaluateScript$appconsent_core_prodXchangeRelease("storeLib.actions.track(\"" + ((Track) action).getEvent() + "\")");
    }
}
