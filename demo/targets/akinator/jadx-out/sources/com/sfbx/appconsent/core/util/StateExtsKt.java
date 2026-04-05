package com.sfbx.appconsent.core.util;

import ac.Models;
import com.sfbx.appconsent.core.BuildConfig;
import com.sfbx.appconsent.core.model.BannerType;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.DataRetentionCore;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsent.core.model.api.proto.Consent;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.reducer.ConsentReducer;
import com.sfbx.appconsent.core.model.reducer.ConsentableReducer;
import com.sfbx.appconsent.core.model.reducer.DataCategoryReducer;
import com.sfbx.appconsent.core.model.reducer.DataCategoryReducerKt;
import com.sfbx.appconsent.core.model.reducer.DataRetentionReducerKt;
import com.sfbx.appconsent.core.model.reducer.EventReducer;
import com.sfbx.appconsent.core.model.reducer.StackReducer;
import com.sfbx.appconsent.core.model.reducer.State;
import com.sfbx.appconsent.core.model.reducer.VendorListReducer;
import com.sfbx.appconsent.core.model.reducer.VendorReducer;
import com.sfbx.appconsent.core.model.reducer.VendorUrl;
import com.sfbx.appconsent.core.model.reducer.VendorUrlKt;
import com.sfbx.appconsent.core.provider.ConfigurationProvider;
import com.sfbx.appconsent.core.provider.ConsentProvider;
import com.sfbx.appconsent.core.provider.UserProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import metric.Metric$Event;
import uu.o1;
import uu.p0;
import uu.p1;
import uu.q0;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StateExtsKt {
    public static final boolean geolocationAllowed(State state) {
        ConsentReducer consents;
        List<ConsentableReducer> consentables;
        if (specialFeatureGeolocationSet(state)) {
            return true;
        }
        if (state == null || (consents = state.getConsents()) == null || (consentables = consents.getConsentables()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentables) {
            ConsentableReducer consentableReducer = (ConsentableReducer) obj;
            if (state.getVendorList().getGeolocMarkets().contains(Integer.valueOf(consentableReducer.getId())) || state.getVendorList().getGeolocAds().contains(Integer.valueOf(consentableReducer.getId()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ConsentableReducer) it.next()).getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean geolocationSet(com.sfbx.appconsent.core.model.reducer.State r7) {
        /*
            r0 = 1
            if (r7 == 0) goto L41
            com.sfbx.appconsent.core.model.reducer.ConsentReducer r1 = r7.getConsents()
            if (r1 == 0) goto L41
            java.util.List r1 = r1.getConsentables()
            if (r1 == 0) goto L41
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.sfbx.appconsent.core.model.reducer.ConsentableReducer r3 = (com.sfbx.appconsent.core.model.reducer.ConsentableReducer) r3
            java.lang.Integer r4 = r3.getIabId()
            if (r4 != 0) goto L29
            goto L15
        L29:
            int r4 = r4.intValue()
            if (r4 != r0) goto L15
            int r3 = r3.getType()
            r4 = 2
            if (r3 != r4) goto L15
            goto L38
        L37:
            r2 = 0
        L38:
            com.sfbx.appconsent.core.model.reducer.ConsentableReducer r2 = (com.sfbx.appconsent.core.model.reducer.ConsentableReducer) r2
            if (r2 == 0) goto L41
            int r1 = r2.getStatus()
            goto L47
        L41:
            com.sfbx.appconsent.core.model.ConsentStatus r1 = com.sfbx.appconsent.core.model.ConsentStatus.PENDING
            int r1 = r1.getValue$appconsent_core_prodXchangeRelease()
        L47:
            com.sfbx.appconsent.core.model.ConsentStatus r2 = com.sfbx.appconsent.core.model.ConsentStatus.PENDING
            int r2 = r2.getValue$appconsent_core_prodXchangeRelease()
            if (r1 != r2) goto Lcb
            if (r7 == 0) goto Lc9
            com.sfbx.appconsent.core.model.reducer.ConsentReducer r1 = r7.getConsents()
            if (r1 == 0) goto Lc9
            java.util.List r1 = r1.getConsentables()
            if (r1 == 0) goto Lc9
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sfbx.appconsent.core.model.reducer.ConsentableReducer r4 = (com.sfbx.appconsent.core.model.reducer.ConsentableReducer) r4
            com.sfbx.appconsent.core.model.reducer.VendorListReducer r5 = r7.getVendorList()
            java.util.List r5 = r5.getGeolocMarkets()
            int r6 = r4.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto La1
            com.sfbx.appconsent.core.model.reducer.VendorListReducer r5 = r7.getVendorList()
            java.util.List r5 = r5.getGeolocAds()
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L68
        La1:
            r2.add(r3)
            goto L68
        La5:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto Lac
            goto Lc9
        Lac:
            java.util.Iterator r7 = r2.iterator()
        Lb0:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r7.next()
            com.sfbx.appconsent.core.model.reducer.ConsentableReducer r1 = (com.sfbx.appconsent.core.model.reducer.ConsentableReducer) r1
            int r1 = r1.getStatus()
            com.sfbx.appconsent.core.model.ConsentStatus r2 = com.sfbx.appconsent.core.model.ConsentStatus.PENDING
            int r2 = r2.getValue$appconsent_core_prodXchangeRelease()
            if (r1 == r2) goto Lb0
            goto Lcb
        Lc9:
            r7 = 0
            return r7
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.util.StateExtsKt.geolocationSet(com.sfbx.appconsent.core.model.reducer.State):boolean");
    }

    public static final List<Consentable> getConsentables(State state) {
        Map<String, String> mapEmptyMap;
        if (state == null) {
            return p0.emptyList();
        }
        List<ConsentableReducer> consentables = state.getConsents().getConsentables();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(consentables, 10));
        for (ConsentableReducer consentableReducer : consentables) {
            int id2 = consentableReducer.getId();
            Integer iabId = consentableReducer.getIabId();
            String extraId = consentableReducer.getExtraId();
            Map<String, String> values = consentableReducer.getName().getValues();
            Map<String, String> values2 = consentableReducer.getDescription().getValues();
            Map<String, String> values3 = consentableReducer.getDescriptionLegal().getValues();
            I18NString illustrations = consentableReducer.getIllustrations();
            if (illustrations == null || (mapEmptyMap = illustrations.getValues()) == null) {
                mapEmptyMap = p1.emptyMap();
            }
            Map<String, String> map = mapEmptyMap;
            List<Vendor> listMapVendors = mapVendors(consentableReducer.getId(), state.getConsents().getVendors());
            ConsentableType consentableTypeMapConsentableType = mapConsentableType(consentableReducer.getType(), consentableReducer.getIabId());
            BannerType bannerTypeMapBannerType = mapBannerType(consentableReducer.getId(), state.getVendorList());
            ConsentStatus.Companion companion = ConsentStatus.Companion;
            arrayList.add(new Consentable(id2, iabId, extraId, values, values2, values3, map, consentableTypeMapConsentableType, bannerTypeMapBannerType, listMapVendors, companion.getConsentStatus(consentableReducer.getStatus()), companion.getConsentStatus(consentableReducer.getLegintStatus()), consentableReducer.getVendorsNumber()));
        }
        return arrayList;
    }

    public static final Map<Integer, DataCategoryReducer> getDataCategoriesByDataDeclarations(State state, List<Integer> dataDeclaration) {
        e0.checkNotNullParameter(dataDeclaration, "dataDeclaration");
        if (state == null) {
            return p1.emptyMap();
        }
        Map<Integer, DataCategoryReducer> dataCategories = state.getConsents().getDataCategories();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, DataCategoryReducer> entry : dataCategories.entrySet()) {
            if (dataDeclaration.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final List<Metric$Event> getMetricsToProto(State state) {
        if (state == null) {
            return p0.emptyList();
        }
        List<EventReducer> events = state.getEvents();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(events, 10));
        for (EventReducer eventReducer : events) {
            arrayList.add((Metric$Event) Metric$Event.newBuilder().setName(eventReducer.getName()).setTimestamp(eventReducer.getTimestamp()).build());
        }
        return arrayList;
    }

    public static final List<Vendor> getVendors(State state) {
        if (state == null) {
            return p0.emptyList();
        }
        List<VendorReducer> vendors = state.getConsents().getVendors();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(vendors, 10));
        for (VendorReducer vendorReducer : vendors) {
            int id2 = vendorReducer.getId();
            Integer iabId = vendorReducer.getIabId();
            String extraId = vendorReducer.getExtraId();
            String name = vendorReducer.getName();
            DataRetentionCore core = DataRetentionReducerKt.toCore(vendorReducer.getDataRetention());
            String policyUrl = vendorReducer.getPolicyUrl();
            Map<String, VendorUrl> urls = vendorReducer.getUrls();
            LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(urls.size()));
            Iterator<T> it = urls.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), VendorUrlKt.toCore((VendorUrl) entry.getValue()));
            }
            boolean z10 = vendorReducer.getIabId() == null;
            boolean zIsEmpty = true ^ vendorReducer.getLegintables().isEmpty();
            ConsentStatus.Companion companion = ConsentStatus.Companion;
            ConsentStatus consentStatus = companion.getConsentStatus(vendorReducer.getStatus());
            ConsentStatus consentStatus2 = companion.getConsentStatus(vendorReducer.getLegintStatus());
            Double cookieMaxAgeSeconds = vendorReducer.getCookieMaxAgeSeconds();
            arrayList.add(new Vendor(id2, iabId, extraId, name, policyUrl, core, linkedHashMap, zIsEmpty, z10, consentStatus, consentStatus2, cookieMaxAgeSeconds != null ? Long.valueOf((long) cookieMaxAgeSeconds.doubleValue()) : null, vendorReducer.getUsesNonCookieAccess(), vendorReducer.getGoogleAtpId(), vendorReducer.getDataDeclaration()));
        }
        return y0.sortedWith(arrayList, new Comparator() { // from class: com.sfbx.appconsent.core.util.StateExtsKt$getVendors$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                String name2 = ((Vendor) t10).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name2.toLowerCase(locale);
                e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = ((Vendor) t11).getName().toLowerCase(locale);
                e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return d.compareValues(lowerCase, lowerCase2);
            }
        });
    }

    public static final boolean hasXchangePermission(State state) {
        ConsentReducer consents;
        List<ConsentableReducer> consentables;
        if (state == null || (consents = state.getConsents()) == null || (consentables = consents.getConsentables()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentables) {
            ConsentableReducer consentableReducer = (ConsentableReducer) obj;
            if (consentableReducer.getType() == 0 && consentableReducer.getIabId() != null) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ConsentableReducer) it.next()).getStatus() != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean isInStack(Consentable consentable, List<StackReducer> list) {
        List<StackReducer> list2 = list;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((StackReducer) it.next()).getConsentables());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = y0.plus((Collection) next, (Iterable) it2.next());
        }
        Iterable iterable = (Iterable) next;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            if (((Number) it3.next()).intValue() == consentable.getId()) {
                return true;
            }
        }
        return false;
    }

    private static final BannerType mapBannerType(int i10, VendorListReducer vendorListReducer) {
        return vendorListReducer.getGeolocAds().contains(Integer.valueOf(i10)) ? BannerType.GEOLOCATION_AD : vendorListReducer.getGeolocMarkets().contains(Integer.valueOf(i10)) ? BannerType.GEOLOCATION_MARKET : BannerType.NONE;
    }

    public static final ConsentableType mapConsentableType(int i10, Integer num) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ConsentableType.UNKNOWN : num != null ? ConsentableType.SPECIAL_PURPOSE : ConsentableType.EXTRA_SPECIAL_PURPOSE : num != null ? ConsentableType.SPECIAL_FEATURE : ConsentableType.EXTRA_SPECIAL_FEATURE : num != null ? ConsentableType.FEATURE : ConsentableType.EXTRA_FEATURE : num != null ? ConsentableType.PURPOSE : ConsentableType.EXTRA_PURPOSE;
    }

    private static final List<Stack> mapStacks(List<StackReducer> list, List<Consentable> list2) {
        List<StackReducer> list3 = list;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
        for (StackReducer stackReducer : list3) {
            int id2 = stackReducer.getId();
            Integer iabId = stackReducer.getIabId();
            Map<String, String> values = stackReducer.getName().getValues();
            Map<String, String> values2 = stackReducer.getDescription().getValues();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                Consentable consentable = (Consentable) obj;
                List<Integer> consentables = stackReducer.getConsentables();
                if (!(consentables instanceof Collection) || !consentables.isEmpty()) {
                    Iterator<T> it = consentables.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (consentable.getId() == ((Number) it.next()).intValue()) {
                                arrayList2.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
            ConsentStatus.Companion companion = ConsentStatus.Companion;
            arrayList.add(new Stack(id2, iabId, values, values2, arrayList2, companion.getConsentStatus(stackReducer.getStatus()), companion.getConsentStatus(stackReducer.getLegintStatus()), stackReducer.getVendorsNumber()));
        }
        return arrayList;
    }

    private static final List<Vendor> mapVendors(int i10, List<VendorReducer> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            VendorReducer vendorReducer = (VendorReducer) obj;
            if (vendorReducer.getConsentables().contains(Integer.valueOf(i10)) || vendorReducer.getLegintables().contains(Integer.valueOf(i10))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            VendorReducer vendorReducer2 = (VendorReducer) it.next();
            int id2 = vendorReducer2.getId();
            Integer iabId = vendorReducer2.getIabId();
            String extraId = vendorReducer2.getExtraId();
            String name = vendorReducer2.getName();
            String policyUrl = vendorReducer2.getPolicyUrl();
            DataRetentionCore core = DataRetentionReducerKt.toCore(vendorReducer2.getDataRetention());
            Map<String, VendorUrl> urls = vendorReducer2.getUrls();
            LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(urls.size()));
            Iterator<T> it2 = urls.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), VendorUrlKt.toCore((VendorUrl) entry.getValue()));
            }
            boolean zContains = vendorReducer2.getLegintables().contains(Integer.valueOf(i10));
            boolean z10 = vendorReducer2.getIabId() == null;
            ConsentStatus.Companion companion = ConsentStatus.Companion;
            ConsentStatus consentStatus = companion.getConsentStatus(vendorReducer2.getStatus());
            ConsentStatus consentStatus2 = companion.getConsentStatus(vendorReducer2.getLegintStatus());
            Double cookieMaxAgeSeconds = vendorReducer2.getCookieMaxAgeSeconds();
            Iterator it3 = it;
            arrayList2.add(new Vendor(id2, iabId, extraId, name, policyUrl, core, linkedHashMap, zContains, z10, consentStatus, consentStatus2, cookieMaxAgeSeconds != null ? Long.valueOf((long) cookieMaxAgeSeconds.doubleValue()) : null, vendorReducer2.getUsesNonCookieAccess(), vendorReducer2.getGoogleAtpId(), vendorReducer2.getDataDeclaration()));
            it = it3;
        }
        return y0.sortedWith(arrayList2, new Comparator() { // from class: com.sfbx.appconsent.core.util.StateExtsKt$mapVendors$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                String name2 = ((Vendor) t10).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name2.toLowerCase(locale);
                e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = ((Vendor) t11).getName().toLowerCase(locale);
                e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return d.compareValues(lowerCase, lowerCase2);
            }
        });
    }

    public static final boolean specialFeatureGeolocationSet(State state) {
        ConsentReducer consents;
        List<ConsentableReducer> consentables;
        Object next;
        if (state != null && (consents = state.getConsents()) != null && (consentables = consents.getConsentables()) != null) {
            Iterator<T> it = consentables.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ConsentableReducer consentableReducer = (ConsentableReducer) next;
                Integer iabId = consentableReducer.getIabId();
                if (iabId != null && iabId.intValue() == 1 && consentableReducer.getType() == 2) {
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

    public static final Consent toCoreConsent(State state, ConsentProvider consentProvider, ConfigurationProvider configurationProvider, UserProvider userProvider) {
        int i10;
        Integer cmpHashVersion;
        String cmpHash;
        int i11;
        e0.checkNotNullParameter(state, "<this>");
        e0.checkNotNullParameter(consentProvider, "consentProvider");
        e0.checkNotNullParameter(configurationProvider, "configurationProvider");
        e0.checkNotNullParameter(userProvider, "userProvider");
        String consentString = state.getConsentString();
        String str = consentString == null ? "" : consentString;
        List<ConsentableReducer> consentables = state.getConsents().getConsentables();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentables) {
            ConsentableReducer consentableReducer = (ConsentableReducer) obj;
            if (consentableReducer.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.SPECIAL_FEATURE.getValue() && consentableReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((ConsentableReducer) it.next()).getId()));
        }
        List<ConsentableReducer> consentables2 = state.getConsents().getConsentables();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : consentables2) {
            ConsentableReducer consentableReducer2 = (ConsentableReducer) obj2;
            if (consentableReducer2.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.PURPOSE.getValue() || consentableReducer2.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.SPECIAL_FEATURE.getValue()) {
                if (consentableReducer2.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                    arrayList3.add(obj2);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(q0.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((ConsentableReducer) it2.next()).getId()));
        }
        List<ConsentableReducer> consentables3 = state.getConsents().getConsentables();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : consentables3) {
            ConsentableReducer consentableReducer3 = (ConsentableReducer) obj3;
            if (consentableReducer3.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.PURPOSE.getValue() || consentableReducer3.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.SPECIAL_FEATURE.getValue()) {
                if (consentableReducer3.getLegintStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                    arrayList5.add(obj3);
                }
            }
        }
        ArrayList arrayList6 = new ArrayList(q0.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Integer.valueOf(((ConsentableReducer) it3.next()).getId()));
        }
        List<VendorReducer> vendors = state.getConsents().getVendors();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : vendors) {
            if (((VendorReducer) obj4).getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList(q0.collectionSizeOrDefault(arrayList7, 10));
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            arrayList8.add(Integer.valueOf(((VendorReducer) it4.next()).getId()));
        }
        List<VendorReducer> vendors2 = state.getConsents().getVendors();
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : vendors2) {
            if (((VendorReducer) obj5).getLegintStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                arrayList9.add(obj5);
            }
        }
        ArrayList arrayList10 = new ArrayList(q0.collectionSizeOrDefault(arrayList9, 10));
        Iterator it5 = arrayList9.iterator();
        while (it5.hasNext()) {
            arrayList10.add(Integer.valueOf(((VendorReducer) it5.next()).getId()));
        }
        Integer numValueOf = Integer.valueOf(BuildConfig.VERSION_CODE);
        String userId = userProvider.getUserId();
        List<ConsentableReducer> consentables4 = state.getConsents().getConsentables();
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = consentables4.iterator();
        while (it6.hasNext()) {
            Object next = it6.next();
            ConsentableReducer consentableReducer4 = (ConsentableReducer) next;
            Iterator it7 = it6;
            if (consentableReducer4.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.PURPOSE.getValue() || consentableReducer4.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.SPECIAL_FEATURE.getValue()) {
                arrayList11.add(next);
            }
            it6 = it7;
        }
        if (arrayList11.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it8 = arrayList11.iterator();
            while (it8.hasNext()) {
                if (((ConsentableReducer) it8.next()).getStatus() != ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                    List<ConsentableReducer> consentables5 = state.getConsents().getConsentables();
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it9 = consentables5.iterator();
                    while (it9.hasNext()) {
                        Object next2 = it9.next();
                        ConsentableReducer consentableReducer5 = (ConsentableReducer) next2;
                        Iterator it10 = it9;
                        if (consentableReducer5.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.PURPOSE.getValue() || consentableReducer5.getType() == com.sfbx.appconsent.core.model.api.proto.ConsentableType.SPECIAL_FEATURE.getValue()) {
                            arrayList12.add(next2);
                        }
                        it9 = it10;
                    }
                    if (arrayList12.isEmpty()) {
                        i11 = 1;
                        i10 = i11;
                    } else {
                        Iterator it11 = arrayList12.iterator();
                        while (it11.hasNext()) {
                            if (((ConsentableReducer) it11.next()).getStatus() != ConsentStatus.DISALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                                i11 = 2;
                                break;
                            }
                        }
                        i11 = 1;
                        i10 = i11;
                    }
                }
            }
            i10 = 0;
        }
        HelloReply helloReply = configurationProvider.getHelloReply();
        String str2 = (helloReply == null || (cmpHash = helloReply.getCmpHash()) == null) ? "" : cmpHash;
        HelloReply helloReply2 = configurationProvider.getHelloReply();
        return new Consent(str, arrayList2, arrayList4, arrayList6, arrayList8, arrayList10, numValueOf, userId, i10, str2, Integer.valueOf((helloReply2 == null || (cmpHashVersion = helloReply2.getCmpHashVersion()) == null) ? 0 : cmpHashVersion.intValue()), consentProvider.getExternalIds());
    }

    public static final Notice toNotice(State state) {
        List listEmptyList;
        List<Stack> listEmptyList2;
        List listEmptyList3;
        ConsentReducer consents;
        Map<Integer, DataCategoryReducer> dataCategories;
        ConsentReducer consents2;
        ConsentReducer consents3;
        List<Consentable> consentables = getConsentables(state);
        List<StackReducer> stacks = null;
        List<StackReducer> stacks2 = (state == null || (consents3 = state.getConsents()) == null) ? null : consents3.getStacks();
        if (stacks2 == null || stacks2.isEmpty()) {
            listEmptyList = p0.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : consentables) {
                e0.checkNotNull(state);
                if (isInStack((Consentable) obj, state.getConsents().getStacks())) {
                    listEmptyList.add(obj);
                }
            }
        }
        if (state != null && (consents2 = state.getConsents()) != null) {
            stacks = consents2.getStacks();
        }
        List<StackReducer> list = stacks;
        if (list == null || list.isEmpty()) {
            listEmptyList2 = p0.emptyList();
        } else {
            e0.checkNotNull(state);
            listEmptyList2 = mapStacks(state.getConsents().getStacks(), listEmptyList);
        }
        if (state == null || (consents = state.getConsents()) == null || (dataCategories = consents.getDataCategories()) == null) {
            listEmptyList3 = p0.emptyList();
        } else {
            listEmptyList3 = new ArrayList(dataCategories.size());
            Iterator<Map.Entry<Integer, DataCategoryReducer>> it = dataCategories.entrySet().iterator();
            while (it.hasNext()) {
                listEmptyList3.add(DataCategoryReducerKt.toCore(it.next().getValue()));
            }
        }
        return new Notice(consentables, listEmptyList2, getVendors(state), listEmptyList3);
    }

    public static final Models.Consent toProtoConsent(State state, ConsentProvider consentProvider, ConfigurationProvider configurationProvider, UserProvider userProvider) {
        Integer cmpHashVersion;
        String cmpHash;
        e0.checkNotNullParameter(state, "<this>");
        e0.checkNotNullParameter(consentProvider, "consentProvider");
        e0.checkNotNullParameter(configurationProvider, "configurationProvider");
        e0.checkNotNullParameter(userProvider, "userProvider");
        Models.Consent.Builder builderNewBuilder = Models.Consent.newBuilder();
        String consentString = state.getConsentString();
        String str = "";
        if (consentString == null) {
            consentString = "";
        }
        Models.Consent.Builder iabCs = builderNewBuilder.setIabCs(consentString);
        List<ConsentableReducer> consentables = state.getConsents().getConsentables();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentables) {
            ConsentableReducer consentableReducer = (ConsentableReducer) obj;
            if (consentableReducer.getType() == 0 || consentableReducer.getType() == 2) {
                if (consentableReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((ConsentableReducer) it.next()).getId()));
        }
        Models.Consent.Builder builderAddAllPurposes = iabCs.addAllPurposes(arrayList2);
        List<ConsentableReducer> consentables2 = state.getConsents().getConsentables();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : consentables2) {
            ConsentableReducer consentableReducer2 = (ConsentableReducer) obj2;
            if (consentableReducer2.getType() == 0 || consentableReducer2.getType() == 2) {
                if (consentableReducer2.getLegintStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                    arrayList3.add(obj2);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(q0.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((ConsentableReducer) it2.next()).getId()));
        }
        Models.Consent.Builder builderAddAllPurposesLegint = builderAddAllPurposes.addAllPurposesLegint(arrayList4);
        List<VendorReducer> vendors = state.getConsents().getVendors();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : vendors) {
            if (((VendorReducer) obj3).getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(q0.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Integer.valueOf(((VendorReducer) it3.next()).getId()));
        }
        Models.Consent.Builder builderAddAllVendors = builderAddAllPurposesLegint.addAllVendors(arrayList6);
        List<VendorReducer> vendors2 = state.getConsents().getVendors();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : vendors2) {
            if (((VendorReducer) obj4).getLegintStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList(q0.collectionSizeOrDefault(arrayList7, 10));
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            arrayList8.add(Integer.valueOf(((VendorReducer) it4.next()).getId()));
        }
        Models.Consent.Builder uuid = builderAddAllVendors.addAllVendorsLegint(arrayList8).setCmpVersion(BuildConfig.VERSION_CODE).setUuid(userProvider.getUserId());
        HelloReply helloReply = configurationProvider.getHelloReply();
        if (helloReply != null && (cmpHash = helloReply.getCmpHash()) != null) {
            str = cmpHash;
        }
        Models.Consent.Builder cmpHash2 = uuid.setCmpHash(str);
        HelloReply helloReply2 = configurationProvider.getHelloReply();
        Models.Consent.Builder builderPutAllExternalIds = cmpHash2.setCmpHashVersion((helloReply2 == null || (cmpHashVersion = helloReply2.getCmpHashVersion()) == null) ? 0 : cmpHashVersion.intValue()).putAllExternalIds(consentProvider.getExternalIds());
        if (state.getConsents().getType() != null) {
            builderPutAllExternalIds.setType(ExtensionKt.toEnumConsentType(state.getConsents().getType().intValue()));
        }
        Models.Consent consentBuild = builderPutAllExternalIds.build();
        e0.checkNotNullExpressionValue(consentBuild, "consentBuilder.build()");
        return consentBuild;
    }

    public static final boolean vendorAllowed(State state, int i10) {
        ConsentReducer consents;
        List<VendorReducer> vendors;
        if (state != null && (consents = state.getConsents()) != null && (vendors = consents.getVendors()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = vendors.iterator();
            while (it.hasNext()) {
                Integer iabId = ((VendorReducer) it.next()).getIabId();
                if (iabId != null) {
                    arrayList.add(iabId);
                }
            }
            if (arrayList.contains(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }
}
