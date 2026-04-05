package com.sfbx.appconsent.core;

import android.content.Context;
import android.graphics.Bitmap;
import bv.d;
import bv.f;
import com.sfbx.appconsent.core.business.AbstractCore;
import com.sfbx.appconsent.core.business.Core;
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
import com.sfbx.appconsent.core.model.gcm.GCMStatusKt;
import com.sfbx.appconsent.core.model.reducer.DataCategoryReducer;
import com.sfbx.appconsent.core.model.reducer.DataCategoryReducerKt;
import com.sfbx.appconsent.core.model.reducer.action.Track;
import com.sfbx.appconsent.core.util.ConfigurationExtsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;
import kv.a;
import kv.l;
import tu.o;
import tu.q;
import uu.o0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AbstractAppConsentCore implements AppConsentCoreContract {
    private boolean isNeedToDisplayQrCode;
    private Core mCore;
    private final o userAcceptance$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.AbstractAppConsentCore", f = "AbstractAppConsentCore.kt", i = {0, 1}, l = {281, 281}, m = "getCountryFromBO$suspendImpl", n = {"result", "result"}, s = {"L$0", "L$0"})
    /* renamed from: com.sfbx.appconsent.core.AbstractAppConsentCore$getCountryFromBO$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractAppConsentCore.getCountryFromBO$suspendImpl(AbstractAppConsentCore.this, this);
        }
    }

    public AbstractAppConsentCore(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.userAcceptance$delegate = q.lazy(AbstractAppConsentCore$userAcceptance$2.INSTANCE);
        this.mCore = new Core(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r1).collect(r4, r2) == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object getCountryFromBO$suspendImpl(com.sfbx.appconsent.core.AbstractAppConsentCore r22, zu.d<? super com.sfbx.appconsent.core.model.api.proto.HelloReply> r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof com.sfbx.appconsent.core.AbstractAppConsentCore.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.sfbx.appconsent.core.AbstractAppConsentCore$getCountryFromBO$1 r2 = (com.sfbx.appconsent.core.AbstractAppConsentCore.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.sfbx.appconsent.core.AbstractAppConsentCore$getCountryFromBO$1 r2 = new com.sfbx.appconsent.core.AbstractAppConsentCore$getCountryFromBO$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L44
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r0 = r2.L$0
            kotlin.jvm.internal.b1 r0 = (kotlin.jvm.internal.b1) r0
            tu.a0.throwOnFailure(r1)
            goto L85
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            java.lang.Object r0 = r2.L$0
            kotlin.jvm.internal.b1 r0 = (kotlin.jvm.internal.b1) r0
            tu.a0.throwOnFailure(r1)
            goto L73
        L44:
            kotlin.jvm.internal.b1 r1 = com.google.android.gms.internal.play_billing.a.m(r1)
            com.sfbx.appconsent.core.model.api.proto.HelloReply r7 = new com.sfbx.appconsent.core.model.api.proto.HelloReply
            r19 = 2047(0x7ff, float:2.868E-42)
            r20 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.f71816b = r7
            com.sfbx.appconsent.core.business.Core r0 = r0.mCore
            r2.L$0 = r1
            r2.label = r6
            java.lang.Object r0 = r0.getCountryFromRemote(r2)
            if (r0 != r3) goto L6e
            goto L84
        L6e:
            r21 = r1
            r1 = r0
            r0 = r21
        L73:
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            com.sfbx.appconsent.core.AbstractAppConsentCore$getCountryFromBO$2 r4 = new com.sfbx.appconsent.core.AbstractAppConsentCore$getCountryFromBO$2
            r4.<init>()
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.collect(r4, r2)
            if (r1 != r3) goto L85
        L84:
            return r3
        L85:
            java.lang.Object r0 = r0.f71816b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.AbstractAppConsentCore.getCountryFromBO$suspendImpl(com.sfbx.appconsent.core.AbstractAppConsentCore, zu.d):java.lang.Object");
    }

    private final UserAcceptance getUserAcceptance() {
        return (UserAcceptance) this.userAcceptance$delegate.getValue();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> acceptAll(boolean z10) {
        return this.mCore.acceptAll(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> acceptAllAndQuit(boolean z10) {
        return this.mCore.acceptAllAndQuit(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void addLocationListener(AppConsentLocationListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mCore.addLocationListener(listener);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void addNoticeListener(AppConsentNoticeListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mCore.addNoticeListener(listener);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    @tu.f
    public boolean allConsentablesAllowed() {
        List<Consentable> consentablesInCache = this.mCore.getConsentablesInCache();
        ArrayList<Consentable> arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() != ConsentableType.STACK && consentable.getType() != ConsentableType.FEATURE && consentable.getType() != ConsentableType.SPECIAL_PURPOSE) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Consentable consentable2 : arrayList) {
            if (consentable2.getIabId() != null && consentable2.getStatus() == ConsentStatus.DISALLOWED) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    @tu.f
    public boolean allStacksAllowed() {
        List<Stack> stacksInCache = this.mCore.getStacksInCache();
        if ((stacksInCache instanceof Collection) && stacksInCache.isEmpty()) {
            return true;
        }
        for (Stack stack : stacksInCache) {
            if (stack.getIabId() != null && stack.getStatus() == ConsentStatus.DISALLOWED) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    @tu.f
    public boolean allVendorsAllowed() {
        List<Vendor> vendors = this.mCore.getVendors();
        if ((vendors instanceof Collection) && vendors.isEmpty()) {
            return true;
        }
        for (Vendor vendor : vendors) {
            if (vendor.getIabId() != null && vendor.getStatus() == ConsentStatus.DISALLOWED) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void checkForUpdate(l callback, l error) {
        e0.checkNotNullParameter(callback, "callback");
        e0.checkNotNullParameter(error, "error");
        this.mCore.checkForUpdate(callback, error);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void clearCache() {
        this.mCore.clearCache();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void clearConsents() {
        this.mCore.clearConsents();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean consentGiven() {
        return this.mCore.consentGiven();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean consentableAllowed(int i10, ConsentableType consentableType) {
        e0.checkNotNullParameter(consentableType, "consentableType");
        return this.mCore.consentableAllowed(i10, consentableType);
    }

    public final void defineNeedToDisplayQrCode(boolean z10) {
        this.isNeedToDisplayQrCode = z10;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean extraConsentableAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return this.mCore.extraConsentableAllowed(extraId);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean extraFloatingAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return this.mCore.extraFloatingAllowed(extraId);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean extraVendorAllowed(String extraId) {
        e0.checkNotNullParameter(extraId, "extraId");
        return this.mCore.extraVendorAllowed(extraId);
    }

    public void firstLaunch(String appKey, boolean z10, a onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        this.mCore.firstLaunch(appKey, z10, onReady);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Bitmap> generateQrCode(String data) {
        e0.checkNotNullParameter(data, "data");
        return this.mCore.getQrCode(data);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean geolocationConsentGiven() {
        return this.mCore.geolocationConsentGiven();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Notice getConsentInCache() {
        return this.mCore.getNoticeInCache();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getConsentString() {
        return this.mCore.getConsentString();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public List<Consentable> getConsentablesInCache() {
        return this.mCore.getConsentablesInCache();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Object getCountryFromBO(zu.d<? super HelloReply> dVar) {
        return getCountryFromBO$suspendImpl(this, dVar);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public List<DataCategoryCore> getDataCategoriesByDataDeclarations(List<Integer> dataDeclarations) {
        e0.checkNotNullParameter(dataDeclarations, "dataDeclarations");
        Map<Integer, DataCategoryReducer> dataCategoriesByDataDeclarations = this.mCore.getDataCategoriesByDataDeclarations(dataDeclarations);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, DataCategoryReducer>> it = dataCategoriesByDataDeclarations.entrySet().iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, o0.listOf(DataCategoryReducerKt.toCore(it.next().getValue())));
        }
        return arrayList;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public List<ExportConsentable> getExportConsentable(ConsentStatus consentStatus) {
        return this.mCore.getExportConsentables(consentStatus);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Map<String, String> getExternalIds() {
        return this.mCore.getExternalIds();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Map<String, Boolean> getFloatingPurposes() {
        return this.mCore.getFloatingPurpose();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public GCMStatus getGCMStatus() {
        return GCMStatusKt.convertTo(this.mCore.getGcmStatus());
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<HelloReply> getHelloReply(boolean z10) {
        return this.mCore.getHelloReply(z10);
    }

    public final Core getMCore$appconsent_core_prodXchangeRelease() {
        return this.mCore;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Notice> getNotice(boolean z10) {
        return this.mCore.getNotice(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public long getNoticeExpirationTime() {
        return this.mCore.getNoticeExpirationTime();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getPurposeConsents() {
        return this.mCore.getPurposeConsents();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getPurposeLegitimateInterests() {
        return this.mCore.getPurposeLegitimateInterests();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<RemoteTheme> getRemoteTheme() {
        return this.mCore.getRemoteTheme();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<RemoteTheme> getRemoteThemeFromAssets() {
        return this.mCore.getRemoteThemeFromAssets();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public RemoteTheme getRemoteThemeFromHelloReply(HelloReply helloReply) {
        e0.checkNotNullParameter(helloReply, "helloReply");
        return ConfigurationExtsKt.toRemoteTheme(helloReply.getConfiguration());
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<RemoteTheme> getRemoteThemeFromServer(boolean z10) {
        return this.mCore.getRemoteThemeFromServer(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getSpecialFeatureOptIns() {
        return this.mCore.getSpecialFeatureOptIns();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public List<Stack> getStacksInCache() {
        return this.mCore.getStacksInCache();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getUserId() {
        return this.mCore.getUserId();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getVendorConsents() {
        return this.mCore.getVendorConsents();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<String> getVendorExpiration(long j10, boolean z10) {
        return this.mCore.getVendorExpiration(j10, z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public String getVendorLegitimateInterests() {
        return this.mCore.getVendorLegitimateInterests();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public List<Vendor> getVendors() {
        return this.mCore.getVendors();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isAllConsentablesAllowed() {
        List<Consentable> consentablesInCache = this.mCore.getConsentablesInCache();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getIabId() != null && consentable.getType() != ConsentableType.STACK && consentable.getType() != ConsentableType.FEATURE && consentable.getType() != ConsentableType.SPECIAL_PURPOSE) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z10 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Consentable) it.next()).getStatus() != ConsentStatus.ALLOWED) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isAllConsentablesDisallowed() {
        List<Consentable> consentablesInCache = this.mCore.getConsentablesInCache();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentablesInCache) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() != ConsentableType.STACK && consentable.getType() != ConsentableType.FEATURE && consentable.getType() != ConsentableType.SPECIAL_PURPOSE && consentable.getIabId() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z10 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Consentable) it.next()).getStatus() != ConsentStatus.DISALLOWED) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isAllStacksAllowed() {
        List<Stack> stacksInCache = this.mCore.getStacksInCache();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stacksInCache) {
            if (((Stack) obj).getIabId() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z10 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Stack) it.next()).getStatus() != ConsentStatus.ALLOWED) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isAllStacksDisallowed() {
        List<Stack> stacksInCache = this.mCore.getStacksInCache();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stacksInCache) {
            if (((Stack) obj).getIabId() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z10 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Stack) it.next()).getStatus() != ConsentStatus.DISALLOWED) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isAllVendorsAllowed() {
        List<Vendor> vendors = this.mCore.getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (((Vendor) obj).getIabId() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z10 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Vendor) it.next()).getStatus() != ConsentStatus.ALLOWED) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isAllVendorsDisallowed() {
        List<Vendor> vendors = this.mCore.getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (((Vendor) obj).getIabId() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z10 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Vendor) it.next()).getStatus() != ConsentStatus.DISALLOWED) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean isFloatingNeedUpdate() {
        return this.mCore.isFloatingNeedUpdate();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean isGDPRCacheObsolete() {
        return this.mCore.isGDPRCacheObsolete();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean isGdprForcedByClient() {
        return this.mCore.isGdprForcedByClient();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean isGdprFromCache() {
        return this.mCore.isGdprFromCache();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean isNeedToCallHelloWs() {
        return this.mCore.isNeedToCallHelloWs();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isNeedToDisplayLegitimateInterest() {
        return Boolean.valueOf(!this.mCore.isRemoveLegintableEnable());
    }

    public final boolean isNeedToDisplayQrCode() {
        return this.isNeedToDisplayQrCode;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean isSubjectToGDPR() {
        return this.mCore.isSubjectToGDPR();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isUserAcceptAll() {
        return getUserAcceptance().checkAllUseCase$appconsent_core_prodXchangeRelease(isAllConsentablesAllowed(), isAllStacksAllowed(), isAllVendorsAllowed());
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Boolean isUserDenyAll() {
        return getUserAcceptance().checkAllUseCase$appconsent_core_prodXchangeRelease(isAllConsentablesDisallowed(), isAllStacksDisallowed(), isAllVendorsDisallowed());
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean needUserConsents() {
        return this.mCore.needUserConsents();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean needUserLocationConsents() {
        return this.mCore.needUserLocationConsents();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> refuseAll(boolean z10, boolean z11) {
        return this.mCore.refuseAll(z10, z11);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> refuseAllAndQuit(boolean z10, boolean z11) {
        return this.mCore.refuseAllAndQuit(z10, z11);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void removeLocationListener(AppConsentLocationListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mCore.removeLocationListener(listener);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void removeNoticeListener(AppConsentNoticeListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.mCore.removeNoticeListener(listener);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void rollbackToInitialValues() {
        this.mCore.removeTemporaryValues();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> saveConsents() {
        return AbstractCore.saveConsents$default(this.mCore, false, 1, null);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void saveExternalIds(a success, l failed) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        this.mCore.saveExternalIds(success, failed);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void saveFloatingPurposes(a success, l failed) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(failed, "failed");
        this.mCore.saveFloatingPurposes(success, failed);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void sendDisplayMetric() {
        this.mCore.sendDisplayMetric();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void sendNewTracking(Track trackingValue) {
        e0.checkNotNullParameter(trackingValue, "trackingValue");
        this.mCore.sendNewTracking(trackingValue);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void setConsentableConsents(Map<Integer, ? extends ConsentStatus> consents, a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        this.mCore.setConsentableConsents(consents, success, error);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> setConsentableStatus(int i10, ConsentStatus status, boolean z10) {
        e0.checkNotNullParameter(status, "status");
        return this.mCore.setConsentableStatus(i10, status, z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void setExternalIds(Map<String, String> value) {
        e0.checkNotNullParameter(value, "value");
        this.mCore.setExternalIds(value);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void setExtraConsentableConsents(Map<String, ? extends ConsentStatus> consents, a success, l error) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        this.mCore.setExtraConsentableConsents(consents, success, error);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void setFloatingPurposes(Map<String, Boolean> floatingPurposes) {
        e0.checkNotNullParameter(floatingPurposes, "floatingPurposes");
        this.mCore.setFloatingPurpose(floatingPurposes);
    }

    public final void setMCore$appconsent_core_prodXchangeRelease(Core core) {
        e0.checkNotNullParameter(core, "<set-?>");
        this.mCore = core;
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> setStackStatus(int i10, ConsentStatus status, boolean z10) {
        e0.checkNotNullParameter(status, "status");
        return this.mCore.setStackStatus(i10, status, z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public Flow<Boolean> setVendorStatus(int i10, ConsentStatus status, boolean z10) {
        e0.checkNotNullParameter(status, "status");
        return this.mCore.setVendorStatus(i10, status, z10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean stackAllowed(int i10) {
        return this.mCore.stackAllowed(i10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void syncData(a success, l error) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        this.mCore.syncData(success, error);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean syncIsNeeded() {
        return this.mCore.isSyncNeeded();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    @tu.f
    public boolean userAcceptAll() {
        return allConsentablesAllowed() && allStacksAllowed() && allVendorsAllowed();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean userIdIsAdId() {
        return this.mCore.userIdIsAdId();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public boolean vendorAllowed(int i10) {
        return this.mCore.vendorAllowed(i10);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void getNotice(l success, l error) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        this.mCore.getNotice(success, error);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void getRemoteTheme(l success, l error) {
        e0.checkNotNullParameter(success, "success");
        e0.checkNotNullParameter(error, "error");
        this.mCore.getRemoteTheme(success, error);
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreContract
    public void saveConsents(l complete, l error) {
        e0.checkNotNullParameter(complete, "complete");
        e0.checkNotNullParameter(error, "error");
        this.mCore.saveConsents(complete, error);
    }
}
