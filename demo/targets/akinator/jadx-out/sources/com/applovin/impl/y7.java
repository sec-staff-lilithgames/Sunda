package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class y7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private List f16299a;

    /* renamed from: b, reason: collision with root package name */
    private List f16300b;

    /* renamed from: c, reason: collision with root package name */
    private int f16301c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f16302d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f16303e;

    /* renamed from: f, reason: collision with root package name */
    private r7 f16304f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f16305g;

    private y7() {
        List list = Collections.EMPTY_LIST;
        this.f16299a = list;
        this.f16300b = list;
        this.f16303e = new HashSet();
        this.f16305g = new HashMap();
    }

    public static y7 a(m8 m8Var, y7 y7Var, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        m8 m8VarC;
        r7 r7VarA;
        List listA;
        m8 m8VarC2;
        List listA2;
        m8 m8VarC3;
        int iA;
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (p7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (y7Var == null) {
            try {
                y7Var = new y7(p7Var);
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th2);
                }
                kVar.E().a("VastVideoCreative", th2);
                return null;
            }
        }
        if (y7Var.f16301c == 0 && (m8VarC3 = m8Var.c("Duration")) != null && (iA = a(m8VarC3.d(), kVar)) > 0) {
            y7Var.f16301c = iA;
        }
        m8 m8VarC4 = m8Var.c("MediaFiles");
        if (m8VarC4 != null && (listA2 = a(m8VarC4, kVar)) != null && listA2.size() > 0) {
            List list = y7Var.f16299a;
            if (list != null) {
                listA2.addAll(list);
            }
            y7Var.f16299a = listA2;
        }
        m8 m8VarC5 = m8Var.c("VideoClicks");
        if (m8VarC5 != null) {
            if (y7Var.f16302d == null && (m8VarC2 = m8VarC5.c("ClickThrough")) != null) {
                String strD = m8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    y7Var.f16302d = Uri.parse(strD);
                }
            }
            x7.a(m8VarC5.a("ClickTracking"), y7Var.f16303e, p7Var, kVar);
        }
        m8 m8VarC6 = m8Var.c("Icons");
        if (m8VarC6 != null && (r7VarA = r7.a((m8VarC = m8VarC6.c("Icon")), kVar)) != null) {
            m8 m8VarC7 = m8VarC.c("IconClicks");
            if (m8VarC7 != null && (listA = m8VarC7.a("IconClickTracking")) != null) {
                x7.a(listA, r7VarA.f15198a, p7Var, kVar);
            }
            List listA3 = m8VarC.a("IconViewTracking");
            if (listA3 != null) {
                x7.a(listA3, r7VarA.f15199b, p7Var, kVar);
            }
            y7Var.f16304f = r7VarA;
        }
        x7.a(m8Var, y7Var.f16305g, p7Var, kVar);
        return y7Var;
    }

    public Uri c() {
        return this.f16302d;
    }

    public int d() {
        return this.f16301c;
    }

    public Map e() {
        return this.f16305g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.f16301c != y7Var.f16301c) {
            return false;
        }
        List list = this.f16299a;
        if (list == null ? y7Var.f16299a != null : !list.equals(y7Var.f16299a)) {
            return false;
        }
        Uri uri = this.f16302d;
        if (uri == null ? y7Var.f16302d != null : !uri.equals(y7Var.f16302d)) {
            return false;
        }
        Set set = this.f16303e;
        if (set == null ? y7Var.f16303e != null : !set.equals(y7Var.f16303e)) {
            return false;
        }
        Map map = this.f16305g;
        Map map2 = y7Var.f16305g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public r7 f() {
        return this.f16304f;
    }

    public List g() {
        return this.f16299a;
    }

    public int hashCode() {
        List list = this.f16299a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f16301c) * 31;
        Uri uri = this.f16302d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f16303e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f16305g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f16299a + ", durationSeconds=" + this.f16301c + ", destinationUri=" + this.f16302d + ", clickTrackers=" + this.f16303e + ", eventTrackers=" + this.f16305g + ", industryIcon=" + this.f16304f + AbstractJsonLexerKt.END_OBJ;
    }

    public Set b() {
        return this.f16303e;
    }

    private y7(p7 p7Var) {
        List list = Collections.EMPTY_LIST;
        this.f16299a = list;
        this.f16300b = list;
        this.f16303e = new HashSet();
        this.f16305g = new HashMap();
        this.f16300b = p7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, ":").size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(m8 m8Var, com.applovin.impl.sdk.k kVar) {
        List listA = m8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) kVar.a(v4.I4));
        List<String> listExplode2 = CollectionUtils.explode((String) kVar.a(v4.H4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            z7 z7VarA = z7.a((m8) it.next(), kVar);
            if (z7VarA != null) {
                try {
                    String strC = z7VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(z7VarA);
                    } else {
                        if (((Boolean) kVar.a(v4.J4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(z7VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(z7VarA);
                            }
                        }
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().k("VastVideoCreative", "Video file not supported: " + z7VarA);
                        }
                    }
                } catch (Throwable th2) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + z7VarA, th2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public z7 a(long j10) {
        List list = this.f16299a;
        z7 z7Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f16300b) {
            for (z7 z7Var2 : this.f16299a) {
                String strC = z7Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(z7Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<z7> arrayList2 = arrayList;
        if (zIsEmpty) {
            arrayList2 = this.f16299a;
        }
        Collections.sort(arrayList2, new af.i(3));
        for (z7 z7Var3 : arrayList2) {
            if (z7Var3.b() > j10) {
                break;
            }
            z7Var = z7Var3;
        }
        return z7Var != null ? z7Var : (z7) arrayList2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(z7 z7Var, z7 z7Var2) {
        return Long.compare(z7Var.b(), z7Var2.b());
    }

    public static y7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        y7 y7Var = new y7();
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "video_files");
        y7Var.f16299a = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            z7 z7VarA = z7.a(JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null), kVar);
            if (z7VarA != null) {
                y7Var.f16299a.add(z7VarA);
            }
        }
        y7Var.f16300b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        y7Var.f16301c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        y7Var.f16302d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArrayT2 = b0.e2.t(jSONObject, "click_trackers");
        for (int i11 = 0; i11 < jSONArrayT2.length(); i11++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArrayT2, i11, (JSONObject) null), kVar);
            if (v7VarA != null) {
                y7Var.f16303e.add(v7VarA);
            }
        }
        y7Var.f16304f = r7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArrayT3 = b0.e2.t(jSONObject2, next);
            for (int i12 = 0; i12 < jSONArrayT3.length(); i12++) {
                v7 v7VarA2 = v7.a(JsonUtils.getJSONObject(jSONArrayT3, i12, (JSONObject) null), kVar);
                if (v7VarA2 != null) {
                    hashSet.add(v7VarA2);
                }
            }
            y7Var.f16305g.put(next, hashSet);
        }
        return y7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f16299a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((z7) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f16300b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f16301c);
        Uri uri = this.f16302d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f16303e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((v7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        r7 r7Var = this.f16304f;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", r7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f16305g.keySet()) {
            Set set = (Set) this.f16305g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((v7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
