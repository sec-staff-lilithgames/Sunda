package com.applovin.mediation.nativeAds.adPlacer;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.o;
import e3.g;
import java.util.Set;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f16482a;

    /* renamed from: b, reason: collision with root package name */
    private String f16483b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f16484c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f16485d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f16486e = NotificationCompat.FLAG_LOCAL_ONLY;

    /* renamed from: f, reason: collision with root package name */
    private int f16487f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f16482a = str;
    }

    public void addFixedPosition(int i10) {
        this.f16484c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f16482a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f16484c;
    }

    public int getMaxAdCount() {
        return this.f16486e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f16487f;
    }

    public String getPlacement() {
        return this.f16483b;
    }

    public int getRepeatingInterval() {
        return this.f16485d;
    }

    public boolean hasValidPositioning() {
        return !this.f16484c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f16485d >= 2;
    }

    public void resetFixedPositions() {
        this.f16484c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f16486e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f16487f = i10;
    }

    public void setPlacement(String str) {
        this.f16483b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f16485d = i10;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f16485d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb2.append(this.f16482a);
        sb2.append("', fixedPositions=");
        sb2.append(this.f16484c);
        sb2.append(", repeatingInterval=");
        sb2.append(this.f16485d);
        sb2.append(", maxAdCount=");
        sb2.append(this.f16486e);
        sb2.append(", maxPreloadedAdCount=");
        return g.m(sb2, this.f16487f, AbstractJsonLexerKt.END_OBJ);
    }
}
