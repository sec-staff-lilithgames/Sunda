package tq;

import android.text.TextUtils;
import br.j0;
import br.l0;
import br.n0;
import br.p1;
import cr.o;
import dq.d0;
import ir.s;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final g f87334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87335b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: tq.a$a, reason: collision with other inner class name */
    public static final class C0787a {
        public C0787a(u uVar) {
        }
    }

    static {
        new C0787a(null);
    }

    public a(g eventTaskExecutor, String sourceName) {
        e0.checkNotNullParameter(eventTaskExecutor, "eventTaskExecutor");
        e0.checkNotNullParameter(sourceName, "sourceName");
        this.f87334a = eventTaskExecutor;
        this.f87335b = sourceName;
    }

    public static void b(n0 n0Var, l0 l0Var, String str) {
        d0.a("Event", "Could not find required params (" + str + ") for execute task (" + n0Var + ", " + l0Var + ')', new Object[0]);
    }

    @Override // tq.e
    public void a(n0 eventType, j0 eventTaskParams, Object... params) {
        Long longOrDefault$default;
        String string;
        e0.checkNotNullParameter(eventType, "eventType");
        e0.checkNotNullParameter(eventTaskParams, "eventTaskParams");
        e0.checkNotNullParameter(params, "params");
        l0 eventTaskType = eventTaskParams.getEventTaskType();
        String target = eventTaskParams.getTarget();
        Object value = eventTaskParams.getValue();
        Object[] objArrCopyOf = Arrays.copyOf(params, params.length);
        try {
            int iOrdinal = eventTaskType.ordinal();
            String string2 = null;
            String string3 = null;
            g gVar = this.f87334a;
            switch (iOrdinal) {
                case 0:
                    String string4 = value != null ? value.toString() : null;
                    if (string4 != null && !sv.n0.isBlank(string4)) {
                        c(eventType, eventTaskType, "%s", string4);
                        gVar.g(string4);
                        break;
                    }
                    b(eventType, eventTaskType, "track url");
                    break;
                case 1:
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    Object[] objArrCopyOf3 = Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length);
                    String string5 = value != null ? value.toString() : null;
                    if (!TextUtils.isEmpty(string5) || objArrCopyOf3.length == 0) {
                        string3 = string5;
                    } else {
                        Object obj = objArrCopyOf3[0];
                        if (obj != null) {
                            string3 = obj.toString();
                        }
                    }
                    if (string3 != null && !sv.n0.isBlank(string3)) {
                        c(eventType, eventTaskType, "%s", string3);
                        gVar.b(string3);
                        break;
                    }
                    b(eventType, eventTaskType, "open url");
                    break;
                case 2:
                    Object[] objArrCopyOf4 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    Object[] objArrCopyOf5 = Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length);
                    String string6 = value != null ? value.toString() : null;
                    if (!TextUtils.isEmpty(string6) || objArrCopyOf5.length == 0) {
                        string2 = string6;
                    } else {
                        Object obj2 = objArrCopyOf5[0];
                        if (obj2 != null) {
                            string2 = obj2.toString();
                        }
                    }
                    if (string2 != null && !sv.n0.isBlank(string2)) {
                        c(eventType, eventTaskType, "%s", string2);
                        gVar.d(string2);
                        break;
                    }
                    b(eventType, eventTaskType, "notify open url");
                    break;
                case 3:
                    c(eventType, eventTaskType, null, new Object[0]);
                    gVar.e();
                    break;
                case 4:
                    c(eventType, eventTaskType, null, new Object[0]);
                    gVar.b();
                    break;
                case 5:
                    Object[] objArrCopyOf6 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    c(eventType, eventTaskType, "target - %s", target);
                    Object objFirstOrNull = k0.firstOrNull(objArrCopyOf6);
                    gVar.c(target, objFirstOrNull != null ? s.toIntOrDefault$default(objFirstOrNull, null, 1, null) : null);
                    break;
                case 6:
                    Object[] objArrCopyOf7 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    c(eventType, eventTaskType, "target - %s", target);
                    Object objFirstOrNull2 = k0.firstOrNull(objArrCopyOf7);
                    gVar.d(target, objFirstOrNull2 != null ? s.toIntOrDefault$default(objFirstOrNull2, null, 1, null) : null);
                    break;
                case 7:
                    c(eventType, eventTaskType, "target - %s", target);
                    gVar.c(target);
                    break;
                case 8:
                    Object[] objArrCopyOf8 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    c(eventType, eventTaskType, "target - %s", target);
                    Object objFirstOrNull3 = k0.firstOrNull(objArrCopyOf8);
                    gVar.b(target, objFirstOrNull3 != null ? s.toIntOrDefault$default(objFirstOrNull3, null, 1, null) : null);
                    break;
                case 9:
                    Object[] objArrCopyOf9 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    c(eventType, eventTaskType, "target - %s", target);
                    Object objFirstOrNull4 = k0.firstOrNull(objArrCopyOf9);
                    gVar.a(target, objFirstOrNull4 != null ? s.toIntOrDefault$default(objFirstOrNull4, null, 1, null) : null);
                    break;
                case 10:
                    Object[] objArrCopyOf10 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    if (objArrCopyOf10.length >= 2) {
                        Long longOrDefault$default2 = s.toLongOrDefault$default(objArrCopyOf10[0], null, 1, null);
                        long jLongValue = longOrDefault$default2 != null ? longOrDefault$default2.longValue() : Long.MIN_VALUE;
                        Long longOrDefault$default3 = s.toLongOrDefault$default(objArrCopyOf10[1], null, 1, null);
                        long jLongValue2 = longOrDefault$default3 != null ? longOrDefault$default3.longValue() : Long.MIN_VALUE;
                        if (jLongValue >= 1 && jLongValue2 >= 0) {
                            this.f87334a.a(target, jLongValue, jLongValue2, (jLongValue2 * 100.0f) / jLongValue);
                            break;
                        }
                        b(eventType, eventTaskType, "maxProgressMs, currentProgressMs");
                        break;
                    } else {
                        b(eventType, eventTaskType, "progress parameters");
                        break;
                    }
                    break;
                case 11:
                    if (value != null && (longOrDefault$default = s.toLongOrDefault$default(value, null, 1, null)) != null) {
                        jLongValue = longOrDefault$default.longValue();
                    }
                    if (jLongValue >= 0) {
                        c(eventType, eventTaskType, "target - %s, timeMs - %s", target, Long.valueOf(jLongValue));
                        gVar.a(target, jLongValue);
                        break;
                    } else {
                        b(eventType, eventTaskType, "schedule time");
                        break;
                    }
                    break;
                case 12:
                    if (value != null && (string = value.toString()) != null) {
                        c(eventType, eventTaskType, "target - %s, value - %s", target, string);
                        gVar.a(target, string);
                        break;
                    }
                    break;
                case 13:
                    Object[] objArrCopyOf11 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    Boolean booleanOrDefault$default = s.toBooleanOrDefault$default(value, null, 1, null);
                    if (booleanOrDefault$default == null && objArrCopyOf11.length != 0) {
                        booleanOrDefault$default = s.toBooleanOrDefault$default(objArrCopyOf11[0], null, 1, null);
                    }
                    if (booleanOrDefault$default != null) {
                        c(eventType, eventTaskType, "target - %s, lockVisibility - %s", target, booleanOrDefault$default);
                        gVar.a(target, booleanOrDefault$default.booleanValue());
                        break;
                    } else {
                        b(eventType, eventTaskType, "visibility value");
                        break;
                    }
                    break;
                case 14:
                    c(eventType, eventTaskType, "target - %s", target);
                    gVar.e(target);
                    break;
                case 15:
                    c(eventType, eventTaskType, "target - %s", target);
                    gVar.f(target);
                    break;
                case 16:
                    String string7 = value != null ? value.toString() : null;
                    if (string7 != null && !sv.n0.isBlank(string7)) {
                        p1 json = o.parseJson(string7);
                        if (json != null) {
                            c(eventType, eventTaskType, "%s", string7);
                            gVar.a(json);
                            break;
                        } else {
                            b(eventType, eventTaskType, "value");
                            break;
                        }
                    }
                    b(eventType, eventTaskType, "value");
                    break;
                case 17:
                    String string8 = value != null ? value.toString() : null;
                    if (string8 != null && !sv.n0.isBlank(string8)) {
                        c(eventType, eventTaskType, "%s", string8);
                        gVar.a(string8);
                        break;
                    }
                    b(eventType, eventTaskType, "state groups value");
                    break;
            }
        } catch (Throwable th2) {
            d0.b(th2);
        }
    }

    public final void c(n0 n0Var, l0 l0Var, String str, Object... objArr) {
        if (d0.a()) {
            String str2 = this.f87335b;
            if (str == null) {
                d0.b("Event", "Event - " + n0Var.getKey() + " (source - " + str2 + "), Task - " + l0Var.getKey(), new Object[0]);
                return;
            }
            try {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                e0.checkNotNullExpressionValue(str3, "format(format, *args)");
                d0.b("Event", "Event - " + n0Var.getKey() + " (source - " + str2 + "), Task - " + l0Var.getKey() + " (" + str3 + ')', new Object[0]);
            } catch (Throwable th2) {
                d0.b(th2);
            }
        }
    }
}
