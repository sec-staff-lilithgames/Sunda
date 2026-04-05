package com.sfbx.appconsent.core.ui;

import android.graphics.Bitmap;
import com.sfbx.appconsent.core.listener.AppConsentSaveCallback;
import com.sfbx.appconsent.core.listener.AppConsentSetConsentableConsentsCallback;
import com.sfbx.appconsent.core.listener.AppconsentSaveExternalIdsListener;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.ExportConsentable;
import com.sfbx.appconsent.core.model.gcm.GCMStatus;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.Flow;
import kv.a;
import kv.l;
import tu.f;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AppConsentCoreContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void checkForUpdate$default(AppConsentCoreContract appConsentCoreContract, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkForUpdate");
            }
            if ((i10 & 1) != 0) {
                lVar = AnonymousClass1.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = AnonymousClass2.INSTANCE;
            }
            appConsentCoreContract.checkForUpdate(lVar, lVar2);
        }

        public static /* synthetic */ List getAllConsentables$default(AppConsentCoreContract appConsentCoreContract, ConsentStatus consentStatus, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllConsentables");
            }
            if ((i10 & 1) != 0) {
                consentStatus = null;
            }
            return appConsentCoreContract.getAllConsentables(consentStatus);
        }

        public static /* synthetic */ Map getAllExtraVendors$default(AppConsentCoreContract appConsentCoreContract, ConsentStatus consentStatus, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllExtraVendors");
            }
            if ((i10 & 1) != 0) {
                consentStatus = null;
            }
            return appConsentCoreContract.getAllExtraVendors(consentStatus);
        }

        public static /* synthetic */ void save$default(AppConsentCoreContract appConsentCoreContract, l lVar, l lVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i10 & 1) != 0) {
                lVar = C36721.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar2 = C36732.INSTANCE;
            }
            appConsentCoreContract.save(lVar, lVar2);
        }

        public static /* synthetic */ void saveExternalIds$default(AppConsentCoreContract appConsentCoreContract, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveExternalIds");
            }
            if ((i10 & 1) != 0) {
                aVar = C36741.INSTANCE;
            }
            if ((i10 & 2) != 0) {
                lVar = C36752.INSTANCE;
            }
            appConsentCoreContract.saveExternalIds(aVar, lVar);
        }

        public static /* synthetic */ void saveFloatingPurposes$default(AppConsentCoreContract appConsentCoreContract, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFloatingPurposes");
            }
            if ((i10 & 2) != 0) {
                aVar = C36761.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C36772.INSTANCE;
            }
            appConsentCoreContract.saveFloatingPurposes(map, aVar, lVar);
        }

        public static /* synthetic */ void setConsentableConsents$default(AppConsentCoreContract appConsentCoreContract, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConsentableConsents");
            }
            if ((i10 & 2) != 0) {
                aVar = C36781.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C36792.INSTANCE;
            }
            appConsentCoreContract.setConsentableConsents(map, aVar, lVar);
        }

        public static /* synthetic */ void setExtraConsentableConsents$default(AppConsentCoreContract appConsentCoreContract, Map map, a aVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExtraConsentableConsents");
            }
            if ((i10 & 2) != 0) {
                aVar = C36801.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                lVar = C36812.INSTANCE;
            }
            appConsentCoreContract.setExtraConsentableConsents(map, aVar, lVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$checkForUpdate$1, reason: invalid class name */
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$checkForUpdate$2, reason: invalid class name */
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$save$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36721 extends f0 implements l {
        public static final C36721 INSTANCE = new C36721();

        public C36721() {
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$save$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36732 extends f0 implements l {
        public static final C36732 INSTANCE = new C36732();

        public C36732() {
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36741 extends f0 implements a {
        public static final C36741 INSTANCE = new C36741();

        public C36741() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3454invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3454invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$saveExternalIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36752 extends f0 implements l {
        public static final C36752 INSTANCE = new C36752();

        public C36752() {
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36761 extends f0 implements a {
        public static final C36761 INSTANCE = new C36761();

        public C36761() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3455invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3455invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$saveFloatingPurposes$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36772 extends f0 implements l {
        public static final C36772 INSTANCE = new C36772();

        public C36772() {
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$setConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36781 extends f0 implements a {
        public static final C36781 INSTANCE = new C36781();

        public C36781() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3456invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3456invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$setConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36792 extends f0 implements l {
        public static final C36792 INSTANCE = new C36792();

        public C36792() {
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
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$setExtraConsentableConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36801 extends f0 implements a {
        public static final C36801 INSTANCE = new C36801();

        public C36801() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3457invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3457invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsent.core.ui.AppConsentCoreContract$setExtraConsentableConsents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36812 extends f0 implements l {
        public static final C36812 INSTANCE = new C36812();

        public C36812() {
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

    boolean consentableAllowed(int i10, ConsentableType consentableType);

    boolean extraConsentableAllowed(String str);

    boolean extraFloatingAllowed(String str);

    boolean extraVendorAllowed(String str);

    Flow<Bitmap> generateQrCode(String str);

    boolean geolocationConsentGiven();

    List<ExportConsentable> getAllConsentables(ConsentStatus consentStatus);

    Map<String, Boolean> getAllExtraVendors(ConsentStatus consentStatus);

    @f
    Map<String, Object> getExternalData();

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

    boolean isNeedUserConsents();

    boolean isNeedUserConsentsToGeolocation();

    boolean isSubjectToGDPR();

    Boolean isUserAcceptAll();

    Boolean isUserDenyAll();

    void save(AppConsentSaveCallback appConsentSaveCallback);

    void save(l lVar, l lVar2);

    void saveExternalIds(AppconsentSaveExternalIdsListener appconsentSaveExternalIdsListener);

    void saveExternalIds(a aVar, l lVar);

    void saveFloatingPurposes(Map<String, Boolean> map, AppconsentSaveExternalIdsListener appconsentSaveExternalIdsListener);

    void saveFloatingPurposes(Map<String, Boolean> map, a aVar, l lVar);

    void setConsentableConsents(Map<Integer, ? extends ConsentStatus> map, AppConsentSetConsentableConsentsCallback appConsentSetConsentableConsentsCallback);

    void setConsentableConsents(Map<Integer, ? extends ConsentStatus> map, a aVar, l lVar);

    @f
    void setExternalData(Map<String, ? extends Object> map);

    void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> map, AppConsentSetConsentableConsentsCallback appConsentSetConsentableConsentsCallback);

    void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> map, a aVar, l lVar);

    boolean stackAllowed(int i10);

    @f
    boolean userAcceptAll();

    boolean vendorAllowed(int i10);
}
