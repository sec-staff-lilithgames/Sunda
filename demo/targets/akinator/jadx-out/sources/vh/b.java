package vh;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f89268g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f89269h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f89270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89272c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f89273d;

    /* renamed from: e, reason: collision with root package name */
    public final long f89274e;

    /* renamed from: f, reason: collision with root package name */
    public final long f89275f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f89270a = str;
        this.f89271b = str2;
        this.f89272c = str3;
        this.f89273d = date;
        this.f89274e = j10;
        this.f89275f = j11;
    }

    public static b a(Map map) throws a, NumberFormatException, ParseException {
        d(map);
        try {
            return new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f89269h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    public static void d(Map map) throws a {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 5; i10++) {
            String str = f89268g[i10];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final yh.c b(String str) {
        yh.c cVar = new yh.c();
        cVar.f94560a = str;
        cVar.f94572m = this.f89273d.getTime();
        cVar.f94561b = this.f89270a;
        cVar.f94562c = this.f89271b;
        String str2 = this.f89272c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        cVar.f94563d = str2;
        cVar.f94564e = this.f89274e;
        cVar.f94569j = this.f89275f;
        return cVar;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        map.put("experimentId", this.f89270a);
        map.put("variantId", this.f89271b);
        map.put("triggerEvent", this.f89272c);
        map.put("experimentStartTime", f89269h.format(this.f89273d));
        map.put("triggerTimeoutMillis", Long.toString(this.f89274e));
        map.put("timeToLiveMillis", Long.toString(this.f89275f));
        return map;
    }
}
