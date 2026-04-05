package com.inmobi.media;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ub {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32363a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32365c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32366d;

    /* renamed from: e, reason: collision with root package name */
    public final C2818i7 f32367e;

    /* renamed from: f, reason: collision with root package name */
    public final C2840jd f32368f;

    /* renamed from: g, reason: collision with root package name */
    public final List f32369g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f32370h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f32371i;

    /* renamed from: j, reason: collision with root package name */
    public String f32372j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f32373k;

    public Ub(Context context, double d10, EnumC2784g7 logLevel, long j10, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
        this.f32363a = context;
        this.f32364b = j10;
        this.f32365c = i10;
        this.f32366d = z10;
        this.f32367e = new C2818i7(logLevel);
        this.f32368f = new C2840jd(d10);
        this.f32369g = Collections.synchronizedList(new ArrayList());
        this.f32370h = new ConcurrentHashMap();
        this.f32371i = new AtomicBoolean(false);
        this.f32372j = "";
        this.f32373k = new AtomicInteger(0);
    }

    public final void a(EnumC2784g7 logLevel, String tag, String message) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        if (this.f32371i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = AbstractC2834j7.f32963a;
        kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", AbstractC2834j7.f32963a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
        io.bidmachine.media3.exoplayer.b1 runnable = new io.bidmachine.media3.exoplayer.b1(this, 23, logLevel, jSONObject);
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2969r7.f33307a.submit(runnable);
    }

    public final void b() {
        Objects.toString(this.f32371i);
        if ((this.f32366d || this.f32368f.a()) && !this.f32371i.getAndSet(true)) {
            ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
            zk.b0 runnable = new zk.b0(this, 1);
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            AbstractC2969r7.f33307a.submit(runnable);
        }
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f32370h) {
            for (Map.Entry entry : this.f32370h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f32369g;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            List logData2 = this.f32369g;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(logData2, "logData");
            Iterator it = logData2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
        }
        return jSONArray;
    }

    public static final void b(Ub this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Objects.toString(this$0.f32371i);
        ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
        if (tu.z.m7134exceptionOrNullimpl(AbstractC2953q7.a(new Tb(this$0, true))) != null) {
            try {
                tu.z.m7131constructorimpl(tu.x0.f87415a);
            } catch (Throwable th2) {
                int i10 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
    }

    public static final void a(Ub this$0, EnumC2784g7 eventLogLevel, JSONObject data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventLogLevel, "$logLevel");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "$data");
        try {
            C2818i7 c2818i7 = this$0.f32367e;
            c2818i7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(eventLogLevel, "eventLogLevel");
            int iOrdinal = c2818i7.f32927a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new tu.t();
                        }
                        if (eventLogLevel != EnumC2784g7.f32873d) {
                            return;
                        }
                    } else if (eventLogLevel != EnumC2784g7.f32872c && eventLogLevel != EnumC2784g7.f32873d) {
                        return;
                    }
                } else if (eventLogLevel != EnumC2784g7.f32871b && eventLogLevel != EnumC2784g7.f32872c && eventLogLevel != EnumC2784g7.f32873d) {
                    return;
                }
            }
            this$0.f32369g.add(data);
        } catch (Exception e10) {
            this$0.getClass();
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void a() {
        Objects.toString(this.f32371i);
        if ((this.f32366d || this.f32368f.a()) && !this.f32371i.get()) {
            ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
            zk.b0 runnable = new zk.b0(this, 0);
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            AbstractC2969r7.f33307a.submit(runnable);
        }
    }

    public static final void a(Ub this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f32373k.getAndIncrement();
        Objects.toString(this$0.f32371i);
        ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
        if (tu.z.m7134exceptionOrNullimpl(AbstractC2953q7.a(new Tb(this$0, false))) != null) {
            try {
                tu.z.m7131constructorimpl(tu.x0.f87415a);
            } catch (Throwable th2) {
                int i10 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
    }
}
