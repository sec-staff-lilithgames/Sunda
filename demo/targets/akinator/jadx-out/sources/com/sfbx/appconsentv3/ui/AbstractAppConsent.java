package com.sfbx.appconsentv3.ui;

import android.content.Context;
import com.sfbx.appconsent.core.model.ExportConsentable;
import com.sfbx.appconsent.core.model.gcm.GCMStatus;
import com.sfbx.appconsentv3.AppConsent;
import com.sfbx.appconsentv3.business.AppConsentBusiness;
import com.sfbx.appconsentv3.ui.core.FullAppConsentContract;
import com.sfbx.appconsentv3.ui.listener.OnPresentGeolocationNoticeListener;
import com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener;
import com.sfbx.appconsentv3.ui.model.ACConsentStatus;
import com.sfbx.appconsentv3.ui.model.ACConsentableType;
import com.sfbx.appconsentv3.ui.model.ACExportConsentable;
import com.sfbx.appconsentv3.ui.model.ACExportConsentableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kv.a;
import kv.l;
import tu.f;
import uu.o0;
import uu.o1;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AbstractAppConsent implements AppConsent {
    private final FullAppConsentContract appConsentBusiness;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractAppConsent(Context context) {
        e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.appConsentBusiness = new AppConsentBusiness(applicationContext, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    @f
    public boolean allConsentablesAllowed() {
        return this.appConsentBusiness.allConsentablesAllowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    @f
    public boolean allStacksAllowed() {
        return this.appConsentBusiness.allStacksAllowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    @f
    public boolean allVendorsAllowed() {
        return this.appConsentBusiness.allVendorsAllowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void checkForUpdate(l onResult, l error) {
        e0.checkNotNullParameter(onResult, "onResult");
        e0.checkNotNullParameter(error, "error");
        this.appConsentBusiness.checkForUpdate(onResult, error);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void clearCache() {
        this.appConsentBusiness.clearCache();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void clearConsent() {
        this.appConsentBusiness.clearConsent();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean consentGiven() {
        return this.appConsentBusiness.consentGiven();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean consentableAllowed(int i10, ACConsentableType consentableType) {
        e0.checkNotNullParameter(consentableType, "consentableType");
        return this.appConsentBusiness.consentableAllowed(i10, consentableType.convertTo$appconsent_ui_v3_prodXchangeRelease());
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean extraConsentableAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return this.appConsentBusiness.extraConsentableAllowed(extraId);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean extraFloatingAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return this.appConsentBusiness.extraFloatingAllowed(extraId);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean extraVendorAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return this.appConsentBusiness.extraVendorAllowed(extraId);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean geolocationConsentGiven() {
        return this.appConsentBusiness.geolocationConsentGiven();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public List<ACExportConsentable> getAllConsentables(ACConsentStatus aCConsentStatus) {
        List<ExportConsentable> allConsentables = this.appConsentBusiness.getAllConsentables(aCConsentStatus != null ? aCConsentStatus.convertTo$appconsent_ui_v3_prodXchangeRelease() : null);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allConsentables.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, o0.listOf(ACExportConsentableKt.convertTo((ExportConsentable) it.next())));
        }
        return arrayList;
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Map<String, Boolean> getAllExtraVendors(ACConsentStatus aCConsentStatus) {
        return this.appConsentBusiness.getAllExtraVendors(aCConsentStatus != null ? aCConsentStatus.convertTo$appconsent_ui_v3_prodXchangeRelease() : null);
    }

    public final FullAppConsentContract getAppConsentBusiness() {
        return this.appConsentBusiness;
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Map<String, String> getExternalIds() {
        return this.appConsentBusiness.getExternalIds();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public GCMStatus getGCMConsentStatus() {
        return this.appConsentBusiness.getGCMConsentStatus();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public String getUserId() {
        return this.appConsentBusiness.getUserId();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isAllConsentablesAllowed() {
        return this.appConsentBusiness.isAllConsentablesAllowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isAllConsentablesDisallowed() {
        return this.appConsentBusiness.isAllConsentablesDisallowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isAllStacksAllowed() {
        return this.appConsentBusiness.isAllStacksAllowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isAllStacksDisallowed() {
        return this.appConsentBusiness.isAllStacksDisallowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isAllVendorsAllowed() {
        return this.appConsentBusiness.isAllVendorsAllowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isAllVendorsDisallowed() {
        return this.appConsentBusiness.isAllVendorsDisallowed();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean isFloatingNeedUpdate() {
        return this.appConsentBusiness.isFloatingNeedUpdate();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean isLimitedTrackingEnabled() {
        return this.appConsentBusiness.isLimitedTrackingEnabled();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean isSubjectToGDPR() {
        return this.appConsentBusiness.isSubjectToGDPR();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isUserAcceptAll() {
        return this.appConsentBusiness.isUserAcceptAll();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public Boolean isUserDenyAll() {
        return this.appConsentBusiness.isUserDenyAll();
    }

    public final void launchByUser$appconsent_ui_v3_prodXchangeRelease(String appKey, AppConsentTheme appConsentTheme, boolean z10, boolean z11, boolean z12, boolean z13, l onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        this.appConsentBusiness.firstLaunch(appKey, z10, z11, z12, z13, appConsentTheme, new AbstractAppConsent$launchByUser$1(onReady, this));
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void save(l onResult, l onError) {
        e0.checkNotNullParameter(onResult, "onResult");
        e0.checkNotNullParameter(onError, "onError");
        this.appConsentBusiness.save(onResult, onError);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void saveExternalIds(a success, l failed) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        this.appConsentBusiness.saveExternalIds(success, failed);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void saveFloatingPurposes(Map<String, Boolean> floatingPurposes, a success, l failed) {
        e0.checkNotNullParameter(floatingPurposes, "floatingPurposes");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        this.appConsentBusiness.saveFloatingPurposes(floatingPurposes, success, failed);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void setConsentableConsents(Map<Integer, ? extends ACConsentStatus> consents, a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        FullAppConsentContract fullAppConsentContract = this.appConsentBusiness;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(consents.size()));
        Iterator<T> it = consents.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((ACConsentStatus) entry.getValue()).convertTo$appconsent_ui_v3_prodXchangeRelease());
        }
        fullAppConsentContract.setConsentableConsents(linkedHashMap, success, error);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void setExternalIds(Map<String, String> externalIds) {
        e0.checkNotNullParameter(externalIds, "externalIds");
        this.appConsentBusiness.setExternalIds(externalIds);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void setExtraConsentableConsents(Map<String, ? extends ACConsentStatus> consents, a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        FullAppConsentContract fullAppConsentContract = this.appConsentBusiness;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(consents.size()));
        Iterator<T> it = consents.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((ACConsentStatus) entry.getValue()).convertTo$appconsent_ui_v3_prodXchangeRelease());
        }
        fullAppConsentContract.setExtraConsentableConsents(linkedHashMap, success, error);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void setOnPresentGeolocationNoticeListener(OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener) {
        this.appConsentBusiness.setPresenterGeolocationNoticeListener(onPresentGeolocationNoticeListener);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void setOnPresentNoticeListener(OnPresentNoticeListener onPresentNoticeListener) {
        this.appConsentBusiness.setPresenterNoticeListener(onPresentNoticeListener);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean stackAllowed(int i10) {
        return this.appConsentBusiness.stackAllowed(i10);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean tryToDisplayGeolocationNotice(boolean z10) {
        if (!z10 && !this.appConsentBusiness.isNeedUserConsentsToGeolocation()) {
            return false;
        }
        this.appConsentBusiness.presentGeolocationNotice(z10);
        return true;
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean tryToDisplayNotice(boolean z10) {
        if (!z10 && !this.appConsentBusiness.isNeedUserConsents()) {
            return false;
        }
        this.appConsentBusiness.presentNotice(z10);
        return true;
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    @f
    public boolean userAcceptAll() {
        return this.appConsentBusiness.userAcceptAll();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public boolean vendorAllowed(int i10) {
        return this.appConsentBusiness.vendorAllowed(i10);
    }
}
