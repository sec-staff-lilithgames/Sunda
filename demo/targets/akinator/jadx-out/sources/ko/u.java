package ko;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u implements e0 {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f71767t = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: u, reason: collision with root package name */
    public static final a f71768u = new a(new j1.u(15));

    /* renamed from: v, reason: collision with root package name */
    public static final a f71769v = new a(new j1.u(16));

    /* renamed from: b, reason: collision with root package name */
    public boolean f71770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f71771c;

    /* renamed from: e, reason: collision with root package name */
    public int f71772e;

    /* renamed from: f, reason: collision with root package name */
    public int f71773f;

    /* renamed from: g, reason: collision with root package name */
    public int f71774g;

    /* renamed from: h, reason: collision with root package name */
    public int f71775h;

    /* renamed from: i, reason: collision with root package name */
    public int f71776i;

    /* renamed from: j, reason: collision with root package name */
    public int f71777j;

    /* renamed from: k, reason: collision with root package name */
    public int f71778k;

    /* renamed from: m, reason: collision with root package name */
    public int f71780m;

    /* renamed from: n, reason: collision with root package name */
    public b5 f71781n;

    /* renamed from: r, reason: collision with root package name */
    public int f71785r;

    /* renamed from: s, reason: collision with root package name */
    public int f71786s;

    /* renamed from: l, reason: collision with root package name */
    public int f71779l = 1;

    /* renamed from: o, reason: collision with root package name */
    public int f71782o = 112800;

    /* renamed from: q, reason: collision with root package name */
    public hp.q f71784q = new hp.e();

    /* renamed from: p, reason: collision with root package name */
    public boolean f71783p = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final t f71787a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f71788b = new AtomicBoolean(false);

        public a(t tVar) {
            this.f71787a = tVar;
        }

        public z getExtractor(Object... objArr) {
            Constructor<? extends z> constructor;
            synchronized (this.f71788b) {
                if (!this.f71788b.get()) {
                    try {
                        constructor = this.f71787a.getConstructor();
                    } catch (ClassNotFoundException unused) {
                        this.f71788b.set(true);
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                constructor = null;
            }
            if (constructor == null) {
                return null;
            }
            try {
                return constructor.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new rp.a());
                break;
            case 1:
                arrayList.add(new rp.c());
                break;
            case 2:
                arrayList.add(new rp.e((this.f71771c ? 2 : 0) | this.f71772e | (this.f71770b ? 1 : 0)));
                break;
            case 3:
                arrayList.add(new lo.a((this.f71771c ? 2 : 0) | this.f71773f | (this.f71770b ? 1 : 0)));
                break;
            case 4:
                z extractor = f71768u.getExtractor(Integer.valueOf(this.f71774g));
                if (extractor == null) {
                    arrayList.add(new po.c(this.f71774g));
                    break;
                } else {
                    arrayList.add(extractor);
                    break;
                }
            case 5:
                arrayList.add(new qo.b());
                break;
            case 6:
                arrayList.add(new cp.h(this.f71784q, (this.f71783p ? 0 : 2) | this.f71775h));
                break;
            case 7:
                arrayList.add(new dp.d((this.f71771c ? 2 : 0) | this.f71778k | (this.f71770b ? 1 : 0)));
                break;
            case 8:
                arrayList.add(new ep.s(this.f71784q, this.f71777j | ep.s.codecsToParseWithinGopSampleDependenciesAsFlags(this.f71785r) | (this.f71783p ? 0 : 32)));
                arrayList.add(new ep.w(this.f71784q, (this.f71783p ? 0 : 16) | this.f71776i | ep.w.codecsToParseWithinGopSampleDependenciesAsFlags(this.f71785r)));
                break;
            case 9:
                arrayList.add(new fp.e());
                break;
            case 10:
                arrayList.add(new rp.c0());
                break;
            case 11:
                if (this.f71781n == null) {
                    this.f71781n = b5.of();
                }
                arrayList.add(new rp.i0(this.f71779l, !this.f71783p ? 1 : 0, this.f71784q, new io.bidmachine.media3.common.util.u0(0L), new rp.g(this.f71780m, this.f71781n), this.f71782o));
                break;
            case 12:
                arrayList.add(new sp.a());
                break;
            case 14:
                arrayList.add(new so.a(this.f71786s));
                break;
            case 15:
                z extractor2 = f71769v.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    arrayList.add(extractor2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new mo.b(!this.f71783p ? 1 : 0, this.f71784q));
                break;
            case 17:
                arrayList.add(new gp.a());
                break;
            case 18:
                arrayList.add(new tp.a());
                break;
            case 19:
                arrayList.add(new oo.a());
                break;
            case 20:
                int i11 = this.f71776i;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    arrayList.add(new ro.a());
                    break;
                }
                break;
            case 21:
                arrayList.add(new no.a());
                break;
        }
    }

    @Override // ko.e0
    /* renamed from: createExtractors */
    public synchronized z[] mo3833createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    public synchronized u setAdtsExtractorFlags(int i10) {
        this.f71772e = i10;
        return this;
    }

    public synchronized u setAmrExtractorFlags(int i10) {
        this.f71773f = i10;
        return this;
    }

    public synchronized u setConstantBitrateSeekingAlwaysEnabled(boolean z10) {
        this.f71771c = z10;
        return this;
    }

    public synchronized u setConstantBitrateSeekingEnabled(boolean z10) {
        this.f71770b = z10;
        return this;
    }

    public synchronized u setFlacExtractorFlags(int i10) {
        this.f71774g = i10;
        return this;
    }

    public synchronized u setFragmentedMp4ExtractorFlags(int i10) {
        this.f71777j = i10;
        return this;
    }

    public synchronized u setJpegExtractorFlags(int i10) {
        this.f71786s = i10;
        return this;
    }

    public synchronized u setMatroskaExtractorFlags(int i10) {
        this.f71775h = i10;
        return this;
    }

    public synchronized u setMp3ExtractorFlags(int i10) {
        this.f71778k = i10;
        return this;
    }

    public synchronized u setMp4ExtractorFlags(int i10) {
        this.f71776i = i10;
        return this;
    }

    @Deprecated
    public synchronized u setTextTrackTranscodingEnabled(boolean z10) {
        return experimentalSetTextTrackTranscodingEnabled(z10);
    }

    public synchronized u setTsExtractorFlags(int i10) {
        this.f71780m = i10;
        return this;
    }

    public synchronized u setTsExtractorMode(int i10) {
        this.f71779l = i10;
        return this;
    }

    public synchronized u setTsExtractorTimestampSearchBytes(int i10) {
        this.f71782o = i10;
        return this;
    }

    public synchronized u setTsSubtitleFormats(List<io.bidmachine.media3.common.b> list) {
        this.f71781n = b5.copyOf((Collection) list);
        return this;
    }

    @Override // ko.e0
    public synchronized z[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f71767t;
            arrayList = new ArrayList(21);
            int iInferFileTypeFromResponseHeaders = gn.t.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                a(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = gn.t.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                a(iInferFileTypeFromUri, arrayList);
            }
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                if (i11 != iInferFileTypeFromResponseHeaders && i11 != iInferFileTypeFromUri) {
                    a(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (z[]) arrayList.toArray(new z[arrayList.size()]);
    }

    @Override // ko.e0
    public synchronized u experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        this.f71785r = i10;
        return this;
    }

    @Override // ko.e0
    @Deprecated
    public synchronized u experimentalSetTextTrackTranscodingEnabled(boolean z10) {
        this.f71783p = z10;
        return this;
    }

    @Override // ko.e0
    public synchronized u setSubtitleParserFactory(hp.q qVar) {
        this.f71784q = qVar;
        return this;
    }
}
