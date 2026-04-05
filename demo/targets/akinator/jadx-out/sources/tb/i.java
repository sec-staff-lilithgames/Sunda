package tb;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f86726b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f86727c;

    /* renamed from: e, reason: collision with root package name */
    public static final i f86728e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f86729f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f86730g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f86731h;

    static {
        i iVar = new i("ANY", 0);
        f86726b = iVar;
        i iVar2 = new i("NON_PRIVATE", 1);
        f86727c = iVar2;
        i iVar3 = new i("PROTECTED_AND_PUBLIC", 2);
        i iVar4 = new i("PUBLIC_ONLY", 3);
        f86728e = iVar4;
        i iVar5 = new i("NONE", 4);
        f86729f = iVar5;
        i iVar6 = new i("DEFAULT", 5);
        f86730g = iVar6;
        f86731h = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f86731h.clone();
    }

    public boolean isVisible(Member member) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return !Modifier.isPrivate(member.getModifiers());
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return false;
            }
        } else if (Modifier.isProtected(member.getModifiers())) {
            return true;
        }
        return Modifier.isPublic(member.getModifiers());
    }
}
