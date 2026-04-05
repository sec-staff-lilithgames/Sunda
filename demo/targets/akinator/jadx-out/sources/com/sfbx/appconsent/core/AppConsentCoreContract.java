package com.sfbx.appconsent.core;

import android.graphics.Bitmap;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.sfbx.appconsent.core.listener.AppConsentLocationListener;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.ExportConsentable;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.RemoteTheme;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.gcm.GCMStatus;
import com.sfbx.appconsent.core.model.reducer.action.Track;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.Flow;
import kv.a;
import kv.l;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AppConsentCoreContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow acceptAll$default(AppConsentCoreContract appConsentCoreContract, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptAll");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.acceptAll(z10);
        }

        public static /* synthetic */ Flow acceptAllAndQuit$default(AppConsentCoreContract appConsentCoreContract, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptAllAndQuit");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.acceptAllAndQuit(z10);
        }

        public static /* synthetic */ void checkForUpdate$default(AppConsentCoreContract appConsentCoreContract, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkForUpdate");
            }
            if ((i10 & 2) != 0) {
                lVar2 = AnonymousClass1.INSTANCE;
            }
            appConsentCoreContract.checkForUpdate(lVar, lVar2);
        }

        public static /* synthetic */ Flow getHelloReply$default(AppConsentCoreContract appConsentCoreContract, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHelloReply");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.getHelloReply(z10);
        }

        public static /* synthetic */ void getNotice$default(AppConsentCoreContract appConsentCoreContract, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotice");
            }
            if ((i10 & 1) != 0) {
                lVar = C35771.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = AnonymousClass2.INSTANCE;
            }
            appConsentCoreContract.getNotice(lVar, lVar2);
        }

        public static /* synthetic */ void getRemoteTheme$default(AppConsentCoreContract appConsentCoreContract, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRemoteTheme");
            }
            if ((i10 & 1) != 0) {
                lVar = C35781.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = C35792.INSTANCE;
            }
            appConsentCoreContract.getRemoteTheme(lVar, lVar2);
        }

        public static /* synthetic */ Flow getRemoteThemeFromServer$default(AppConsentCoreContract appConsentCoreContract, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRemoteThemeFromServer");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.getRemoteThemeFromServer(z10);
        }

        public static /* synthetic */ Flow refuseAll$default(AppConsentCoreContract appConsentCoreContract, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refuseAll");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            return appConsentCoreContract.refuseAll(z10, z11);
        }

        public static /* synthetic */ Flow refuseAllAndQuit$default(AppConsentCoreContract appConsentCoreContract, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refuseAllAndQuit");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            return appConsentCoreContract.refuseAllAndQuit(z10, z11);
        }

        public static /* synthetic */ void saveConsents$default(AppConsentCoreContract appConsentCoreContract, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveConsents");
            }
            if ((i10 & 1) != 0) {
                lVar = C35801.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = C35812.INSTANCE;
            }
            appConsentCoreContract.saveConsents(lVar, lVar2);
        }

        public static /* synthetic */ void saveFloatingPurposes$default(AppConsentCoreContract appConsentCoreContract, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFloatingPurposes");
            }
            if ((i10 & 1) != 0) {
                aVar = C35841.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar = C35852.INSTANCE;
            }
            appConsentCoreContract.saveFloatingPurposes(aVar, lVar);
        }

        public static /* synthetic */ void setConsentableConsents$default(AppConsentCoreContract appConsentCoreContract, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConsentableConsents");
            }
            if ((i10 & 2) != 0) {
                aVar = C35861.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C35872.INSTANCE;
            }
            appConsentCoreContract.setConsentableConsents(map, aVar, lVar);
        }

        public static /* synthetic */ Flow setConsentableStatus$default(AppConsentCoreContract appConsentCoreContract, int i10, ConsentStatus consentStatus, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConsentableStatus");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.setConsentableStatus(i10, consentStatus, z10);
        }

        public static /* synthetic */ void setExtraConsentableConsents$default(AppConsentCoreContract appConsentCoreContract, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExtraConsentableConsents");
            }
            if ((i10 & 2) != 0) {
                aVar = C35881.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C35892.INSTANCE;
            }
            appConsentCoreContract.setExtraConsentableConsents(map, aVar, lVar);
        }

        public static /* synthetic */ Flow setStackStatus$default(AppConsentCoreContract appConsentCoreContract, int i10, ConsentStatus consentStatus, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStackStatus");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.setStackStatus(i10, consentStatus, z10);
        }

        public static /* synthetic */ Flow setVendorStatus$default(AppConsentCoreContract appConsentCoreContract, int i10, ConsentStatus consentStatus, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVendorStatus");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return appConsentCoreContract.setVendorStatus(i10, consentStatus, z10);
        }

        public static /* synthetic */ void syncData$default(AppConsentCoreContract appConsentCoreContract, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncData");
            }
            if ((i10 & 1) != 0) {
                aVar = C35901.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar = C35912.INSTANCE;
            }
            appConsentCoreContract.syncData(aVar, lVar);
        }

        public static /* synthetic */ void saveExternalIds$default(AppConsentCoreContract appConsentCoreContract, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(PtLatqAYjEFT.gkwPBMlSmeXwr);
            }
            if ((i10 & 1) != 0) {
                aVar = C35821.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar = C35832.INSTANCE;
            }
            appConsentCoreContract.saveExternalIds(aVar, lVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$checkForUpdate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$getNotice$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35771 extends f0 implements l {
        public static final C35771 INSTANCE = new C35771();

        public C35771() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$getNotice$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$getRemoteTheme$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35781 extends f0 implements l {
        public static final C35781 INSTANCE = new C35781();

        public C35781() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$getRemoteTheme$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35792 extends f0 implements l {
        public static final C35792 INSTANCE = new C35792();

        public C35792() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$saveConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35801 extends f0 implements l {
        public static final C35801 INSTANCE = new C35801();

        public C35801() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$saveConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35812 extends f0 implements l {
        public static final C35812 INSTANCE = new C35812();

        public C35812() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35821 extends f0 implements a {
        public static final C35821 INSTANCE = new C35821();

        public C35821() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3437invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3437invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$saveExternalIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35832 extends f0 implements l {
        public static final C35832 INSTANCE = new C35832();

        public C35832() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35841 extends f0 implements a {
        public static final C35841 INSTANCE = new C35841();

        public C35841() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3438invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3438invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$saveFloatingPurposes$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35852 extends f0 implements l {
        public static final C35852 INSTANCE = new C35852();

        public C35852() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$setConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35861 extends f0 implements a {
        public static final C35861 INSTANCE = new C35861();

        public C35861() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3439invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3439invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$setConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35872 extends f0 implements l {
        public static final C35872 INSTANCE = new C35872();

        public C35872() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$setExtraConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35881 extends f0 implements a {
        public static final C35881 INSTANCE = new C35881();

        public C35881() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3440invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3440invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$setExtraConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35892 extends f0 implements l {
        public static final C35892 INSTANCE = new C35892();

        public C35892() {
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
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$syncData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35901 extends f0 implements a {
        public static final C35901 INSTANCE = new C35901();

        public C35901() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3441invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3441invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.AppConsentCoreContract$syncData$2, reason: invalid class name and case insensitive filesystem */
    public static final class C35912 extends f0 implements l {
        public static final C35912 INSTANCE = new C35912();

        public C35912() {
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

    Flow<Boolean> acceptAll(boolean z10);

    Flow<Boolean> acceptAllAndQuit(boolean z10);

    void addLocationListener(AppConsentLocationListener appConsentLocationListener);

    void addNoticeListener(AppConsentNoticeListener appConsentNoticeListener);

    @f
    boolean allConsentablesAllowed();

    @f
    boolean allStacksAllowed();

    @f
    boolean allVendorsAllowed();

    void checkForUpdate(l lVar, l lVar2);

    void clearCache();

    void clearConsents();

    boolean consentGiven();

    boolean consentableAllowed(int i10, ConsentableType consentableType);

    boolean extraConsentableAllowed(String str);

    boolean extraFloatingAllowed(String str);

    boolean extraVendorAllowed(String str);

    Flow<Bitmap> generateQrCode(String str);

    boolean geolocationConsentGiven();

    Notice getConsentInCache();

    String getConsentString();

    List<Consentable> getConsentablesInCache();

    Object getCountryFromBO(d<? super HelloReply> dVar);

    List<DataCategoryCore> getDataCategoriesByDataDeclarations(List<Integer> list);

    List<ExportConsentable> getExportConsentable(ConsentStatus consentStatus);

    Map<String, String> getExternalIds();

    Map<String, Boolean> getFloatingPurposes();

    GCMStatus getGCMStatus();

    Flow<HelloReply> getHelloReply(boolean z10);

    Flow<Notice> getNotice(boolean z10);

    void getNotice(l lVar, l lVar2);

    long getNoticeExpirationTime();

    String getPurposeConsents();

    String getPurposeLegitimateInterests();

    Flow<RemoteTheme> getRemoteTheme();

    void getRemoteTheme(l lVar, l lVar2);

    Flow<RemoteTheme> getRemoteThemeFromAssets();

    RemoteTheme getRemoteThemeFromHelloReply(HelloReply helloReply);

    Flow<RemoteTheme> getRemoteThemeFromServer(boolean z10);

    String getSpecialFeatureOptIns();

    List<Stack> getStacksInCache();

    String getUserId();

    String getVendorConsents();

    Flow<String> getVendorExpiration(long j10, boolean z10);

    String getVendorLegitimateInterests();

    List<Vendor> getVendors();

    Boolean isAllConsentablesAllowed();

    Boolean isAllConsentablesDisallowed();

    Boolean isAllStacksAllowed();

    Boolean isAllStacksDisallowed();

    Boolean isAllVendorsAllowed();

    Boolean isAllVendorsDisallowed();

    boolean isFloatingNeedUpdate();

    boolean isGDPRCacheObsolete();

    boolean isGdprForcedByClient();

    boolean isGdprFromCache();

    boolean isNeedToCallHelloWs();

    Boolean isNeedToDisplayLegitimateInterest();

    boolean isSubjectToGDPR();

    Boolean isUserAcceptAll();

    Boolean isUserDenyAll();

    boolean needUserConsents();

    boolean needUserLocationConsents();

    Flow<Boolean> refuseAll(boolean z10, boolean z11);

    Flow<Boolean> refuseAllAndQuit(boolean z10, boolean z11);

    void removeLocationListener(AppConsentLocationListener appConsentLocationListener);

    void removeNoticeListener(AppConsentNoticeListener appConsentNoticeListener);

    void rollbackToInitialValues();

    Flow<Boolean> saveConsents();

    void saveConsents(l lVar, l lVar2);

    void saveExternalIds(a aVar, l lVar);

    void saveFloatingPurposes(a aVar, l lVar);

    void sendDisplayMetric();

    void sendNewTracking(Track track);

    void setConsentableConsents(Map<Integer, ? extends ConsentStatus> map, a aVar, l lVar);

    Flow<Boolean> setConsentableStatus(int i10, ConsentStatus consentStatus, boolean z10);

    void setExternalIds(Map<String, String> map);

    void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> map, a aVar, l lVar);

    void setFloatingPurposes(Map<String, Boolean> map);

    Flow<Boolean> setStackStatus(int i10, ConsentStatus consentStatus, boolean z10);

    Flow<Boolean> setVendorStatus(int i10, ConsentStatus consentStatus, boolean z10);

    boolean stackAllowed(int i10);

    void syncData(a aVar, l lVar);

    boolean syncIsNeeded();

    @f
    boolean userAcceptAll();

    boolean userIdIsAdId();

    boolean vendorAllowed(int i10);
}
