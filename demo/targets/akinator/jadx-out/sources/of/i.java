package of;

import android.text.TextUtils;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;
import ef.l;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends ef.i {

    /* renamed from: n, reason: collision with root package name */
    public final v0 f79375n;

    /* renamed from: o, reason: collision with root package name */
    public final c f79376o;

    public i() {
        super("WebvttDecoder");
        this.f79375n = new v0();
        this.f79376o = new c();
    }

    @Override // ef.i
    public final ef.j c(byte[] bArr, int i10, boolean z10) throws l {
        e cue;
        v0 v0Var = this.f79375n;
        v0Var.reset(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            j.validateWebvttHeaderLine(v0Var);
            while (!TextUtils.isEmpty(v0Var.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c10 = 65535;
                int position = 0;
                while (c10 == 65535) {
                    position = v0Var.getPosition();
                    String line = v0Var.readLine();
                    c10 = line == null ? (char) 0 : "STYLE".equals(line) ? (char) 2 : line.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                v0Var.setPosition(position);
                if (c10 == 0) {
                    return new k(arrayList2);
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(v0Var.readLine())) {
                    }
                } else if (c10 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new l("A style block was found after the first cue.");
                    }
                    v0Var.readLine();
                    arrayList.addAll(this.f79376o.parseBlock(v0Var));
                } else if (c10 == 3 && (cue = h.parseCue(v0Var, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (h2 e10) {
            throw new l(e10);
        }
    }
}
