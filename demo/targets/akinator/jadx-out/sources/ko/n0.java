package ko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f71709c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f71710a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f71711b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f71709c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) io.bidmachine.media3.common.util.a1.castNonNull(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) io.bidmachine.media3.common.util.a1.castNonNull(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f71710a = i10;
            this.f71711b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.f71710a == -1 || this.f71711b == -1) ? false : true;
    }

    public boolean setFromMetadata(gn.u0 u0Var) {
        for (int i10 = 0; i10 < u0Var.length(); i10++) {
            gn.t0 t0Var = u0Var.get(i10);
            if (t0Var instanceof yo.e) {
                yo.e eVar = (yo.e) t0Var;
                if ("iTunSMPB".equals(eVar.f94725c) && a(eVar.f94726d)) {
                    return true;
                }
            } else if (t0Var instanceof yo.k) {
                yo.k kVar = (yo.k) t0Var;
                if (VPCjETNfjxu.Ole.equals(kVar.f94738b) && "iTunSMPB".equals(kVar.f94739c) && a(kVar.f94740d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
