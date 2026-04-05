package io.odeeo.internal.g;

import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f64163c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f64164a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f64165b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f64163c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) g0.castNonNull(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) g0.castNonNull(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f64164a = i10;
            this.f64165b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.f64164a == -1 || this.f64165b == -1) ? false : true;
    }

    public boolean setFromMetadata(io.odeeo.internal.s.a aVar) {
        for (int i10 = 0; i10 < aVar.length(); i10++) {
            a.b bVar = aVar.get(i10);
            if (bVar instanceof io.odeeo.internal.x.e) {
                io.odeeo.internal.x.e eVar = (io.odeeo.internal.x.e) bVar;
                if ("iTunSMPB".equals(eVar.f67500c) && a(eVar.f67501d)) {
                    return true;
                }
            } else if (bVar instanceof io.odeeo.internal.x.i) {
                io.odeeo.internal.x.i iVar = (io.odeeo.internal.x.i) bVar;
                if ("com.apple.iTunes".equals(iVar.f67512b) && "iTunSMPB".equals(iVar.f67513c) && a(iVar.f67514d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean setFromXingHeaderValue(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f64164a = i11;
        this.f64165b = i12;
        return true;
    }
}
