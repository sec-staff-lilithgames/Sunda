package com.sfbx.appconsent.core.business;

import ac.AcError;
import ac.Models;
import android.content.Context;
import android.graphics.Bitmap;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sfbx.appconsent.core.AppConsentError;
import com.sfbx.appconsent.core.dao.ConfigurationDao;
import com.sfbx.appconsent.core.dao.StateDao;
import com.sfbx.appconsent.core.di.CoreInjector;
import com.sfbx.appconsent.core.listener.AppConsentLocationListener;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.listener.AppConsentRequestLocationListener;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.ExportConsentable;
import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.RemoteTheme;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsent.core.model.api.XChangeUserData;
import com.sfbx.appconsent.core.model.api.proto.Configuration;
import com.sfbx.appconsent.core.model.api.proto.Consent;
import com.sfbx.appconsent.core.model.api.proto.CountryProto;
import com.sfbx.appconsent.core.model.api.proto.ErrorResponse;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsent.core.model.reducer.ConsentableReducer;
import com.sfbx.appconsent.core.model.reducer.DataCategoryReducer;
import com.sfbx.appconsent.core.model.reducer.StackReducer;
import com.sfbx.appconsent.core.model.reducer.State;
import com.sfbx.appconsent.core.model.reducer.VendorReducer;
import com.sfbx.appconsent.core.model.reducer.action.AllowAll;
import com.sfbx.appconsent.core.model.reducer.action.DenyAll;
import com.sfbx.appconsent.core.model.reducer.action.ResetEvents;
import com.sfbx.appconsent.core.model.reducer.action.SetConsentable;
import com.sfbx.appconsent.core.model.reducer.action.SetStack;
import com.sfbx.appconsent.core.model.reducer.action.SetVendor;
import com.sfbx.appconsent.core.model.reducer.action.Track;
import com.sfbx.appconsent.core.provider.ConfigurationProvider;
import com.sfbx.appconsent.core.provider.ConsentProvider;
import com.sfbx.appconsent.core.provider.UserProvider;
import com.sfbx.appconsent.core.provider.XChangeProvider;
import com.sfbx.appconsent.core.repository.ConsentRepository;
import com.sfbx.appconsent.core.util.ExtensionKt;
import com.sfbx.appconsent.core.util.StateExtsKt;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import io.sfbx.appconsent.core.gcm.modal.GCMConsentResponse;
import io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.l;
import kv.p;
import kv.q;
import nv.c;
import sv.n0;
import tu.a0;
import tu.k;
import tu.o;
import tu.x0;
import tu.z;
import uu.k0;
import uu.p0;
import uu.y0;
import zb.VW.VPCjETNfjxu;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AbstractCore {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.n(AbstractCore.class, "mConsentListener", "getMConsentListener()Lcom/sfbx/appconsent/core/model/reducer/State;", 0)};
    public static final Companion Companion = new Companion(null);
    private static final String tag = "AbstractCore";
    private final MutableStateFlow<Boolean> _isGDPRState;
    private final Context context;
    private final o gcmRepository$delegate;
    private final o mConfigDao$delegate;
    private final o mConfigurationProvider$delegate;
    private final c mConsentListener$delegate;
    private final o mConsentProvider$delegate;
    private final o mConsentRepository$delegate;
    private final List<AppConsentLocationListener> mLocationListeners;
    private final List<AppConsentNoticeListener> mNoticeListeners;
    private final List<AppConsentRequestLocationListener> mRequestLocationListeners;
    private final o mStateDao$delegate;
    private final o mUserProvider$delegate;
    private final o mXChangeProvider$delegate;
    private final MutableStateFlow<Boolean> uuidState;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements kv.a {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3443invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3443invoke() {
            AbstractCore.this.uuidState.compareAndSet(Boolean.FALSE, Boolean.TRUE);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = AbstractCore.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            aCLogger.e(tag, ">><< loadUserID :: error", it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$acceptAll$1", f = "AbstractCore.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35991 extends n implements p {
        final /* synthetic */ boolean $excludeGeoloc;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractCore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35991(boolean z10, AbstractCore abstractCore, d<? super C35991> dVar) {
            super(2, dVar);
            this.$excludeGeoloc = z10;
            this.this$0 = abstractCore;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C35991 c35991 = new C35991(this.$excludeGeoloc, this.this$0, dVar);
            c35991.L$0 = obj;
            return c35991;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AllowAll allowAll;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.$excludeGeoloc) {
                    allowAll = new AllowAll(this.this$0.tryToExtractPurposeGeolocFrom(this.this$0.getMStateDao().getTemporaryState()));
                } else {
                    allowAll = new AllowAll(null, 1, null);
                }
                this.label = 1;
                if (flowCollector.emit(allowAll, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super AllowAll> flowCollector, d<? super x0> dVar) {
            return ((C35991) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$acceptAll$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAll$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36002 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36002(d<? super C36002> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36002 c36002 = AbstractCore.this.new C36002(dVar);
            c36002.L$0 = obj;
            return c36002;
        }

        @Override // kv.p
        public final Object invoke(AllowAll allowAll, d<? super Flow<State>> dVar) {
            return ((C36002) create(allowAll, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return AbstractCore.this.getMConsentProvider().dispatch((AllowAll) this.L$0, AbstractCore.this.getMNoticeListeners());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$1", f = "AbstractCore.kt", i = {}, l = {409}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36011 extends n implements p {
        final /* synthetic */ boolean $excludeGeoloc;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractCore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36011(boolean z10, AbstractCore abstractCore, d<? super C36011> dVar) {
            super(2, dVar);
            this.$excludeGeoloc = z10;
            this.this$0 = abstractCore;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36011 c36011 = new C36011(this.$excludeGeoloc, this.this$0, dVar);
            c36011.L$0 = obj;
            return c36011;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AllowAll allowAll;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.$excludeGeoloc) {
                    allowAll = new AllowAll(this.this$0.tryToExtractPurposeGeolocFrom(this.this$0.getMStateDao().getTemporaryState()));
                } else {
                    allowAll = new AllowAll(null, 1, null);
                }
                this.label = 1;
                if (flowCollector.emit(allowAll, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super AllowAll> flowCollector, d<? super x0> dVar) {
            return ((C36011) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36022 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36022(d<? super C36022> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36022 c36022 = AbstractCore.this.new C36022(dVar);
            c36022.L$0 = obj;
            return c36022;
        }

        @Override // kv.p
        public final Object invoke(AllowAll allowAll, d<? super Flow<State>> dVar) {
            return ((C36022) create(allowAll, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return AbstractCore.this.getMConsentProvider().dispatch((AllowAll) this.L$0, AbstractCore.this.getMNoticeListeners());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36031 extends f0 implements l {
        public static final C36031 INSTANCE = new C36031();

        public C36031() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$2", f = "AbstractCore.kt", i = {}, l = {837}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36042 extends n implements p {
        final /* synthetic */ l $callback;
        final /* synthetic */ l $error;
        final /* synthetic */ String $lastCmpHash;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$2$1", f = "AbstractCore.kt", i = {}, l = {833}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractCore abstractCore, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (d<? super Flow<HelloReply>>) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) throws Exception {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    ConsentRepository mConsentRepository = this.this$0.getMConsentRepository();
                    this.label = 1;
                    obj = mConsentRepository.checkForUpdateWithCache(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                return FlowKt.flowOf(obj);
            }

            public final Object invoke(boolean z10, d<? super Flow<HelloReply>> dVar) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$2$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$checkForUpdate$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C04922 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04922(l lVar, d<? super C04922> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
                C04922 c04922 = new C04922(this.$error, dVar);
                c04922.L$0 = th2;
                return c04922.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36042(l lVar, String str, l lVar2, d<? super C36042> dVar) {
            super(2, dVar);
            this.$error = lVar;
            this.$lastCmpHash = str;
            this.$callback = lVar2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36042(this.$error, this.$lastCmpHash, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flowOn(FlowKt.flatMapConcat(AbstractCore.this.getMConsentProvider().isSyncNeeded() ? AbstractCore.this.getMConsentRepository().saveConsents(AbstractCore.this.getMNoticeListeners()) : FlowKt.flowOf(b.boxBoolean(true)), new AnonymousClass1(AbstractCore.this, null)), Dispatchers.getIO()), new C04922(this.$error, null));
                final String str = this.$lastCmpHash;
                final AbstractCore abstractCore = AbstractCore.this;
                final l lVar = this.$callback;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.checkForUpdate.2.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((HelloReply) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(HelloReply helloReply, d<? super x0> dVar) {
                        ACLogger aCLogger = ACLogger.INSTANCE;
                        String tag = AbstractCore.tag;
                        e0.checkNotNullExpressionValue(tag, "tag");
                        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag, "TRACE OLD hash: " + str, null, 4, null);
                        boolean z10 = !e0.areEqual(helloReply.getCmpHash(), str) || abstractCore.needUserConsents();
                        abstractCore.getMConsentProvider().setNeedToUpdate(z10);
                        lVar.invoke(b.boxBoolean(z10));
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36042) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$firstLaunch$1", f = "AbstractCore.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$firstLaunch$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36051 extends n implements p {
        final /* synthetic */ kv.a $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36051(kv.a aVar, d<? super C36051> dVar) {
            super(2, dVar);
            this.$onReady = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36051(this.$onReady, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = AbstractCore.this.uuidState;
                final AbstractCore abstractCore = AbstractCore.this;
                final kv.a aVar = this.$onReady;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.firstLaunch.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        if (z10) {
                            abstractCore.checkUUIDAndGDPRAreReady(aVar);
                        }
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (mutableStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C36051) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$firstLaunch$2", f = "AbstractCore.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$firstLaunch$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36062 extends n implements p {
        final /* synthetic */ kv.a $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36062(kv.a aVar, d<? super C36062> dVar) {
            super(2, dVar);
            this.$onReady = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36062(this.$onReady, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = AbstractCore.this.get_isGDPRState$appconsent_core_prodXchangeRelease();
                final AbstractCore abstractCore = AbstractCore.this;
                final kv.a aVar = this.$onReady;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.firstLaunch.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        if (z10) {
                            abstractCore.checkUUIDAndGDPRAreReady(aVar);
                        }
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (mutableStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C36062) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getConfiguration$1", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36071 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36071(d<? super C36071> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36071 c36071 = AbstractCore.this.new C36071(dVar);
            c36071.L$0 = obj;
            return c36071;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Configuration configurationFromAssets;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                HelloReply helloReply = AbstractCore.this.getMConfigurationProvider().getHelloReply();
                if (helloReply == null || (configurationFromAssets = helloReply.getConfiguration()) == null) {
                    configurationFromAssets = AbstractCore.this.getMConfigDao().getConfigurationFromAssets();
                }
                this.label = 1;
                if (flowCollector.emit(configurationFromAssets, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super Configuration> flowCollector, d<? super x0> dVar) {
            return ((C36071) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getConfigurationFromServer$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getConfigurationFromServer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36081 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getConfigurationFromServer$1$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getConfigurationFromServer$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04941 extends n implements p {
            final /* synthetic */ Throwable $error;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04941(AbstractCore abstractCore, Throwable th2, d<? super C04941> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
                this.$error = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C04941(this.this$0, this.$error, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> mNoticeListeners = this.this$0.getMNoticeListeners();
                Throwable th2 = this.$error;
                Iterator<T> it = mNoticeListeners.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.ConsentError(th2));
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C04941) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public C36081(d<? super C36081> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C04941(AbstractCore.this, th2, null), 3, null);
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Configuration> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36081 c36081 = AbstractCore.this.new C36081(dVar);
            c36081.L$0 = th2;
            return c36081.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getCountryFromRemote$2", f = "AbstractCore.kt", i = {}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getCountryFromRemote$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36092 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getCountryFromRemote$2$1", f = "AbstractCore.kt", i = {}, l = {EventTypeExtended.EVENT_TYPE_EXTENDED_LURL_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getCountryFromRemote$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            private /* synthetic */ Object L$0;
            int label;

            public AnonymousClass1(d<? super AnonymousClass1> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    HelloReply helloReply = new HelloReply((ErrorResponse) null, (String) null, (Configuration) null, (Consent) null, (VendorList) null, (Integer) null, (String) null, (String) null, (Integer) null, (FloatingConsent) null, (CountryProto) null, 2047, (u) null);
                    this.label = 1;
                    if (flowCollector.emit(helloReply, this) == coroutine_suspended) {
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

            @Override // kv.q
            public final Object invoke(FlowCollector<? super HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
                anonymousClass1.L$0 = flowCollector;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        public C36092(d<? super C36092> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36092 c36092 = AbstractCore.this.new C36092(dVar);
            c36092.L$0 = obj;
            return c36092;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowM5171catch = FlowKt.m5171catch(AbstractCore.this.getMConsentRepository().getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache(), new AnonymousClass1(null));
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.getCountryFromRemote.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((HelloReply) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(HelloReply helloReply, d<? super x0> dVar) {
                        Object objEmit = flowCollector.emit(helloReply, dVar);
                        return objEmit == e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector2, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super HelloReply> flowCollector, d<? super x0> dVar) {
            return ((C36092) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36101 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$1$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04961 extends n implements p {
            final /* synthetic */ List<Consentable> $consentables;
            final /* synthetic */ Throwable $error;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04961(AbstractCore abstractCore, List<Consentable> list, Throwable th2, d<? super C04961> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
                this.$consentables = list;
                this.$error = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C04961(this.this$0, this.$consentables, this.$error, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> mNoticeListeners = this.this$0.getMNoticeListeners();
                Throwable th2 = this.$error;
                Iterator<T> it = mNoticeListeners.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.LoadingError(th2));
                }
                List<Consentable> list = this.$consentables;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((Consentable) it2.next()).isGeolocation()) {
                            List<AppConsentLocationListener> mLocationListeners = this.this$0.getMLocationListeners();
                            Throwable th3 = this.$error;
                            Iterator<T> it3 = mLocationListeners.iterator();
                            while (it3.hasNext()) {
                                ((AppConsentLocationListener) it3.next()).onError(new AppConsentError.LoadingError(th3));
                            }
                        }
                    }
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C04961) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public C36101(d<? super C36101> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C04961(AbstractCore.this, StateExtsKt.getConsentables(AbstractCore.this.getMStateDao().getTemporaryState()), th2, null), 3, null);
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36101 c36101 = AbstractCore.this.new C36101(dVar);
            c36101.L$0 = th2;
            return c36101.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getNotice$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36111 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getNotice$1$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04971 extends n implements p {
            final /* synthetic */ List<Consentable> $consentables;
            final /* synthetic */ Throwable $error;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04971(AbstractCore abstractCore, List<Consentable> list, Throwable th2, d<? super C04971> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
                this.$consentables = list;
                this.$error = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C04971(this.this$0, this.$consentables, this.$error, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> mNoticeListeners = this.this$0.getMNoticeListeners();
                Throwable th2 = this.$error;
                Iterator<T> it = mNoticeListeners.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.LoadingError(th2));
                }
                List<Consentable> list = this.$consentables;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((Consentable) it2.next()).isGeolocation()) {
                            List<AppConsentLocationListener> mLocationListeners = this.this$0.getMLocationListeners();
                            Throwable th3 = this.$error;
                            Iterator<T> it3 = mLocationListeners.iterator();
                            while (it3.hasNext()) {
                                ((AppConsentLocationListener) it3.next()).onError(new AppConsentError.LoadingError(th3));
                            }
                        }
                    }
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C04971) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public C36111(d<? super C36111> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C04971(AbstractCore.this, StateExtsKt.getConsentables(AbstractCore.this.getMStateDao().getTemporaryState()), th2, null), 3, null);
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36111 c36111 = AbstractCore.this.new C36111(dVar);
            c36111.L$0 = th2;
            return c36111.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getNotice$3", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            throw ((Throwable) this.L$0);
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
            anonymousClass3.L$0 = th2;
            return anonymousClass3.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements l {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void invoke(Notice it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Notice) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f0 implements l {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getNotice$6", f = "AbstractCore.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$6, reason: invalid class name */
    public static final class AnonymousClass6 extends n implements p {
        final /* synthetic */ l $error;
        final /* synthetic */ l $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getNotice$6$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(l lVar, l lVar2, d<? super AnonymousClass6> dVar) {
            super(2, dVar);
            this.$error = lVar;
            this.$success = lVar2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new AnonymousClass6(this.$error, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(AbstractCore.getNotice$default(AbstractCore.this, false, 1, null), new AnonymousClass1(this.$error, null));
                final l lVar = this.$success;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.getNotice.6.2
                    public final Object emit(Notice notice, d<? super x0> dVar) {
                        lVar.invoke(notice);
                        return x0.f87415a;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Notice) obj2, (d<? super x0>) dVar);
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((AnonymousClass6) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36122 extends f0 implements l {
        public static final C36122 INSTANCE = new C36122();

        public C36122() {
            super(1);
        }

        public final void invoke(RemoteTheme it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RemoteTheme) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36133 extends f0 implements l {
        public static final C36133 INSTANCE = new C36133();

        public C36133() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$4", f = "AbstractCore.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$4, reason: invalid class name and case insensitive filesystem */
    public static final class C36144 extends n implements p {
        final /* synthetic */ l $error;
        final /* synthetic */ l $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$4$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super RemoteTheme> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36144(l lVar, l lVar2, d<? super C36144> dVar) {
            super(2, dVar);
            this.$error = lVar;
            this.$success = lVar2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36144(this.$error, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(AbstractCore.this.getRemoteTheme(), new AnonymousClass1(this.$error, null));
                final l lVar = this.$success;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.getRemoteTheme.4.2
                    public final Object emit(RemoteTheme remoteTheme, d<? super x0> dVar) {
                        lVar.invoke(remoteTheme);
                        return x0.f87415a;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((RemoteTheme) obj2, (d<? super x0>) dVar);
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36144) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$1", f = "AbstractCore.kt", i = {}, l = {328}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36151 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36151(d<? super C36151> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36151 c36151 = AbstractCore.this.new C36151(dVar);
            c36151.L$0 = obj;
            return c36151;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Configuration configurationFromAssets = AbstractCore.this.getMConfigDao().getConfigurationFromAssets();
                this.label = 1;
                if (flowCollector.emit(configurationFromAssets, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super Configuration> flowCollector, d<? super x0> dVar) {
            return ((C36151) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getVendorExpiration$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getVendorExpiration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36161 extends n implements q {
        int label;

        public C36161(d<? super C36161> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th2, d<? super x0> dVar) {
            return new C36161(dVar).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$loadGDPRCountry$1", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$loadGDPRCountry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36171 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36171(d<? super C36171> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36171 c36171 = AbstractCore.this.new C36171(dVar);
            c36171.L$0 = obj;
            return c36171;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    final AbstractCore abstractCore = AbstractCore.this;
                    int i11 = z.f87419c;
                    Flow flowM5171catch = FlowKt.m5171catch(abstractCore.getMConsentRepository().getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache(), new AbstractCore$loadGDPRCountry$1$1$1(abstractCore, null));
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore$loadGDPRCountry$1$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                            return emit((HelloReply) obj2, (d<? super x0>) dVar);
                        }

                        public final Object emit(HelloReply helloReply, d<? super x0> dVar) {
                            abstractCore.get_isGDPRState$appconsent_core_prodXchangeRelease().compareAndSet(b.boxBoolean(false), b.boxBoolean(true));
                            ACLogger aCLogger = ACLogger.INSTANCE;
                            String tag = AbstractCore.tag;
                            e0.checkNotNullExpressionValue(tag, "tag");
                            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag, "<< loadGDPRCountry", null, 4, null);
                            return x0.f87415a;
                        }
                    };
                    this.label = 1;
                    if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                z.m7131constructorimpl(x0Var);
            } catch (Throwable th2) {
                int i12 = z.f87419c;
                z.m7131constructorimpl(a0.createFailure(th2));
            }
            AbstractCore.this.get_isGDPRState$appconsent_core_prodXchangeRelease().compareAndSet(b.boxBoolean(false), b.boxBoolean(true));
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = AbstractCore.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag, "<< loadGDPRCountry (secure)", null, 4, null);
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C36171) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$loadUserID$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36181 extends f0 implements kv.a {
        public static final C36181 INSTANCE = new C36181();

        public C36181() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3444invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3444invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$loadUserID$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36192 extends f0 implements l {
        public static final C36192 INSTANCE = new C36192();

        public C36192() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$loadUserID$3", f = "AbstractCore.kt", i = {}, l = {IronSourceError.ERROR_RV_EXPIRED_ADS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$loadUserID$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36203 extends n implements p {
        final /* synthetic */ l $error;
        final /* synthetic */ kv.a $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$loadUserID$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$loadUserID$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super x0> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36203(l lVar, kv.a aVar, d<? super C36203> dVar) {
            super(2, dVar);
            this.$error = lVar;
            this.$success = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36203(this.$error, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AbstractCore abstractCore = AbstractCore.this;
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flowOn(abstractCore.checkAdId(abstractCore.getContext()), Dispatchers.getDefault()), new AnonymousClass1(this.$error, null));
                final kv.a aVar = this.$success;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.loadUserID.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((x0) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(x0 x0Var, d<? super x0> dVar) {
                        aVar.invoke();
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36203) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$refuseAll$1", f = "AbstractCore.kt", i = {}, l = {494}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36211 extends n implements p {
        final /* synthetic */ boolean $continueWithoutAccepting;
        final /* synthetic */ boolean $excludeGeoloc;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractCore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36211(boolean z10, boolean z11, AbstractCore abstractCore, d<? super C36211> dVar) {
            super(2, dVar);
            this.$continueWithoutAccepting = z10;
            this.$excludeGeoloc = z11;
            this.this$0 = abstractCore;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36211 c36211 = new C36211(this.$continueWithoutAccepting, this.$excludeGeoloc, this.this$0, dVar);
            c36211.L$0 = obj;
            return c36211;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Models.Consent.EnumConsentType enumConsentType = this.$continueWithoutAccepting ? Models.Consent.EnumConsentType.CONTINUE_WITHOUT_ACCEPTING : null;
                DenyAll denyAll = this.$excludeGeoloc ? new DenyAll(this.this$0.tryToExtractPurposeGeolocFrom(this.this$0.getMStateDao().getTemporaryState()), enumConsentType) : new DenyAll(null, enumConsentType, 1, null);
                this.label = 1;
                if (flowCollector.emit(denyAll, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super DenyAll> flowCollector, d<? super x0> dVar) {
            return ((C36211) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$refuseAll$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAll$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36222 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36222(d<? super C36222> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36222 c36222 = AbstractCore.this.new C36222(dVar);
            c36222.L$0 = obj;
            return c36222;
        }

        @Override // kv.p
        public final Object invoke(DenyAll denyAll, d<? super Flow<State>> dVar) {
            return ((C36222) create(denyAll, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return AbstractCore.this.getMConsentProvider().dispatch((DenyAll) this.L$0, AbstractCore.this.getMNoticeListeners());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$1", f = "AbstractCore.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36231 extends n implements p {
        final /* synthetic */ boolean $continueWithoutAccepting;
        final /* synthetic */ boolean $excludeGeoloc;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractCore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36231(boolean z10, boolean z11, AbstractCore abstractCore, d<? super C36231> dVar) {
            super(2, dVar);
            this.$continueWithoutAccepting = z10;
            this.$excludeGeoloc = z11;
            this.this$0 = abstractCore;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36231 c36231 = new C36231(this.$continueWithoutAccepting, this.$excludeGeoloc, this.this$0, dVar);
            c36231.L$0 = obj;
            return c36231;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Models.Consent.EnumConsentType enumConsentType = this.$continueWithoutAccepting ? Models.Consent.EnumConsentType.CONTINUE_WITHOUT_ACCEPTING : null;
                DenyAll denyAll = this.$excludeGeoloc ? new DenyAll(this.this$0.tryToExtractPurposeGeolocFrom(this.this$0.getMStateDao().getTemporaryState()), enumConsentType) : new DenyAll(null, enumConsentType, 1, null);
                this.label = 1;
                if (flowCollector.emit(denyAll, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super DenyAll> flowCollector, d<? super x0> dVar) {
            return ((C36231) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36242 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36242(d<? super C36242> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36242 c36242 = AbstractCore.this.new C36242(dVar);
            c36242.L$0 = obj;
            return c36242;
        }

        @Override // kv.p
        public final Object invoke(DenyAll denyAll, d<? super Flow<State>> dVar) {
            return ((C36242) create(denyAll, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return AbstractCore.this.getMConsentProvider().dispatch((DenyAll) this.L$0, AbstractCore.this.getMNoticeListeners());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36251 extends n implements p {
        /* synthetic */ boolean Z$0;
        int label;

        public C36251(d<? super C36251> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36251 c36251 = AbstractCore.this.new C36251(dVar);
            c36251.Z$0 = ((Boolean) obj).booleanValue();
            return c36251;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (d<? super Flow<Boolean>>) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            final boolean z10 = this.Z$0;
            final Flow flowDispatch$default = ConsentProvider.dispatch$default(AbstractCore.this.getMConsentProvider(), ResetEvents.INSTANCE, null, 2, null);
            final AbstractCore abstractCore = AbstractCore.this;
            return new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ boolean $isSaved$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ AbstractCore this$0;

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore, boolean z10) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = abstractCore;
                        this.$isSaved$inlined = z10;
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
                            boolean r0 = r7 instanceof com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            tu.a0.throwOnFailure(r7)
                            goto L5f
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            tu.a0.throwOnFailure(r7)
                            kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                            com.sfbx.appconsent.core.model.reducer.State r6 = (com.sfbx.appconsent.core.model.reducer.State) r6
                            com.sfbx.appconsent.core.business.AbstractCore r2 = r5.this$0
                            io.sfbx.appconsent.core.gcm.modal.Consent r2 = com.sfbx.appconsent.core.business.AbstractCore.access$buildConsentToGCM(r2, r6)
                            com.sfbx.appconsent.core.business.AbstractCore r4 = r5.this$0
                            io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract r4 = r4.getGcmRepository()
                            r4.defineGCMStatusFromPurpose(r2)
                            com.sfbx.appconsent.core.business.AbstractCore r2 = r5.this$0
                            com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                            r2.save(r6)
                            boolean r6 = r5.$isSaved$inlined
                            java.lang.Boolean r6 = bv.b.boxBoolean(r6)
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L5f
                            return r1
                        L5f:
                            tu.x0 r6 = tu.x0.f87415a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                    Object objCollect = flowDispatch$default.collect(new AnonymousClass2(flowCollector, abstractCore, z10), dVar);
                    return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                }
            };
        }

        public final Object invoke(boolean z10, d<? super Flow<Boolean>> dVar) {
            return ((C36251) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$3", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36263 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Throwable $error;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractCore abstractCore, Throwable th2, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
                this.$error = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$error, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> mNoticeListeners = this.this$0.getMNoticeListeners();
                Throwable th2 = this.$error;
                Iterator<T> it = mNoticeListeners.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.ConsentError(th2));
                }
                List<Consentable> consentables = StateExtsKt.getConsentables(this.this$0.getMStateDao().getTemporaryState());
                if (!(consentables instanceof Collection) || !consentables.isEmpty()) {
                    Iterator<T> it2 = consentables.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((Consentable) it2.next()).isGeolocation()) {
                            List<AppConsentLocationListener> mLocationListeners = this.this$0.getMLocationListeners();
                            Throwable th3 = this.$error;
                            Iterator<T> it3 = mLocationListeners.iterator();
                            while (it3.hasNext()) {
                                ((AppConsentLocationListener) it3.next()).onError(new AppConsentError.ConsentError(th3));
                            }
                        }
                    }
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public C36263(d<? super C36263> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AnonymousClass1(AbstractCore.this, th2, null), 3, null);
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36263 c36263 = AbstractCore.this.new C36263(dVar);
            c36263.L$0 = th2;
            return c36263.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$4, reason: invalid class name and case insensitive filesystem */
    public static final class C36274 extends f0 implements l {
        public static final C36274 INSTANCE = new C36274();

        public C36274() {
            super(1);
        }

        public final void invoke(boolean z10) {
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$5, reason: invalid class name and case insensitive filesystem */
    public static final class C36285 extends f0 implements l {
        public static final C36285 INSTANCE = new C36285();

        public C36285() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$6", f = "AbstractCore.kt", i = {}, l = {TTAdConstant.STYLE_SIZE_RADIO_9_16}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$6, reason: invalid class name and case insensitive filesystem */
    public static final class C36296 extends n implements p {
        final /* synthetic */ l $complete;
        final /* synthetic */ l $error;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$6$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36296(l lVar, l lVar2, d<? super C36296> dVar) {
            super(2, dVar);
            this.$error = lVar;
            this.$complete = lVar2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36296(this.$error, this.$complete, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(AbstractCore.saveConsents$default(AbstractCore.this, false, 1, null), new AnonymousClass1(this.$error, null));
                final l lVar = this.$complete;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.saveConsents.6.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        lVar.invoke(b.boxBoolean(z10));
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36296) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36301 extends f0 implements kv.a {
        public static final C36301 INSTANCE = new C36301();

        public C36301() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3445invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3445invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveExternalIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36312 extends f0 implements l {
        public static final C36312 INSTANCE = new C36312();

        public C36312() {
            super(1);
        }

        public final void invoke(Throwable th2) {
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveExternalIds$3", f = "AbstractCore.kt", i = {}, l = {980}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveExternalIds$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36323 extends n implements p {
        final /* synthetic */ l $failed;
        final /* synthetic */ kv.a $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveExternalIds$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveExternalIds$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $failed;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractCore abstractCore, l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.this$0 = abstractCore;
                this.$failed = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.L$0;
                Iterator<T> it = this.this$0.getMNoticeListeners().iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.SaveExternalIdsCachedError(th2));
                }
                this.$failed.invoke(new Throwable(th2));
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super AcError.ErrorResponse> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$failed, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36323(l lVar, kv.a aVar, d<? super C36323> dVar) {
            super(2, dVar);
            this.$failed = lVar;
            this.$success = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36323(this.$failed, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(AbstractCore.this.getMConsentRepository().saveExternalIds(), new AnonymousClass1(AbstractCore.this, this.$failed, null));
                final kv.a aVar = this.$success;
                final l lVar = this.$failed;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.saveExternalIds.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((AcError.ErrorResponse) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(AcError.ErrorResponse errorResponse, d<? super x0> dVar) {
                        if (e0.areEqual(errorResponse, AcError.ErrorResponse.getDefaultInstance())) {
                            aVar.invoke();
                        } else {
                            lVar.invoke(new Throwable(errorResponse.getDescription()));
                        }
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36323) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36331 extends f0 implements kv.a {
        public static final C36331 INSTANCE = new C36331();

        public C36331() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3446invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3446invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveFloatingPurposes$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36342 extends f0 implements l {
        public static final C36342 INSTANCE = new C36342();

        public C36342() {
            super(1);
        }

        public final void invoke(Throwable th2) {
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveFloatingPurposes$3", f = "AbstractCore.kt", i = {}, l = {C3227g4.f36758l}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveFloatingPurposes$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36353 extends n implements p {
        final /* synthetic */ l $failed;
        final /* synthetic */ kv.a $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveFloatingPurposes$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveFloatingPurposes$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $failed;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractCore abstractCore, l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.this$0 = abstractCore;
                this.$failed = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.L$0;
                Iterator<T> it = this.this$0.getMNoticeListeners().iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.SaveFloatingPurposesCachedError(th2));
                }
                this.$failed.invoke(th2);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super AcError.ErrorResponse> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$failed, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36353(l lVar, kv.a aVar, d<? super C36353> dVar) {
            super(2, dVar);
            this.$failed = lVar;
            this.$success = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36353(this.$failed, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowFlowOn = FlowKt.flowOn(FlowKt.m5171catch(AbstractCore.this.getMConsentRepository().saveFloatingPurpose(), new AnonymousClass1(AbstractCore.this, this.$failed, null)), Dispatchers.getIO());
                final AbstractCore abstractCore = AbstractCore.this;
                final kv.a aVar = this.$success;
                final l lVar = this.$failed;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.saveFloatingPurposes.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((AcError.ErrorResponse) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(AcError.ErrorResponse errorResponse, d<? super x0> dVar) {
                        if (e0.areEqual(errorResponse, AcError.ErrorResponse.getDefaultInstance())) {
                            abstractCore.getMConsentProvider().removeSaveFloatingTime();
                            aVar.invoke();
                        } else {
                            lVar.invoke(new Throwable(errorResponse.getDescription()));
                        }
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36353) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$sendNewTracking$1", f = "AbstractCore.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$sendNewTracking$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36361 extends n implements p {
        final /* synthetic */ Track $trackingValue;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$sendNewTracking$1$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$sendNewTracking$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04981 extends n implements q {
            /* synthetic */ Object L$0;
            int label;

            public C04981(d<? super C04981> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.L$0;
                ACLogger aCLogger = ACLogger.INSTANCE;
                String tag = AbstractCore.tag;
                e0.checkNotNullExpressionValue(tag, "tag");
                aCLogger.e(tag, "Unexpected Exception occurred", th2);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super State> flowCollector, Throwable th2, d<? super x0> dVar) {
                C04981 c04981 = new C04981(dVar);
                c04981.L$0 = th2;
                return c04981.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36361(Track track, d<? super C36361> dVar) {
            super(2, dVar);
            this.$trackingValue = track;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36361(this.$trackingValue, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(ConsentProvider.dispatch$default(AbstractCore.this.getMConsentProvider(), this.$trackingValue, null, 2, null), new C04981(null));
                this.label = 1;
                if (FlowKt.collect(flowM5171catch, this) == coroutine_suspended) {
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
            return ((C36361) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36371 extends f0 implements kv.a {
        public static final C36371 INSTANCE = new C36371();

        public C36371() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3447invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3447invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36382 extends f0 implements l {
        public static final C36382 INSTANCE = new C36382();

        public C36382() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3", f = "AbstractCore.kt", i = {}, l = {702}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36393 extends n implements p {
        final /* synthetic */ Map<Integer, ConsentStatus> $consents;
        final /* synthetic */ l $error;
        final /* synthetic */ kv.a $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Map<Integer, ConsentStatus> $consents;
            int label;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$1$1", f = "AbstractCore.kt", i = {0}, l = {689}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C04991 extends n implements p {
                final /* synthetic */ Map<Integer, ConsentStatus> $consents;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C04991(Map<Integer, ? extends ConsentStatus> map, d<? super C04991> dVar) {
                    super(2, dVar);
                    this.$consents = map;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    C04991 c04991 = new C04991(this.$consents, dVar);
                    c04991.L$0 = obj;
                    return c04991;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Iterator<Integer> it;
                    FlowCollector flowCollector;
                    Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                        it = this.$consents.keySet().iterator();
                        flowCollector = flowCollector2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.L$1;
                        flowCollector = (FlowCollector) this.L$0;
                        a0.throwOnFailure(obj);
                    }
                    while (it.hasNext()) {
                        Integer numBoxInt = b.boxInt(it.next().intValue());
                        this.L$0 = flowCollector;
                        this.L$1 = it;
                        this.label = 1;
                        if (flowCollector.emit(numBoxInt, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return x0.f87415a;
                }

                @Override // kv.p
                public final Object invoke(FlowCollector<? super Integer> flowCollector, d<? super x0> dVar) {
                    return ((C04991) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Map<Integer, ? extends ConsentStatus> map, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$consents = map;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$consents, dVar);
            }

            @Override // kv.p
            public final Object invoke(Notice notice, d<? super Flow<Integer>> dVar) {
                return ((AnonymousClass1) create(notice, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return FlowKt.flow(new C04991(this.$consents, null));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            final /* synthetic */ Map<Integer, ConsentStatus> $consents;
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$2$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements p {
                final /* synthetic */ Map<Integer, ConsentStatus> $consents;
                final /* synthetic */ int $iabId;
                int label;
                final /* synthetic */ AbstractCore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(int i10, Map<Integer, ? extends ConsentStatus> map, AbstractCore abstractCore, d<? super AnonymousClass1> dVar) {
                    super(2, dVar);
                    this.$iabId = i10;
                    this.$consents = map;
                    this.this$0 = abstractCore;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new AnonymousClass1(this.$iabId, this.$consents, this.this$0, dVar);
                }

                @Override // kv.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (d<? super Flow<Boolean>>) obj2);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    e.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return this.$iabId == ((Number) y0.last(this.$consents.keySet())).intValue() ? this.this$0.saveConsents(false) : FlowKt.emptyFlow();
                }

                public final Object invoke(boolean z10, d<? super Flow<Boolean>> dVar) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(AbstractCore abstractCore, Map<Integer, ? extends ConsentStatus> map, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
                this.$consents = map;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$consents, dVar);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i10, d<? super Flow<Boolean>> dVar) {
                return ((AnonymousClass2) create(Integer.valueOf(i10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object next;
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                int i10 = this.I$0;
                Iterator<T> it = this.this$0.getConsentablesInCache().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Integer iabId = ((Consentable) next).getIabId();
                    if (iabId != null && iabId.intValue() == i10) {
                        break;
                    }
                }
                Consentable consentable = (Consentable) next;
                int id2 = consentable != null ? consentable.getId() : -1;
                AbstractCore abstractCore = this.this$0;
                ConsentStatus consentStatus = this.$consents.get(b.boxInt(i10));
                if (consentStatus == null) {
                    consentStatus = ConsentStatus.UNDEFINED;
                }
                return FlowKt.flatMapConcat(AbstractCore.setConsentableStatus$default(abstractCore, id2, consentStatus, false, 4, null), new AnonymousClass1(i10, this.$consents, this.this$0, null));
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (d<? super Flow<Boolean>>) obj2);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$3", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableConsents$3$3, reason: invalid class name and collision with other inner class name */
        public static final class C05003 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05003(l lVar, d<? super C05003> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05003 c05003 = new C05003(this.$error, dVar);
                c05003.L$0 = th2;
                return c05003.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C36393(Map<Integer, ? extends ConsentStatus> map, l lVar, kv.a aVar, d<? super C36393> dVar) {
            super(2, dVar);
            this.$consents = map;
            this.$error = lVar;
            this.$success = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36393(this.$consents, this.$error, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flowOn(FlowKt.flatMapConcat(FlowKt.flatMapConcat(AbstractCore.getNotice$default(AbstractCore.this, false, 1, null), new AnonymousClass1(this.$consents, null)), new AnonymousClass2(AbstractCore.this, this.$consents, null)), Dispatchers.getDefault()), new C05003(this.$error, null));
                final kv.a aVar = this.$success;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.setConsentableConsents.3.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        aVar.invoke();
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36393) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36401 extends f0 implements kv.a {
        public static final C36401 INSTANCE = new C36401();

        public C36401() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3448invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3448invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36412 extends f0 implements l {
        public static final C36412 INSTANCE = new C36412();

        public C36412() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3", f = "AbstractCore.kt", i = {}, l = {737}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36423 extends n implements p {
        final /* synthetic */ Map<String, ConsentStatus> $consents;
        final /* synthetic */ l $error;
        final /* synthetic */ kv.a $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Map<String, ConsentStatus> $consents;
            int label;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$1$1", f = "AbstractCore.kt", i = {0}, l = {724}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05011 extends n implements p {
                final /* synthetic */ Map<String, ConsentStatus> $consents;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C05011(Map<String, ? extends ConsentStatus> map, d<? super C05011> dVar) {
                    super(2, dVar);
                    this.$consents = map;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    C05011 c05011 = new C05011(this.$consents, dVar);
                    c05011.L$0 = obj;
                    return c05011;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Iterator it;
                    FlowCollector flowCollector;
                    Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                        it = this.$consents.keySet().iterator();
                        flowCollector = flowCollector2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.L$1;
                        flowCollector = (FlowCollector) this.L$0;
                        a0.throwOnFailure(obj);
                    }
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        this.L$0 = flowCollector;
                        this.L$1 = it;
                        this.label = 1;
                        if (flowCollector.emit(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return x0.f87415a;
                }

                @Override // kv.p
                public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
                    return ((C05011) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Map<String, ? extends ConsentStatus> map, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$consents = map;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$consents, dVar);
            }

            @Override // kv.p
            public final Object invoke(Notice notice, d<? super Flow<String>> dVar) {
                return ((AnonymousClass1) create(notice, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return FlowKt.flow(new C05011(this.$consents, null));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$2", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            final /* synthetic */ Map<String, ConsentStatus> $consents;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AbstractCore this$0;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$2$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements p {
                final /* synthetic */ Map<String, ConsentStatus> $consents;
                final /* synthetic */ String $extraId;
                int label;
                final /* synthetic */ AbstractCore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(String str, Map<String, ? extends ConsentStatus> map, AbstractCore abstractCore, d<? super AnonymousClass1> dVar) {
                    super(2, dVar);
                    this.$extraId = str;
                    this.$consents = map;
                    this.this$0 = abstractCore;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new AnonymousClass1(this.$extraId, this.$consents, this.this$0, dVar);
                }

                @Override // kv.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (d<? super Flow<Boolean>>) obj2);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    e.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return e0.areEqual(this.$extraId, y0.last(this.$consents.keySet())) ? this.this$0.saveConsents(false) : FlowKt.emptyFlow();
                }

                public final Object invoke(boolean z10, d<? super Flow<Boolean>> dVar) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(AbstractCore abstractCore, Map<String, ? extends ConsentStatus> map, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = abstractCore;
                this.$consents = map;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$consents, dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object next;
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                String str = (String) this.L$0;
                Iterator<T> it = this.this$0.getConsentablesInCache().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (e0.areEqual(((Consentable) next).getExtraId(), str)) {
                        break;
                    }
                }
                Consentable consentable = (Consentable) next;
                int id2 = consentable != null ? consentable.getId() : -1;
                AbstractCore abstractCore = this.this$0;
                ConsentStatus consentStatus = this.$consents.get(str);
                if (consentStatus == null) {
                    consentStatus = ConsentStatus.UNDEFINED;
                }
                return FlowKt.flatMapConcat(AbstractCore.setConsentableStatus$default(abstractCore, id2, consentStatus, false, 4, null), new AnonymousClass1(str, this.$consents, this.this$0, null));
            }

            @Override // kv.p
            public final Object invoke(String str, d<? super Flow<Boolean>> dVar) {
                return ((AnonymousClass2) create(str, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$3", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setExtraConsentableConsents$3$3, reason: invalid class name and collision with other inner class name */
        public static final class C05023 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05023(l lVar, d<? super C05023> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05023 c05023 = new C05023(this.$error, dVar);
                c05023.L$0 = th2;
                return c05023.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C36423(Map<String, ? extends ConsentStatus> map, l lVar, kv.a aVar, d<? super C36423> dVar) {
            super(2, dVar);
            this.$consents = map;
            this.$error = lVar;
            this.$success = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36423(this.$consents, this.$error, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flowOn(FlowKt.flatMapConcat(FlowKt.flatMapConcat(AbstractCore.getNotice$default(AbstractCore.this, false, 1, null), new AnonymousClass1(this.$consents, null)), new AnonymousClass2(AbstractCore.this, this.$consents, null)), Dispatchers.getDefault()), new C05023(this.$error, null));
                final kv.a aVar = this.$success;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.setExtraConsentableConsents.3.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        aVar.invoke();
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C36423) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$syncData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36431 extends f0 implements kv.a {
        public static final C36431 INSTANCE = new C36431();

        public C36431() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3449invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3449invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$syncData$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36442 extends f0 implements l {
        public static final C36442 INSTANCE = new C36442();

        public C36442() {
            super(1);
        }

        public final void invoke(Throwable it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.business.AbstractCore$syncData$3", f = "AbstractCore.kt", i = {}, l = {946}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$syncData$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36453 extends n implements p {
        final /* synthetic */ l $error;
        final /* synthetic */ kv.a $success;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.business.AbstractCore$syncData$3$1", f = "AbstractCore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$syncData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements q {
            final /* synthetic */ l $error;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(l lVar, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.$error = lVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.$error.invoke((Throwable) this.L$0);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, dVar);
                anonymousClass1.L$0 = th2;
                return anonymousClass1.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36453(l lVar, kv.a aVar, d<? super C36453> dVar) {
            super(2, dVar);
            this.$error = lVar;
            this.$success = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AbstractCore.this.new C36453(this.$error, this.$success, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flowOn(AbstractCore.this.getMConsentProvider().isSyncNeeded() ? AbstractCore.this.getMConsentRepository().saveConsents(AbstractCore.this.getMNoticeListeners()) : FlowKt.emptyFlow(), Dispatchers.getDefault()), new AnonymousClass1(this.$error, null));
                final kv.a aVar = this.$success;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.sfbx.appconsent.core.business.AbstractCore.syncData.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super x0>) dVar);
                    }

                    public final Object emit(boolean z10, d<? super x0> dVar) {
                        aVar.invoke();
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowM5171catch.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            if (AbstractCore.this.getMConsentProvider().getSaveFloatingTime() != -1) {
                AbstractCore.saveFloatingPurposes$default(AbstractCore.this, null, null, 3, null);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C36453) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AbstractCore(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
        this.mStateDao$delegate = tu.q.lazy(AbstractCore$mStateDao$2.INSTANCE);
        this.mConfigDao$delegate = tu.q.lazy(AbstractCore$mConfigDao$2.INSTANCE);
        this.mConsentRepository$delegate = tu.q.lazy(AbstractCore$mConsentRepository$2.INSTANCE);
        this.mConsentProvider$delegate = tu.q.lazy(AbstractCore$mConsentProvider$2.INSTANCE);
        this.mUserProvider$delegate = tu.q.lazy(AbstractCore$mUserProvider$2.INSTANCE);
        this.mConfigurationProvider$delegate = tu.q.lazy(AbstractCore$mConfigurationProvider$2.INSTANCE);
        this.mXChangeProvider$delegate = tu.q.lazy(AbstractCore$mXChangeProvider$2.INSTANCE);
        this.gcmRepository$delegate = tu.q.lazy(AbstractCore$gcmRepository$2.INSTANCE);
        this.mNoticeListeners = new ArrayList();
        this.mLocationListeners = new ArrayList();
        this.mRequestLocationListeners = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this.uuidState = StateFlowKt.MutableStateFlow(bool);
        this._isGDPRState = StateFlowKt.MutableStateFlow(bool);
        CoreInjector.INSTANCE.init(context);
        loadUserID(new AnonymousClass1(), AnonymousClass2.INSTANCE);
        if (isConsentExpired()) {
            getMConsentProvider().clearConsents();
        }
        checkDataMigration();
        final State temporaryState = getMStateDao().getTemporaryState();
        this.mConsentListener$delegate = new nv.a(temporaryState) { // from class: com.sfbx.appconsent.core.business.AbstractCore$special$$inlined$observable$1
            @Override // nv.a
            public void afterChange(KProperty<?> property, State state, State state2) {
                e0.checkNotNullParameter(property, "property");
                boolean zGeolocationSet = StateExtsKt.geolocationSet(state2);
                if (zGeolocationSet) {
                    Iterator<T> it = this.getMLocationListeners().iterator();
                    while (it.hasNext()) {
                        ((AppConsentLocationListener) it.next()).onResult(zGeolocationSet);
                    }
                }
                Iterator<T> it2 = this.getMNoticeListeners().iterator();
                while (it2.hasNext()) {
                    ((AppConsentNoticeListener) it2.next()).onConsentGiven();
                }
            }
        };
    }

    public static /* synthetic */ Flow acceptAll$default(AbstractCore abstractCore, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptAll");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return abstractCore.acceptAll(z10);
    }

    public static /* synthetic */ Flow acceptAllAndQuit$default(AbstractCore abstractCore, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptAllAndQuit");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return abstractCore.acceptAllAndQuit(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.sfbx.appconsent.core.gcm.modal.Consent buildConsentToGCM(State state) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Iterator<T> it = state.getConsents().getVendors().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer iabId = ((VendorReducer) next).getIabId();
            if (iabId != null && iabId.intValue() == 755) {
                break;
            }
        }
        VendorReducer vendorReducer = (VendorReducer) next;
        List<ConsentableReducer> consentables = state.getConsents().getConsentables();
        boolean z10 = vendorReducer != null && vendorReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease();
        List<ConsentableReducer> list = consentables;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((ConsentableReducer) next2).getId() == 1) {
                break;
            }
        }
        ConsentableReducer consentableReducer = (ConsentableReducer) next2;
        boolean z11 = consentableReducer != null && consentableReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease();
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (((ConsentableReducer) next3).getId() == 3) {
                break;
            }
        }
        ConsentableReducer consentableReducer2 = (ConsentableReducer) next3;
        boolean z12 = consentableReducer2 != null && consentableReducer2.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease();
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            if (((ConsentableReducer) next4).getId() == 4) {
                break;
            }
        }
        ConsentableReducer consentableReducer3 = (ConsentableReducer) next4;
        boolean z13 = consentableReducer3 != null && consentableReducer3.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease();
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
            if (((ConsentableReducer) next5).getId() == 7) {
                break;
            }
        }
        ConsentableReducer consentableReducer4 = (ConsentableReducer) next5;
        boolean z14 = consentableReducer4 != null && consentableReducer4.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease();
        Iterator<T> it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next6 = it6.next();
            if (((ConsentableReducer) next6).getId() == 9) {
                obj = next6;
                break;
            }
        }
        ConsentableReducer consentableReducer5 = (ConsentableReducer) obj;
        return new io.sfbx.appconsent.core.gcm.modal.Consent(z10, z11, z12, z13, z14, consentableReducer5 != null && consentableReducer5.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<x0> checkAdId(Context context) {
        final Flow<String> flowLoadAdId = getMUserProvider().loadAdId(context);
        return FlowKt.flowOn(new Flow<x0>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, zu.d r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r14
                        com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1$2$1
                        r0.<init>(r14)
                    L18:
                        java.lang.Object r14 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        tu.x0 r3 = tu.x0.f87415a
                        r4 = 1
                        if (r2 == 0) goto L34
                        if (r2 != r4) goto L2c
                        tu.a0.throwOnFailure(r14)
                        goto Lc3
                    L2c:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L34:
                        tu.a0.throwOnFailure(r14)
                        kotlinx.coroutines.flow.FlowCollector r14 = r12.$this_unsafeFlow
                        java.lang.String r13 = (java.lang.String) r13
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r12.this$0
                        com.sfbx.appconsent.core.provider.UserProvider r2 = r2.getMUserProvider()
                        java.lang.String r2 = r2.getUserId()
                        io.sfbx.appconsent.logger.ACLogger r5 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                        java.lang.String r6 = com.sfbx.appconsent.core.business.AbstractCore.access$getTag$cp()
                        java.lang.String r11 = "tag"
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r11)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        java.lang.String r8 = "Previous Advertising ID used : "
                        r7.<init>(r8)
                        r7.append(r2)
                        java.lang.String r7 = r7.toString()
                        r9 = 4
                        r10 = 0
                        r8 = 0
                        io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r5, r6, r7, r8, r9, r10)
                        boolean r6 = sv.n0.isBlank(r2)
                        if (r6 == 0) goto L83
                        java.lang.String r6 = com.sfbx.appconsent.core.business.AbstractCore.access$getTag$cp()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r11)
                        r9 = 4
                        r10 = 0
                        java.lang.String r7 = "New Advertising set"
                        r8 = 0
                        io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r5, r6, r7, r8, r9, r10)
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r12.this$0
                        com.sfbx.appconsent.core.provider.UserProvider r2 = r2.getMUserProvider()
                        r2.setUserId(r13)
                        goto Lba
                    L83:
                        boolean r2 = kotlin.jvm.internal.e0.areEqual(r2, r13)
                        if (r2 != 0) goto Lab
                        java.lang.String r6 = com.sfbx.appconsent.core.business.AbstractCore.access$getTag$cp()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r11)
                        r9 = 4
                        r10 = 0
                        java.lang.String r7 = "We have detected a new Advertising ID, we resetting old consent!"
                        r8 = 0
                        io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r5, r6, r7, r8, r9, r10)
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r12.this$0
                        com.sfbx.appconsent.core.provider.ConsentProvider r2 = r2.getMConsentProvider()
                        r2.clearConsents()
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r12.this$0
                        com.sfbx.appconsent.core.provider.UserProvider r2 = r2.getMUserProvider()
                        r2.setUserId(r13)
                        goto Lba
                    Lab:
                        java.lang.String r6 = com.sfbx.appconsent.core.business.AbstractCore.access$getTag$cp()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r11)
                        r9 = 4
                        r10 = 0
                        java.lang.String r7 = "No change detected..."
                        r8 = 0
                        io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r5, r6, r7, r8, r9, r10)
                    Lba:
                        r0.label = r4
                        java.lang.Object r13 = r14.emit(r3, r0)
                        if (r13 != r1) goto Lc3
                        return r1
                    Lc3:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$checkAdId$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super x0> flowCollector, d dVar) {
                Object objCollect = flowLoadAdId.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    private final void checkDataMigration() {
        if (getMConsentProvider().getCmpSDKVersion() == 2) {
            int cmpSDKVersion = getMConsentProvider().getCmpSDKVersion();
            getMConsentProvider().setCmpSDKVersion(getMConsentProvider().getCmpSDKId());
            getMConsentProvider().setCmpSDKId(cmpSDKVersion);
        }
    }

    public static /* synthetic */ void checkForUpdate$default(AbstractCore abstractCore, l lVar, l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkForUpdate");
        }
        if ((i10 & 2) != 0) {
            lVar2 = C36031.INSTANCE;
        }
        abstractCore.checkForUpdate(lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUUIDAndGDPRAreReady(kv.a aVar) {
        if (this.uuidState.getValue().booleanValue() && this._isGDPRState.getValue().booleanValue()) {
            aVar.invoke();
            syncData$default(this, null, null, 3, null);
        }
    }

    private final Flow<Configuration> getConfiguration() {
        return FlowKt.flow(new C36071(null));
    }

    private final Flow<Configuration> getConfigurationFromServer(boolean z10) {
        return FlowKt.flowOn(FlowKt.m5171catch(getMConsentRepository().getConfigurationFromServer(z10, this.mNoticeListeners), new C36081(null)), Dispatchers.getDefault());
    }

    public static /* synthetic */ Flow getHelloReply$default(AbstractCore abstractCore, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHelloReply");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return abstractCore.getHelloReply(z10);
    }

    private final State getMConsentListener() {
        return (State) this.mConsentListener$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public static /* synthetic */ Flow getNotice$default(AbstractCore abstractCore, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotice");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return abstractCore.getNotice(z10);
    }

    public static /* synthetic */ void getRemoteTheme$default(AbstractCore abstractCore, l lVar, l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRemoteTheme");
        }
        if ((i10 & 1) != 0) {
            lVar = C36122.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar2 = C36133.INSTANCE;
        }
        abstractCore.getRemoteTheme(lVar, lVar2);
    }

    public static /* synthetic */ void get_isGDPRState$appconsent_core_prodXchangeRelease$annotations() {
    }

    private final boolean isConsentExpired() {
        return System.currentTimeMillis() > getMConsentProvider().getNoticeExpirationTime();
    }

    private final boolean isConsentableMatchDedicatedType(Consentable consentable) {
        return k0.contains(new ConsentableType[]{ConsentableType.PURPOSE, ConsentableType.EXTRA_PURPOSE, ConsentableType.SPECIAL_FEATURE, ConsentableType.EXTRA_SPECIAL_FEATURE}, consentable.getType());
    }

    private final void loadGDPRCountry() {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ">> loadGDPRCountry", null, 4, null);
        boolean zIsGDPRCacheObsolete = getMConsentRepository().isGDPRCacheObsolete();
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, o2.n(":: loadGDPRCountry :: Is LITE cache is obsolete ? ", zIsGDPRCacheObsolete), null, 4, null);
        boolean zIsGdprForcedByBOKeyPresent = getMConsentProvider().isGdprForcedByBOKeyPresent();
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, o2.n(":: loadGDPRCountry :: Is LITE cache has been already set ? ", zIsGdprForcedByBOKeyPresent), null, 4, null);
        if (zIsGDPRCacheObsolete || !zIsGdprForcedByBOKeyPresent) {
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: loadGDPRCountry :: We have to get value from BO", null, 4, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C36171(null), 3, null);
        } else {
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: loadGDPRCountry :: We already have LITE information", null, 4, null);
            this._isGDPRState.compareAndSet(Boolean.FALSE, Boolean.TRUE);
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "<< loadGDPRCountry", null, 4, null);
        }
    }

    private final void loadUserID(kv.a aVar, l lVar) {
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36203(lVar, aVar, null), 3, null);
    }

    public static /* synthetic */ void loadUserID$default(AbstractCore abstractCore, kv.a aVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUserID");
        }
        if ((i10 & 1) != 0) {
            aVar = C36181.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar = C36192.INSTANCE;
        }
        abstractCore.loadUserID(aVar, lVar);
    }

    public static /* synthetic */ Flow refuseAll$default(AbstractCore abstractCore, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refuseAll");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return abstractCore.refuseAll(z10, z11);
    }

    public static /* synthetic */ Flow refuseAllAndQuit$default(AbstractCore abstractCore, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refuseAllAndQuit");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return abstractCore.refuseAllAndQuit(z10, z11);
    }

    public static /* synthetic */ Flow saveConsents$default(AbstractCore abstractCore, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveConsents");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractCore.saveConsents(z10);
    }

    public static /* synthetic */ void saveExternalIds$default(AbstractCore abstractCore, kv.a aVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveExternalIds");
        }
        if ((i10 & 1) != 0) {
            aVar = C36301.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar = C36312.INSTANCE;
        }
        abstractCore.saveExternalIds(aVar, lVar);
    }

    public static /* synthetic */ void saveFloatingPurposes$default(AbstractCore abstractCore, kv.a aVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFloatingPurposes");
        }
        if ((i10 & 1) != 0) {
            aVar = C36331.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar = C36342.INSTANCE;
        }
        abstractCore.saveFloatingPurposes(aVar, lVar);
    }

    public static /* synthetic */ Flow setConsentableStatus$default(AbstractCore abstractCore, int i10, ConsentStatus consentStatus, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConsentableStatus");
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return abstractCore.setConsentableStatus(i10, consentStatus, z10);
    }

    public static /* synthetic */ void setExtraConsentableConsents$default(AbstractCore abstractCore, Map map, kv.a aVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExtraConsentableConsents");
        }
        if ((i10 & 2) != 0) {
            aVar = C36401.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            lVar = C36412.INSTANCE;
        }
        abstractCore.setExtraConsentableConsents(map, aVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMConsentListener(State state) {
        this.mConsentListener$delegate.setValue(this, $$delegatedProperties[0], state);
    }

    public static /* synthetic */ Flow setStackStatus$default(AbstractCore abstractCore, int i10, ConsentStatus consentStatus, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStackStatus");
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return abstractCore.setStackStatus(i10, consentStatus, z10);
    }

    public static /* synthetic */ Flow setVendorStatus$default(AbstractCore abstractCore, int i10, ConsentStatus consentStatus, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVendorStatus");
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return abstractCore.setVendorStatus(i10, consentStatus, z10);
    }

    public static /* synthetic */ void syncData$default(AbstractCore abstractCore, kv.a aVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncData");
        }
        if ((i10 & 1) != 0) {
            aVar = C36431.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar = C36442.INSTANCE;
        }
        abstractCore.syncData(aVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> tryToExtractPurposeGeolocFrom(State state) {
        return state != null ? y0.plus((Collection) state.getVendorList().getGeolocAds(), (Iterable) state.getVendorList().getGeolocMarkets()) : p0.emptyList();
    }

    public final Flow<Boolean> acceptAll(boolean z10) {
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(FlowKt.flow(new C35991(z10, this, null)), new C36002(null));
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.saveTemporaryState(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$acceptAll$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final Flow<Boolean> acceptAllAndQuit(boolean z10) {
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(FlowKt.flow(new C36011(z10, this, null)), new C36022(null));
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.save(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$acceptAllAndQuit$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final void addLocationListener(AppConsentLocationListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mLocationListeners.add(listener);
    }

    public final void addNoticeListener(AppConsentNoticeListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mNoticeListeners.add(listener);
    }

    public final void addRequestLocationListener(AppConsentRequestLocationListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mRequestLocationListeners.add(listener);
    }

    public final void checkForUpdate(l callback, l error) {
        e0.checkNotNullParameter(callback, "callback");
        e0.checkNotNullParameter(error, "error");
        String lastCmpHash = getMConfigurationProvider().getLastCmpHash();
        if (lastCmpHash.length() != 0) {
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36042(error, lastCmpHash, callback, null), 3, null);
        } else {
            callback.invoke(Boolean.TRUE);
            getMConsentProvider().setNeedToUpdate(true);
        }
    }

    public final void clearCache() {
        getMConsentProvider().clearCache();
        getMConfigurationProvider().clearConfiguration();
    }

    public final void clearConsents() {
        getMConsentProvider().clearConsents();
    }

    public final boolean consentGiven() {
        String consentString = getMConsentProvider().getConsentString();
        return !(consentString == null || n0.isBlank(consentString));
    }

    public final boolean consentableAllowed(int i10, ConsentableType consentableType) {
        Object next;
        e0.checkNotNullParameter(consentableType, "consentableType");
        State temporaryState = getMStateDao().getTemporaryState();
        if (temporaryState != null) {
            Iterator<T> it = temporaryState.getConsents().getConsentables().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ConsentableReducer consentableReducer = (ConsentableReducer) next;
                Integer iabId = consentableReducer.getIabId();
                if (iabId != null && iabId.intValue() == i10 && StateExtsKt.mapConsentableType(consentableReducer.getType(), Integer.valueOf(i10)) == consentableType) {
                    break;
                }
            }
            ConsentableReducer consentableReducer2 = (ConsentableReducer) next;
            if (consentableReducer2 != null && consentableReducer2.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                return true;
            }
        }
        return false;
    }

    public final boolean extraConsentableAllowed(String extraId) {
        Object next;
        e0.checkNotNullParameter(extraId, "extraId");
        State temporaryState = getMStateDao().getTemporaryState();
        if (temporaryState != null) {
            Iterator<T> it = temporaryState.getConsents().getConsentables().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (e0.areEqual(((ConsentableReducer) next).getExtraId(), extraId)) {
                    break;
                }
            }
            ConsentableReducer consentableReducer = (ConsentableReducer) next;
            if (consentableReducer != null && consentableReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                return true;
            }
        }
        return false;
    }

    public final boolean extraFloatingAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        Boolean bool = getMConsentProvider().getFloatingPurposes().get(extraId);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean extraVendorAllowed(String extraId) {
        Object next;
        e0.checkNotNullParameter(extraId, "extraId");
        State temporaryState = getMStateDao().getTemporaryState();
        if (temporaryState != null) {
            Iterator<T> it = temporaryState.getConsents().getVendors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (e0.areEqual(((VendorReducer) next).getExtraId(), extraId)) {
                    break;
                }
            }
            VendorReducer vendorReducer = (VendorReducer) next;
            if (vendorReducer != null && vendorReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                return true;
            }
        }
        return false;
    }

    public void firstLaunch(String appKey, boolean z10, kv.a onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        getMConsentRepository().defineAppKey$appconsent_core_prodXchangeRelease(appKey);
        getMConsentProvider().updateGdprInCacheFromInit(z10);
        loadGDPRCountry();
        if (true == this.uuidState.getValue().booleanValue() && true == this._isGDPRState.getValue().booleanValue()) {
            checkUUIDAndGDPRAreReady(onReady);
            return;
        }
        if (!this.uuidState.getValue().booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new C36051(onReady, null), 3, null);
        }
        if (this._isGDPRState.getValue().booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new C36062(onReady, null), 3, null);
    }

    public final boolean geolocationConsentGiven() {
        List<Consentable> consentablesInCache = getConsentablesInCache();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            if (((Consentable) obj).isGeolocation()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Consentable) it.next()).getStatus() == ConsentStatus.PENDING) {
                return false;
            }
        }
        return true;
    }

    public final String getConsentString() {
        return getMConsentProvider().getConsentString();
    }

    public final List<Consentable> getConsentablesInCache() {
        return StateExtsKt.toNotice(getMStateDao().getTemporaryState()).getConsentables();
    }

    public final Context getContext() {
        return this.context;
    }

    public final Object getCountryFromRemote(d<? super Flow<HelloReply>> dVar) {
        return FlowKt.flow(new C36092(null));
    }

    public final Map<Integer, DataCategoryReducer> getDataCategoriesByDataDeclarations(List<Integer> dataDeclarations) {
        e0.checkNotNullParameter(dataDeclarations, "dataDeclarations");
        return StateExtsKt.getDataCategoriesByDataDeclarations(getMStateDao().getTemporaryState(), dataDeclarations);
    }

    public final List<ExportConsentable> getExportConsentables(ConsentStatus consentStatus) {
        List<Consentable> consentablesInCache = getConsentablesInCache();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getStatus() == (consentStatus == null ? consentable.getStatus() : consentStatus)) {
                arrayList.add(obj);
            }
        }
        return ExtensionKt.toExportConsentable(arrayList);
    }

    public final Map<String, String> getExternalIds() {
        return getMConsentProvider().getExternalIds();
    }

    public final Map<String, Boolean> getFloatingPurpose() {
        return getMConsentProvider().getFloatingPurposes();
    }

    public final GCMRepositoryContract getGcmRepository() {
        return (GCMRepositoryContract) this.gcmRepository$delegate.getValue();
    }

    public final GCMConsentResponse getGcmStatus() {
        return getGcmRepository().getGCMConsentResponse();
    }

    public final Flow<HelloReply> getHelloReply(boolean z10) {
        final Flow flowM5171catch = FlowKt.m5171catch(getMConsentRepository().getHelloReply(this.mNoticeListeners, z10), new C36101(null));
        return FlowKt.flowOn(new Flow<HelloReply>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r5 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.provider.ConfigurationProvider r2 = r2.getMConfigurationProvider()
                        r2.setHelloReply(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$getHelloReply$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super HelloReply> flowCollector, d dVar) {
                Object objCollect = flowM5171catch.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getIO());
    }

    public final ConfigurationDao getMConfigDao() {
        return (ConfigurationDao) this.mConfigDao$delegate.getValue();
    }

    public final ConfigurationProvider getMConfigurationProvider() {
        return (ConfigurationProvider) this.mConfigurationProvider$delegate.getValue();
    }

    public final ConsentProvider getMConsentProvider() {
        return (ConsentProvider) this.mConsentProvider$delegate.getValue();
    }

    public final ConsentRepository getMConsentRepository() {
        return (ConsentRepository) this.mConsentRepository$delegate.getValue();
    }

    public final List<AppConsentLocationListener> getMLocationListeners() {
        return this.mLocationListeners;
    }

    public final List<AppConsentNoticeListener> getMNoticeListeners() {
        return this.mNoticeListeners;
    }

    public final List<AppConsentRequestLocationListener> getMRequestLocationListeners() {
        return this.mRequestLocationListeners;
    }

    public final StateDao getMStateDao() {
        return (StateDao) this.mStateDao$delegate.getValue();
    }

    public final UserProvider getMUserProvider() {
        return (UserProvider) this.mUserProvider$delegate.getValue();
    }

    public final XChangeProvider getMXChangeProvider() {
        return (XChangeProvider) this.mXChangeProvider$delegate.getValue();
    }

    public final Flow<Notice> getNotice(boolean z10) {
        final Flow flowM5171catch = FlowKt.m5171catch(getMConsentRepository().getNotice(this.mNoticeListeners, z10), new C36111(null));
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Notice>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.Notice r5 = (com.sfbx.appconsent.core.model.Notice) r5
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$getNotice$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Notice> flowCollector, d dVar) {
                Object objCollect = flowM5171catch.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass3(null)), Dispatchers.getIO());
    }

    public final long getNoticeExpirationTime() {
        return getMConsentProvider().getNoticeExpirationTime();
    }

    public final Notice getNoticeInCache() {
        return StateExtsKt.toNotice(getMStateDao().getTemporaryState());
    }

    public final String getPurposeConsents() {
        return getMConsentProvider().getPurposeConsents();
    }

    public final String getPurposeLegitimateInterests() {
        return getMConsentProvider().getPurposeLegitimateInterests();
    }

    public final Flow<Bitmap> getQrCode(String data) {
        e0.checkNotNullParameter(data, "data");
        return getMConsentRepository().getQrCode(data);
    }

    public final Flow<RemoteTheme> getRemoteTheme() {
        final Flow<Configuration> configuration = getConfiguration();
        return FlowKt.flowOn(new Flow<RemoteTheme>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.Configuration r5 = (com.sfbx.appconsent.core.model.api.proto.Configuration) r5
                        com.sfbx.appconsent.core.model.RemoteTheme r5 = com.sfbx.appconsent.core.util.ConfigurationExtsKt.toRemoteTheme(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$getRemoteTheme$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super RemoteTheme> flowCollector, d dVar) {
                Object objCollect = configuration.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final Flow<RemoteTheme> getRemoteThemeFromAssets() {
        final Flow flow = FlowKt.flow(new C36151(null));
        return new Flow<RemoteTheme>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.Configuration r5 = (com.sfbx.appconsent.core.model.api.proto.Configuration) r5
                        com.sfbx.appconsent.core.model.RemoteTheme r5 = com.sfbx.appconsent.core.util.ConfigurationExtsKt.toRemoteTheme(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromAssets$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super RemoteTheme> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        };
    }

    public final Flow<RemoteTheme> getRemoteThemeFromServer(boolean z10) {
        final Flow<Configuration> configurationFromServer = getConfigurationFromServer(z10);
        return FlowKt.flowOn(new Flow<RemoteTheme>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.Configuration r5 = (com.sfbx.appconsent.core.model.api.proto.Configuration) r5
                        com.sfbx.appconsent.core.model.RemoteTheme r5 = com.sfbx.appconsent.core.util.ConfigurationExtsKt.toRemoteTheme(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$getRemoteThemeFromServer$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super RemoteTheme> flowCollector, d dVar) {
                Object objCollect = configurationFromServer.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final String getSpecialFeatureOptIns() {
        return getMConsentProvider().getSpecialFeatureOptIns();
    }

    public final List<Stack> getStacksInCache() {
        return StateExtsKt.toNotice(getMStateDao().getTemporaryState()).getStacks();
    }

    public final String getUserId() {
        return getMUserProvider().getUserId();
    }

    public final String getVendorConsents() {
        return getMConsentProvider().getVendorConsents();
    }

    public final Flow<String> getVendorExpiration(long j10, boolean z10) {
        return FlowKt.flowOn(FlowKt.m5171catch(getMConsentRepository().getVendorExpiration(j10, z10), new C36161(null)), Dispatchers.getDefault());
    }

    public final String getVendorLegitimateInterests() {
        return getMConsentProvider().getVendorLegitimateInterests();
    }

    public final List<Vendor> getVendors() {
        return StateExtsKt.getVendors(getMStateDao().getTemporaryState());
    }

    public final MutableStateFlow<Boolean> get_isGDPRState$appconsent_core_prodXchangeRelease() {
        return this._isGDPRState;
    }

    public final boolean isFloatingNeedUpdate() {
        Integer floatingExtraVersion;
        HelloReply helloReply = getMConfigurationProvider().getHelloReply();
        return ((helloReply == null || (floatingExtraVersion = helloReply.getFloatingExtraVersion()) == null) ? -1 : floatingExtraVersion.intValue()) > getMConsentProvider().getCachedFloatingPurposesVersion();
    }

    public final boolean isGDPRCacheObsolete() {
        return getMConsentRepository().isGDPRCacheObsolete();
    }

    public final boolean isGdprForcedByClient() {
        return getMConsentProvider().isGdprForcedByClient();
    }

    public final boolean isGdprFromCache() {
        return getMConsentProvider().isGdprForcedByBO();
    }

    public final boolean isNeedToCallHelloWs() {
        return getMConsentRepository().isNeedToCallHelloWs();
    }

    public final boolean isRemoveLegintableEnable() {
        return getMConsentRepository().isRemoveLegintableEnable();
    }

    public final boolean isSubjectToGDPR() {
        return getMConsentProvider().isSubjectToGdpr();
    }

    public final boolean isSyncNeeded() {
        return getMConsentProvider().isSyncNeeded();
    }

    public final boolean needUserConsents() {
        boolean z10;
        List<Consentable> consentablesInCache = getConsentablesInCache();
        ArrayList<Consentable> arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            if (!((Consentable) obj).isGeolocation()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || arrayList.isEmpty()) {
            z10 = false;
        } else {
            for (Consentable consentable : arrayList) {
                if (consentable.getStatus() == ConsentStatus.PENDING && isConsentableMatchDedicatedType(consentable)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean zIsGDPRCacheObsolete = getMConsentRepository().isGDPRCacheObsolete();
        if (isSubjectToGDPR() || zIsGDPRCacheObsolete) {
            return isConsentExpired() || z10 || !consentGiven() || getMConsentProvider().isNeededToUpdate();
        }
        return false;
    }

    public final boolean needUserLocationConsents() {
        boolean z10;
        boolean zIsGDPRCacheObsolete = getMConsentRepository().isGDPRCacheObsolete();
        boolean z11 = System.currentTimeMillis() > getMConsentProvider().getGeolocationExpirationTime();
        List<Consentable> consentablesInCache = getConsentablesInCache();
        ArrayList<Consentable> arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            if (((Consentable) obj).isGeolocation()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || arrayList.isEmpty()) {
            z10 = false;
        } else {
            for (Consentable consentable : arrayList) {
                if (consentable.getStatus() == ConsentStatus.PENDING && isConsentableMatchDedicatedType(consentable)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (isSubjectToGDPR() || zIsGDPRCacheObsolete) {
            return z11 || z10 || !consentGiven();
        }
        return false;
    }

    public final Flow<Boolean> refuseAll(boolean z10, boolean z11) {
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(FlowKt.flow(new C36211(z11, z10, this, null)), new C36222(null));
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.saveTemporaryState(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$refuseAll$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final Flow<Boolean> refuseAllAndQuit(boolean z10, boolean z11) {
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(FlowKt.flow(new C36231(z11, z10, this, null)), new C36242(null));
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.save(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$refuseAllAndQuit$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final void removeLocationListener(AppConsentLocationListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mLocationListeners.remove(listener);
    }

    public final void removeNoticeListener(AppConsentNoticeListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mNoticeListeners.remove(listener);
    }

    public final void removeRequestLocationListener(AppConsentRequestLocationListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mRequestLocationListeners.remove(listener);
    }

    public final void removeTemporaryValues() {
        getMConsentProvider().clearTemporaryState();
    }

    public final Flow<Boolean> saveConsents(final boolean z10) {
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(getMConsentRepository().saveConsents(this.mNoticeListeners), new C36251(null));
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ boolean $notifyNoticeListener$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, boolean z10, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$notifyNoticeListener$inlined = z10;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r7 instanceof com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r7)
                        goto L5c
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        tu.a0.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        boolean r2 = r5.$notifyNoticeListener$inlined
                        if (r2 == 0) goto L4f
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r5.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        com.sfbx.appconsent.core.model.reducer.State r2 = r2.getTemporaryState()
                        com.sfbx.appconsent.core.business.AbstractCore r4 = r5.this$0
                        com.sfbx.appconsent.core.business.AbstractCore.access$setMConsentListener(r4, r2)
                    L4f:
                        java.lang.Boolean r6 = bv.b.boxBoolean(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L5c
                        return r1
                    L5c:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$saveConsents$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, z10, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new C36263(null)), Dispatchers.getIO());
    }

    public final void saveExternalIds(kv.a success, l failed) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36323(failed, success, null), 3, null);
    }

    public final void saveFloatingPurposes(kv.a success, l failed) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36353(failed, success, null), 3, null);
    }

    public final void sendDisplayMetric() {
        getMConsentRepository().sendNewDisplayMetric();
    }

    public final void sendNewTracking(Track trackingValue) {
        e0.checkNotNullParameter(trackingValue, "trackingValue");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C36361(trackingValue, null), 3, null);
    }

    public final void setAllowPackagesInstalled(boolean z10) {
        getMXChangeProvider().setAllowPackagesInstalled(z10);
    }

    public final void setConsentableConsents(Map<Integer, ? extends ConsentStatus> consents, kv.a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        if (consents.isEmpty()) {
            success.invoke();
        } else {
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36393(consents, error, success, null), 3, null);
        }
    }

    public final Flow<Boolean> setConsentableStatus(int i10, ConsentStatus status, boolean z10) {
        e0.checkNotNullParameter(status, "status");
        final Flow<State> flowDispatch = getMConsentProvider().dispatch(new SetConsentable(z10, status, i10), this.mNoticeListeners);
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.saveTemporaryState(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$setConsentableStatus$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowDispatch.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final void setExternalIds(Map<String, String> value) {
        e0.checkNotNullParameter(value, "value");
        getMConsentProvider().setExternalIds(value);
    }

    public final void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> consents, kv.a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        if (consents.isEmpty()) {
            success.invoke();
        } else {
            BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36423(consents, error, success, null), 3, null);
        }
    }

    public final void setFloatingPurpose(Map<String, Boolean> floatingPurposes) {
        e0.checkNotNullParameter(floatingPurposes, "floatingPurposes");
        getMConsentProvider().setFloatingPurposes(floatingPurposes);
    }

    public final Flow<Boolean> setStackStatus(int i10, ConsentStatus status, boolean z10) {
        e0.checkNotNullParameter(status, "status");
        final Flow<State> flowDispatch = getMConsentProvider().dispatch(new SetStack(z10, status, i10), this.mNoticeListeners);
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.saveTemporaryState(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$setStackStatus$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowDispatch.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final Flow<Boolean> setVendorStatus(int i10, ConsentStatus status, boolean z10) {
        e0.checkNotNullParameter(status, "status");
        final Flow<State> flowDispatch = getMConsentProvider().dispatch(new SetVendor(z10, status, i10), this.mNoticeListeners);
        return FlowKt.flowOn(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AbstractCore this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1$2", f = "AbstractCore.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AbstractCore abstractCore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = abstractCore;
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r5 = (com.sfbx.appconsent.core.model.reducer.State) r5
                        com.sfbx.appconsent.core.business.AbstractCore r2 = r4.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = r2.getMStateDao()
                        boolean r5 = r2.saveTemporaryState(r5)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.business.AbstractCore$setVendorStatus$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowDispatch.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, Dispatchers.getDefault());
    }

    public final void setXChangeUserData(XChangeUserData xChangeUserData) {
        getMXChangeProvider().setXchangeUserData(xChangeUserData);
    }

    public final boolean stackAllowed(int i10) {
        Object next;
        State temporaryState = getMStateDao().getTemporaryState();
        if (temporaryState != null) {
            Iterator<T> it = temporaryState.getConsents().getStacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((StackReducer) next).getId() == i10) {
                    break;
                }
            }
            StackReducer stackReducer = (StackReducer) next;
            if (stackReducer != null && stackReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                return true;
            }
        }
        return false;
    }

    public final void syncData(kv.a success, l error) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36453(error, success, null), 3, null);
    }

    public final boolean userIdIsAdId() {
        return getMUserProvider().userIdIsAdId();
    }

    public final boolean vendorAllowed(int i10) {
        Object next;
        State temporaryState = getMStateDao().getTemporaryState();
        if (temporaryState != null) {
            Iterator<T> it = temporaryState.getConsents().getVendors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer iabId = ((VendorReducer) next).getIabId();
                if (iabId != null && iabId.intValue() == i10) {
                    break;
                }
            }
            VendorReducer vendorReducer = (VendorReducer) next;
            if (vendorReducer != null && vendorReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getNotice$default(AbstractCore abstractCore, l lVar, l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotice");
        }
        if ((i10 & 1) != 0) {
            lVar = AnonymousClass4.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar2 = AnonymousClass5.INSTANCE;
        }
        abstractCore.getNotice(lVar, lVar2);
    }

    public static /* synthetic */ void saveConsents$default(AbstractCore abstractCore, l lVar, l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveConsents");
        }
        if ((i10 & 1) != 0) {
            lVar = C36274.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lVar2 = C36285.INSTANCE;
        }
        abstractCore.saveConsents(lVar, lVar2);
    }

    public static /* synthetic */ void setConsentableConsents$default(AbstractCore abstractCore, Map map, kv.a aVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(VPCjETNfjxu.MNB);
        }
        if ((i10 & 2) != 0) {
            aVar = C36371.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            lVar = C36382.INSTANCE;
        }
        abstractCore.setConsentableConsents(map, aVar, lVar);
    }

    public final void getRemoteTheme(l lVar, l error) {
        e0.checkNotNullParameter(lVar, QCmNMSGd.lezeUwo);
        e0.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36144(error, lVar, null), 3, null);
    }

    public final void getNotice(l success, l error) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AnonymousClass6(error, success, null), 3, null);
    }

    public final void saveConsents(l complete, l error) {
        e0.checkNotNullParameter(complete, "complete");
        e0.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C36296(error, complete, null), 3, null);
    }
}
