package ee;

import android.net.Uri;
import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.z0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements u {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f54224p = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: q, reason: collision with root package name */
    public static final a f54225q = new a(new e6.h0(1));

    /* renamed from: r, reason: collision with root package name */
    public static final a f54226r = new a(new e6.h0(2));

    /* renamed from: b, reason: collision with root package name */
    public boolean f54227b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f54228c;

    /* renamed from: e, reason: collision with root package name */
    public int f54229e;

    /* renamed from: f, reason: collision with root package name */
    public int f54230f;

    /* renamed from: g, reason: collision with root package name */
    public int f54231g;

    /* renamed from: h, reason: collision with root package name */
    public int f54232h;

    /* renamed from: i, reason: collision with root package name */
    public int f54233i;

    /* renamed from: j, reason: collision with root package name */
    public int f54234j;

    /* renamed from: k, reason: collision with root package name */
    public int f54235k;

    /* renamed from: m, reason: collision with root package name */
    public int f54237m;

    /* renamed from: n, reason: collision with root package name */
    public b5 f54238n;

    /* renamed from: l, reason: collision with root package name */
    public int f54236l = 1;

    /* renamed from: o, reason: collision with root package name */
    public int f54239o = 112800;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f54240a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f54241b = new AtomicBoolean(false);

        public a(l lVar) {
            this.f54240a = lVar;
        }

        public p getExtractor(Object... objArr) {
            Constructor<? extends p> constructor;
            synchronized (this.f54241b) {
                if (!this.f54241b.get()) {
                    try {
                        constructor = this.f54240a.getConstructor();
                    } catch (ClassNotFoundException unused) {
                        this.f54241b.set(true);
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
                arrayList.add(new oe.a());
                break;
            case 1:
                arrayList.add(new oe.c());
                break;
            case 2:
                arrayList.add(new oe.e((this.f54228c ? 2 : 0) | this.f54229e | (this.f54227b ? 1 : 0)));
                break;
            case 3:
                arrayList.add(new fe.a((this.f54228c ? 2 : 0) | this.f54230f | (this.f54227b ? 1 : 0)));
                break;
            case 4:
                p extractor = f54225q.getExtractor(Integer.valueOf(this.f54231g));
                if (extractor == null) {
                    arrayList.add(new he.c(this.f54231g));
                    break;
                } else {
                    arrayList.add(extractor);
                    break;
                }
            case 5:
                arrayList.add(new ie.b());
                break;
            case 6:
                arrayList.add(new ke.g(this.f54232h));
                break;
            case 7:
                arrayList.add(new le.d((this.f54228c ? 2 : 0) | this.f54235k | (this.f54227b ? 1 : 0)));
                break;
            case 8:
                arrayList.add(new me.o(this.f54234j));
                arrayList.add(new me.q(this.f54233i));
                break;
            case 9:
                arrayList.add(new ne.e());
                break;
            case 10:
                arrayList.add(new oe.y());
                break;
            case 11:
                if (this.f54238n == null) {
                    this.f54238n = b5.of();
                }
                arrayList.add(new oe.e0(this.f54236l, new h1(0L), new oe.g(this.f54237m, this.f54238n), this.f54239o));
                break;
            case 12:
                arrayList.add(new pe.b());
                break;
            case 14:
                arrayList.add(new je.a());
                break;
            case 15:
                p extractor2 = f54226r.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    arrayList.add(extractor2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new ge.b());
                break;
        }
    }

    @Override // ee.u
    public synchronized p[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    public synchronized m setAdtsExtractorFlags(int i10) {
        this.f54229e = i10;
        return this;
    }

    public synchronized m setAmrExtractorFlags(int i10) {
        this.f54230f = i10;
        return this;
    }

    public synchronized m setConstantBitrateSeekingAlwaysEnabled(boolean z10) {
        this.f54228c = z10;
        return this;
    }

    public synchronized m setConstantBitrateSeekingEnabled(boolean z10) {
        this.f54227b = z10;
        return this;
    }

    public synchronized m setFlacExtractorFlags(int i10) {
        this.f54231g = i10;
        return this;
    }

    public synchronized m setFragmentedMp4ExtractorFlags(int i10) {
        this.f54234j = i10;
        return this;
    }

    public synchronized m setMatroskaExtractorFlags(int i10) {
        this.f54232h = i10;
        return this;
    }

    public synchronized m setMp3ExtractorFlags(int i10) {
        this.f54235k = i10;
        return this;
    }

    public synchronized m setMp4ExtractorFlags(int i10) {
        this.f54233i = i10;
        return this;
    }

    public synchronized m setTsExtractorFlags(int i10) {
        this.f54237m = i10;
        return this;
    }

    public synchronized m setTsExtractorMode(int i10) {
        this.f54236l = i10;
        return this;
    }

    public synchronized m setTsExtractorTimestampSearchBytes(int i10) {
        this.f54239o = i10;
        return this;
    }

    public synchronized m setTsSubtitleFormats(List<z0> list) {
        this.f54238n = b5.copyOf((Collection) list);
        return this;
    }

    @Override // ee.u
    public synchronized p[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f54224p;
            arrayList = new ArrayList(16);
            int iInferFileTypeFromResponseHeaders = com.google.android.exoplayer2.util.n.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                a(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = com.google.android.exoplayer2.util.n.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                a(iInferFileTypeFromUri, arrayList);
            }
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = iArr[i10];
                if (i11 != iInferFileTypeFromResponseHeaders && i11 != iInferFileTypeFromUri) {
                    a(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (p[]) arrayList.toArray(new p[arrayList.size()]);
    }
}
