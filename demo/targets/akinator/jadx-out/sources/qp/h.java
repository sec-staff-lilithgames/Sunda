package qp;

import android.text.TextUtils;
import gn.z0;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f83471a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public final b f83472b = new b();

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ hp.i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) {
        d cue;
        m0 m0Var = this.f83471a;
        m0Var.reset(bArr, i11 + i10);
        m0Var.setPosition(i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.validateWebvttHeaderLine(m0Var);
            while (!TextUtils.isEmpty(m0Var.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c10 = 65535;
                int position = 0;
                while (c10 == 65535) {
                    position = m0Var.getPosition();
                    String line = m0Var.readLine();
                    c10 = line == null ? (char) 0 : "STYLE".equals(line) ? (char) 2 : line.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                m0Var.setPosition(position);
                if (c10 == 0) {
                    hp.f.toCuesWithTiming(new j(arrayList2), rVar, kVar);
                    return;
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(m0Var.readLine())) {
                    }
                } else if (c10 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    m0Var.readLine();
                    arrayList.addAll(this.f83472b.parseBlock(m0Var));
                } else if (c10 == 3 && (cue = g.parseCue(m0Var, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (z0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
