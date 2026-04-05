package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class r4 {

    /* renamed from: e, reason: collision with root package name */
    public static final n4 f5979e;

    /* renamed from: f, reason: collision with root package name */
    public static final o4 f5980f;

    /* renamed from: g, reason: collision with root package name */
    public static final p4 f5981g;

    /* renamed from: h, reason: collision with root package name */
    public static final r4 f5982h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r4[] f5983i;

    /* renamed from: b, reason: collision with root package name */
    public final s4 f5984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5985c;

    /* JADX INFO: Fake field, exist only in values array */
    r4 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    r4 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r4 EF2;

    public r4(String str, int i10, s4 s4Var, int i11) {
        this.f5984b = s4Var;
        this.f5985c = i11;
    }

    public static r4 valueOf(String str) {
        return (r4) Enum.valueOf(r4.class, str);
    }

    public static r4[] values() {
        return (r4[]) f5983i.clone();
    }

    public s4 getJavaType() {
        return this.f5984b;
    }

    public int getWireType() {
        return this.f5985c;
    }

    public boolean isPackable() {
        return true;
    }

    static {
        r4 r4Var = new r4("DOUBLE", 0, s4.DOUBLE, 1);
        r4 r4Var2 = new r4("FLOAT", 1, s4.FLOAT, 5);
        s4 s4Var = s4.LONG;
        r4 r4Var3 = new r4("INT64", 2, s4Var, 0);
        r4 r4Var4 = new r4("UINT64", 3, s4Var, 0);
        s4 s4Var2 = s4.INT;
        r4 r4Var5 = new r4("INT32", 4, s4Var2, 0);
        r4 r4Var6 = new r4("FIXED64", 5, s4Var, 1);
        r4 r4Var7 = new r4("FIXED32", 6, s4Var2, 5);
        r4 r4Var8 = new r4("BOOL", 7, s4.BOOLEAN, 0);
        n4 n4Var = new n4("STRING", 8, s4.STRING, 2);
        f5979e = n4Var;
        s4 s4Var3 = s4.MESSAGE;
        o4 o4Var = new o4(SFPXhf.Uzydya, 9, s4Var3, 3);
        f5980f = o4Var;
        p4 p4Var = new p4("MESSAGE", 10, s4Var3, 2);
        f5981g = p4Var;
        q4 q4Var = new q4("BYTES", 11, s4.BYTE_STRING, 2);
        r4 r4Var9 = new r4("UINT32", 12, s4Var2, 0);
        r4 r4Var10 = new r4("ENUM", 13, s4.ENUM, 0);
        f5982h = r4Var10;
        f5983i = new r4[]{r4Var, r4Var2, r4Var3, r4Var4, r4Var5, r4Var6, r4Var7, r4Var8, n4Var, o4Var, p4Var, q4Var, r4Var9, r4Var10, new r4("SFIXED32", 14, s4Var2, 5), new r4("SFIXED64", 15, s4Var, 1), new r4("SINT32", 16, s4Var2, 0), new r4("SINT64", 17, s4Var, 0)};
    }
}
