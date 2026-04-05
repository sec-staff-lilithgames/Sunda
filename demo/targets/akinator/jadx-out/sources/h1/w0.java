package h1;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class w0 implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f58614b;

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f58615c;

    /* renamed from: e, reason: collision with root package name */
    public static final w0 f58616e;

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f58617f;

    /* renamed from: g, reason: collision with root package name */
    public static final w0 f58618g;

    /* renamed from: h, reason: collision with root package name */
    public static final w0 f58619h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w0[] f58620i;

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f58620i.clone();
    }

    @Override // h1.u0
    public boolean getHasFocus() {
        switch (v0.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new tu.t();
        }
    }

    @Override // h1.u0
    public boolean isCaptured() {
        switch (v0.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new tu.t();
        }
    }

    public final boolean isDeactivated() {
        switch (v0.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new tu.t();
        }
    }

    @Override // h1.u0
    public boolean isFocused() {
        switch (v0.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new tu.t();
        }
    }

    static {
        w0 w0Var = new w0("Active", 0);
        f58614b = w0Var;
        w0 w0Var2 = new w0("ActiveParent", 1);
        f58615c = w0Var2;
        w0 w0Var3 = new w0("Captured", 2);
        f58616e = w0Var3;
        w0 w0Var4 = new w0("Deactivated", 3);
        f58617f = w0Var4;
        w0 w0Var5 = new w0(wHkgq.oHey, 4);
        f58618g = w0Var5;
        w0 w0Var6 = new w0("Inactive", 5);
        f58619h = w0Var6;
        f58620i = new w0[]{w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6};
    }
}
