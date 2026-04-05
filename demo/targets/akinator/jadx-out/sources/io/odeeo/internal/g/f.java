package io.odeeo.internal.g;

import android.net.Uri;
import io.odeeo.internal.p.c0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements l {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f64125n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: o, reason: collision with root package name */
    public static final a f64126o = new a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f64127b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64128c;

    /* renamed from: d, reason: collision with root package name */
    public int f64129d;

    /* renamed from: e, reason: collision with root package name */
    public int f64130e;

    /* renamed from: f, reason: collision with root package name */
    public int f64131f;

    /* renamed from: g, reason: collision with root package name */
    public int f64132g;

    /* renamed from: h, reason: collision with root package name */
    public int f64133h;

    /* renamed from: i, reason: collision with root package name */
    public int f64134i;

    /* renamed from: j, reason: collision with root package name */
    public int f64135j;

    /* renamed from: l, reason: collision with root package name */
    public int f64137l;

    /* renamed from: k, reason: collision with root package name */
    public int f64136k = 1;

    /* renamed from: m, reason: collision with root package name */
    public int f64138m = 112800;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f64139a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        public Constructor<? extends h> f64140b;

        public final Constructor<? extends h> a() {
            synchronized (this.f64139a) {
                if (this.f64139a.get()) {
                    return this.f64140b;
                }
                try {
                    if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                        this.f64140b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
                this.f64139a.set(true);
                return this.f64140b;
            }
        }

        public h getExtractor(int i10) {
            Constructor<? extends h> constructorA = a();
            if (constructorA == null) {
                return null;
            }
            try {
                return constructorA.newInstance(Integer.valueOf(i10));
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }
    }

    public final void a(int i10, List<h> list) {
        switch (i10) {
            case 0:
                list.add(new io.odeeo.internal.p.a());
                break;
            case 1:
                list.add(new io.odeeo.internal.p.c());
                break;
            case 2:
                list.add(new io.odeeo.internal.p.e((this.f64128c ? 2 : 0) | this.f64129d | (this.f64127b ? 1 : 0)));
                break;
            case 3:
                list.add(new io.odeeo.internal.h.a((this.f64128c ? 2 : 0) | this.f64130e | (this.f64127b ? 1 : 0)));
                break;
            case 4:
                h extractor = f64126o.getExtractor(this.f64131f);
                if (extractor == null) {
                    list.add(new io.odeeo.internal.i.b(this.f64131f));
                    break;
                } else {
                    list.add(extractor);
                    break;
                }
            case 5:
                list.add(new io.odeeo.internal.j.b());
                break;
            case 6:
                list.add(new io.odeeo.internal.l.d(this.f64132g));
                break;
            case 7:
                list.add(new io.odeeo.internal.m.d((this.f64128c ? 2 : 0) | this.f64135j | (this.f64127b ? 1 : 0)));
                break;
            case 8:
                list.add(new io.odeeo.internal.n.e(this.f64134i));
                list.add(new io.odeeo.internal.n.g(this.f64133h));
                break;
            case 9:
                list.add(new io.odeeo.internal.o.c());
                break;
            case 10:
                list.add(new io.odeeo.internal.p.w());
                break;
            case 11:
                list.add(new c0(this.f64136k, this.f64137l, this.f64138m));
                break;
            case 12:
                list.add(new io.odeeo.internal.q.a());
                break;
            case 14:
                list.add(new io.odeeo.internal.k.a());
                break;
        }
    }

    @Override // io.odeeo.internal.g.l
    public synchronized h[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    public synchronized f setAdtsExtractorFlags(int i10) {
        this.f64129d = i10;
        return this;
    }

    public synchronized f setAmrExtractorFlags(int i10) {
        this.f64130e = i10;
        return this;
    }

    public synchronized f setConstantBitrateSeekingAlwaysEnabled(boolean z10) {
        this.f64128c = z10;
        return this;
    }

    public synchronized f setConstantBitrateSeekingEnabled(boolean z10) {
        this.f64127b = z10;
        return this;
    }

    public synchronized f setFlacExtractorFlags(int i10) {
        this.f64131f = i10;
        return this;
    }

    public synchronized f setFragmentedMp4ExtractorFlags(int i10) {
        this.f64134i = i10;
        return this;
    }

    public synchronized f setMatroskaExtractorFlags(int i10) {
        this.f64132g = i10;
        return this;
    }

    public synchronized f setMp3ExtractorFlags(int i10) {
        this.f64135j = i10;
        return this;
    }

    public synchronized f setMp4ExtractorFlags(int i10) {
        this.f64133h = i10;
        return this;
    }

    public synchronized f setTsExtractorFlags(int i10) {
        this.f64137l = i10;
        return this;
    }

    public synchronized f setTsExtractorMode(int i10) {
        this.f64136k = i10;
        return this;
    }

    public synchronized f setTsExtractorTimestampSearchBytes(int i10) {
        this.f64138m = i10;
        return this;
    }

    @Override // io.odeeo.internal.g.l
    public synchronized h[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(14);
            int iInferFileTypeFromResponseHeaders = io.odeeo.internal.q0.k.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                a(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = io.odeeo.internal.q0.k.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                a(iInferFileTypeFromUri, arrayList);
            }
            for (int i10 : f64125n) {
                if (i10 != iInferFileTypeFromResponseHeaders && i10 != iInferFileTypeFromUri) {
                    a(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }
}
