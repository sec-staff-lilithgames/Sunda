package xr;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a5 {

    /* renamed from: e, reason: collision with root package name */
    public static final a5 f92242e;

    /* renamed from: f, reason: collision with root package name */
    public static final a5[] f92243f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a5[] f92244g;

    /* renamed from: b, reason: collision with root package name */
    public final int f92245b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.m6 f92246c;

    /* JADX INFO: Fake field, exist only in values array */
    a5 EF0;

    static {
        wr.m6 m6Var = wr.m6.f91047o;
        a5 a5Var = new a5("NO_ERROR", 0, 0, m6Var);
        wr.m6 m6Var2 = wr.m6.f91046n;
        a5 a5Var2 = new a5("PROTOCOL_ERROR", 1, 1, m6Var2);
        a5 a5Var3 = new a5("INTERNAL_ERROR", 2, 2, m6Var2);
        f92242e = a5Var3;
        f92244g = new a5[]{a5Var, a5Var2, a5Var3, new a5("FLOW_CONTROL_ERROR", 3, 3, m6Var2), new a5("SETTINGS_TIMEOUT", 4, 4, m6Var2), new a5("STREAM_CLOSED", 5, 5, m6Var2), new a5("FRAME_SIZE_ERROR", 6, 6, m6Var2), new a5("REFUSED_STREAM", 7, 7, m6Var), new a5("CANCEL", 8, 8, wr.m6.f91038f), new a5("COMPRESSION_ERROR", 9, 9, m6Var2), new a5("CONNECT_ERROR", 10, 10, m6Var2), new a5("ENHANCE_YOUR_CALM", 11, 11, wr.m6.f91043k.withDescription("Bandwidth exhausted")), new a5("INADEQUATE_SECURITY", 12, 12, wr.m6.f91041i.withDescription("Permission denied as protocol is not secure enough to call")), new a5("HTTP_1_1_REQUIRED", 13, 13, wr.m6.f91039g)};
        a5[] a5VarArrValues = values();
        a5[] a5VarArr = new a5[((int) a5VarArrValues[a5VarArrValues.length - 1].code()) + 1];
        for (a5 a5Var4 : a5VarArrValues) {
            a5VarArr[(int) a5Var4.code()] = a5Var4;
        }
        f92243f = a5VarArr;
    }

    public a5(String str, int i10, int i11, wr.m6 m6Var) {
        this.f92245b = i11;
        String string = "HTTP/2 error code: " + name();
        if (m6Var.getDescription() != null) {
            StringBuilder sbT = a.b.t(string, " (");
            sbT.append(m6Var.getDescription());
            sbT.append(")");
            string = sbT.toString();
        }
        this.f92246c = m6Var.withDescription(string);
    }

    public static a5 forCode(long j10) {
        a5[] a5VarArr = f92243f;
        if (j10 >= a5VarArr.length || j10 < 0) {
            return null;
        }
        return a5VarArr[(int) j10];
    }

    public static wr.m6 statusForCode(long j10) {
        a5 a5VarForCode = forCode(j10);
        if (a5VarForCode != null) {
            return a5VarForCode.status();
        }
        return wr.m6.fromCodeValue(f92242e.status().getCode().value()).withDescription("Unrecognized HTTP/2 error code: " + j10);
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f92244g.clone();
    }

    public long code() {
        return this.f92245b;
    }

    public wr.m6 status() {
        return this.f92246c;
    }
}
