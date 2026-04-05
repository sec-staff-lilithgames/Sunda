package com.inmobi.sdk;

import af.n;
import al.c;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.amazon.device.ads.DTBMetricReport;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC2875le;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.AbstractC2990sb;
import com.inmobi.media.AbstractC3024ub;
import com.inmobi.media.C2724cf;
import com.inmobi.media.C2774fe;
import com.inmobi.media.C2796h2;
import com.inmobi.media.C2822ib;
import com.inmobi.media.C2838jb;
import com.inmobi.media.C2906nb;
import com.inmobi.media.C2923ob;
import com.inmobi.media.C2925od;
import com.inmobi.media.C2926oe;
import com.inmobi.media.C2973rb;
import com.inmobi.media.C5;
import com.inmobi.media.EnumC2993se;
import com.inmobi.media.Ga;
import com.inmobi.media.H6;
import com.inmobi.media.I6;
import com.inmobi.media.M4;
import com.inmobi.media.N6;
import com.inmobi.media.Ne;
import com.inmobi.media.O5;
import com.inmobi.media.P5;
import com.inmobi.media.R3;
import com.inmobi.media.S7;
import com.inmobi.media.Se;
import com.inmobi.media.Y5;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import cv.b;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sv.k0;
import tu.v;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AgeGroup {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup("BELOW_18", 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup("BETWEEN_18_AND_24", 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup("BETWEEN_25_AND_29", 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup("BETWEEN_30_AND_34", 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup("BETWEEN_35_AND_44", 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup("BETWEEN_45_AND_54", 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup("BETWEEN_55_AND_65", 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup("ABOVE_65", 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] ageGroupArr$values = $values();
            $VALUES = ageGroupArr$values;
            $ENTRIES = b.enumEntries(ageGroupArr$values);
        }

        private AgeGroup(String str, int i10, String str2) {
            this.value = str2;
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Education {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] educationArr$values = $values();
            $VALUES = educationArr$values;
            $ENTRIES = b.enumEntries(educationArr$values);
        }

        private Education(String str, int i10, String str2) {
            this.value = str2;
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Gender {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, InneractiveMediationDefs.GENDER_FEMALE);
        public static final Gender MALE = new Gender("MALE", 1, "m");
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] genderArr$values = $values();
            $VALUES = genderArr$values;
            $ENTRIES = b.enumEntries(genderArr$values);
        }

        private Gender(String str, int i10, String str2) {
            this.value = str2;
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LogLevel {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel("NONE", 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] logLevelArr$values = $values();
            $VALUES = logLevelArr$values;
            $ENTRIES = b.enumEntries(logLevelArr$values);
        }

        private LogLevel(String str, int i10) {
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    public static void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        AbstractC2875le.a(new al.a(0, context, sdkInitializationListener, str, jSONObject));
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static void b(SdkInitializationListener sdkInitializationListener, String str) {
        if (sdkInitializationListener != null) {
            AbstractC2875le.a(new n(1, sdkInitializationListener, str));
        }
        if (str != null) {
            e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
            AbstractC2902n7.a((byte) 1, "InMobiSdk", str);
        } else {
            StringBuilder sbA = N6.a("InMobiSdk", "TAG", "InMobi SDK initialized with account id: ");
            sbA.append(C2925od.b());
            AbstractC2902n7.a((byte) 2, "InMobiSdk", sbA.toString());
        }
    }

    public static final void c(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.a(sdkInitializationListener, str);
    }

    public static final String getToken() {
        return getToken(null, null);
    }

    public static final String getVersion() {
        return "10.8.8";
    }

    public static final void init(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, str, jSONObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return C2925od.q();
    }

    public static final void setAge(int i10) {
        Context contextD = C2925od.d();
        if (i10 != Integer.MIN_VALUE) {
            AbstractC3024ub.f33453a = i10;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_age", i10, false, 4, (Object) null);
            }
        }
    }

    public static final void setAgeGroup(AgeGroup group) {
        e0.checkNotNullParameter(group, "group");
        String string = group.toString();
        Locale locale = Locale.ENGLISH;
        String strP = e2.p(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = C2925od.d();
        if (strP != null) {
            AbstractC3024ub.f33455c = strP;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_age_group", strP, false, 4, (Object) null);
            }
        }
    }

    public static final void setApplicationMuted(boolean z10) {
        C2925od.b(z10);
    }

    public static final void setAreaCode(String str) {
        Context contextD = C2925od.d();
        AbstractC3024ub.f33456d = str;
        if (contextD == null || str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6.a(H6.a(contextD, "user_info_store"), "user_area_code", str, false, 4, (Object) null);
    }

    public static final void setEducation(Education education) {
        e0.checkNotNullParameter(education, "education");
        String string = education.toString();
        Locale locale = Locale.ENGLISH;
        String strP = e2.p(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = C2925od.d();
        if (strP != null) {
            AbstractC3024ub.f33463k = strP;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_education", strP, false, 4, (Object) null);
            }
        }
    }

    public static final void setGender(Gender gender) {
        e0.checkNotNullParameter(gender, "gender");
        String string = gender.toString();
        Locale locale = Locale.ENGLISH;
        String strP = e2.p(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = C2925od.d();
        if (strP != null) {
            AbstractC3024ub.f33462j = strP;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_gender", strP, false, 4, (Object) null);
            }
        }
    }

    public static final void setInterests(String str) {
        Context contextD = C2925od.d();
        if (str != null) {
            AbstractC3024ub.f33465m = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_interest", str, false, 4, (Object) null);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean z10) {
        AbstractC3024ub.a(z10);
        Se.f32278a.a(z10);
        if (z10) {
            InMobiUnifiedIdService.reset();
            O5.a();
        }
    }

    public static final void setLanguage(String str) {
        Context contextD = C2925od.d();
        if (str != null) {
            AbstractC3024ub.f33464l = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_language", str, false, 4, (Object) null);
            }
        }
    }

    public static final void setLocation(Location location) {
        Context contextD = C2925od.d();
        if (location != null) {
            AbstractC3024ub.f33466n = location;
            if (contextD != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location.getLatitude());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(location.getLongitude());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append((int) location.getAccuracy());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(location.getTime());
                String string = sb2.toString();
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_location", string, false, 4, (Object) null);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(String str, String str2, String str3) {
        Context contextD = C2925od.d();
        if (str != null) {
            AbstractC3024ub.f33458f = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_city_code", str, false, 4, (Object) null);
            }
        }
        Context contextD2 = C2925od.d();
        if (str2 != null) {
            AbstractC3024ub.f33459g = str2;
            if (contextD2 != null) {
                ConcurrentHashMap concurrentHashMap2 = I6.f31865b;
                I6.a(H6.a(contextD2, "user_info_store"), "user_state_code", str2, false, 4, (Object) null);
            }
        }
        Context contextD3 = C2925od.d();
        if (str3 != null) {
            AbstractC3024ub.f33460h = str3;
            if (contextD3 != null) {
                ConcurrentHashMap concurrentHashMap3 = I6.f31865b;
                I6.a(H6.a(contextD3, "user_info_store"), "user_country_code", str3, false, 4, (Object) null);
            }
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        int i10 = logLevel == null ? -1 : a.f33731a[logLevel.ordinal()];
        if (i10 == 1) {
            AbstractC2902n7.a((byte) 0);
            return;
        }
        if (i10 == 2) {
            AbstractC2902n7.a((byte) 1);
        } else if (i10 != 3) {
            AbstractC2902n7.a((byte) 2);
        } else {
            AbstractC2902n7.a((byte) 2);
        }
    }

    public static final void setPartnerGDPRConsent(JSONObject jSONObject) {
        M4.c(jSONObject);
    }

    public static final void setPublisherProvidedUnifiedId(JSONObject jSONObject) {
        e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Objects.toString(jSONObject);
        C2925od.a(new P5(jSONObject));
    }

    public static final void setYearOfBirth(int i10) {
        Context contextD = C2925od.d();
        if (i10 != Integer.MIN_VALUE) {
            AbstractC3024ub.f33461i = i10;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_yob", i10, false, 4, (Object) null);
            }
        }
    }

    public static final void updateGDPRConsent(JSONObject jSONObject) {
        M4.b(jSONObject);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PublisherSignals {
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        public final Map<String, Object> getPublisherSignals() throws JSONException {
            Map mapEmptyMap;
            ArrayList arrayList;
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                e0.checkNotNullExpressionValue(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC2902n7.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            C2973rb c2973rb = C2973rb.f33316a;
            c2973rb.getClass();
            try {
                SignalsConfig.PublisherConfig publisherConfigB = C2973rb.b();
                Map map = AbstractC2990sb.f33369a;
                e0.checkNotNullParameter(publisherConfigB, "<this>");
                if (!publisherConfigB.getEnableMCO() && !publisherConfigB.getEnableAB()) {
                    return p1.emptyMap();
                }
                try {
                    SignalsConfig.PublisherConfig publisherConfigB2 = C2973rb.b();
                    e0.checkNotNullParameter(publisherConfigB2, "<this>");
                    mapEmptyMap = (publisherConfigB2.getEnableMCO() || publisherConfigB2.getEnableAB()) ? p1.plus(c2973rb.d(), c2973rb.c()) : p1.emptyMap();
                } catch (Exception e10) {
                    Y5 y52 = Y5.f32563a;
                    C2796h2 event = new C2796h2(e10);
                    e0.checkNotNullParameter(event, "event");
                    Y5.f32566d.a(event);
                    mapEmptyMap = p1.emptyMap();
                }
                Map mutableMap = p1.toMutableMap(mapEmptyMap);
                Iterator it = p0.listOf((Object[]) new v[]{tu.e0.to(C2973rb.b().getObj(), "o_i_dep"), tu.e0.to(C2973rb.b().getDirect(), "d_i_dep")}).iterator();
                while (true) {
                    int i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    v vVar = (v) it.next();
                    SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) vVar.component1();
                    String str = (String) vVar.component2();
                    if (baseInputData.getDepth().getEnabled()) {
                        C2973rb c2973rb2 = C2973rb.f33316a;
                        c2973rb2.getClass();
                        JSONArray jSONArrayOptJSONArray = ((JSONObject) C2973rb.f33321f.getValue(c2973rb2, C2973rb.f33317b[1])).optJSONArray(str);
                        if (jSONArrayOptJSONArray != null) {
                            e0.checkNotNull(jSONArrayOptJSONArray);
                            e0.checkNotNullParameter(jSONArrayOptJSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            while (i10 < length) {
                                Object obj = jSONArrayOptJSONArray.get(i10);
                                e0.checkNotNullExpressionValue(obj, "get(...)");
                                arrayList.add(obj);
                                i10++;
                            }
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            e0.checkNotNullParameter(jSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length2 = jSONArray.length();
                            while (i10 < length2) {
                                Object obj2 = jSONArray.get(i10);
                                e0.checkNotNullExpressionValue(obj2, "get(...)");
                                arrayList.add(obj2);
                                i10++;
                            }
                        }
                        mutableMap.put(str, arrayList);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mutableMap.entrySet()) {
                    if (!k0.startsWith$default((String) entry.getKey(), "auto_", false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            } catch (Exception e11) {
                Y5 y53 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e11, NotificationCompat.CATEGORY_EVENT));
                AbstractC2902n7.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return p1.emptyMap();
            }
        }

        public final void putPublisherSignals(Map<String, ? extends Object> map) {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                e0.checkNotNullExpressionValue(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC2902n7.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
            } else if (map != null) {
                C2973rb.f33316a.getClass();
                C2973rb.a(map);
            }
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                C2973rb.f33316a.getClass();
                Context contextD = C2925od.d();
                if (contextD != null) {
                    ExecutorService executor = C2973rb.f33322g;
                    e0.checkNotNullExpressionValue(executor, "executor");
                    AbstractC2990sb.a(executor, new C2906nb(contextD), C2923ob.f33205a);
                    return;
                }
                return;
            }
            String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
            e0.checkNotNullExpressionValue(strAccess$getTAG$p, "access$getTAG$p(...)");
            AbstractC2902n7.a((byte) 1, strAccess$getTAG$p, QFzuMMDfrzagDN.NRCxFcTmgJCf);
        }
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        SdkInitializationListener sdkInitializationListener2;
        if (context == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2774fe.f32846a.a();
        if (C2724cf.f32713a.c()) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, str, i10);
        try {
            M4.b(jSONObject);
            if (strA.length() == 0) {
                INSTANCE.getClass();
                b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!Ga.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !Ga.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
                AbstractC2902n7.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (C2925od.q()) {
                e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
                INSTANCE.getClass();
                b(sdkInitializationListener, null);
                return;
            }
            C2925od c2925od = C2925od.f33208a;
            if (c2925od.i() == 1) {
                e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
                return;
            }
            if (!C2925od.b(context, strA)) {
                e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
                c2925od.s();
                INSTANCE.getClass();
                b(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            C2724cf.f32713a.e(context);
            INSTANCE.getClass();
            a();
            sdkInitializationListener2 = sdkInitializationListener;
            try {
                C2925od.a(new c(context, strA, sdkInitializationListener2, jElapsedRealtime));
            } catch (Exception unused) {
                e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
                C2925od.f33208a.s();
                INSTANCE.getClass();
                b(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
            }
        } catch (Exception unused2) {
            sdkInitializationListener2 = sdkInitializationListener;
        }
    }

    public static final String getToken(Map<String, String> map, String str) {
        return Ne.a(map, str);
    }

    public static final void setPostalCode(String str) {
        Context contextD = C2925od.d();
        if (str != null) {
            AbstractC3024ub.f33457e = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), QGjYBESwAiCc.twvMDhpnIk, str, false, 4, (Object) null);
            }
        }
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (Ga.a(C2925od.d(), str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
        AbstractC2902n7.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static final void a(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10) {
        try {
            C2724cf c2724cf = C2724cf.f32713a;
            c2724cf.a(context);
            C2925od c2925od = C2925od.f33208a;
            c2925od.a();
            c2925od.b(str);
            c2724cf.c(context);
            c2925od.t();
            INSTANCE.getClass();
            b(sdkInitializationListener, null);
            C2973rb.f33316a.getClass();
            ExecutorService executor = C2973rb.f33322g;
            e0.checkNotNullExpressionValue(executor, "executor");
            AbstractC2990sb.a(executor, C2822ib.f32931a, C2838jb.f32979a);
            LinkedHashMap linkedHashMapA = a(j10);
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("SdkInitialized", linkedHashMapA, EnumC2993se.f33373a);
            InMobiUnifiedIdService.push(null);
        } catch (Exception unused) {
            e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
            C2925od.f33208a.s();
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    public final void a(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        e0.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Objects.toString(linkedHashMap.get(DTBMetricReport.LATENCY));
        linkedHashMap.put("networkType", R3.x());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        C2925od.a(new al.b(0));
    }
}
