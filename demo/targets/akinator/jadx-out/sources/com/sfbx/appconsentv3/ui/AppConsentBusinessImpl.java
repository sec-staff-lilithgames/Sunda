package com.sfbx.appconsentv3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentError;
import com.sfbx.appconsent.core.listener.AppConsentLocationListener;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.listener.AppConsentSaveCallback;
import com.sfbx.appconsent.core.listener.AppConsentSetConsentableConsentsCallback;
import com.sfbx.appconsent.core.listener.AppconsentSaveExternalIdsListener;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.ExportConsentable;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsent.core.model.gcm.GCMStatus;
import com.sfbx.appconsentv3.ui.core.FullAppConsentContract;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.listener.OnPresentGeolocationNoticeListener;
import com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener;
import com.sfbx.appconsentv3.ui.model.NoticeViewState;
import com.sfbx.appconsentv3.ui.ui.load.LoadActivity;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.a;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import uu.p1;
import uu.q0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AppConsentBusinessImpl implements FullAppConsentContract {
    public static final Companion Companion = new Companion(null);
    private static final String tag = "AppConsentBusinessImpl";
    private final Context context;
    private final CoroutineDispatcher coroutineDispatcher;
    private boolean fullScreenMode;
    private boolean isNeedToDisplayButtonsAtVertical;
    private boolean isNeedToReplaceUrlViewerByQrCode;
    private Map<String, ? extends Object> mExternalData;
    private NoticeViewState noticeViewState;
    private OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener;
    private OnPresentNoticeListener onPresentNoticeListener;
    private final AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1 subscriberAppConsentGeolocationNotice;
    private final AppConsentBusinessImpl$subscriberAppConsentNotice$1 subscriberAppConsentNotice;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$executeFirstLaunch$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ a $onReady;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(0);
            this.$onReady = aVar;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3463invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3463invoke() {
            if (AppConsentBusinessImpl.this.isSubjectToGDPR() || AppConsentBusinessImpl.this.isNeedUserConsents()) {
                AppConsentBusinessImpl.this.runGetNoticeFromCoroutine();
            }
            this.$onReady.invoke();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$executeGetNoticeFromCoroutine$2", f = "AppConsentBusinessImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$executeGetNoticeFromCoroutine$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AppConsentBusinessImpl.this.logErrorFromGetNotice((Throwable) this.L$0);
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = AppConsentBusinessImpl.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$runGetNoticeFromCoroutine$1", f = "AppConsentBusinessImpl.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$runGetNoticeFromCoroutine$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36921 extends n implements p {
        int label;

        public C36921(d<? super C36921> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AppConsentBusinessImpl.this.new C36921(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AppConsentBusinessImpl appConsentBusinessImpl = AppConsentBusinessImpl.this;
                this.label = 1;
                if (appConsentBusinessImpl.executeGetNoticeFromCoroutine(this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C36921) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$save$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36931 extends f0 implements l {
        final /* synthetic */ AppConsentSaveCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36931(AppConsentSaveCallback appConsentSaveCallback) {
            super(1);
            this.$callback = appConsentSaveCallback;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return x0.f87415a;
        }

        public final void invoke(boolean z10) {
            this.$callback.onResult(z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$save$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36942 extends f0 implements l {
        final /* synthetic */ AppConsentSaveCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36942(AppConsentSaveCallback appConsentSaveCallback) {
            super(1);
            this.$callback = appConsentSaveCallback;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
            this.$callback.onError(it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36951 extends f0 implements a {
        final /* synthetic */ AppconsentSaveExternalIdsListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36951(AppconsentSaveExternalIdsListener appconsentSaveExternalIdsListener) {
            super(0);
            this.$listener = appconsentSaveExternalIdsListener;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3464invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3464invoke() {
            this.$listener.success();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$saveExternalIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36962 extends f0 implements l {
        final /* synthetic */ AppconsentSaveExternalIdsListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36962(AppconsentSaveExternalIdsListener appconsentSaveExternalIdsListener) {
            super(1);
            this.$listener = appconsentSaveExternalIdsListener;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.$listener.failed(th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36971 extends f0 implements a {
        final /* synthetic */ AppconsentSaveExternalIdsListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36971(AppconsentSaveExternalIdsListener appconsentSaveExternalIdsListener) {
            super(0);
            this.$listener = appconsentSaveExternalIdsListener;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3465invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3465invoke() {
            this.$listener.success();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$saveFloatingPurposes$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36982 extends f0 implements l {
        final /* synthetic */ AppconsentSaveExternalIdsListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36982(AppconsentSaveExternalIdsListener appconsentSaveExternalIdsListener) {
            super(1);
            this.$listener = appconsentSaveExternalIdsListener;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.$listener.failed(th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$setConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36991 extends f0 implements a {
        final /* synthetic */ AppConsentSetConsentableConsentsCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36991(AppConsentSetConsentableConsentsCallback appConsentSetConsentableConsentsCallback) {
            super(0);
            this.$callback = appConsentSetConsentableConsentsCallback;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3466invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3466invoke() {
            this.$callback.onSuccess();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$setConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37002 extends f0 implements l {
        final /* synthetic */ AppConsentSetConsentableConsentsCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37002(AppConsentSetConsentableConsentsCallback appConsentSetConsentableConsentsCallback) {
            super(1);
            this.$callback = appConsentSetConsentableConsentsCallback;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
            this.$callback.onError(it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$setExtraConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37011 extends f0 implements a {
        final /* synthetic */ AppConsentSetConsentableConsentsCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37011(AppConsentSetConsentableConsentsCallback appConsentSetConsentableConsentsCallback) {
            super(0);
            this.$callback = appConsentSetConsentableConsentsCallback;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3467invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3467invoke() {
            this.$callback.onSuccess();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$setExtraConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37022 extends f0 implements l {
        final /* synthetic */ AppConsentSetConsentableConsentsCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37022(AppConsentSetConsentableConsentsCallback appConsentSetConsentableConsentsCallback) {
            super(1);
            this.$callback = appConsentSetConsentableConsentsCallback;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
            this.$callback.onError(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.sfbx.appconsent.core.listener.AppConsentLocationListener, com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.sfbx.appconsent.core.listener.AppConsentNoticeListener, com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$subscriberAppConsentNotice$1] */
    public AppConsentBusinessImpl(Context context, CoroutineDispatcher coroutineDispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.context = context;
        this.coroutineDispatcher = coroutineDispatcher;
        this.noticeViewState = NoticeViewState.None.INSTANCE;
        this.mExternalData = p1.emptyMap();
        ?? r42 = new AppConsentNoticeListener() { // from class: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$subscriberAppConsentNotice$1
            @Override // com.sfbx.appconsent.core.listener.AppConsentNoticeListener
            public void onConsentGiven() {
                if (this.this$0.noticeViewState instanceof NoticeViewState.Notice) {
                    this.this$0.resetNoticeViewState();
                    BuildersKt__Builders_commonKt.launch$default(com.google.android.gms.internal.play_billing.a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AppConsentBusinessImpl$subscriberAppConsentNotice$1$onConsentGiven$1(this.this$0, null), 3, null);
                }
            }

            @Override // com.sfbx.appconsent.core.listener.AppConsentNoticeListener
            public void onError(AppConsentError error) {
                e0.checkNotNullParameter(error, "error");
                if (this.this$0.noticeViewState instanceof NoticeViewState.Notice) {
                    this.this$0.resetNoticeViewState();
                    BuildersKt__Builders_commonKt.launch$default(com.google.android.gms.internal.play_billing.a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AppConsentBusinessImpl$subscriberAppConsentNotice$1$onError$1(this.this$0, error, null), 3, null);
                }
            }
        };
        this.subscriberAppConsentNotice = r42;
        ?? r02 = new AppConsentLocationListener() { // from class: com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1
            @Override // com.sfbx.appconsent.core.listener.AppConsentLocationListener
            public void onError(AppConsentError error) {
                e0.checkNotNullParameter(error, "error");
                if (this.this$0.noticeViewState instanceof NoticeViewState.GeolocationNotice) {
                    this.this$0.resetNoticeViewState();
                    BuildersKt__Builders_commonKt.launch$default(com.google.android.gms.internal.play_billing.a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onError$1(this.this$0, error, null), 3, null);
                }
            }

            @Override // com.sfbx.appconsent.core.listener.AppConsentLocationListener
            public void onResult(boolean z10) {
                if (this.this$0.noticeViewState instanceof NoticeViewState.GeolocationNotice) {
                    this.this$0.resetNoticeViewState();
                    BuildersKt__Builders_commonKt.launch$default(com.google.android.gms.internal.play_billing.a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1(this.this$0, null), 3, null);
                }
            }
        };
        this.subscriberAppConsentGeolocationNotice = r02;
        UIInjector.INSTANCE.init(context);
        getAppConsentCoreInstance().removeNoticeListener(r42);
        getAppConsentCoreInstance().removeLocationListener(r02);
        getAppConsentCoreInstance().addNoticeListener(r42);
        getAppConsentCoreInstance().addLocationListener(r02);
    }

    private final void executeFirstLaunch(String str, boolean z10, a aVar) {
        getAppConsentCoreInstance().firstLaunch(str, z10, new AnonymousClass1(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object executeGetNoticeFromCoroutine(d<? super x0> dVar) {
        Object objCollect = FlowKt.collect(FlowKt.m5171catch(getAppConsentCoreInstance().getNotice(false), new AnonymousClass2(null)), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logErrorFromGetNotice(Throwable th2) {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        aCLogger.e(tag2, "Unable to get Notice from remote", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetNoticeViewState() {
        setNoticeViewState(NoticeViewState.None.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runGetNoticeFromCoroutine() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.coroutineDispatcher), null, null, new C36921(null), 3, null);
    }

    private final void setNoticeViewState(NoticeViewState noticeViewState) {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "Changing NoticeViewState from " + this.noticeViewState + " to " + noticeViewState, null, 4, null);
        this.noticeViewState = noticeViewState;
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    @tu.f
    public boolean allConsentablesAllowed() {
        return getAppConsentCoreInstance().allConsentablesAllowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    @tu.f
    public boolean allStacksAllowed() {
        return getAppConsentCoreInstance().allStacksAllowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    @tu.f
    public boolean allVendorsAllowed() {
        return getAppConsentCoreInstance().allVendorsAllowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void checkForUpdate(l onResult, l error) {
        e0.checkNotNullParameter(onResult, "onResult");
        e0.checkNotNullParameter(error, "error");
        getAppConsentCoreInstance().checkForUpdate(onResult, error);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void clearCache() {
        getAppConsentCoreInstance().clearCache();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void clearConsent() {
        getAppConsentCoreInstance().clearConsents();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean consentGiven() {
        return getAppConsentCoreInstance().consentGiven();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean consentableAllowed(int i10, ConsentableType consentableType) {
        e0.checkNotNullParameter(consentableType, "consentableType");
        return getAppConsentCoreInstance().consentableAllowed(i10, consentableType);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean extraConsentableAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return getAppConsentCoreInstance().extraConsentableAllowed(extraId);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean extraFloatingAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return getAppConsentCoreInstance().extraFloatingAllowed(extraId);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean extraVendorAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return getAppConsentCoreInstance().extraVendorAllowed(extraId);
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public void firstLaunch(String appKey, boolean z10, boolean z11, boolean z12, boolean z13, AppConsentTheme appConsentTheme, a onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        this.fullScreenMode = z11;
        this.isNeedToDisplayButtonsAtVertical = z12;
        this.isNeedToReplaceUrlViewerByQrCode = z13;
        UIInjector uIInjector = UIInjector.INSTANCE;
        uIInjector.defineNeedToDisplayQrCode(z13);
        uIInjector.initACTheme(appConsentTheme);
        executeFirstLaunch(appKey, z10, onReady);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Flow<Bitmap> generateQrCode(String data) {
        e0.checkNotNullParameter(data, "data");
        return getAppConsentCoreInstance().generateQrCode(data);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean geolocationConsentGiven() {
        return getAppConsentCoreInstance().geolocationConsentGiven();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public List<ExportConsentable> getAllConsentables(ConsentStatus consentStatus) {
        return getAppConsentCoreInstance().getExportConsentable(consentStatus);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Map<String, Boolean> getAllExtraVendors(ConsentStatus consentStatus) {
        HashMap map = new HashMap();
        List<Vendor> vendors = getAppConsentCoreInstance().getVendors();
        ArrayList<Vendor> arrayList = new ArrayList();
        for (Object obj : vendors) {
            Vendor vendor = (Vendor) obj;
            if (vendor.isExtraVendor()) {
                if (vendor.getStatus() == (consentStatus == null ? vendor.getStatus() : consentStatus)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        for (Vendor vendor2 : arrayList) {
            arrayList2.add((Boolean) map.put(vendor2.getExtraId(), Boolean.valueOf(vendor2.getStatus() == ConsentStatus.ALLOWED)));
        }
        return map;
    }

    public final AppConsentCore getAppConsentCoreInstance() {
        return UIInjector.INSTANCE.provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    @tu.f
    public Map<String, Object> getExternalData() {
        return this.mExternalData;
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public Map<String, String> getExternalIds() {
        return getAppConsentCoreInstance().getExternalIds();
    }

    public final boolean getFullScreenMode() {
        return this.fullScreenMode;
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public GCMStatus getGCMConsentStatus() {
        return getAppConsentCoreInstance().getGCMStatus();
    }

    public final OnPresentGeolocationNoticeListener getOnPresentGeolocationNoticeListener() {
        return this.onPresentGeolocationNoticeListener;
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public String getUserId() {
        return getAppConsentCoreInstance().getUserId();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isAllConsentablesAllowed() {
        return getAppConsentCoreInstance().isAllConsentablesAllowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isAllConsentablesDisallowed() {
        return getAppConsentCoreInstance().isAllConsentablesDisallowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isAllStacksAllowed() {
        return getAppConsentCoreInstance().isAllStacksAllowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isAllStacksDisallowed() {
        return getAppConsentCoreInstance().isAllStacksDisallowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isAllVendorsAllowed() {
        return getAppConsentCoreInstance().isAllVendorsAllowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isAllVendorsDisallowed() {
        return getAppConsentCoreInstance().isAllVendorsDisallowed();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean isFloatingNeedUpdate() {
        return getAppConsentCoreInstance().isFloatingNeedUpdate();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean isLimitedTrackingEnabled() {
        return !getAppConsentCoreInstance().userIdIsAdId();
    }

    public final boolean isNeedToDisplayButtonsAtVertical() {
        return this.isNeedToDisplayButtonsAtVertical;
    }

    public final boolean isNeedToReplaceUrlViewerByQrCode() {
        return this.isNeedToReplaceUrlViewerByQrCode;
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean isNeedUserConsents() {
        return getAppConsentCoreInstance().needUserConsents();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean isNeedUserConsentsToGeolocation() {
        return getAppConsentCoreInstance().needUserLocationConsents();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean isSubjectToGDPR() {
        return getAppConsentCoreInstance().isSubjectToGDPR();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isUserAcceptAll() {
        return getAppConsentCoreInstance().isUserAcceptAll();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public Boolean isUserDenyAll() {
        return getAppConsentCoreInstance().isUserDenyAll();
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public void presentGeolocationNotice(boolean z10) {
        setNoticeViewState(NoticeViewState.GeolocationNotice.INSTANCE);
        Context context = this.context;
        context.startActivity(LoadActivity.Companion.getStartIntent(context, z10, true, this.fullScreenMode, this.isNeedToDisplayButtonsAtVertical, this.isNeedToReplaceUrlViewerByQrCode));
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public void presentNotice(boolean z10) {
        UIInjector.INSTANCE.checkInstance();
        setNoticeViewState(NoticeViewState.Notice.INSTANCE);
        Context context = this.context;
        context.startActivity(LoadActivity.Companion.getStartIntent$default(LoadActivity.Companion, context, z10, false, this.fullScreenMode, this.isNeedToDisplayButtonsAtVertical, this.isNeedToReplaceUrlViewerByQrCode, 4, null));
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void save(AppConsentSaveCallback callback) {
        e0.checkNotNullParameter(callback, "callback");
        getAppConsentCoreInstance().saveConsents(new C36931(callback), new C36942(callback));
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void saveExternalIds(a success, l failed) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        getAppConsentCoreInstance().saveExternalIds(success, failed);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void saveFloatingPurposes(Map<String, Boolean> floatingPurposes, a success, l failed) {
        e0.checkNotNullParameter(floatingPurposes, "floatingPurposes");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        getAppConsentCoreInstance().setFloatingPurposes(floatingPurposes);
        getAppConsentCoreInstance().saveFloatingPurposes(success, failed);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void setConsentableConsents(Map<Integer, ? extends ConsentStatus> consents, AppConsentSetConsentableConsentsCallback callback) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(callback, "callback");
        getAppConsentCoreInstance().setConsentableConsents(consents, new C36991(callback), new C37002(callback));
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    @tu.f
    public void setExternalData(Map<String, ? extends Object> map) {
        e0.checkNotNullParameter(map, "map");
        this.mExternalData = map;
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public void setExternalIds(Map<String, String> externalIds) {
        e0.checkNotNullParameter(externalIds, "externalIds");
        getAppConsentCoreInstance().setExternalIds(externalIds);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> consents, AppConsentSetConsentableConsentsCallback callback) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(callback, "callback");
        getAppConsentCoreInstance().setExtraConsentableConsents(consents, new C37011(callback), new C37022(callback));
    }

    public final void setFullScreenMode(boolean z10) {
        this.fullScreenMode = z10;
    }

    public final void setNeedToDisplayButtonsAtVertical(boolean z10) {
        this.isNeedToDisplayButtonsAtVertical = z10;
    }

    public final void setNeedToReplaceUrlViewerByQrCode(boolean z10) {
        this.isNeedToReplaceUrlViewerByQrCode = z10;
    }

    public final void setOnPresentGeolocationNoticeListener(OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener) {
        this.onPresentGeolocationNoticeListener = onPresentGeolocationNoticeListener;
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public void setPresenterGeolocationNoticeListener(OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener) {
        this.onPresentGeolocationNoticeListener = onPresentGeolocationNoticeListener;
    }

    @Override // com.sfbx.appconsentv3.ui.core.FullAppConsentContract
    public void setPresenterNoticeListener(OnPresentNoticeListener onPresentNoticeListener) {
        this.onPresentNoticeListener = onPresentNoticeListener;
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean stackAllowed(int i10) {
        return getAppConsentCoreInstance().stackAllowed(i10);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    @tu.f
    public boolean userAcceptAll() {
        return getAppConsentCoreInstance().userAcceptAll();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public boolean vendorAllowed(int i10) {
        return getAppConsentCoreInstance().vendorAllowed(i10);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void save(l onResult, l onError) {
        e0.checkNotNullParameter(onResult, "onResult");
        e0.checkNotNullParameter(onError, "onError");
        getAppConsentCoreInstance().saveConsents(onResult, onError);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void saveExternalIds(AppconsentSaveExternalIdsListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        getAppConsentCoreInstance().saveExternalIds(new C36951(listener), new C36962(listener));
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void setConsentableConsents(Map<Integer, ? extends ConsentStatus> consents, a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        getAppConsentCoreInstance().setConsentableConsents(consents, success, error);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> consents, a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        getAppConsentCoreInstance().setExtraConsentableConsents(consents, success, error);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentCoreContract
    public void saveFloatingPurposes(Map<String, Boolean> floatingPurposes, AppconsentSaveExternalIdsListener listener) {
        e0.checkNotNullParameter(floatingPurposes, "floatingPurposes");
        e0.checkNotNullParameter(listener, "listener");
        getAppConsentCoreInstance().setFloatingPurposes(floatingPurposes);
        getAppConsentCoreInstance().saveFloatingPurposes(new C36971(listener), new C36982(listener));
    }

    public /* synthetic */ AppConsentBusinessImpl(Context context, CoroutineDispatcher coroutineDispatcher, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
