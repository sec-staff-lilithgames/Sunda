package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.ironsource.C3422r4;
import com.ironsource.mediationsdk.logger.IronLog;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import sv.x;
import tu.v;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlaySegment {
    public static final a Companion = new a(null);
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String SEGMENT_NAME = "segName";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: h, reason: collision with root package name */
    private static final int f50692h = 999999;

    /* renamed from: i, reason: collision with root package name */
    private static final double f50693i = 999999.99d;

    /* renamed from: j, reason: collision with root package name */
    private static final int f50694j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final String f50695k = "custom";

    /* renamed from: c, reason: collision with root package name */
    private boolean f50698c;

    /* renamed from: d, reason: collision with root package name */
    private String f50699d;

    /* renamed from: g, reason: collision with root package name */
    private long f50702g;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<v> f50696a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f50697b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private int f50700e = -1;

    /* renamed from: f, reason: collision with root package name */
    private double f50701f = -1.0d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return new x("^[a-zA-Z0-9]*$").matches(str);
    }

    public final ArrayList<v> getCustoms$mediationsdk_release() {
        return this.f50696a;
    }

    public final double getIapTotal() {
        return this.f50701f;
    }

    public final int getLevel() {
        return this.f50700e;
    }

    public final ArrayList<v> getSegmentData() {
        IronLog.API.info("");
        ArrayList<v> arrayList = new ArrayList<>();
        int i10 = this.f50700e;
        if (i10 != -1) {
            arrayList.add(new v("lvl", String.valueOf(i10)));
        }
        if (this.f50698c) {
            arrayList.add(new v("pay", String.valueOf(isPaying())));
        }
        double d10 = this.f50701f;
        if (d10 != -1.0d) {
            arrayList.add(new v("iapt", String.valueOf(d10)));
        }
        long j10 = this.f50702g;
        if (j10 != 0) {
            arrayList.add(new v("ucd", String.valueOf(j10)));
        }
        String str = this.f50699d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new v(SEGMENT_NAME, str));
        }
        ArrayList<v> arrayList2 = this.f50696a;
        ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(arrayList2, 10));
        for (v vVar : arrayList2) {
            arrayList3.add(new v(o2.j(vVar.getFirst(), "custom_"), vVar.getSecond()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final String getSegmentName() {
        return this.f50699d;
    }

    public final long getUserCreationDate() {
        return this.f50702g;
    }

    public final boolean isPaying() {
        return this.f50697b.get();
    }

    public final void setCustom(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        IronLog.API.info("");
        try {
            if (a(key) && a(key, 1, 32) && a(value) && a(value, 1, 32)) {
                if (this.f50696a.size() >= 5) {
                    this.f50696a.remove(0);
                }
                this.f50696a.add(new v(key, value));
                return;
            }
            IronLog.INTERNAL.warning(key + ", " + value + " must be alphanumeric and 1-32 in length");
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void setIapTotal(double d10) {
        IronLog.API.info("");
        if (0.0d <= d10 && d10 <= f50693i) {
            double d11 = 100;
            this.f50701f = Math.floor(d10 * d11) / d11;
            return;
        }
        IronLog.INTERNAL.warning(d10 + " must be between 0-999999.99");
    }

    public final void setLevel(int i10) {
        IronLog.API.info("");
        if (1 <= i10 && i10 < 1000000) {
            this.f50700e = i10;
            return;
        }
        IronLog.INTERNAL.warning(i10 + " must be between 1-999999");
    }

    public final void setPaying(boolean z10) {
        IronLog.API.info("");
        this.f50698c = true;
        this.f50697b.set(z10);
    }

    public final void setSegmentName(String str) {
        IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.f50699d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j10) {
        IronLog.API.info("");
        if (j10 > 0) {
            this.f50702g = j10;
            return;
        }
        IronLog.INTERNAL.warning(j10 + " is an invalid timestamp");
    }

    public final JSONObject toJson() throws JSONException {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        Iterator<v> it = getSegmentData().iterator();
        while (it.hasNext()) {
            v next = it.next();
            try {
                jSONObject.put((String) next.component1(), (String) next.component2());
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private final boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
