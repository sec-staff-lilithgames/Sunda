package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.e2;
import com.applovin.impl.g5;
import com.applovin.impl.l7;
import com.applovin.impl.n4;
import com.applovin.impl.p6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final File f15377b = new File(k.o().getFilesDir(), "al/persisted-ads");

    /* renamed from: a, reason: collision with root package name */
    private final k f15378a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements n4 {

        /* renamed from: a, reason: collision with root package name */
        private final String f15379a;

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f15380b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f15381c;

        /* renamed from: d, reason: collision with root package name */
        private final long f15382d;

        /* renamed from: e, reason: collision with root package name */
        private final long f15383e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z10, long j10, long j11) {
            this.f15379a = str;
            this.f15380b = appLovinAdType;
            this.f15381c = z10;
            this.f15382d = j10;
            this.f15383e = j11;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f15383e;
        }

        public long c() {
            return this.f15382d;
        }

        public String d() {
            return this.f15379a + "_" + this.f15380b;
        }

        public String e() {
            return this.f15379a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            if (strE != null ? !strE.equals(strE2) : strE2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeF = f();
            AppLovinAdType appLovinAdTypeF2 = aVar.f();
            return appLovinAdTypeF != null ? appLovinAdTypeF.equals(appLovinAdTypeF2) : appLovinAdTypeF2 == null;
        }

        public AppLovinAdType f() {
            return this.f15380b;
        }

        public boolean g() {
            return this.f15381c;
        }

        public int hashCode() {
            String strE = e();
            int iHashCode = strE == null ? 43 : strE.hashCode();
            AppLovinAdType appLovinAdTypeF = f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeF != null ? appLovinAdTypeF.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j10, long j11) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j10, j11);
        }

        public static a a(JSONObject jSONObject, k kVar) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j10 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j11 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j10, j11);
        }

        @Override // com.applovin.impl.n4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.f15379a);
            JsonUtils.putString(jSONObject, "type", this.f15380b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f15381c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f15382d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f15383e);
            return jSONObject;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.sdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0040c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public c(k kVar) {
        this.f15378a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f15378a.a(v4.Y0)).longValue(), k.n());
        File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f15378a.H().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes(C.UTF8_NAME)), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th2) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f15378a.E().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (b()) {
            this.f15378a.r0().a((g5) new p6(this.f15378a, "persistAd", new s(this, 2, bVar, bVar2)), b6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = f15377b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(a aVar, InterfaceC0040c interfaceC0040c) {
        File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f15378a.r0().a((g5) new p6(this.f15378a, "retrievePersistedAd", new al.a(14, this, fileA, interfaceC0040c, aVar)), b6.b.OTHER);
        } else {
            interfaceC0040c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, InterfaceC0040c interfaceC0040c, a aVar) {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f15378a.H().f(file);
        if (strF == null) {
            interfaceC0040c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f15378a);
            } else {
                bVarA = l7.a(jSONObjectJsonObjectFromJsonString, this.f15378a);
            }
            if (bVarA == null) {
                interfaceC0040c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0040c.a(bVarA, null);
            }
        } catch (Throwable th2) {
            interfaceC0040c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f15378a.E().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f15377b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f15378a.O();
        if (o.a()) {
            this.f15378a.O().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f15378a.g().a(c2.G, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f15378a.O();
        if (o.a()) {
            this.f15378a.O().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = e2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f15378a.g().d(c2.H, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f15377b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z10) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f15377b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
