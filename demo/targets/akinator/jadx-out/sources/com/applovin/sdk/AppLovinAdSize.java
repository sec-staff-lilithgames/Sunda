package com.applovin.sdk;

import a.b;
import com.ironsource.mediationsdk.l;
import java.util.Locale;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f16500a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16501b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16502c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, l.f37554a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, GalEuEfxjome.tHPQnttap);
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f16501b = i10;
        this.f16502c = i11;
        this.f16500a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (l.f37554a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(b.k("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f16502c;
    }

    public String getLabel() {
        return this.f16500a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f16501b;
    }

    public String toString() {
        return getLabel();
    }
}
