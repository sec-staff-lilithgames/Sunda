package hi;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f58827b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f58828c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f58829e;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("X86_32", 0);
        i iVar2 = new i("X86_64", 1);
        i iVar3 = new i("ARM_UNKNOWN", 2);
        i iVar4 = new i("PPC", 3);
        i iVar5 = new i("PPC64", 4);
        i iVar6 = new i("ARMV6", 5);
        i iVar7 = new i("ARMV7", 6);
        i iVar8 = new i("UNKNOWN", 7);
        f58827b = iVar8;
        i iVar9 = new i("ARMV7S", 8);
        i iVar10 = new i("ARM64", 9);
        f58829e = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10};
        HashMap map = new HashMap(4);
        f58828c = map;
        map.put("armeabi-v7a", iVar7);
        map.put("armeabi", iVar6);
        map.put("arm64-v8a", iVar10);
        map.put("x86", iVar);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f58829e.clone();
    }
}
