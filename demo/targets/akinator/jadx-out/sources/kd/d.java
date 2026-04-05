package kd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import ld.g0;
import ld.h0;
import ld.i0;
import ld.j0;
import ld.k0;
import ld.l0;
import ld.m0;
import ld.n0;
import ld.o0;
import ld.p0;
import ld.r0;
import ld.s0;
import ld.t0;
import ld.u0;
import md.t;
import md.u;
import nd.g;
import nd.i;
import nd.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements o {

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f70816b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f70817c;

    /* renamed from: e, reason: collision with root package name */
    public final xd.a f70819e;

    /* renamed from: f, reason: collision with root package name */
    public final xd.a f70820f;

    /* renamed from: a, reason: collision with root package name */
    public final ui.a f70815a = g0.createDataEncoder();

    /* renamed from: d, reason: collision with root package name */
    public final URL f70818d = a(a.f70803c);

    /* renamed from: g, reason: collision with root package name */
    public final int f70821g = 130000;

    public d(Context context, xd.a aVar, xd.a aVar2) {
        this.f70817c = context;
        this.f70816b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f70819e = aVar2;
        this.f70820f = aVar;
    }

    public static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a.b.k("Invalid url: ", str), e10);
        }
    }

    @Override // nd.o
    public u decorate(u uVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f70816b.getActiveNetworkInfo();
        u.a aVarAddMetadata = uVar.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata(C3191e4.h.G, Build.DEVICE).addMetadata(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        u.a aVarAddMetadata2 = aVarAddMetadata.addMetadata("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000).addMetadata("net-type", activeNetworkInfo == null ? t0.NONE.getValue() : activeNetworkInfo.getType());
        int i10 = -1;
        if (activeNetworkInfo == null) {
            subtype = s0.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = s0.COMBINED.getValue();
            } else if (s0.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        u.a aVarAddMetadata3 = aVarAddMetadata2.addMetadata("mobile-subtype", subtype).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage());
        Context context = this.f70817c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        u.a aVarAddMetadata4 = aVarAddMetadata3.addMetadata("mcc_mnc", simOperator);
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            rd.a.e("CctTransportBackend", "Unable to find version code for package", e10);
        }
        return aVarAddMetadata4.addMetadata("application_build", Integer.toString(i10)).build();
    }

    @Override // nd.o
    public i send(g gVar) {
        o0.a aVarProtoBuilder;
        HashMap map = new HashMap();
        for (u uVar : gVar.getEvents()) {
            String transportName = uVar.getTransportName();
            if (map.containsKey(transportName)) {
                ((List) map.get(transportName)).add(uVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(uVar);
                map.put(transportName, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            u uVar2 = (u) ((List) entry.getValue()).get(0);
            p0.a clientInfo = p0.builder().setQosTier(u0.DEFAULT).setRequestTimeMs(this.f70820f.getTime()).setRequestUptimeMs(this.f70819e.getTime()).setClientInfo(h0.builder().setClientType(i0.f73243b).setAndroidClientInfo(ld.a.builder().setSdkVersion(Integer.valueOf(uVar2.getInteger("sdk-version"))).setModel(uVar2.get("model")).setHardware(uVar2.get("hardware")).setDevice(uVar2.get(C3191e4.h.G)).setProduct(uVar2.get(AppLovinEventTypes.USER_VIEWED_PRODUCT)).setOsBuild(uVar2.get("os-uild")).setManufacturer(uVar2.get("manufacturer")).setFingerprint(uVar2.get("fingerprint")).setCountry(uVar2.get("country")).setLocale(uVar2.get("locale")).setMccMnc(uVar2.get("mcc_mnc")).setApplicationBuild(uVar2.get("application_build")).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (u uVar3 : (List) entry.getValue()) {
                t encodedPayload = uVar3.getEncodedPayload();
                jd.e encoding = encodedPayload.getEncoding();
                if (encoding.equals(jd.e.of("proto"))) {
                    aVarProtoBuilder = o0.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(jd.e.of("json"))) {
                    aVarProtoBuilder = o0.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName(C.UTF8_NAME)));
                } else {
                    rd.a.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                aVarProtoBuilder.setEventTimeMs(uVar3.getEventMillis()).setEventUptimeMs(uVar3.getUptimeMillis()).setTimezoneOffsetSeconds(uVar3.getLong("tz-offset")).setNetworkConnectionInfo(r0.builder().setNetworkType(t0.forNumber(uVar3.getInteger(KerkSviMAy.LFWIOYU))).setMobileSubtype(s0.forNumber(uVar3.getInteger("mobile-subtype"))).build());
                if (uVar3.getCode() != null) {
                    aVarProtoBuilder.setEventCode(uVar3.getCode());
                }
                if (uVar3.getProductId() != null) {
                    aVarProtoBuilder.setComplianceData(j0.builder().setPrivacyContext(n0.builder().setPrequest(m0.builder().setOriginAssociatedProductId(uVar3.getProductId()).build()).build()).setProductIdOrigin(k0.EVENT_OVERRIDE).build());
                }
                if (uVar3.getExperimentIdsClear() != null || uVar3.getExperimentIdsEncrypted() != null) {
                    l0.a aVarBuilder = l0.builder();
                    if (uVar3.getExperimentIdsClear() != null) {
                        aVarBuilder.setClearBlob(uVar3.getExperimentIdsClear());
                    }
                    if (uVar3.getExperimentIdsEncrypted() != null) {
                        aVarBuilder.setEncryptedBlob(uVar3.getExperimentIdsEncrypted());
                    }
                    aVarProtoBuilder.setExperimentIds(aVarBuilder.build());
                }
                arrayList3.add(aVarProtoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        g0 g0VarCreate = g0.create(arrayList2);
        byte[] extras = gVar.getExtras();
        URL urlA = this.f70818d;
        if (extras != null) {
            try {
                a aVarFromByteArray = a.fromByteArray(gVar.getExtras());
                aPIKey = aVarFromByteArray.getAPIKey() != null ? aVarFromByteArray.getAPIKey() : null;
                if (aVarFromByteArray.getEndPoint() != null) {
                    urlA = a(aVarFromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused2) {
                return i.fatalError();
            }
        }
        try {
            c cVar = (c) sd.b.retry(5, new b(urlA, g0VarCreate, aPIKey), new ha.a(this, 16), new j1.u(12));
            int i10 = cVar.f70812a;
            if (i10 == 200) {
                return i.ok(cVar.f70814c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? i.invalidPayload() : i.fatalError();
            }
            return i.transientError();
        } catch (IOException e10) {
            rd.a.e("CctTransportBackend", "Could not make request to the backend", e10);
            return i.transientError();
        }
    }
}
