package com.sfbx.appconsent.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import av.e;
import bv.f;
import bv.n;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.sfbx.appconsent.core.util.GAIDUtils;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import p0.o2;
import sv.n0;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UserProvider {
    private static final String KEY_USER_ID = "appconsent_user_id";
    private static final String KEY_USER_ID_TRACKING_LIMITED = "appconsent_user_id_tracking_limited";
    private static final String UNAUTHORIZED_UUID = "00000000-0000-0000-0000-000000000000";
    private boolean isAdId;

    /* renamed from: sp, reason: collision with root package name */
    private final SharedPreferences f50535sp;
    public static final Companion Companion = new Companion(null);
    private static final String tag = "UserProvider";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdvertisingCommonModel {
        private final String advertisingId;
        private final boolean isTrackingLimited;

        public AdvertisingCommonModel(boolean z10, String advertisingId) {
            e0.checkNotNullParameter(advertisingId, "advertisingId");
            this.isTrackingLimited = z10;
            this.advertisingId = advertisingId;
        }

        public static /* synthetic */ AdvertisingCommonModel copy$default(AdvertisingCommonModel advertisingCommonModel, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = advertisingCommonModel.isTrackingLimited;
            }
            if ((i10 & 2) != 0) {
                str = advertisingCommonModel.advertisingId;
            }
            return advertisingCommonModel.copy(z10, str);
        }

        public final boolean component1() {
            return this.isTrackingLimited;
        }

        public final String component2() {
            return this.advertisingId;
        }

        public final AdvertisingCommonModel copy(boolean z10, String advertisingId) {
            e0.checkNotNullParameter(advertisingId, "advertisingId");
            return new AdvertisingCommonModel(z10, advertisingId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertisingCommonModel)) {
                return false;
            }
            AdvertisingCommonModel advertisingCommonModel = (AdvertisingCommonModel) obj;
            return this.isTrackingLimited == advertisingCommonModel.isTrackingLimited && e0.areEqual(this.advertisingId, advertisingCommonModel.advertisingId);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public int hashCode() {
            boolean z10 = this.isTrackingLimited;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return this.advertisingId.hashCode() + (r02 * 31);
        }

        public final boolean isTrackingLimited() {
            return this.isTrackingLimited;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertisingCommonModel(isTrackingLimited=");
            sb2.append(this.isTrackingLimited);
            sb2.append(", advertisingId=");
            return o2.q(sb2, this.advertisingId, ')');
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
    @f(c = "com.sfbx.appconsent.core.provider.UserProvider$getGoogleAdvertisingInfo$1", f = "UserProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.UserProvider$getGoogleAdvertisingInfo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$context = context;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$context, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.$context);
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = UserProvider.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag, "Google Advertising id obtained.", null, 4, null);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            String id2 = advertisingIdInfo.getId();
            if (id2 == null) {
                id2 = "";
            }
            e0.checkNotNullExpressionValue(id2, "this.id ?: \"\"");
            return new AdvertisingCommonModel(zIsLimitAdTrackingEnabled, id2);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super AdvertisingCommonModel> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.UserProvider$loadAdId$1", f = "UserProvider.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.UserProvider$loadAdId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36561 extends n implements p {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36561(Context context, d<? super C36561> dVar) {
            super(2, dVar);
            this.$context = context;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36561 c36561 = UserProvider.this.new C36561(this.$context, dVar);
            c36561.L$0 = obj;
            return c36561;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                AdvertisingCommonModel advertisingInfo = UserProvider.this.getAdvertisingInfo(this.$context);
                this.label = 1;
                if (flowCollector.emit(advertisingInfo, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super AdvertisingCommonModel> flowCollector, d<? super x0> dVar) {
            return ((C36561) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.provider.UserProvider$loadAdId$3", f = "UserProvider.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.provider.UserProvider$loadAdId$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ACLogger aCLogger = ACLogger.INSTANCE;
                String tag = UserProvider.tag;
                e0.checkNotNullExpressionValue(tag, "tag");
                aCLogger.getClass();
                UserProvider.this.isAdId = false;
                UserProvider.this.setAdvertisingTrackingLimited(true);
                String previousAdsIdOrGenerateRandomAdvertisingId = UserProvider.this.getPreviousAdsIdOrGenerateRandomAdvertisingId();
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(previousAdsIdOrGenerateRandomAdvertisingId, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass3 anonymousClass3 = UserProvider.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = flowCollector;
            anonymousClass3.L$1 = th2;
            return anonymousClass3.invokeSuspend(x0.f87415a);
        }
    }

    public UserProvider(SharedPreferences sp2) {
        e0.checkNotNullParameter(sp2, "sp");
        this.f50535sp = sp2;
        this.isAdId = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomAdvertisingId() {
        GAIDUtils gAIDUtils = GAIDUtils.INSTANCE;
        String strGenerateRandomUUID$appconsent_core_prodXchangeRelease = gAIDUtils.generateRandomUUID$appconsent_core_prodXchangeRelease();
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "We have generated a new temporary AID", null, 4, null);
        if (e0.areEqual(gAIDUtils.isValidUUID(strGenerateRandomUUID$appconsent_core_prodXchangeRelease), GAIDUtils.Response.Success.INSTANCE)) {
            return strGenerateRandomUUID$appconsent_core_prodXchangeRelease;
        }
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "The generated UUID is not compliance ! We force a new one", null, 4, null);
        return gAIDUtils.generateRandomUUID$appconsent_core_prodXchangeRelease();
    }

    private final AdvertisingCommonModel getAmazonAdvertisingID(Context context) {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "Try to get Amazon Advertising ID...", null, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        e0.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
        boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
        String advertisingID = Settings.Secure.getString(contentResolver, "advertising_id");
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "Amazon Advertising id obtained.", null, 4, null);
        e0.checkNotNullExpressionValue(advertisingID, "advertisingID");
        return new AdvertisingCommonModel(z10, advertisingID);
    }

    private final Locale getDeviceLocale() {
        Locale locale = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    private final AdvertisingCommonModel getGoogleAdvertisingInfo(Context context) {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "Try to get Google Advertising ID...", null, 4, null);
        return (AdvertisingCommonModel) BuildersKt.runBlocking(Dispatchers.getIO(), new AnonymousClass1(context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPreviousAdsIdOrGenerateRandomAdvertisingId() {
        String userId = getUserId();
        if (e0.areEqual(GAIDUtils.INSTANCE.isValidUUID(userId), GAIDUtils.Response.Success.INSTANCE)) {
            return userId;
        }
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.w$default(aCLogger, tag2, "The AdId got is not compliance (anymore ! 0000): " + userId + ". We have to generate a new one !", null, 4, null);
        return generateRandomAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean isAdvertisingTrackingLimited() {
        String string = this.f50535sp.getString(KEY_USER_ID_TRACKING_LIMITED, null);
        if (string != null) {
            return n0.toBooleanStrictOrNull(string);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdvertisingTrackingLimited(boolean z10) {
        this.f50535sp.edit().putString(KEY_USER_ID_TRACKING_LIMITED, String.valueOf(z10)).apply();
    }

    public final String getLanguage() {
        String language = getDeviceLocale().getLanguage();
        e0.checkNotNullExpressionValue(language, "getDeviceLocale().language");
        return language;
    }

    public final String getUserId() {
        String string = this.f50535sp.getString(KEY_USER_ID, "");
        return string == null ? "" : string;
    }

    public final Flow<String> loadAdId(Context context) {
        e0.checkNotNullParameter(context, "context");
        final Flow flow = FlowKt.flow(new C36561(context, null));
        return FlowKt.m5171catch(new Flow<String>() { // from class: com.sfbx.appconsent.core.provider.UserProvider$loadAdId$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.provider.UserProvider$loadAdId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ UserProvider this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.provider.UserProvider$loadAdId$$inlined$map$1$2", f = "UserProvider.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.provider.UserProvider$loadAdId$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, UserProvider userProvider) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = userProvider;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, zu.d r13) {
                    /*
                        Method dump skipped, instructions count: 288
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.provider.UserProvider$loadAdId$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass3(null));
    }

    public final void setUserId(String userId) {
        e0.checkNotNullParameter(userId, "userId");
        this.f50535sp.edit().putString(KEY_USER_ID, userId).apply();
    }

    public final boolean userIdIsAdId() {
        return this.isAdId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvertisingCommonModel getAdvertisingInfo(Context context) {
        try {
            return getGoogleAdvertisingInfo(context);
        } catch (Throwable th2) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.e(tag2, gjnZrsdA.JbegLUdiKfEMce, th2);
            return getAmazonAdvertisingID(context);
        }
    }
}
