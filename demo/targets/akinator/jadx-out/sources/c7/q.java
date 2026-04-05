package c7;

import java.util.Set;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f11849a = c2.setOf((Object[]) new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    public static final boolean isRotated(l lVar) {
        return lVar.getRotationDegrees() > 0;
    }

    public static final boolean isSwapped(l lVar) {
        return lVar.getRotationDegrees() == 90 || lVar.getRotationDegrees() == 270;
    }

    public static final boolean supports(n nVar, String str) {
        int i10 = p.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i10 == 1) {
            return str != null && f11849a.contains(str);
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new tu.t();
    }
}
