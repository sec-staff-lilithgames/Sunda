package ub;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum i {
    f88232f("UTF8", C.UTF8_NAME, false),
    f88233g("UTF16_BE", "UTF-16BE", true),
    f88234h("UTF16_LE", "UTF-16LE", false),
    f88235i("UTF32_BE", "UTF-32BE", true),
    f88236j("UTF32_LE", "UTF-32LE", false);


    /* renamed from: b, reason: collision with root package name */
    public final String f88238b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f88239c;

    /* renamed from: e, reason: collision with root package name */
    public final int f88240e;

    i(String str, String str2, boolean z10) {
        this.f88238b = str2;
        this.f88239c = z10;
        this.f88240e = i;
    }

    public int bits() {
        return this.f88240e;
    }

    public String getJavaName() {
        return this.f88238b;
    }

    public boolean isBigEndian() {
        return this.f88239c;
    }
}
