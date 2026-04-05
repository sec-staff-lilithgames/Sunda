package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import av.e;
import bv.f;
import bv.n;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import uu.c2;
import uu.d2;
import uu.p1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final MutableStateFlow<Boolean> _isOMActive;
    private final MutableStateFlow<Map<String, AdSession>> activeSessions;
    private final MutableStateFlow<Set<String>> finishedSessions;
    private final CoroutineDispatcher mainDispatcher;
    private final OmidManager omidManager;
    private final Partner partner;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$context = context;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidOpenMeasurementRepository.this.new AnonymousClass2(this.$context, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_already_active", null, 2, null);
            }
            try {
                AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                AndroidOpenMeasurementRepository androidOpenMeasurementRepository = AndroidOpenMeasurementRepository.this;
                androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                return AndroidOpenMeasurementRepository.this.isOMActive() ? OMResult.Success.INSTANCE : new OMResult.Failure("om_activate_failure_time", null, 2, null);
            } catch (Throwable th2) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null));
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super OMResult> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37802 extends n implements p {
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37802(ByteString byteString, d<? super C37802> dVar) {
            super(2, dVar);
            this.$opportunityId = byteString;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidOpenMeasurementRepository.this.new C37802(this.$opportunityId, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            AdSession session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            session.finish();
            AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
            return OMResult.Success.INSTANCE;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super OMResult> dVar) {
            return ((C37802) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37812 extends n implements p {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ boolean $signalLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37812(ByteString byteString, boolean z10, d<? super C37812> dVar) {
            super(2, dVar);
            this.$opportunityId = byteString;
            this.$signalLoaded = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidOpenMeasurementRepository.this.new C37812(this.$opportunityId, this.$signalLoaded, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AdSession session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            AdEvents adEventsCreateAdEvents = AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(session);
            if (this.$signalLoaded) {
                adEventsCreateAdEvents.loaded();
            }
            adEventsCreateAdEvents.impressionOccurred();
            return OMResult.Success.INSTANCE;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super OMResult> dVar) {
            return ((C37812) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37822 extends n implements p {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ OmidOptions $options;
        final /* synthetic */ WebView $webView;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CreativeType.values().length];
                try {
                    iArr[CreativeType.HTML_DISPLAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreativeType.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37822(ByteString byteString, OmidOptions omidOptions, WebView webView, d<? super C37822> dVar) {
            super(2, dVar);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidOpenMeasurementRepository.this.new C37822(this.$opportunityId, this.$options, this.$webView, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AdSessionContext adSessionContextCreateHtmlAdSessionContext;
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            try {
                if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new OMResult.Failure("om_not_active", null, 2, null);
                }
                if (((Map) AndroidOpenMeasurementRepository.this.activeSessions.getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                    return new OMResult.Failure("om_session_already_exists", null, 2, null);
                }
                CreativeType creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                OmidManager omidManager = AndroidOpenMeasurementRepository.this.omidManager;
                ImpressionType impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                }
                ImpressionType impressionType2 = impressionType;
                Owner impressionOwner = this.$options.getImpressionOwner();
                if (impressionOwner == null) {
                    impressionOwner = Owner.JAVASCRIPT;
                }
                Owner owner = impressionOwner;
                Owner videoEventsOwner = this.$options.getVideoEventsOwner();
                if (videoEventsOwner == null) {
                    videoEventsOwner = Owner.JAVASCRIPT;
                }
                AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int i10 = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                if (i10 == 1) {
                    adSessionContextCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                } else {
                    if (i10 != 2) {
                        return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    adSessionContextCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                }
                AdSession adSessionCreateAdSession = AndroidOpenMeasurementRepository.this.omidManager.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
                adSessionCreateAdSession.registerAdView(this.$webView);
                adSessionCreateAdSession.start();
                AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, adSessionCreateAdSession);
                return OMResult.Success.INSTANCE;
            } catch (Throwable th2) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null));
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super OMResult> dVar) {
            return ((C37822) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidOpenMeasurementRepository(CoroutineDispatcher mainDispatcher, OmidManager omidManager) {
        e0.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        e0.checkNotNullParameter(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.16.3");
        this.activeSessions = StateFlowKt.MutableStateFlow(p1.emptyMap());
        this.finishedSessions = StateFlowKt.MutableStateFlow(c2.emptySet());
        this._isOMActive = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, AdSession adSession) {
        Map<String, AdSession> value;
        MutableStateFlow<Map<String, AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, p1.plus(value, tu.e0.to(byteString.toStringUtf8(), adSession))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString byteString) {
        return this.activeSessions.getValue().get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        Map<String, AdSession> value;
        String stringUtf8;
        MutableStateFlow<Map<String, AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
            stringUtf8 = byteString.toStringUtf8();
            e0.checkNotNullExpressionValue(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!mutableStateFlow.compareAndSet(value, p1.minus(value, stringUtf8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        Set<String> value;
        String stringUtf8;
        MutableStateFlow<Set<String>> mutableStateFlow = this.finishedSessions;
        do {
            value = mutableStateFlow.getValue();
            stringUtf8 = byteString.toStringUtf8();
            e0.checkNotNullExpressionValue(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!mutableStateFlow.compareAndSet(value, d2.plus(value, stringUtf8)));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, d<? super OMResult> dVar) {
        return BuildersKt.withContext(this.mainDispatcher, new AnonymousClass2(context, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, d<? super OMResult> dVar) {
        return BuildersKt.withContext(this.mainDispatcher, new C37802(byteString, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString opportunityId) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        return this.finishedSessions.getValue().contains(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z10, d<? super OMResult> dVar) {
        return BuildersKt.withContext(this.mainDispatcher, new C37812(byteString, z10, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z10) {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this._isOMActive;
        do {
            value = mutableStateFlow.getValue();
            value.getClass();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, d<? super OMResult> dVar) {
        return BuildersKt.withContext(this.mainDispatcher, new C37822(byteString, omidOptions, webView, null), dVar);
    }
}
