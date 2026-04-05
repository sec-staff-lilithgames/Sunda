package com.explorestack.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class gd {

    /* renamed from: b, reason: collision with root package name */
    public static final dd f22178b;

    /* renamed from: c, reason: collision with root package name */
    public static final ed f22179c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ gd[] f22180e;

    static {
        dd ddVar = new dd();
        f22178b = ddVar;
        ed edVar = new ed();
        f22179c = edVar;
        f22180e = new gd[]{ddVar, edVar, new gd() { // from class: com.explorestack.protobuf.fd
            @Override // com.explorestack.protobuf.gd
            public final Object a(y yVar) {
                return yVar.readBytes();
            }
        }};
    }

    public static gd valueOf(String str) {
        return (gd) Enum.valueOf(gd.class, str);
    }

    public static gd[] values() {
        return (gd[]) f22180e.clone();
    }

    public abstract Object a(y yVar);
}
