package wr;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m6 {

    /* renamed from: d, reason: collision with root package name */
    public static final List f91036d;

    /* renamed from: e, reason: collision with root package name */
    public static final m6 f91037e;

    /* renamed from: f, reason: collision with root package name */
    public static final m6 f91038f;

    /* renamed from: g, reason: collision with root package name */
    public static final m6 f91039g;

    /* renamed from: h, reason: collision with root package name */
    public static final m6 f91040h;

    /* renamed from: i, reason: collision with root package name */
    public static final m6 f91041i;

    /* renamed from: j, reason: collision with root package name */
    public static final m6 f91042j;

    /* renamed from: k, reason: collision with root package name */
    public static final m6 f91043k;

    /* renamed from: l, reason: collision with root package name */
    public static final m6 f91044l;

    /* renamed from: m, reason: collision with root package name */
    public static final m6 f91045m;

    /* renamed from: n, reason: collision with root package name */
    public static final m6 f91046n;

    /* renamed from: o, reason: collision with root package name */
    public static final m6 f91047o;

    /* renamed from: p, reason: collision with root package name */
    public static final c4 f91048p;

    /* renamed from: q, reason: collision with root package name */
    public static final c4 f91049q;

    /* renamed from: a, reason: collision with root package name */
    public final j6 f91050a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91051b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f91052c;

    static {
        TreeMap treeMap = new TreeMap();
        for (j6 j6Var : j6.values()) {
            m6 m6Var = (m6) treeMap.put(Integer.valueOf(j6Var.value()), new m6(j6Var, null, null));
            if (m6Var != null) {
                throw new IllegalStateException("Code value duplication between " + m6Var.getCode().name() + " & " + j6Var.name());
            }
        }
        f91036d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f91037e = j6.OK.toStatus();
        f91038f = j6.CANCELLED.toStatus();
        f91039g = j6.UNKNOWN.toStatus();
        j6.INVALID_ARGUMENT.toStatus();
        f91040h = j6.DEADLINE_EXCEEDED.toStatus();
        j6.NOT_FOUND.toStatus();
        j6.ALREADY_EXISTS.toStatus();
        f91041i = j6.PERMISSION_DENIED.toStatus();
        f91042j = j6.UNAUTHENTICATED.toStatus();
        f91043k = j6.RESOURCE_EXHAUSTED.toStatus();
        f91044l = j6.FAILED_PRECONDITION.toStatus();
        j6.ABORTED.toStatus();
        j6.OUT_OF_RANGE.toStatus();
        f91045m = j6.UNIMPLEMENTED.toStatus();
        f91046n = j6.INTERNAL.toStatus();
        f91047o = j6.UNAVAILABLE.toStatus();
        j6.DATA_LOSS.toStatus();
        f91048p = new c4("grpc-status", false, new k6());
        f91049q = new c4("grpc-message", false, new l6());
    }

    public m6(j6 j6Var, String str, Throwable th2) {
        this.f91050a = (j6) mh.p1.checkNotNull(j6Var, "code");
        this.f91051b = str;
        this.f91052c = th2;
    }

    public static String a(m6 m6Var) {
        String str = m6Var.f91051b;
        j6 j6Var = m6Var.f91050a;
        if (str == null) {
            return j6Var.toString();
        }
        return j6Var + ": " + m6Var.f91051b;
    }

    public static m6 fromCode(j6 j6Var) {
        return j6Var.toStatus();
    }

    public static m6 fromCodeValue(int i10) {
        if (i10 >= 0) {
            List list = f91036d;
            if (i10 < list.size()) {
                return (m6) list.get(i10);
            }
        }
        return f91039g.withDescription("Unknown code " + i10);
    }

    public static m6 fromThrowable(Throwable th2) {
        for (Throwable cause = (Throwable) mh.p1.checkNotNull(th2, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP); cause != null; cause = cause.getCause()) {
            if (cause instanceof n6) {
                return ((n6) cause).getStatus();
            }
            if (cause instanceof o6) {
                return ((o6) cause).getStatus();
            }
        }
        return f91039g.withCause(th2);
    }

    public static e4 trailersFromThrowable(Throwable th2) {
        for (Throwable cause = (Throwable) mh.p1.checkNotNull(th2, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP); cause != null; cause = cause.getCause()) {
            if (cause instanceof n6) {
                return ((n6) cause).getTrailers();
            }
            if (cause instanceof o6) {
                return ((o6) cause).getTrailers();
            }
        }
        return null;
    }

    public n6 asException() {
        return new n6(this);
    }

    public o6 asRuntimeException() {
        return new o6(this);
    }

    public m6 augmentDescription(String str) {
        if (str == null) {
            return this;
        }
        Throwable th2 = this.f91052c;
        j6 j6Var = this.f91050a;
        String str2 = this.f91051b;
        return str2 == null ? new m6(j6Var, str, th2) : new m6(j6Var, w0.i.d(str2, "\n", str), th2);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Throwable getCause() {
        return this.f91052c;
    }

    public j6 getCode() {
        return this.f91050a;
    }

    public String getDescription() {
        return this.f91051b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isOk() {
        return j6.OK == this.f91050a;
    }

    public String toString() {
        mh.f1 f1VarAdd = mh.g1.toStringHelper(this).add("code", this.f91050a.name()).add("description", this.f91051b);
        Throwable th2 = this.f91052c;
        Object stackTraceAsString = th2;
        if (th2 != null) {
            stackTraceAsString = mh.g3.getStackTraceAsString(th2);
        }
        return f1VarAdd.add("cause", stackTraceAsString).toString();
    }

    public m6 withCause(Throwable th2) {
        return mh.h1.equal(this.f91052c, th2) ? this : new m6(this.f91050a, this.f91051b, th2);
    }

    public m6 withDescription(String str) {
        return mh.h1.equal(this.f91051b, str) ? this : new m6(this.f91050a, str, this.f91052c);
    }

    public n6 asException(e4 e4Var) {
        return new n6(this, e4Var);
    }

    public o6 asRuntimeException(e4 e4Var) {
        return new o6(this, e4Var);
    }
}
