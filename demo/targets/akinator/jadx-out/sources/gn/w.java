package gn;

import io.bidmachine.media3.common.DrmInitData;
import java.util.Collection;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {
    public n B;
    public int G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public String f58210a;

    /* renamed from: b, reason: collision with root package name */
    public String f58211b;

    /* renamed from: d, reason: collision with root package name */
    public String f58213d;

    /* renamed from: e, reason: collision with root package name */
    public int f58214e;

    /* renamed from: f, reason: collision with root package name */
    public int f58215f;

    /* renamed from: j, reason: collision with root package name */
    public String f58219j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f58220k;

    /* renamed from: l, reason: collision with root package name */
    public Object f58221l;

    /* renamed from: m, reason: collision with root package name */
    public String f58222m;

    /* renamed from: n, reason: collision with root package name */
    public String f58223n;

    /* renamed from: q, reason: collision with root package name */
    public List f58226q;

    /* renamed from: r, reason: collision with root package name */
    public DrmInitData f58227r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f58229t;

    /* renamed from: x, reason: collision with root package name */
    public int f58233x;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f58235z;

    /* renamed from: c, reason: collision with root package name */
    public b5 f58212c = b5.of();

    /* renamed from: h, reason: collision with root package name */
    public int f58217h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f58218i = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f58224o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f58225p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f58228s = Long.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public int f58230u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f58231v = -1;

    /* renamed from: w, reason: collision with root package name */
    public float f58232w = -1.0f;

    /* renamed from: y, reason: collision with root package name */
    public float f58234y = 1.0f;
    public int A = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int I = -1;
    public int J = 1;
    public int K = -1;
    public int L = -1;
    public int M = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f58216g = 0;

    public io.bidmachine.media3.common.b build() {
        return new io.bidmachine.media3.common.b(this);
    }

    public w setAccessibilityChannel(int i10) {
        this.I = i10;
        return this;
    }

    public w setAuxiliaryTrackType(int i10) {
        this.f58216g = i10;
        return this;
    }

    public w setAverageBitrate(int i10) {
        this.f58217h = i10;
        return this;
    }

    public w setChannelCount(int i10) {
        this.D = i10;
        return this;
    }

    public w setCodecs(String str) {
        this.f58219j = str;
        return this;
    }

    public w setColorInfo(n nVar) {
        this.B = nVar;
        return this;
    }

    public w setContainerMimeType(String str) {
        this.f58222m = x0.normalizeMimeType(str);
        return this;
    }

    public w setCryptoType(int i10) {
        this.M = i10;
        return this;
    }

    public w setCueReplacementBehavior(int i10) {
        this.J = i10;
        return this;
    }

    public w setCustomData(Object obj) {
        this.f58221l = obj;
        return this;
    }

    public w setDrmInitData(DrmInitData drmInitData) {
        this.f58227r = drmInitData;
        return this;
    }

    public w setEncoderDelay(int i10) {
        this.G = i10;
        return this;
    }

    public w setEncoderPadding(int i10) {
        this.H = i10;
        return this;
    }

    public w setFrameRate(float f10) {
        this.f58232w = f10;
        return this;
    }

    public w setHasPrerollSamples(boolean z10) {
        this.f58229t = z10;
        return this;
    }

    public w setHeight(int i10) {
        this.f58231v = i10;
        return this;
    }

    public w setId(String str) {
        this.f58210a = str;
        return this;
    }

    public w setInitializationData(List<byte[]> list) {
        this.f58226q = list;
        return this;
    }

    public w setLabel(String str) {
        this.f58211b = str;
        return this;
    }

    public w setLabels(List<z> list) {
        this.f58212c = b5.copyOf((Collection) list);
        return this;
    }

    public w setLanguage(String str) {
        this.f58213d = str;
        return this;
    }

    public w setMaxInputSize(int i10) {
        this.f58224o = i10;
        return this;
    }

    public w setMaxNumReorderSamples(int i10) {
        this.f58225p = i10;
        return this;
    }

    public w setMaxSubLayers(int i10) {
        this.C = i10;
        return this;
    }

    public w setMetadata(u0 u0Var) {
        this.f58220k = u0Var;
        return this;
    }

    public w setPcmEncoding(int i10) {
        this.F = i10;
        return this;
    }

    public w setPeakBitrate(int i10) {
        this.f58218i = i10;
        return this;
    }

    public w setPixelWidthHeightRatio(float f10) {
        this.f58234y = f10;
        return this;
    }

    public w setProjectionData(byte[] bArr) {
        this.f58235z = bArr;
        return this;
    }

    public w setRoleFlags(int i10) {
        this.f58215f = i10;
        return this;
    }

    public w setRotationDegrees(int i10) {
        this.f58233x = i10;
        return this;
    }

    public w setSampleMimeType(String str) {
        this.f58223n = x0.normalizeMimeType(str);
        return this;
    }

    public w setSampleRate(int i10) {
        this.E = i10;
        return this;
    }

    public w setSelectionFlags(int i10) {
        this.f58214e = i10;
        return this;
    }

    public w setStereoMode(int i10) {
        this.A = i10;
        return this;
    }

    public w setSubsampleOffsetUs(long j10) {
        this.f58228s = j10;
        return this;
    }

    public w setTileCountHorizontal(int i10) {
        this.K = i10;
        return this;
    }

    public w setTileCountVertical(int i10) {
        this.L = i10;
        return this;
    }

    public w setWidth(int i10) {
        this.f58230u = i10;
        return this;
    }

    public w setId(int i10) {
        this.f58210a = Integer.toString(i10);
        return this;
    }
}
