package com.explorestack.protobuf;

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
/* loaded from: classes5.dex */
public class bd {

    /* renamed from: e, reason: collision with root package name */
    public static final bd f21955e;

    /* renamed from: f, reason: collision with root package name */
    public static final xc f21956f;

    /* renamed from: g, reason: collision with root package name */
    public static final yc f21957g;

    /* renamed from: h, reason: collision with root package name */
    public static final zc f21958h;

    /* renamed from: i, reason: collision with root package name */
    public static final bd f21959i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ bd[] f21960j;

    /* renamed from: b, reason: collision with root package name */
    public final cd f21961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21962c;

    /* JADX INFO: Fake field, exist only in values array */
    bd EF0;

    /* JADX INFO: Fake field, exist only in values array */
    bd EF1;

    /* JADX INFO: Fake field, exist only in values array */
    bd EF2;

    static {
        bd bdVar = new bd("DOUBLE", 0, cd.DOUBLE, 1);
        bd bdVar2 = new bd("FLOAT", 1, cd.FLOAT, 5);
        cd cdVar = cd.LONG;
        bd bdVar3 = new bd("INT64", 2, cdVar, 0);
        bd bdVar4 = new bd("UINT64", 3, cdVar, 0);
        cd cdVar2 = cd.INT;
        bd bdVar5 = new bd("INT32", 4, cdVar2, 0);
        f21955e = bdVar5;
        bd bdVar6 = new bd("FIXED64", 5, cdVar, 1);
        bd bdVar7 = new bd("FIXED32", 6, cdVar2, 5);
        bd bdVar8 = new bd("BOOL", 7, cd.BOOLEAN, 0);
        xc xcVar = new xc("STRING", 8, cd.STRING, 2);
        f21956f = xcVar;
        cd cdVar3 = cd.MESSAGE;
        yc ycVar = new yc("GROUP", 9, cdVar3, 3);
        f21957g = ycVar;
        zc zcVar = new zc("MESSAGE", 10, cdVar3, 2);
        f21958h = zcVar;
        ad adVar = new ad("BYTES", 11, cd.BYTE_STRING, 2);
        bd bdVar9 = new bd("UINT32", 12, cdVar2, 0);
        bd bdVar10 = new bd("ENUM", 13, cd.ENUM, 0);
        f21959i = bdVar10;
        f21960j = new bd[]{bdVar, bdVar2, bdVar3, bdVar4, bdVar5, bdVar6, bdVar7, bdVar8, xcVar, ycVar, zcVar, adVar, bdVar9, bdVar10, new bd("SFIXED32", 14, cdVar2, 5), new bd("SFIXED64", 15, cdVar, 1), new bd("SINT32", 16, cdVar2, 0), new bd("SINT64", 17, cdVar, 0)};
    }

    public bd(String str, int i10, cd cdVar, int i11) {
        this.f21961b = cdVar;
        this.f21962c = i11;
    }

    public static bd valueOf(String str) {
        return (bd) Enum.valueOf(bd.class, str);
    }

    public static bd[] values() {
        return (bd[]) f21960j.clone();
    }

    public cd getJavaType() {
        return this.f21961b;
    }

    public int getWireType() {
        return this.f21962c;
    }

    public boolean isPackable() {
        return true;
    }
}
