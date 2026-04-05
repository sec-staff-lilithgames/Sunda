package com.google.android.exoplayer2;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 {
    public int A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public String f28738a;

    /* renamed from: b, reason: collision with root package name */
    public String f28739b;

    /* renamed from: c, reason: collision with root package name */
    public String f28740c;

    /* renamed from: d, reason: collision with root package name */
    public int f28741d;

    /* renamed from: e, reason: collision with root package name */
    public int f28742e;

    /* renamed from: h, reason: collision with root package name */
    public String f28745h;

    /* renamed from: i, reason: collision with root package name */
    public Metadata f28746i;

    /* renamed from: j, reason: collision with root package name */
    public String f28747j;

    /* renamed from: k, reason: collision with root package name */
    public String f28748k;

    /* renamed from: m, reason: collision with root package name */
    public List f28750m;

    /* renamed from: n, reason: collision with root package name */
    public DrmInitData f28751n;

    /* renamed from: s, reason: collision with root package name */
    public int f28756s;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f28758u;

    /* renamed from: w, reason: collision with root package name */
    public sf.b f28760w;

    /* renamed from: f, reason: collision with root package name */
    public int f28743f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f28744g = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f28749l = -1;

    /* renamed from: o, reason: collision with root package name */
    public long f28752o = Long.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f28753p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f28754q = -1;

    /* renamed from: r, reason: collision with root package name */
    public float f28755r = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    public float f28757t = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public int f28759v = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f28761x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f28762y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f28763z = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = 0;

    public z0 build() {
        return new z0(this);
    }

    public y0 setAccessibilityChannel(int i10) {
        this.C = i10;
        return this;
    }

    public y0 setAverageBitrate(int i10) {
        this.f28743f = i10;
        return this;
    }

    public y0 setChannelCount(int i10) {
        this.f28761x = i10;
        return this;
    }

    public y0 setCodecs(String str) {
        this.f28745h = str;
        return this;
    }

    public y0 setColorInfo(sf.b bVar) {
        this.f28760w = bVar;
        return this;
    }

    public y0 setContainerMimeType(String str) {
        this.f28747j = str;
        return this;
    }

    public y0 setCryptoType(int i10) {
        this.F = i10;
        return this;
    }

    public y0 setDrmInitData(DrmInitData drmInitData) {
        this.f28751n = drmInitData;
        return this;
    }

    public y0 setEncoderDelay(int i10) {
        this.A = i10;
        return this;
    }

    public y0 setEncoderPadding(int i10) {
        this.B = i10;
        return this;
    }

    public y0 setFrameRate(float f10) {
        this.f28755r = f10;
        return this;
    }

    public y0 setHeight(int i10) {
        this.f28754q = i10;
        return this;
    }

    public y0 setId(String str) {
        this.f28738a = str;
        return this;
    }

    public y0 setInitializationData(List<byte[]> list) {
        this.f28750m = list;
        return this;
    }

    public y0 setLabel(String str) {
        this.f28739b = str;
        return this;
    }

    public y0 setLanguage(String str) {
        this.f28740c = str;
        return this;
    }

    public y0 setMaxInputSize(int i10) {
        this.f28749l = i10;
        return this;
    }

    public y0 setMetadata(Metadata metadata) {
        this.f28746i = metadata;
        return this;
    }

    public y0 setPcmEncoding(int i10) {
        this.f28763z = i10;
        return this;
    }

    public y0 setPeakBitrate(int i10) {
        this.f28744g = i10;
        return this;
    }

    public y0 setPixelWidthHeightRatio(float f10) {
        this.f28757t = f10;
        return this;
    }

    public y0 setProjectionData(byte[] bArr) {
        this.f28758u = bArr;
        return this;
    }

    public y0 setRoleFlags(int i10) {
        this.f28742e = i10;
        return this;
    }

    public y0 setRotationDegrees(int i10) {
        this.f28756s = i10;
        return this;
    }

    public y0 setSampleMimeType(String str) {
        this.f28748k = str;
        return this;
    }

    public y0 setSampleRate(int i10) {
        this.f28762y = i10;
        return this;
    }

    public y0 setSelectionFlags(int i10) {
        this.f28741d = i10;
        return this;
    }

    public y0 setStereoMode(int i10) {
        this.f28759v = i10;
        return this;
    }

    public y0 setSubsampleOffsetUs(long j10) {
        this.f28752o = j10;
        return this;
    }

    public y0 setTileCountHorizontal(int i10) {
        this.D = i10;
        return this;
    }

    public y0 setTileCountVertical(int i10) {
        this.E = i10;
        return this;
    }

    public y0 setWidth(int i10) {
        this.f28753p = i10;
        return this;
    }

    public y0 setId(int i10) {
        this.f28738a = Integer.toString(i10);
        return this;
    }
}
