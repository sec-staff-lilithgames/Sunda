package com.inmobi.media;

import com.inmobi.media.C2783g6;
import com.ironsource.C3191e4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2783g6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32869a;

    public C2783g6(long j10) {
        this.f32869a = j10;
    }

    public final void a(final String message, final String exitData, final int i10, final long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(exitData, "exitData");
        ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
        Runnable runnable = new Runnable() { // from class: zk.o0
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C2783g6.a(this.f98158b, j10, message, i10, exitData);
            }
        };
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2969r7.f33307a.submit(runnable);
    }

    public static final void a(C2783g6 c2783g6, long j10, String message, int i10, String exitData) throws JSONException {
        Object objM7131constructorimpl;
        Object objM7131constructorimpl2;
        C2783g6 this$0 = c2783g6;
        long j11 = j10;
        tu.x0 x0Var = tu.x0.f87415a;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.e0.checkNotNullParameter(exitData, "$exitData");
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = J5.f31902a;
        ArrayList arrayList2 = new ArrayList();
        C2749e6 c2749e6 = new C2749e6();
        ArrayList arrayList3 = new ArrayList();
        C2767f7 c2767f7D = AbstractC2807hd.d();
        ArrayList arrayListA = V1.a(c2767f7D, "hasLoggerFinished=0", null, null, null, null, Integer.valueOf(V1.a(c2767f7D, null, null, 63)), 30);
        C2732d6 action = new C2732d6(c2749e6, arrayList3);
        kotlin.jvm.internal.e0.checkNotNullParameter(arrayListA, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        Iterator it = uu.y0.filterNotNull(arrayListA).iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        H5 action2 = new H5(arrayList2);
        kotlin.jvm.internal.e0.checkNotNullParameter(arrayList3, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action2, "action");
        Iterator it2 = uu.y0.filterNotNull(arrayList3).iterator();
        while (it2.hasNext()) {
            action2.invoke(it2.next());
        }
        arrayList.addAll(arrayList2);
        Iterator it3 = arrayList.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next = it3.next();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
            C2833j6 c2833j6 = (C2833j6) next;
            this$0.getClass();
            long j12 = c2833j6.f32962a.f32837c.f32808b;
            if (j11 >= j12 && j11 - j12 <= this$0.f32869a) {
                StringBuilder sbR = a.b.r(i10, "Message - ", message, ", Reason - ", ", Timestamp - ");
                sbR.append(j11);
                sbR.append(", Data - ");
                sbR.append(exitData);
                String message2 = sbR.toString();
                kotlin.jvm.internal.e0.checkNotNullParameter("IncompleteLogFinalizer", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter(message2, "message");
                try {
                    JSONArray jSONArray = c2833j6.f32962a.f32836b;
                    EnumC2784g7 logLevel = EnumC2784g7.f32872c;
                    SimpleDateFormat simpleDateFormat = AbstractC2834j7.f32963a;
                    kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
                    kotlin.jvm.internal.e0.checkNotNullParameter("IncompleteLogFinalizer", "tag");
                    kotlin.jvm.internal.e0.checkNotNullParameter(message2, "message");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scope", "ERROR");
                    jSONObject.put("timestamp", AbstractC2834j7.f32963a.format(new Date()));
                    jSONObject.put("tag", "IncompleteLogFinalizer");
                    jSONObject.put("data", message2);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
                String value = String.valueOf(i10);
                kotlin.jvm.internal.e0.checkNotNullParameter("IncompleteLogFinalizer", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("exitReason", C3191e4.h.W);
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                try {
                    c2833j6.f32962a.f32835a.put("exitReason", value);
                } catch (Exception unused2) {
                }
                kotlin.jvm.internal.e0.checkNotNullParameter("IncompleteLogFinalizer", "tag");
                try {
                    int i11 = tu.z.f87419c;
                    JSONObject jSONObject2 = c2833j6.f32962a.f32835a;
                    kotlin.jvm.internal.e0.checkNotNullParameter(jSONObject2, "<this>");
                    if (!kotlin.jvm.internal.e0.areEqual(jSONObject2.toString(), "{}") && !D2.a(c2833j6.f32962a.f32836b)) {
                        ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
                        AbstractC2953q7.a(new C2817i6(c2833j6));
                    }
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } catch (Throwable th2) {
                    int i12 = tu.z.f87419c;
                    objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                }
                Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
                if (thM7134exceptionOrNullimpl != null) {
                    try {
                        C2796h2 event = new C2796h2(thM7134exceptionOrNullimpl);
                        Y5 y52 = Y5.f32563a;
                        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                        Y5.f32566d.a(event);
                        try {
                            ScheduledExecutorService scheduledExecutorService2 = AbstractC2969r7.f33307a;
                            objM7131constructorimpl2 = tu.z.m7131constructorimpl(tu.z.m7130boximpl(AbstractC2953q7.a(new C2800h6(c2833j6))));
                        } catch (Throwable th3) {
                            int i13 = tu.z.f87419c;
                            objM7131constructorimpl2 = tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
                        }
                        Throwable thM7134exceptionOrNullimpl2 = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl2);
                        if (thM7134exceptionOrNullimpl2 != null) {
                            try {
                                C2796h2 event2 = new C2796h2(thM7134exceptionOrNullimpl2);
                                Y5 y53 = Y5.f32563a;
                                kotlin.jvm.internal.e0.checkNotNullParameter(event2, "event");
                                Y5.f32566d.a(event2);
                                objM7131constructorimpl2 = tu.z.m7131constructorimpl(x0Var);
                            } catch (Throwable th4) {
                                int i14 = tu.z.f87419c;
                                objM7131constructorimpl2 = tu.z.m7131constructorimpl(tu.a0.createFailure(th4));
                            }
                        }
                        tu.z.m7131constructorimpl(tu.z.m7130boximpl(objM7131constructorimpl2));
                    } catch (Throwable th5) {
                        int i15 = tu.z.f87419c;
                        tu.z.m7131constructorimpl(tu.a0.createFailure(th5));
                    }
                }
            }
            this$0 = c2783g6;
            j11 = j10;
        }
    }
}
