package s4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final p f85410a;

    /* renamed from: b, reason: collision with root package name */
    public r f85411b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f85412c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f85413d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f85414e;

    /* renamed from: f, reason: collision with root package name */
    public z.g f85415f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f85416g;

    /* renamed from: h, reason: collision with root package name */
    public int f85417h = -16711936;

    /* renamed from: i, reason: collision with root package name */
    public int f85418i = 0;

    /* renamed from: j, reason: collision with root package name */
    public m f85419j = new g();

    public k(p pVar) {
        w3.i.checkNotNull(pVar, "metadataLoader cannot be null.");
        this.f85410a = pVar;
    }

    public k registerInitCallback(n nVar) {
        w3.i.checkNotNull(nVar, "initCallback cannot be null");
        if (this.f85415f == null) {
            this.f85415f = new z.g();
        }
        this.f85415f.add(nVar);
        return this;
    }

    public k setEmojiSpanIndicatorColor(int i10) {
        this.f85417h = i10;
        return this;
    }

    public k setEmojiSpanIndicatorEnabled(boolean z10) {
        this.f85416g = z10;
        return this;
    }

    public k setGlyphChecker(m mVar) {
        w3.i.checkNotNull(mVar, "GlyphChecker cannot be null");
        this.f85419j = mVar;
        return this;
    }

    public k setMetadataLoadStrategy(int i10) {
        this.f85418i = i10;
        return this;
    }

    public k setReplaceAll(boolean z10) {
        this.f85412c = z10;
        return this;
    }

    public k setSpanFactory(r rVar) {
        this.f85411b = rVar;
        return this;
    }

    public k setUseEmojiAsDefaultStyle(boolean z10) {
        return setUseEmojiAsDefaultStyle(z10, null);
    }

    public k unregisterInitCallback(n nVar) {
        w3.i.checkNotNull(nVar, "initCallback cannot be null");
        z.g gVar = this.f85415f;
        if (gVar != null) {
            gVar.remove(nVar);
        }
        return this;
    }

    public k setUseEmojiAsDefaultStyle(boolean z10, List<Integer> list) {
        this.f85413d = z10;
        if (!z10 || list == null) {
            this.f85414e = null;
            return this;
        }
        this.f85414e = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f85414e[i10] = it.next().intValue();
            i10++;
        }
        Arrays.sort(this.f85414e);
        return this;
    }
}
