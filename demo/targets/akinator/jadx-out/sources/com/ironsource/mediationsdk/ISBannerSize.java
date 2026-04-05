package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.Y7;
import com.unity3d.mediation.LevelPlayAdSize;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ISBannerSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f37246a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37247b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37248c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37249d;

    /* renamed from: e, reason: collision with root package name */
    Y7 f37250e;
    public static final ISBannerSize BANNER = l.a(l.f37554a, 320, 50);
    public static final ISBannerSize LARGE = l.a(l.f37555b, 320, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f37556c, 300, 250);

    /* renamed from: f, reason: collision with root package name */
    protected static final ISBannerSize f37245f = l.a();
    public static final ISBannerSize SMART = l.a(l.f37558e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this(l.f37559f, i10, i11);
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return l.b(i10);
    }

    public void a(Y7 y72) {
        if (l.a(y72, this.f37246a, this.f37247b)) {
            this.f37250e = y72;
        }
    }

    public String getDescription() {
        return this.f37248c;
    }

    public int getHeight() {
        return this.f37247b;
    }

    public int getWidth() {
        return this.f37246a;
    }

    public boolean isAdaptive() {
        return this.f37249d;
    }

    public boolean isSmart() {
        return this.f37248c.equals(l.f37558e);
    }

    public void setAdaptive(boolean z10) {
        this.f37249d = z10;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f37250e.d()));
        }
        String description = getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f37246a, this.f37247b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f37248c = str;
        this.f37246a = i10;
        this.f37247b = i11;
        this.f37250e = new Y7(i10, i11);
    }
}
