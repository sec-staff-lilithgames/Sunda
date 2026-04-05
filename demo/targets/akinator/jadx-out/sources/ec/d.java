package ec;

import java.io.IOException;
import ub.a0;
import ub.p;
import ub.r;
import ub.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d extends wb.b {
    public static final int Z = r.ALLOW_TRAILING_COMMA.getMask();

    /* renamed from: a0, reason: collision with root package name */
    public static final int f54022a0 = r.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* renamed from: b0, reason: collision with root package name */
    public static final int f54023b0 = r.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* renamed from: c0, reason: collision with root package name */
    public static final int f54024c0 = r.ALLOW_MISSING_VALUES.getMask();

    /* renamed from: d0, reason: collision with root package name */
    public static final int f54025d0 = r.ALLOW_RS_CONTROL_CHAR.getMask();

    /* renamed from: e0, reason: collision with root package name */
    public static final int f54026e0 = r.ALLOW_SINGLE_QUOTES.getMask();

    /* renamed from: f0, reason: collision with root package name */
    public static final int f54027f0 = r.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* renamed from: g0, reason: collision with root package name */
    public static final int f54028g0 = r.ALLOW_COMMENTS.getMask();

    /* renamed from: h0, reason: collision with root package name */
    public static final int f54029h0 = r.ALLOW_YAML_COMMENTS.getMask();

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f54030i0 = cc.d.getInputCodeLatin1();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f54031j0 = cc.d.getInputCodeUtf8();
    public a0 Y;

    public d(cc.h hVar, int i10, a0 a0Var) {
        super(hVar, i10);
        this.Y = a0Var;
    }

    public final boolean a0(int i10) {
        return i10 == 30 && (this.f88362b & f54025d0) != 0;
    }

    @Override // ub.u
    public abstract p currentLocation();

    @Override // ub.u
    public abstract p currentTokenLocation();

    @Override // ub.u
    public a0 getCodec() {
        return this.Y;
    }

    @Override // wb.b, ub.u
    @Deprecated
    public final p getCurrentLocation() {
        return currentLocation();
    }

    @Override // ub.u
    public t getNumberTypeFP() throws IOException {
        return t.f88359f;
    }

    @Override // ub.u
    public final ic.l getReadCapabilities() {
        return wb.b.X;
    }

    @Override // wb.b, ub.u
    @Deprecated
    public final p getTokenLocation() {
        return currentTokenLocation();
    }

    @Override // ub.u
    public void setCodec(a0 a0Var) {
        this.Y = a0Var;
    }
}
