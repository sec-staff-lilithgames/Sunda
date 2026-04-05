package com.sfbx.appconsentv3;

import com.sfbx.appconsent.core.model.gcm.GCMStatus;
import com.sfbx.appconsentv3.model.XChangeData;
import com.sfbx.appconsentv3.ui.listener.OnPresentGeolocationNoticeListener;
import com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener;
import com.sfbx.appconsentv3.ui.model.ACConsentStatus;
import com.sfbx.appconsentv3.ui.model.ACConsentableType;
import com.sfbx.appconsentv3.ui.model.ACExportConsentable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import tu.f;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AppConsent {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void checkForUpdate$default(AppConsent appConsent, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkForUpdate");
            }
            if ((i10 & 1) != 0) {
                lVar = AnonymousClass1.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = AnonymousClass2.INSTANCE;
            }
            appConsent.checkForUpdate(lVar, lVar2);
        }

        public static /* synthetic */ List getAllConsentables$default(AppConsent appConsent, ACConsentStatus aCConsentStatus, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllConsentables");
            }
            if ((i10 & 1) != 0) {
                aCConsentStatus = null;
            }
            return appConsent.getAllConsentables(aCConsentStatus);
        }

        public static /* synthetic */ Map getAllExtraVendors$default(AppConsent appConsent, ACConsentStatus aCConsentStatus, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllExtraVendors");
            }
            if ((i10 & 1) != 0) {
                aCConsentStatus = null;
            }
            return appConsent.getAllExtraVendors(aCConsentStatus);
        }

        public static /* synthetic */ void save$default(AppConsent appConsent, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i10 & 1) != 0) {
                lVar = C36821.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = C36832.INSTANCE;
            }
            appConsent.save(lVar, lVar2);
        }

        public static /* synthetic */ void saveExternalIds$default(AppConsent appConsent, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveExternalIds");
            }
            if ((i10 & 1) != 0) {
                aVar = C36841.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar = C36852.INSTANCE;
            }
            appConsent.saveExternalIds(aVar, lVar);
        }

        public static /* synthetic */ void saveFloatingPurposes$default(AppConsent appConsent, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFloatingPurposes");
            }
            if ((i10 & 2) != 0) {
                aVar = C36861.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C36872.INSTANCE;
            }
            appConsent.saveFloatingPurposes(map, aVar, lVar);
        }

        public static /* synthetic */ void setConsentableConsents$default(AppConsent appConsent, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConsentableConsents");
            }
            if ((i10 & 2) != 0) {
                aVar = C36881.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C36892.INSTANCE;
            }
            appConsent.setConsentableConsents(map, aVar, lVar);
        }

        public static /* synthetic */ void setExtraConsentableConsents$default(AppConsent appConsent, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExtraConsentableConsents");
            }
            if ((i10 & 2) != 0) {
                aVar = C36901.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C36912.INSTANCE;
            }
            appConsent.setExtraConsentableConsents(map, aVar, lVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.AppConsent$checkForUpdate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$checkForUpdate$2, reason: invalid class name */
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$save$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36821 extends f0 implements l {
        public static final C36821 INSTANCE = new C36821();

        public C36821() {
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$save$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36832 extends f0 implements l {
        public static final C36832 INSTANCE = new C36832();

        public C36832() {
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36841 extends f0 implements a {
        public static final C36841 INSTANCE = new C36841();

        public C36841() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3458invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3458invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.AppConsent$saveExternalIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36852 extends f0 implements l {
        public static final C36852 INSTANCE = new C36852();

        public C36852() {
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36861 extends f0 implements a {
        public static final C36861 INSTANCE = new C36861();

        public C36861() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3459invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3459invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.AppConsent$saveFloatingPurposes$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36872 extends f0 implements l {
        public static final C36872 INSTANCE = new C36872();

        public C36872() {
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$setConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36881 extends f0 implements a {
        public static final C36881 INSTANCE = new C36881();

        public C36881() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3460invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3460invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.AppConsent$setConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36892 extends f0 implements l {
        public static final C36892 INSTANCE = new C36892();

        public C36892() {
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
    /* renamed from: com.sfbx.appconsentv3.AppConsent$setExtraConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36901 extends f0 implements a {
        public static final C36901 INSTANCE = new C36901();

        public C36901() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3461invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3461invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.AppConsent$setExtraConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36912 extends f0 implements l {
        public static final C36912 INSTANCE = new C36912();

        public C36912() {
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

    @f
    boolean allConsentablesAllowed();

    @f
    boolean allStacksAllowed();

    @f
    boolean allVendorsAllowed();

    void checkForUpdate(l lVar, l lVar2);

    void clearCache();

    void clearConsent();

    boolean consentGiven();

    boolean consentableAllowed(int i10, ACConsentableType aCConsentableType);

    boolean extraConsentableAllowed(String str);

    boolean extraFloatingAllowed(String str);

    boolean extraVendorAllowed(String str);

    boolean geolocationConsentGiven();

    List<ACExportConsentable> getAllConsentables(ACConsentStatus aCConsentStatus);

    Map<String, Boolean> getAllExtraVendors(ACConsentStatus aCConsentStatus);

    Map<String, String> getExternalIds();

    GCMStatus getGCMConsentStatus();

    String getUserId();

    Boolean isAllConsentablesAllowed();

    Boolean isAllConsentablesDisallowed();

    Boolean isAllStacksAllowed();

    Boolean isAllStacksDisallowed();

    Boolean isAllVendorsAllowed();

    Boolean isAllVendorsDisallowed();

    boolean isFloatingNeedUpdate();

    boolean isLimitedTrackingEnabled();

    boolean isSubjectToGDPR();

    Boolean isUserAcceptAll();

    Boolean isUserDenyAll();

    void save(l lVar, l lVar2);

    void saveExternalIds(a aVar, l lVar);

    void saveFloatingPurposes(Map<String, Boolean> map, a aVar, l lVar);

    void sendXchangeData();

    void setConsentableConsents(Map<Integer, ? extends ACConsentStatus> map, a aVar, l lVar);

    void setExternalIds(Map<String, String> map);

    void setExtraConsentableConsents(Map<String, ? extends ACConsentStatus> map, a aVar, l lVar);

    void setOnPresentGeolocationNoticeListener(OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener);

    void setOnPresentNoticeListener(OnPresentNoticeListener onPresentNoticeListener);

    void setXchangeUserData(XChangeData xChangeData);

    boolean stackAllowed(int i10);

    boolean tryToDisplayGeolocationNotice(boolean z10);

    boolean tryToDisplayNotice(boolean z10);

    @f
    boolean userAcceptAll();

    boolean vendorAllowed(int i10);
}
